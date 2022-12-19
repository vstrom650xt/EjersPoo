public class Libro {
    private String title ;
    private String ISBN ;
    private int numPag ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public Libro(String title, String ISBN, int numPag) {
        this.title = title;
        this.ISBN = ISBN;
        this.numPag = numPag;
    }



}
