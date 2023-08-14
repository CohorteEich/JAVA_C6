import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.remove(student);
    }

    public String getCourseInfo() {
        return "Curso: " + courseName + "\nProfesor: " + professorName + "\nAño: " + year;
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = -1;
        for (Student student : enrolledStudents) {
            if (student.grade > maxGrade) {
                maxGrade = student.grade;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Maria", "morales", 123, 85, 1);
        Student student2 = new Student("Julian", "perez", 124, 52, 1);

        Course course = new Course("Introduccion a Java", "Prof. Jose", 2023);
        course.enroll(student1);
        course.enroll(student2);

        System.out.println("Numero de estudiantes Inscritos: " + course.countStudents());
        System.out.println("Mejor Nota del curso " + course.bestGrade());

        student1.changeYearIfApproved();
        student2.changeYearIfApproved();

        System.out.println(course.getCourseInfo());
    }
}
