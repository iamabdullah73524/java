import java.util.*;
public class prime {
	public static void main(String[] args )
{
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter no  :");
    int n = sc.nextInt();
    int count=1;
    for( int i = 2; i<=n; i++)
    {
        if(n%i==0)
        {
            count++;
        }

    }
    if(count==2)
    {
        System.out.print(n+" is prime");
    }
    else
    {
        System.out.print(n+ " is not prime");
    }
}
}