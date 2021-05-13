CREATE SCHEMA IF NOT EXISTS parking;
SET search_path TO parking;

DROP TABLE IF EXISTS cars CASCADE;
CREATE TABLE cars (
id bigserial,
mark VARCHAR(30) NOT NULL,
car_number VARCHAR(80) NOT NULL UNIQUE,
date DATE not null,
PRIMARY KEY (id)
);


INSERT INTO cars (mark, car_number, date)VALUES
('VOLVO', 'О466ОО177', CURRENT_DATE),
('LADA', 'У879ЕК177', CURRENT_DATE),
('BMW', 'А742МР777', CURRENT_DATE),
('PORSCHE', 'Е001КХ001', CURRENT_DATE),
('VW', 'E456ПР177', CURRENT_DATE);

