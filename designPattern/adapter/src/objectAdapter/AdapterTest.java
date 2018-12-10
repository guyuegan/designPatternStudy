package objectAdapter;

import classAdapter.Source;
import classAdapter.Targetable;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Wrapper(new Source());
        target.method1();
        target.method2();
    }
}
