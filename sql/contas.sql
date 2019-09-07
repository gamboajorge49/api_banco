CREATE TABLE `contas` (
  `id` int(11) NOT NULL,
  `id_agencia` int(11) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `cliente_nome` varchar(100) NOT NULL,
  `cliente_end_logradouro` varchar(100) DEFAULT NULL,
  `cliente_end_numero` varchar(10) DEFAULT NULL,
  `cliente_end_bairro` varchar(50) DEFAULT NULL,
  `cliente_end_complemento` varchar(100) DEFAULT NULL,
  `cliente_end_cidade` varchar(30) DEFAULT NULL,
  `cliente_end_estado` varchar(20) DEFAULT NULL,
  `cliente_end_cep` varchar(8) DEFAULT NULL,
  `tipo` char(1) DEFAULT NULL COMMENT 'C=Conta corrente\r\nP=Poupança',
  `saldo` decimal(19,2) DEFAULT 0.00,
  `data_cadastro` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8