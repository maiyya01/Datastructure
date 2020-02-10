package miscellaneous;

public class SortOrders
{
    public static void main(String args[])
    {
        Student[] students = new Student[5];
        Student s1 = new Student(10,"Mahesh");
        Student s2 = new Student(10, "Guni");
        Student s3 = new Student(11, "Vihaan");

        students[0] = s1;
        students[1] = s2;

    }


}

class Student
{
    int score;
    String name;

    public Student(int score, String name)
    {
        this.score = score;
        this.name = name;
    }

}