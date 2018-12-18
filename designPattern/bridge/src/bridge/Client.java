package bridge;

public class Client {
    public static void main(String[] args) {
        MyBridge bridge = new MyBridge();

        bridge.setSource(new SourceSub1());
        bridge.method();

        bridge.setSource(new SourceSub2());
        bridge.method();
    }
}
