-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 21, 2016 at 05:39 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jpa_crud_app`
--
CREATE DATABASE IF NOT EXISTS `jpa_crud_app` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `jpa_crud_app`;

-- --------------------------------------------------------

--
-- Table structure for table `emp_record`
--

CREATE TABLE IF NOT EXISTS `emp_record` (
  `empid` int(11) NOT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_record`
--

INSERT INTO `emp_record` (`empid`, `firstname`, `lastname`, `email`) VALUES
(2, 'Hardik', 'Hirapara', 'hardik@hirapara.com'),
(4, 'Hardik', 'Hirapara', 'hardik@hirapara.com'),
(5, 'Hardik', 'Hirapara', 'hardik@hirapara.com'),
(6, 'Hardik', 'Hirapara', 'hardik@hirapara.com'),
(7, 'Hardik', 'Hirapara', 'hardik@hirapara.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;