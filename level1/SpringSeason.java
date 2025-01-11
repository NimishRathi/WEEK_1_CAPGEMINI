import java.util.*;

class SpringSeason {
    public static boolean checkSeason(int month, int date) {
        if ((month == 3 && date >= 20) || (month == 4) || (month == 5) || (month == 6 && date <= 20)) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date");
        int date = sc.nextInt();
        System.out.println("enter the month");
        int month = sc.nextInt();
        System.out.println(checkSeason(month, date));

    }
}
