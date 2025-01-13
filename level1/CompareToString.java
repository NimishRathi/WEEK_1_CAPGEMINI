import java.util.*;
class CompareToString{
   
    public static boolean comparision(String str1 , String str2){
      for(int i=0; i<str1.length(); i++){
            if(str1.length()!=str2.length() || str1.charAt(i)!=str2.charAt(i)){
                     return false;     
                  }
                  
                                                                } return true;

}
     public static boolean comparision2(String str1 , String str2){
            if(str1.equals(str2)){
       
                return true;
                                  }
            else{
                 return false;    }                             
                                                              
   }
      public static boolean result(String str1, String str2){
             if (comparision(str1,str2) && comparision2(str1,str2)){
                       return true; }
             else{
                        return false;              
                                      }

                                                                 }
                                                                      
     
      public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
              String str1 = sc.nextLine();
              String str2 = sc.nextLine();	
       //  if(result(str1,str2)){
              // System.out.println("yes string is equal");
             //             }
      //else{
          //      System.out.println("yes string is not equal");
          //      }
            boolean result1 = comparision(str1,str2);
            System.out.println(result1);

         
       

}
}