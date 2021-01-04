# UsersService

Para enlazarlo con una base de datos Mysql  he usado en local Docker

```yaml
version: '3.1'
services:      
  db:
    image: mysql:5.7
    container_name: mysql-server
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: users-service-db
      MYSQL_USER: admin
      MYSQL_PASSWORD: admin
    ports:
      - 3307:3306
```

de esta manera con la cadena de conexion de los properties en el servicio de user ya podriamos hacer uso de ella.

Para rellenarlo de forma simple he usado los siquientes scripts

```sql
-- SQL para Roles
CREATE TABLE `prueba`.`roles` (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO roles (id, NAME) VALUES (NULL, "test");
INSERT INTO roles (id, NAME) VALUES (NULL, "prueba");
INSERT INTO roles (id, NAME) VALUES (NULL, "admin");
INSERT INTO roles (id, NAME) VALUES (NULL, "bronze");
INSERT INTO roles (id, NAME) VALUES (NULL, "silver");
INSERT INTO roles (id, NAME) VALUES (NULL, "gold");
INSERT INTO roles (id, NAME) VALUES (NULL, "platinum");
INSERT INTO roles (id, NAME) VALUES (NULL, "guest");

-- SQL para usuarios
CREATE TABLE `users-service-db`.`users` (
    id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    birthday DATE NOT NULL,
    role int NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    userimage BLOB,
    points int,
    PRIMARY KEY (id)
);

INSERT INTO users (id, NAME, lastname, birthday, role, username, password, email) VALUES (NULL, "Jaime", "Yera Hidalgo", '1991-3-07', 3, "SrPepperoni", SHA('test'), 'jaime@mail.com');
```