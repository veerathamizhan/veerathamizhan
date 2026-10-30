public class Student{
String name;
String department;
int age;
public Student(String name, String department, int age){
this.name = name;
this.department = department;
this.age = age;
}
public void DisplayInfo(){
System.out.println("Student Name : "+ this.name);
System.out.println("Department : "+ this.department);
System.out.println("Age : "+ this.age);
}
public static void main(String[] args){
Student s1=new Student("veerathamizhan","cse",20);
s1.DisplayInfo();
}
}
