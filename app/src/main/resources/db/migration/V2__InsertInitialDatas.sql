INSERT INTO tbl_groups VALUES (1, 'Pessoal', 1);
INSERT INTO tbl_groups VALUES (2, 'Empresa', 2);

INSERT INTO tbl_bank_accounts VALUES(1, 'CHECKING','NuBank', 'Conta do NuBank', 2, 'nubank.svg', 2000.0, 1, 2000.0, 0, null,null,null);
INSERT INTO tbl_bank_accounts VALUES(2, 'SAVINGS','Inter', 'Conta do Banco Inter', 1, 'inter.svg', 4000.0, 1, 4000.0, 0, null,null,null);
INSERT INTO tbl_bank_accounts VALUES(3, 'CHECKING','Banco do Brasil', 'Conta do Banco do Brasil', 3, 'bb.svg', 6000.0, 1, 6000.0, 0, null,null,null);

INSERT INTO tbl_bank_accounts VALUES(4, 'CHECKING','Caixa Econômica', 'Conta Corporativa da Caixa Econômica Federal', 2, 'cef.svg', -1000, 2, 0, 0, null,null,null);
INSERT INTO tbl_bank_accounts VALUES(5, 'CREDIT_CARD','Mastercard', 'Cartão Mastercard da Caixa Econômica Federal', 1, 'mastercard.svg', -400, 2, 0, 0, 3500,25,5);

INSERT INTO tbl_tags VALUES (1, 'Bangalô');
INSERT INTO tbl_tags VALUES (2, 'Obrigação 2024');
INSERT INTO tbl_tags VALUES (3, 'Aniversário Fernanda');
INSERT INTO tbl_tags VALUES (4, 'Evento Fiap Talent 2024');
INSERT INTO tbl_tags VALUES (5, 'Evento DevPira');