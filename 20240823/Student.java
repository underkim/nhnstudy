public class Student {
    private int no;
    private String name;

    public void setInfo(int no , String name)
    {
        this.no = no; this.name = name;
    }

    public String toString()
    {
        return this.no +", " + this.name;
    }

    public boolean equals(Student s)
    {
        return (this.no == s.no && this.name.equals(s.name)) ? true : false;
    }
}

class Test
{
    public static void main(String [] args)
    {
        Student s = new Student();
        s.setInfo(1, "Celine");
        Student s2 = s;
        System.out.println(s.equals(s2));
    }
}