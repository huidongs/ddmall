drop database if exists ddmall;
drop user if exists 'ddmall'@'%';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database ddmall default character set utf8mb4 collate utf8mb4_unicode_ci;
use ddmall;
create user 'ddmall'@'%' identified by 'ddmall123456';
grant all privileges on ddmall.* to 'ddmall'@'%';
flush privileges;