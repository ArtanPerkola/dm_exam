CREATE DATABASE criminalcase;
USE criminalcase;

CREATE TABLE Crime (
    id INT AUTO_INCREMENT PRIMARY KEY,
    crime_type VARCHAR(255) NOT NULL,
    crime_date DATE,
    description TEXT,
    severity VARCHAR(50),
    number_of_incidents INT,
    location VARCHAR(255)
);

CREATE TABLE Defendant (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Indictment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    indictment_date DATE,
    defendant_id INT,
    crime_id INT,
    FOREIGN KEY (defendant_id) REFERENCES Defendant(id),
    FOREIGN KEY (crime_id) REFERENCES Crime(id)
);

CREATE TABLE Multiple (
    id INT AUTO_INCREMENT PRIMARY KEY,
    crime_date DATE,
    description TEXT,
    severity VARCHAR(50),
    number_of_incidents INT,
    location VARCHAR(255)
);

CREATE TABLE Single (
    id INT AUTO_INCREMENT PRIMARY KEY,
    crime_date DATE,
    description TEXT,
    severity VARCHAR(50),
    location VARCHAR(255)
);
