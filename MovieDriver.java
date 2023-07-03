import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        
        String userResponse;
        do {
            
            Movie movie = new Movie();

            System.out.println("Enter the title of a movie:");
            String title = keyboard.nextLine();
         
            movie.setTitle(title);

          
            System.out.println("Enter the movie's rating:");
            String rating = keyboard.nextLine();
         
            movie.setRating(rating);

       
            System.out.println("Enter the number of tickets sold at the theater:");
            int soldTickets = keyboard.nextInt();
          
            movie.setSoldTickets(soldTickets);

       
            keyboard.nextLine();
            
            System.out.println(movie.toString());

            System.out.println("Do you want to enter another movie? (yes/no)");
            userResponse = keyboard.nextLine();

        } while ("yes".equalsIgnoreCase(userResponse));
        
        System.out.println("Goodbye!");
        
        keyboard.close();
    }
}