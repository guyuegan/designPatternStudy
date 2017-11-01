/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 11:27 2017/10/14 0014
 * Q    Q: 1784286916
 * </pre>
 */
public class Main {
    public static void main(String[] args){

        //饿汉单例（线程安全）:【主动】车厂员工都要饿肚子了，赶紧在客人买之前先做好
        HungrySingleton hungrySingleton =
                HungrySingleton.getInstance();
        System.out.println(hungrySingleton);

        //懒汉单例（多线程同步访问时有问题）:【被动】我就是懒的生产，等有人要用的时候再弄
        LazySingleton lazySingleton =
                LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
