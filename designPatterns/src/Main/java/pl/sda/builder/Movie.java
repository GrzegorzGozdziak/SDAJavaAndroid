package pl.sda.builder;

public class Movie {
    private String title;
    private int productionYear;
    private String director;
    private String genres;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", \nproductionYear=" + productionYear +
                ", \ndirector='" + director + '\'' +
                ", \ngenres='" + genres + '\'';
    }
}
