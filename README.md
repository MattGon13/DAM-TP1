# Assignment 1 - Getting Started with Kotlin / Exploring Kotlin Again
Course: Desenvolvimento de Aplicações Móveis (DAM)
Student(s): Matilde Gonçalves (51706) 
Date: 08/03/2026
Repository URL: [Insert Your GitHub Repo URL]

## 1. Introduction
Este primeiro trabalho tinha como propósito principal, introduzir os conceitos básicos de programação com a linguagem Kotlin como tipos básicos, controlo de fluxo e classes e objetos. Isto foi feito através da realização de quatro exercícios onde deveríamos explorar a documentação oficial da linguagem e aplicá-la nos mesmos, de modo a explorar os conceitos básicos da linguagem. Os objetivos deste trabalho foram então realizar de forma independente os três exercícios propostos usando as bases de Kotlin que obtivemos durante as aulas e, adicionalmente, explorar a documentação da linguagem de modo a obter mais bases para a resolução dos exercícios.

## 2. System Overview

Para cada um dos três exercícios foi feita uma aplicação de consola independente em Kotlin gerenciada por um projeto Maven. 
**Exercise 1**: Um programa que inicializa, dinamicamente, um array de inteiros com os primeiros 50 quadrados perfeitos através de um IntArray construtor, de um range e map e de um array com construtor. Para este exercício, foi consultada a documentação de Kotlin e usaram-se funções lambda de modo a obter os 50 primeiros quadrados perfeitos para depois serem passados para os arrays correspondentes.

**Exercise 2**: Uma calculadora baseada na consola que permite aos seus utilizadores realizarem operações como operações aritméticas básicas, operações booleanas (AND, OR, NOT) e bitwise shifts, mostrando os resultados em decimal, hexadecimal e booleano. Para tal, foi usada a expressão “when” para lidar com as diferentes operações escolhidas pelo utilizador e exceções de modo a lidar com possíveis erros associados ao input do utilizador, como colocar operadores que não existem ou não que estão disponíveis, e lidar com erros associados a operações como divisões por zero. Para promover uma melhor experiência ao utilizador, foram usadas string templates para os outputs da aplicação. 

**Exercise 3**: Um simulador de física que demonstra as alturas que uma bola consegue atingir após ser largada a uma altura de cem metros usando sequências. Na realização deste exercício foi usada a função “generateSequence” de modo a gerar a sequência através de uma expressão/cálculo.

**Exercise 4**: Um sistema para gerenciar bibliotecas, tratando de todo o tipo de livros e operações associadas a bibliotecas. Este sistema foi realizado tendo em conta os princípios básicos de programação como herança e encapsulamento, bem como o conhecimento obtido através da documentação da linguagem sobre classes e objetos.

## 3. Architecture and Design
O projeto usa uma estrutura padrão de Kotlin packages. Tal como foi explicitado no enunciado, os exercícios estão divididos em quatro packages: “dam.exer_1”, “dam.exer_2”, “dam.exer_3” e “virtual_library”. Cada package contém um ficheiro “.kt” com uma função main de modo a se poder executar e testar facilmente o código realizado.

## 4. Implementation
**Exercise 1 (`exer_1.kt`)**: Implementa um programa que inicializa, dinamicamente, um array de inteiros com os primeiros 50 quadrados perfeitos através de um IntArray construtor, de um range e a função map e de um array com construtor. Para este exercício, foram utilizadas expressões lambda como  (`{ it -> (it+1) * (it+1) }`) para obter dinamicamente os valores dos primeiros 50 quadrados perfeitos e, posteriormente, foram usados os construtores e a função “map” para passar os valores obtidos para arrays.

**Exercise 2 (`exer_2.kt`)**: A implementação da calculadora foi feita através da explicitação de comandos ao utilizador através de prints e obtenção do input que continha a operação a realizar através da função “readln”. Foi usada a expressão “when” de modo a lidar com cada tipo de operação escolhida pelo utilizador, onde eram posteriormente obtidos os operandos através de funções auxiliares que tinham o papel de modularizar a parte de ler inputs do utilizador. Além disso, foram implementadas funções para calcular e fornecer o resultado de cada operação através de string templates em formato decimal, hexadecimal e booleano. Foram adicionadas também exceções para que a calculadora pudesse lidar com erros como inputs inválidos e operações impossíveis/inválidas, onde se deu feedback esclarecedor ao utilizador através de prints.

**Exercise 3 (`exer_3.kt`)**: A implementação do simulador de física foi feito através da função “generateSequence”, onde foi dada a altura inicial da bola (100 metros) e uma expressão lambda com a fórmula como as seguintes alturas deveriam ser calculadas (`if(it * 0.60 > 1) it * 0.60 else null`) de modo a que se obtivessem todas as alturas não inferiores a um metro. De seguida, foram retiradas as primeiras 15 alturas da sequência com a função ”take”, que foram colocadas numa lista. Por fim, arredondaram-se todos os elementos da lista a duas casas decimais através da função “setScale”.

**Exercise 4 (`virtual_library.kt`)**: A implementação dos sistema de gerenciamento de bibliotecas foi feita criando cada classe e método referidos no enunciado e seguindo as os princípios de programação orientada a objetos como a herança e o encapsulamento. Para tal, foi consultada a documentação da linguagem Kotlin. 
O encapsulamento foi conseguido em cada classe, colocando as propriedades dessa classe inacessíveis a outras classes diretamente, usando o modificador de visibilidade “private”, mas fornecendo getters e setters com visibilidade pública de modo a que as outras classes pudessem aceder e modificar as propriedades da classe de forma controlada.
Já a herança foi aplicada através da criação da super classe “Book”, que continha todos os atributos e métodos comuns a todos os tipos de livros da biblioteca, e da criação das subclasses “PhysicalBook” e “DigitalBook”, que herdaram os atributos e métodos da classe “Book” e que tinham métodos e atributos mais específicos de livros físicos e digitais.

## 5. Testing and Validation


**Exercise 1 (`exer_1.kt`)**: Como este programa era bastante simples, para o testar, apenas foram realizados prints dos resultados para a consola, verificando se os arrays obtidos estavam de acordo com o pretendido.

**Exercise 2 (`exer_2.kt`)**: Para testar a calculadora, realizaram-se todas as operações possíveis com a mesma na consola usando, inicialmente, inputs corretos, para verificar se estava a realizar as operações corretamente, e depois inputs incorretos, para verificar se lidava bem com inputs inválidos. Um exemplo de um caso de teste (test case) foi pedir à calculadora que fizesse uma multiplicação de dois por dois, em que o resultado esperado seria quatro. Já exemplo de um edge case foi pedir à calculadora que realizasse uma divisão por zero, em que o resultado esperado seria a mesma indicar que a operação era inválida/impossível e dar oportunidade ao utilizador para tentar de novo. A limitação deste programa é o facto de a calculadora só conseguir realizar uma operação de cada vez, e ter sequências de input por uma ordem específica, não permitindo ao utilizador escrever as operações de forma livre.

**Exercise 3 (`exer_3.kt`)**: Tal como no caso do primeiro exercício, este exercício também era bastante simples de testar, visto que não havia variações de inputs ou outras mudanças. Por isso, para testar o programa, apenas foi feito um print de modo a mostrar a lista obtida no final e confirmou-se que os resultados estavam corretos. 

**Exercise 4 (`virtual_library.kt`)**: Para testar este sistema, foi usado o exemplo de uso “Example Usage” presente no enunciado do trabalho que continha a criação de vários objetos e métodos essenciais e foi comparado o resultado obtido através desse teste com o resultado esperado para o teste presente também no enunciado (“Expected Console Output”). Um exemplo de edge case foi tentar requisitar um livro que já não tinha mais cópias disponíveis (library.borrowBook("1984")), em que o resultado esperado era o sistema avisar o utilizador que não poderia realizar essa ação devido a não haver mais cópias do livro.

## 6. Usage Instructions
Para correr cada um destes exercícios poderá seguir estes passos:
1. Abrir o projeto `DAM_TP1` no IntelliJ IDEA.
2. Navegar até à diretoria `src/main/kotlin/dam`.
3. Correr os exercícios um, dois e três, abrindo os ficheiros `exer_1.kt`, `exer_2.kt`, ou `exer_3.kt` (presentes nos packages com o mesmo nome), respetivamente, e clicar no triângulo verde no topo do ecrã (botão “Run”). Correr o exercício da biblioteca virtual, abrindo o ficheiro `Test.kt` (presente no package “virtual_library”) e clicar no triângulo verde no topo do ecrã (botão “Run”).
4. Para testar a calculadora (exer_2.kt), basta interagir com a consola que vai aparecer no fundo do ecrã, seguindo as instruções dadas.

# Development Process

## 12. Version Control and Commit History
O desenvolvimento de cada exercício foi seguido e guardado através de um repositório Git local. No início foi feito um commit inicial e à medida que era cumprindo um exercício, era feito um commit, no caso de exercícios mais simples. Já no caso do exercício da biblioteca pessoal, foram feitos vários commits, devido a ser um exercício mais complexo. Infelizmente, como inicialmente pensei que apenas seria realizado um repositório para todos os exercícios do enunciado e depois tive de separar os exercícios em diferentes repositórios, perderam-se alguns commits e existem alguns commits baralhados.

## 13. Difficulties and Lessons Learned
As maiores dificuldades que foram sentidas durante o desenvolvimento destes exercícios, foi mais associada ao facto de não ter muito contacto com a linguagem Kotlin na altura, e por isso haver partes que tive de aprender através da documentação da linguagem. Tirando isso, outra dificuldade menos significativa associada a estes exercícios foi identificar e tratar de todos as exceções possíveis na calculadora de forma a que a mesma continuasse a funcionar independentemente das operações inválidas do utilizador.
Especialmente com as dificuldades sentidas inicialmente derivadas do pouco conhecimento de Kotlin, consegui aprender mais aspetos sobre a linguagem e o seu funcionamento.

## 14. Future Improvements
No exercício da calculadora, o programa podia ter sido optimizado de modo a permitir que o utilizador pudesse escrever as operações por si e não usando a ordem pré definida pela calculadora. Além disso, o utilizador deveria poder pedir por várias operações de uma só vez, tal como acontece numa calculadora real.

## 15. AI Usage Disclosure 
Tal como foi proposto no enunciado, nenhum destes exercícios foi desenvolvido usando inteligência artificial ou autocomplete.
