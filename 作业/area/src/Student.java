import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;

    public Student(){

        System.out.println("1111");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(){

        this.name = name;
    }

    public int getAge(){

        return age;
    }

    public void setAge(){

        this.age = age;
    }


}
