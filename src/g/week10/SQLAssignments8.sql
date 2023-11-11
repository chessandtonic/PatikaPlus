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

2.
insert into employee (name, birthday, email) values ('Arney', '1973-01-29', 'adugan0@sciencedaily.com');
insert into employee (name, birthday, email) values ('Rorie', '1974-08-24', 'rboolsen1@admin.ch');
insert into employee (name, birthday, email) values ('Ophelie', '1962-02-15', 'ocrush2@histats.com');
insert into employee (name, birthday, email) values ('Alexandros', '1992-09-14', 'awhitesel3@slideshare.net');
insert into employee (name, birthday, email) values ('Bettina', '1976-05-27', 'bcrusham4@wsj.com');
insert into employee (name, birthday, email) values ('Drucill', '1986-10-23', 'dnoir5@infoseek.co.jp');
insert into employee (name, birthday, email) values ('Codie', '1994-09-02', 'cwalworche6@illinois.edu');
insert into employee (name, birthday, email) values ('Daveen', '1994-07-29', 'dwindas7@sourceforge.net');
insert into employee (name, birthday, email) values ('Alecia', '1961-07-12', 'apechell8@cisco.com');
insert into employee (name, birthday, email) values ('Jenelle', '1992-10-21', 'jstrowlger9@go.com');
insert into employee (name, birthday, email) values ('Maire', '1985-07-07', 'mtaborda@storify.com');
insert into employee (name, birthday, email) values ('Prudi', '1964-06-11', 'plyndb@rediff.com');
insert into employee (name, birthday, email) values ('Olvan', '1977-04-17', 'ostarbuckec@ameblo.jp');
insert into employee (name, birthday, email) values ('Agnella', '1996-03-16', 'amillierd@berkeley.edu');
insert into employee (name, birthday, email) values ('Daniele', '1973-08-08', 'dbenziese@accuweather.com');
insert into employee (name, birthday, email) values ('Brit', '1981-12-05', 'bondraf@123-reg.co.uk');
insert into employee (name, birthday, email) values ('Diena', '1982-07-05', 'dburking@npr.org');
insert into employee (name, birthday, email) values ('Audie', '1966-11-29', 'arooteh@tripadvisor.com');
insert into employee (name, birthday, email) values ('Nicki', '1988-04-22', 'nhazelhursti@so-net.ne.jp');
insert into employee (name, birthday, email) values ('Gaby', '1978-07-14', 'gmahaj@microsoft.com');
insert into employee (name, birthday, email) values ('Lawton', '1984-10-26', 'lszubertk@aboutads.info');
insert into employee (name, birthday, email) values ('Eddy', '1982-01-15', 'eluckhaml@wordpress.com');
insert into employee (name, birthday, email) values ('Belva', '1969-02-02', 'bclynmanm@lycos.com');
insert into employee (name, birthday, email) values ('Sylvester', '1986-03-07', 'sprogern@51.la');
insert into employee (name, birthday, email) values ('Basia', '1964-03-19', 'bfannino@youtu.be');
insert into employee (name, birthday, email) values ('Umeko', '1995-12-02', 'umansonp@mayoclinic.com');
insert into employee (name, birthday, email) values ('Arlina', '1960-12-16', 'adimelowq@webmd.com');
insert into employee (name, birthday, email) values ('Agace', '1994-08-13', 'acuniamr@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Gretna', '1980-02-27', 'gperkinsons@discovery.com');
insert into employee (name, birthday, email) values ('Johnath', '1985-09-16', 'jscroggest@squidoo.com');
insert into employee (name, birthday, email) values ('Daile', '1965-01-02', 'dnewlandu@smugmug.com');
insert into employee (name, birthday, email) values ('Oriana', '1996-11-11', 'ogawthropv@dot.gov');
insert into employee (name, birthday, email) values ('Lola', '1967-06-20', 'lbibeyw@springer.com');
insert into employee (name, birthday, email) values ('Mahalia', '1985-05-23', 'mgilbartx@house.gov');
insert into employee (name, birthday, email) values ('Filbert', '1984-01-21', 'farrigucciy@theglobeandmail.com');
insert into employee (name, birthday, email) values ('Carmencita', '1980-11-22', 'clinderz@dropbox.com');
insert into employee (name, birthday, email) values ('Craggie', '1960-01-17', 'ccavozzi10@qq.com');
insert into employee (name, birthday, email) values ('Stewart', '1996-12-11', 'sgalliard11@reference.com');
insert into employee (name, birthday, email) values ('Laurette', '1987-11-27', 'lstaniland12@examiner.com');
insert into employee (name, birthday, email) values ('Abby', '1961-06-14', 'acrewther13@boston.com');
insert into employee (name, birthday, email) values ('Mead', '1983-05-16', 'msposito14@networksolutions.com');
insert into employee (name, birthday, email) values ('Freddy', '1998-03-12', 'fdwyer15@netvibes.com');
insert into employee (name, birthday, email) values ('Armand', '1975-01-12', 'afeehery16@phpbb.com');
insert into employee (name, birthday, email) values ('Lyndell', '1987-03-21', 'lcoupman17@acquirethisname.com');
insert into employee (name, birthday, email) values ('Earlie', '1996-11-21', 'evigors18@statcounter.com');
insert into employee (name, birthday, email) values ('Betsey', '1961-08-13', 'bthickpenny19@gmpg.org');
insert into employee (name, birthday, email) values ('Eve', '1990-02-19', 'eknight1a@shop-pro.jp');
insert into employee (name, birthday, email) values ('Ann', '1966-04-25', 'akinsman1b@rambler.ru');
insert into employee (name, birthday, email) values ('Iris', '1977-05-04', 'ihuntress1c@xing.com');
insert into employee (name, birthday, email) values ('Cecile', '1983-11-01', 'chemstead1d@yelp.com');