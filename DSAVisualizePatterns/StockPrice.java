package DSAVisualizePatterns;

public class StockPrice {
    
    public static void main(String[] args)
    {
        double[] prices = new double[]{1.1,2.0,1.3,3.1,0.2,0.1,5.1,5.3};

        double getResult = getMaxProfit(prices);

        System.out.println(getResult);

    }

    public static double getMaxProfit(double[] dailyPrices)
    {

        if(dailyPrices == null || dailyPrices.length == 1)
            return 0;

        double currentProfit = 0;
        double maxProfit = Double.MIN_VALUE;

        for(int index = 0; index < dailyPrices.length-1; index++)
        {
            for(int j = index+1; j < dailyPrices.length; j++)
            {
                currentProfit = dailyPrices[j] - dailyPrices[index];
                if(currentProfit > maxProfit)
                    maxProfit = currentProfit;
            }
        }
        return maxProfit;

    }
}
