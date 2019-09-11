CREATE TABLE `agencias` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(3) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cnpj` varchar(14) NOT NULL,
  `gerente_nome` varchar(100) DEFAULT NULL,
  `end_logradouro` varchar(100) DEFAULT NULL,
  `end_numero` varchar(10) DEFAULT NULL,
  `end_complemento` varchar(100) DEFAULT NULL,
  `end_bairro` varchar(20) DEFAULT NULL,
  `end_cidade` varchar(50) DEFAULT NULL,
  `end_estado` varchar(20) DEFAULT NULL,
  `end_cep` varchar(8) DEFAULT NULL,
  `id_banco` int(11) NOT NULL,
  PRIMARY KEY (`id`,`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8