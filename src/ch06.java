import java.util.Scanner;

// 2739 구구단
public class ch06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(N + " * " + (i + 1) + " = " + N * (i + 1));
        }
    }
}
