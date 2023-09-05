import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
        
            try{
            contar(parametroUm, parametroDois);
            } 
            //catch (ParametrosInvalidosException e){
                //System.out.println("O primeiro parametro deve ser maior que o segundo");
           // }
        }

        static void contar(int parametroUm, int parametroDois ){//} throws ParametrosInvalidosException {
		int numero = 1;

            if (parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
		
		        for ( ; numero <= contagem; ) {
                System.out.println("Imprimindo número " +numero);
                numero++;
        }
        }
    }
}

		/*try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException) {
		    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
        throw ParametrosInvalidosException();
        } else { 
		int contagem = parametroDois - parametroUm;
        for (int numeros = 1 ; numeros = contagem ; numeros++) {
            System.out.println("Imprimindo número "+numeros);
        }
        }	
    }
}*/