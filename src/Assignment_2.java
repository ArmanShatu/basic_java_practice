import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        int noShirt=0;
        int noSharee=0;
        Scanner scanner = new Scanner(System.in);
        noShirt=scanner.nextInt();
        noSharee=scanner.nextInt();
        int total = noShirt*1200+noSharee*3500;
        if(noShirt>=2 && noShirt>=1){
            total=total-400;
        }
        System.out.println(total);

    }
}
