public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public void changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Felicidades has sido aprobado " + firstName);
        }else{
            System.out.println("Haz Reprobado el curso " + firstName);
        }
    }
}
