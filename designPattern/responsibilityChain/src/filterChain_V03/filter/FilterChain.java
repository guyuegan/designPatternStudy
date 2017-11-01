package filterChain_V03.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:21 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */

/**
 *  FilterChain也是IMsgFilter，
 *  可以把整个过滤链看成是一个过滤器
 */
public class FilterChain implements IMsgFilter{

    List<IMsgFilter> filterList = new ArrayList<>();

    public String doFilter(String msg){
        String r = msg;
        for (IMsgFilter f : filterList){
            r = f.doFilter(r); //将每个过滤其过滤后的结果保存，作为下一个过滤器的参数
        }
        return r;
    }

    public FilterChain addFilter(IMsgFilter msgFilter){
        this.filterList.add(msgFilter);
        return this;
    }

    public FilterChain(){

    }

    public FilterChain(List<IMsgFilter> filterList) {
        this.filterList = filterList;
    }

}
