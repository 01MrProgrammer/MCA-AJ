CREATE DATABASE FeedbackDB;
USE FeedbackDB;
CREATE TABLE feedback (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
email VARCHAR(100),
feedback TEXT
);