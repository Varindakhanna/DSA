package oops;

class Student
{
    String name;
    int age;

    public void print()
    {
        System.out.println(this.name + this.age);
    }

    Student(Student s1)
    {
        this.name=s1.name;
        this.age=s1.age;
    }

    Student()
    {

    }
}

public class general
 {
    public static void main(String[] args)
     
    {
        Student s1=new Student();
        s1.name="varinda";
        s1.age=20;

        Student s2=new Student(s1);
  
        s2.print();
        
    }
}


