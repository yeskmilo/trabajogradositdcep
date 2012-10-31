-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 11-02-2012 a las 15:03:39
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdsitd_cep`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actas`
--

CREATE TABLE IF NOT EXISTS `actas` (
  `id_actas` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_acta` date NOT NULL,
  `asunto_acta` varchar(300) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_actas`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `aportes_convenio`
--

CREATE TABLE IF NOT EXISTS `aportes_convenio` (
  `id_aporte` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_desembolso` date NOT NULL,
  `monto_aporte` double NOT NULL,
  `NIT_entidad` varchar(30) NOT NULL,
  PRIMARY KEY (`id_aporte`),
  KEY `NIT_entidad` (`NIT_entidad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion_honorarios`
--

CREATE TABLE IF NOT EXISTS `asignacion_honorarios` (
  `id_honorarios` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_pago` date NOT NULL,
  `monto_honorarios` double NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY (`id_honorarios`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion_tiquete`
--

CREATE TABLE IF NOT EXISTS `asignacion_tiquete` (
  `id_tiquete` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_solicitud` date NOT NULL,
  `fecha_salida` date NOT NULL,
  `fecha_regreso` date NOT NULL,
  `ciudad_origen` varchar(100) NOT NULL,
  `ciudad_destino` varchar(100) NOT NULL,
  `aerolinea` varchar(100) NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY (`id_tiquete`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignacion_viaticos`
--

CREATE TABLE IF NOT EXISTS `asignacion_viaticos` (
  `id_viaticos` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_pago` date NOT NULL,
  `monto_viaticos` double NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY (`id_viaticos`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias_login`
--

CREATE TABLE IF NOT EXISTS `categorias_login` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(200) NOT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `categorias_login`
--

INSERT INTO `categorias_login` (`id_categoria`, `nombre_categoria`) VALUES
(1, 'SUPER ADMINISTRADOR'),
(2, 'GESTION PROFESORAL - ESCALAFON'),
(3, 'GESTION CONVENIOS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conferencista`
--

CREATE TABLE IF NOT EXISTS `conferencista` (
  `id_conferencista` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_conferencista` int(20) NOT NULL,
  `nombres_conferencista` varchar(300) NOT NULL,
  `apellidos_conferencista` varchar(300) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero_conferencista` varchar(10) NOT NULL,
  `direccion_conferencista` varchar(300) NOT NULL,
  `telefono_conferencista` varchar(12) DEFAULT NULL,
  `celular_conferencista` varchar(12) DEFAULT NULL,
  `correo_electronico_conferencista` varchar(300) DEFAULT NULL,
  `numero_cuenta_conferencista` varchar(60) NOT NULL,
  `tipo_cuenta_conferencista` varchar(40) NOT NULL,
  `banco_conferencista` varchar(300) NOT NULL,
  `estado_conferencista` varchar(300) NOT NULL,
  PRIMARY KEY (`cedula_conferencista`),
  UNIQUE KEY `id_conferencista` (`id_conferencista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `convenio`
--

CREATE TABLE IF NOT EXISTS `convenio` (
  `id_convenio` int(11) NOT NULL AUTO_INCREMENT,
  `numero_convenio` int(11) NOT NULL DEFAULT '0',
  `fecha_inicio_convenio` date NOT NULL,
  `duracion_convenio_meses` int(11) NOT NULL,
  `saldos_sociales` varchar(1000) DEFAULT NULL,
  `saldos_pedagogicos` varchar(1000) DEFAULT NULL,
  `resumen_convenio` varchar(2000) DEFAULT NULL,
  `objeto_convenio` varchar(2000) NOT NULL,
  `estado_convenio` varchar(20) NOT NULL,
  PRIMARY KEY (`numero_convenio`),
  UNIQUE KEY `id_convenio` (`id_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `credito_docente`
--

CREATE TABLE IF NOT EXISTS `credito_docente` (
  `id_credito_docente` int(11) NOT NULL AUTO_INCREMENT,
  `id_credito` int(11) NOT NULL,
  `cedula_docente` int(20) NOT NULL,
  PRIMARY KEY (`id_credito_docente`),
  KEY `id_credito` (`id_credito`),
  KEY `cedula_docente` (`cedula_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `credito_escalafon`
--

CREATE TABLE IF NOT EXISTS `credito_escalafon` (
  `ID_CREDITO` int(11) NOT NULL AUTO_INCREMENT,
  `NUMERO_CREDITOS` int(11) NOT NULL,
  `FECHA_INICIO` date NOT NULL,
  `FECHA_FINAL` date NOT NULL,
  `NUMERO_HORAS` int(11) NOT NULL,
  `RESOLUCION` varchar(100) NOT NULL,
  `NOMBRE_CREDITO` varchar(300) NOT NULL,
  PRIMARY KEY (`ID_CREDITO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_convenio`
--

CREATE TABLE IF NOT EXISTS `detalle_convenio` (
  `id_detalle` int(11) NOT NULL AUTO_INCREMENT,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_detalle`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente_escalafon`
--

CREATE TABLE IF NOT EXISTS `docente_escalafon` (
  `id_docente` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_docente` int(20) NOT NULL,
  `nombres_docente` varchar(300) NOT NULL,
  `apellidos_docente` varchar(300) NOT NULL,
  `municipio_docente` varchar(300) NOT NULL,
  `genero_docente` varchar(10) NOT NULL,
  `telefono_docente` varchar(12) NOT NULL,
  PRIMARY KEY (`cedula_docente`),
  UNIQUE KEY `id_docente` (`id_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejecucion_presupuesto`
--

CREATE TABLE IF NOT EXISTS `ejecucion_presupuesto` (
  `id_ejecucion` int(11) NOT NULL AUTO_INCREMENT,
  `monto_ejecutado` double DEFAULT NULL,
  `fecha_ejecución` date NOT NULL,
  `descripcion_ejecucion` varchar(300) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_ejecucion`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emision_constancia`
--

CREATE TABLE IF NOT EXISTS `emision_constancia` (
  `id_constancia` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_persona` int(20) NOT NULL,
  `id_credito_docente` int(11) NOT NULL,
  `fecha_emision` date NOT NULL,
  PRIMARY KEY (`id_constancia`),
  KEY `cedula_persona` (`cedula_persona`),
  KEY `id_credito_docente` (`id_credito_docente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entidad_convenio`
--

CREATE TABLE IF NOT EXISTS `entidad_convenio` (
  `id_entidad` int(11) NOT NULL AUTO_INCREMENT,
  `NIT_entidad` varchar(30) NOT NULL,
  `nombre_entidad` varchar(150) NOT NULL,
  `descripcion_entidad` varchar(200) NOT NULL,
  `id_detalle` int(11) NOT NULL,
  PRIMARY KEY (`NIT_entidad`),
  UNIQUE KEY `id_entidad` (`id_entidad`),
  KEY `id_detalle` (`id_detalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE IF NOT EXISTS `modulo` (
  `id_modulo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_modulo` varchar(200) NOT NULL,
  `duracion_modulo_horas` int(11) NOT NULL,
  `fecha_inicio_modulo` date NOT NULL,
  `valor_hora` double NOT NULL,
  `cohorte_programa` varchar(20) NOT NULL,
  `cedula_conferencista` int(20) NOT NULL,
  PRIMARY KEY (`id_modulo`),
  KEY `cohorte_programa` (`cohorte_programa`),
  KEY `cedula_conferencista` (`cedula_conferencista`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_solicitante`
--

CREATE TABLE IF NOT EXISTS `persona_solicitante` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_persona` int(20) NOT NULL,
  `nombres_persona` varchar(300) NOT NULL,
  `apellidos_persona` varchar(300) NOT NULL,
  `telefono-persona` varchar(12) NOT NULL,
  `celular_persona` varchar(12) NOT NULL,
  PRIMARY KEY (`cedula_persona`),
  UNIQUE KEY `id_persona` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presupuesto`
--

CREATE TABLE IF NOT EXISTS `presupuesto` (
  `id_presupuesto` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_elaboracion` date NOT NULL,
  `aporte_universidad` double NOT NULL,
  `aporte_entidad` double NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_presupuesto`),
  UNIQUE KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `programa`
--

CREATE TABLE IF NOT EXISTS `programa` (
  `id_programa` int(11) NOT NULL AUTO_INCREMENT,
  `cohorte_programa` varchar(20) NOT NULL,
  `nombre_programa` varchar(200) NOT NULL,
  `fecha_inicio_programa` date NOT NULL,
  `valor` double NOT NULL,
  `numero_convenio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_programa`),
  UNIQUE KEY `cohorte_programa` (`cohorte_programa`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rubro_presupuestal`
--

CREATE TABLE IF NOT EXISTS `rubro_presupuestal` (
  `id_rubro` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion_rubro` varchar(300) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `valor_unitario` double NOT NULL,
  `aporte_entidad` double NOT NULL,
  `aporte_universidad` double NOT NULL,
  `id_presupuesto` int(11) NOT NULL,
  PRIMARY KEY (`id_rubro`),
  KEY `id_presupuesto` (`id_presupuesto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios_login`
--

CREATE TABLE IF NOT EXISTS `usuarios_login` (
  `id_usuarios` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(200) NOT NULL,
  `contrasena` varchar(200) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  PRIMARY KEY (`id_usuarios`),
  UNIQUE KEY `nombre_usuario` (`nombre_usuario`),
  UNIQUE KEY `nombre_usuario_2` (`nombre_usuario`),
  KEY `id_categoria` (`id_categoria`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios_login`
--

INSERT INTO `usuarios_login` (`id_usuarios`, `nombre_usuario`, `contrasena`, `id_categoria`) VALUES
(1, 'superadminSITDCEP', 'e6ed124827581a2dcbc22c30ab2e2fab', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `variaciones_tiempo`
--

CREATE TABLE IF NOT EXISTS `variaciones_tiempo` (
  `id_variacion` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_variacion` date NOT NULL,
  `descripcion_variacion` varchar(300) NOT NULL,
  `duracion_variacion_dias` int(11) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_variacion`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vinculado_convenio`
--

CREATE TABLE IF NOT EXISTS `vinculado_convenio` (
  `id_vinculado` int(11) NOT NULL AUTO_INCREMENT,
  `NIT_vinculado` varchar(30) DEFAULT NULL,
  `cedula_vinculado` int(20) DEFAULT NULL,
  `asignacion_salarial` double DEFAULT NULL,
  `fecha_vinculacion` date NOT NULL,
  `duracion_vinculacion_dias` int(11) NOT NULL,
  `nombres_vinculado` varchar(100) DEFAULT NULL,
  `apellidos_vinculado` varchar(100) DEFAULT NULL,
  `correo_vinculado` varchar(100) DEFAULT NULL,
  `telefono_vinculado` varchar(20) DEFAULT NULL,
  `genero_vinculado` varchar(20) DEFAULT NULL,
  `estado_vinculado` varchar(10) NOT NULL,
  `numero_convenio` int(11) NOT NULL,
  PRIMARY KEY (`id_vinculado`),
  UNIQUE KEY `NIT_vinculado` (`NIT_vinculado`),
  UNIQUE KEY `cedula_vinculado` (`cedula_vinculado`),
  KEY `numero_convenio` (`numero_convenio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actas`
--
ALTER TABLE `actas`
  ADD CONSTRAINT `actas_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `aportes_convenio`
--
ALTER TABLE `aportes_convenio`
  ADD CONSTRAINT `aportes_convenio_ibfk_1` FOREIGN KEY (`NIT_entidad`) REFERENCES `entidad_convenio` (`NIT_entidad`);

--
-- Filtros para la tabla `asignacion_honorarios`
--
ALTER TABLE `asignacion_honorarios`
  ADD CONSTRAINT `asignacion_honorarios_ibfk_1` FOREIGN KEY (`cedula_conferencista`) REFERENCES `conferencista` (`cedula_conferencista`);

--
-- Filtros para la tabla `asignacion_tiquete`
--
ALTER TABLE `asignacion_tiquete`
  ADD CONSTRAINT `asignacion_tiquete_ibfk_1` FOREIGN KEY (`cedula_conferencista`) REFERENCES `conferencista` (`cedula_conferencista`);

--
-- Filtros para la tabla `asignacion_viaticos`
--
ALTER TABLE `asignacion_viaticos`
  ADD CONSTRAINT `asignacion_viaticos_ibfk_1` FOREIGN KEY (`cedula_conferencista`) REFERENCES `conferencista` (`cedula_conferencista`);

--
-- Filtros para la tabla `credito_docente`
--
ALTER TABLE `credito_docente`
  ADD CONSTRAINT `credito_docente_ibfk_1` FOREIGN KEY (`id_credito`) REFERENCES `credito_escalafon` (`ID_CREDITO`),
  ADD CONSTRAINT `credito_docente_ibfk_2` FOREIGN KEY (`cedula_docente`) REFERENCES `docente_escalafon` (`cedula_docente`);

--
-- Filtros para la tabla `detalle_convenio`
--
ALTER TABLE `detalle_convenio`
  ADD CONSTRAINT `detalle_convenio_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `ejecucion_presupuesto`
--
ALTER TABLE `ejecucion_presupuesto`
  ADD CONSTRAINT `ejecucion_presupuesto_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `emision_constancia`
--
ALTER TABLE `emision_constancia`
  ADD CONSTRAINT `emision_constancia_ibfk_1` FOREIGN KEY (`cedula_persona`) REFERENCES `persona_solicitante` (`cedula_persona`),
  ADD CONSTRAINT `emision_constancia_ibfk_2` FOREIGN KEY (`id_credito_docente`) REFERENCES `credito_docente` (`id_credito_docente`);

--
-- Filtros para la tabla `entidad_convenio`
--
ALTER TABLE `entidad_convenio`
  ADD CONSTRAINT `entidad_convenio_ibfk_1` FOREIGN KEY (`id_detalle`) REFERENCES `detalle_convenio` (`id_detalle`);

--
-- Filtros para la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD CONSTRAINT `modulo_ibfk_1` FOREIGN KEY (`cohorte_programa`) REFERENCES `programa` (`cohorte_programa`),
  ADD CONSTRAINT `modulo_ibfk_2` FOREIGN KEY (`cedula_conferencista`) REFERENCES `conferencista` (`cedula_conferencista`);

--
-- Filtros para la tabla `presupuesto`
--
ALTER TABLE `presupuesto`
  ADD CONSTRAINT `presupuesto_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `programa`
--
ALTER TABLE `programa`
  ADD CONSTRAINT `programa_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `rubro_presupuestal`
--
ALTER TABLE `rubro_presupuestal`
  ADD CONSTRAINT `rubro_presupuestal_ibfk_1` FOREIGN KEY (`id_presupuesto`) REFERENCES `presupuesto` (`id_presupuesto`);

--
-- Filtros para la tabla `usuarios_login`
--
ALTER TABLE `usuarios_login`
  ADD CONSTRAINT `usuarios_login_ibfk_1` FOREIGN KEY (`id_categoria`) REFERENCES `categorias_login` (`id_categoria`);

--
-- Filtros para la tabla `variaciones_tiempo`
--
ALTER TABLE `variaciones_tiempo`
  ADD CONSTRAINT `variaciones_tiempo_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

--
-- Filtros para la tabla `vinculado_convenio`
--
ALTER TABLE `vinculado_convenio`
  ADD CONSTRAINT `vinculado_convenio_ibfk_1` FOREIGN KEY (`numero_convenio`) REFERENCES `convenio` (`numero_convenio`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
