# JDBC (Java Database Connectivity)

### Pre requirements
- java 1.8 or >
```
sudo apt update
sudo apt install mysql-server
sudo apt install maven
```

### Run MySQL in terminal
``` 
mysql -h localhost -u USER -p

-u: username
-p: password (**no space between -p and the password text**)
-h: host
```

### Create user

```
CREATE USER 'campos'@'localhost' IDENTIFIED BY ''deitel';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES,
EXECUTE ON *.* to 'campos'@'localhost';
```
### Build jar
```
mvn clean install 
```
### Java tutorial
- https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html

### DML :
- SELECT
- INSERT
- DELETE
- UPDATE

### DDL:
- CREATE TABLE
- DROP TABLE
- ALTER TABLE