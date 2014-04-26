CREATE DATABASE  IF NOT EXISTS `adem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `adem`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: adem
-- ------------------------------------------------------
-- Server version	5.6.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kullanici` (
  `kullanici_id` int(11) NOT NULL AUTO_INCREMENT,
  `kullanici_ad` varchar(25) NOT NULL,
  `kullanici_soyad` varchar(25) NOT NULL,
  `cinsiyet` varchar(1) NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `sifre` varchar(20) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kullanici_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES (1,'Mustafa','Yılmaz','E','2014-02-02','3210','mustafa.yilmaz@falan.com'),(2,'Adem','Sen','E','2014-02-02','3210','adem.sen@falan.com'),(3,'Hüsnü','Çoban','E','2014-02-08','456','husnu.coban@falan.com'),(4,'Adem','?engül','E','2013-05-05','adem','masengul@gmail.com'),(5,'faln','filan','E','2013-05-05','adem','masengul@gmail.com');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `musteri`
--

DROP TABLE IF EXISTS `musteri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `musteri` (
  `musteri_id` int(11) NOT NULL AUTO_INCREMENT,
  `musteri_ad` varchar(25) NOT NULL,
  `musteri_soyad` varchar(25) NOT NULL,
  `cinsiyet` varchar(1) NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `tckn` varchar(11) NOT NULL,
  `sifre` varchar(20) NOT NULL,
  PRIMARY KEY (`musteri_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `musteri`
--

LOCK TABLES `musteri` WRITE;
/*!40000 ALTER TABLE `musteri` DISABLE KEYS */;
INSERT INTO `musteri` VALUES (1,'Ali','Demir','E','2014-02-02','11111111111','123456'),(2,'Mustafa','Yılmaz','E','2014-02-02','11111111111','3210');
/*!40000 ALTER TABLE `musteri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repository`
--

DROP TABLE IF EXISTS `repository`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repository` (
  `repoistory_id` int(11) NOT NULL AUTO_INCREMENT,
  `repository_name` varchar(50) NOT NULL,
  `repository_path` varchar(255) NOT NULL,
  PRIMARY KEY (`repoistory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repository`
--

LOCK TABLES `repository` WRITE;
/*!40000 ALTER TABLE `repository` DISABLE KEYS */;
/*!40000 ALTER TABLE `repository` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-04-26 19:05:38
