import java.util.Scanner;

//  10951번
public class ch08 {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
    }
}
