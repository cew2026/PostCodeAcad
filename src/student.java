import java.util.ArrayList;
public class student {

    String name ;
    int age ;
    int grade;

    public student(String pname, int page, int pgrade) {
        name = pname;
        age = page;
        grade = pgrade;
    }
    public void printInfo(){
        System.out.println(name + age + grade);
    }

   // public gradeAverage (){


    //}
}
