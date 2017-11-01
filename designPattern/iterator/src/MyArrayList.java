import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:30 2017/10/19 0019
 * Q    Q: 1784286916
 * </pre>
 */
public class MyArrayList implements MyCollection{

    private Object[] arr = new Object[10];
    private int index = 0; //记录最后一个元素的下一个位置

    @Override
    public void add(Object element){
        /**
         *  数组装满元素时，新建一个两倍长的数组，
         *  将原数组的所有元素拷到新数组，再将原数组指向新数组
         */
        if(index == arr.length) {
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[index++] = element;
    }

    @Override
    public int size(){
        return index;
    }

    @Override
    public MyIterator itertor() {
        return new ArrayListIterator();
    }

    /**
     *  实现MyIterator接口的内部类
     */
    private class ArrayListIterator implements MyIterator{

        private int curIndex = 0;

        @Override
        public boolean hasNext() {
            if (curIndex >= index) return false;
            return true;
        }

        @Override
        public Object next() {
            return arr[curIndex++];
        }
    }

    public List<Object> findAll() {
        return Arrays.asList(arr);
    }
}
