-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2023 at 01:20 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `Doctor ID` int(11) NOT NULL,
  `Full Name` varchar(45) NOT NULL,
  `Email ID` varchar(45) NOT NULL,
  `Contact no` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Qualification` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Blood Group` varchar(45) NOT NULL,
  `Date of Joining` varchar(45) NOT NULL,
  `Availability` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`Doctor ID`, `Full Name`, `Email ID`, `Contact no`, `Address`, `Qualification`, `Gender`, `Blood Group`, `Date of Joining`, `Availability`) VALUES
(5678, 'Ali Shehzad', 'alishehzad@gmail.com', '0332', 'ABC', 'MBBs', 'Male', 'O-', '23-8-2018', 'thurs 7-8');

-- --------------------------------------------------------

--
-- Table structure for table `nurse`
--

CREATE TABLE `nurse` (
  `Nurse ID` int(11) NOT NULL,
  `Full Name` varchar(45) NOT NULL,
  `Email ID` varchar(45) NOT NULL,
  `Contact no` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `Qualification` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Blood Group` varchar(45) NOT NULL,
  `Date of Joining` varchar(45) NOT NULL,
  `Schedule` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `p`
--

CREATE TABLE `p` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `f_name` varchar(30) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `contact` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `days` int(11) DEFAULT NULL,
  `blood` varchar(9) DEFAULT NULL,
  `instructions` varchar(90) DEFAULT NULL,
  `room` int(11) DEFAULT NULL,
  `cost` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `p`
--

INSERT INTO `p` (`id`, `name`, `f_name`, `address`, `contact`, `age`, `gender`, `days`, `blood`, `instructions`, `room`, `cost`) VALUES
(1, 'noman', 'khan', 'rawalpindi', 23849, 45, 'Male', 2, 'O-', 'nothing', 2, 3000),
(2, 'asif', 'amjad', 'islamabad', 972228876, 46, 'Male', 1, 'A+', 'its fine', 5, 5000),
(3, 'rishi', 'kapoor', 'lahore', 82827, 27, 'Female', 3, 'B+', 'very fine', 6, 21000);

-- --------------------------------------------------------

--
-- Table structure for table `pharmacy`
--

CREATE TABLE `pharmacy` (
  `medid` int(11) NOT NULL,
  `medname` varchar(50) NOT NULL,
  `medprice` int(20) NOT NULL,
  `medquantity` int(50) NOT NULL,
  `medmfgdate` varchar(11) NOT NULL,
  `medexpdate` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pharmacy`
--

INSERT INTO `pharmacy` (`medid`, `medname`, `medprice`, `medquantity`, `medmfgdate`, `medexpdate`) VALUES
(1, 'Diamox (Acetazolamide)', 200, 20, '23/5/23', '23/4/24'),
(2, 'Ilube (Acetylcysteine)', 100, 53, '23/5/23', '23/12/23'),
(3, 'Aciclovir Eye Ointment', 150, 10, '12/5/23', '12/9/23'),
(4, 'Lopidine(Apraclonidine eye drops)', 100, 50, '22/5/23', '22/11/23'),
(5, 'Yellox(Bromfenac eye drops)', 100, 50, '22/5/23', '22/11/23');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacybilling`
--

CREATE TABLE `pharmacybilling` (
  `record` int(11) NOT NULL,
  `medname` varchar(50) NOT NULL,
  `dateofpurchase` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `medprice` varchar(20) NOT NULL,
  `buyername` varchar(50) NOT NULL,
  `buyerno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pharmacybilling`
--

INSERT INTO `pharmacybilling` (`record`, `medname`, `dateofpurchase`, `medprice`, `buyername`, `buyerno`) VALUES
(2, 'Ilube (Acetylcysteine)', '2023-05-21 22:22:50.727003', '100', 'xyz', '1234'),
(10, 'Ilube (Acetylcysteine)', '2023-05-23 23:15:17.570684', '100', 'as', '43'),
(11, 'Ilube (Acetylcysteine)', '2023-05-29 12:45:25.976330', '100', 'zainab', '321'),
(12, 'Diamox (Acetazolamide)', '2023-06-02 11:29:03.280850', '200', 'zainab', '321');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomno` varchar(45) NOT NULL,
  `cost` double NOT NULL,
  `availability` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomno`, `cost`, `availability`) VALUES
('1', 2000, 'no'),
('2', 1500, 'no'),
('3', 3000, 'no'),
('5', 5000, 'yes'),
('6', 7000, 'no'),
('7', 1500, 'yes');

-- --------------------------------------------------------

--
-- Table structure for table `roombilling`
--

CREATE TABLE `roombilling` (
  `pname` varchar(50) NOT NULL,
  `cost` double NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roombilling`
--

INSERT INTO `roombilling` (`pname`, `cost`, `pid`) VALUES
('noman', 6700.9, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`Doctor ID`);

--
-- Indexes for table `nurse`
--
ALTER TABLE `nurse`
  ADD PRIMARY KEY (`Nurse ID`);

--
-- Indexes for table `p`
--
ALTER TABLE `p`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pharmacy`
--
ALTER TABLE `pharmacy`
  ADD PRIMARY KEY (`medid`);

--
-- Indexes for table `pharmacybilling`
--
ALTER TABLE `pharmacybilling`
  ADD PRIMARY KEY (`record`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `roombilling`
--
ALTER TABLE `roombilling`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pharmacy`
--
ALTER TABLE `pharmacy`
  MODIFY `medid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pharmacybilling`
--
ALTER TABLE `pharmacybilling`
  MODIFY `record` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `roombilling`
--
ALTER TABLE `roombilling`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
