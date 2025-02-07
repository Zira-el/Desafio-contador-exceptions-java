import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o valor de range mínimo para a interação:");
            int numeroUm = scanner.nextInt();

            System.out.println("Digite o valor de range máximo para a interação:");
            int numeroDois = scanner.nextInt();

            entradaValida(numeroUm, numeroDois);

            contar(numeroUm, numeroDois);

            System.out.println("Contagem finalizada");
        } catch(InputMismatchException e) {
            System.err.println("Os valores dos campos precisam ser um número inteiro.");
        } catch (ExcecaoCustomizada e) {
            System.err.println("Erro personalizado: O primeiro valor deve ser menor que o segundo.");
        }
        scanner.close();
    }

    static void entradaValida (int numeroUm, int numeroDois) throws ExcecaoCustomizada {
        if(numeroUm >= numeroDois) {
            throw new ExcecaoCustomizada();
        }
    }

    private static void contar(int numeroUm, int numeroDois) {
        int contador = numeroDois - numeroUm;
        System.out.println("A contagem terá " + contador + " interações");
        for (int contando = 1; contando <= contador; contando++) {
            System.out.println("Imprimindo o número " + contando);
        }
    }
}