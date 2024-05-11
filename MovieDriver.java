import java.util.Scanner;

public class MovieDriver {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		boolean keepGoing = true;
		
		do {
			System.out.print("Enter the name of a movie: ");
			String movieName = input.nextLine();
			movie.setTitle(movieName);
			
			System.out.print("Enter the rating of the movie: ");
			String movieRating = input.nextLine();
			movie.setRating(movieRating);
			
			System.out.print("Enter the number of tickets sold for this movie: ");
			int movieTicketsSold = Integer.parseInt(input.nextLine());
			movie.setSoldTickets(movieTicketsSold);
			
			System.out.println(movie.toString());
			
			System.out.print("Do you want to enter another?: ");
			char answer = input.nextLine().charAt(0);
			
			switch(answer) {
			case 'y':
			case 'Y':
				keepGoing = true;
				break;
			case 'n':
			case 'N':
				keepGoing = false;
				break;
			default:
				keepGoing = false;	
			}
		} while(keepGoing == true);
		
		input.close();
		System.out.println("Goodbye!");
	}
}
