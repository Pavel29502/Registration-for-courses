--liquibase formatted sql
--changeset hatenovski:init
CREATE TABLE if not exists registrations (
                               id UUID PRIMARY KEY not null,
                               course_name VARCHAR(255) NOT NULL,
                               date DATE NOT NULL,
                               time TIME NOT NULL,
                               user_name VARCHAR(255) NOT NULL,
                               email VARCHAR(255) NOT NULL,
                               phone VARCHAR(20),
                               telegram_nick VARCHAR(50)
);




