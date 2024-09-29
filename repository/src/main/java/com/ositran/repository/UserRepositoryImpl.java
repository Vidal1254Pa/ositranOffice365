package com.ositran.repository;

import com.ositran.domain.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl implements IUserRepository {
    private UserJpaRepository _userJpaRepository;
    public UserRepositoryImpl(@Autowired UserJpaRepository userJpaRepository) {
        _userJpaRepository = userJpaRepository;
    }
    @Override
    public String getUserName() {
        return _userJpaRepository.findAll().get(0).getName();
    }
}
