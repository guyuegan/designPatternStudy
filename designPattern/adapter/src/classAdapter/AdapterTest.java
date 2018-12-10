package classAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        /**Targetable接口的实现类有了Source类的功能*/
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
