import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
      
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");           
        }
    }
     
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int numero = 1;
        int contagem = parametroDois - parametroUm;            
        
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException(); 
        }

            for ( ; numero <= contagem; ) {
                System.out.println("Imprimindo número " + numero);
                numero++;
            }
    }   
}