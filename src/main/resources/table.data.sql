use amazon;

CREATE TABLE employee 
(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
age INT NOT NULL,
name VARCHAR(225) NOT NULL,
email VARCHAR(225) NOT NULL,
department VARCHAR(225) NOT NULL
);

INSERT INTO employee(age,name,email,department)values(30,"employee1","s@mail.com","IT");
