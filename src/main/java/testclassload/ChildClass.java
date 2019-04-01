package testclassload;

public class ChildClass extends SuperClass{
    //jvm2冲突文件
    static {
        System.out.println("子类初始化！");
    }
}
