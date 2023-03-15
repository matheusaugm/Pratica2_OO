Programação Orientada a Objetos

Prática 2

3º período

Professora: Michelle Hanne

**Orientações**

\1) Criar uma conta no GitHub - <https://github\.com/>

\2) Criar um repositório Público no GitHub com o nome **Prática2_OO**

\3) Subir os arquivos para o repositório criado

\4) Enviar o link do repositório na tarefa do Canvas\.

**OBS:** O envio deverá ser realizado individualmente

**Questão 1 - Estoque**

Escreva uma classe em Java chamada Estoque. Ela deverá possuir:

a) os atributos **nome (string)**, **qtdAtual (int)** e **qtdMinima (int) do tipo private.**

b) um construtor sem parâmetros

c) um construtor contendo os parâmetros **nome, qtdAtual e qtdMínima.**

d) Os métodos settters e getters.

e) os métodos com as seguintes assinaturas:

**void darBaixa(int qtde)**

**String mostra()**

**boolean precisaRepor()**

**Questão 1 - Estoque**

O método **darBaixa(int qtde)** recebe uma quantidade e atualiza o estoque.

Porém, o estoque não poderá ficar negativo.

O método **mostra()** retorna uma String contendo o **nome do produto, sua quantidade**

**mínima, sua quantidade atual.**

O método **precisaRepor()** retorna _true_ caso a quantidade **atual esteja menor ou igual à**

**quantidade mínima** e _false_, caso contrário.

f) Escreva um main que entre com os dados solicitados pelo construtor. Movimente o

estoque e utilize a chamada dos métodos criados.

**Questão 2 - Rendimento**

**Criar uma classe para calcular rendimentos de um investimento de acordo com uma**

**taxa fixa ao mês.** A classe deverá possuir o construtor com **investimento inicial, taxa do**

**rendimento e número de meses**. Fazer um método para calcular e mostrar o

rendimento.

**No main:**

Ler as variáveis utilizando a classe Scanner e instanciar um objeto com os valores.

Chamar o método que mostra o rendimento.

**Questão 2 - Rendimento**

**Exemplo:**

Investimento: R$ 1.000,00

Taxa do Rendimento: 2% a/m

Número de meses: 12
