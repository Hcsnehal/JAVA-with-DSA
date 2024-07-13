import java.util.*; 

public class StringHandling {
    public static void main(String[] args) {
        //String//
        //In Java, string is basically an object that represents sequence of char values. 
        //An array of characters works same as Java string. For example:
      //char ch[] = {'j','a','v','a'};
    //    String st = new String(ch);
    //    System.out.println(st);

    //Generally, String is a sequence of characters. But in Java, string is an object that represents a sequence of characters.
    // The java.lang.String class is used to create a string object.

    //There are two ways to create String object:

    //1.By string literal
    //2.By new keyword

    //1)By string literals:
    //java string literals is created by using double quotes//
    //String st = "welcome";

    //2)using new keyword//
    // String st = new String("welcome");
    // System.out.println(st);

    // char ch[] = {'h','a','l','l','o'};
    // String S1 = new String(ch);//converting character array to string//

    // String S2 = new String("hello");//using new keyword
    // String S3 = "hello"; //using string litearls
    // System.out.println(S1);
    // System.out.println(S2);
    // System.out.println(S3);
     
      
    //String immutability//
    // String st = "snehal";
    // st.concat("deshmukh");
    // System.out.println(st);//only snehal willl print becouse string immutability//

    // String st = "snehal";
    // st = st.concat("Deshmukh");//explicitly assign to print snehal deshmukh//
    // System.out.println(st);
//     String S1 = new String("java");
//     String S2 = new String("java"); 
//    // S1 = S1+"!";//creates a new string object// 
//     System.out.println(S1 == S2);

    //   String s1 = "java";
    //   String s2 = "java";
    //   String s3 = "java";
    //   s3 = "python";
    //   System.out.println(s3.equals(s1));

    //String equality//
    // String s1 = "java";
    // String s2 = "javajuint";
    // String s3 = "javapoint";
    // // System.out.println(s1.equals(s2));
    // // System.out.println(s1.equalsIgnoreCase(s2));
    // // System.out.println(s1==s2);
    // System.out.println(s1.compareTo(s2));
    // System.out.println(s1.compareTo(s3));
    // System.out.println(s2.compareTo(s3));
    
    // StringBuilder S1 = new StringBuilder("hello");
    // StringBuilder S2= new StringBuilder("world");
    // StringBuilder S3 = S1.append(S2);
  
    // System.out.println(S3.toString());

     // String concatenation using formate//
    //  String S1 = new String("hello");
    //  String S2 = new String("world");
    //  String S3 = String.format("%s%s", S1,S2);
    //  System.out.println(S3);
   

    //String concatenation using String.join() method//
    // String S1 = new String("hello");
    //  String S2 = new String("world");
    //  String S3 = String.join("", S1,S2);
    //  System.out.println(S3);

    //String concatenation using StringJoiner class//
    // StringJoiner s = new StringJoiner(" ");
    // s.add("snehal");
    // s.add("deshmukh");
    // System.out.println(s);
   

    //substring // part of string
    // String s = "snehal";
    // System.out.println("substring of snehal is ="+s.substring(1,3));

//     String s="SachinTendulkar";    
//  System.out.println("Original String: " + s);  
//  System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
//  System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin

// String text = new String("hello,my name is snehal");
// String[] s= text.split("\\.");
// System.out.println(Arrays.toString(s));

//String methods//
//1)uppercase and lowercase in strings//
// String S1 = new String("hello");
// String S2 = new String("WORLD");
// System.out.println(S2.toLowerCase());
// System.out.println(S1.toUpperCase());

//Java String trim() method
//The String class trim() method eliminates white spaces before and after the String.

// String S1 = "  snehal  ";
// System.out.println(S1);
// System.out.println(S1.trim());

//2)Java String startsWith() and endsWith() method//
// String s="Snehal";    
//  System.out.println(s.startsWith("S"));   
//  System.out.println(s.endsWith("al"));  

//3)Java String charAt() Method
//The String class charAt() method returns a character at specified index.

// String S1 = new String("hello");
// System.out.println(S1.charAt(4));

//Java String length() Method
//The String class length() method returns length of the specified String.

// String S1 = new String("hello");
// System.out.println(S1.length());

//Java String intern() Method//
// String S1 = new String("hello");
// String S2 = S1.intern();
// System.out.println(S2);

//valueOf method in string//
// int a = 10;
// String s = String.valueOf(a);
// System.out.println(s);


//Java String replace() Method//

// String S = "my name is snehal";
// String S1 = S.replace("snehal","sinu");
// System.out.println(S1);

//*StringBuffer in java */
//1)append method//
// StringBuffer S = new StringBuffer("Snehal");
// StringBuffer S1 = S.append("deshmukh");
// System.out.println(S1);

//2) StringBuffer insert() Method//
// StringBuffer S = new StringBuffer("Snehal");
// StringBuffer S1 = S.insert(1,"hello");
// System.out.println(S1);

//3) StringBuffer replace() Method//
// StringBuffer S1 = new StringBuffer("hello");
// StringBuffer S2 = S1.replace(0, 3, "java");
// System.out.println(S2);

//4) StringBuffer delete() Method//
// StringBuffer S1 = new StringBuffer("snehal");
// StringBuffer S2 = S1.delete(1,3);
// System.out.println(S2);

//StringBuffer reverse() Method//
// StringBuffer S = new StringBuffer("snehal");
// S.reverse();
// System.out.println(S);

//6) StringBuffer capacity() Method
// The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
// The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
//  For example if your current capacity is 16, it will be (16*2)+2=34.

// StringBuffer S = new StringBuffer();
// S.append("snehal");
// System.out.println(S.capacity());
// S.append("java is my favourite language");  
// System.out.println(S.capacity());

//7) StringBuffer ensureCapacity() method//

// StringBuffer S1 = new StringBuffer();
// S1.append("snehal");
// System.out.println(S1.capacity());
// S1.ensureCapacity(50);
// System.out.println(S1.capacity());

//     }
// }


//String vs StringBuffer//
String S1 = "snehal";
String S2 = S1+"Deshmukh";
System.out.println(S2);
System.out.println("hashcode of S1 :"+S1.hashCode());
System.out.println("hashcode of S2 :"+S2.hashCode());

StringBuffer S3 = new StringBuffer("Snehal");
StringBuffer S4 = S3.append("Deshmukh");
System.out.println(S4);
System.out.println("hashcode of S3 "+S3.hashCode());
System.out.println("hashcode of S4 "+S4.hashCode());

    }}