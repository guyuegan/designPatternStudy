package webFilter;

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
public class FilterChain implements IMsgFilter {

    List<IMsgFilter> filterList = new ArrayList<>();
    int index = 0;

    @Override
    public void doFilter(WebRequest req, WebResponse resp, FilterChain chain) {
        if (index == filterList.size()) return;

        IMsgFilter filter = filterList.get(index);
        index++;
        filter.doFilter(req, resp, chain);

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
