package Fila;

public class Fila {

	private No final_fila;

	public void entrar(int n) {
		No novo_no = new No(n);
		novo_no.prox = final_fila;
		final_fila = novo_no;

	}

	public int sair(int i) {
		No aux = final_fila;
		if (aux == null) {
			System.out.println("Fila vazia");
			return -1;
		} else {
			while (aux.prox != null) {
				aux = aux.prox;
			}
			if (aux == final_fila) {
				final_fila = null;
			} else {
				No aux2;
				aux2 = final_fila;
				while (aux2.prox != aux) {
					aux2 = aux2.prox;
				}
			}
			aux.prox = null;
		}
		return aux.conteudo;

	}
	
	public String listar () {
		No aux = final_fila;
		String fila ="";
		while(aux!= null) {
			fila = fila + " " + aux.conteudo;
			aux = aux.prox;
		}
		return fila;
	}

}
