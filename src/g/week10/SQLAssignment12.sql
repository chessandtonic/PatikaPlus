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
4.  SELECT customer.customer_id, customer.first_name, customer.last_name, COUNT(payment.payment_id) FROM customer
    JOIN payment ON customer.customer_id = payment.customer_id
    GROUP BY customer.customer_id
    ORDER BY COUNT(payment.payment_id) DESC;

