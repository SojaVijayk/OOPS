import java.util.Arrays;
import java.util.Scanner;
class Binary
{
  public static void main(String args[])
  {
  int n,i,search,first=0,mid;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of elements in the array:");
  n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the elements of the array:");
  for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
  Arrays.sort(arr);
  System.out.println("Array is:");
  for(i=0;i<n;i++)
  {
    System.out.println(arr[i]);
  }
  System.out.println("enter the element to be searched:");
  search=sc.nextInt();
  int last=arr.length-1;
  mid=(first+last)/2;
  while(first<=last)
  {
    if(arr[mid]<search)
  {
    first=mid+1;
  }
  else if(arr[mid]==search)
  {
  System.out.println("Element found");
  break;
  }
  else
  {
  last=mid-1;
  }
  mid=(first+last)/2;
  }
  if(first>last)
  {
  System.out.println("Element not found");
  }
  }
}

ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ javac Binary.java
ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Binary
Enter the number of elements in the array:
2
Enter the elements of the array:
4 5
Array is:
4
5
enter the element to be searched:
5
Element found







