package Array_Concept;

public class MoneySaved {
    
    public static void main(String[] args) {

        int[] itemsPriceOfShopA = new int[]{100 , 450, 90, 20};
        int[] itemsPriceOfShopB = new int[]{90, 455, 99, 10};

        int getResult = getSavedMoney(itemsPriceOfShopA, itemsPriceOfShopB);
        System.out.println(getResult);
    }

    public static int getSavedMoney(int[] shopA , int[] shopB)
    {
        if(shopA == null || shopB == null)
            return -1;

        if(shopA.length == 0 || shopB.length == 0)
            return -1;

        int sumOfShopA = 0;
        int sumOfCompreadMoney = 0;

        for(int index = 0; index < shopA.length; index++)
        {
            for(int indexJ = index; indexJ < shopB.length; indexJ++)
            {
                sumOfShopA += shopA[index];

                if(shopA[index] > shopB[indexJ])
                {
                    sumOfCompreadMoney += shopB[indexJ];
                    break;
                }
                else if(shopA[index] < shopB[indexJ])
                {
                    sumOfCompreadMoney += shopA[index];
                    break;
                }
                
            }

        }

        int savedMoney = sumOfShopA - sumOfCompreadMoney;

        return savedMoney;
    }
}
