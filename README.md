<h1> Trabalho 4 - Construção de Compiladores </h1>

Repositório destinado ao trabalho 4 da disciplina de compiladores ministrada pelo professor Daniel Lucrédio. O trabalho 4 da disciplina consiste em implementar um compilador completo para uma linguagem de sua escolha.

<h2> Descrição da Linguagem</h2>
<p>Escolhemos desenvolver uma linguagem voltada para a construção de uma ficha de dieta, feita por um profissional da área da nutrição.</p>
<p>Dado o nome do profissional, CRN, especialidade, nome do cliente, data da emissão da ficha, endereço, telefone e a dieta, o programa retorna um arquivo HTML com a ficha completa.</p>

<h2> Membros do Grupo </h2>
<ol>
  <li> Daniel Lamounier Heringer, RA: 743524 </li>
  <li> João Gabriel Damasceno, RA: 726545 </li>
  <li> Sergio Ricardo Hideki Nisikava, RA: 551848 </li>
</ol>
<h2> Dependencias </h2>

<ol>
  <li> Netbeans 12.0 </li>
  <li> JDK 11.0.8 </li>
  <li> Maven 8 </li>
  <li> ANTLR 4.8 </li>
</ol>

<h2> Compilação </h2>
<ol>
  <li>Primeiramente instalar o programa NetBeans, onde pode ser encontrado no seguinte link: https://netbeans.org/.</li>
  <li>Instalado o NetBeans, descompactar o projeto em qualquer diretório.</li>
  <li>Descompactado o projeto, abrir o Netbeans e abrir o projeto baixado.</li>
  <li>Em seguida, utilizar a ferramenta Clean and Build para o projeto.</li>
</ol>
<h2> Execução </h2>
<p>Após utilizar a ferramenta Clean and Build para o projeto, será gerado o arquivo executável do projeto.
O arquivo executável diretorio\target\linguagemDIETA-1.0-SNAPSHOT-jar-with-dependencies.jar que deverá ser executado da seguinte forma:</p>

```
java -jar arquivo_executavel entrada saida.txt
```
Onde:

<ol>
  <li> arquivo_executavel: caminho do arquivo .jar contendo as dependências </li>
  <li> entrada: caminho do caso de teste de entrada </li>
  <li> saida.txt: caminho para o arquivo de saída ser gerado</li>
</ol>
 
 exemplo: 
 ```
java -jar C:\Users\joaog\Documents\NetBeansProjects\la-semantico\target\la-semantico-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Users\joaog\Desktop\programa2.txt C:\temp\saida.txt
 ```
 
 <h2>Casos de Testes</h2>
 <p> O projeto contém casos de testes predeterminados, contidos na pasta casos_de_testes_t4. Nessa pasta, há 4 tipos de casos de testes: léxico, sintático, semântico e o gerador HTML da ficha. E, para utilizá-los, seguir o passo 2 da Execução.</p>
 <p> A saída esperada está contida na pasta saida dos respectivos testes. A ideia é comparar a sua saída com a saída esperada </p>
