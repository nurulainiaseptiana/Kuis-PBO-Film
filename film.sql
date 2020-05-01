-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2020 at 08:23 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `film`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_film`
--

CREATE TABLE `data_film` (
  `id` int(11) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `tipe` varchar(100) NOT NULL,
  `episode` varchar(50) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `rating` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_film`
--

INSERT INTO `data_film` (`id`, `judul`, `tipe`, `episode`, `genre`, `status`, `rating`) VALUES
(4, 'Dilan 1990', 'Film', '1', 'Romantis', 'Selesai', '2'),
(5, 'ATKKM', 'Film', '1', 'Horor', 'Belum', '3'),
(6, 'Wali Songo', 'Drama', '9', 'Religius', 'Selesai', '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_film`
--
ALTER TABLE `data_film`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_film`
--
ALTER TABLE `data_film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
