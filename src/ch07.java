import java.util.Scanner;

// 2439번 : 별찍기
public class ch07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {		// 행 반복
            for(int j = 1; j <= N - i; j++){	// 공백 반복
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){	// 별 반복
                System.out.print("*");
            }
            System.out.println();		// 줄 바꿈
        }

    }
}
