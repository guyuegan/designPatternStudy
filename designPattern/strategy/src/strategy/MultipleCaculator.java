package strategy;

public class MultipleCaculator extends AbstractCaculator implements ICaculator {
    @Override
    public int caculate(String exp) {
        /** 不加\\
         *  Dangling meta character '*' near index 0
         */
        int[] intArr = split(exp, "\\*");
        int accumulation = 1;
        for (int i = 0; i < intArr.length; i++) {
            accumulation *= intArr[i];
        }
        return accumulation;
    }
}
