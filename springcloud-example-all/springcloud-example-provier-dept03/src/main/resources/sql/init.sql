drop database if exists cloud_db03;
create database cloud_db03 character set utf8;
use cloud_db03;

drop table if exists dept;
CREATE TABLE if not exists dept (
	deptno bigint not null primary key auto_increment,
	dname varchar(60),
	db_source varchar(60)
)
COMMENT='部门表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;

-- data

insert into dept(dname,db_source)
values
('开发部',database()),
('人事部',database()),
('财务部',database()),
('市场部',database()),
('运维部',database());