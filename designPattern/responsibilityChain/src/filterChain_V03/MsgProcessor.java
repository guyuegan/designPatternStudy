package filterChain_V03;

import filterChain_V03.filter.*;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:06 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class MsgProcessor {

    private String msg;

    /**
     * filterChain的好处：可以调整过滤器的过滤顺序，可以灵活添加、删除过滤器
     */
    private FilterChain filterChain;

    public MsgProcessor(){

    }

    public MsgProcessor(String msg, FilterChain filterChain) {
        this.msg = msg;
        this.filterChain = filterChain;
    }

    /**
     * 过滤链处理的优点：添加、删除、修改过滤需求灵活
     * @return
     */
    public String processByFilter(){
        String r = msg;
        r = filterChain.doFilter(r);
        return r;
    }
}
