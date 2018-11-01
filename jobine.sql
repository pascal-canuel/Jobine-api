-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 01 nov. 2018 à 13:53
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jobine`
--

-- --------------------------------------------------------

--
-- Structure de la table `msg`
--

DROP TABLE IF EXISTS `msg`;
CREATE TABLE IF NOT EXISTS `msg` (
  `idMsg` int(11) NOT NULL AUTO_INCREMENT,
  `contentMsg` text COLLATE utf8_unicode_ci NOT NULL,
  `dateMsg` date NOT NULL,
  `idUser` int(11) NOT NULL,
  `idOffer` int(11) NOT NULL,
  PRIMARY KEY (`idMsg`),
  KEY `idUser` (`idUser`),
  KEY `idOffer` (`idOffer`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `msg`
--

INSERT INTO `msg` (`idMsg`, `contentMsg`, `dateMsg`, `idUser`, `idOffer`) VALUES
(1, 'salut xd je m\'appel bob, même si jsuis mécanicien d\'engin lourd j\'aimerais bien travailler chex nexapp! ', '2018-11-30', 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `offer`
--

DROP TABLE IF EXISTS `offer`;
CREATE TABLE IF NOT EXISTS `offer` (
  `idOffer` int(11) NOT NULL AUTO_INCREMENT,
  `titleOffer` text COLLATE utf8_unicode_ci NOT NULL,
  `dateOffer` date NOT NULL,
  `addressOffer` text COLLATE utf8_unicode_ci NOT NULL,
  `idUser` int(11) NOT NULL,
  PRIMARY KEY (`idOffer`),
  KEY `idUser` (`idUser`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `offer`
--

INSERT INTO `offer` (`idOffer`, `titleOffer`, `dateOffer`, `addressOffer`, `idUser`) VALUES
(1, 'Développeur en react native', '2018-11-29', '1253 rue st-foy', 2);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nameUser` text COLLATE utf8_unicode_ci NOT NULL,
  `pwdUser` text COLLATE utf8_unicode_ci NOT NULL,
  `emailUser` text COLLATE utf8_unicode_ci NOT NULL,
  `dateUser` date NOT NULL,
  `jobUser` text COLLATE utf8_unicode_ci NOT NULL,
  `descriptionUser` text COLLATE utf8_unicode_ci NOT NULL,
  `imgUser` text COLLATE utf8_unicode_ci NOT NULL,
  `idUserType` int(11) NOT NULL,
  PRIMARY KEY (`idUser`),
  KEY `idUserType` (`idUserType`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`idUser`, `nameUser`, `pwdUser`, `emailUser`, `dateUser`, `jobUser`, `descriptionUser`, `imgUser`, `idUserType`) VALUES
(1, 'Bob le barde', 'pourse123', 'bobArchOp@hotmail.com', '2018-11-15', 'mécanicien', 'Je cherche un job pour me faire la piasse, pis jsuis mécanicien lolo xD', 'https://www.paris-normandie.fr/binrepository/1018x573/0c31/1018d511/none/10904/SAVA/image_content_24138609_20180906204030.jpg', 1),
(2, 'Nexapp', 'archOverMacOs', 'nexappMkay@hotmail.com', '2018-11-15', 'développeur react', 'Nous sommes à la recherche du meilleur développeur react native', 'https://pbs.twimg.com/profile_images/779055940662358017/5FsDJotP_400x400.jpg', 2);

-- --------------------------------------------------------

--
-- Structure de la table `usertype`
--

DROP TABLE IF EXISTS `usertype`;
CREATE TABLE IF NOT EXISTS `usertype` (
  `idUserType` int(11) NOT NULL AUTO_INCREMENT,
  `nameUserType` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`idUserType`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table `usertype`
--

INSERT INTO `usertype` (`idUserType`, `nameUserType`) VALUES
(1, 'Client'),
(2, 'Cie'),
(3, 'Admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
