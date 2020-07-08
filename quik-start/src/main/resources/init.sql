CREATE TABLE IF NOT EXISTS `user`(
    `id` bigint(11) not null,
    `name` varchar(50) default null,
    `department_id` bigint(11) default null,
    `telephone` varchar(50) default null,
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `dept`(
    `id` bigint(11) not null,
    `name` varchar(50) default null,
    `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
);