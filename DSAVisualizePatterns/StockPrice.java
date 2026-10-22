package DSAVisualizePatterns;

public class StockPrice {
    
    public static void main(String[] args)
    {
        double[] prices = new double[]{1.1,2.0,1.3,3.1,0.2,0.1,5.1,5.3};

        double[] dailyPrices = new double[]{1.0,0.1,2.3,5.7,3.4};

        double getResult = getMaxProfit(prices);

        double result = getProfit(dailyPrices);

        System.out.println(getResult);
        System.out.println(result);

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


    // Optimize using 2 pointer
    public static double getProfit(double[] prices)
    {
        if(prices == null || prices.length == 1)
            return 0;

        double maxProfit = Double.MIN_VALUE;
        double currentProfit = 0;
        double lowestPrice = prices[0];

        for(int sell = 1; sell < prices.length; sell++)
        {
            if(lowestPrice > prices[sell])
                lowestPrice = prices[sell];

            currentProfit = prices[sell] - lowestPrice;

            if(currentProfit > maxProfit)
                maxProfit = currentProfit;
        }
        return maxProfit;
    }
}
