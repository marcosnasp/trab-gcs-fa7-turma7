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
Este documento está organizado em seções. A seção 1 oferece uma visão geral de todo o documento. Ela inclui a finalidade, o escopo, as definições, os acrônimos, as abreviações, as referências e uma visão geral deste Plano de Gerenciamento de Configuração.<p>

A seção 2 descreve quem será o responsável pela execução das diversas atividades de CM, as ferramentas e os procedimentos necessários para o controle de versão dos itens de configuração gerados no ciclo de vida do projeto.

A seção 3  descreve como os itens de configuração devem ser identificados, as Baselines do projeto,a estrutura do repositório e a organização dos itens dentro do repositório.

A seção 4 define os padrões e procedimentos que devem ser seguidos no projeto.

A seção 5 descreve as ferramentas de software, o pessoal e o treinamento necessários para implementar as atividades de CM especificadas.

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

Para o projeto deverá ser selecionado o _Gerente de Projeto_ para facilitar e acompanhar a execução do _Processo e Aprovação de Solicitação de Mudança_.

A detecção de necessidades de mudanças e formalização das solicitações das mudanças da _baselines_ serão realizadas pelos membros da equipe do projeto autorizado a solicitar através da ferramenta _Issue_ disponibilizada pelo GitHub através do endereço do repositório do _projeto_ e submete o mesmo ao _Comitê de Controle de Mudanças_ na qual terá o seguinte fluxo.

![Fluxo de Solicitações de Mudanças](https://raw.github.com/marcosnasp/trab-gcs-fa7-turma7/branch-elias/trabalho/FluxoStatusMudanca.png)

#### Tabela de Status do Issues

Os possíveis status das mudanças estão especificado na tabela abaixo.

| Atividade         | Descrição                                                                   |
|-------------------|-----------------------------------------------------------------------------|
| Aberto            | Solicitação de mudança aberto mas ainda não foi aprovado.                   |
| Em Analise        | Solicitação de mudança aguardando aprovação do _Comitê de Controle de Mudança_. |
| Analisado         | Aguardando desenvolvimento.                                                 |
| Em desenvolvmento | Requisição de mudança aprovada e trabalho em andamento.                     |
| Desenvolvido      | Mudança solicitada implementada e em revisão para entrar na fase de testes. |
| Em teste          | Mudança solicitada em fase de testes.                                       |
| Teste com erro    | Solicitação aguardando finalização.                                         |
| Finalizado        | Mudança solicitada implementada, testada com atualizações realizadas.       |
| Rejeitada         | Requisição de mudança rejeitada pelo Comitê de Controle de Mudanças.        |

### 3.2.2 Comitê de Controle de Mudança (CCB)
_[Descreva a participação e os procedimentos para processar solicitações e aprovações de mudança a serem seguidos pelo CCB. Informe quem são os membros do CCB e suas responsabilidades.]_

O Comitê de Controle de Mudança do projeto terá as seguintes responsabilidades:

* Manter o Plano de Gerenciamento de Configuração.
* Gerenciar Repositórios de Itens de Configuração do projeto.
* Identificar Itens de Configurações do projeto documentando suas características.
* Controlar e facilitar mudanças nas características dos Itens de Configuração.
* Receber e rever todos os Formulários de Manutenção de ICs \(inclusão, alteração e exclusão de IC\), verificando se informações adicionais são necessárias e enviando para o administrador técnico realizar pré-análise.
* Garantir que as ações sejam tomadas dentro dos prazos previstos, fornecendo sugestões relacionados e versionamento quando couber.
* Criar pacotes e versões de aplicações, realizando promoções quando solicitado.
* Reportar ao Gerente de Projeto _status_ de aprovações de todas as mudanças propostas e todas as mudanças aprovadas.
* Realizar auditorias para verificar ou inspeções por amostragem para verificar se o projeto está efetivamente seguindo o previsto no Plano de Gerenciamento de Configuração.

Além destas responsabilidades, o Comitê de Configuração de Mudança é responsável pelo gerenciamento de todos os _Itens de Configuração das Baselines_ do projeto, incluindo software, hardware e documentação.

A tabela abaixo relaciona os papéis, responsabilidades e responsáveis definidos para o projeto.

| Papel | Responsabilidade | Responsável | E-mail |
|-------|------------------|-------------|--------|
| Responsável pelos documentos do projeto | Mater e atualizar os artefatos \( _Requisição de alteração na Baseline e Intens de Configuração, Plano de Projeto de Software, Plano de Gerenciamento de Configuração, Plano de Gerencimanto de Qualidade, Plano de Gerenciamento de Requisitos, Plano de Gerenciamento de Riscos, Glosário do Projeto, Especificação de Caso de Uso, Plano de testes, Planilha de Acompanhamento de Mudanças, Formulário de solicitação de mudança e Relatório de Controle de Mudança._\), mantidos no repositório de documentos do projeto. | _Aguardando definições_ | nome.sobrenome@email.com |
| Responsável pelos requisitos | Manter e atualizar o repositório de requisitos do projeto. | _Aguardando definições_ | nome.sobrenome@email.com |
| Responsável pela configuração do software | Promover versões de software e fornecer componentes solicitados pela equipe de desenvolvimento. | _Aguardando definições_ | nome.sobrenome@email.com |
| Administrador técnico do sistema | Manter e rastrear componentes do sistema \- Monitorar o desenvolvimento, garantindo integridade técnica e consistênca com os requisitos e arquitetura do sistema \- Rever solicitações de mudanças e auxiliar na avaliação para o CCB \- Verificar relatórios de problemas para resolver questões de prioridades. | _Aguardando definições_ | nome.sobrenome@email.com |

4. Padrões e Procedimentos
==========================
_[Descreva os padrões e procedimentos que devem ser seguidos no projeto. Crie subseções se achar necessário, para organizá-los melhor.]_



5. Treinamento e Recursos
=========================
_[Descreva as ferramentas de software, o pessoal e o treinamento necessários para implementar as atividades de CM especificadas.]_



6. Auditorias de Configuração
=============================
_[Descreva o cronograma das auditorias de configuração e o que será verificado. Informe também como serão reportados os problemas encontrados e onde sera feito o acompanhamento dos itens corretivos.]_
