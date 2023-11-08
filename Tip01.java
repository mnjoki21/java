public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)

        double tax = 1.05;
        double tip = 1.15;

        double person1 = 10 * tax * tip;
        double person2 = 12 * tax * tip;
        double person3 = 9 * tax * tip ;
        double person4 = 8 * tax * tip ;
        double person5 = 7  * tax * tip;
        double person6 = 15  * tax * tip;
        double person7 = 11  * tax * tip;
        double person8 = 30  * tax * tip;
        

        double total = ( person1 + person2 + person3 + person4 + person5 + person6 + person7 + person8);

        System.out.println("Everyone's total balance is : " + total );
        System.out.println("Person 1 " + person1 );
        System.out.println("Person 2 " + person2 );
        System.out.println("Person 3 " + person3 );
        System.out.println("Person 4 " + person4 );
        System.out.println("Person 5 " + person5 );
        System.out.println("Person 6 " + person6 );
        System.out.println("Person 7 " + person7 );
        System.out.println("Person 8 " + person8 );



        
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        
    }    
}
