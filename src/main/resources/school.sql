/*
 Navicat Premium Data Transfer

 Source Server         : readcode
 Source Server Type    : MySQL
 Source Server Version : 80035 (8.0.35-0ubuntu0.22.04.1)
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 80035 (8.0.35-0ubuntu0.22.04.1)
 File Encoding         : 65001

 Date: 16/11/2023 18:50:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (1, '李四', 'jghjghj', 'shanxisheng');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (2, 'zhaosi', 'sdghgh', 'shanxisheng');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (3, 'zhaosiff', 'dsd', 'shanxisheng');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (4, 'wangwu', 'dsd', 'shanxisheng');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (5, 'wangwugg', 'dsdff', 'xianshi');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (6, 'lihai', 'dsdjs12434', 'zhejiang');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (10, '赵云波', 'dsddssd', 'dsd');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (11, '赵波', 'qwew2443', '西安市');
INSERT INTO `user` (`id`, `username`, `password`, `address`) VALUES (12, '赵波波', 'qwew2443', '西安市');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
