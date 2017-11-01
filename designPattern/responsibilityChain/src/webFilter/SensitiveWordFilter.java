package webFilter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:50 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class SensitiveWordFilter
        implements IMsgFilter {

    @Override
    public void doFilter(WebRequest req, WebResponse resp, FilterChain chain) {
        //process the sensitive words
        String r = req.getReqStr().replace("敏感", "不敏感")
                .replace("失业", "就业") + " ~ sensitiveWordFilter";
        req.setReqStr(r);

        if(true) return; //当出现某些情况的时候，直接返回，不再调用下一个filter

        chain.doFilter(req, resp, chain);

        resp.setRespStr(" ~ sensitiveWordFilter");
    }
}
