package TwoD_Array;

public class Day2 {
    
    public static void main(String[] args) {

        int[][] data = {
            {11, 12, 13, 14, 15,16},
            {21, 22, 23, 24, 25,26,27,28},
            {31, 32, 33, 34, 35},
            {41, 42, 43, 44},
            {51, 52, 53, 54, 55,56}
        };

        // print2DArray(data);

        // printParticularRow(data, 5);

        // printParticularColumn(data, 3);

        // printDiagonalArray(data);

        // printnonDiagonalArray(data);

        // printOppsiteDiagonal(data);

        // printX(data);

        printlastElementOfRow(data);

    
        
    }

    // write a function to print 2D array
    public static void print2DArray(int[][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                System.out.print(array[row][column] +" ");
            }
            System.out.println();
        }
    }

    public static void printParticularRow(int[][] data, int rowNumber)
    {
        // T1 -> null
        if( data == null)
            return;

        // T2 -> rowNumber check rage 0 to data.length ( 0 <= rowNum < data.length)
        //       rowNumber starts with 1 - max row is equal to data.length
        if(rowNumber <= 0 || rowNumber > data.length)
        {
            System.out.println("Invalid Row Number");
            return;
        }

        // T3 -> 
        for(int col = 0; col < data[rowNumber -1].length; col++)
        {
            System.out.print(data[rowNumber-1][col] + " ");
        }
    }

    public static void printParticularColumn(int[][] data, int columnNumber)
    {

        int columnIndex = columnNumber -1;

        if(data == null)
            return;

        if(columnIndex <= 0 || columnIndex > data.length)
            return;

        for(int row = 0; row < data.length; row++)
        {
            if(data[row].length < columnIndex)
                continue;

            System.out.println(data[row][columnIndex] + " ");
        }
        
    }


    public static void printDiagonalArray(int[][] data)
    {

        if(data == null)
            return;


        System.out.println("---- PRINTING DIAGONAL ELEMENTS -----");
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if(row == col)
                {
                    System.out.print(data[row][col] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void printnonDiagonalArray(int[][] data)
    {
        if(data == null)
            return;

        System.out.println("---- PRINTING NON-DIAGONAL ELEMENTS -----");
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if(row == col)
                    System.out.print("  ");

                if(row != col)
                {
                    System.out.print(data[row][col] + "  ");
                }
            }
            System.out.println();
        }
    }


    public static void printOppsiteDiagonal(int[][] data)
    {

        if(data == null)
            return;

        System.out.println("---- PRINTING OPPSITE-DIAGONAL ELEMENTS -----");
        for(int row = 0 ; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if(row+col == data.length-1)
                {
                    System.out.print(data[row][col] + "  ");
                }
                if(row+col != data.length-1)
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void printX(int[][] data)
    {
        if(data == null)
            return;

        System.out.println("---- PRINTING X ELEMENTS -----");
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data.length; col++)
            {
                if(row == col)
                {
                    System.out.print(data[row][col] + " ");
                }

                if(row+col == data.length-1)
                {
                    System.out.print(data[row][col] + " ");
                }

                if(row != col || row+col != data.length-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
           
        }
        
    }


    public static void printlastElementOfRow(int[][] data)
    {

        if(data == null)
            return;

        System.out.println("---- PRINTING LAST ELEMENTS OF EACH ROW -----");
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                int lastIndex = data[row].length-1;
                if(col == lastIndex)
                {
                    System.out.println(data[row][lastIndex]);
                }
            }
        }
    }

}
