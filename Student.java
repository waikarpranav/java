public class Student {
    int id;
    String name;

    Student(){
        System.out.println("this is default constructor");
    }

    Student(int a, String b){
        id=a;
        name=b;
        System.out.println("student id="+a +"name="+b);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(15,"pranav");
    }

}
