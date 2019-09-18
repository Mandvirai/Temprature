import java.util.Scanner;
class Temprature
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double f=s.nextDouble();
        double c;
        c=(f-32)/1.8;
        System.out.println(c);
    }
}
