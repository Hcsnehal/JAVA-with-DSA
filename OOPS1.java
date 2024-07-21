import java.util.Scanner;

public class OOPS1 {
    public static void main(String[] args) {

        // The main purpose of Object-Oriented Programming (OOP) in programming is 
        // to create a model of real-world objects and systems, 
        // making it easier to write reusable, maintainable, and scalable code.

        // For example, in a banking app, an "Account" object might have properties like balance,
        //  account number, and owner, and behaviors like deposit, withdraw, and transfer funds. This digital representation mirrors the real-world concept of a bank account, 
        // making the software more relatable and easier to use.

        //the main purpose of oops is to deal with real world entity using programming language.

        //class and object in java 
        //1)class : class is a collection of objects and it doesnt take any space in memory, class is also called 
        //as bluprint logical entity.

        //object : object is an instance of class that executes the class .once the object is created ,it take up space 
        //like other variable in memory.

        //syntax  :
        // class_name obj_name = new class_name();
        //class_name : class name.
        //obj_name : object reference .
        //new : Dynamic memory allocate krke dega
        //class_name() : constructor.

        //constructor :
        //constructor is a special type of method whose name is same as class name 
        
        //* - main purpose of constructor is to initialize the object.
        //  - Every java class has a constructor.
        //  - A constructor is automatically called at the time of object creation.
        //  - A constructor is never contain any retuen type including void.

        


        //types of constructors : 
        //1.private  2.default  3.parametrized 4.copy

        //1.default : does not have any parameter
        //class A {
            //     int a; String name;
            //     A(){
            //          a = 10;
            //          name = "snehal";
            //         // System.out.println(a + " " +name);
            //     }
                    
            //     void show(){
            //         System.out.print(a+ " " +name);
            //     }
            // }
            // class Main{
            //     public static void main(String args[]){
            //         A ref = new A();
            //         ref.show();
            //     }
            // }
        //

        //2.parameterized 
       
        // class A{
        //     A(int a,int b){
        //        int c = a+b;
        //         System.out.println(c);
        //     }
        //  }
        //  class Main{
        //      public static void main(String args[]){
        //          A ref = new A(10,50);
                 
        //      }
        //  }

        //3.copy constructor//
        //whenever we pass object reference to the constructor then it is called copy constructor//

        // class A{
        //     int a; String b;
         
        //  A(){
        //      a = 10; b = "snehal";
        //      System.out.println("origanal constructor " +a);
        //  }
        //  A(A ref){
        //    a = ref.a;
        //    b = ref.b;
        //    System.out.println("copy constructor "+a);
        //  }
        //  }
        //  class Main{
        //      public static void main(String args[]){
        //          A r = new A();
        //          A r1 = new A(r);
                 
        //      }
        //  }
        

        //private constructor//
        // class Main{
        //     int a ; String b;
        //     private Main(){
        //         a = 10;
        //         b = "sinumam";
        //         System.out.println(a +" " +b);
        //     }
        //     public static void main(String args[]){
        //         Main ref = new Main();
        //     }
        // }

        //constructor overloading//
        //whenever we have more than one consrtuctor in our class then its called constructor overloading//

        //Constructor overloading in Java is a concept that allows a class to have multiple constructors with different parameters. This means that a class can have multiple constructors with different parameter lists, 
        //which can be used to initialize objects in different ways.

//class A{
//     int a; char b; String c;
//     A(){
//         a =100; b='a'; c = "sinu";
//     }
//     A(int x){
//        a=x;
//     }
//     A(char y,String z){
//         b=y; c=z;
//     }
// }
// class Main{
//     public static void main(String args[]){
//       A ref = new A();
//       A ref1 = new A(10);
//       A ref2 = new A('s',"snehal");
//       System.out.println(ref.a+" "+ref.b+" "+ref.c);
//       System.out.println(ref1.a);
//       System.out.println(ref2.b+" "+ref2.c);
//     }
// }

//static block in java :

//static block is such kind of block in java which gets executed at the time of loading the .class file into JVM memory//

//class Main{
//     Main(){
//         System.out.println("hello im snehal");
//     }
//     public static void main(String[] args){
//         Main ref = new Main();
//     }
//   {
//     System.out.println("instance block  ");//instace block execute aftr static block
//   }
//     static{
//         System.out.println("learn coading..........");//executed first
//     }
// }

//instance block :
//instance block is similar to method which has no name ,it can be written inside a class only but not inside a method//

//it always executed before the constructor//
//we can use variable only inside the instance block not method//
//we write a time consuming code inside the instance block like-JDBC connectivity//
//execute after static block//
//instance block cannot executed without object//

//static vs instance block :
//instance block :
     //1.it deals with object
     //2.execute at the time of object creation.
     //3.no any keyword required.
     //4.static and non-satic variable can be access inside the instance block.

//static block :
    //1.it deals with class.
    //2.execute at the time of loaded .class file in jvm.
    //3.static keyword is required 
    //4.only static variable accessed.
    
//inheritance :
  //method overidind only possible through inheritance //
  //1.single inheritance :
  //class student{
//     int roll=2 , marks=90;
//     String name="snehal";
    
// }
// class sinu extends student{
//     void show(){
//      System.out.println(roll +" "+marks +" "+ name);
//     }
//     public static void main(String[] args){
//         sinu ref = new sinu();
//         ref.show();
//     }

//2.multilevel inheritance :
// class student{
//     int a=10,b=8,c;
     
//  }
//  class sinu extends student{
//      void sum(){
//       c = a+b;
//       System.out.println("sum of two num is :"+c);
//      }
//      void sub(){
//          c = a-b;
//          System.out.println("sub of two num is :"+c);
//     }
//  }
//  class minu extends sinu{
//      void div(){
//          c = a/b;
//          System.out.println("the division of two num is :"+c);
//      }
//      void mul(){
//          c = a*b;
//          System.out.println("multiplication of two num is :"+c);
//      }
//  }
//  class sub1 extends minu{
//      void rem(){
//          c=a%b;
//          System.out.println("rem of two num is :");
//      }
//  }
//  class Main{
//      public static void main(String[] args){
//          sub1 ref = new sub1();
//          ref.sum();
//          ref.sub();
//          ref.mul(); 
//          ref.rem();
//          ref.div();
//      }
//  }

//multiple inheritance :
//java doesnt support multiple inheritance : 
  //because=whenever a sub class wants to inherit the property of two or more super class
  //that have same method ,java compiler cant decide which class method it should inherit .
  //then theit might be chance of memory duplication.i.e a reason java doesnt support multiple inheritance 
  //through classes.

 //hirarchical inheritance :
//  class A{
//     void input(){
//         System.out.println("enter your name :");
//     }
// }
// class B extends A{
//     void disp(){
//         System.out.println("my name is snehal ");
//     }
// }
// class C extends A{
//     void show(){
//         System.out.println("my name is sanika ");
//     }
// }
// class Main{
//     public static void main(String args[]){
//     B r1 = new B();
//     C r2 = new C();
    
//     r1.input(); r1.disp();
//     r2.input(); r2.show();
    
    
// }} 

//super keyword :
//to avoid the confusion between super class and subclasses variables and methods that have same name we shoule use super keyword//

// class A{
//     int a = 10;
// }
// class B extends A{
//     int a = 90;
//     void show(){
//         System.out.println(a);
//         System.out.println(super.a);
//     }
// }
// class Main{
//     public static void main(String args[]){
//         B ref = new B();
//         ref.show();
//     }
// }

//in case of default constructor there is no need to use super() keyword //
// class A{
//     A(){
//         System.out.println("hello learner :");
//     }
// }
// class B extends A{
  
//     B(){
//        System.out.println("hello viewer : :");
        
//     }
// }
// class Main{
//     public static void main(String args[]){
//         B ref = new B();
       
//     }
// }


//this keyword //
//this keyword refers to the current object inside a method or constructor //
//differenciate current variable and instance variable//

// class A{
   
//     int a=90;
    
//     A(int a){
//        this.a = a;
//     }
//     void show(){
//          System.out.println(a);
//     }
// }

// class Main{
//     public static void main(String args[]){
//         A ref = new A(20);
//          ref.show();
        
//     }
// }
//it is also used when we want to call the default constructor of its own class//
//example =
// class A{
// A(){
//     System.out.println("learn coding....");
// }

// A(int a){
//     this();
//   System.out.println(a);
// }

// }

// class Main{
// public static void main(String args[]){
//     A ref = new A(30);
     
    
// }
// }

//it is also  called parameterizzed constructor of its own class//
// class A{
   
//     A(){
//         this(80);
//     }
    
//     A(int a){
        
//       System.out.println(a);
//     }
    
// }

// class Main{
//     public static void main(String args[]){
//         A ref = new A();
         
        
//     }
// }


//polymorphism //
//1.compile time 
//2.runtime 

//1.compile time polymorphism =
//A polymorphism which is exists at the time of compilation is called compile time 
//polymorphism or early binding or static polymorphism.

//example : method overloading
//a class contain more than one method with same name and differents types of parameters 
//called method overloading.
// class A{
//     void add(){
//         int a = 10,b = 20,c;
//         c = a+b;
//         System.out.println(c);
//     }
//     void add(int x,int y){
        
//        int c = x+y;
//         System.out.println(c);
//     }
//     void add(String str){
//         System.out.println(str);
//     }
//     public static void main(String args[]){
//         A r = new A();
//         r.add();
//         r.add(80,80);
//         r.add("sinu");
//     }
// }

//2.Runtime polymorphism :
//A polymorphism which exists at the time of execution of program is called runtime polymorphism.
//example : mathod overriding 
//method overriding : whenever we writing method in super and sub classes in such a way
//that method name and parameter must be same called method overriding.
//we cannot perform method overriding without inheritance.

// class A{
//     void draw(){
//         System.out.println("cant say shape ....");
//     }
// }
// class B extends A{
//     @Override
//     void draw(){
//         super.draw();
//         System.out.println("Squere shape ....");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         B r = new B();
//         r.draw();
       
//     }
    
// }

//Encapsulation :
//wrapping the data members and member methods of class in a single unit called encapsulation//
//note : declare the class  variable as a private 
//declare the class method public.
//class is the best example of encapsulation


// class A{
//     private int a;//data hiding
//     public void setValue(int x){
//        a=x;
//     } 
//     public int getValue(){
//         return a;
//     } 
// }
// class Main{
//     public static void main(String args[]){
//         A ref = new A();
//         ref.setValue(300);
//        System.out.println(ref.getValue());
        
//     }
// }


//Abstraction :
//advantages : 1.security  2.Enhancement
//abstraction implemetation :1.abstract class 2.interface
//abstract class : A class which contain the abstract keyword in its decalration is called abstract class.
//abstract class A {
//   }
//we cant create object in abstract class 
//it may or may not contain abstract method
//it can have abstract or non-abstract method
//to use an abstract class ,you have to inherit it from sub classes.
//

// abstract class Animal{
//     Animal(){
//         System.out.println("all animals.....!");
//     }
//     public abstract void sound();
// }
// class Dog extends Animal{
//     Dog(){
//         super();
//     }
//     public void sound(){
//         System.out.println("dog is barking.....");
//     }
// }
// class Lion extends Animal{
//     public void sound(){
//         System.out.println("lion  is Roar.....");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         Dog d = new Dog();
//         Lion l = new Lion();
//         d.sound();   l.sound();
//     }
// }

//abstract method //
//a method which contain abstract modifire at the time of declaration is called abstract method//
//it can only be used in abstract class.
//it doesnt contain any body and always ends with " ; "
//whenever the action is common but implementation is different then we should used abstract method//

// abstract class Programming{
//     public abstract void Developer();
// }
// class Html extends Programming{
//     @Override
//     public void Developer(){
//         System.out.println("ben tar");
//     }
// }
// class java extends Programming{
//     @Override
//     public void Developer(){
//         System.out.println("james gosling..");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         Html h = new Html();
//         h.Developer();
        
//         java j = new java();
//         j.Developer();
//     }
// }

//Interface in java :

//interface just like a class ,which contain only abstract method.
//to achieve interface java provides a keyword called implements.
//interface method  are by default public and abstract.
//interface variables are by default public,static,final.
///interface method must be overriden inside the implementing classes 
//interface nothing but deals between client and developer.


// import java.util.Scanner;
// interface Client{
//     void input();
//     void output();
// }
// class Sinu implements Client{
//     String name ; Double sal;
//     public void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter username :");
//         name = sc.nextLine();
        
//          System.out.println("enter salary :");
//          sal = sc.nextDouble();
//     }
//     public void output(){
//         System.out.println(name +" "+sal);
//     }
//     public static void main(String[] args){
//         Client l = new Sinu();
//         l.input();
//         l.output();
//     }
// }
//multiple inheritance using interface //
//interface variable are public static and final

// By making these variables public static final, it provides a clear and consistent way to define constants across different implementations.
// It avoids confusion that could arise if different implementations were able to modify the values of the variables.

//multiple inheritance using interfaces :
//we can achieve multiple inheritance through interfaces because interfaces contain only abstract method 
//which implementation is provided by the sub classes .

//example :
// interface A{
//     void show();
// }
// interface B{
//     void show();
// }
// class Main implements A,B{
//     public void show(){
//         System.out.println("im from class A and B");
//     }
    
//     public static void main(String args[]){
//         Main m = new Main();
//         m.show();
//     }
// }

//example 2
// interface A{
//     void show();
// }
// interface B{
//     void disp();
// }
// class Main implements A,B{
//     public void show(){
//         System.out.println("im from class A");
//     }
//     public void disp(){
//         System.out.println("im from class B");
//     }
    
//     public static void main(String args[]){
//         Main m = new Main();
//         m.show(); m.disp();
//     }
// }


}    

    }

