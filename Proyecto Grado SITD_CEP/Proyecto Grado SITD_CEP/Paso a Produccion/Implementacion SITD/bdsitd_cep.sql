-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 29-07-2012 a las 22:46:38
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `bdsitd_cep`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `actas`
-- 

CREATE TABLE `actas` (
  `id_actas` int(11) NOT NULL auto_increment,
  `fecha_acta` date NOT NULL,
  `asunto_acta` varchar(300) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_actas`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=44 ;

-- 
-- Volcar la base de datos para la tabla `actas`
-- 

INSERT INTO `actas` VALUES (2, '2012-07-21', 'Acta de Inicio', 1);
INSERT INTO `actas` VALUES (3, '2012-07-21', 'Acta de Inicio', 2);
INSERT INTO `actas` VALUES (4, '2012-07-21', 'Acta de Inicio', 3);
INSERT INTO `actas` VALUES (5, '2012-07-21', 'Acta de Inicio', 4);
INSERT INTO `actas` VALUES (6, '2012-07-21', 'Acta de Inicio', 5);
INSERT INTO `actas` VALUES (7, '2012-07-21', 'Acta de Inicio', 6);
INSERT INTO `actas` VALUES (8, '2012-07-21', 'Acta de Inicio', 123);
INSERT INTO `actas` VALUES (9, '2012-07-21', 'Acta de Inicio', 132);
INSERT INTO `actas` VALUES (10, '2012-07-21', 'Acta de Inicio', 321);
INSERT INTO `actas` VALUES (11, '2012-07-21', 'Acta de Inicio', 231);
INSERT INTO `actas` VALUES (12, '2012-07-21', 'Acta de Inicio', 432);
INSERT INTO `actas` VALUES (13, '2012-07-21', 'Acta de Inicio', 324);
INSERT INTO `actas` VALUES (14, '2012-07-21', 'Acta de Inicio', 125);
INSERT INTO `actas` VALUES (15, '2012-07-21', 'Acta de Inicio', 987);
INSERT INTO `actas` VALUES (16, '2012-07-21', 'Acta de Inicio', 789);
INSERT INTO `actas` VALUES (17, '2012-07-21', 'Acta de Inicio', 879);
INSERT INTO `actas` VALUES (18, '2012-07-22', 'Acta de Inicio', 189);
INSERT INTO `actas` VALUES (19, '2012-07-22', 'Acta de Inicio', 567);
INSERT INTO `actas` VALUES (20, '2012-07-22', 'Acta de Inicio', 496);
INSERT INTO `actas` VALUES (21, '2012-07-22', 'Acta de Inicio', 1);
INSERT INTO `actas` VALUES (22, '2012-07-22', 'Acta de Inicio', 2);
INSERT INTO `actas` VALUES (23, '2012-07-26', 'Acta de Inicio', 3);
INSERT INTO `actas` VALUES (24, '2012-07-22', 'Acta de Inicio', 12);
INSERT INTO `actas` VALUES (25, '2012-07-22', 'Acta de Inicio', 13);
INSERT INTO `actas` VALUES (26, '2012-07-28', 'Acta de Inicio', 913);
INSERT INTO `actas` VALUES (27, '2012-07-28', 'Acta de Inicio', 5789);
INSERT INTO `actas` VALUES (28, '2012-07-28', 'Acta de Inicio', 7689);
INSERT INTO `actas` VALUES (29, '2012-07-28', 'Acta de Inicio', 4578);
INSERT INTO `actas` VALUES (30, '2012-07-28', 'Acta de Inicio', 9988);
INSERT INTO `actas` VALUES (31, '2012-07-29', 'Acta de Inicio', 3789);
INSERT INTO `actas` VALUES (32, '2012-07-29', 'Acta de Inicio', 9999);
INSERT INTO `actas` VALUES (33, '2012-07-29', 'Acta de Inicio', 7700);
INSERT INTO `actas` VALUES (34, '2012-07-29', 'Acta de Inicio', 1367);
INSERT INTO `actas` VALUES (35, '2012-07-31', 'Acta de Inicio', 9321);
INSERT INTO `actas` VALUES (36, '2012-07-29', 'Acta de Inicio', 9356);
INSERT INTO `actas` VALUES (37, '2012-07-29', 'Acta de Inicio', 9357);
INSERT INTO `actas` VALUES (38, '2012-07-29', 'Acta de Inicio', 5566);
INSERT INTO `actas` VALUES (39, '2012-07-29', 'Acta de Inicio', 1067);
INSERT INTO `actas` VALUES (40, '2012-07-29', 'Acta de Inicio', 9009);
INSERT INTO `actas` VALUES (41, '2012-07-29', 'Acta de Inicio', 9873);
INSERT INTO `actas` VALUES (42, '2012-07-29', 'Acta de Inicio', 9813);
INSERT INTO `actas` VALUES (43, '2012-07-29', 'Acta de Inicio', 1556);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `aportes_convenio`
-- 

CREATE TABLE `aportes_convenio` (
  `id_aporte` int(11) NOT NULL auto_increment,
  `fecha_desembolso` date NOT NULL,
  `monto_aporte` double NOT NULL,
  `NIT_entidad` varchar(30) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_aporte`),
  KEY `NIT_entidad` (`NIT_entidad`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=40 ;

-- 
-- Volcar la base de datos para la tabla `aportes_convenio`
-- 

INSERT INTO `aportes_convenio` VALUES (1, '2012-07-24', 100, '1', 2);
INSERT INTO `aportes_convenio` VALUES (2, '2012-07-29', 55000000, '1', 3);
INSERT INTO `aportes_convenio` VALUES (3, '2012-07-31', 110000000, '5', 3);
INSERT INTO `aportes_convenio` VALUES (4, '2012-07-29', 1000, '1', 913);
INSERT INTO `aportes_convenio` VALUES (5, '2012-07-28', 1000, '2', 913);
INSERT INTO `aportes_convenio` VALUES (6, '2012-07-28', 1000, '1', 5789);
INSERT INTO `aportes_convenio` VALUES (7, '2012-07-28', 1000, '2', 5789);
INSERT INTO `aportes_convenio` VALUES (8, '2012-07-28', 1, '1', 7689);
INSERT INTO `aportes_convenio` VALUES (9, '2012-07-28', 2, '2', 7689);
INSERT INTO `aportes_convenio` VALUES (10, '2012-07-28', 3, '1', 4578);
INSERT INTO `aportes_convenio` VALUES (11, '2012-07-28', 1, '3', 4578);
INSERT INTO `aportes_convenio` VALUES (12, '2012-07-28', 11, '1', 9988);
INSERT INTO `aportes_convenio` VALUES (13, '2012-07-28', 33, '2', 9988);
INSERT INTO `aportes_convenio` VALUES (14, '2012-07-29', 123, '1', 3789);
INSERT INTO `aportes_convenio` VALUES (15, '2012-07-29', 321, '2', 3789);
INSERT INTO `aportes_convenio` VALUES (16, '2012-07-29', 1000, '1', 9999);
INSERT INTO `aportes_convenio` VALUES (17, '2012-07-29', 999, '2', 9999);
INSERT INTO `aportes_convenio` VALUES (18, '2012-07-29', 12345, '1', 7700);
INSERT INTO `aportes_convenio` VALUES (19, '2012-07-29', 123456, '2', 7700);
INSERT INTO `aportes_convenio` VALUES (20, '2012-07-29', 12345, '1', 1367);
INSERT INTO `aportes_convenio` VALUES (21, '2012-07-29', 4321, '2', 1367);
INSERT INTO `aportes_convenio` VALUES (22, '2012-07-29', 123, '1', 9321);
INSERT INTO `aportes_convenio` VALUES (23, '2012-07-29', 123, '2', 9321);
INSERT INTO `aportes_convenio` VALUES (24, '2012-07-29', 1, '1', 9356);
INSERT INTO `aportes_convenio` VALUES (25, '2012-07-29', 2, '2', 9356);
INSERT INTO `aportes_convenio` VALUES (26, '2012-07-29', 1, '1', 9357);
INSERT INTO `aportes_convenio` VALUES (27, '2012-07-29', 2, '2', 9357);
INSERT INTO `aportes_convenio` VALUES (28, '2012-07-29', 11, '1', 5566);
INSERT INTO `aportes_convenio` VALUES (29, '2012-07-29', 11, '2', 5566);
INSERT INTO `aportes_convenio` VALUES (30, '2012-07-29', 222, '1', 1067);
INSERT INTO `aportes_convenio` VALUES (31, '2012-07-29', 222, '2', 1067);
INSERT INTO `aportes_convenio` VALUES (32, '2012-07-29', 1, '1', 9009);
INSERT INTO `aportes_convenio` VALUES (33, '2012-07-29', 3, '2', 9009);
INSERT INTO `aportes_convenio` VALUES (34, '2012-07-29', 99, '1', 9873);
INSERT INTO `aportes_convenio` VALUES (35, '2012-07-29', 1, '2', 9873);
INSERT INTO `aportes_convenio` VALUES (36, '2012-07-29', 1, '1', 9813);
INSERT INTO `aportes_convenio` VALUES (37, '2012-07-29', 22, '2', 9813);
INSERT INTO `aportes_convenio` VALUES (38, '2012-07-29', 1, '1', 1556);
INSERT INTO `aportes_convenio` VALUES (39, '2012-07-29', 33, '2', 1556);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `aporte_rubro_entidad`
-- 

CREATE TABLE `aporte_rubro_entidad` (
  `id_aporte_rubro` int(11) NOT NULL auto_increment,
  `NIT_entidad` varchar(30) NOT NULL,
  `monto_aporte_rubro` double NOT NULL,
  `id_rubro` int(11) NOT NULL,
  PRIMARY KEY  (`id_aporte_rubro`),
  KEY `NIT_entidad` (`NIT_entidad`),
  KEY `id_rubro` (`id_rubro`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

-- 
-- Volcar la base de datos para la tabla `aporte_rubro_entidad`
-- 

INSERT INTO `aporte_rubro_entidad` VALUES (1, '1', 200, 1);
INSERT INTO `aporte_rubro_entidad` VALUES (2, '2', 200, 1);
INSERT INTO `aporte_rubro_entidad` VALUES (3, '1', 500, 2);
INSERT INTO `aporte_rubro_entidad` VALUES (4, '2', 5500, 2);
INSERT INTO `aporte_rubro_entidad` VALUES (5, '1', 200, 4);
INSERT INTO `aporte_rubro_entidad` VALUES (6, '1', 5, 6);
INSERT INTO `aporte_rubro_entidad` VALUES (7, '2', 55, 6);
INSERT INTO `aporte_rubro_entidad` VALUES (8, '1', 60, 7);
INSERT INTO `aporte_rubro_entidad` VALUES (9, '2', 640, 7);
INSERT INTO `aporte_rubro_entidad` VALUES (10, '1', 80, 9);
INSERT INTO `aporte_rubro_entidad` VALUES (11, '2', 120, 9);
INSERT INTO `aporte_rubro_entidad` VALUES (12, '1', 100, 10);
INSERT INTO `aporte_rubro_entidad` VALUES (13, '2', 400, 10);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `asignacion_honorarios`
-- 

CREATE TABLE `asignacion_honorarios` (
  `id_honorarios` int(11) NOT NULL auto_increment,
  `fecha_pago` date NOT NULL,
  `monto_honorarios` double NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY  (`id_honorarios`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `asignacion_honorarios`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `asignacion_tiquete`
-- 

CREATE TABLE `asignacion_tiquete` (
  `id_tiquete` int(11) NOT NULL auto_increment,
  `fecha_solicitud` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `fecha_regreso` date NOT NULL,
  `ciudad_origen` varchar(100) NOT NULL,
  `ciudad_destino` varchar(100) NOT NULL,
  `aerolinea` varchar(100) NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY  (`id_tiquete`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `asignacion_tiquete`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `asignacion_viaticos`
-- 

CREATE TABLE `asignacion_viaticos` (
  `id_viaticos` int(11) NOT NULL auto_increment,
  `fecha_pago` date NOT NULL,
  `monto_viaticos` double NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY  (`id_viaticos`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `asignacion_viaticos`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `categorias_login`
-- 

CREATE TABLE `categorias_login` (
  `id_categoria` int(11) NOT NULL auto_increment,
  `nombre_categoria` varchar(200) NOT NULL,
  PRIMARY KEY  (`id_categoria`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

-- 
-- Volcar la base de datos para la tabla `categorias_login`
-- 

INSERT INTO `categorias_login` VALUES (1, 'SUPER ADMINISTRADOR');
INSERT INTO `categorias_login` VALUES (2, 'GESTION PROFESORAL - ESCALAFON');
INSERT INTO `categorias_login` VALUES (3, 'GESTION CONVENIOS');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `conferencista`
-- 

CREATE TABLE `conferencista` (
  `id_conferencista` int(11) NOT NULL auto_increment,
  `cedula_conferencista` int(20) NOT NULL,
  `nombres_conferencista` varchar(300) NOT NULL,
  `apellidos_conferencista` varchar(300) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero_conferencista` varchar(10) NOT NULL,
  `direccion_conferencista` varchar(300) NOT NULL,
  `telefono_conferencista` varchar(12) default NULL,
  `celular_conferencista` varchar(12) default NULL,
  `correo_electronico_conferencista` varchar(300) default NULL,
  `numero_cuenta_conferencista` varchar(60) NOT NULL,
  `tipo_cuenta_conferencista` varchar(40) NOT NULL,
  `banco_conferencista` varchar(300) NOT NULL,
  `estado_conferencista` varchar(300) NOT NULL,
  PRIMARY KEY  (`cedula_conferencista`),
  UNIQUE KEY `id_conferencista` (`id_conferencista`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `conferencista`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `convenio`
-- 

CREATE TABLE `convenio` (
  `id_convenio` int(11) NOT NULL auto_increment,
  `numero_convenio` int(11) NOT NULL default '0',
  `fecha_inicio_convenio` date NOT NULL,
  `duracion_convenio_dias` int(11) NOT NULL,
  `saldos_sociales` varchar(1000) default NULL,
  `saldos_pedagogicos` varchar(1000) default NULL,
  `resumen_convenio` varchar(2000) default NULL,
  `objeto_convenio` varchar(2000) NOT NULL,
  `estado_convenio` varchar(20) NOT NULL,
  PRIMARY KEY  (`numero_convenio`),
  UNIQUE KEY `id_convenio` (`id_convenio`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=44 ;

-- 
-- Volcar la base de datos para la tabla `convenio`
-- 

INSERT INTO `convenio` VALUES (21, 1, '2012-07-22', 1, '', '', '', '1', 'EJECUCION');
INSERT INTO `convenio` VALUES (22, 2, '2012-07-22', 1, '', '', '', '2', 'EJECUCION');
INSERT INTO `convenio` VALUES (23, 3, '2012-07-25', 1, '', '', '', 'Conveni de cooperacion interinstitucional etc', 'EJECUCION');
INSERT INTO `convenio` VALUES (24, 12, '2012-07-22', 1, '', '', '', '12', 'EJECUCION');
INSERT INTO `convenio` VALUES (25, 13, '2012-07-22', 1, '', '', '', '13', 'EJECUCION');
INSERT INTO `convenio` VALUES (26, 913, '2012-07-28', 10, '', '', '', 'ABCD', 'EJECUCION');
INSERT INTO `convenio` VALUES (27, 5789, '2012-07-28', 4, '', '', '', '5789', 'EJECUCION');
INSERT INTO `convenio` VALUES (28, 7689, '2012-07-28', 1, '', '', '', '7689', 'EJECUCION');
INSERT INTO `convenio` VALUES (29, 4578, '2012-07-28', 1, '', '', '', '4578', 'EJECUCION');
INSERT INTO `convenio` VALUES (30, 9988, '2012-07-28', 1, '', '', '', '9988', 'EJECUCION');
INSERT INTO `convenio` VALUES (31, 3789, '2012-07-29', 4, '', '', '', '3789', 'EJECUCION');
INSERT INTO `convenio` VALUES (32, 9999, '2012-07-29', 1, '', '', '', '9988', 'EJECUCION');
INSERT INTO `convenio` VALUES (33, 7700, '2012-07-29', 1, '', '', '', '7700', 'EJECUCION');
INSERT INTO `convenio` VALUES (34, 1367, '2012-07-29', 1, '', '', '', '1367', 'EJECUCION');
INSERT INTO `convenio` VALUES (35, 9321, '2012-07-31', 4, '', '', '', 'this is the 9321 test', 'EJECUCION');
INSERT INTO `convenio` VALUES (36, 9356, '2012-07-29', 7, '', '', '', '9356', 'EJECUCION');
INSERT INTO `convenio` VALUES (37, 9357, '2012-07-29', 8, '', '', '', '9357', 'EJECUCION');
INSERT INTO `convenio` VALUES (38, 5566, '2012-07-29', 1, '', '', '', '5566', 'EJECUCION');
INSERT INTO `convenio` VALUES (39, 1067, '2012-07-29', 21, '', '', '', '1067', 'EJECUCION');
INSERT INTO `convenio` VALUES (40, 9009, '2012-07-29', 1, '', '', '', '9009', 'EJECUCION');
INSERT INTO `convenio` VALUES (41, 9873, '2012-07-29', 5, '', '', '', '9873', 'EJECUCION');
INSERT INTO `convenio` VALUES (42, 9813, '2012-07-29', 1, '', '', '', '9813', 'EJECUCION');
INSERT INTO `convenio` VALUES (43, 1556, '2012-07-29', 1, '', '', '', '1556', 'EJECUCION');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `convenio_entidad`
-- 

CREATE TABLE `convenio_entidad` (
  `id_convenio_entidad` int(11) NOT NULL auto_increment,
  `numero_convenio` int(11) NOT NULL,
  `NIT_entidad` varchar(30) NOT NULL,
  PRIMARY KEY  (`id_convenio_entidad`),
  KEY `numero_convenio` (`numero_convenio`,`NIT_entidad`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=88 ;

-- 
-- Volcar la base de datos para la tabla `convenio_entidad`
-- 

INSERT INTO `convenio_entidad` VALUES (42, 1, '1');
INSERT INTO `convenio_entidad` VALUES (44, 2, '1');
INSERT INTO `convenio_entidad` VALUES (45, 2, '2');
INSERT INTO `convenio_entidad` VALUES (46, 3, '1');
INSERT INTO `convenio_entidad` VALUES (47, 3, '5');
INSERT INTO `convenio_entidad` VALUES (48, 12, '1');
INSERT INTO `convenio_entidad` VALUES (49, 12, '2');
INSERT INTO `convenio_entidad` VALUES (50, 13, '1');
INSERT INTO `convenio_entidad` VALUES (51, 13, '2');
INSERT INTO `convenio_entidad` VALUES (52, 913, '1');
INSERT INTO `convenio_entidad` VALUES (53, 913, '2');
INSERT INTO `convenio_entidad` VALUES (54, 5789, '1');
INSERT INTO `convenio_entidad` VALUES (55, 5789, '2');
INSERT INTO `convenio_entidad` VALUES (56, 7689, '1');
INSERT INTO `convenio_entidad` VALUES (57, 7689, '2');
INSERT INTO `convenio_entidad` VALUES (58, 4578, '1');
INSERT INTO `convenio_entidad` VALUES (59, 4578, '3');
INSERT INTO `convenio_entidad` VALUES (60, 9988, '1');
INSERT INTO `convenio_entidad` VALUES (61, 9988, '2');
INSERT INTO `convenio_entidad` VALUES (62, 3789, '1');
INSERT INTO `convenio_entidad` VALUES (63, 3789, '2');
INSERT INTO `convenio_entidad` VALUES (64, 9999, '1');
INSERT INTO `convenio_entidad` VALUES (65, 9999, '2');
INSERT INTO `convenio_entidad` VALUES (66, 7700, '1');
INSERT INTO `convenio_entidad` VALUES (67, 7700, '2');
INSERT INTO `convenio_entidad` VALUES (68, 1367, '1');
INSERT INTO `convenio_entidad` VALUES (69, 1367, '2');
INSERT INTO `convenio_entidad` VALUES (70, 9321, '1');
INSERT INTO `convenio_entidad` VALUES (71, 9321, '2');
INSERT INTO `convenio_entidad` VALUES (72, 9356, '1');
INSERT INTO `convenio_entidad` VALUES (73, 9356, '2');
INSERT INTO `convenio_entidad` VALUES (74, 9357, '1');
INSERT INTO `convenio_entidad` VALUES (75, 9357, '2');
INSERT INTO `convenio_entidad` VALUES (76, 5566, '1');
INSERT INTO `convenio_entidad` VALUES (77, 5566, '2');
INSERT INTO `convenio_entidad` VALUES (78, 1067, '1');
INSERT INTO `convenio_entidad` VALUES (79, 1067, '2');
INSERT INTO `convenio_entidad` VALUES (80, 9009, '1');
INSERT INTO `convenio_entidad` VALUES (81, 9009, '2');
INSERT INTO `convenio_entidad` VALUES (82, 9873, '1');
INSERT INTO `convenio_entidad` VALUES (83, 9873, '2');
INSERT INTO `convenio_entidad` VALUES (84, 9813, '2');
INSERT INTO `convenio_entidad` VALUES (85, 9813, '1');
INSERT INTO `convenio_entidad` VALUES (86, 1556, '1');
INSERT INTO `convenio_entidad` VALUES (87, 1556, '2');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `convenio_vinculado`
-- 

CREATE TABLE `convenio_vinculado` (
  `id_vinculado_convenio` int(11) NOT NULL auto_increment,
  `id_vinculado` int(11) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_vinculado_convenio`),
  KEY `id_vinculado` (`id_vinculado`,`numero_convenio`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `convenio_vinculado`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `credito_docente`
-- 

CREATE TABLE `credito_docente` (
  `id_credito_docente` int(11) NOT NULL auto_increment,
  `id_credito` int(11) NOT NULL,
  `cedula_docente` int(20) NOT NULL,
  PRIMARY KEY  (`id_credito_docente`),
  KEY `id_credito` (`id_credito`),
  KEY `cedula_docente` (`cedula_docente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `credito_docente`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `credito_escalafon`
-- 

CREATE TABLE `credito_escalafon` (
  `ID_CREDITO` int(11) NOT NULL auto_increment,
  `NUMERO_CREDITOS` int(11) NOT NULL,
  `FECHA_INICIO` date NOT NULL,
  `FECHA_FINAL` date NOT NULL,
  `NUMERO_HORAS` int(11) NOT NULL,
  `RESOLUCION` varchar(100) NOT NULL,
  `NOMBRE_CREDITO` varchar(300) NOT NULL,
  PRIMARY KEY  (`ID_CREDITO`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `credito_escalafon`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `docente_escalafon`
-- 

CREATE TABLE `docente_escalafon` (
  `id_docente` int(11) NOT NULL auto_increment,
  `cedula_docente` int(20) NOT NULL,
  `nombres_docente` varchar(300) NOT NULL,
  `apellidos_docente` varchar(300) NOT NULL,
  `municipio_docente` varchar(300) NOT NULL,
  `genero_docente` varchar(10) NOT NULL,
  `telefono_docente` varchar(12) NOT NULL,
  PRIMARY KEY  (`cedula_docente`),
  UNIQUE KEY `id_docente` (`id_docente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `docente_escalafon`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `ejecucion_presupuesto`
-- 

CREATE TABLE `ejecucion_presupuesto` (
  `id_ejecucion` int(11) NOT NULL auto_increment,
  `monto_ejecutado` double default NULL,
  `fecha_ejecución` date NOT NULL,
  `descripcion_ejecucion` varchar(300) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_ejecucion`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `ejecucion_presupuesto`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `emision_constancia`
-- 

CREATE TABLE `emision_constancia` (
  `id_constancia` int(11) NOT NULL auto_increment,
  `cedula_persona` int(20) NOT NULL,
  `id_credito_docente` int(11) NOT NULL,
  `fecha_emision` date NOT NULL,
  PRIMARY KEY  (`id_constancia`),
  KEY `cedula_persona` (`cedula_persona`),
  KEY `id_credito_docente` (`id_credito_docente`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `emision_constancia`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `entidad_convenio`
-- 

CREATE TABLE `entidad_convenio` (
  `id_entidad` int(11) NOT NULL auto_increment,
  `NIT_entidad` varchar(30) NOT NULL,
  `nombre_entidad` varchar(150) NOT NULL,
  `descripcion_entidad` varchar(200) NOT NULL,
  PRIMARY KEY  (`NIT_entidad`),
  UNIQUE KEY `id_entidad` (`id_entidad`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- 
-- Volcar la base de datos para la tabla `entidad_convenio`
-- 

INSERT INTO `entidad_convenio` VALUES (1, '1', 'Universidad de Ibague', 'Entidad sin animo de Lucro para sevir a los tolimenses');
INSERT INTO `entidad_convenio` VALUES (2, '2', 'Entidad de prueba 2', 'Entidad de prueba 2');
INSERT INTO `entidad_convenio` VALUES (3, '3', '3', '3');
INSERT INTO `entidad_convenio` VALUES (4, '5', 'Gobernacion del Tolima', 'Gobernacion del tolima, gobierno departamental');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `modulo`
-- 

CREATE TABLE `modulo` (
  `id_modulo` int(11) NOT NULL auto_increment,
  `nombre_modulo` varchar(200) NOT NULL,
  `duracion_modulo_horas` int(11) NOT NULL,
  `fecha_inicio_modulo` date NOT NULL,
  `valor_hora` double NOT NULL,
  `cohorte_programa` varchar(20) NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY  (`id_modulo`),
  KEY `cohorte_programa` (`cohorte_programa`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `modulo`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `persona_solicitante`
-- 

CREATE TABLE `persona_solicitante` (
  `id_persona` int(11) NOT NULL auto_increment,
  `cedula_persona` int(20) NOT NULL,
  `nombres_persona` varchar(300) NOT NULL,
  `apellidos_persona` varchar(300) NOT NULL,
  `telefono-persona` varchar(12) NOT NULL,
  `celular_persona` varchar(12) NOT NULL,
  PRIMARY KEY  (`cedula_persona`),
  UNIQUE KEY `id_persona` (`id_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `persona_solicitante`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `presupuesto`
-- 

CREATE TABLE `presupuesto` (
  `id_presupuesto` int(11) NOT NULL auto_increment,
  `fecha_elaboracion` date NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_presupuesto`),
  UNIQUE KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

-- 
-- Volcar la base de datos para la tabla `presupuesto`
-- 

INSERT INTO `presupuesto` VALUES (1, '2012-07-28', 5789);
INSERT INTO `presupuesto` VALUES (2, '2012-07-28', 7689);
INSERT INTO `presupuesto` VALUES (3, '2012-07-28', 4578);
INSERT INTO `presupuesto` VALUES (4, '2012-07-28', 9988);
INSERT INTO `presupuesto` VALUES (5, '2012-07-29', 3789);
INSERT INTO `presupuesto` VALUES (6, '2012-07-29', 9999);
INSERT INTO `presupuesto` VALUES (7, '2012-07-29', 7700);
INSERT INTO `presupuesto` VALUES (8, '2012-07-31', 1367);
INSERT INTO `presupuesto` VALUES (9, '2012-08-01', 9321);
INSERT INTO `presupuesto` VALUES (10, '2012-08-02', 9356);
INSERT INTO `presupuesto` VALUES (11, '2012-08-27', 9357);
INSERT INTO `presupuesto` VALUES (12, '2012-08-02', 5566);
INSERT INTO `presupuesto` VALUES (13, '2012-07-29', 1067);
INSERT INTO `presupuesto` VALUES (14, '2012-07-28', 9009);
INSERT INTO `presupuesto` VALUES (15, '2012-08-03', 9873);
INSERT INTO `presupuesto` VALUES (16, '2012-07-29', 9813);
INSERT INTO `presupuesto` VALUES (17, '2012-07-29', 1556);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `programa`
-- 

CREATE TABLE `programa` (
  `id_programa` int(11) NOT NULL auto_increment,
  `cohorte_programa` varchar(20) NOT NULL,
  `nombre_programa` varchar(200) NOT NULL,
  `fecha_inicio_programa` date NOT NULL,
  `valor` double NOT NULL,
  `numero_convenio` int(11) default NULL,
  PRIMARY KEY  (`id_programa`),
  UNIQUE KEY `cohorte_programa` (`cohorte_programa`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `programa`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `rubro_presupuestal`
-- 

CREATE TABLE `rubro_presupuestal` (
  `id_rubro` int(11) NOT NULL auto_increment,
  `descripcion_rubro` varchar(300) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `valor_unitario` double NOT NULL,
  `id_presupuesto` int(11) NOT NULL,
  PRIMARY KEY  (`id_rubro`),
  KEY `id_presupuesto` (`id_presupuesto`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- 
-- Volcar la base de datos para la tabla `rubro_presupuestal`
-- 

INSERT INTO `rubro_presupuestal` VALUES (1, 'Otros materiales', 4, 100, 8);
INSERT INTO `rubro_presupuestal` VALUES (2, 'Fotocopias', 6, 1000, 10);
INSERT INTO `rubro_presupuestal` VALUES (3, 'Test', 5, 1000, 10);
INSERT INTO `rubro_presupuestal` VALUES (4, 'Fotocopias', 8, 100, 11);
INSERT INTO `rubro_presupuestal` VALUES (5, 'Fotocopias', 4, 200, 12);
INSERT INTO `rubro_presupuestal` VALUES (6, 'Fotocopias', 6, 10, 13);
INSERT INTO `rubro_presupuestal` VALUES (7, 'Fotocopias', 7, 100, 14);
INSERT INTO `rubro_presupuestal` VALUES (8, 'Transporte Nacional', 2, 80, 15);
INSERT INTO `rubro_presupuestal` VALUES (9, 'Otros materiales', 4, 50, 16);
INSERT INTO `rubro_presupuestal` VALUES (10, 'Fotocopias', 5, 100, 17);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `usuarios_login`
-- 

CREATE TABLE `usuarios_login` (
  `id_usuarios` int(11) NOT NULL auto_increment,
  `nombre_usuario` varchar(200) NOT NULL,
  `contrasena` varchar(200) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  PRIMARY KEY  (`id_usuarios`),
  UNIQUE KEY `nombre_usuario` (`nombre_usuario`),
  UNIQUE KEY `nombre_usuario_2` (`nombre_usuario`),
  KEY `id_categoria` (`id_categoria`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- 
-- Volcar la base de datos para la tabla `usuarios_login`
-- 

INSERT INTO `usuarios_login` VALUES (1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 1);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `variaciones_tiempo`
-- 

CREATE TABLE `variaciones_tiempo` (
  `id_variacion` int(11) NOT NULL auto_increment,
  `fecha_variacion` date NOT NULL,
  `descripcion_variacion` varchar(300) NOT NULL,
  `duracion_variacion_dias` int(11) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_variacion`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `variaciones_tiempo`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `vinculado_convenio`
-- 

CREATE TABLE `vinculado_convenio` (
  `id_vinculado` int(11) NOT NULL auto_increment,
  `NIT_vinculado` varchar(30) default NULL,
  `cedula_vinculado` int(20) default NULL,
  `asignacion_salarial` double default NULL,
  `fecha_vinculacion` date NOT NULL,
  `duracion_vinculacion_dias` int(11) NOT NULL,
  `nombres_vinculado` varchar(100) default NULL,
  `apellidos_vinculado` varchar(100) default NULL,
  `correo_vinculado` varchar(100) default NULL,
  `telefono_vinculado` varchar(20) default NULL,
  `genero_vinculado` varchar(20) default NULL,
  `estado_vinculado` varchar(10) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY  (`id_vinculado`),
  UNIQUE KEY `NIT_vinculado` (`NIT_vinculado`),
  UNIQUE KEY `cedula_vinculado` (`cedula_vinculado`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `vinculado_convenio`
-- 

