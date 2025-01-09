import java.util.*;
class  volumeOfEarth{
public static void main(String [] args){
double radius = 6378.0 ;
double volume =(4.0/3.0)*Math.PI*Math.pow(radius,3);
double volumeInMiles = volume * 4.16818183;
System.out.println("The volume of earth in cubic kilometers is "+ volume + " and cubic miles is "+ volumeInMiles);
}
}
