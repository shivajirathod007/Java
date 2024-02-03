public class StringInJava {
  public static void main(String[] args) {
    /*
     * String firstName = "hii";
     * String lastName = "ji";
     * String fullName = firstName + " " + lastName;
     * // System.out.println(fullName);
     * // scanner.next().charAt(0);
     * for (int i = 0; i < fullName.length(); i++) {
     * System.out.println(fullName.charAt(i));
     * }
     */

    // String works on this three things
    // 1. --> s1> s2 : +ve value
    // 2. --> s1 == s2 : returns 0
    // 3. --> s1<s2 : -ve value
    // String s1 = "tony";
    // String s2 = "tony";
    // if (s1.compareTo(s2) == 0) {
    // System.out.println("String are same ");
    // } else {
    // System.out.println("String are not same");
    // }

    // in this case(situation) we're not able to compare to the two strings
    // if (new String("Shivaji") == new String("Shivaji")) {

    // System.out.println("String are same ");
    // } else {
    // System.out.println("String are not same ");
    // }

    String Sentence = "hii Shiva";
    // substring(beg index , last index)
    // it returns the charcters between the beggning to last index
    // ++ by default you don't pass the ending 
    String name = Sentence.substring(4, Sentence.length());
    System.out.println(name);
  }

}
