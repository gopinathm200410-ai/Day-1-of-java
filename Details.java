import java.util.Scanner;
class Details
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name=s.nextLine();
        System.out.println("Enter Student age :");
        int age=s.nextInt();
        s.nextLine();
        System.out.println("Enter student class :");
        String stuclass=s.nextLine();
        System.out.println("Enter Student place :");
        String place=s.nextLine();
        System.out.println(" -----Student Details------");
        System.out.println(" Student name :" + name);
        System.out.println(" Student age :" + age);
        System.out.println(" Student class :" + stuclass);
        System.out.println(" Student place :" + place);
        System.out.println("---------------------------")

        s.close();
            }
}