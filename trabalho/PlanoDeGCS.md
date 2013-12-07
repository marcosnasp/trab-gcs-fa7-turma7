Projeto Detran
=================
Plano de Gerenciamento de Configuração
======================================
Versão 1.0
------------------


Histórico de Versões
--------------------

|Data                |Versão       |Descrição               |Autor          |
|--------------------|-------------|------------------------|---------------|
|25/11/2013|1.0|Versão inicial|Luis Renné|
|26/11/2013|1.1|Seção 1 finalizada|Luis Renné|
  



1. Introdução
==============

1.1 Finalidade
---------------    
Este documento tem como finalidade definir padrões, procedimentos, atividades e seus responsáveis, bem como os itens de configuração a serem controlados e as ferramentas a serem utilizadas no gerenciamento de configuração. 



1.2 Escopo
----------
Este documento se aplica ao projeto Detran e afeta os itens de configuração gerados
pela equipe do projeto, tais como os requisitos, casos de uso, diagramas, arquivos de código-fonte, modelos de dados, casos de teste e manuais.



1.3 Definições, Acrônimos e Abreviações
---------------------------------------
|Termo               |Descrição    |
|--------------------|-------------|
|Baseline|Conjunto de itens de configuração em um determinado momento do processo de  desenvolvimento|
|GC|Gerente de configuração|
|BD|Banco de dados|
|CM|Controle de mudanças|
|GCS|Gestão de configuração de software|
|SCM|Sistema de controle de mudanças|
|Release| Uma versão distribuída ao cliente|
|Repositório|Local onde serão armazenados os itens de configuração|
|SM|Solicitação de mudanças|
|CCB|Comitê de Controle da Configuração|



1.4 Referências
---------------
Não se aplica.



1.5 Visão Geral
---------------
Este documento está organizado em seções. <p> A seção 1 oferece uma visão geral de todo o documento. Ela inclui a finalidade, o escopo, as definições, os acrônimos, as abreviações, as referências e uma visão geral deste Plano de Gerenciamento de Configuração.<p> 

A seção 2 descreve quem será o responsável pela execução das diversas atividades de GCS, as ferramentas e os procedimentos necessários para o controle de versão dos itens de configuração gerados no ciclo de vida do projeto.<p>  

A seção 3  descreve como os itens de configuração devem ser identificados, as Baselines do projeto,a estrutura do repositório e a organização dos itens dentro do repositório.<p>

A seção 4 define os padrões e procedimentos que devem ser seguidos no projeto.<p>

A seção 5 descreve as ferramentas de software, o pessoal e o treinamento necessários para implementar as atividades de GCS especificadas.<p> 

A seção 6 descreve o cronograma das auditorias de configuração e o que será verificado. Também informa como serão reportados os problemas encontrados e como será feito o acompanhamento das correções.



2. Gerenciamento de Configuração de Software
============================================

2.1 Organização, Responsabilidades e Interfaces
------------------------------------------------

|Papéis |Equipe                      |Responsabilidade             |
|------ |----------------------------|-----------------------------|
|Gerente de Configuração|- Marcos Portela|Escrever o plano de Gerencia de Configuração<br>Configurar ambiente de gerência de configuração<br>Criar Baselines|
|CCB| - Luís Renné<br> - Elias de Oliveira|Definir os processos de controle de mudanças<br>Aprovar ou rejeitar solicitações de mudanças|
|Desenvolvedor|- Marcos Portela<br>- Luís Renné<br>- Elias de Oliveira|Seguir os padrões e procedimentos definidos no plano de gerência de configuração|





2.2 Ferramentas, Ambiente e Infra-estrutura
-------------------------------------------

### 2.2.1 Ferramentas
|Nome|Descrição|Versão|Licença|
|----|---------|------|-------|
|Git|Controle de versão distribuído|1.8.5.1|Free|
|EGit|Plugin para integrar o Eclipse ao Git|3.1.0|Free|
|MantisBT|Ferramenta de controle de mudanças|1.2.15|Free|
|PostgreSQL|Servidor de Banco de Dados|9.3|Free|
|pgAdmin|Client PostgreSQL|1.18.1|Free|
|Eclipse|IDE para desenvolvimento Java|4.3.0|Free|
|Java JDK| Kit de desenvolvimento Java|1.7|Free|
|Linux Debian| Sistema Operacional|7.0 |Free|
|Ubuntu|Sistema Operacional|13.10|Free|
|JBoss AS|Servidor de aplicações JEE|7.1.1|Free|
|Libre Office|Suite de escritório|4.1.3|Free|


### 2.2.2 Ambiente e Infra-estrutura

#### Banco de Dados
O banco de dados utilizado no  projeto é PostgresSQL. Serão definidos três bancos de dados: Desenvolvimento, Homologação e Produção. Banco de Desenvolvimento é o banco utilizado pelos desenvovledores nas atividades de desenvolvimento ou testes. Banco de Homologação é o banco utilizado pelas versões do sistema a serem homologadas pelo cliente. Banco de Produção
é o banco utilizado pelas versões definitivas disponibilizadas ao cliente. Os bancos de dados estarão configurados da seguinte maneira:


|Banco de desenvolvimento|                   |
|------------------------|-------------------|
|IP|192.168.1.5|
|Porta|5432|
|Nome do banco| detran_desen |
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Core i5 2.8 GHz, 4GB RAM, 500 HD|
 
|Banco de Homologação|              |
|--------------------|--------------|
|IP|192.168.1.6|
|Porta|5432|
|Nome do banco|detran_homolog|
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Core i5 2.8 GHz, 4GB RAM, 500 HD|

|Banco de Produção|              |
|-----------------|--------------|
|IP|192.168.1.7|
|Porta|5432|
|Nome do banco|_detran_prod_|
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Xeon® Quad-Core 3.10GHz, 8GB RAM, 500 HD.|



#### Controle de Versão
A ferramenta de controle de versão utilizada no projeto será o GIT, uma ferramenta de controle de versão distribuído. Também será usado o serviço GitHub para hospedar o repositório remoto do projeto. Este repositório deverá ser privado. O custo com o serviço de hospedagem do repositório é de $7.00 por mês. Os desenvolvedores da equipe deverão criar um repositório local que deverá ser um "_clone_" do repositório remoto em sua estação de desenvolvimento.


|Repositorio Remoto |                                        |      
|-------------------|----------------------------------------|
|Endereço           | https://github.com/detran/projetodetran|



####Controle de Mudanças
Para controle de mudanças, será utilizado no projeto a ferramenta de bug tracking MantisBT. Todos os membros da equipe do projeto deverão ter um usuário para acesso, assim como os clientes que irão solicitar as mudanças. 


|Servidor MantisBT      ||
|----------|--------------|
|IP|192.168.1.8|
|Endereço|http://192.168.1.8/mantis|
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Core i5 2.8 GHz, 4GB RAM, 500 HD|

#### Servidores de Aplicação 
O servidor de aplicação utilizado pelo projeto será o JBoss. Serão disponiblizados dois servidores de aplicação, Homologação, no qual serão implantadas as versões a serem homologadas pelo cliente, e Produção, onde serão implantadas as versões finais a serem disponibilizadas ao  cliente. Os desenvolvedores também terão um servidor JBoss rodando localmente em suas estações de desenvolvimento. 

|Servidor JBoss de Homologação|              |
|-----------------------------|--------------|
|IP|192.168.1.9|
|Porta|8080|
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Core i5 2.8 GHz, 4GB RAM, 500 HD|

|Servidor JBoss de Produção|              |
|--------------------------|--------------|
|IP|192.168.1.10|
|Porta|8080|
|Sistema Operacional|Linux Debian|
|Hardware| Processador Intel® Xeon® Quad-Core 3.10GHz, 8GB RAM, 500 HD.|




#### Ambiente de Desenvolvimento
A edição de código-fonte será feita através da IDE Eclipse. A documentação do projeto deverá ser feita utilizando a ferramenta LibreOffice salvando no formato ODF (Open Document Format). As estações de trabalho de desenvolvimento deverão ter as seguintes configurações:

|Ambiente de Desenvolvimento||
|--------------------|-----------|
|Sistema Operacional|Linux Ubuntu|
|Hardware | Processador Intel® Core i7 3.4GHz, 8GB RAM, 500 HD|
|Softwares| Git, Eclipse + EGit, pgAdmin, Java JDK, JBoss, Libre Office     | 



 


3. O Programa de Gerenciamento de Configuração
==============================================

3.1 Identificação da Configuração
---------------------------------
### 3.1.1 Métodos de Identificação
----------------------------------
_[Descreva como os artefatos do projeto ou produto devem ser nomeados, marcados e numerados. O esquema de identificação deve abranger o hardware, o software do sistema, os produtos de terceiros (COTS) e todos os artefatos de desenvolvimento de aplicativos listados na estrutura de diretórios do produto; por exemplo, planos, modelos, componentes, software de teste, resultados e dados, executáveis e assim por diante.]_

### 3.1.2 Itens de Configuração
_[Relacionar os artefatos ou grupos de artefatos, separando por tipo, modulo ou subsistema, responsável ou momento em que deverão ser incluídos em baselines._
* _“Inclusão em Baseline” em branco significa que o grupo de artefatos não participará de baseline. Pode ser expresso como uma data ou identificador de uma baseline, fase ou ponto de controle_
* _“Responsável”: indicar nominalmente, sempre que possível]_

| Item (ou Tipo de Item)                 | Responsável na equipe         | Inclusão em Baseline |
|----------------------------------------|-----------------------------|----------------------|
|_&lt;grupo de itens de configuração&gt;_|_&lt;nome do responsável&gt;_|_&lt;momento a partir do qual o conjunto de artefatos será incluído em baseline&gt;_|


### 3.1.3 Baselines do Projeto

_[As baselines funcionam como um padrão oficial no qual os trabalhos subseqüentes são baseados. Somente mudanças autorizadas podem ser efetuadas nas baselines._
_Descreva em que pontos do ciclo de vida do projeto ou produto as baselines devem ser estabelecidas. As baselines mais comuns devem ser definidas ao final de cada uma das fases de Iniciação, Elaboração, Construção e Transição. Elas também podem ser geradas no final de iterações ocorridas dentro das várias fases ou com freqüência ainda maior._
_Descreva quem autoriza uma baseline e o que ela contém.]_

### 3.1.4 Estrutura do Repositório de Versões
_[Descreva a organização de diretórios do seu repositório e que itens/arquivos devem ser armazenados em cada diretório.]_

3.2 Controle de Configuração e Mudança
--------------------------------------

### 3.2.1 Processamento e Aprovação de Solicitações de Mudança
_[Descreva o processo pelo qual os problemas e as mudanças são submetidos, revisados e dispostos. Inclua como funciona a transição de estados de uma solicitação de mudança]_

### 3.2.2 Comitê de Controle de Mudança (CCB)
_[Descreva a participação e os procedimentos para processar solicitações e aprovações de mudança a serem seguidos pelo CCB. Informe quem são os membros do CCB e suas responsabilidades.]_



4. Padrões e Procedimentos
==========================
_[Descreva os padrões e procedimentos que devem ser seguidos no projeto. Crie subseções se achar necessário, para organizá-los melhor.]_



5. Treinamento e Recursos
=========================
_[Descreva as ferramentas de software, o pessoal e o treinamento necessários para implementar as atividades de CM especificadas.]_



6. Auditorias de Configuração
=============================
_[Descreva o cronograma das auditorias de configuração e o que será verificado. Informe também como serão reportados os problemas encontrados e onde sera feito o acompanhamento dos itens corretivos.]_
