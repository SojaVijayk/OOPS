import java.io.*;
public class Filereadwrite
{
    public static void main(String[] args) 
    {
        String filename = "example.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            writer.write("Hello, world!\n");
            writer.write("OOPS PROGRAMMING\n");
            writer.write("Welcome!");
        } catch (IOException e) 
        {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }
        System.out.println("Contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}




ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Filereadwrite
Contents of the file:
Hello, world!
OOPS PROGRAMMING
Welcome!



### **Algorithm: File Read and Write**

1. **Define file name** as `"example.txt"`.
2. **Write to the file:**

   * Open the file for writing using `BufferedWriter`.
   * Write three lines of text to the file.
   * Close the writer automatically using try-with-resources.
3. **Print a message**: `"Contents of the file:"`.
4. **Read from the file:**

   * Open the file using `BufferedReader`.
   * Read and print each line until the end of the file.
   * Close the reader automatically using try-with-resources.
5. **Handle exceptions** during writing or reading and display error messages if needed.

