package arvore_binaria;

public class ArvoreBinaria {
	  private No raiz;
	  Integer contador = 0;
	  Integer esquerda = 0;
	  
	  public ArvoreBinaria() // construtor da classe Arvore Binaria
	  {
	    this.raiz = null; // inicia a �rvore vazia
	  }
	  public void insere(long id, Object elemento) // m�todo para inser��o de elemento
	  {
	    No novoNo = new No(id,elemento,null,null);
	    if (raiz == null) {
	      raiz = novoNo;
	    } else {
	      
	      No atual = raiz; No pai;
	      while (true) {
	        
	        pai = atual;
	        
	        if (id < atual.getId()) { // vai inserir � esquerda
	          atual = atual.getEsq();
	          
	          if (atual == null) { // pode inserir � esquerda
	            pai.setEsq(novoNo);
	            return;
	          } // se n�o � nulo, vai tentar o pr�ximo filho
	        } else { // vai inserir � direita
	          
	          atual = atual.getDir();
	          
	          if (atual == null) { // pode inserir � direita
	            pai.setDir(novoNo);
	            return;
	          }
	        }
	      }
	    }
	  } // final m�todo insere
	  private Integer contadorEsq(No atual) // caminhamento pr�-fixado da �rvore bin�ria
	  {
	    if (atual != null) {
	      contadorEsq(atual.getDir());
	      contadorEsq(atual.getEsq());
			if(atual.getEsq() != null)
			{		
				 esquerda++;
			}		
	    } return esquerda;
	    
	  } // final m�todo
	  public void totalEsquerda() // impress�o dos elementos da �rvore
	  {
	    contadorEsq(raiz);
		System.out.println("N�mero de nos a esquerda " + esquerda);
	  }

	  private void preFixado(No atual) // caminhamento pr�-fixado da �rvore bin�ria 
	  {
	//Esse objeto e usado para somar e subtrair valor da variavel contador
		String recuo = new String(new char[contador]).replace("\0", "\t");

	    if (atual != null) {
		  contador++;
	//a variavel repete aqui e usada para determinar a posi��o da raiz
	      System.out.println(recuo + atual.getId());
	      preFixado(atual.getEsq());	  
	      preFixado(atual.getDir());
		  contador--;
	    }
		if(atual == null){
			System.out.println(recuo+"-");
		}

	  } 
	  // final m�todo preFixado

	  public void imprimeElementosArvore() // impress�o dos elementos da �rvore
	  {
	    preFixado(raiz);
	  } 
}
