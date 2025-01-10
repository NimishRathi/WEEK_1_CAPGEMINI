import java.util.*;
class VotingEligiblility{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
int number = 10;
int array[] = new int[number];
for(int i=0; i<array.length; i++){
array[i] = sc.nextInt();
}

for(int i=0; i<array.length; i++){
if(array[i]>=18){
System.out.println("The student with the age " + array[i] + " can vote ");
}
else if(array[i]<0){
System.out.println("Invalid age");
}
else{
System.out.println("The student with the age "+ array[i] + " cannot vote ");
}     
}
}
}