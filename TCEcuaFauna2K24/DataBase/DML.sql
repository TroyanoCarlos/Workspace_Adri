-- database: TCEcuaFaunaDB.sqlite
/*
Autor : Carlos Troya
Fecha : 16/082024
Script: Insertando MER
*/

INSERT INTO TCCatalogoTipo (Nombre)VALUES
('Ecuador'),
('TipoHormiga'),
('TipoAlimento'),
('Sexo');

INSERT INTO TCCatalogo (IdCatalogoTipo,Nombre) VALUES
(1,'Costa'),(1,'Sierra'),(1,'Oriente'),(1,'Galapagos'),
(2,'Soldado'),(2,'Rastreadora'),(2,'Zángano'),(2,'Reina'),(2,'Larva'),
(3,'GenoAlimento'),(3,'Ingesta Nativa'),
(4,'Macho'),(4,'Hembra'),(4,'Asexual');

INSERT INTO TCLocalidad (IdRegion,Nombre) VALUES
(1,'Esmeraldas'),(1,'Manabí'),(1,'Los Ríos'),(1,'Guayas'),(1,'Santa Elena'),(1,'El Oro'),(1,'Santo Domingo de los Tsáchilas'),
(2,'Carchi'),(2,'Imbabura'),(2,'Pichincha'),(2,'Cotopaxi'),(2,'Tungurahua'),(2,'Bolívar'),(2,'Chimborazo'),(2,'Cañar'),(2,'Azuay'),(2,'Loja'),
(3,'Napo'),(3,'Orellana'),(3,'Pastaza'),(3,'Morona Santiago'),(3,'Sucumbíos'),(3,'Zamora Chinchipe'),
(4,'Galapagos');

INSERT INTO TCAlimento (IdTipoAlimento,Nombre) VALUES
(10, 'X'),(10, 'XX'),(10, 'Y'),
(11, 'Carnívoro'),(11, 'Herbívoro'),(11, 'Omnívoro'),(11, 'Insectívoro'),(11, 'Nectarívoro');