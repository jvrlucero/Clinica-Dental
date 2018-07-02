-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-07-2018 a las 11:51:40
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinicadental`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id_Cita` int(6) UNSIGNED ZEROFILL NOT NULL,
  `id_Med` int(3) UNSIGNED ZEROFILL NOT NULL,
  `id_Cli` int(5) UNSIGNED ZEROFILL NOT NULL,
  `id_Sala` int(3) UNSIGNED ZEROFILL NOT NULL,
  `Fecha_Cita` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`id_Cita`, `id_Med`, `id_Cli`, `id_Sala`, `Fecha_Cita`) VALUES
(000001, 001, 00002, 002, '2018-08-15 13:00:00'),
(000002, 002, 00001, 001, '2018-06-23 10:00:00'),
(000003, 002, 00003, 002, '2018-07-05 08:00:00'),
(000004, 002, 00002, 002, '2018-06-23 17:30:00'),
(000005, 005, 00004, 003, '2018-09-08 11:15:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_Cli` int(5) UNSIGNED ZEROFILL NOT NULL,
  `Nombres_Cli` varchar(50) NOT NULL,
  `Apellidos_Cli` varchar(50) NOT NULL,
  `Tel_Cli` int(8) NOT NULL,
  `Direccion_Cli` varchar(100) NOT NULL,
  `Edad_Cli` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_Cli`, `Nombres_Cli`, `Apellidos_Cli`, `Tel_Cli`, `Direccion_Cli`, `Edad_Cli`) VALUES
(00001, 'Elmer Homero', 'Cienfuegos Calderon', 23459876, 'Jar. del Tecana, Block BB, Psje 69,Santa Ana', 0),
(00002, 'Clara Cindy', 'Hentes de Carrillo', 24567804, 'Col. El Refugio, Calle 23, Nº7,Ahuachapan', 0),
(00003, 'Mary Consuelo', 'Pluma Serguei', 22575777, 'Urb. Cali, Pol Z, casa 9, Santa Tecla', 0),
(00004, 'Ana Rosa', 'Palomon Rin', 24576905, 'Col. Universitaria, Block 3, casa 17, Santa Ana', 0),
(00005, 'Alice Vanish', 'Sung de Díaz', 0, 'Cantón Quezada, km 71, casa 4, Metapan', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id_Factura` int(6) UNSIGNED ZEROFILL NOT NULL,
  `id_Cita` int(6) UNSIGNED ZEROFILL NOT NULL,
  `id_HistDClient` int(6) UNSIGNED ZEROFILL DEFAULT NULL,
  `OtrosDetalles` varchar(100) NOT NULL,
  `costo` decimal(5,2) NOT NULL,
  `Fecha_facturacion` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `facturas`
--

INSERT INTO `facturas` (`id_Factura`, `id_Cita`, `id_HistDClient`, `OtrosDetalles`, `costo`, `Fecha_facturacion`) VALUES
(000001, 000001, 000003, 'El paciente convulsionó', '75.00', '2018-08-15 16:47:38'),
(000002, 000004, 000004, 'Retiro de frenos', '100.00', '2018-08-15 16:47:38'),
(000003, 000003, 000005, 'No mencionó sus problemas con determinadas anestecias, debió llevarse a hospital de emergencia', '200.00', '2018-09-05 10:23:12'),
(000004, 000005, 000005, '', '50.00', '2018-09-08 13:47:38');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiald_clientes`
--

CREATE TABLE `historiald_clientes` (
  `id_Cli` int(5) UNSIGNED ZEROFILL NOT NULL,
  `id_HistDClient` int(6) UNSIGNED ZEROFILL NOT NULL,
  `id_TD` int(5) UNSIGNED ZEROFILL NOT NULL,
  `FechaIniTrat` date NOT NULL,
  `FechaFinTrat` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historiald_clientes`
--

INSERT INTO `historiald_clientes` (`id_Cli`, `id_HistDClient`, `id_TD`, `FechaIniTrat`, `FechaFinTrat`) VALUES
(00001, 000001, 00004, '2018-03-23', '0000-00-00'),
(00001, 000002, 00001, '2018-03-23', '0000-00-00'),
(00002, 000003, 00004, '2018-02-01', '0000-00-00'),
(00002, 000004, 00003, '2018-02-01', '2018-08-15'),
(00003, 000005, 00002, '2018-05-17', '0000-00-00'),
(00004, 000006, 00005, '2018-07-08', '0000-00-00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialm_clientes`
--

CREATE TABLE `historialm_clientes` (
  `id_Cli` int(5) UNSIGNED ZEROFILL NOT NULL,
  `id_HistMClient` int(6) UNSIGNED ZEROFILL NOT NULL,
  `HistorialMedico` varchar(100) NOT NULL,
  `TratamientoMedico` varchar(100) NOT NULL,
  `FechaIniTrat` date NOT NULL,
  `FechaFinTrat` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historialm_clientes`
--

INSERT INTO `historialm_clientes` (`id_Cli`, `id_HistMClient`, `HistorialMedico`, `TratamientoMedico`, `FechaIniTrat`, `FechaFinTrat`) VALUES
(00001, 000001, 'Diabetes', 'Insulina', '2000-06-01', '9999-12-31'),
(00002, 000002, 'Alergia a la penicilina', '', '0000-00-00', '9999-12-31'),
(00002, 000003, 'Chikungunya', '', '2018-02-15', '2018-05-20'),
(00004, 000004, 'Infección en la lengua', 'Penicilina', '0000-00-00', '9999-12-31'),
(00004, 000005, 'Alergia a la plata', '-', '0000-00-00', '9999-12-31');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `id_Med` int(3) UNSIGNED ZEROFILL NOT NULL,
  `Nombres_Med` varchar(50) NOT NULL,
  `Apellidos_Med` varchar(50) NOT NULL,
  `Tel_Med` int(8) NOT NULL,
  `Direccion_Med` varchar(100) NOT NULL,
  `Dui_Med` int(10) NOT NULL,
  `NIT` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`id_Med`, `Nombres_Med`, `Apellidos_Med`, `Tel_Med`, `Direccion_Med`, `Dui_Med`, `NIT`) VALUES
(001, 'Pedro', 'Picadientes', 22577777, 'Urb. FireStone, Nueva Mombasa,La Libertad', 123456789, 'N12345679ABC9DE'),
(002, 'Abdul', 'Bukatir', 0, 'Villa Qwaser, Nº2,San Miguel', 2147483647, 'B23567891AB6CDE'),
(003, 'Apostol Santiago', 'Carechancho', 24666999, 'Villa Colón, La Raja, La Libertad', 1964030500, 'M17R020N500'),
(004, 'Gerard Yodiwav', 'Zerotowsky Putin', 0, 'Hotel Monsanto, Screams Of Hell, La Paz', 2147483647, 'PU7031KHE1013AV'),
(005, 'Sylvie Jpress', 'Nolasco MGalekgolo', 24117117, 'Urb. Mercy, Villa Testaferro', 2147483647, 'H41F1IF33C0NGFI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salas`
--

CREATE TABLE `salas` (
  `id_Sala` int(3) UNSIGNED ZEROFILL NOT NULL,
  `Nombre_Sala` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `salas`
--

INSERT INTO `salas` (`id_Sala`, `Nombre_Sala`) VALUES
(001, 'Infantil'),
(002, 'Adultos'),
(003, 'General'),
(004, 'Para mujeres'),
(005, 'Especial 1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamientosdentales`
--

CREATE TABLE `tratamientosdentales` (
  `id_TD` int(5) UNSIGNED ZEROFILL NOT NULL,
  `TratamientoDental` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tratamientosdentales`
--

INSERT INTO `tratamientosdentales` (`id_TD`, `TratamientoDental`) VALUES
(00001, 'Relleno'),
(00002, 'Extracción de Muela'),
(00003, 'Frenos'),
(00004, 'Limpieza'),
(00005, 'Remodelado de placa'),
(00006, 'Puentes Dentales'),
(00007, 'Empastes'),
(00008, 'Tratamiento Endodóntico'),
(00009, 'Raspado y Pulido Radicular'),
(00010, 'Ortodoncia'),
(00011, 'Extraccion de Muelas'),
(00012, 'Implantes Dentales'),
(00013, 'Blanqueamiento Dental'),
(00014, 'Carillas Dentales');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id_Cita`),
  ADD KEY `id_Med` (`id_Med`),
  ADD KEY `id_Cli` (`id_Cli`),
  ADD KEY `id_Sala` (`id_Sala`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_Cli`);

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id_Factura`),
  ADD KEY `id_Factura` (`id_Factura`),
  ADD KEY `id_Cita` (`id_Cita`),
  ADD KEY `id_HistDClient` (`id_HistDClient`);

--
-- Indices de la tabla `historiald_clientes`
--
ALTER TABLE `historiald_clientes`
  ADD PRIMARY KEY (`id_HistDClient`),
  ADD KEY `id_Cli` (`id_Cli`),
  ADD KEY `id_TD` (`id_TD`);

--
-- Indices de la tabla `historialm_clientes`
--
ALTER TABLE `historialm_clientes`
  ADD PRIMARY KEY (`id_HistMClient`),
  ADD KEY `id_Cli` (`id_Cli`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`id_Med`);

--
-- Indices de la tabla `salas`
--
ALTER TABLE `salas`
  ADD PRIMARY KEY (`id_Sala`);

--
-- Indices de la tabla `tratamientosdentales`
--
ALTER TABLE `tratamientosdentales`
  ADD PRIMARY KEY (`id_TD`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `id_Cita` int(6) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_Cli` int(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `id_Factura` int(6) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `historiald_clientes`
--
ALTER TABLE `historiald_clientes`
  MODIFY `id_HistDClient` int(6) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `historialm_clientes`
--
ALTER TABLE `historialm_clientes`
  MODIFY `id_HistMClient` int(6) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id_Med` int(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `salas`
--
ALTER TABLE `salas`
  MODIFY `id_Sala` int(3) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tratamientosdentales`
--
ALTER TABLE `tratamientosdentales`
  MODIFY `id_TD` int(5) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`id_Med`) REFERENCES `medicos` (`id_Med`),
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`id_Cli`) REFERENCES `clientes` (`id_Cli`),
  ADD CONSTRAINT `citas_ibfk_3` FOREIGN KEY (`id_Sala`) REFERENCES `salas` (`id_Sala`);

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `facturas_ibfk_1` FOREIGN KEY (`id_Cita`) REFERENCES `citas` (`id_Cita`),
  ADD CONSTRAINT `facturas_ibfk_2` FOREIGN KEY (`id_HistDClient`) REFERENCES `historiald_clientes` (`id_HistDClient`);

--
-- Filtros para la tabla `historiald_clientes`
--
ALTER TABLE `historiald_clientes`
  ADD CONSTRAINT `historiald_clientes_ibfk_1` FOREIGN KEY (`id_Cli`) REFERENCES `clientes` (`id_Cli`),
  ADD CONSTRAINT `historiald_clientes_ibfk_2` FOREIGN KEY (`id_TD`) REFERENCES `tratamientosdentales` (`id_TD`);

--
-- Filtros para la tabla `historialm_clientes`
--
ALTER TABLE `historialm_clientes`
  ADD CONSTRAINT `historialm_clientes_ibfk_1` FOREIGN KEY (`id_Cli`) REFERENCES `clientes` (`id_Cli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
