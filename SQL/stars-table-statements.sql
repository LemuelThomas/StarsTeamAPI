-- DROP SCHEMA stars_team cascade;

CREATE SCHEMA stars_team AUTHORIZATION postgres;

-- Drop table

-- DROP TABLE stars_team.genre;

CREATE TABLE stars_team.genre (
	genre_id int4 NOT NULL,
	genre_name varchar(30) NULL,
	CONSTRAINT genre_pkey PRIMARY KEY (genre_id)
);

-- Drop table

-- DROP TABLE stars_team."subscription";

CREATE TABLE stars_team."subscription" (
	subscription_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	subcription_name varchar(30) NOT NULL,
	CONSTRAINT subscription_pkey PRIMARY KEY (subscription_id)
);

-- Drop table

-- DROP Table stars_team.video_type;

CREATE TABLE stars_team.video_type (
	type_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	type_name varchar(25) NOT NULL,
	CONSTRAINT video_type_pkey PRIMARY KEY (type_id)
);

-- Drop table

-- DROP TABLE stars_team.stars_account;

CREATE TABLE stars_team.stars_account (
	account_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	email varchar(100) NOT NULL,
	"password" varchar(100) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NULL,
	age date NOT NULL,
	subscription_id int4 NULL,
	CONSTRAINT stars_account_pkey PRIMARY KEY (account_id),
	CONSTRAINT fk_subscription FOREIGN KEY (subscription_id) REFERENCES stars_team."subscription"(subscription_id)
);

-- Drop table

-- DROP TABLE stars_team.account_user;

CREATE TABLE stars_team.account_user (
	user_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	username varchar(50) NOT NULL,
	account_id int4 NULL,
	CONSTRAINT account_user_pkey PRIMARY KEY (user_id),
	CONSTRAINT fk_account FOREIGN KEY (account_id) REFERENCES stars_team.stars_account(account_id)
);

-- Drop table

-- DROP TABLE stars_team.watch_list;

CREATE TABLE stars_team.watch_list (
	watch_list_id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	video_id int4 NOT NULL,
	user_id int4 NOT NULL,
	type_id int4 NOT NULL,
	CONSTRAINT watch_list_pkey PRIMARY KEY (watch_list_id),
	CONSTRAINT fk_genre FOREIGN KEY (type_id) REFERENCES stars_team.video_type(type_id),
	CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES stars_team.account_user(user_id)
);

-- Drop table

-- DROP TABLE stars_team.watch_list_genre;

CREATE TABLE stars_team.watch_list_genre (
	watch_list_id int4 NOT NULL,
	genre_id int4 NOT NULL,
	CONSTRAINT watch_list_genre_pkey PRIMARY KEY (watch_list_id, genre_id)
);

-- Drop table

-- DROP TABLE stars_team.faq;

create table stars_team.faq (
	faq_id int4 NOT NULL GENERATED ALWAYS AS identity,
	question VARCHAR(255) not null,
	answer VARCHAR not null,
	
	constraint faq_pkey primary key (faq_id)
); 
