import java.util.Scanner;
class Employe{
    private String name;
    private int id;
    private double salary;
    void getter()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
    void setter(String n,int i,Double s){
        name=n;
        id=i;
        salary=s;

    }
}
class Employee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employe e=new Employe();
        System.out.println("Enter Name:");
        String a=sc.nextLine();
        System.out.println("Enter Employee ID:");
        int b=sc.nextInt();
        System.out.println("Enter Employee Salary");
        double c=sc.nextDouble();
        e.setter(a,b,c);
        e.getter();

    }
}
