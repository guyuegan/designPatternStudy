public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator() {
    }

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("decorate before original method");
        source.method();
        System.out.println("decorate after original method");
    }
}
