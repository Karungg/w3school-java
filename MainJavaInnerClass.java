class JavaInnerClass {
    int x = 10;

    public class InnerJavaInnerClass {
        int y = 5;    
    }
}

public class MainJavaInnerClass
{
    public static void main(String[] args) {
        JavaInnerClass myOuter = new JavaInnerClass();
        JavaInnerClass.InnerJavaInnerClass myInner = myOuter. new InnerJavaInnerClass();
        System.out.println(myOuter.x);
        System.out.println(myInner.y);
    }
}
