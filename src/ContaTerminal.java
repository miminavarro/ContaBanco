
import java.util.Scanner;

    public class ContaTerminal {

        public static void main(String[] args) {

            Scanner esc = new Scanner(System.in);
            
            System.out.println("************CONTA CLIENTE************");
            System.out.println();

            System.out.println("Por favor, digite o número da Conta: Exemplo:(1021)");
            int numero = esc.nextInt();

            System.out.println("Digite o número da Agência: Exemplo:(067-8)");
            String agencia = esc.next();

            System.out.println("Digite seu nome completo: ");
            String nomeCliente = esc.next();
            esc.nextLine();

            System.out.println("Digite o seu saldo atual: Exemplo:(237,48)");
            double saldo = esc.nextDouble();

            System.out.println();
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
                    + "sua agência é %s, " + "conta %d "
                    + "e seu saldo de R$ %.2f " + "já está disponível"
                    + " para saque.", nomeCliente, agencia, numero, saldo);

            esc.close();
        }

    }
