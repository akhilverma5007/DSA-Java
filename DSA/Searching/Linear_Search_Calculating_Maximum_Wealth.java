package DSA.Searching;

public class Linear_Search_Calculating_Maximum_Wealth {
    public static void main(String[] args) {
        
    int[][] accounts = {
                        {1,2,3},
                        {3,2,4},
                        {3,4,3},
                        {3,2,13}
                    };
    maxWeath(accounts);
}

    static void maxWeath(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // For every column
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            System.out.println("Total Wealth of customer " + (person + 1) + ": " + rowSum);
            if(rowSum > ans){
                ans = rowSum;
            }
        }
        System.out.println("Max is : " + ans);
    }
}
