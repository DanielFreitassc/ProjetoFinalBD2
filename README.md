## Projeto Sistema de Atividades Especiais - GRUPO A

### Integrantes
Luiz Felipe Zomer - [@LuizZomer](https://github.com/luizZomer)<br>
Luiz Filipe Linhares - [@LuizFilipeLinhares](https://github.com/LuizFilipeLinhares)<br>
Willian Minatto - [@willianminatto](https://github.com/willianminatto)<br>
Daniel Freitas - [@DanielFreitassc](https://github.com/DanielFreitassc)<br>
Augustos Preis - [@AugustoPreis](https://github.com/AugustoPreis)

---

### Modelo Físico
Utilizamos a ferramenta de modelagem de dados [dbdiagram.io](https://dbdiagram.io/) para criação do modelo físico do banco de dados, para posterior exportação dos scripts DDL das tabelas e relacionamentos.<br>
Arquivo fonte: [Modelo Fisico](https://dbdiagram.io/d/Copy-of-Untitled-Diagram-667372d75a764b3c72ed8452).<br>

![Modelo Fisico](MFimagem.png)
  
### Dicionário de Dados
As informações sobre as tabelas e índices foram documentados na planilha [dicionarioDeDados.xlsx](dicionario_dados/dicionarioDeDados.xlsx).

### Scripts SQL
Para este projeto foi utilizado o banco de dados [Postgres SQL](https://www.postgresql.org/) 16.3<br>

Abaixo, segue os scripts SQL separados por tipo:
+ DDL [ddl.sql](scripts_sql/ddl.sql)
+ Índices [indices.sql](scripts_sql/indices.sql)
+ DML [dml.sql](scripts_sql/dml.sql)
+ Triggers [triggers.sql](scripts_sql/triggers.sql)
+ Stored Procedures [stored_procedures.sql](scripts_sql/stored_procedures.sql)
+ Functions [functions.sql](scripts_sql/functions.sql)
+ DQL [dql.sql](scripts_sql/dql.sql)

### Código Fonte do CRUD
- Linguagem de Programação Java 21.<br>
- Framework Springboot 3.3.0,
  
[Documentação da API](https://danielfreitassc.github.io/ProjetoFinalBD2/cliente/)

[Codigo Fonte](sistema/)

### Relatório Final
O relatório final está disponível no arquivo [template1.docx](relatorio/template1.docx).
