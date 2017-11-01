import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:02 2017/10/19 0019
 * Q    Q: 1784286916
 * </pre>
 */
public class MyLinkedList implements MyCollection{

    /**
     * 实现类在实现泛型接口时需要指明具体的参数类型，不然默认类型是 Object，这就失去了泛型接口的意义
     */
    class LinkNode<E>{
        public E nodeData;
        public LinkNode nextNode;
    }

    /**
     *  新建一个头节点，将尾节点指向头节点
     */
    private LinkNode<Integer> startNode = new LinkNode<>();
    private LinkNode endNode = startNode;

    @Override
    public void add(Object nodeData){
        LinkNode newNode = new LinkNode();
        newNode.nodeData = nodeData;
        endNode.nextNode = newNode; //将新增节点接到链表尾节点
        endNode =  newNode; //新增节点变成尾节点
        if (startNode.nodeData == null){
            startNode.nodeData = 1;
        }else {
            startNode.nodeData ++;
        }
    }

    @Override
    public int size(){
        return startNode.nodeData;
    }

    @Override
    public MyIterator itertor() {
        /**
         * 匿名内部类（直接实现接口）
         */
        return new MyIterator(){

            private LinkNode curNode = startNode.nextNode;

            @Override
            public boolean hasNext() {
                if (curNode == null) return false;
                return true;
            }

            @Override
            public Object next() {
                LinkNode returnNode = curNode;
                curNode = curNode.nextNode;
                return returnNode.nodeData;
            }
        };
    }

    public List<Object> findAll(){
        List<Object> allNodeLs = new ArrayList<>();
        LinkNode tmp = startNode.nextNode; //取出头节点的下一节点（头节点存放的是元素个数）

        while (tmp != null) {
            allNodeLs.add(tmp.nodeData);
            tmp = tmp.nextNode; //当前节点不为空，则指向下一个节点
        }

        return allNodeLs;
    }

}
