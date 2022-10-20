package Polymorphism;

/**
 * Movie
 */
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

/**
 * Jaws
 */
class Jaws extends Movie {
    public Jaws() {
        // thực hiện kế thừa "name" của "Movie"
        super("Jaws");
    }

    // tạo mới một phương thức plot\
    public String plot() {
        return "A shark eats lots of people";

    }
}

/**
 * InnerApp
 */
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
        // TODO Auto-generated constructor stub
    }

    @Override
    public String plot() {
        // TODO Auto-generated method stub
        return "Aliens attempt to take over planet earth";
    }

}

/**
 * InnerApp
 */
class MazeRun extends Movie {

    public MazeRun() {
        super("Maze Run");
        // TODO Auto-generated constructor stub
    }

    @Override
    public String plot() {
        // TODO Auto-generated method stub
        return "Kids try and escape a maze";
    }

}

/**
 * InnerApp
 */
class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
        // TODO Auto-generated constructor stub
    }

    @Override
    public String plot() {
        // TODO Auto-generated method stub
        return "Imperial Forces try to take over the universe";
    }

}

/**
 * InnerApp
 */
class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
        // TODO Auto-generated constructor stub
    }

}

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {

            Movie movie = randoMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot());

        }
    }

    public static Movie randoMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRun();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }
}
