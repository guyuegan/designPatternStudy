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
public class HungrySingleton {

    private String name;

    private static final HungrySingleton hungrySingleton =
            new HungrySingleton("我是饿汉式单例，我创造了世界上“独一无二的”，gyg牌-法拉利");

    private HungrySingleton(){

    }

    public HungrySingleton(String name) {
        this.name = name;
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    @Override
    public String toString() {
        return "HungrySingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
