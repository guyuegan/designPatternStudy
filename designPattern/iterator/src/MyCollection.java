import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:36 2017/10/20 0020
 * Q    Q: 1784286916
 * </pre>
 */
public interface MyCollection {

    void add(Object object);

    int size();

    /**
     * 要求所有具体的集合实现类都必须返回MyIterator对象
     * @return
     */
    MyIterator itertor();

    List<Object> findAll();
}
