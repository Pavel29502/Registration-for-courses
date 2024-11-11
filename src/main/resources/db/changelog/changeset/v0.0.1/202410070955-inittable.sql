-- liquibase formatted sql
-- changeset hatenovski:init

CREATE TABLE IF NOT EXISTS tag
(
    id UUID PRIMARY KEY not null,
    name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE if not exists club
(
    id UUID PRIMARY KEY not null,
    club_name   VARCHAR(255) NOT NULL,
    type        VARCHAR(50)  NOT NULL,
    level       VARCHAR(20)  NOT NULL,
    label       TEXT references tag(name),
    description TEXT,
    content     TEXT,
    length      VARCHAR(20),
    frequency   VARCHAR(30));

CREATE TABLE IF NOT EXISTS club_tag
(
    club_id UUID REFERENCES club(id),
    tag_id UUID REFERENCES tag(id),
    PRIMARY KEY (club_id, tag_id)
);

CREATE TABLE IF NOT EXISTS shedule
(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(), -- Для PostgreSQL используйте gen_random_uuid() или uuid_generate_v4()
    club_id UUID NOT NULL REFERENCES club(id),
    day_of_week  VARCHAR(20) NOT NULL,
    start_time   TIME        NOT NULL,
    end_time     TIME        NOT NULL,
    session_type VARCHAR(50) NOT NULL,
    session_date DATE,
    UNIQUE (club_id, day_of_week, start_time)
);