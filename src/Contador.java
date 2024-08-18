import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
		
                System.out.println("Digite o primeiro parâmetro");
		int parametroUm = ler.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = ler.nextInt();
		
		try {
                    //chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException  exception) {
                    //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                    System.out.println(exception.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException  {
		//Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		//Imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
		for(int i=1; i <= contagem; i++) {
			System.out.println( i);
		}
    }
}
