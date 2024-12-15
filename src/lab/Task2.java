package lab;

import java.util.Scanner;

public class Task2 {
    //ONLY TASK2 IMPLEMENTATION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 1;
        Movie[] movies = new Movie[0];
        do {
            System.out.println("""
                    
                    Which operation you would like to perform?
                    1. Input movie
                    2. Display movies and rating
                    """);
            userInput = sc.nextInt();
            switch (userInput) {
                case 1: {
                    movies = new Movie[3];
                    System.out.println("""
                            You selected to insert a new movies
                            
                            """);
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Enter the movie name: ");
                        String movieName = sc.next();
                        System.out.println("Enter the movie rating: ");
                        double movieRating = sc.nextDouble();
                        Movie movie = new Movie(movieName, movieRating);
                        movies[i] = movie;
                    }
                    break;
                }
                case 2: {
                    System.out.println("""
                            
                            You selected to display the movies!""");
                    if (movies.length == 0) {
                        System.out.println("Unfortunately, there is no movie to display :(");
                    } else {
                        for (Movie movie : movies) {
                            System.out.println(movie.toString());
                        }
                    }
                    break;
                }
                case 0: {
                    System.out.println("""
                            
                            You selected to end the program!""");
                    break;
                }
                default: {
                    System.out.println("""
                            
                            Please select the right option!""");
                }
            }
        } while (userInput != 0);
    }
}
