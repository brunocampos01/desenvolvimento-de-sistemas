# JDBC (Java Database Connectivity)

### Pre requeriments
```
sudo apt update
sudo apt install mysql-server
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