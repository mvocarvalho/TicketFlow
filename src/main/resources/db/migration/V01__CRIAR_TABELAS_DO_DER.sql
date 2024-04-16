CREATE TABLE Usuario (
	id INT AUTO_INCREMENT PRIMARY KEY,
	login varchar(60) UNIQUE NOT NULL,
	senha varchar(60) NOT NULL,
	dataCadastro DATE
);

CREATE TRIGGER before_insert_usuario
BEFORE INSERT ON Usuario
FOR EACH ROW
BEGIN
    SET NEW.dataCadastro = CURRENT_DATE();
END;

--Rollback
--DROP TABLE IF EXISTS Usuario;
--DROP TRIGGER IF EXISTS before_insert_usuario;
