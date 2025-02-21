

import java.util.*;

class Student
{
    int rollnumber;
    String name;

    public Student(int rollnumber, String name)
    {
        this.rollnumber = rollnumber;
        this.name = name;
    }
}
class Namecomparate implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.name.compareTo(o2.name);
    }
}
class RollNumberComparator implements Comparator<Student>
{
    @Override
    public int compare(Student a1, Student a2)
    {
        return a1.rollnumber-a2.rollnumber;
    }
}
public class example {
    public static void main(String[] args) {
        ArrayList<Student> s =new ArrayList<>();
        s.add(new Student(1,"Rahul"));
        s.add(new Student(3,"vikas"));
        s.add(new Student(2,"vishal"));
        s.add(new Student(4,"zock"));

        Collections.sort(s , new Namecomparate());
        for(Student st : s)
        {
            System.out.println(st.rollnumber + " - " + st.name);
        }

        System.out.println("================================================================");
        Collections.sort(s , new RollNumberComparator());
        for(Student st1 : s)
        {
            System.out.println(st1.rollnumber + " - " + st1.name);;
        }
    }
}