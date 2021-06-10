CREATE DATABASE  Airport_pr;

USE  Airport_pr;
CREATE TABLE Pilot
(
id INT  AUTO_INCREMENT,
Firstname VARCHAR (50) NOT NULL,
Lastname VARCHAR (50) NOT NULL,
p_rank VARCHAR (50) NOT NULL,
p_code VARCHAR (50) UNIQUE,
PRIMARY KEY(id)
);

USE  Airport_pr;
CREATE TABLE Plane
(
id INT AUTO_INCREMENT,
brand VARCHAR (50) NOT NULL,
model VARCHAR (50) NOT NULL,
number_passengers INT,
number_plane INT UNIQUE,
PRIMARY KEY(id)
);

USE  Airport_pr;
CREATE TABLE Flight
(
id INT AUTO_INCREMENT,
plane_id INT,
pilot_id INT,
data_flight DATE,
time_flight TIME,
number_flight VARCHAR (50) NOT NULL UNIQUE,
FOREIGN KEY (plane_id) REFERENCES Plane(id),
FOREIGN KEY (pilot_id) REFERENCES Pilot(id),
PRIMARY KEY(id)
);
