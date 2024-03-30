import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private String program;
    private int semester;
    private Map<String, Integer> courseMarks;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courseMarks = new HashMap<>();
    }

    public void addCourseMark(String course, int mark) {
        courseMarks.put(course, mark);
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getSemester() {
        return semester;
    }

    public Map<String, Integer> getCourseMarks() {
        return courseMarks;
    }
}

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Computer Science", 3);
        student1.addCourseMark("Math", 85);
        student1.addCourseMark("Physics", 60);
        student1.addCourseMark("History", 35);

        List<Student> students = new ArrayList<>();
        students.add(student1);

        // Activity 1: Retrieve student's information
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Semester: " + student.getSemester());
            System.out.println("Courses Registered: " + student.getCourseMarks().keySet());
        }

        // Activity 2: Retrieve marks less than 40
        for (Student student : students) {
            for (Map.Entry<String, Integer> entry : student.getCourseMarks().entrySet()) {
                if (entry.getValue() < 40) {
                    System.out.println("Student " + student.getName() + " scored less than 40 in course " + entry.getKey());
                }
            }
        }
    }
}