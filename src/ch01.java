import java.util.Scanner;

// 2753 윤년
public class ch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year%4==0) {
            if (year%400==0) System.out.println("1");
            else if (year%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}
