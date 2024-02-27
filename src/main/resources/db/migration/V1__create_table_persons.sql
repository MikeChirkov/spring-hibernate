CREATE TABLE hibernate.PERSONS (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    surname VARCHAR,
    age INT,
    phone_number VARCHAR,
    city_of_living VARCHAR
);

insert into hibernate.PERSONS(id, name, surname, age, phone_number, city_of_living)
values (1, 'Ivan', 'Ivanov', 25, '89123123123', 'Moscow');
insert into hibernate.PERSONS(id, name, surname, age, phone_number, city_of_living)
values (2, 'Petr', 'Petrov', 30, '4234234234', 'Moscow');
insert into hibernate.PERSONS(id, name, surname, age, phone_number, city_of_living)
values (3, 'Boris', 'Borisov', 20, '123456789', 'Perm');
insert into hibernate.PERSONS(id, name, surname, age, phone_number, city_of_living)
values (4, 'Oleg', 'Olegov', 50, '88144238234', 'Ufa');