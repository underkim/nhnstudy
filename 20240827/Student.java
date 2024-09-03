public class Student {
    protected int no;
    protected String name;

    public Student()
    {
    }

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }
    public void setInfo(int var1, String var2)
    {
        this.no = var1;
        this.name = var2;
    }
    public String toString()
    {
        return this.no + " " + this.name;
    }
}
