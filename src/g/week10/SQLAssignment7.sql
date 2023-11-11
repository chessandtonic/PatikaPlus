Ödev 7:

1.  SELECT rating FROM film
    GROUP BY rating;
2.  SELECT replacement_cost, COUNT(*) FROM film
    GROUP BY replacement_cost
    HAVING COUNT(*) > 50
    ORDER BY replacement_cost DESC;
3.  store_id = 1 -> 326
    store_id = 2 -> 273
    SELECT store_id, COUNT(*) FROM customer
    GROUP BY store_id;
4.  country_id = 44 -> 60
    SELECT country_id, COUNT(*) FROM city
    GROUP BY country_id
    ORDER BY COUNT(*) DESC
    LIMIT 1;