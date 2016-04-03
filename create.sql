CREATE TABLE Artikel 
(
	ID INTEGER NOT NULL AUTO_INCREMENT Primary KEY,
	artikelNummer INTEGER,
	name VARCHAR(40),
	preis DOUBLE,
	CHECK (preis > 0)

);


CREATE TABLE Rechnung 
(	
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
	datum DATE,
	rechnungsNummer INTEGER,
	gesamtsumme DOUBLE
	CHECK (gesamtsumme > 0)

);

Create Table hat (
	artikel_id integer not null, 
	rechnung_id integer not null,

	foreign key (artikel_id) References ARTIKEL (id),
	foreign key (rechnung_id) References RECHNUNG (id),
	primary key (artikel_id,rechnung_id)
)

INSERT INTO 




select * from ARTIKEL  join RECHNUNG  join hat where artikel.id = hat.artikel_id and rechnung.id = hat.rechnung_id



-- Gebe die Rechnung X mit den vorhandenen Artikeln 

select * from ARTIKEL  join RECHNUNG  join hat where artikel.id = hat.artikel_id and rechnung.id = hat.rechnung_id and RECHNUNG .id = 1