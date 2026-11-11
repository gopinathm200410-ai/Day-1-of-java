class Employee{
    void salary(double s){
        System.out.println("Function 1");
    }
    void salary(int s){
        System.out.println("Function 2");
    }
}
class Loading{
    public static void main(String[]args){
        Employee e=new Employee();
        e.salary(22000);
        e.salary(22000.33);
    
    }
}
