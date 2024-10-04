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

CREATE TABLE if not exists club (
                                       id UUID PRIMARY KEY not null,
                                       club_name VARCHAR(255) NOT NULL,
                                       type VARCHAR(50) NOT NULL,
                                       level VARCHAR(20) NOT NULL,
                                       label TEXT[],
                                       description TEXT,
                                       length VARCHAR(20),
                                       frequency VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS tag (
                                   id SERIAL PRIMARY KEY,
                                   name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS club_tag (
                                        club_id UUID REFERENCES club(id),
                                        tag_id INTEGER REFERENCES tag(id),
                                        PRIMARY KEY (club_id, tag_id)
);

