Ödev 8:

1.  CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
);
3.  UPDATE employee
    SET name = 'Turk'
    WHERE id = 1;

    UPDATE employee
    SET name = 'Ogun'
    WHERE name = 'Rochester';

    UPDATE employee
    SET name = 'Calis'
    WHERE birthday = '1966-09-21'

    UPDATE employee
    SET email = 'turkoguncalisguven@tc.gov.tr'
    WHERE id = 1;

    UPDATE employee
    SET birthday = '1923-10-29'
    WHERE name = 'Turk';

4.  DELETE FROM employee
    WHERE id = 6;

    DELETE FROM employee
    WHERE name = 'Roman';

    DELETE FROM employee
    WHERE birthday = '1984-10-06';

    DELETE FROM employee
    WHERE email = 'lfonzog@ask.com';

    DELETE FROM employee
    WHERE id IN (18, 23, 37, 45, 50);