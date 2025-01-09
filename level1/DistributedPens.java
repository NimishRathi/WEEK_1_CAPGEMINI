import java.util.*;

class DistributedPens {
    public static void main(String[] args) {
        int totalPen = 14;
        int Students = 3;
        int remainingPens = (totalPen % Students);
        int penPerStudents = (totalPen / Students);
        System.out.println("The Pen Per Student is " + penPerStudents + " and the remaining pen not distributed is "
                + remainingPens);
    }
}