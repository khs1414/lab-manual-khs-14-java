class Student{
    String name;
    int roll_no;
    Student(String name,int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class prac4_1{
    public static void main(String[] args) {
        Student case1 = new Student("John",2);
        System.out.println(case1.name);
        System.out.println(case1.roll_no);
    }
}