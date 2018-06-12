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




--- Store procedure

/*insertarArticulo*/
delimiter //
create procedure insertarArticulo(in _titulo varchar(45), in _contenido varchar(45), in _descripcion varchar(45), in _id_usuario integer  )
begin
INSERT INTO articulo (titulo, contenido, descripcion, id_usuario) VALUES (_titulo,_contenido,_descripcion, _id_usuario);
SELECT id_articulo FROM articulo
ORDER BY id_articulo DESC
LIMIT 1
;
end
//
delimiter ;

call insertarArticulo('algo', 'algo', 'algo', 4);


/*Obtener articulo*/
delimiter //
create procedure obtenerArticulo(in _id integer)
begin
SELECT a.id_articulo,  a.titulo, a.contenido, a.descripcion, a.fecha_creacion, a.fecha_actualizacion,
u.username, u.correo
FROM articulo AS a
INNER JOIN usuario AS u
ON a.id_usuario = u.id
WHERE a.id_articulo = _id;
end
//
delimiter ;

call obtenerArticulo(1);


/*Obtener articulos por categoria*/
delimiter //
create procedure obtenerArticuloPorCategoria(in _id integer)
begin
SELECT a.id_articulo,  a.titulo, a.contenido, a.descripcion, a.fecha_creacion, a.fecha_actualizacion,
c.nombre
FROM categoria_articulo AS ca
INNER JOIN categoria AS c
ON ca.id_categoria = c.id
INNER JOIN articulo AS a
ON ca.id_articulo = a.id_articulo
WHERE ca.id_categoria = _id;
end
//
delimiter ;

call obtenerArticuloPorCategoria(1);
