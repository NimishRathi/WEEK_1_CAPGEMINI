import java.util.*;
class DiscountedPrice{
public static void main(String [] args){
int fee = 125000 ;
int discountPercent = 10;
double discount = (10.0/100.0)*fee;
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee-discount));
}
}