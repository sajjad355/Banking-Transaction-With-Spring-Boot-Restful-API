-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2021 at 10:04 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jobassignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` bigint(20) NOT NULL,
  `transaction_date` datetime NOT NULL,
  `entry_date` datetime NOT NULL,
  `purpose` varchar(255) NOT NULL,
  `comment` varchar(255) NOT NULL,
  `amount` double NOT NULL,
  `account_holder` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `transaction_date`, `entry_date`, `purpose`, `comment`, `amount`, `account_holder`) VALUES
(1, '2022-03-07 00:00:00', '2022-03-07 14:20:00', 'Savings', 'Emergency', 820000, 1),
(2, '2022-03-07 00:00:00', '2022-03-07 00:00:00', 'Withdraw', 'Emergency', 199, 1),
(3, '2022-03-07 00:00:00', '2022-03-07 00:00:00', 'Transafer', 'Emergency', 12000, 1),
(4, '2021-01-14 14:35:00', '2021-01-08 14:35:00', 'Transfer', 'Emergency', 1000, 2),
(5, '2021-07-16 14:36:08', '2021-01-06 14:36:08', 'Transfer', 'Emergency', 2000, 6),
(6, '2021-12-17 14:36:58', '2021-01-06 14:36:58', 'Transfer', 'Emergency', 70000, 6),
(7, '2001-01-02 20:33:00', '2001-01-02 20:33:00', 'Savings', 'Emergency', 120000, 7);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `dob` datetime NOT NULL,
  `sex` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobile_number` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `active` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `name`, `dob`, `sex`, `email`, `mobile_number`, `address`, `active`) VALUES
(1, 'Sajjadur Rahman', '2001-01-02 20:33:00', 'Male', 'sajjadurrahman3434@gmail.com', '01318979019', 'Phulbari', b'1'),
(2, 'Rahil', '2022-03-07 14:20:00', 'Male', 'rahil@gmail.com', '01897673356', 'Dhaka', b'0'),
(3, 'Ifte', '2021-01-08 14:15:00', 'Male', 'Ifte@gmail.com', '01786567782', 'Rajshahi', b'1'),
(4, 'Aunto', '2021-01-08 14:15:00', 'Male', 'aunto@gmail.com', '01986457728', 'Sirajgonj', b'0'),
(5, 'Mim', '2021-01-08 14:15:00', 'male', 'mim@gmail.com', '01893827281', 'Phulbari', b'1'),
(6, 'Raihan', '2021-01-08 14:15:00', 'Male', 'raihan@gmail.com', '01895638573', 'Dinajpur', b'1'),
(7, 'Sizan', '2001-01-02 20:33:00', 'Make', 'sizan@gmail.com', '0199973392', 'Dinajpur', b'0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Test` (`account_holder`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `Test` FOREIGN KEY (`account_holder`) REFERENCES `member` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
