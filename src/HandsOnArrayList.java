import java.util.ArrayList;
import java.util.Collections;


public class HandsOnArrayList {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<>();
        students.add("jennifer");
        students.add("Kylie");
        students.add("James");
        students.add("Abel");
        students.add("Bridget");
        System.out.println("The name of the students in this class are: " + students);
        students.remove(2);
        System.out.println("The name of the students in this class after " +
                "removing one student are: " + students);
        Collections.sort(students);
        System.out.println("The sorted names of the students are: " + students);
    }

}
