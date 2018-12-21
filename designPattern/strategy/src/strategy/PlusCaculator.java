package strategy;

public class PlusCaculator extends AbstractCaculator implements ICaculator {
    @Override
    public int caculate(String exp) {
        /** 不加\\
         *  Dangling meta character '+' near index 0
         */
        int[] intArr = split(exp, "\\+");
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        return sum;
    }
}
