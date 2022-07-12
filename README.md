### Atividade do curso de Análise e Desenvolvimento de Sistemas, disciplina de Estrutura de Dados.

---
## ***Enunciado**
---

Um tipo abstrato de dados para representar uma árvore binária é apresentado abaixo, considere que as classes já estão implementadas corretamente:

public class No {
 private long id; 
 private No esq,dir; 
 public No(long id, No esq, No dir){
 this.id = id; this.esq = esq; this.dir = dir;
 }
 public long getId() { return this.id; }
 public No getEsq() { return esq; }
 public No getDir() { return dir; }
}
public class ArvoreBinaria {
 private No raiz;
 public ArvoreBinaria() { this.raiz = null; }
. .// outros métodos . . . .

- Dada uma árvore binária com nós já inseridos, um nó é da esquerda festiva se ele for filho esquerdo de algum outro nó (abaixo os nós marcados são da esquerda festiva). Implemente um método na classe ArvoreBinaria que conta e retorna o número de nós da esquerda festiva de uma árvore binária. Para o exemplo abaixo o método retorna 5.

![ilustrando a árvore binária](/arvore-binaria-java/img/arvore1.JPG)

- Implemente um método na classe ArvoreBinaria que imprima os id de uma 
árvore binária com recuos de margem proporcionais ao nível do nó. Por exemplo, 
para a árvore binária abaixo:

![imprimindo os id's da árvore binária](//arvore-binaria-java/img/arvore2.JPG)

Temos a seguinte saída, os caracteres ‘-‘ representa null.
555
    333
        111
            -
            -
        444
            -
            -
    888
        -
        999
            -
            -