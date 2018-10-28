package Fila;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Fila f = new Fila();

		for (int i = 0; i < 5; i++) {

		f.entrar(Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para entrar na fila")));

		}
		
		
		
		JOptionPane.showMessageDialog(null, f.listar());
		
		for (int i = 0; i < 2; i++) {

		f.sair(Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para sair da fila")));
		
		}
		
		JOptionPane.showMessageDialog(null, f.listar());
	}

}
