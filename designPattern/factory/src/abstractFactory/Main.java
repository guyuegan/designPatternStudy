package abstractFactory;


import abstractFactory.factory.AbstractPhoneFactory;
import abstractFactory.factory.AppleFactory;

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

    }
}
