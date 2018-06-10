create database blog;

use blog;

create table categoria(
id int primary key auto_increment not null,
nombre varchar(45),
fecha_creacion timestamp default current_timestamp,
fecha_actualizacion timestamp default current_timestamp
);

create table usuario(
id int primary key auto_increment not null,
username varchar(45) not null,
correo varchar(45) not null,
contrasena varchar(45) not null,
fecha_creacion timestamp default current_timestamp,
fecha_actualizacion timestamp default current_timestamp,
confirmacion_contrasena varchar(45) not null
);

create table categoria_articulo(
id int primary key auto_increment not null,
id_categoria int not null,
id_articulo int not null,
fecha_creacion timestamp default current_timestamp,
fecha_actualizacion timestamp default current_timestamp
);

create table articulo(
id_articulo int primary key auto_increment not null,
titulo varchar(45),
descripcion varchar(45),
contenido varchar(45),
fecha_creacion timestamp default current_timestamp,
fecha_actualizacion timestamp default current_timestamp,
id_usuario int not null
);

create table comentario(
id int primary key auto_increment not null,
contenido varchar(45),
fecha_creacion timestamp default current_timestamp,
fecha_actualizacion timestamp default current_timestamp,
id_articulo int not null,
id_usuario int not null
);

alter table categoria_articulo
add
constraint categoria_articulo foreign key(id_categoria)
references categoria (id);

alter table categoria_articulo
add
constraint articulo_categoria foreign key(id_articulo)
references articulo(id_articulo);

alter table articulo
add
constraint usuario_articulo foreign key(id_usuario)
references usuario(id);

alter table comentario
add
constraint comentario_articulo foreign key(id_articulo)
references articulo(id_articulo);

alter table comentario
add
constraint comentario_usuario foreign key(id_usuario)
references usuario(id);
