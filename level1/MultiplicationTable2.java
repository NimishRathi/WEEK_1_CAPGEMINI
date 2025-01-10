
import java.util.*;

class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 6;
        int array[] = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = number * count;
            count++;
        }
        int count1 = 6;
        for (int i = 0; i < 4; i++) {
            System.out.println(number + "* " + count1 + " =" + array[i]);
            count1++;
        }
    }
}
