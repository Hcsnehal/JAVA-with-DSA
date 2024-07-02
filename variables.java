public class variables
{
    static int b = 20;//static variable
    int c = 30;//instance variable
    public static void main(String[] args){
        int a = 10;//local variable
        System.out.println(a);
        System.out.println(variables.b);//static variable are accessed using class name
        variables x= new variables();//to accessed instance variable we have to create obj.
        System.out.println(x.c);


    }
}