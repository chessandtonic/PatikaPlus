Ödev 12:

1.  '489'
    SELECT COUNT(length) FROM film
    WHERE length > (SELECT AVG(length) FROM film);
2.  '336'
    SELECT COUNT(rental_rate) FROM film
    WHERE rental_rate = (SELECT MAX(rental_rate) FROM film);
3.  SELECT * FROM film
    WHERE rental_rate = (SELECT MIN(rental_rate) FROM film)
      AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);
4.  SELECT customer_id, COUNT(payment_id) FROM payment
    GROUP BY customer_id
    ORDER BY COUNT (payment_id) DESC;