package testclassload;

public class ChildClass extends SuperClass{
    //手动造一个冲突
    static {
        System.out.println("子类初始化！");
    }
}
