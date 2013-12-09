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
|SCM|Sistema de controle de mudanças|
|CM|Gerenciamento de Configuração|
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

A seção 2 descreve quem será o responsável pela execução das diversas atividades de CM, as ferramentas e os procedimentos necessários para o controle de versão dos itens de configuração gerados no ciclo de vida do projeto.<p>  

A seção 3  descreve como os itens de configuração devem ser identificados, as Baselines do projeto,a estrutura do repositório e a organização dos itens dentro do repositório.<p>

A seção 4 define os padrões e procedimentos que devem ser seguidos no projeto.<p>

A seção 5 descreve as ferramentas de software, o pessoal e o treinamento necessários para implementar as atividades de CM especificadas.<p> 

A seção 6 descreve o cronograma das auditorias de configuração e o que será verificado. Também informa como serão reportados os problemas encontrados e como será feito o acompanhamento das correções.



2. Gerenciamento de Configuração de Software
============================================

2.1 Organização, Responsabilidades e Interfaces
------------------------------------------------
_[Descreva quem será o responsável pela execução das diversas atividades de Gerenciamento de Configuração (CM) descritas no Processo de CM.]_

|Papéis              |Equipe       |Responsabilidade        |
|--------------------|-------------|------------------------|
|(GC) Gerente de COnfiguração|Marcos Portela<p>Luis Renne|Escrever o plano de Gerencia de CM|





2.2 Ferramentas, Ambiente e Infra-estrutura
-------------------------------------------
_[Descreva o ambiente de computação e as ferramentas de software a serem utilizadas para desempenhar as funções de CM em todo o ciclo de vida do projeto ou produto._
_Descreva as ferramentas e os procedimentos necessários utilizados para o controle de versão dos itens de configuração gerados no ciclo de vida do projeto ou produto._
_As questões envolvidas na configuração do ambiente de CM incluem:_
* _tamanho previsto dos dados do produto_
* _distribuição da equipe do produto_
* _localização física dos servidores e clientes]_
 


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

| Item (ou Tipo de Item)                 | Responsável na equipe	     | Inclusão em Baseline |
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

5.1 Treinamento
---------------

### 5.1.1 Ferramenta GIT
Deve ser agendado um treinamento com pessoal especializado em controle de versão distruído, mais especificamente,
GIT. A programação do treinamento deve ser dirigida pelos seguintes pontos:
<ol>
<li>Conceitos de Controle de Versão distribuído</li>
<li>Comparações e diferenças relacionadas ao Controle Centralizado.</li>
<li>Visão Geral das Principais Ferramentas Disponíveis no Mercado.</li>
<li>Utilização através de um estudo dirigido para um caso específico abordando as principais funcionalidades do
cliente definido na seção de <b>recursos 5.2</b>.</li>
<li>Avaliação da absorção dos conteúdos apreendidos visando medir a eficácia do treinamento.
</ol> 

### 5.1.2 Ferramenta JIRA
Deve ser agendado um treinamento com pessoal especializado na Ferramenta de tracking (Controle de mudanças) JIRA. A 
programação do treinamento deve ser dirigida pelos seguintes pontos:
<ol>
<li>Conceitos de Controle de Mudanças e Ciclo de Vida</li>
<li>Necessidades de Engenharia.</li>
<li>Visão Geral das Principais Ferramentas concorrentes disponíveis no Mercado.</li>
<li>Utilização através de um estudo dirigido para um caso específico abordando as principais funcionalidades do
cliente definido na seção de <b>recursos 5.2</b>, ferramenta JIRA.</li>
<li>Avaliação da absorção dos conteúdos apreendidos visando medir a eficácia do treinamento.
</ol> 

5.2 Recursos
------------

Para o Gerenciamento de Configuração de Software no projeto DETRAN serão utilizadas as seguintes ferramentas:
<ol>
<li>Para realizar o Controle de versão será utilizado a ferramenta Open Source GIT-SCM, nas suas versões: Bash e GUI. Essa ferramenta possui suporte para diversos tipos de sistemas operacionais: Windows, Mac OS e Linux. E está disponível
em: http://git-scm.com/download. Mais informações sobre instalação em: http://git-scm.com/book/en/Getting-Started-Installing-Git.</li>
<li>EGit - Plugin do Eclipse para o Git.</li>
<li>Para realizar o Controle de Mudanças será utilizada a ferramenta JIRA da Atlassian.</li>
</ol>

6. Auditorias de Configuração
=============================

6.1 Auditorias e o Ciclo de Vida do Projeto
---------------------------------------------

<p>
As auditorias de configuração consistem na avaliação periódica das linhas de base do projeto definidas em pontos especiais do ciclo de vida do projeto:
<ol>
<li>Definição do projeto <i>(design)</i></li>
<li>Revisão do status do projeto <i>(design)</i></li>
<li>Finalização da Etapa de Implementação do Software</li>
<li>Entrega/Implantação do Software</li>
</ol>
</p>
<b>Fonte:</b> <i>MODELO PARA O GERENCIAMENTO DA CONFIGURAÇÃ E GERENCIAMENTO DA INFORMAÇÃO E DOCUMENTAÇÃO DO PROGRAMA ESPACIAL BRASILEIRO.</i> Albuquerque, Inaldo S. São José dos Campos, INPE 2012. Dissertação de Mestrado.

6.2 Cronograma baseado nas Baselines
------------------------------------

| Baseline               | Momento no ciclo de vida	     | Data |
|----------------------------------------|-----------------------------|----------------------|
|Baseline de Planejamento|Definição do projeto - Criação da Baseline|Na data de Fechamento - Aprovação do plano|
|Baseline de Artefatos|Revisão do Status do projeto - Homologação do artefato aprovado pelo cliente|Data definida no cronograma do Projeto|
|Baseline de Mudança|Revisão do status do projeto|Na data da aprovação|
|Build Externo|Finalização da Etapa de Implementação e/ou Entrega/implantação no cliente|Data definida no cronograma do Projeto|

6.3 Descrição do Procedimento de Documentação de Problemas
----------------------------------------------------------

<p>
Os problemas encontrados deverão ser reportados às partes interessadas, tais como: membros da equipe de desenvolvimento, gestores, etc, de acordo com a natureza do problema e gravidade tudo deve ser considerado. Será utilizada uma ferramenta de <i>bug tracking</i> <b>JIRA</b>, para realizar o controle de mudanças e o acompanhamento da resolução do problema encontrado.
</p>
<p>
Os problemas encontrados deverão ter o seu correspondente ciclo de vida definido, conforme a seção 3.2.2 Controle de mudanças. Deve-se fazer a customização do ciclo de vida da ferramenta JIRA visando a adequação a estrutura definida
nesse documento.
</p>
