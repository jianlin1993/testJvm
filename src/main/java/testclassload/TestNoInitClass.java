package testclassload;

public class TestNoInitClass {

    public static void main(String[] args) {
    //System.out.println(ChildClass.value);
    SuperClass[] superClasses=new SuperClass[10];
//    for(int i=0;i<10;i++){
//        superClasses[i]=new SuperClass();
//    }
    for(SuperClass s :superClasses){
        System.out.println(s);
    }
    }
}
