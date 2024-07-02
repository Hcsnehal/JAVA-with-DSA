import java.util.*;
public class oprators {
    //Arithmatic oprator
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println("addition of two num is=" + (a+b));
    // System.out.println("subtration of two num is =" +(a-b));
    // System.out.println("mul of two num is =" +(a*b));
    // System.out.println("division of two num is ="+(a/b));
    // System.out.println("reminder of two num is ="+(a%b));//modulus give reminder
     
    // unary oprator //
    // int a = 10;
    // int b = ++a;//pre increment
    // System.out.println(a);
    // System.out.println(b);
  

    // int a = 10;
    // int b = a++;//pre increment
    // System.out.println(a);
    // System.out.println(b);

    // int a = 10;
    // int b = --a;
    // System.out.println(a);
    // System.out.println(b);

    // int a = 10;
    // int b = a--;
    // System.out.println(a);
    // System.out.println(b);

    //Assignment oprator //
    
    //  int a=10;
    // //  a = a+10; we can write these as a+=10
    //  a -= 10; //a = a-10
    //  a *= 10; // a = a*10
    //  a /= 10; // a = a/10
    //  a %=10 ;// a = a%10
    //  System.out.println(a);

    // int a = 10;
    // // a = a < 10 ? 2 : 3;// ternery oprator
    // // System.out.println(a);
    // String st = a<=10 ? "even" : "odd";
    // System.out.println(st);


    // switch statement//
    // System.out.print("enter a num = ");
    // int num = sc.nextInt();
    // switch(num){
    //     case 1:System.out.println("samosa");
    //     break;
    //     case 2:System.out.println("burger");
    //     break;
    //     case 3:System.out.println("momos");
    //     break;
    //     case 4:System.out.println("maggy");
    //     default:System.out.println("none of them");
    // }


    // calculator using switch //

    System.out.println("enter a num =");
    int a = sc.nextInt();

    System.out.println("enter a next num =");
    int b = sc.nextInt();
    
    System.out.println("enter a oprator ");
    char oprator=sc.next().charAt(0);

    switch(oprator){

        case '+' : System.out.println(a+b);
                break;
        case '-' : System.out.println(a-b);
                break;
        case '*' : System.out.println(a*b);
                 break;
        case '/' : System.out.println(a/b);
 
    }

   

   





    }
}
