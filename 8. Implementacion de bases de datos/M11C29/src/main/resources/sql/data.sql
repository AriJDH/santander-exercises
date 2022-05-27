INSERT INTO `showroom`.`role` (`id`, `role_name`) VALUES
(1, "ADMIN"),
(2, "USER"),
(3, "MID");

INSERT INTO `showroom`.`user` (`id`, `password`, `role`, `username`) VALUES
(1, "$2a$10$74nvuQ9VXm./nUf2qo9Ule7buZr7gGlN5.zk0DTC0mLPP/KhkLbeK", "USER", "user"),
(2, "$2a$10$74nvuQ9VXm./nUf2qo9Ule7buZr7gGlN5.zk0DTC0mLPP/KhkLbeK", "ADMIN", "admin"),
(3, "$2a$10$74nvuQ9VXm./nUf2qo9Ule7buZr7gGlN5.zk0DTC0mLPP/KhkLbeK", "MID", "mid");

INSERT INTO `showroom`.`prenda` (`id`, `marca`, `color`, `nombre`, `cantidad`, `precio_venta`, `talle`) VALUES
(1, "nike", "negro", "remera", 3, 1500, "L"),
(2, "legacy", "negro", "pantalon", 4, 2500, "XL"),
(3, "adidas", "blanco", "buzo", 5, 3500, "M");