public class MethodOverloading {
    public static void main(String[] args){
        test t1 = new test();
        t1.m1();
        t1.m1(10);
        t1.m1(0.9);
    }
}
class test{
    public static void m1(){
        System.out.println("The normal method !");
    }
    public static void m1(int number){
        System.out.println("The intger is :"+number);
    }
    public static void m1(double num){
        System.out.println("The double is :"+num);
        
    }
}
