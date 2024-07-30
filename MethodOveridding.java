public class MethodOveridding {
    public static void main(String[] args){
        parent p = new parent();
        children c =new children();
        c.bike();
    }
}
class parent {
    static void bike(){
        System.out.println("The 125cc bike you have to get");
    }
}
class children extends parent {
    static void bike(){
        System.out.println("I -super-meteor-650cc");
    }
}