package lab;

import java.util.Scanner;

public class Task4 {
    /**
     * TASk 2, TASK 3, and TASK 4 IMPLEMENTATION.
     * Some of task2 and task3 parts may have been changed when writing task4
     **/

    static Movie[] copyArray(Movie[] movies, int size) {
        if (movies.length == 0) {
            return new Movie[size];
        } else {
            Movie[] tempArr = new Movie[size];
            System.arraycopy(movies, 0, tempArr, 0, movies.length);
            return tempArr;
        }
    }

    static void insertMovie(Scanner sc, Movie[] movies, int movieArraySize) {
        for (int i = movieArraySize; i < movies.length; i++) {
            System.out.println("""
                    Enter the movie name: """);
            String movieName = sc.next();
            System.out.println("Enter the movie rating: ");
            double movieRating = sc.nextDouble();
            Movie movie = new Movie(movieName, movieRating);
            movies[i] = movie;
        }
    }

    static String findMaxOrMin(Movie[] movies, boolean findMax) {
        if (movies.length == 1) {
            return movies[0].getName();
        } else {
            double movieRating = movies[0].getRating();
            int movieIndex = 0;
            for (int i = 0; i < movies.length; i++) {
                if ((findMax && movies[i].getRating() > movieRating) ||
                        (!findMax && movies[i].getRating() < movieRating)) {
                    movieRating = movies[i].getRating();
                    movieIndex = i;
                }
            }
            return movies[movieIndex].getName();
        }
    }

    static double findAverage(Movie[] movies) {
        if (movies.length == 1) {
            return movies[0].getRating();
        } else {
            double ratingSum = 0;
            for (Movie movie : movies) {
                ratingSum += movie.getRating();
            }
            return ratingSum / movies.length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 1;
        int movieArraySize = 0;
        Movie[] movies = new Movie[movieArraySize];
        do {
            System.out.println("""
                    
                    Which operation you would like to perform?
                    1. Insert 3 movies
                    2. Display movies and rating
                    3. Insert more new movies
                    4. Retrieve Statistic about the movies
                    """);
            userInput = sc.nextInt();
            switch (userInput) {
                case 1: {
                    movies = copyArray(movies, movieArraySize + 3);
                    System.out.println("""
                            You selected to insert 3 new movies
                            
                            """);
                    insertMovie(sc, movies, movieArraySize);
                    movieArraySize += 3;
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
                case 3: {
                    System.out.println("""
                            
                            You selected to insert new movies!""");
                    System.out.println("""
                            How many new movies you would like to insert?
                            """);
                    int numberOfNewNumbers = sc.nextInt();
                    movies = copyArray(movies, movieArraySize + numberOfNewNumbers);
                    insertMovie(sc, movies, movieArraySize);
                    movieArraySize += numberOfNewNumbers;
                    break;
                }
                case 4: {
                    System.out.println("""
                            
                            You selected to view the statistics!""");


                    // Finding MAX using Stream
                    /**
                     Movie movieWithMaxDouble = Arrays.stream(movies)
                     .max(Comparator.comparingDouble(Movie::getRating))
                     .orElse(null);
                     System.out.println(movieWithMaxDouble.toString());
                     **/

                    if (movies.length == 0) {
                        System.out.println("""
                                
                                Unfortunately there are no movies to retrieve statistics!""");
                    } else {
                        System.out.printf("""
                                        
                                        Movie name with the max rating: %s
                                        Movie name with the min rating: %s
                                        Movie rating average: %.2f%n""",
                                findMaxOrMin(movies, true),
                                findMaxOrMin(movies, false),
                                findAverage(movies)
                        );
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
