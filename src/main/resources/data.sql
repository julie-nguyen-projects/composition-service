INSERT into composition(id)
VALUES (10001);
INSERT into composition(id)
VALUES (10002);
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

INSERT INTO split_view(id, composition_id, type_split)
VALUES (110001, 10002, 1);
INSERT INTO split_view(id, composition_id, type_split)
VALUES (110002, 10001, 0);

INSERT INTO slide_view(id, composition_id, nb_slides)
VALUES (120001, 10003, 1);
INSERT INTO slide_view(id, composition_id, nb_slides)
VALUES (120002, 10004, 3);
INSERT INTO slide_view(id, composition_id, nb_slides)
VALUES (120003, 10005, 15);

INSERT into base_module(id, composition_id)
VALUES (13001, 10006);
INSERT into base_module(id, composition_id)
VALUES (13002, 10007);
INSERT into base_module(id, composition_id)
VALUES (13003, 10008);