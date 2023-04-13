import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double salario, aumento = 0, salarioBruto, impostoIR = 0, impostoINSS = 0, salarioIR, salarioINSS, salarioFinal = 0, perdas = 0;
		int i = 0;
		
		
		do {
			System.out.println("Informe o nome" );			
			nome = sc.next();
			System.out.println("Informe o salário" );
			salario = sc.nextDouble();			
			
			if(salario > 15000) {
				aumento = (salario * 9.93)/100;
			} else if (salario > 10000) {
				aumento = (salario * 8.75)/100;
			} else if (salario > 5000) {
				aumento = (salario * 8.25)/100;
			} else if (salario > 4000) {
				aumento = (salario * 8.20)/100;
			} else if (salario > 1000) {
				aumento = (salario * 3.8)/100;
			}
			
			salarioBruto = salario + aumento;
			
			if (salarioBruto > 15000) {
				impostoIR = (salarioBruto * 0.3);
				if (impostoIR > 5000) {
					impostoIR = 5000;
					
				}
			} else if (salarioBruto > 10000) {
				impostoIR = (salarioBruto * 0.2);
				if (impostoIR > 3000) {
					impostoIR = 3000;
				}
					
			} else if (salarioBruto > 5000) {
				impostoIR = (salarioBruto * 0.1);
				if (impostoIR > 1000) {
					impostoIR = 1000;
				}
											
			}
			salarioIR = salarioBruto - impostoIR;
			
			if (salarioIR > 15000) {
				impostoINSS = (salarioIR * 0.12);
				if (impostoINSS > 5000) {
					impostoINSS = 5000;
				}
			} else if (salarioIR > 7500) {
				impostoINSS = (salarioIR * 0.1);
				if (impostoINSS > 2500) {
					impostoINSS = 2500;
				}
			} else if (salarioIR > 3750) {
				impostoINSS = (salarioIR * 0.09);
				if (impostoINSS > 500) {
					impostoINSS = 500;
				}
			} else {
				impostoINSS = (salarioIR * 0.05);
				if (impostoINSS > 250) {
					impostoINSS = 250;
				}
			}
			
			salarioINSS = salarioIR - impostoINSS;
			salarioFinal = salarioINSS + 1000;
			perdas = salarioFinal - salario;
			
			System.out.println("Coloborador: " + nome);
			System.out.println("Salario Atual: " + salario);
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Salario bruto apos aumento: " + salarioBruto);
			System.out.println("Desconto do IR: " + impostoIR);
			System.out.println("Desconto do INSS: " + impostoINSS);
			System.out.println("Salario apurado apos os descontos: " + salarioINSS);
			System.out.println("Salario final do colaborador: " + salarioFinal);
			System.out.println("Perdas: " + perdas);
			
			
					
		
		i++;
		} while(i < 4);

	}

}