package arvore_binaria;

public class ArvoreBinaria {
	  private No raiz;
	  Integer contador = 0;
	  Integer esquerda = 0;
	  
	  public ArvoreBinaria() // construtor da classe Arvore Binaria
	  {
	    this.raiz = null; // inicia a árvore vazia
	  }
	  public void insere(long id, Object elemento) // método para inserção de elemento
	  {
	    No novoNo = new No(id,elemento,null,null);
	    if (raiz == null) {
	      raiz = novoNo;
	    } else {
	      
	      No atual = raiz; No pai;
	      while (true) {
	        
	        pai = atual;
	        
	        if (id < atual.getId()) { // vai inserir à esquerda
	          atual = atual.getEsq();
	          
	          if (atual == null) { // pode inserir à esquerda
	            pai.setEsq(novoNo);
	            return;
	          } // se não é nulo, vai tentar o próximo filho
	        } else { // vai inserir à direita
	          
	          atual = atual.getDir();
	          
	          if (atual == null) { // pode inserir à direita
	            pai.setDir(novoNo);
	            return;
	          }
	        }
	      }
	    }
	  } // final método insere
	  private Integer contadorEsq(No atual) // caminhamento pré-fixado da árvore binária
	  {
	    if (atual != null) {
	      contadorEsq(atual.getDir());
	      contadorEsq(atual.getEsq());
			if(atual.getEsq() != null)
			{		
				 esquerda++;
			}		
	    } return esquerda;
	    
	  } // final método
	  public void totalEsquerda() // impressão dos elementos da árvore
	  {
	    contadorEsq(raiz);
		System.out.println("Número de nos a esquerda " + esquerda);
	  }

	  private void preFixado(No atual) // caminhamento pré-fixado da árvore binária 
	  {
	//Esse objeto e usado para somar e subtrair valor da variavel contador
		String recuo = new String(new char[contador]).replace("\0", "\t");

	    if (atual != null) {
		  contador++;
	//a variavel repete aqui e usada para determinar a posição da raiz
	      System.out.println(recuo + atual.getId());
	      preFixado(atual.getEsq());	  
	      preFixado(atual.getDir());
		  contador--;
	    }
		if(atual == null){
			System.out.println(recuo+"-");
		}

	  } 
	  // final método preFixado

	  public void imprimeElementosArvore() // impressão dos elementos da árvore
	  {
	    preFixado(raiz);
	  } 
}
