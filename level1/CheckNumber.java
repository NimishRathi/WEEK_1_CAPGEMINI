import java.util.*;

class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 5;
        int array[] = new int[number];
      for(int i=0; i<array.length; i++){
     array[i]=sc.nextInt();
if(array[i]==0){
System.out.println("number is zero");
}
   else if(array[i]>0){
    if(array[i]%2==0){
             System.out.println("positive and even number");
 }else{
      System.out.println("positive and odd number");
}}
else{
System.out.println("its a negative number");
}
}
int j=0;
if(array[j]==array[number-1]){
System.out.println("first element is equals to last element");
}
else{
System.out.println("first element is not equals to last element");

}}
}
