import java.util.Scanner;
class PercantageCalculator{
    public static void main (String []args){
        System.out.println("percantge calculator of students");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks in the subject 1:");
        int mark1=sc.nextInt();
        System.out.println("enter the marks in the subject 2:");
        int mark2=sc.nextInt();
        System.out.println("enter the marks in the subject 3");
        int mark3=sc.nextInt();
        System.out.println("enter the marks in te subject 4");
        int mark4=sc.nextInt();
        System.out.println("enter the marks in the subject 5");
        int mark5=sc.nextInt();

        int sum= (mark1+mark2+mark3+mark4+mark5);

        System.out.println("the sum of the number is " + sum);
        float percantage=(sum*100)/500;

        System.out.println("the percantage of the student is :" + percantage);
    }
}