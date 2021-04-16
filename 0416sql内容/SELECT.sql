SELECT * FROM product WHERE category_id =1;

SELECT * FROM product WHERE product_name = 'ピアノ名曲ベスト100';

SELECT * FROM product WHERE price > 3000;

SELECT * FROM product WHERE category_id =2 AND price > 2000;

SELECT * FROM product WHERE category_id =1 OR category_id =2;

SELECT product_name FROM product WHERE product_name LIKE '%Java';

SELECT product_name FROM product WHERE product_name LIKE '_Java';

SELECT product_name FROM product WHERE product_name LIKE '%名曲%':

SELECT product_name, price FROM product WHERE price BETWEEN 3000 AND 25000;

SELECT * FROM product WHERE category_id IN(2,6);

SELECT * FROM product WHERE NOT category_id =4;

SELECT * FROM product WHERE NOT (category_id = 1 OR category_id =4);

SELECT * FROM product WHERE category_id =4 AND price <= 50000;

SELECT product_name ,price FROM product WHERE product_name LIKE '%超%';

昇順
SELECT * FROM product ORDER BY category_id;

降順
SELECT * FROM product ORDER BY category_id DESC;

SELECT SUM(price) FROM product;

結合
SELECT product.category_id, category_name, product_name FROM product INNER JOIN category ON product.category_id = category.id;

練習問題7-1
SELECT category_id,MAX(price) FROM product GROUP BY category_id HAVING MAX(price)<= 20000;

練習問題7_2
SELECT name AS '名前列',email As'メールアドレス列'FROM member;

練習問題7_3
SELECT category_name ,category_id, ROUND(AVG(price),0) FROM category INNER JOIN product ON product.category_id = category_id GROUP BY category.category_name, category_id;


