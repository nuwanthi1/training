import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        int id = 1;
        String name = "john";
        int age = 20;
        List<String> subject = new ArrayList<String>();
        subject.add("Maths");
        subject.add("English");
        subject.add("History");

        Student student = new Student(id,name,age,subject);
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAge());
        System.out.println(student.getSubject());

    }
}
