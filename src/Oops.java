import java.util.Arrays;

public class Oops {
    public static void main(String[] args){
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
    }
}
class Student{
    int rollno;
    String name;
}