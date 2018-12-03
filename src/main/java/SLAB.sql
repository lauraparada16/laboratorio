CREATE DATABASE SLAB;
USE SLAB;

CREATE TABLE Cliente(
	IDcliente INTEGER NOT NULL PRIMARY KEY
);

CREATE TABLE Vendedor(
	IDvendedor INTEGER NOT NULL PRIMARY KEY
);

CREATE TABLE Administrador(
	IDadministrador INTEGER NOT NULL PRIMARY KEY
);

CREATE TABLE Persona(
	ID INTEGER NOT NULL,
	Nombre VARCHAR(250) NOT NULL,
    Telefono INTEGER NOT NULL,
    Correo VARCHAR(250)
);

CREATE TABLE Factura(
	IDfactura INTEGER NOT NULL PRIMARY KEY,
    FechaFactura VARCHAR(50) NOT NULL,
    IDProducto INTEGER NOT NULL,
    NombreProducto VARCHAR(250) NOT NULL,
    Cantidad INTEGER NOT NULL,
    PrecioUnitario DOUBLE NOT NULL,
    PrecioTotal DOUBLE NOT NULL,
    Efectivo DOUBLE NOT NULL,
    Cambio DOUBLE NOT NULL,
    InfoSuper VARCHAR(250),
    IDcliente INTEGER NOT NULL,
    IDvendedor INTEGER NOT NULL,
    FOREIGN KEY(IDcliente) REFERENCES Cliente(IDcliente),
    FOREIGN KEY(IDvendedor) REFERENCES Vendedor(IDvendedor)
);

CREATE TABLE Producto(
	IDProducto INTEGER NOT NULL PRIMARY KEY,
    NombreProducto VARCHAR(250) NOT NULL,
    Cantidad INTEGER NOT NULL,
    CodeBarra FLOAT NOT NULL,
    DateEntrada VARCHAR(50) NOT NULL,
    DateCadusidad VARCHAR(50) NOT NULL,
    Proveedor VARCHAR(250) NOT NULL,
    PrecioUnitario DOUBLE NOT NULL,
    Estado INTEGER NOT NULL
);

CREATE TABLE Inventario(
	IDinventario INTEGER NOT NULL PRIMARY KEY,
    IDProducto INTEGER NOT NULL,
    Cantidad INTEGER NOT NULL,
    PrecioUnitario DOUBLE NOT NULL,
    PrecioTotal DOUBLE NOT NULL,
    FOREIGN KEY(IDProducto) REFERENCES Producto(IDProducto)
);

CREATE TABLE Caja(
	IDCaja INTEGER NOT NULL PRIMARY KEY,
    IDvendedor INTEGER NOT NULL,
    IDfactura INTEGER NOT NULL,
    IDProducto INTEGER NOT NULL,
    FOREIGN KEY(IDvendedor) REFERENCES Vendedor(IDvendedor),
    FOREIGN KEY(IDfactura) REFERENCES Factura(IDfactura),
    FOREIGN KEY(IDProducto) REFERENCES Producto(IDProducto)
);

