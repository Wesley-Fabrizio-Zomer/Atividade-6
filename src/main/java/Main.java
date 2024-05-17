import java.util.Scanner;

public class Main{ 
  public static void main(String[] args) { Scanner scan = new Scanner(System.in);


    System.out.print("Digite a cotação do dólar: ");
    double cotacaoDolar = scan.nextDouble();

    System.out.print("Digite o valor em dólares: ");
    double valorDolares = scan.nextDouble();

    double valorReais = valorDolares * cotacaoDolar;

    System.out.println("O valor em reais é: R$ " + valorReais);

    scan.close();
}
}