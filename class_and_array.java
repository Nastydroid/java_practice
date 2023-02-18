class Student
{
    int rollno;
    String name;
    int marks;
}

public class class_and_array {
    

    public static void main (String args[])
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "sopade";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "oluwafemi";
        s2.marks = 78;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "oluwatobi";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0]=s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        System.out.println("**********************");
        for( Student stud : students) //using enchanced for loop or for_each loop
        {
            System.out.println(stud.name + " : " + stud.marks);
        }

    }
}