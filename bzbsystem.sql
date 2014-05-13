/*
Navicat MySQL Data Transfer

Source Server         : mysql-win
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : bzbsystem

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2014-05-13 23:43:24
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

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
INSERT INTO `user` VALUES ('10', null, null, 'sf', null);
INSERT INTO `user` VALUES ('11', null, null, 'dfh', null);
INSERT INTO `user` VALUES ('12', null, null, 'asd', null);
INSERT INTO `user` VALUES ('13', null, null, 'dgsd', null);
INSERT INTO `user` VALUES ('14', null, null, 'asdasd', null);
INSERT INTO `user` VALUES ('15', null, null, 'asd', null);
INSERT INTO `user` VALUES ('16', null, null, 'asd', null);

-- ----------------------------
-- Table structure for yusuan_jichushuju
-- ----------------------------
DROP TABLE IF EXISTS `yusuan_jichushuju`;
CREATE TABLE `yusuan_jichushuju` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `huShu` int(6) DEFAULT NULL COMMENT '户数',
  `renKou` int(6) DEFAULT NULL,
  `zhaiDiJiMianJi` float(255,0) DEFAULT NULL,
  `yiErCengYiJian` float(255,0) DEFAULT NULL,
  `yiErCengWeiJian` float(255,0) DEFAULT NULL,
  `sanCengJiYiShang` float(255,0) DEFAULT NULL,
  `banGongYongFang` float(255,0) DEFAULT NULL,
  `chenTaoZhuZhai` float(255,0) DEFAULT NULL,
  `zhuanMuJieGou` float(255,0) DEFAULT NULL,
  `jianYiFang` float(255,0) DEFAULT NULL,
  `jianYiPeng` float(255,0) DEFAULT NULL,
  `diXiaShi` float(255,0) DEFAULT NULL,
  `gangJieGou` float(255,0) DEFAULT NULL,
  `shengChanYongFang` float(255,0) DEFAULT NULL,
  `weiQiang` float(255,0) DEFAULT NULL,
  `menLou` float(255,0) DEFAULT NULL,
  `shuiNiDiPing` float(255,0) DEFAULT NULL,
  `zhuanDiPing` float(255,0) DEFAULT NULL,
  `shuMu` float(255,0) DEFAULT NULL,
  `dianHua` float(255,0) DEFAULT NULL,
  `kuanDai` float(255,0) DEFAULT NULL,
  `youXianDianShi` float(255,0) DEFAULT NULL,
  `zhaoQiTianRanQi` float(255,0) DEFAULT NULL,
  `shuiChi` float(255,0) DEFAULT NULL,
  `sanXiangDian` float(255,0) DEFAULT NULL,
  `kongTiao` float(255,0) DEFAULT NULL,
  `yaJing` float(255,0) DEFAULT NULL,
  `bangJing` float(255,0) DEFAULT NULL,
  `wuTaJing` float(255,0) DEFAULT NULL,
  `jiJing` float(255,0) DEFAULT NULL,
  `muDiBan` float(255,0) DEFAULT NULL,
  `diBanZhuan` float(255,0) DEFAULT NULL,
  `diaoDing` float(255,0) DEFAULT NULL,
  `menChuangTao` float(255,0) DEFAULT NULL,
  `zuoBian` float(255,0) DEFAULT NULL,
  `yuPen` float(255,0) DEFAULT NULL,
  `dunBian` float(255,0) DEFAULT NULL,
  `mianPen` float(255,0) DEFAULT NULL,
  `ciZhuan` float(255,0) DEFAULT NULL,
  `muGeDuan` float(255,0) DEFAULT NULL,
  `lvHeJinGeDuan` float(255,0) DEFAULT NULL,
  `muQiangQun` float(255,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yusuan_jichushuju
-- ----------------------------
INSERT INTO `yusuan_jichushuju` VALUES ('1', 'sdgsdg', 'sdg', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '12', null);
