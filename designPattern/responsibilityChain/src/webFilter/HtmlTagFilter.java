package webFilter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:47 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class HtmlTagFilter implements IMsgFilter {

    @Override
    public void doFilter(WebRequest req, WebResponse resp, FilterChain chain) {
        // process the html tag
        String r = req.getReqStr().replaceAll("<", "[")
                .replace(">", "]") + " ~ htmlTagFilter";
        req.setReqStr(r);

        chain.doFilter(req, resp, chain);

        resp.setRespStr(" ~ htmlTagFilter");
    }
}
