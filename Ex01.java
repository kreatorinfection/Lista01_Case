package pctCase;

import java.util.Scanner;

public class Ex01 {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char opcao;
	        int quantidade;
	        double preco = 0.0, total;

	        System.out.println("Menu:");
	        System.out.println("A - Café (R$ 4)");
	        System.out.println("B - Suco (R$ 6)");
	        System.out.println("C - Sanduíche (R$ 10)");

	        System.out.print("Digite a opção desejada (A, B ou C): ");
	        opcao = sc.next().charAt(0);
	        opcao = Character.toUpperCase(opcao);

	        System.out.print("Digite a quantidade: ");
	        quantidade = sc.nextInt();

	        switch(opcao) {
	            case 'A':
	                preco = 4.0;
	                break;
	            case 'B':
	                preco = 6.0;
	                break;
	            case 'C':
	                preco = 10.0;
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                sc.close();
	                return;
	        }

	        total = preco * quantidade;
	        System.out.printf("O valor total é: R$ ", total);
	        sc.close();
	    }
	}
	   
	  
