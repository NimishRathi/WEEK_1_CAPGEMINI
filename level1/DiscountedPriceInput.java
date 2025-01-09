import java.util.*;

class DiscountedPriceInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextInt();
        double discountPercent = input.nextInt();
        double discount = (discountPercent / 100.0) * fee;
        System.out.println(
                "The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
    }
}