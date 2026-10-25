CREATE TABLE IF NOT EXISTS projects(
    id SERIAL,
    nombre VARCHAR (150),
    descripcion VARCHAR(1000),
    precio FLOAT,
    PRIMARY KEY (id)
);