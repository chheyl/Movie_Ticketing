import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 6, "Action, Drama", "Avatar", "Disney", "2", 450);
        moviesList.add(m1);
        Movie m2 = new Movie(2,8, "Horro", "The wailing", "Na Hong-jin", "4", 650);
        moviesList.add(m2);
        Movie m3 = new Movie(3,7, "Romance", "Hello, Goodbye, and Everything in Between", "Michael Lewen", "1", 500);
        moviesList.add(m3);

        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Ashna", 19,"Ashna22stha@gmail.com");
        users.add(u1);
        User u2 = new User("Chheyl", 18, "chheyl22euria@gmail.com");
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Center", 7);
        seats.add(s1);
        Seat s2 = new Seat("FrontSeat", 4);
        seats.add(s2);

        Ticket t1 = new Ticket(seats,users,moviesList);


        m1.getInfo();

        t1.getTickets();

        m3.getMovies("3pm");
    }
}