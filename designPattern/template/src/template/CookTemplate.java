package template;

/**
 *  定义一个操作中算法的骨架，而将一些步骤延迟到子类中，
 *  模板方法使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤。
 *
 * 通俗点的理解就是 ：完成一件事情，有固定的数个步骤，但是每个步骤根据对象的不同，而实现细节不同；
 * 就可以在父类中定义一个完成该事情的总方法，
 * 按照完成事件需要的步骤去调用其每个步骤的实现方法。每个步骤的具体实现，由子类完成。
 */
public abstract class CookTemplate {
    public void doCook() {
        System.out.println("做外卖之前的通用操作：抠鼻屎，搓脚丫子");

        prepare();
        cooking();
        serve();

        System.out.println("送外卖之后的通用操作：下次再来，送红包哦");
    }

    public abstract void prepare();

    public abstract void cooking();

    public abstract void serve();
}
