import java.util.Scanner;

public class Prog1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.printf("%d", num1 + num2);
        in.close();
    }
}