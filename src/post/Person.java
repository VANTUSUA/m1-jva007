package post;

public class Person {
    String personName;
    int age = 33;
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        Person p = new Person();

        int age = p.getAge();
        System.out.println(age);
    }
}

