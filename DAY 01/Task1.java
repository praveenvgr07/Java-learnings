/*Find the savings amount based on the my part of the price and my friend part and the 
movie ticket and the snacks */
public class Task1 {
    public static void main(String[] args) {
        int my_part = 1500;
        int movie_ticket_spent = 300;
        int snacks_price = 200;
        int friend_part = 100;
        int total_amount = my_part + friend_part; 
        int total_expenditure = movie_ticket_spent + snacks_price;
        int remaining_amount = total_amount- total_expenditure;
        System.out.println("remaining amount : "+ remaining_amount);
    }
}
