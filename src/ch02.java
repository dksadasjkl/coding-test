import java.util.Scanner;

//14681 사분면 고르기
public class ch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("X :");
        int X = sc.nextInt();
        System.out.print("Y :");
        int Y = sc.nextInt();


        if(X > 0 && Y > 0) {
            System.out.println("1");
        } else if(Y > 0){
            System.out.println("2");
        } else if(X < 0 && Y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
