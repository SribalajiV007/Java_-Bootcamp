package Java_Telusko_11_22_2025.Java_Basics.Student_Formatter;

public class Main {
    public static void main(String[]args){
        System.out.println("Welcome to Student Profile Formatter");

        System.out.println("No of Students: " + Student.noOfStudents);

        Student s1 = new Student(101,"Sri Balaji V","BCA","Avichi");
        Student s2 = new Student(102,"Kavitha", "CSE","Bharath");
        Student s3 = new Student(103,"Vignesh", "BSC", "Bishop Heber");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
