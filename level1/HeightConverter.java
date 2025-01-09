import java.util.*;
class HeightConverter{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
double heightInCm = sc.nextDouble();
double heightInInches = heightInCm / 2.54;
int feet = (int) (heightInInches / 12);
int inches = (int) (heightInInches % 12);
System.out.println("Your height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
}
}