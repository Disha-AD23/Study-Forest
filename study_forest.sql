CREATE DATABASE study_forest;
USE study_forest;

CREATE TABLE study_data (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    total_time INT NOT NULL DEFAULT 0,
    tree_count INT NOT NULL DEFAULT 0
);

INSERT INTO study_data (total_time, tree_count) VALUES (0, 0);

