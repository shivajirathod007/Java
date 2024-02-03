
public class String_buffer {

    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Append
        stringBuffer.append(", World!");
        System.out.println("After Append: " + stringBuffer);

        // Insert
        stringBuffer.insert(5, " Java");
        System.out.println("After Insert: " + stringBuffer);

        // Delete
        stringBuffer.delete(6, 11);
        System.out.println("After Delete: " + stringBuffer);

        // DeleteCharAt
        stringBuffer.deleteCharAt(6);
        System.out.println("After DeleteCharAt: " + stringBuffer);

        // Reverse
        stringBuffer.reverse();
        System.out.println("After Reverse: " + stringBuffer);

        // SetCharAt
        stringBuffer.setCharAt(0, 'h');
        System.out.println("After SetCharAt: " + stringBuffer);

        // Replace
        stringBuffer.replace(6, 11, "Java");
        System.out.println("After Replace: " + stringBuffer);

        // Capacity
        System.out.println("Capacity: " + stringBuffer.capacity());

        // Length
        System.out.println("Length: " + stringBuffer.length());

        // EnsureCapacity
        stringBuffer.ensureCapacity(20);

        // Substring
        String subString = stringBuffer.substring(6, 10);
        System.out.println("Substring: " + subString);

        // CharAt
        char charAtIndex = stringBuffer.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex);

        // IndexOf
        int indexOfSubstring = stringBuffer.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfSubstring);

        // LastIndexOf
        int lastIndexOfSubstring = stringBuffer.lastIndexOf("Java");
        System.out.println("Last Index of 'Java': " + lastIndexOfSubstring);

        // ToString
        String finalString = stringBuffer.toString();
        System.out.println("Final String: " + finalString);
    }
}
