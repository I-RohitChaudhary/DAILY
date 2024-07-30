class IsARelationship {
    public static void main(String[] args) {
        p c1 = new c();
        c1.m1();
    }
}

class p {// parent class
    public static void m1() {
        System.out.println("Parent-class");
    }
}

class c extends p { // children class
    public static void m2() {
        System.out.println("Children-class");
    }
}