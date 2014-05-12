/*
Navicat MySQL Data Transfer

Source Server         : mysql-win
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : bzbsystem

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2014-05-13 07:09:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `del` varchar(1) DEFAULT NULL COMMENT '0/1,1:已删',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '1', '张三', '0');
INSERT INTO `user` VALUES ('2', 'ad', '1231', 'adtest', '0');
INSERT INTO `user` VALUES ('3', 'addd', '111', 'addd2', '0');
INSERT INTO `user` VALUES ('4', 'gfh', '1', '1', '0');
INSERT INTO `user` VALUES ('5', 'fghj', '1', '1', '0');
INSERT INTO `user` VALUES ('6', 'gfjfgj', '1', '1', '0');
INSERT INTO `user` VALUES ('7', 'ds', 'aaa', 'as', '0');
INSERT INTO `user` VALUES ('8', 'ds', 'aaa', 'as', '0');
INSERT INTO `user` VALUES ('9', '111', 'a', '111', '0');
