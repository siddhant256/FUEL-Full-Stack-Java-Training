package conecpts;

public class Student
{
    Student()
    {
        this(10);
        System.out.println("Default Constructor:");
    }

    Student(int no)
    {
        this(10, "Siddhant");
        System.out.println("Roll No: " + no);
    }

    Student(int no, String name)
    {
        System.out.println("Roll No: " + no + " Name: " + name);
    }

    public static void main(String args[])
    {
        Student s = new Student();
    }
}