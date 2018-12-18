package decorator;

/**
 * 装饰模式和代理模式不同点：
 *   装饰模式客户端使用时，需要客户端提供要装饰的源对象
 *   代理模式客户端使用时，客户端不用关心被代理的源对象（一般代理对象会组合一个源对象）
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Decorator decorator = new Decorator(source);
        System.out.println("=======================原始");
        source.method();
        System.out.println("=======================装饰");
        decorator.method();
    }
}
