/*Crie uma classe que represente uma Conta Corrente, 
devendo ter as propriedades 
Número da Conta, Agência, Saldo, Nome do Titular 
e os métodos Depósito, Saque e Saldo Total.*/

import java.util.Scanner;

public class contabancaria {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int conta, agencia;
        String nome;
        float saldo = 0;

        System.out.println("Vamos criar sua conta!\n");
        System.out.println("Digite o seu nome completo");
        System.out.print("--> ");
        nome = sc.nextLine();
        System.out.println("\nDigite o numero da sua conta");
        System.out.print("--> ");
        conta = sc.nextInt();
        System.out.println("\nDigite o numero da agencia da sua conta");
        System.out.print("--> ");
        agencia = sc.nextInt();
        

        System.out.println("\n\n\nConta criada com sucesso!");
        System.out.println("\nSeus dados são:");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo + "\n\n");

        int op = 0;
        do{
            System.out.println("Oque voce deseja fazer?\n");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Saldo Total");
            op = sc.nextInt();
            while( op > 3){
                System.out.println("Opção invalida, digite novamente!");
                op = sc.nextInt();
            }
            switch(op){
                case 1:{
                    System.out.println("Voce escolheu Depósito!\n");
                    System.out.println("Qual valor voce quer depositar?");
                    System.out.print("--> ");
                    float deposito = sc.nextFloat();
                    saldo = saldo + deposito;
                    System.out.println("Deposito de R$" + deposito + " realizado com sucesso!!");
                    System.out.println("\nSeu saldo atual é: R$" + saldo + "\n");
                    break;
                }
                case 2:{
                    System.out.println("Voce escolheu Saque\n");
                    System.out.println("Qual valor voce quer sacar");
                    System.out.print("--> ");
                    float sacar = sc.nextFloat();
                    while (sacar > saldo){
                        System.out.println("Valor de saque maior que de saldo, informe um valor válido!");
                        sacar = sc.nextFloat();
                    }
                        saldo = saldo - sacar;
                        System.out.println("Saque de R$" + sacar + " realizado com sucesso!!");
                        System.out.println("\nSeu saldo atual é: R$" + saldo + "\n");
                    
                    System.out.println("Saque de R$" + sacar + " realizado com sucesso!!");
                    System.out.println("\nSeu saldo atual é: R$" + saldo + "\n");
                }
                case 3:{
                    System.out.println("Voce escolheu Saldo total\n");
                    System.out.println("Seu Saldo total é: R$" + saldo + "\n");
                }
            }
        } while (op != 0);
    }
}
