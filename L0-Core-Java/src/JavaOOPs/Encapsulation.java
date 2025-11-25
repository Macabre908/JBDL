package JavaOOPs;

class Student{
    private String name;
    private float CGPA;
    private int age;

    public float getCGPA(){
        return this.CGPA;
    }

    public void setCGPA(float CGPA){
        this.CGPA = CGPA;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
public class Encapsulation {
    public static void main(String []args){
        Student s1 = new Student();
        s1.setCGPA(9.7f);
        s1.setAge(18);
        s1.setName("John Doe");

        System.out.println(s1.getName() + " is " + s1.getAge() + " years old and scored a CGPA of " + s1.getCGPA());
    }
}
