Ödev 6:

1.  '2,98'
    SELECT AVG(rental_rate) FROM film;
2.  '92'
    SELECT COUNT(*) FROM film
    WHERE title LIKE 'C%';
3.  '184'
    SELECT MAX(length) FROM film
    WHERE rental_rate = 0.99;
4.  '21'
    SELECT COUNT(DISTINCT replacement_cost) FROM film
    WHERE length > 150;