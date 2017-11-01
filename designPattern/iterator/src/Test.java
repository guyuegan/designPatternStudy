/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 12:58 2017/10/19 0019
 * Q    Q: 1784286916
 * </pre>
 */
public class Test {

    //MyArrayList测试
    public static void main01(String[] args){
        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i+"");
        }
        System.out.println("长度（元素个数）： " + arrayList.size());
        for (Object obj : arrayList.findAll()){
            System.out.println(obj);
        }
    }

    //MyLinkedList测试
    public static void main02(String[] args){
        MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i+"");
        }
        System.out.println("长度（元素个数）： " + linkedList.size());
        for (Object obj : linkedList.findAll()){
            System.out.println(obj);
        }
    }

    //MyCollection接口测试，面向接口编程
    public static void main03(String[] args){
        MyCollection collection = new MyLinkedList();

        /**
         * 这下面的代码根据接口collection编写
         */
        for (int i = 0; i < 10; i++) {
            collection.add(i+"");
        }
        System.out.println("长度（元素个数）： " + collection.size());
        for (Object obj : collection.findAll()){
            System.out.println(obj);
        }

        System.out.println("========================================");

        collection = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            collection.add(i+"");
        }
        System.out.println("长度（元素个数）： " + collection.size());
        for (Object obj : collection.findAll()){
            System.out.println(obj);
        }
    }

    //MyIterator接口测试
    public static void main(String[] args){
        MyCollection collection = new MyLinkedList();

        /**
         * 这下面的代码根据接口collection编写
         */
        for (int i = 0; i < 10; i++) {
            collection.add(i+"");
        }
        System.out.println("长度（元素个数）： " + collection.size());
        MyIterator linkedListIter = collection.itertor();
        while (linkedListIter.hasNext()){
            System.out.println(linkedListIter.next());
        }

        System.out.println("========================================");

        collection = new MyArrayList();
        for (int i = 0; i < 15; i++) {
            collection.add(i+"");
        }
        System.out.println("长度（元素个数）： " + collection.size());
        MyIterator arrayListIter = collection.itertor();
        while (arrayListIter.hasNext()){
            System.out.println(arrayListIter.next());
        }
    }

}
