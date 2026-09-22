DROP DATABASE IF EXISTS miedificio;
CREATE DATABASE miedificio CHARACTER SET utf8mb4;
USE miedificio;

CREATE TABLE departamento (
    id_departamento INT AUTO_INCREMENT PRIMARY KEY,
    piso INT NOT NULL,
    letra CHAR(1) NOT NULL,
    vecino VARCHAR(100) NOT NULL,
    UNIQUE (piso, letra)
);

CREATE TABLE reclamo (
    id_reclamo INT AUTO_INCREMENT PRIMARY KEY,
    id_departamento INT NOT NULL,
    fecha DATE NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    resuelto BOOLEAN NOT NULL DEFAULT FALSE,
    FOREIGN KEY (id_departamento) REFERENCES departamento (id_departamento)
);

CREATE TABLE gasto (
    id_gasto INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    descripcion VARCHAR(100) NOT NULL,
    monto DECIMAL(10,2) NOT NULL
);

CREATE TABLE expensa (
    id_expensa INT AUTO_INCREMENT PRIMARY KEY,
    id_departamento INT NOT NULL,
    mes INT NOT NULL,
    anio INT NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    pagado BOOLEAN NOT NULL DEFAULT FALSE,
    UNIQUE (id_departamento, mes, anio),
    FOREIGN KEY (id_departamento) REFERENCES departamento (id_departamento)
);

INSERT INTO departamento (piso, letra, vecino) VALUES
(1, 'A', 'Laura Gómez'),
(1, 'B', 'Martín Pérez'),
(2, 'A', 'Sofía Rodríguez'),
(2, 'B', 'Diego Fernández'),
(3, 'A', 'Carla Martínez');

INSERT INTO reclamo (id_departamento, fecha, descripcion, resuelto) VALUES
(5, '2026-09-02', 'Pierde la canilla de la cocina', FALSE),
(1, '2026-09-05', 'Se quemó la luz del pasillo del 1° piso', TRUE),
(3, '2026-09-10', 'No anda el portero eléctrico', FALSE),
(2, '2026-09-15', 'Humedad en el techo del baño', FALSE);

INSERT INTO gasto (fecha, descripcion, monto) VALUES
('2026-09-01', 'Luz de espacios comunes', 45000.00),
('2026-09-01', 'Limpieza', 120000.00),
('2026-09-06', 'Cambio de lámpara del pasillo', 8500.00),
('2026-09-12', 'Mantenimiento del ascensor', 60000.00);
