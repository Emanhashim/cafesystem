CREATE DATABASE IF NOT EXISTS `cafesystem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE cafesystem;
-- MySQL dump 10.13  Distrib 5.1.40, for Win32 (ia32)
--
-- Host: 127.0.0.1    Database: cafesystem
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt

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
-- Not dumping tablespaces as no INFORMATION_SCHEMA.FILES table on this server
--

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `Employee_ID` int(11) NOT NULL,
  `Employee_Responsibility` varchar(56) default NULL,
  `First_Name` varchar(40) NOT NULL,
  `Last_Name` varchar(40) NOT NULL,
  `Sex` char(10) NOT NULL default 'Not NULL',
  `DateOfBirth` date default NULL,
  `Salary` double NOT NULL,
  `UserName` varchar(50) default NULL,
  `Password` varchar(200) default NULL,
  `EmpRole` int(11) default NULL,
  PRIMARY KEY  (`Employee_ID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'manager','Abenezer','chalachew','male','2009-09-09',2,'manager','1234',0),(2,'good','Asmamaw','Zelalem','Male','3452-02-02',222,'s','www',1),(3,'control all employee','abebe','Negede','Male','1234-02-02',1234,'abe','123',1),(4,'Manager','Helen','Wagaw','Female','2015-06-17',46546,'gdfg','1234',0),(5,'Manager','Abebe','kebe','Male','2002-06-03',230,'abebeb','12345',0),(6,'WORKER','hailu','yad','male','1995-08-04',300,'worker','1234',2),(7,'Manager','Kabtamu','Mekonnen','Male','2015-06-18',4545,'Kabta','kabta',0),(8,'Ticker','Nathan','Tedla','Male','2015-06-24',5654,'NAt','awe',1),(9,'Ticker','Teferi','Tulu','Male','2015-06-17',789,'re','re',1),(10,'Manager','Wolde','Worku','Male','2015-06-09',234,'eer','jPaeersswordField1',0),(11,'Ticker','zelalem','Biru','Male','1993-01-15',2020,'zola','zola',1),(12,'Ticker','dat','lpp','male','1900-09-08',20454,'ticker','1234',1),(14,'Manager','Zewdu','Asmare','Male','1991-06-13',5241,'','jPasswordField1',0);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food` (
  `Food_ID` int(11) NOT NULL,
  `Food_Name` char(20) NOT NULL,
  `Food_Measure` char(19) NOT NULL,
  `Food_Amount` varchar(30) NOT NULL,
  PRIMARY KEY  (`Food_ID`),
  UNIQUE KEY `Food_ID_UNIQUE` (`Food_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (2,' Ferfer','1',' gmash kilo'),(5,' Enjera','1',' 23'),(7,' Bread','1 Bread',' 750'),(12,'frifr','plate','1'),(23,' BREAD',' FG',' 12'),(34,'Kench','1 Dish','56');
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_mealprogram`
--

DROP TABLE IF EXISTS `food_mealprogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_mealprogram` (
  `FOOD_ID` int(11) NOT NULL,
  `Meal_ProgramCode` int(11) NOT NULL,
  `DateTime` time NOT NULL,
  KEY `FOOD_MealProgram_FOOD_ID_idx` (`FOOD_ID`),
  KEY `FOOD_MealProgram_Meal_ProgramCode_idx` (`Meal_ProgramCode`),
  CONSTRAINT `food_mealprogram_ibfk_1` FOREIGN KEY (`FOOD_ID`) REFERENCES `food` (`Food_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `food_mealprogram_ibfk_2` FOREIGN KEY (`Meal_ProgramCode`) REFERENCES `meal_program` (`meal_programCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_mealprogram`
--

LOCK TABLES `food_mealprogram` WRITE;
/*!40000 ALTER TABLE `food_mealprogram` DISABLE KEYS */;
/*!40000 ALTER TABLE `food_mealprogram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material` (
  `Material_No` int(11) NOT NULL,
  `Material_Name` char(39) NOT NULL,
  `Food_ID` int(11) NOT NULL,
  PRIMARY KEY  (`Material_No`),
  KEY `Food_ID` (`Food_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,'Dish',2),(2,'Trii',4),(3,' Service',1),(4,'plate',3),(24,' TEA',5);
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal_program`
--

DROP TABLE IF EXISTS `meal_program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `meal_program` (
  `meal_programCode` int(11) NOT NULL auto_increment,
  `Meal_Date` date NOT NULL,
  `Meal_Type` char(20) NOT NULL,
  `Meal_Status` varchar(20) NOT NULL,
  `Employee_ID` int(11) default NULL,
  `Meal_Card_ID` int(11) default NULL,
  PRIMARY KEY  (`meal_programCode`,`Meal_Date`),
  KEY `Meal_Program_Employee_ID_idx` (`Employee_ID`),
  KEY `meal_program_Meal_Card_ID_idx` (`Meal_Card_ID`),
  KEY `studmealfk` (`Meal_Card_ID`),
  CONSTRAINT `meal_program_ibfk_1` FOREIGN KEY (`Employee_ID`) REFERENCES `employee` (`Employee_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `studmealfk` FOREIGN KEY (`Meal_Card_ID`) REFERENCES `student` (`Meal_Card_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_program`
--

LOCK TABLES `meal_program` WRITE;
/*!40000 ALTER TABLE `meal_program` DISABLE KEYS */;
INSERT INTO `meal_program` VALUES (1,'2015-06-02',' launch','1',1,1),(1,'2015-06-03',' Dinner','0',1,1),(1,'2015-06-09','BrakFast','0',1,1),(1,'2015-06-19',' Dinner','0',2,1),(11,'2015-06-23','Launch','1',1,1),(12,'1212-12-12','Brakfast','1',NULL,NULL),(12,'2015-06-03','BreakFast','1',4,1),(13,'1212-12-12','Launch','1',NULL,NULL);
/*!40000 ALTER TABLE `meal_program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `First_Name` char(39) NOT NULL,
  `Last_Name` char(39) NOT NULL,
  `Meal_Card_ID` int(11) NOT NULL,
  `Sex` char(30) NOT NULL,
  `Department` char(39) NOT NULL default 'not null',
  `Year` char(39) NOT NULL,
  `dateOfBirth` date NOT NULL,
  PRIMARY KEY  (`student_id`,`Meal_Card_ID`),
  UNIQUE KEY `student_id_UNIQUE` (`student_id`),
  UNIQUE KEY `Meal_Card_ID_UNIQUE` (`Meal_Card_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Hana','Mengestu',1,'female','IT','3rd','2008-09-09'),(2,'Nahome','Berihanu',2,'Male','CS','2nd','1290-02-12'),(3,' Zelalem',' Biru',9,'Male',' CS','2nd','2015-06-11'),(4,' Zola',' Esuye',5,'Male',' Cs','2nd','2015-06-05'),(5,'Kende','Abate',3,'Male','cs','1st','2000-09-05'),(8,'Adene','Lemama',4,'male','Computer','4th','2014-03-12'),(200,' NATHAN',' TEDLA',76,'Male','CS','2nd','2015-06-07');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `totalemploye`
--

DROP TABLE IF EXISTS `totalemploye`;
/*!50001 DROP VIEW IF EXISTS `totalemploye`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `totalemploye` (
  `TotalEmployee` bigint(21)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `totalsalary`
--

DROP TABLE IF EXISTS `totalsalary`;
/*!50001 DROP VIEW IF EXISTS `totalsalary`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `totalsalary` (
  `TotalSalary` double
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `totalstudent`
--

DROP TABLE IF EXISTS `totalstudent`;
/*!50001 DROP VIEW IF EXISTS `totalstudent`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE TABLE `totalstudent` (
  `TotalStudent` bigint(21)
) ENGINE=MyISAM */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `totalemploye`
--

/*!50001 DROP TABLE IF EXISTS `totalemploye`*/;
/*!50001 DROP VIEW IF EXISTS `totalemploye`*/;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `totalemploye` AS select count(`employee`.`Employee_ID`) AS `TotalEmployee` from `employee` */;

--
-- Final view structure for view `totalsalary`
--

/*!50001 DROP TABLE IF EXISTS `totalsalary`*/;
/*!50001 DROP VIEW IF EXISTS `totalsalary`*/;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `totalsalary` AS select sum(`employee`.`Salary`) AS `TotalSalary` from `employee` */;

--
-- Final view structure for view `totalstudent`
--

/*!50001 DROP TABLE IF EXISTS `totalstudent`*/;
/*!50001 DROP VIEW IF EXISTS `totalstudent`*/;
/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `totalstudent` AS select count(`student`.`student_id`) AS `TotalStudent` from `student` */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-10 23:11:26
