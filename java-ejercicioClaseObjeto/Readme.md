##Explorando el Proyecto del Sistema Escolar

Cree un nuevo proyecto Java usando IntelliJ Idea.
Crear una clase de estudiante . Esta clase debe tener los siguientes atributos:
  public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
   }
Ahora, haga que la clase Student implemente los siguientes métodos:
  public void printFullName(){
      //TODO implement
   }

   public void isApproved(){
       //TODO implement: retornar true si grade es >= 60
   }

   public int changeYearIfApproved(){
       //TODO implement: el estudiante debe avanzar de año si el/ella tiene grade >= 60
       // Make year = year + 1, and print "Congragulations" if the student has been approved
       return 0;
   }
Agrega constructores a tu clase Student:
Haz la clase con al menos 1 método constructor.

Crear una clase de Java para cursos
Su clase de Curso debe tener como atributos: nombreCurso, nombreProfesor, año.
Su clase también debe contener una colección que enumere a todos los estudiantes inscritos en ellos.
Implemente los siguientes métodos.
  public void enroll(Student student){
      //TODO add the student to the collection
   }

   public void unEnroll(Student student){
       //TODO remove this student from the collection
       // Hint: check if that really is this student
   }

   public int countStudents(){
       //TODO implement
       return 0;
   }
   
   public int bestGrade(){
       //TODO implement
       return 0;
   }
Ejecute el método main y verifique que su implementación funcione.

