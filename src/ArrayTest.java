import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("금액을 넣으세요:[숫자입력] ");
        int money=input.nextInt();
        int[] don = {50000,10000,5000,1000,500,100,50,10};

        for (int i=0;i<don.length;i++){
            int cnt=0;

            cnt=money/don[i];
            money=money-(don[i]*cnt);


            System.out.println(don[i]+"원"+cnt+"개");

        }

    }

}
