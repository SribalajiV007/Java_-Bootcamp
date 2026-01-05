package Java_Telusko_11_22_2025.Java_Basics.Student_Formatter;

public class Student {
    private int id;
    private String name;
    private String department;
    private String collegeName;
    static int noOfStudents = 1000;


    public Student(int id, String name, String department, String collegeName){
        this.id =id;
        this.department = department;
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "--- Student Profile ---" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", CollegeName='" + collegeName + '\'';
    }
}
