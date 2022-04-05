import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner= new Scanner(System.in);

        while(true){
           String ch=scanner.nextLine();
            if(ch.isEmpty()||ch.isBlank()){
                count++;
            }
            else if(ch.equals("0")){
                count=0;
            }
            System.out.println(count);
        }
    }
}
