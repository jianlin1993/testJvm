package testclassload;

/**
 * 被动使用类字段
 * 通过子类引用父类的静态字段  不会导致子类的初始化
 */
public class SuperClass {
    //jvm2不冲突文件
    static{
        System.out.println("父类初始化！");
    }
    public static int value=123;
}
