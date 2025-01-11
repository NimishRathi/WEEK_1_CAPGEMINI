import java.util.*;

class SimpleInterest {
        public double CalculateInterest(int principal, int rate, int time) {
                return (principal * rate * time) / 100;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter principal");
                int principal = sc.nextInt();
                System.out.println("enter rate");
                int rate = sc.nextInt();
                System.out.println("enter time");
                int time = sc.nextInt();
                SimpleInterest obj = new SimpleInterest();
                System.out.println(obj.CalculateInterest(principal, rate, time));

        }
}