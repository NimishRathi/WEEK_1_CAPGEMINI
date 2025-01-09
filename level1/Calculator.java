import java.util.*;
class Calculator{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     float firstNumber = sc.nextFloat();
     float secondNumber = sc.nextFloat();
     float addition = firstNumber + secondNumber;
     float subtraction = firstNumber - secondNumber;
     float multiplication = firstNumber * secondNumber;
     float division = firstNumber / secondNumber; 
System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+ firstNumber+ " and " + secondNumber+ " is " +addition+" "+subtraction+" "+multiplication+" "+division);
}
}

