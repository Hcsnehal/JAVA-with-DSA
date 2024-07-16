import java.util.*;

public class Exception_handling {
   // public static void main(String[] args){
    //throws InterruptedException {


        // int a = 10,b  = 0;
        // int c = a/b;
        // System.out.println(c);

        //try catch block//
        // int a = 10,b = 0,c;
        // try{
        //     c = a/b;
        //     System.out.println(c);
        // }
        // catch(Throwable e ){
        //      System.out.println(e);//catch block says the reason of exception
        //  }

        // //Null pointer exception//
        // String str = null;
        // try{
        // System.out.println(str.toUpperCase());
        // }
        // catch(NullPointerException e){
        //     System.out.println(e);
        //     System.out.println("code is ended...........");

        //finally block //
        // int a = 10,b = 0,c;
        // try{
        //     c = a/b;
        //     System.out.println("im throwing these exception in catch block........");
        // }
        // catch(Throwable e){
            
        //     System.out.println("i catched the exception ..");
        // }
        // finally{
        //     System.out.println("i have to execute ...........");
        // }

        //multiple try-catch block//
        // try{
        //     int a = 10,b = 0,c;
        //     c = a/b;

           
        // }
        // catch(ArithmeticException e){
        //     System.out.println("cant divided by zero ..");
        // }
        // try{
        //     int a[] = {1,2,3,4,5};
        //     System.out.println(a[5]);
        // }
        // catch(ArrayIndexOutOfBoundsException a){
        //     System.out.println("array outof bound exception...");
        // }

        // try{
        //     int a = 10,b = 0,c;
        //     c = a/b;

        //     int d[] = {1,2,3,4};
        //     System.out.println(d[6]);
        // }
        // catch(Throwable t){
        //     System.out.println("let me see.....");
        // }
       

        //multiple catch block//
        // try{
        //     int a = 10,b = 0,c;
        //     c = a/b;
        //     System.out.println("valiu of c is :"+c);

        //     int d[] = {1,2,3,4};
        //     System.out.println("array index is "+d[7]);

        //     String str = null;
        //     System.out.println(str.toLowerCase());
            
        // }
        // catch(ArrayIndexOutOfBoundsException a){
        //     System.out.println("array is out of bound........");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("cant divided by zero ......");
        // }
        // catch(NullPointerException n){
        //     System.out.println("nullpointer exception.....");
        // }

        //nested try block...//
        //in these outer try block contain minimum risky code while inner try block contain
        //more risky code.

        // try{

        //     try{
        //     int a[] = {1,2,3,4};
        //     System.out.println(a[6]);
        //     }
        //     catch(ArrayIndexOutOfBoundsException a){
        //         System.out.println("array out of bound exception...");

        //     }
        //     System.out.println(10/0);
        // } 
        // catch(ArithmeticException e){
        //     System.out.println("arithmatic exception.. ");
        // }
        // System.out.println("learn coding..............");

        //cheaked and uncheaked exception//
         //1)cheaked exception:the exception which are cheaked by compiler for smooth execution of program at runtime//   
         //uncheaked exception:the exception which are not cheaked by compiler and it directly take care by jvm.

         //2)cheaked exception are commonly occured exception so,the compiler takes vary much care about these exception//
         //uncheaked exception are rarely occured exception so,the compiler doesn't take very much care about these exception.

         //example
         //1.cheaked exception: Io/exception,interrupted exception,sql exception.
         //2.uncheaked exception:(runtime exception) arithmatic exception,nullpointer exception,number formate exception//
         //

         //try catch finally inside finally//

        //  try{
        //     int a = 10,b = 0,c;
        //     c = a/b;
        //  }
        //  catch(Exception e){
        //     System.out.println(e);
        //  }
        //  finally{
        //     try{
        //         String str = null;
        //         System.out.println(str.toLowerCase());
        //     }
        //     catch(NullPointerException n){
        //         System.out.println(n);
        //     }
        //     finally{
        //         System.out.println("learn coding....");
        //     }
         //}

         //final vs finally vs finalize//

        //1)final : final is a keyword. it is applicable for variable ,method and classes.
        //2)finally : finally is a block it is always executed whether the exception is handled by user or not.
        //3)finaliza() : finaliza() is a method .it is used to deallocate the resources which is allocated by unused object.

        //throw keyword/
        //he throw keyword is used to explicitly throw an exception in Java.
       //It can throw both checked and unchecked exceptions.
       //throw keyword explicitly throw error

        // System.out.println(10/0);  imlpicitly throw an error

        //throw new ArithmeticException("/ by zero ");  //explicitly throws error

        //throws keyword in java //

        //throws keyword is used when we doesnt want to handle the exception and try to send the exception 
        //to the jvm (jvm or other method )

        // for (int i = 1; i<=10; i++) {
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

       // System.out.println(10/0);

        //difference between throw and throws keyword//
        //1.throw keyword : used to throw an exceptiom object explicitly.
        //1.throws keyword : used to declare an exception as well as by pass the caller.

        //2.throw keyword always present inside the method body.
        //2.throws keyword always used with mathod signature.

        //3.we can throw only one exception at a time.
        //3.we can handle multiple exception using throws keyword

        //4.throw keyword is followed by an instance 
        //4.throws keyword is followed by class.

        // void div(int a ,int b){
        //    if(b == 0){
        //     throw new ArithmeticException();
        //    }
        //    else{
        //     int c = a/b;
        //     System.out.println(c);
        //    }
        // }
        // public static void main(String[] args) {
        //     Exception_handling cd = new Exception_handling();
        //     cd.div(20,10);
        // }


        //try-catch vs throws//
        //their is no gauranty that throws keyword terminate program till last.
        // public static void sinu()throws InterruptedException{
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }
        // }
        // public static void main(String[] args){
        //   try{
        //     sinu();
        //     System.out.println(10/0);
        //   }
        //   catch(Exception e){
        //     System.out.println("Exception Handled...!");
        //   }
        //   finally{
        //     System.out.println("finally block executed successfullyy............");
        //   }
        //    System.out.println("learn coding.............");
        // }
          
        //  class mathamaticalException extends Exception{
        //     mathamaticalException(String msg){
        //         System.out.println(msg);
        //     }  user defined exceptio
         
       // public static void main(String[] args) throws mathamaticalException{
        //    try{
        //     int a = 10,b = 10,c;
        //     c = a/b;
        //     System.out.println(c);
        //    }
        //    catch(mathamaticalException e){
        //     System.out.println("handled..");
        //    }
        

        //Exception propagation in java ....//

// Exception propagation in Java refers to the process by which an exception is passed (or "propagated")
// up the call stack until it is caught by an appropriate exception handler.

    //   public static void main(String[] args)throws Throwable{
    //     m1();
    //   }
    //   public static void m1(){

    //     m2(); 
    //   }
    //   public static void m2(){
    //     m3();
    //   }
    //   public static void m3(){
    //     System.out.println(10/0);
    //   }
      

    //difference between exception and error//

    //1.Exception is caused by our program.
    //1.errors are not caused by our program.

    //2.Exception are coverable.
    //2.errors are not recoverable. //outofmemory error

    //3.in java ,exceptions are classified by cheaked or uncheaked type
    //3.errors are only uncheaked type in java.
        }
     


        
    

