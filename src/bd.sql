CREATE TABLE employee(
                         id BIGSERIAL NOT NULL PRIMARY KEY,
                         name VARCHAR(50) NOT NULL,
                         salary INT NOT NULL
);
INSERT INTO employee (name, salary)
VALUES ('Юля', 150000);
CREATE TABLE position(
                         id_position BIGSERIAL NOT NULL PRIMARY KEY,
                         name_position VARCHAR(50) NOT NULL
);

ALTER TABLE employee ADD FOREIGN KEY (id_position) REFERENCES  position(id_position);

CREATE TABLE report(
                       id_report BIGSERIAL NOT NULL PRIMARY KEY,
                       report VARCHAR NOT NULL
)
SELECT * FROM report;