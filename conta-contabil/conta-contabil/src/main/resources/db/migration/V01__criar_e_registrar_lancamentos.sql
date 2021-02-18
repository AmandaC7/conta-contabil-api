CREATE TABLE lancamento_contabil (
	Id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	valor DECIMAL(10,2) NOT NULL,
	data_cadastro DATE

) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (15.40, "2020-03-12");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (17.40, "2020-01-12");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (11.40, "2020-07-10");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (20, "2020-01-12");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (19, "2020-01-25");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (13.20, "2019-09-07");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (16.40, "2020-03-12");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (11.75, "2019-06-23");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (25.99, "2019-02-12");
INSERT INTO lancamento_contabil (valor, data_cadastro)
VALUES (14.25, "2019-01-01");