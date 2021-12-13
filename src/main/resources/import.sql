INSERT INTO tb_category (name) VALUES ('Informática');
INSERT INTO tb_category (name) VALUES ('Escritório');

INSERT INTO tb_product (name, price) VALUES ('Computador', 2000.00);
INSERT INTO tb_product (name, price) VALUES ('Impressora', 800.00);
INSERT INTO tb_product (name, price) VALUES ('Mouse', 80.00);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 1);

INSERT INTO tb_state (name) VALUES ('Minas Gerais');
INSERT INTO tb_state (name) VALUES ('São Paulo');

INSERT INTO tb_city (name, state_id) VALUES ('Uberlândia', 1);
INSERT INTO tb_city (name, state_id) VALUES ('São Paulo', 2);
INSERT INTO tb_city (name, state_id) VALUES ('Campinas', 2);

INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Maria Silva', 'maria@gmail.com', '36378912377', 1);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Cooper Hamilton','cooperhamilton@google.couk','68.144.684/9513-22',2);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Jamal Lang','jamallang@aol.edu','33.785.916/2271-52',2);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Rhiannon Jones','rhiannonjones@protonmail.ca','60.861.205/8139-11',2);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Jonas Lawson','jonaslawson4774@yahoo.net','24.264.806/4437-16',2);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Brock Rojas','brockrojas@protonmail.couk','453.919.248-93',1);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Duncan Klein','duncanklein808@outlook.couk','280.141.365-62',1);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Nolan Compton','nolancompton@hotmail.couk','767.885.241-19',1);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Dale Vincent','dalevincent@yahoo.net','298.152.547-11',1);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Shad Cote','shadcote5311@hotmail.net','23.948.575/5478-43',2);
INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Kylee Joyner','kyleejoyner6211@protonmail.ca','63.825.445/4286-19',2);


INSERT INTO tb_phones (customer_id, phones) VALUES (1, '27363323');
INSERT INTO tb_phones (customer_id, phones) VALUES (1, '93838393');

INSERT INTO tb_address (public_place, number, complement, district, zip_code, city_id, client_id) VALUES ('Rua Flores', '300', 'Apto 303', 'Jardim', '38220834', 1, 1);
INSERT INTO tb_address (public_place, number, complement, district, zip_code, city_id, client_id) VALUES ('Avenida Matos', '105', 'Sala 800', 'Centro', '38777012', 2, 1);

INSERT INTO tb_order (instant, customer_id, delivery_address_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-09-30T10:32:00Z', 1, 1);
INSERT INTO tb_order (instant, customer_id, delivery_address_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-10-10T19:35:00Z', 1, 2);

INSERT INTO tb_payment (status, order_id) VALUES (2, 1);
INSERT INTO tb_payment (status, order_id) VALUES (1, 2);

INSERT INTO tb_card_payment (installments, order_id) VALUES (6, 1);
INSERT INTO tb_payment_with_slip (due_date, payment_date, order_id) VALUES (TIMESTAMP WITH TIME ZONE '2017-10-20T00:00:00Z', null, 2);

INSERT INTO tb_order_item (discount, quantity, price, order_id, product_id) VALUES (0.00, 1, 2000.00, 1, 1);
INSERT INTO tb_order_item (discount, quantity, price, order_id, product_id) VALUES (0.00, 2, 80.00, 1, 3);
INSERT INTO tb_order_item (discount, quantity, price, order_id, product_id) VALUES (100.00, 1, 800.00, 2, 2);
