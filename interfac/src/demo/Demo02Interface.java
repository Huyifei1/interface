package demo;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAs();

        a.methodDefault();

        System.out.println("=============");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAs();
        b.methodDefault();
    }
}
