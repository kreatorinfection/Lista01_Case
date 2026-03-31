package pctCase;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        int opcao;
	        int quantidade;
	        double preco = 0.0, total, desconto = 0.0;

	        System.out.println("Menu:");
	        System.out.println("1 - Hambúrguer (R$ 15)");
	        System.out.println("2 - Pizza (R$ 20)");
	        System.out.println("3 - Refrigerante (R$ 5)");

	        System.out.print("Digite a opção desejada (1, 2 ou 3): ");
	        opcao = sc.nextInt();

	        System.out.print("Digite a quantidade: ");
	        quantidade = sc.nextInt();

	        switch(opcao) {
	            case 1:
	                preco = 15.0;
	                break;
	            case 2:
	                preco = 20.0;
	                break;
	            case 3:
	                preco = 5.0;
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                sc.close();
	                return;
	        }

	        total = preco * quantidade;

	        if (quantidade >= 3) {
	            desconto = total * 0.10;
	            total = total - desconto;
	            System.out.printf("Você ganhou 10%% de desconto!%n");
	        }

	        System.out.printf("O valor final é: R$ " + total);
	        sc.close();
	    }
	}
		
	
