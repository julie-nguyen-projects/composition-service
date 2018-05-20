

INSERT INTO split_view(id, type_split)
VALUES (110001, 1);
INSERT INTO split_view(id, type_split)
VALUES (110002, 0);

INSERT INTO slide_view(id, nb_slides)
VALUES (120001, 1);
INSERT INTO slide_view(id, nb_slides)
VALUES (120002, 3);
INSERT INTO slide_view(id, nb_slides)
VALUES (120003, 15);

INSERT into base_module(id)
VALUES (13001);
INSERT into base_module(id)
VALUES (13002);
INSERT into base_module(id)
VALUES (13003);

INSERT into composition(id, module_id)
VALUES (10001, 13001);
INSERT into composition(id, module_id)
VALUES (10002, 120001);
INSERT into composition(id)
VALUES (10003);
INSERT into composition(id)
VALUES (10004);
INSERT into composition(id)
VALUES (10005);
INSERT into composition(id)
VALUES (10006);
INSERT into composition(id)
VALUES (10007);
INSERT into composition(id)
VALUES (10008);