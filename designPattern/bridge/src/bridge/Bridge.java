package bridge;

public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public Sourceable getSource() {
        return source;
    }
}
