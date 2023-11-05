public class Chickens02 {
    public static void main (String[] args) {
      System.out.println("the daily average eggs collected : " + calculateEggs(0, 0, 0));
      System.out.println("the monthly average eggs collected : " + calculateEggs(0, 0, 0));
            System.out.println("the monthly profit of eggs collected : " + calculateEggs(0, 0, 0));

    }

    public static int calculateEggs (int dailyAverage , int monthlyAverage , int monthlyProfit) {
       int totalEggs = 0;
       int totalAverageEggs = 100+121+117;
       //Daily average
       totalEggs  = dailyAverage * totalAverageEggs / 3;
       //Monthly average
       totalEggs= monthlyAverage * dailyAverage * 30 ;

       //monthly profit 
       totalEggs = monthlyProfit * monthlyAverage * 5;

       return totalEggs;

    }
}
