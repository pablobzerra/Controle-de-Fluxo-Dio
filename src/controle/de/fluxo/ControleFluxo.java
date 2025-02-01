package controle.de.fluxo;

import java.util.Scanner;

import controle.de.fluxo.exceptions.ParametrosInvalidosException;

class ControleFluxo extends ParametrosInvalidosException{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro param: ");
        int param1 = terminal.nextInt();

        System.out.println("\nDigite o segundo param: ");
        int param2 = terminal.nextInt();


        try {
            contador(param1, param2);
        } catch(ParametrosInvalidosException e) {
            System.err.println("Primeiro param tem que ser maior que o segundo");
        }


    }


    static void contador(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            int calc =  param1 - param2;
            System.out.println("Contando ate " + calc);

            for (int i=1; i < calc; i++) {
                System.out.println("Imprimindo o numero: " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
