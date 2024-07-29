// public class stock {
// //profit =selling - buy price

//     public static int  stock(int prices[]){

//         int buyprice=Integer.MAX_VALUE;//+
//         int maxprofit=0;

//         //loop
//         for(int i=0;i<prices.length;i++){

//             //profit
//             if(buyprice <prices[i]){
//                 //calculate profit
//                 int profit=prices[i]-buyprice;//todays profit

//                 maxprofit=Math.max(maxprofit, profit);//todays aani max profit
//             }
//             else{
//                 buyprice=prices[i];//kharde kara

//             }
//         }
//         return maxprofit;
//     }
//     public static void main(String bhushan[]){

//         int prices[]={7,1,5,3,6,4};
//     System.out.print(  stock(prices));

//     }
// }







public class stock{
    // Method to calculate the maximum profit from given stock prices
    public static int stock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE; // Initialize buyPrice to the maximum possible value
        int maxProfit = 0; // Initialize maxProfit to 0

        // Loop through each price in the array
        for (int i = 0; i < prices.length; i++) {
            // If the current price is lower than the buyPrice, update the buyPrice
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                // If the current price is higher than the buyPrice, calculate the profit
                int profit = prices[i] - buyPrice; // Today's profit

                // Update maxProfit if today's profit is higher than the previous maxProfit
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit; // Return the maximum profit found
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // Example array of stock prices
        System.out.print(stock(prices)); // Call the stock method and print the result
    }
}
