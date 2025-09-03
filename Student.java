public class Student {
    // Data members
    private String StudentName;
    private int StudentID;
    private double StudentGPA;

    // Constructor
    public Student(String StudentName, int StudentID, double StudentGPA) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.StudentGPA = StudentGPA;
    }

    // Getters
    public String getStudentName() {
        return StudentName;
    }

    public int getStudentID() {
        return StudentID;
    }

    public double getStudentGPA() {
        return StudentGPA;
    }

    // Setters
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setStudentGPA(double StudentGPA) {
        this.StudentGPA = StudentGPA;
    }

    // Method to display student info
    public void displayStudent() {
        System.out.println("The student " + StudentName + " has an id of " + StudentID + " with a gpa of " + StudentGPA + ".");
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student student1 = new Student("Lisa Waddell", 54321, 2.5);
        student1.displayStudent();
    }
}
