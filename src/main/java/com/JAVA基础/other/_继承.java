package main.java.com.JAVA基础.other;

/**
 *子类能继承父类的属性吗？
 */
public class _继承 {
    public static void main(String[] args) {
        //子类
        Student s = new NewStudent();
        System.out.println(s.toString());
        //子类
        NewStudent ns = new NewStudent();
        System.out.println(ns.toString());

        //父类
        Student ss = new Student();
        System.out.println(ss.toString());
    }

}

class Student {

    int age = 20;
    String name = "zhangsan";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


class NewStudent extends Student {
    int age ;
    String name ;
    String graden = "0";
    public String getGraden() {
        return graden;
    }

    public void setGraden(String grade) {
        this.graden = grade;
    }

    @Override
    public String toString() {
        return "NewStudent{" +
                "graden='" + graden + '\'' +
                '}';
    }

}