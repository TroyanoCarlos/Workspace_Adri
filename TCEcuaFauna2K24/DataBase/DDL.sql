-- database: TCEcuaFaunaDB.sqlite
/*
Autor : Carlos Troya
Fecha : 16/082024
Script: Insertando MER
*/


DROP TABLE IF EXISTS TCCatalogoTipo;
DROP TABLE IF EXISTS TCCatalogo;
DROP TABLE IF EXISTS TCLocalidad;
--DROP TABLE IF EXISTS Persona;
--DROP TABLE IF EXISTS Usuario;
DROP TABLE IF EXISTS TCAlimento;
DROP TABLE IF EXISTS TCHormiga;

CREATE TABLE TCCatalogoTipo (
   IdCatalogoTipo   INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,Nombre           VARCHAR(30) NOT NULL UNIQUE

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE TCCatalogo(
  IdCatalogo         INTEGER NOT NULL PRIMARY KEY autoincrement 
  ,IdCatalogoTipo    INTEGER NOT NULL REFERENCES TCCatalogoTipo(IdCatalogoTipo)
  ,Nombre            VARCHAR(30) NOT NULL UNIQUE

  ,Estado           VARCHAR(1) NOT NULL DEFAULT('A')
  ,FechaCreacion    DATETIME DEFAULT(datetime('now','localtime'))
  ,FechaModifica    DATETIME
);

CREATE TABLE TCLocalidad(
    IdLocalidad             INTEGER NOT NULL PRIMARY KEY autoincrement
    ,IdRegion             INTEGER REFERENCES TCCatalogo(IdCatalogo)
    ,Nombre                 VARCHAR(30) NOT NULL 

    ,Estado                 VARCHAR(1) NOT NULL DEFAULT('A')
    ,FechaCreacion          DATETIME DEFAULT(datetime('now','localtime'))
    ,FechaModifica          DATETIME
);

CREATE TABLE TCAlimento(
    IdAlimento             INTEGER NOT NULL PRIMARY KEY autoincrement
    ,IdTipoAlimento        INTEGER REFERENCES TCCatalogo(IdCatalogo)
    ,Nombre                 VARCHAR(30) NOT NULL 

    ,Estado                 VARCHAR(1) NOT NULL DEFAULT('A')
    ,FechaCreacion          DATETIME DEFAULT(datetime('now','localtime'))
    ,FechaModifica          DATETIME
);

CREATE TABLE TCHormiga(
    IdHormiga               INTEGER NOT NULL PRIMARY KEY autoincrement
    ,IdTipoHormiga          INTEGER REFERENCES TCCatalogo(IdCatalogo)
    ,IdSexo                 INTEGER REFERENCES TCCatalogo(IdCatalogo)
    ,IdProvincia            INTEGER REFERENCES TCLocalidad(IdLocalidad)
    ,IdGenoAlimento          INTEGER REFERENCES TCAlimento(IdAlimento)
    ,IdIngestaNativa         INTEGER REFERENCES TCAlimento(IdAlimento)
    ,Nombre                 VARCHAR(30) NOT NULL 

    ,EstadoHormiga          VARCHAR(10) NOT NULL 
    ,FechaCreacion          DATETIME DEFAULT(datetime('now','localtime'))
    ,FechaModifica          DATETIME
);


