Create table curso(
id_curso serial primary key,
nombre varchar(10),
descripcion text,
fecha_inicio date,
fecha_fin date,
habilitar_curso boolean,
);

Create table estudiante(
id_estudiante serial primary key,
nom_usuario varchar(10),
contraseña varchar(8),
email varchar(30),
nombre varchar(10),
apellido varchar(10),
dni varchar(9),
telefono int,
fecha_registro date,
);

Create table matricula(
id_matricula serial primary key,
id_usuario serial,
id_curso serial,
status boolean,
forening key (id_curso) references curso(id_curso),
forening key (id_usuario) references curso(id_usuario)
);

CREATE TABLE usuarios_admin(
  id_usuario_admin SERIAL PRIMARY KEY,
  usuario VARCHAR(15),
  contrasenya VARCHAR(30),
  nombre VARCHAR(30),
  email VARCHAR(50)
);


Create table profesor(
id_profesor serial primary key,
nom_usuario varchar(10),
contraseña varchar(8),
email varchar(30),
nombre varchar(10),
nif varchar(9),
telefono int,
);

Create table aula(
id_clase serial primary key,
id_profesor serial,
id_estudiante serial,
nombre_clase varchar(20),
color_clase varchar(10),
unique(id_horario, id_clase, id_profesor),
);

Create table horario(
id_horario serial primary key,
id_clase serial,
hora_inicio time,
hora_fin time,
dia VARCHAR(15)
);
