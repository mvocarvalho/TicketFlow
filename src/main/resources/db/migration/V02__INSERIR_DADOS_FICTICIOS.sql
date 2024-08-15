-- Inserção de dados na tabela Usuario
INSERT INTO Usuario (login, senha) VALUES
('fulano@email.com', 'senha123'),
('ciclano@email.com', 'senha456'),
('beltrano@email.com', 'senha789');

--Rollback
--DELETE FROM Usuario WHERE login in ('fulano@email.com','ciclano@email.com','beltrano@email.com');