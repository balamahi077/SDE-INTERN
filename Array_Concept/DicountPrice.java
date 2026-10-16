package Array_Concept;

public class DicountPrice{

    public static void main(String[] args) {

        int[] itemPrices = new int[]{400, 350, 450};

        double getResult = getDiscountPrice(itemPrices);

        System.out.println("Discount Price : " + getResult);
         
    }

    public static double getDiscountPrice(int[] itemsPrice)
    {

        if(itemsPrice == null || itemsPrice.length == 1)
            return -1;

        double tatolDiscountPrice = 0;
        double sumOfAllItems = 0;

        for(int index = 0; index < itemsPrice.length; index++)
        {
            sumOfAllItems = sumOfAllItems + itemsPrice[index];
        }

        System.out.println("Total Amount : " + sumOfAllItems);
        if(sumOfAllItems <= 1000)
            return sumOfAllItems;

        tatolDiscountPrice = sumOfAllItems * 0.96;

        return tatolDiscountPrice;
    }
}