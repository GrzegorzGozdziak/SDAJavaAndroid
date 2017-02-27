package pl.sda.designPatterns.builder;

public class MovieBulider {

    private Movie movie;

    public MovieBulider() {
        movie = new Movie();
    }


    public MovieBulider withTitle(String title) {
        movie.setTitle(title);
        return this;
    }

    public MovieBulider withProductionYear(int productionYear) {
        movie.setProductionYear(productionYear);
        return this;
    }

    public MovieBulider withDirector(String director) {
        movie.setDirector(director);
        return this;
    }


    public MovieBulider withGenres(String genres) {
        movie.setGenres(genres);
        return this;
    }

    public Movie build() {
        return movie;
    }
}
