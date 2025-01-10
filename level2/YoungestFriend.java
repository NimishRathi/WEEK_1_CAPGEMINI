import java.util.*;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar","Akbar","Anthony"};
        int age[]=new int[3];
        int height[]=new int[3];
        int youngest=0;
        int tall=0;
        for(int i=0;i<3;i++){
          System.out.println("Enter the age of "+friends[i]);
          age[i]=scanner.nextInt();
          if(age[i] < age[youngest])
            youngest=i;
          System.out.println("Enter the height of "+friends[i]);
          height[i]=scanner.nextInt();
          if(height[i] > height[tall])
            tall=i;
        }
      System.out.println("The youngest friend is " + friends[youngest] + " with age " + age[youngest] + ".");
      System.out.println("The tallest friend is " + friends[tall] + " with height " + height[tall] + " cm.");
       
    }
}