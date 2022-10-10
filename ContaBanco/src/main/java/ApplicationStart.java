import java.util.Scanner;

public class ApplicationStart{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String cliente = get.next();
        System.out.println("Digite o número ");
        int numero = get.nextInt();
        System.out.println("Digite a agência do cliente: ");
        String agencia = get.next();
        System.out.println("Digite o saldo da conta: ");
        double saldo = get.nextDouble();
        System.out.println("\n" + "");
        System.out.println("Olá "+cliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque");

        get.close();

    }
}