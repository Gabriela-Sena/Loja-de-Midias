# Loja-de-Midias

Desenvolvimento de um sistema de vendas para uma loja de Mídias. Este é um esboço do sistema, sem interface gráfica, possui somente suas classes básicas.

### Classes, atributos e considerações: 

- Classe Produto = é uma interface que possui 2 métodos: um método para retornar o nome, outro para retornar o preço. Os métodos relacionados à interface Produto, e o cálculo do preço
leva em consideração a duração em minutos multiplicado por 0.3.

- Classe abstrata Mídia = implementa a interface Produto, mas não
implementa seus métodos por ser uma classe abstrata. Possui a variável privada capacidade, método construtor, get e toString para apresentação.

- Classe CD = herda de Midia, possuindo variáveis referente a interface Produto,  variável referente ao número de faixas, implementação de seus métodos e método toString. O cálculo do valor do produto leva em consideração o número de faixas multiplicado por 1.5.

- Classe DVD = herda de Midia, possui a variável duração, métodos construtor, get e toString. 

- Classe Livro = implementa a interface Produto, tendo as variáveis autor e número de páginas, com seus respectivos métodos get, método construtor e toString. O cálculo do valor do produto leva em consideração o número de páginas multiplicado por 0.12.

- Classe ProdutoTeste = utilizada para testar os objetos. Nela foi Implementado um menu que permite ao usuário inserir um CD, DVD ou Livro e listar todos os produtos com seus dados. Eles devem ser inseridos em um ArrayList.