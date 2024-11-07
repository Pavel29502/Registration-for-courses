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