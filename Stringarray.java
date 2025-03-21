import java.util.Arrays;
import java.util.Scanner;
class Stringarray
{
	void userdefine(String str[],int length)
	{
		int i,j;
		String temp;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\n Sorted array using user defined method:");
		for(i=0;i<length;i++)
		{
			System.out.println(str[i]);
		}
	}
public static void main (String [] args)
{
			int i,length,option;
			Stringarray usersort=new Stringarray();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter number of words in an array:");
			length=sc.nextInt();
			String str[]=new String[length];
			System.out.println("Enter the words in an array:");
			for(i=0;i<length;i++)
			{
				str[i]=sc.next();
			}
			System.out.println("\nEntered Array is:");
			for(i=0;i<length;i++)
			{
			System.out.println(str[i]);
			}
			System.out.println("\nOptions:");
			System.out.println("1.Built Method");
			System.out.println("2.User Defined Method");
			System.out.println("3.Exit");
			System.out.println("Choose your option:");
			option=sc.nextInt();
			while(option!=3)
			{
			switch(option)
			{
			case 1:
			Arrays.sort(str);
			System.out.println("Sorted Array using built method");
      for(i=0;i<length;i++)
      {
      System.out.println(str[i]);
      }
      break;
      case 2:
      usersort.userdefine(str,length);
      break;
      default:
      System.out.println("invalid");
      break;
      }
      System.out.println("Choose your option:");
			option=sc.nextInt();
      }
      }
  }
  
  
  
  ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ javac Stringarray.java
ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Stringarray
Enter number of words in an array:
3
Enter the words in an array:
soja
nada
anjana

Entered Array is:
soja
nada
anjana

Options:
1.Built Method
2.User Defined Method
3.Exit
Choose your option:
1
Sorted Array using built method
anjana
nada
soja
Choose your option:
2

 Sorted array using user defined method:
anjana
nada
soja
Choose your option:
3


				
				
				
				
				
