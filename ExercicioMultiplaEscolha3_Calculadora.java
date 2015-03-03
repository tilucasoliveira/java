import java.util.Scanner;


public class ExercicioMultiplaEscolha3_Calculadora {

	public static void main(String[] args) {
		// exercício by ti.LucasOliveira
	
			
		
		Scanner eoperacao = new Scanner (System.in);
		
		System.out.println("Digite uma operação: soma, subtração, multiplicação ou divisão ");
			String operacao = eoperacao.next();
		
		double N1, N2;	
		
		Scanner en1 = new Scanner (System.in);
					
			System.out.println("Digite o primeiro número ");
			N1 = en1.nextInt();	
		
		Scanner en2 = new Scanner (System.in);
				System.out.println("Digite o segundo número ");
				N2 = en2.nextInt();	
		
		
		switch (operacao) 
		{
			case "soma" :
				System.out.println(N1 + " + " + N2);
				System.out.println("= " + (N1 + N2));
				break;
			
			case "subtração":
				System.out.println(N1 + " - " + N2);
				System.out.println("= " + (N1 - N2));;
				break;
			
			case "multiplicação":
				System.out.println(N1 + " * " + N2);
				System.out.println("= " + (N1 * N2));
				break;
		
			case "divisão":
				System.out.println(N1 + " / " + N2);
				System.out.println("= " + (N1 / N2));
				break;
						
		default:
			System.out.println("Você digitou uma Operação Inválida! ");
			break;
		}
		
		
		
		
		
		
	}

}
