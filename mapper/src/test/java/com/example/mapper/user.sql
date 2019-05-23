CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (`name`, `addr`) VALUES ('送达1', '1');
INSERT INTO user (`name`, `addr`) VALUES ('送达2', '2');
INSERT INTO user (`name`, `addr`) VALUES ('送达3', '3');
INSERT INTO user (`name`, `addr`) VALUES ('送达4', '4');
INSERT INTO user (`name`, `addr`) VALUES ('送达5', '5');
