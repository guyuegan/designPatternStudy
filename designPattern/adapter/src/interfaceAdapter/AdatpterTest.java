package interfaceAdapter;

public class AdatpterTest {
    public static void main(String[] args) {
        Sourceable sub01 = new SourceSub01();
        Sourceable sub02 = new SourceSub02();
        sub01.method1();
        sub02.method2();
    }
}
