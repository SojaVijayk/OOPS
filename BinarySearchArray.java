import java.util.Arrays;
import java.util.Scanner;

class BinarySearchArray
{
  public static void main(String args[]) 
  {
    int n, i, result, search;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in array:");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements in array:");
    for (i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Array is:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element to be searched:");
        search = sc.nextInt();
        result = Arrays.binarySearch(arr, search);
        if (result >= 0) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}



ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java BinarySearchArray
Enter the number of elements in array:
3
Enter the elements in array:
4
8
7
Array is:
4
7
8
Enter the element to be searched:
9
Element not found

