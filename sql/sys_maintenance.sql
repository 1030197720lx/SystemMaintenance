/*
 Navicat Premium Data Transfer

 Source Server         : lele
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : sys_maintenance

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 26/02/2020 11:41:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for maintenance
-- ----------------------------
DROP TABLE IF EXISTS `maintenance`;
CREATE TABLE `maintenance`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统主键',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '系统编码',
  `simple_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '系统简称',
  `full_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '系统全称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '系统描述',
  `entrance` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '系统入口',
  `order_no` int(11) NULL DEFAULT NULL COMMENT '排序号',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of maintenance
-- ----------------------------
INSERT INTO `maintenance` VALUES (38, 'daddadasd', 'dasda', 'dasdasdas', 'dasdAS', 'local1', 123, 'disabled');
INSERT INTO `maintenance` VALUES (39, 'Test1', 'test1', 'fullTest1', '日报', 'local1', 1, 'enable');
INSERT INTO `maintenance` VALUES (40, 'Test1', 'test1', 'fullTest1', '日报', 'local1', 1, 'enable');
INSERT INTO `maintenance` VALUES (41, 'Test1', 'test1', 'fullTest1', '日报', 'local1', 1, 'enable');
INSERT INTO `maintenance` VALUES (42, 'fsdaf', 'test1', 'fullTest1', '周报', 'local1', 123, 'enable');
INSERT INTO `maintenance` VALUES (43, '', '', '', '', '', NULL, 'enable');

SET FOREIGN_KEY_CHECKS = 1;
