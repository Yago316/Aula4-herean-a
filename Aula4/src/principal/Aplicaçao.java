package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entidade.Conta;
import entidade.ContaCorrente;
import entidade.ContaPoupança;

public class Aplicaçao {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		List<Conta> lista = new ArrayList<>();
		
		System.out.print("Quais contas voce quer Cadastra?: ");
		int num = scn.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			System.out.print("Digite C para Conta Corrente ou P para Conta Poupança: ");
			String x = scn.next();
			if(x.equals("C")) {
				System.out.println("Digite seu nome da Conta: " + i);
				String nome = scn.next();	
				System.out.println("Digite o numero da Conta: ");
				int numero = scn.nextInt();
				System.out.println("Digite o Saldo da Conta: ");
				double saldo = scn.nextDouble();
				System.out.println("Digite o Limite: ");
				double limite = scn.nextDouble();
				
				
				Conta  conta = new ContaCorrente(nome, numero, saldo, limite);
				
				lista.add(conta);
			}
			else {
				System.out.println("Digite seu nome da Conta: " + i);
				String nome = scn.next();	
				System.out.println("Digite o numero da Conta: ");
				int numero = scn.nextInt();
				System.out.println("Digite o Saldo da Conta: ");
				double saldo = scn.nextDouble();

				lista.add(new ContaPoupança(nome, numero, saldo));
				
			}
			
			for(Conta R : lista) {
				System.out.println(R);
			}
			
		}
	
    scn.close();
		
	}

}
