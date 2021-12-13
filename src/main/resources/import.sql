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

INSERT INTO tb_customer (name, email, cpf_or_cnpj, type) VALUES ('Maria Silva', 'maria@gmail.com', 36378912377, 1);

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
