package demo;

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
    }
}
