## 회원 속성 

```mysql
create table user (
	seq bigint not null auto_INCREMENT, 
	name varchar(20) not null,
	nickname varchar(30) not null, 
	password varchar(200) not null,
	tel_num varchar(20) not null,
	email varchar(100) not null,
	gender varchar(2),

primary key (seq), 
constraint unq_user_email unique (email)
);
```





## 주문 속성

```mysql
create table order (
	no bigint not null auto_increment,
	user_no bigint not null,
	order_no varchar(12) not null,
	product_name varchar(100) not null,
  order_date datetime not null default current_timestamp(),
  
  primary key (no),
  constraint fk_order_to_user foreign key (user_no) 
  references users(no) on delete restrict on update restrict
);
```











