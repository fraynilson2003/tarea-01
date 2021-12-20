-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2021 a las 17:44:25
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_integrador`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `producto_id` text NOT NULL,
  `producto_nombre` text NOT NULL,
  `producto_tipo` text NOT NULL,
  `producto_marca` text NOT NULL,
  `producto_precio` float NOT NULL,
  `producto_stock` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`producto_id`, `producto_nombre`, `producto_tipo`, `producto_marca`, `producto_precio`, `producto_stock`) VALUES
('P1639244988373', 'pulpin', 'embasados', 'cifrut', 1, 135),
('P1639245115835', 'arroz', 'abarrotes', 'norteño', 3, 198),
('P1639963722722', 'Agua mineral 500ml', 'bebidas', 'San mateo', 1.5, 222),
('P1639964256352', 'filete sardina', 'enlatados', 'Sodimar', 2.5, 144),
('P1639964278045', 'pechuga de pollo', 'enlatados', 'gloria', 4, 193),
('P1639964379152', 'yogurts 500ml', 'embasados', 'gloria', 3.2, 500),
('P1639964398830', 'yogurts 450ml', 'embasados', 'pura vida', 3, 495),
('P1639964483153', 'Yogurts 100ml', 'embasados', 'live', 0.5, 118),
('P1639964559931', 'leche 350ml', 'enlatados', 'pura vida', 3.4, 90),
('P1639964574428', 'leche 150ml', 'enlatados', 'gloria', 1.7, 110),
('P1639964646067', 'energizante P500ml', 'bebidas', 'power', 2.5, 79),
('P1639964693918', 'energizante G500ml', 'bebidas', 'gatorade', 3.5, 78),
('P1639964709093', 'energizante R500ml', 'bebidas', 'redbull', 3, 150),
('P1639964840900', 'azucar rubia', 'abarrotes', 'pomalca', 3.1, 169),
('P1639964927048', 'zanahoria', 'abarrotes', 'costeña', 2, 168),
('P1639964999027', 'arroz negrita', 'abarrotes', 'negrita', 3, 210),
('P1639965037966', 'palta', 'abarrotes', 'moqueguana', 1.5, 77),
('P1640008377623', 'arroz gallito', 'abarrotes', 'gallito', 3, 198),
('P1640014205370', 'Inka Kola2', 'bebidas', 'Inka Kola', 2.5, 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registroventa`
--

CREATE TABLE `registroventa` (
  `venta_cliente_nombre` text NOT NULL,
  `venta_producto` text NOT NULL,
  `venta_producto_tipo` text NOT NULL,
  `venta_precio_unid` float NOT NULL,
  `venta_cantidad_vendida` float NOT NULL,
  `venta_igv_total` float NOT NULL,
  `venta_monto_total` float NOT NULL,
  `venta_fecha` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registroventa`
--

INSERT INTO `registroventa` (`venta_cliente_nombre`, `venta_producto`, `venta_producto_tipo`, `venta_precio_unid`, `venta_cantidad_vendida`, `venta_igv_total`, `venta_monto_total`, `venta_fecha`) VALUES
('', 'leche 320ml', 'enlatados', 2, 1, 0, 2, NULL),
('', 'leche 320ml', 'enlatados', 2, 2, 1, 4, NULL),
('', 'pulpin', 'embasados', 1, 20, 4, 20, NULL),
('', 'pulpin', 'embasados', 1, 10, 2, 10, NULL),
('', 'pulpin', 'embasados', 1, 10, 2, 10, NULL),
('', 'leche 320ml', 'enlatados', 2, 5, 2, 10, NULL),
('', 'pulpin', 'embasados', 1, 10, 2, 10, NULL),
('', 'pulpin', 'embasados', 1, 5, 1, 5, NULL),
('', 'pulpin', 'embasados', 1, 10, 1.8, 10, '2021-12-12 14:19:18'),
('', 'arroz', 'abarrotes', 3, 5, 2.7, 15, '2021-12-12 14:36:01'),
('', 'arroza', 'abarrotes', 3, 5, 2.7, 15, '2021-12-12 14:36:09'),
('', 'arroza', 'abarrotes', 3, 5, 2.7, 15, '2021-12-12 14:36:18'),
('', 'arroz22212121', 'abarrotes', 3, 5, 2.7, 15, '2021-12-12 14:36:35'),
('', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-12 15:53:29'),
('', 'leche 320ml', 'enlatados', 2, 1, 0.36, 2, '2021-12-12 15:54:18'),
('', 'leche 320mssal', 'enlatados', 2, 2, 0.72, 4, '2021-12-12 17:16:50'),
('', 'leche 320ml', 'enlatados', 2, -8, -2.88, -16, '2021-12-12 17:26:30'),
('', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-12 17:29:01'),
('', 'leche 320ml', 'enlatados', 2, -20, -7.2, -40, '2021-12-12 17:29:55'),
('', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-12 17:33:25'),
('', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-12 17:34:04'),
('', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-12 19:53:31'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-12 20:09:35'),
('', 'arroz', 'abarrotes', 3, 5, 2.7, 15, '2021-12-12 20:36:43'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 22:49:11'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-13 22:49:11'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 22:49:47'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-13 22:49:47'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-13 22:52:23'),
('', 'pulpin', 'embasados', 1, 9, 1.62, 9, '2021-12-13 22:52:23'),
('', 'leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-13 22:54:50'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-13 22:54:50'),
('', 'leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-13 22:55:59'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-13 22:55:59'),
('', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-13 22:56:41'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-13 22:56:41'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-13 22:58:44'),
('', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-13 22:59:46'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-13 22:59:46'),
('', 'arroz', 'abarrotes', 3, 4, 2.16, 12, '2021-12-13 22:59:46'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 23:13:32'),
('', 'arroz', 'abarrotes', 3, 4, 2.16, 12, '2021-12-13 23:13:32'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 23:17:27'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 23:17:29'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-13 23:17:34'),
('', 'leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-13 23:21:16'),
('', 'leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-13 23:24:49'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-13 23:24:49'),
('', 'leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-13 23:31:29'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-13 23:31:29'),
('', 'leche 320ml', 'enlatados', 2, -8, -2.88, -16, '2021-12-14 00:12:45'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-14 00:13:49'),
('', 'arroz', 'abarrotes', 3, 1, 0.54, 3, '2021-12-14 00:13:49'),
('', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-14 00:15:40'),
('', 'leche 320ml', 'enlatados', 2, 1, 0.36, 2, '2021-12-14 00:17:40'),
('', 'leche 320ml', 'enlatados', 2, 1, 0.36, 2, '2021-12-14 00:17:52'),
('', 'leche 320ml', 'enlatados', 2, 1, 0.36, 2, '2021-12-14 14:41:53'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-14 14:41:53'),
('', 'pulpin', 'embasados', 1, 15, 2.7, 15, '2021-12-14 15:14:37'),
('', 'leche 320ml', 'enlatados', 2, -5, -1.8, -10, '2021-12-14 15:14:37'),
('', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-14 17:02:12'),
('', 'pulpin', 'embasados', 1, 7, 1.26, 7, '2021-12-14 17:02:12'),
('', 'leche 320ml', 'enlatados', 2, 2.5, 0.9, 5, '2021-12-16 02:26:52'),
('', 'leche 320mls', 'enlatados', 2, 0.5, 0.18, 1, '2021-12-16 02:26:52'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 14:08:16'),
('', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-16 14:08:16'),
('', 'leche 320ml', 'enlatados', 2, 6, 2.16, 12, '2021-12-16 14:12:28'),
('', 'arroz', 'abarrotes', 3, 1, 0.54, 3, '2021-12-16 14:12:28'),
('', 'leche 320ml', 'enlatados', 2, 15, 5.4, 30, '2021-12-16 14:18:48'),
('', 'pulpin', 'embasados', 1, 15, 2.7, 15, '2021-12-16 14:18:48'),
('', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-16 14:39:35'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 14:46:26'),
('', 'leche 320ml', 'enlatados', 2, 15, 5.4, 30, '2021-12-16 16:04:50'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 16:07:12'),
('', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 16:08:09'),
('77352765', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-16 16:38:54'),
('77352765', 'Inka Kola 500ml', 'bebidas', 2.5, 18, 8.1, 45, '2021-12-17 17:44:47'),
('77352765', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-17 17:44:47'),
('77352765', 'pulpin', 'embasados', 1, 4, 0.72, 4, '2021-12-17 17:44:47'),
('77352765', 'leche 320ml', 'enlatados', 2.5, 15, 6.75, 37.5, '2021-12-17 17:47:43'),
('77352765', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-17 17:47:50'),
('77352765', 'Inka Kola 500ml', 'bebidas', 2.5, 31, 13.95, 77.5, '2021-12-17 17:48:31'),
('77352765', 'pulpin', 'embasados', 1, 19, 3.42, 19, '2021-12-17 17:48:31'),
('77352765', 'pulpin', 'embasados', 1, 5, 0.9, 5, '2021-12-19 14:26:31'),
('77352765', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-19 14:26:31'),
('77352765', 'leche 400ml', 'enlatados', 2.5, 2, 0.9, 5, '2021-12-19 18:51:21'),
('77352765', 'pulpin', 'embasados', 1, 1, 0.18, 1, '2021-12-19 18:51:21'),
('77352765', 'Agua mineral 500ml', 'bebidas', 1.5, 24, 6.48, 36, '2021-12-20 01:31:02'),
('77352765', 'pulpin', 'embasados', 1, 1, 0.18, 1, '2021-12-20 01:31:02'),
('77352765', 'leche 400ml', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 01:31:02'),
('76203536', 'leche 150ml', 'enlatados', 1.8, 3, 0.972, 5.4, '2021-12-20 01:55:52'),
('76203536', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-20 01:55:52'),
('76203536', 'energizante 500ml', 'bebidas', 2.5, 1, 0.45, 2.5, '2021-12-20 01:55:52'),
('76203536', 'pechuga de pollo', 'enlatados', 4, 1, 0.72, 4, '2021-12-20 01:55:52'),
('76412931', 'filete sardina', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 01:56:47'),
('76412931', 'Yogurts 100ml', 'embasados', 0.5, 2, 0.18, 1, '2021-12-20 01:56:47'),
('76412931', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-20 01:56:47'),
('76412931', 'azucar rubia', 'abarrotes', 3.1, 1, 0.558, 3.1, '2021-12-20 01:56:47'),
('76412931', 'palta', 'abarrotes', 1.5, 2, 0.54, 3, '2021-12-20 01:56:47'),
('76412931', 'Agua mineral 500ml', 'bebidas', 1.5, 4, 1.08, 6, '2021-12-20 01:56:47'),
('77493338', 'pechuga de pollo', 'enlatados', 4, 3, 2.16, 12, '2021-12-20 01:59:00'),
('77493338', 'zanahoria', 'abarrotes', 2, 2, 0.72, 4, '2021-12-20 01:59:00'),
('77493338', 'palta', 'abarrotes', 1.5, 1, 0.27, 1.5, '2021-12-20 01:59:00'),
('77493338', 'yogurts 500ml', 'embasados', 3, 1, 0.54, 3, '2021-12-20 01:59:00'),
('77493338', 'leche 350ml', 'enlatados', 3.5, 2, 1.26, 7, '2021-12-20 01:59:00'),
('', 'leche 350ml', 'enlatados', 3.5, 3, 1.89, 10.5, '2021-12-20 02:01:10'),
('', 'leche 150ml', 'enlatados', 1.8, 2, 0.648, 3.6, '2021-12-20 02:01:10'),
('', 'pechuga de polloasas', 'enlatados', 4, 3, 2.16, 12, '2021-12-20 02:01:10'),
('77493338', 'pechuga de pollo', 'enlatados', 4, 2, 1.44, 8, '2021-12-20 15:31:21'),
('77493338', 'pulpin', 'embasados', 1, 45, 8.1, 45, '2021-12-20 15:31:21'),
('77493338', 'energizante G500ml', 'bebidas', 3.5, 2, 1.26, 7, '2021-12-20 15:31:21'),
('77493338', 'yogurts 450ml', 'embasados', 3, 5, 2.7, 15, '2021-12-20 15:31:21'),
('', 'filete sardina', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 15:38:08'),
('', 'pechuga de pollo', 'enlatados', 4, 1, 0.72, 4, '2021-12-20 15:38:08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_compra_cliente`
--

CREATE TABLE `registro_compra_cliente` (
  `registroCliente_nombre` text NOT NULL,
  `registroCliente_dni_ruc` text NOT NULL,
  `registroCliente_producto` text NOT NULL,
  `registroCliente_tipo_producto` text NOT NULL,
  `registroCliente_precio_unidad` float NOT NULL,
  `registroCliente_cantidad_vendida` float NOT NULL,
  `registroCliente_igv_total` float NOT NULL,
  `registroCliente_total_soles` float NOT NULL,
  `registroCliente_fecha` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro_compra_cliente`
--

INSERT INTO `registro_compra_cliente` (`registroCliente_nombre`, `registroCliente_dni_ruc`, `registroCliente_producto`, `registroCliente_tipo_producto`, `registroCliente_precio_unidad`, `registroCliente_cantidad_vendida`, `registroCliente_igv_total`, `registroCliente_total_soles`, `registroCliente_fecha`) VALUES
('Nilson', '', 'leche 320ml', 'enlatados', 2, 0, 0, 0, '2021-12-16 14:08:16'),
('Nilson', '', 'arroz', 'abarrotes', 3, 0, 0, 0, '2021-12-16 14:08:16'),
('Nilson', '', 'leche 320ml', 'enlatados', 2, 0, 0, 0, '2021-12-16 14:12:28'),
('Nilson', '', 'arroz', 'abarrotes', 3, 0, 0, 0, '2021-12-16 14:12:28'),
('Nilson', '', 'leche 320ml', 'enlatados', 2, 15, 5.4, 30, '2021-12-16 14:18:48'),
('Nilson', '', 'pulpin', 'embasados', 1, 15, 2.7, 15, '2021-12-16 14:18:48'),
('null', '', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-16 14:39:35'),
('Nilson', '', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 14:46:26'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2, 15, 5.4, 30, '2021-12-16 16:04:50'),
('Nilson', '', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 16:07:12'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2, 5, 1.8, 10, '2021-12-16 16:08:09'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2, 3, 1.08, 6, '2021-12-16 16:31:04'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-16 16:35:07'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-16 16:38:54'),
('Nilson', '77352765', 'Inka Kola 500ml', 'bebidas', 2.5, 18, 8.1, 45, '2021-12-17 17:44:47'),
('Nilson', '77352765', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-17 17:44:47'),
('Nilson', '77352765', 'pulpin', 'embasados', 1, 4, 0.72, 4, '2021-12-17 17:44:47'),
('Nilson', '77352765', 'leche 320ml', 'enlatados', 2.5, 15, 6.75, 37.5, '2021-12-17 17:47:43'),
('Nilson', '77352765', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-17 17:47:50'),
('Nilson', '77352765', 'Inka Kola 500ml', 'bebidas', 2.5, 31, 13.95, 77.5, '2021-12-17 17:48:31'),
('Nilson', '77352765', 'pulpin', 'embasados', 1, 19, 3.42, 19, '2021-12-17 17:48:31'),
('Nilson', '77352765', 'pulpin', 'embasados', 1, 5, 0.9, 5, '2021-12-19 14:26:31'),
('Nilson', '77352765', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-19 14:26:31'),
('Nilson', '77352765', 'leche 400ml', 'enlatados', 2.5, 2, 0.9, 5, '2021-12-19 18:51:21'),
('Nilson', '77352765', 'pulpin', 'embasados', 1, 1, 0.18, 1, '2021-12-19 18:51:21'),
('Nilson', '77352765', 'Agua mineral 500ml', 'bebidas', 1.5, 24, 6.48, 36, '2021-12-20 01:31:02'),
('Nilson', '77352765', 'pulpin', 'embasados', 1, 1, 0.18, 1, '2021-12-20 01:31:02'),
('Nilson', '77352765', 'leche 400ml', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 01:31:02'),
('Paquito', '76203536', 'leche 150ml', 'enlatados', 1.8, 3, 0.972, 5.4, '2021-12-20 01:55:52'),
('Paquito', '76203536', 'arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-20 01:55:52'),
('Paquito', '76203536', 'energizante 500ml', 'bebidas', 2.5, 1, 0.45, 2.5, '2021-12-20 01:55:52'),
('Paquito', '76203536', 'pechuga de pollo', 'enlatados', 4, 1, 0.72, 4, '2021-12-20 01:55:52'),
('Eusenia', '76412931', 'filete sardina', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 01:56:47'),
('Eusenia', '76412931', 'Yogurts 100ml', 'embasados', 0.5, 2, 0.18, 1, '2021-12-20 01:56:47'),
('Eusenia', '76412931', 'arroz', 'abarrotes', 3, 3, 1.62, 9, '2021-12-20 01:56:47'),
('Eusenia', '76412931', 'azucar rubia', 'abarrotes', 3.1, 1, 0.558, 3.1, '2021-12-20 01:56:47'),
('Eusenia', '76412931', 'palta', 'abarrotes', 1.5, 2, 0.54, 3, '2021-12-20 01:56:47'),
('Eusenia', '76412931', 'Agua mineral 500ml', 'bebidas', 1.5, 4, 1.08, 6, '2021-12-20 01:56:47'),
('Jorge', '77493338', 'pechuga de pollo', 'enlatados', 4, 3, 2.16, 12, '2021-12-20 01:59:00'),
('Jorge', '77493338', 'zanahoria', 'abarrotes', 2, 2, 0.72, 4, '2021-12-20 01:59:00'),
('Jorge', '77493338', 'palta', 'abarrotes', 1.5, 1, 0.27, 1.5, '2021-12-20 01:59:00'),
('Jorge', '77493338', 'yogurts 500ml', 'embasados', 3, 1, 0.54, 3, '2021-12-20 01:59:00'),
('Jorge', '77493338', 'leche 350ml', 'enlatados', 3.5, 2, 1.26, 7, '2021-12-20 01:59:00'),
('Nilson', '', 'leche 350ml', 'enlatados', 3.5, 3, 1.89, 10.5, '2021-12-20 02:01:10'),
('Nilson', '', 'leche 150ml', 'enlatados', 1.8, 2, 0.648, 3.6, '2021-12-20 02:01:10'),
('Nilson', '', 'pechuga de polloasas', 'enlatados', 4, 3, 2.16, 12, '2021-12-20 02:01:10'),
('Jorge', '77493338', 'pechuga de pollo', 'enlatados', 4, 2, 1.44, 8, '2021-12-20 15:31:21'),
('Jorge', '77493338', 'pulpin', 'embasados', 1, 45, 8.1, 45, '2021-12-20 15:31:21'),
('Jorge', '77493338', 'energizante G500ml', 'bebidas', 3.5, 2, 1.26, 7, '2021-12-20 15:31:21'),
('Jorge', '77493338', 'yogurts 450ml', 'embasados', 3, 5, 2.7, 15, '2021-12-20 15:31:21'),
('Nilson', '', 'filete sardina', 'enlatados', 2.5, 3, 1.35, 7.5, '2021-12-20 15:38:08'),
('Nilson', '', 'pechuga de pollo', 'enlatados', 4, 1, 0.72, 4, '2021-12-20 15:38:08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_compra_producto`
--

CREATE TABLE `registro_compra_producto` (
  `registroProducto_nombre` text NOT NULL,
  `registroProducto_tipo` text NOT NULL,
  `registroProducto_precio` float NOT NULL,
  `registroProducto_cantidad_vendida` float NOT NULL,
  `registroProducto_igv_total` float NOT NULL,
  `registroProducto_total_soles` float NOT NULL,
  `registroProducto_fecha` timestamp NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registro_compra_producto`
--

INSERT INTO `registro_compra_producto` (`registroProducto_nombre`, `registroProducto_tipo`, `registroProducto_precio`, `registroProducto_cantidad_vendida`, `registroProducto_igv_total`, `registroProducto_total_soles`, `registroProducto_fecha`) VALUES
('leche 320ml', 'enlatados', 2, 2, 0.72, 4, '2021-12-15 02:46:47'),
('leche 320ml', 'enlatados', 2, 0, 2.52, 14, '2021-12-15 02:47:23'),
('leche 320ml', 'enlatados', 2, 7, 1.8, 10, '2021-12-15 02:48:37'),
('leche 320ml', 'enlatados', 2, 12, 1.8, 10, '2021-12-15 02:49:01'),
('leche 320ml', 'enlatados', 2, 17, 1.08, 6, '2021-12-15 02:50:36'),
('leche 320ml', 'enlatados', 2, 4, 1.44, 8, '2021-12-15 03:03:13'),
('arroz', 'abarrotes', 3, 5, 2.7, 15, '2021-12-15 03:07:14'),
('pulpin', 'embasados', 1, 4, 0.72, 4, '2021-12-15 03:23:57'),
('pulpin', 'embasados', 1, 6, 1.08, 6, '2021-12-15 03:26:43'),
('pulpin', 'embasados', 1, 4, 0.72, 4, '2021-12-15 03:28:19'),
('leche 320mls', 'enlatados', 2, 15, 5.4, 30, '2021-12-15 16:59:16'),
('leche 320mls', 'enlatados', 2, 5, 1.8, 10, '2021-12-15 17:02:11'),
('leche 320mls', 'enlatados', 2, 1.5, 0.54, 3, '2021-12-16 02:30:04'),
('leche 320ml', 'enlatados', 2, 100, 36, 200, '2021-12-16 13:43:09'),
('leche 320ml', 'enlatados', 2, 50, 18, 100, '2021-12-16 16:58:07'),
('arroz', 'abarrotes', 3, 10, 5.4, 30, '2021-12-16 16:58:42'),
('arroz', 'abarrotes', 3, 2, 1.08, 6, '2021-12-16 16:59:35'),
('pulpin', 'embasados', 1, 40, 7.2, 40, '2021-12-16 16:59:56'),
('Inka Kola 500ml', 'bebidas', 2.5, 100, 45, 250, '2021-12-16 17:01:27'),
('Leche condensada 150ml', 'enlatados', 2.5, 100, 45, 250, '2021-12-19 15:16:40'),
('leche 320ml', 'enlatados', 2.5, 5.5, 2.475, 13.75, '2021-12-19 15:22:39'),
('Agua mineral 500ml', 'bebidas', 1.5, 250, 67.5, 375, '2021-12-20 01:28:42'),
('leche 400ml', 'enlatados', 2.5, 10, 4.5, 25, '2021-12-20 01:32:57'),
('filete sardina', 'enlatados', 2.5, 150, 67.5, 375, '2021-12-20 01:37:36'),
('pechuga de pollo', 'enlatados', 4, 100, 72, 400, '2021-12-20 01:37:58'),
('yogurts 500ml', 'enlatados', 3, 500, 270, 1500, '2021-12-20 01:39:01'),
('yogurts 500ml', 'embasados', 3.2, 500, 288, 1600, '2021-12-20 01:39:39'),
('yogurts 450ml', 'embasados', 3, 500, 270, 1500, '2021-12-20 01:39:58'),
('pulpin', 'embasados', 1, 180, 32.4, 180, '2021-12-20 01:40:14'),
('Yogurts 100ml', 'embasados', 0.5, 120, 10.8, 60, '2021-12-20 01:41:23'),
('leche 150ml', 'enlatados', 1.8, 170, 55.08, 306, '2021-12-20 01:42:02'),
('leche 350ml', 'enlatados', 3.5, 90, 56.7, 315, '2021-12-20 01:42:25'),
('leche 350ml', 'enlatados', 3.4, 90, 55.08, 306, '2021-12-20 01:42:39'),
('leche 150ml', 'enlatados', 1.7, 100, 30.6, 170, '2021-12-20 01:42:54'),
('energizante 500ml', 'enlatados', 2.5, 80, 36, 200, '2021-12-20 01:44:06'),
('energizante 500ml', 'bebidas', 3.5, 80, 50.4, 280, '2021-12-20 01:44:53'),
('energizante 500ml', 'bebidas', 3, 150, 81, 450, '2021-12-20 01:45:09'),
('arroz', 'abarrotes', 3, 100, 54, 300, '2021-12-20 01:45:27'),
('arroz', 'abarrotes', 3, 100, 54, 300, '2021-12-20 01:45:33'),
('azucar rubia', 'abarrotes', 3.1, 170, 94.86, 527, '2021-12-20 01:47:21'),
('zanahoria', 'abarrotes', 2, 170, 61.2, 340, '2021-12-20 01:48:47'),
('arroz', 'abarrotes', 3, 210, 113.4, 630, '2021-12-20 01:49:59'),
('palta', 'abarrotes', 1.5, 80, 21.6, 120, '2021-12-20 01:50:38'),
('arroz', 'abarrotes', 3.1, 203, 113.274, 629.3, '2021-12-20 01:51:21'),
('leche 350ml', 'enlatados', 3.5, 10, 6.3, 35, '2021-12-20 13:46:48'),
('arroz', 'abarrotes', 3, 198, 106.92, 594, '2021-12-20 13:52:57'),
('leche 150ml', 'enlatados', 1.7, 10, 3.06, 17, '2021-12-20 13:59:44'),
('Inka Kola', 'bebidas', 2.5, 100, 45, 250, '2021-12-20 15:30:05'),
('pechuga de pollo', 'enlatados', 4, 100, 72, 400, '2021-12-20 15:33:10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usuario_id` text NOT NULL,
  `usuario_nombre` text NOT NULL,
  `usuario_apellido` text NOT NULL,
  `usuario_sexo` varchar(1) NOT NULL,
  `usuario_edad` text NOT NULL,
  `usuario_categoria` varchar(10) NOT NULL,
  `usuario_nombreusuario` text NOT NULL,
  `usuario_pasword` text NOT NULL,
  `usuario_dni_ruc` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usuario_id`, `usuario_nombre`, `usuario_apellido`, `usuario_sexo`, `usuario_edad`, `usuario_categoria`, `usuario_nombreusuario`, `usuario_pasword`, `usuario_dni_ruc`) VALUES
('1638885955497', 'Nilson', 'Fray', 'M', '18', 'A', '', '', ''),
('1638887739645', 'KAel', 'Invos', 'F', '13', 'Admin', '22234', 'qwert', ''),
('1638887872153', 'Fray Nilson', 'Toledo Tapia', 'M', '18', 'Admin', 'nilson', 'nilson', '12345678'),
('1638888502371', 'Kevin Naiyel', 'Tola Choque', 'M', '18', 'Admin', 'kevin', 'kevin', ''),
('1638896075314', '66666', '6666666666', 'F', '666666666', 'Personal', '6666666666', '666666666666666', ''),
('1638898042103', 'Julio', 'Cesar', 'M', '21', 'Cliente', 'aasddaas', 'asasa', ''),
('1638898592626', 'Kakaroto', 'aaawwwq', 'F', 'ppoiu', 'Personal', 'gugu', 'gugu', ''),
('1638898991640', 'yanqiu', 'qqqw', 'M', '23', 'Personal', '3333', '33333333', ''),
('1638904643422', 'asas', 'asa', 'M', 'asa', 'Cliente', 'sas', 'sa', ''),
('1638904806606', 'Pedro', 'Toledo Tapia', 'M', '12', 'Personal', '2221', '1112', ''),
('1638905845088', '2', '2222222', 'M', '22222', 'null', '2222', '222222', ''),
('1638905903586', '12', '12', 'M', '1212', 'Cliente', '112', '1', ''),
('1639344614713', 'fgfg', 'fgfg', 'M', 'fgfgfg', 'Personal', 'fg', 'fg', ''),
('1639345485418', '2323', '2323', 'M', '2323', 'Personal', 'qwe', 'qwe', ''),
('1639661363875', 'Nilson', 'Mendoza', 'M', '21', 'Cliente', 'fray', 'fray', '77352765'),
('1639767915615', 'Jhon', 'Luque', 'M', '19', 'Personal', 'jhon', 'jhon', '767635264'),
('1639769972447', 'Luis Angel', 'Solares', 'M', '19', 'Admin', 'luis', 'luis', '77886650'),
('1639770341166', 'Joel', 'Macedo', 'M', '19', 'Admin', 'joel', 'joel', '77654560'),
('1639963569382', 'Juan', 'Tordoya', 'M', '23', 'Personal', 'juan', 'juan', '88766759'),
('1639963644527', 'Lois', 'Kola', 'M', '25', 'Admin', 'lois', 'lois', '667579765'),
('1639965143430', 'Paquito', 'Mamani', 'M', '19', 'Cliente', 'paquito', 'paquito', '76203536'),
('1639965233508', 'Jorge', 'Ramos Muñoz', 'M', '24', 'Cliente', 'jorge', 'jorge', '77493338'),
('1639965284289', 'Eusenia', 'Fuentes', 'F', '21', 'Cliente', 'eusenia', 'eusenia', '76412931 '),
('1640007812384', 'denis', 'Valencia', 'M', '25', 'Admin', 'denis', 'denis', '77623412'),
('1640014122058', 'paquito2', 'Toroodya', 'M', '21', 'Cliente', '123', '123', '77656457'),
('1640014145795', 'sas', 'asas', 'M', 'asas', 'Admin', 'asas', 'asas', '77656457');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
