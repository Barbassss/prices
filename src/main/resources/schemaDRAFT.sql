create table TARIFA(
  	ID BIGINT not null AUTO_INCREMENT,
  	ID_BRAND BIGINT not null,
	START_DATE TIMESTAMP not null, 
	END_DATE TIMESTAMP not null,
	PRICE_LIST int not null,
	PRODUCT_ID BIGINT not null,
	PRIORITY int not null default 0,
	PRICE DECFLOAT not null,
	CURR varchar(3),
  	PRIMARY KEY ( ID )
);