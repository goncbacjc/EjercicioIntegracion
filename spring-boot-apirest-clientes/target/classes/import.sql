INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('gon_cba','$2a$10$d5Q2Hw5S4L0EnRg6VPjlsuHg73kLt0mSjgFwANORcQC.b.tLeHazS',TRUE, 'Gonzalo', 'Lopez','gonza@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$NthnvAPPyNka2i3GOhlUlOw1q9XTGk8d/dHIfaXZmjSdoslXQetUy',TRUE, 'Florencia', 'Ligorria','flor.tres@hotmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);


INSERT INTO `telefonos` (number_phone, city_code, country_code) VALUES ('153901411', '351', '+549');
INSERT INTO `telefonos` (number_phone, city_code, country_code) VALUES ('5432345211', '731', '+1');
INSERT INTO `telefonos` (number_phone, city_code, country_code) VALUES ('334111112', '521', '+588');