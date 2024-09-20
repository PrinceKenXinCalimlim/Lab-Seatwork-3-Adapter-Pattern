
public class SchoolMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Unified School Management Application\n");
        
    AttendanceSystem attendanceSystem = new AttendanceSystem();
    SchoolManagementApp attendance = new AttendanceSystemAdapter(attendanceSystem);

    GradingSystem gradingSystem = new GradingSystem();
    SchoolManagementApp grading = new GradingSystemAdapter(gradingSystem);

    LibrarySystem librarySystem = new LibrarySystem();
    SchoolManagementApp library = new LibrarySystemAdapter(librarySystem);

    System.out.println(attendance.integrateSystem() + "");
    System.out.println(grading.integrateSystem() + "");
    System.out.println(library.integrateSystem()+ "");

    }

}   
