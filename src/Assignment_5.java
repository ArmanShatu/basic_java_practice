import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        while (number>0){
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println(sum);

    }
}
