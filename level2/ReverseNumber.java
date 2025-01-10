import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int count=0;
        int num=number;
        while(num!=0){
          num=num/10;
          count++;
          }
        int reverse[]=new int[count];
        for(int i=0;i<count;i++){
            reverse[i]=number%10;
            number=number/10;
          }
        for(int i=0;i<count;i++){
            System.out.print(reverse[i]);
          }
    }
}