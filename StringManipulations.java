public class StringManipulations {
    public static void main(String[] args) {
        // a. Create new strings using new
        String str1 = new String("Hello");
        String str2 = new String("World");

        System.out.println("a. Created strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // b. Getting string length
        System.out.println("\nb. Length of str1: " + str1.length());

        // c. String concatenation
        String str3 = str1.concat(" ").concat(str2);
        System.out.println("\nc. Concatenated string: " + str3);

        // d. Character extraction
        char ch = str1.charAt(1); // character at index 1
        System.out.println("\nd. Character at index 1 in str1: " + ch);

        // e. String comparison
        String str4 = "hello";
        boolean isEqual = str1.equals(str4);
        System.out.println("\ne. String comparison:");
        System.out.println("\nStr4:hello");
        System.out.println("\tstr1 Equals str4: " + isEqual);

        // f. Searching substrings
        int index = str3.indexOf("World");
        System.out.println("\nStr3:Hello World");
        System.out.println("\nf. Index of 'World' in str3: " + index);

        // g. Modifying a string
        String replacedStr = str3.replace("World", "Java");
        System.out.println("\ng. Modified string: " + replacedStr);

       // h. ASCII conversion for a number
        int number = 65;  // Let's take an example ASCII value
        char asciiChar = (char) number;  // Convert the number to its ASCII character
        System.out.println("\nh. ASCII conversion:");
        System.out.println("ASCII value " + number + " corresponds to character: " + asciiChar);
    }
}



ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java StringManipulations
a. Created strings:
str1: Hello
str2: World

b. Length of str1: 5

c. Concatenated string: Hello World

d. Character at index 1 in str1: e

e. String comparison:

Str4:hello
	str1 Equals str4: false

Str3:Hello World

f. Index of 'World' in str3: 6

g. Modified string: Hello Java

h. ASCII conversion:
ASCII value 65 corresponds to character: A


Start

   1. Create two strings str1 and str2 using the new keyword.

   2. Display str1 and str2.

   3. Find and display the length of str1.

   4. Concatenate str1 and str2 with a space, store in str3, and display it.

   5. Extract and display the character at index 1 from str1.

    6.Compare str1 with a new string str4, display if they are equal.

    7.Search and display the index of "World" in str3.

   8. Replace "World" with "Java" in str3, store and display the result.

   9. Convert number 65 to its ASCII character and display it.
    End
    
