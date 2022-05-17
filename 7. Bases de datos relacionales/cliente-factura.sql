CREATE TABLE direccion (
id INT PRIMARY KEY,
calle NVARCHAR(20),
numero INT,
aclaraciones NVARCHAR(50)
);

CREATE TABLE cliente (
id INT PRIMARY KEY,
nombre NVARCHAR(20),
apellido NVARCHAR(20),
id_dir INT,
FOREIGN KEY(id_dir) REFERENCES direccion(id)
);

CREATE TABLE factura (
id INT PRIMARY KEY,
fecha TIMESTAMP,
importe DOUBLE, 
iva DOUBLE,
cantidad INT,
id_cliente INT,
FOREIGN KEY(id_cliente) REFERENCES cliente(id)
);

CREATE TABLE metodo_de_pago (
id INT PRIMARY KEY,
descripcion NVARCHAR(40),
id_factura INT,
FOREIGN KEY(id_factura) REFERENCES factura(id)
);

CREATE TABLE producto (
id INT PRIMARY KEY,
descripcion NVARCHAR(40),
importe DOUBLE,
id_factura INT,
FOREIGN KEY(id_factura) REFERENCES factura(id)
);
