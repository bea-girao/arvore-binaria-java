package arvore_binaria;

public class Main {

	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária
	      a.insere(555,"A");
	      a.insere(333,"B"); 
	      a.insere(111,"C"); 
	      a.insere(444,"D");
	      a.insere(888,"E");
	      a.insere(999,"F"); 
	      a.insere(222, "G");
	      a.insere(666, "H");

	    a.imprimeElementosArvore();
	    //System.out.println("Altura da arvore " + a.alturaArvore());
	    a.totalEsquerda();
	  }

}