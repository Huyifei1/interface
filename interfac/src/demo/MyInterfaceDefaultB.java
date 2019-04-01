package demo;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAs() {
        System.out.println("实现抽象方法，BBB");
    }
    @Override
    public void methodDefault(){
        System.out.println("实现类B覆盖重写了接口的默认方法methodDefault");
    }
}
