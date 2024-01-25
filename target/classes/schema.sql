DROP TABLE IF EXISTS CLIENTES;
CREATE TABLE `clientes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `create_at` date,
  `modifie_at` date,
  `last_login` date,
  `token` varchar(100),
  `is_active` boolean,
  PRIMARY KEY (`id`)
	);

DROP TABLE IF EXISTS TELEFONOS;
CREATE TABLE `telefonos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_cliente` bigint NOT NULL,
  `number` varchar(100) NOT NULL,
  `city_code` varchar(255) NOT NULL,
  `country_code` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`)
	);

	DROP TABLE IF EXISTS USUARIOS;
CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `enabled` boolean,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
	);

DROP TABLE IF EXISTS ROLES;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
  );

DROP TABLE IF EXISTS USUARIOS_ROLES;
CREATE TABLE `usuarios_roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `usuario_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`usuario_id`) REFERENCES `clientes` (`id`),
  FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
  );