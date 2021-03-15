/*drop database if exists grandes_almacenes_api_rest;
create database grandes_almacenes_api_rest;*/
use grandes_almacenes_api_rest;

--
-- Table structure for table `cajeros`
--

DROP TABLE IF EXISTS `cajeros`;
SET character_set_client = utf8mb4 ;

CREATE TABLE `cajeros` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nom_apels` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
);

--
-- Dumping data for table `cajeros`
--

LOCK TABLES `cajeros` WRITE;
INSERT INTO `cajeros` (`nom_apels`) VALUES ('Barcelona'),('Madrid'),('Valencia'),('Granada'),('Tenerife');
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `productos` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `precio` int NOT NULL,
  PRIMARY KEY (`codigo`)
) ;
--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
INSERT INTO `productos` (`nombre`,`precio`) VALUES ('Papel',12),('Tijeras',4),('Cinta adhesiva',2),('Paraguas',3),('Televisor',504);
UNLOCK TABLES;

--
-- Table structure for table `maquinas_registradoras`
--

DROP TABLE IF EXISTS `maquinas_registradoras`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `maquinas_registradoras` (
  `codigo` int NOT NULL AUTO_INCREMENT,
  `piso` int NOT NULL,
  PRIMARY KEY (`codigo`)
) ;

--
-- Dumping data for table `maquinas_registradoras`
--

LOCK TABLES `maquinas_registradoras` WRITE;
INSERT INTO `maquinas_registradoras` (`piso`) VALUES (1),(2),(1),(4),(3);
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `ventas`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ventas` (
  `id` int NOT NULL auto_increment primary key,
  `cajero` int NOT NULL,
  `maquina` int NOT NULL,
  `producto` int NOT NULL,
  UNIQUE KEY (`cajero`,`maquina`,`producto`),
  CONSTRAINT `cajero_venta_FK` FOREIGN KEY (`cajero`) REFERENCES `cajeros` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `maquina_venta_FK` FOREIGN KEY (`maquina`) REFERENCES `maquinas_registradoras` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_venta_FK` FOREIGN KEY (`producto`) REFERENCES `productos` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
);

--
-- Dumping data for table `venta`
--

LOCK TABLES `ventas` WRITE;
INSERT INTO `ventas` (`cajero`,`maquina`,`producto`) VALUES (1,1,1),(2,2,2),(3,3,3),(1,2,3),(5,4,3);
UNLOCK TABLES;

