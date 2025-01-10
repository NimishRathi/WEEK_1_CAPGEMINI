import java.util.*;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
       int array[] = new int[11];

            for(int i=1; i<=10; i++){
         array[i] = number*i; 
         } 
for(int i=1; i<=10; i++){
System.out.println(number + "* " + i +" ="+ array[i]);
}
}
}


