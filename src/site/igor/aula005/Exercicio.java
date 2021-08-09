package Aula005A;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ContaBanco cb = new ContaBanco();
		ContaBanco cb2 = new ContaBanco();
		String resp,nome;
		
		cb.setDono("Igor Rafael");
		cb.getDono();
		
		cb.setNumConta("123456");
		cb.getNumConta();		
		
		cb.abrirConta("CP");
		
		
		cb.depositar(100);
		cb.sacar(100);	
		cb.sacar(150);
		
		cb.fecharConta();
		System.out.println("========================================================");
		cb.mostrarInfo();	
		
		
		System.out.println("========================================================");
		System.out.println("========================================================"); 
		cb2.setDono("Gabriela");
		cb2.getDono();
		
		cb2.setNumConta("654321");
		cb2.getNumConta();				
		
		cb2.abrirConta("CC");	
		
		cb2.depositar(1000);
		cb2.sacar(400);
		cb2.sacar(650);
		
		cb2.fecharConta();
		System.out.println("========================================================");
		
		cb2.mostrarInfo();
	}

}
