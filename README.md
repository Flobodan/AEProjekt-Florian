## Datenbank
Datenbank muss vorher erstellt werden.
### Create Script:

CREATE TABLE IF NOT EXISTS `lehrer` (
  `LehrerID` int(11) NOT NULL AUTO_INCREMENT,
  `Vorname` varchar(50) NOT NULL DEFAULT '',
  `Nachname` varchar(50) NOT NULL DEFAULT '',
  `Email` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`LehrerID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;
