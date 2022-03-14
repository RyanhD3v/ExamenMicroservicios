CREATE TABLE usuario (
  id_usuario VARCHAR(250) PRIMARY KEY,
  nombre VARCHAR(500) NOT NULL,
  correo VARCHAR(500) NOT NULL,
  status BOOLEAN NOT NULL DEFAULT TRUE
);

insert into usuario(id, nombre, correo, status) VALUES(1,'Nestor','nestor@example.com',true);
