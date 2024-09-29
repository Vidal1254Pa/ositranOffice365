## Comandos necesarios para base de datos
alter session set current_schema = OSITRANDB;
ALTER USER OSITRANDB quota unlimited on USERS;
GRANT CREATE SESSION TO OSITRANDB;