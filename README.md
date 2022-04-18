# SpringBoot-User-and-Employee
View, Add, Edit and Delete 2 entity User and Employee

#Prepare database

Create table user following script:
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
Config datasource in file application.properties
Run
Execute class MyspringcrudApplication
Image
Mange user:
manage

Add user:
add



