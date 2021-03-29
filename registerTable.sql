CREATE DATABASE  IF NOT EXISTS `students`;
USE `students`;
--
--
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL, 
  `student_id` int(11) DEFAULT NULL, 
  `status` varchar(45) DEFAULT NULL, 
  `attending` boolean DEFAULT NULL,
  `activity` varchar(45) DEFAULT NULL,
  #`amount` varchar(45) DEFAULT NULL,
  #`number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `register` VALUES 
(1,'ronny', 333111, 'senior', false, 'football')