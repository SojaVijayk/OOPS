import java.util.Scanner;
class Linear
{
	public static void main(String args[])
	{
	int a,i,e;
	boolean found=false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in array:");
	a=sc.nextInt();
	int[] ar=new int[a];
	System.out.println("Enter the elements of the array:");
	for(i=0;i<a;i++)
	{
	ar[i]=sc.nextInt();
	}
	System.out.println("Enter the element to be searched:");
	e=sc.nextInt();
	for(i=0;i<a;i++)
	{
	if(ar[i]==e)
	{
	found=true;
	break;
	}
	}
	if(found)
	{
	System.out.println("Elements is found:");
	}
	else
	{
	System.out.println("Element is not found:");
	}
	sc.close();
	}
}






ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ javac Linear.java
^[[Aksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Linear
Enter the number of elements in array:
3
Enter the elements of the array:
23 45 67
Enter the element to be searched:
23
Elements is found:

	
