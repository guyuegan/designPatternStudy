/**
 * <pre>
 * 功    能:
 *          单例模式--好比我要生产世界上唯一的汽车
 *
 *          1.生产的车只能有一辆
 *          2.生产的工艺只有我会
 *          3.让世界上的人都可以正常使用这辆车
 *
 *          1、单例类只能有一个实例。
 　　       2、单例类必须自己创建自己的唯一实例。
 　　       3、单例类必须给所有其他对象提供这一实例。
 *
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 11:08 2017/10/14 0014
 * Q    Q: 1784286916
 * </pre>
 */
public class LazySingleton {

    private String name;

    private static LazySingleton lazySingleton
            = null;

    private LazySingleton(){

    }

    private LazySingleton(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance(){
        //第一次使用，需要先new，以后和饿汉模式一样
        if (lazySingleton == null) lazySingleton =
                new LazySingleton("我是懒汉式单例，我创造了世界上“独一无二的”，gyg牌-拖拉机");
        return lazySingleton;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
