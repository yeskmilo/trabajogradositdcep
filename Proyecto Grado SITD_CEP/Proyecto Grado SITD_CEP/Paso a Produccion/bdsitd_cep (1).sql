-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 13-11-2012 a las 16:24:29
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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=62 ;

-- 
-- Volcar la base de datos para la tabla `actas`
-- 

INSERT INTO `actas` VALUES (61, '2012-08-23', 'Acta de Reinicio', 3459);
INSERT INTO `actas` VALUES (60, '2012-08-23', 'Acta de Adicion de Tiempo', 3459);
INSERT INTO `actas` VALUES (59, '2012-08-23', 'Acta de Suspension', 3459);
INSERT INTO `actas` VALUES (58, '2012-08-23', 'Acta de Reinicio', 3459);
INSERT INTO `actas` VALUES (57, '2012-08-23', 'Acta de Reinicio', 3459);
INSERT INTO `actas` VALUES (56, '2012-08-31', 'Acta de Adicion de Tiempo', 96578);
INSERT INTO `actas` VALUES (55, '2012-08-31', 'Acta de Suspension', 96578);
INSERT INTO `actas` VALUES (54, '2012-08-24', 'Acta de Inicio', 96578);
INSERT INTO `actas` VALUES (53, '2012-08-17', 'Acta de Inicio', 34678);
INSERT INTO `actas` VALUES (52, '2012-08-06', 'Acta de Inicio', 3459);
INSERT INTO `actas` VALUES (51, '2012-08-14', 'Acta de Inicio', 3587);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=63 ;

-- 
-- Volcar la base de datos para la tabla `aportes_convenio`
-- 

INSERT INTO `aportes_convenio` VALUES (62, '2012-08-24', 9100, '8117', 96578);
INSERT INTO `aportes_convenio` VALUES (61, '2012-08-18', 900, '1', 96578);
INSERT INTO `aportes_convenio` VALUES (60, '2012-08-17', 100, '8117', 34678);
INSERT INTO `aportes_convenio` VALUES (59, '2012-08-17', 100, '1', 34678);
INSERT INTO `aportes_convenio` VALUES (56, '2012-08-30', 10000000, '890704382-1', 3459);
INSERT INTO `aportes_convenio` VALUES (58, '2012-08-30', 50000000, '8117', 3459);
INSERT INTO `aportes_convenio` VALUES (57, '2012-08-16', 50000000, '8117', 3459);

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
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=36 ;

-- 
-- Volcar la base de datos para la tabla `aporte_rubro_entidad`
-- 

INSERT INTO `aporte_rubro_entidad` VALUES (35, '8117', 0, 21);
INSERT INTO `aporte_rubro_entidad` VALUES (34, '1', 100, 21);
INSERT INTO `aporte_rubro_entidad` VALUES (29, '890704382-1', 0, 18);
INSERT INTO `aporte_rubro_entidad` VALUES (28, '8117', 5000000, 18);
INSERT INTO `aporte_rubro_entidad` VALUES (31, '8117', 100, 19);
INSERT INTO `aporte_rubro_entidad` VALUES (30, '1', 0, 19);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `asignacion_honorarios`
-- 

CREATE TABLE `asignacion_honorarios` (
  `id_honorarios` int(11) NOT NULL auto_increment,
  `fecha_pago` date NOT NULL,
  `monto_honorarios` double NOT NULL,
  `id_modulo` int(20) NOT NULL,
  PRIMARY KEY  (`id_honorarios`),
  KEY `id_modulo` (`id_modulo`)
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
  `id_modulo` int(20) NOT NULL,
  PRIMARY KEY  (`id_tiquete`),
  KEY `id_modulo` (`id_modulo`)
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
  `id_modulo` int(20) NOT NULL,
  PRIMARY KEY  (`id_viaticos`),
  KEY `id_modulo` (`id_modulo`)
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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `conferencista`
-- 

INSERT INTO `conferencista` VALUES (1, 1, '1', '1', '2012-11-07', 'Femenino', '1', '1', '1', '1', '1', 'Corriente', '1', 'AC');
INSERT INTO `conferencista` VALUES (2, 2, 'w', 'w', '2012-11-05', 'Masculino', 'w', 'w', 'w', 'w', 'w', 'Ahorros', 'w', 'AC');

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=55 ;

-- 
-- Volcar la base de datos para la tabla `convenio`
-- 

INSERT INTO `convenio` VALUES (54, 96578, '2012-08-24', 365, 'prueba', 'prueba', 'prueba', 'Convenio de ejemplo para pruebas', 'LIQUIDADO');
INSERT INTO `convenio` VALUES (53, 34678, '2012-08-17', 5, '', '', '', 'Prueba Camilo', 'EJECUCION');
INSERT INTO `convenio` VALUES (52, 3459, '2012-08-06', 1, 'TEst', 'test', 'test', 'Aunar esfuerzos para que todo salga bien...', 'EJECUCION');
INSERT INTO `convenio` VALUES (51, 3587, '2012-08-15', 360, '', '', '', 'Este es un convenio de Prueba... Aunar esfuerzos ETC', 'EJECUCION');

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
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=109 ;

-- 
-- Volcar la base de datos para la tabla `convenio_entidad`
-- 

INSERT INTO `convenio_entidad` VALUES (108, 96578, '8117');
INSERT INTO `convenio_entidad` VALUES (107, 96578, '1');
INSERT INTO `convenio_entidad` VALUES (106, 34678, '8117');
INSERT INTO `convenio_entidad` VALUES (105, 34678, '1');
INSERT INTO `convenio_entidad` VALUES (104, 3459, '8117');
INSERT INTO `convenio_entidad` VALUES (102, 3459, '890704382-1');

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
  `id_rubro` int(11) NOT NULL,
  PRIMARY KEY  (`id_ejecucion`),
  KEY `id_rubro` (`id_rubro`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

-- 
-- Volcar la base de datos para la tabla `ejecucion_presupuesto`
-- 

INSERT INTO `ejecucion_presupuesto` VALUES (7, 10, '2012-08-17', 'Primer pago', 19);
INSERT INTO `ejecucion_presupuesto` VALUES (5, 3000000, '2012-08-15', 'Primer pago', 18);
INSERT INTO `ejecucion_presupuesto` VALUES (6, 2000000, '2012-08-15', 'Segundo pago', 18);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

-- 
-- Volcar la base de datos para la tabla `entidad_convenio`
-- 

INSERT INTO `entidad_convenio` VALUES (1, '1', 'Universidad de Ibague', 'Entidad sin animo de Lucro para sevir a los tolimenses');
INSERT INTO `entidad_convenio` VALUES (2, '2', 'Entidad de prueba 2', 'Entidad de prueba 2');
INSERT INTO `entidad_convenio` VALUES (3, '3', '3', '3');
INSERT INTO `entidad_convenio` VALUES (4, '5', 'Gobernacion del Tolima', 'Gobernacion del tolima, gobierno departamental');
INSERT INTO `entidad_convenio` VALUES (5, '890704382-1', 'Universidad de Ibague', 'Entidad de educacion superior');
INSERT INTO `entidad_convenio` VALUES (6, '8117', 'Gobernación del Tolima', 'Gobierno Departamental');

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

-- 
-- Volcar la base de datos para la tabla `modulo`
-- 

INSERT INTO `modulo` VALUES (1, 'test', 2, '2012-11-09', 100, '1', 2);
INSERT INTO `modulo` VALUES (2, 'q', 2, '2012-11-11', 1, '1', 1);
INSERT INTO `modulo` VALUES (3, 'c', 4, '2012-11-11', 22222, '2', 1);
INSERT INTO `modulo` VALUES (4, 'd', 1, '2012-11-11', 2, '2', 1);
INSERT INTO `modulo` VALUES (5, 'r', 2, '2012-11-12', 2, '2', 1);
INSERT INTO `modulo` VALUES (6, 'This is miy test', 9, '2012-11-12', 12345, '1', 2);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

-- 
-- Volcar la base de datos para la tabla `presupuesto`
-- 

INSERT INTO `presupuesto` VALUES (26, '2012-08-18', 96578);
INSERT INTO `presupuesto` VALUES (25, '2012-08-17', 34678);
INSERT INTO `presupuesto` VALUES (24, '2012-08-10', 3459);

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
  `participantes` int(11) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `numero_convenio` int(11) default NULL,
  PRIMARY KEY  (`id_programa`),
  UNIQUE KEY `cohorte_programa` (`cohorte_programa`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- 
-- Volcar la base de datos para la tabla `programa`
-- 

INSERT INTO `programa` VALUES (1, '1', 'Test Programita', '2012-08-26', 1000, 3, 'No Vendido', 0);
INSERT INTO `programa` VALUES (2, '2', 'test update', '2012-11-13', 123, 3, 'Vendido', 0);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

-- 
-- Volcar la base de datos para la tabla `rubro_presupuestal`
-- 

INSERT INTO `rubro_presupuestal` VALUES (21, 'Otros materiales', 1, 100, 26);
INSERT INTO `rubro_presupuestal` VALUES (18, 'Capcitacion', 2, 2500000, 24);
INSERT INTO `rubro_presupuestal` VALUES (19, 'Transporte Nacional', 1, 100, 25);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

-- 
-- Volcar la base de datos para la tabla `usuarios_login`
-- 

INSERT INTO `usuarios_login` VALUES (1, 'admin', '21232f297a57a5a743894a0e4a801fc3', 1);
INSERT INTO `usuarios_login` VALUES (2, 'profesoral', '899e093702f50c1e7b7db55b8b381c2e', 2);
INSERT INTO `usuarios_login` VALUES (3, 'convenios', '161622ea88a89ed5f7ab6a44f00c0a62', 3);

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

-- 
-- Volcar la base de datos para la tabla `variaciones_tiempo`
-- 

INSERT INTO `variaciones_tiempo` VALUES (1, '2012-08-17', 'Suspension', 3, 3459);
INSERT INTO `variaciones_tiempo` VALUES (2, '2012-08-31', 'Suspension', 7, 96578);
INSERT INTO `variaciones_tiempo` VALUES (3, '2012-08-31', 'Adicion de Tiempo', 7, 96578);
INSERT INTO `variaciones_tiempo` VALUES (4, '2012-08-23', 'Reinicio', 1, 3459);
INSERT INTO `variaciones_tiempo` VALUES (5, '2012-08-23', 'Reinicio', 1, 3459);
INSERT INTO `variaciones_tiempo` VALUES (6, '2012-08-23', 'Suspension', 1, 3459);
INSERT INTO `variaciones_tiempo` VALUES (7, '2012-08-23', 'Adicion de Tiempo', 1, 3459);
INSERT INTO `variaciones_tiempo` VALUES (8, '2012-08-23', 'Reinicio', 1, 3459);

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

