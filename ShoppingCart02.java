public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc  ;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 100.00;
        double tax = price * 0.5;
        int quantity = 2;
        
        // Declare and assign a calculated totalPrice
         double totalP = price * tax ;
         double totalprice = totalP * quantity;
        
        // Modify message to include quantity 

        message = custName+ " wants to purchse " + quantity +  " " + itemDesc + " \n  The total price is : " + totalprice;
        
        System.out.println(message);
        
        // Print another message with the total cost
        
    }    
}
