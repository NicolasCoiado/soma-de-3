import java.util.Scanner;
public class SomaDe3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int n2 = sc.nextInt();
        System.out.print("Digite só mais um número inteiro: ");
        int n3 = sc.nextInt();
        System.out.print("A soma desses números é igual a: ");
        imprimir(n1,n2,n3);
        sc.close();
    }

    public static void imprimir(int n1, int n2, int n3) {
        int soma = n1+n2+n3;
        System.out.print(soma);

    }
}
