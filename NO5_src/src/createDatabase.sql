drop table if exists users;
create table users(
  id int auto_increment,
  username varchar(50),
  password varchar(50) not null ,
  account varchar(50) not null unique ,
  primary key (id)
)ENGINE=InnoDB AUTO_INCREMENT=1234535 DEFAULT CHARSET=utf8;

drop table if exists  `costumes`;
CREATE TABLE `costumes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `cover` varchar(128) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `likes` int(11) DEFAULT '0',
  `intro` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1234455 DEFAULT CHARSET=utf8;

drop table if exists roles;
CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `cover` varchar(128) DEFAULT NULL,
  `intro` varchar(256) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=221324 DEFAULT CHARSET=utf8;

/*user_costume*/
drop table if exists user_costume;
create table user_costume(
    user_id int(11),
    costume_id int(11),
    foreign key (user_id) references users(id),
    foreign key (costume_id) references costumes(id),
    primary key (user_id,costume_id)
);