import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        int x;
        
        x = sc.nextInt();

        System.out.println("Voce digitou " + x);

        sc.close();
    }
}
