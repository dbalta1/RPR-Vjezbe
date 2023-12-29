BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "drzava" (
	"id"	INTEGER,
	"naziv"	TEXT,
	"glavni_grad"	INTEGER,
	FOREIGN KEY("glavni_grad") REFERENCES "grad",
	PRIMARY KEY("id")
);
CREATE TABLE IF NOT EXISTS "grad" (
	"id"	INTEGER,
	"naziv"	TEXT,
	"broj_stanovnika"	INTEGER,
	"drzava"	INTEGER,
	FOREIGN KEY("drzava") REFERENCES "drzava",
	PRIMARY KEY("id")
);
INSERT INTO "drzava" VALUES (1,'Francuska',1);
INSERT INTO "drzava" VALUES (2,'Velika Britanija',2);
INSERT INTO "drzava" VALUES (3,'Austrija',3);
INSERT INTO "grad" VALUES (1,'Paris',520,1);
INSERT INTO "grad" VALUES (2,'London',6000000,2);
INSERT INTO "grad" VALUES (3,'Beč',160353,3);
INSERT INTO "grad" VALUES (4,'Manchester',510675,2);
INSERT INTO "grad" VALUES (5,'Graz',245656,3);
COMMIT;
