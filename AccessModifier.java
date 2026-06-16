class Emp
{
    //Here we used 3 access modifiers such as private, protected and public
    protected String name;
    int age;
    public String color;//Here we can't access the private of color in another class
    public void talk()
    {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Color is "+color);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Emp e=new Emp();
        e.name="kiran";
        e.age=23;
        e.color="blue";
        e.talk();
    }
}
