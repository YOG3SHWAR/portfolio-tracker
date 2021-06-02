create database portfolio_tracker;
use portfolio_tracker;

create table users (
	u_id int primary key not null auto_increment,
    name varchar(255),
    email varchar(255) unique key
);

create table transictions (
	t_id int primary key not null auto_increment,
    email varchar(255),
	date_time datetime,
    received_qty decimal(10,10),
    received_currency varchar(255),
    send_qty decimal(10,10),
    send_currency varchar(255),
    fee_amount decimal(10,10),
    fee_currency varchar(255),
    remarks varchar(255),
    foreign key (email) references users (email)
);