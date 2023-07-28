import java.util.Arrays;

public class Exercise {

    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int dayPrice : prices) {
            System.out.println(dayPrice);
            if (dayPrice < buyPrice) {
                buyPrice = dayPrice;
            } else if (dayPrice - buyPrice > maxProfit) {
                maxProfit = dayPrice - buyPrice;
            }
        }
        System.out.println("Buying price is $" + buyPrice +" and selling price is $" + (buyPrice + maxProfit));
        System.out.println("Maximum profit is = $" +maxProfit);
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices =  new int[]{7, 1, 5, 3, 6, 4};
        Exercise exercise = new Exercise( );
        exercise.maxProfit(prices);


    }


}
