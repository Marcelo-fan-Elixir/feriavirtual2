INSERT INTO TB_USUARIO(rut_usuario, dv_usuario, nombre_usuario, direccion_usuario, telefono_usuario, email_usuario) 
VALUES('direcao 1','2','s4ks@sda','NOME 1','5555','554441');

INSERT INTO TB_USUARIO(rut_usuario, dv_usuario, nombre_usuario, direccion_usuario, telefono_usuario, email_usuario) 
VALUES('direcao 2','3','s@sda','NOME 4','55555','5554221');

INSERT INTO TB_USUARIO(rut_usuario, dv_usuario, nombre_usuario, direccion_usuario, telefono_usuario, email_usuario) 
VALUES('direcao 4','4','s@sda','NOME 3','44444','4444221');


--POBLANDO CONTRATO

INSERT INTO TB_CONTRATO(descripcion_contrato, pdf_contrato, fecha_inicio, fecha_termino) 
VALUES('CONTRATO 1','PDF 1',parsedatetime('17-09-2020', 'dd-MM-yyyy'),parsedatetime('17-09-2027', 'dd-MM-yyyy'));

INSERT INTO TB_CONTRATO(descripcion_contrato, pdf_contrato, fecha_inicio, fecha_termino) 
VALUES('CONTRATO 2','PDF 2',parsedatetime('17-04-2020', 'dd-MM-yyyy'),parsedatetime('17-09-2022', 'dd-MM-yyyy'));

INSERT INTO TB_CONTRATO(descripcion_contrato, pdf_contrato, fecha_inicio, fecha_termino) 
VALUES('CONTRATO 3','PDF 3',parsedatetime('17-02-2012', 'dd-MM-yyyy'),parsedatetime('17-09-2025', 'dd-MM-yyyy'));