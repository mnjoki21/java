public class Chickens01 {
    public static void main(String[] args) {

       System.out.println("Eggs collected in scenarion 1 : " + calculateEggs(5,3) );
       System.out.println("Eggs collected in scenarion 2 : " + calculateEggs(4,8) );

    }   

    public static int calculateEggs(int eggsPerChicken, int chickenCount) {
        int totalEggs = 0 ;

        //Monday 

        totalEggs += chickenCount * eggsPerChicken;

        //tuesday

        chickenCount += 1;
        totalEggs += chickenCount * eggsPerChicken;

        //wednesday 
        chickenCount /= 2;
        totalEggs += chickenCount * eggsPerChicken;

        return totalEggs;


    }
}
