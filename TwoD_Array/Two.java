package TwoD_Array;


public class Two {
    
    public static void main(String[] args) {
        
        int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };
        int[][] diagonal = {
                            {1,0,0},
                            {0,1,0},
                            {0,0,1}
                        };

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("---------------------------------------");


        int[][] result = addMatrix(arr, diagonal);

        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------");


        for(int[] row : result) // passed reference to row
        {
            for(int col : row) // col will have elements
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }

    static int[][] addMatrix(int[][] A , int[][] B)
    {
        int[][] C = new int[3][3];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B[i].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
}
