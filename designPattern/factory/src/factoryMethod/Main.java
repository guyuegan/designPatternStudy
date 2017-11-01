package factoryMethod;

import factoryMethod.factory.AbstractPhoneFactory;
import factoryMethod.factory.AppleFactory;
import factoryMethod.factory.MeizuFactory;
import factoryMethod.factory.NewBrandFactory;
import simpleFactory.PhoneFactory;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:24 2017/10/16 0016
 * Q    Q: 1784286916
 * </pre>
 */
public class Main {

    public static void main(String[] args){

        AbstractPhoneFactory phoneFactory = new AppleFactory();
        System.out.println(phoneFactory.createPhone());

        phoneFactory = new MeizuFactory();
        System.out.println(phoneFactory.createPhone());

        phoneFactory = new NewBrandFactory();
        System.out.println(phoneFactory.createPhone());

        /*  //我把原有的Xiaomi这个牌子删掉了，但是试图调用手机工厂去生产这个牌子的手机，程序不会报错
        System.out.println(phoneFactory.createPhone());*/

    }
}
