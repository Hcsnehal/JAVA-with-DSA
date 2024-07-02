import java.util.*; 
public class loops {
   // 1)while loop//
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
    // int counter = 1;
    // while(counter < 100){
    //     System.out.println("hello world");
    //     counter++;
    // }

    
    // if we have to print infinite loop then we use true inside while condition// dont run these code, because these code never stop running.. 
    // while(true){
    //     System.out.println("hello world");
    //     counter++;
    // }


   
    // System.out.println("enter a num =");
    // int n = sc.nextInt();
    // int counter = 1;
    // while (counter <= n) {
    //     System.out.println("sinu mam");
    //     counter++;
    // }
    

  // System.out.println("enetr a num = ");
  // int num = sc.nextInt();
  // int i = 1;
  // int sum = 0;
  // while (i <= num) {
  //   sum = sum + i;
  //   i++;
   
  // }
  // System.out.println(sum);

                                                /// 2)for loop ///

  // for (int i = 0; i <= 10; i++) {
  //   System.out.println("hello world");
  // }              
  
  //  for (int i = 1; i <= 4; i++) {
  //   System.out.println("****");
  //  }


  // if we divide any number by 10 then reminder is come last num of that digit//
  // long a = 23456777777777778l; // if we divided these by 10 then reminder will come 8
  // long b = a % 10;
  // System.out.println(b);

  // int a = 123345; // if we have to remove last digit from num then divid it by 10
  // int b = a/10;
  // System.out.println(b);

  //print reverse of numbers//
  // System.out.println("enter a num =");
  // int i = sc.nextInt();
  // while (i>0) {
  //   int lastdigit = i%10;
  //   System.out.print(lastdigit);
  //   i = i/10;
  // }
  

  //do while loop//

  //    int i = 1;
  //    do{
  //     System.out.println("helloo world");
  //     i++;
  //    }while(i <= 10);

  //break statement in loop//
  //  for (int i = 1; i <= 5; i++) {
  //   if(i == 3){
  //     break;
  //   }
  //   System.out.println(i);
    
  //  }
  //  System.out.println("i am out of the loop");
    //  do {
    //   System.out.println("enter a num = ");
    //   int n = sc.nextInt();
    //   if (n % 10 == 0) {
    //     break;
    //   }
    //   System.out.println(n);
    //  } while (true);

    //  do {
    //   System.out.println("enter a num :");
    //   int n = sc.nextInt();
    //   if(n % 10 == 0){
    //     continue;
    //   }

    //  } while(true);

    // cheak if num is prime or not //
   
    // System.out.println("enter a num :");
    // int n = sc.nextInt();
   
    // if (n % 1 == 0 && n % 2 !=0 ) {
    //   System.out.println("num is prime");
    // }
    // else{
    //   System.out.println("num is not prime");
    // }

    //Write a Program to Calculate Sum of first N Natural
    //Numbers (here value of N is Entered by user)
      
    System.out.println("enter a num =");
    int n = sc.nextInt();

    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    //   sum = sum + i;
      
    // } 
    // System.out.println("the sum of first n natural number is =" +sum);
     

    //Write a Program to Find Factorial of a given number N
    //(N is entered by user)
    //  int fact = 1;
    // for (int i = 1; i <= n; i++) {
    //  fact = fact * i;
    // }
    // System.out.println("factorial of given number is =" +fact);

    //Write a Program to Generate Multiplication Table of a
    //number (entered by the user) using a for loop
    // int mul;
    // for (int i = 1; i <= 10; i++) {
    //  mul = n*i;
    //  System.out.println(mul);
    // }

    //Write a Program to Reverse a given Number N by user
    
    // while (n>0) {
    //   int lastdigit = n%10;
    //   System.out.print(lastdigit);
    //   n = n/10;
    // }
    int sum = 0;
    while (n != 0) {
     sum = sum+n%10;
   
    n = n / 10;
      
    }
    System.out.println(sum);
  }   
}
}