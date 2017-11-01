package filterChain_V03;

import filterChain_V03.filter.*;

import java.util.Arrays;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:06 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class Main {

    public static void main(String[] args){
        String msg = "<script> 大家好:)， 我是敏感字符串，我喜欢看《java从入门到失业》</script>";

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlTagFilter());

        FilterChain filterChain02 = new FilterChain();
        filterChain02.addFilter(new EmojiFilter())
                     .addFilter(new SensitiveWordFilter());

        /**
         *  将一个子过滤链添加到主过滤链时，
         *  可以将子过滤链整体看做是主过滤链的一个过滤器，
         *
         *  那么，在处理器调用主过滤链的doFitler时，
         *  等于调用了两个过滤器（一个简单过滤器，一个子过滤器链）,
         *  再调用子过滤器链的doFilter时，
         *  子过滤链会挨个去调用它包含的每一个过滤器的doFilter
         */
        filterChain.addFilter(filterChain02);

        MsgProcessor msgProcessor = new MsgProcessor(msg, filterChain);

        String result = msgProcessor.processByFilter();
        System.out.println(result);
    }

}
