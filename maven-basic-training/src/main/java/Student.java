
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student
{
    private @Getter @Setter int Id;
    private @Getter @Setter String name;
    private @Getter @Setter int age;
    private @Getter @Setter List<String>  subject;
}

/*import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<String> subject;

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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<String> getSubjects() {
        return subject;
    }
    public void setId(List<String> subject) {
        this.subject = subject;
    }
    public Student(int id,String name,int age, List<String> subject){
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
   }


} */

