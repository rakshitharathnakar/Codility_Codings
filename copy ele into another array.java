
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     //int n=sc.nextInt();
	     int a[]={1,2,3,4,5};
	     int b[]=new int[a.length];
	     for(int i=0;i<a.length;i++){
	         b[i]=a[i];
	     }
	     for(int i=0;i<a.length;i++){
	         System.out.println(a[i]);
	     }
	     for(int i=0;i<b.length;i++){
	         System.out.println(b[i]);
	     }
	}
}
