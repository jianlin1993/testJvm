package testclassload;

public class ChildClass extends SuperClass{
    static {
        System.out.println("子类初始化！");
    }
}
