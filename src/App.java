import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine(); // Essa quebra de linha é necessária pra limpar a quebra de linha pendente quando se usa um "nextInt/nextDouble..."
        
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println();
        System.out.println("Dados Digitados: ");
        System.out.println(x);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
