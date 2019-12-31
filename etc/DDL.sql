-- create ssm database
CREATE DATABASE IF NOT EXISTS ssm DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
GRANT ALL PRIVILEGES ON ssm.* TO 'root'@'%' IDENTIFIED BY '123456' WITH GRANT OPTION;
GRANT FILE ON *.* TO 'root'@'%';
FLUSH PRIVILEGES;

-- delete all table
DROP TABLE IF EXISTS `t_clazz`;
DROP TABLE IF EXISTS `t_grade`;
DROP TABLE IF EXISTS `t_menu`;
DROP TABLE IF EXISTS `t_role`;
DROP TABLE IF EXISTS `t_role_menu`;
DROP TABLE IF EXISTS `t_user`;
DROP TABLE IF EXISTS `t_user_role`;

-- create tables start
CREATE TABLE `t_clazz` (
  `id` bigint(11) DEFAULT NULL COMMENT '主键',
  `name` varchar(32) DEFAULT NULL COMMENT '班级名称',
  `desc` varchar(1024) DEFAULT NULL COMMENT '描述-扩展字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_grade` (
  `id` bigint(11) DEFAULT NULL COMMENT '主键',
  `user_id` bigint(11) DEFAULT NULL COMMENT '用户ID',
  `chinese` int(11) DEFAULT NULL COMMENT '语文成绩',
  `math` int(11) DEFAULT NULL COMMENT '数学成绩',
  `english` int(11) DEFAULT NULL COMMENT '英语成绩',
  `physics` int(11) DEFAULT NULL COMMENT '物理成绩',
  `chemistry` int(11) DEFAULT NULL COMMENT '化学成绩',
  `biology` int(11) DEFAULT NULL COMMENT '生物成绩',
  `politics` int(11) DEFAULT NULL COMMENT '政治成绩',
  `history` int(11) DEFAULT NULL COMMENT '历史成绩',
  `geography` int(11) DEFAULT NULL COMMENT '地理成绩'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_menu` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` bigint(11) DEFAULT NULL COMMENT '上级菜单/按钮ID',
  `menu_name` varchar(512) DEFAULT NULL COMMENT '菜单/按钮名称',
  `url` varchar(512) DEFAULT NULL COMMENT '菜单URL',
  `pers` varchar(128) DEFAULT NULL COMMENT '权限标志',
  `icon` varchar(36) DEFAULT NULL COMMENT '图标',
  `type` varchar(64) DEFAULT NULL COMMENT '类型 0菜单 1按钮',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `remark` varchar(64) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_role_menu` (
  `id` bigint(11) DEFAULT NULL COMMENT '主键',
  `role_id` bigint(11) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(11) DEFAULT NULL COMMENT '菜单/按钮ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `name` varchar(64) DEFAULT NULL COMMENT '昵称',
  `clazz_id` bigint(11) DEFAULT NULL COMMENT '班级主键',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(32) DEFAULT NULL COMMENT '手机号',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `last_login_tm` date DEFAULT NULL COMMENT '上次登录时间',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `theme` varchar(32) DEFAULT NULL COMMENT '主题',
  `salt` varchar(64) DEFAULT NULL COMMENT '盐值',
  `awatar` varchar(64) DEFAULT NULL COMMENT '头像',
  `desc` varchar(1024) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_user_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(11) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(11) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;