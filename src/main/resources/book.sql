/*
 Navicat MySQL Data Transfer

 Source Server         : passJava
 Source Server Type    : MySQL
 Source Server Version : 80300
 Source Host           : localhost:3306
 Source Schema         : books

 Target Server Type    : MySQL
 Target Server Version : 80300
 File Encoding         : 65001

 Date: 07/06/2024 17:05:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '编码',
  `author` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '作者',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '题目',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '内容',
  `publication_date` date NULL DEFAULT NULL COMMENT '出版时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_title`(`title`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (0000000001, '0001221', '汪涵为', '中国书法艺术', '中国书法是汉字的书写艺术，也是东亚书法的代表。所以以文字为基准的角度看，中国书法是一种很独特的视觉艺术，但是这种独特性并不妨碍不认识中文字体的人欣赏中国书法。汉字是中国书法中的重要因素，因为中国书法是在中国文化里产生、发展起来的，而文字是中国文化的基本要素之一', '1994-06-16');
INSERT INTO `book` VALUES (0000000002, '0124612', '赵小棠', '中国地理汇编', '自古以来秦岭和淮河', '1996-05-15');
INSERT INTO `book` VALUES (0000000003, '545566', '李思维', '大英博物馆介绍', '英国', '1997-05-15');
INSERT INTO `book` VALUES (0000000004, '5455445', '赵子琪', '外国人在中国旅游', '英国', '1997-05-15');
INSERT INTO `book` VALUES (0000000569, '545566655', '周树让', '中国美术', '英国西欧发达国家', '1997-05-15');
INSERT INTO `book` VALUES (0000000997, '545566655', '何为', '中国交通安全', '英国西欧发达国家', '2023-05-15');
INSERT INTO `book` VALUES (0000000999, '545566655', '何为', '中国交通安全', '英国西欧发达国家', '2023-05-15');
INSERT INTO `book` VALUES (0000010001, '545566655', '何为', '中国福利彩票', '彩票', '2023-05-20');
INSERT INTO `book` VALUES (0000010002, '545566655', 'Linus', 'Java虚拟机', '虚拟机分区', '2023-05-20');

SET FOREIGN_KEY_CHECKS = 1;
