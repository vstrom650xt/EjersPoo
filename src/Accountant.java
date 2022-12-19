public class Accountant {
    private  int cont;



    public Accountant(int cont) {
        this.cont = cont;
    }

    public void increase(){
        cont++;

    }

    public void decrease(){
        cont--;


    }

    @Override
    public String toString() {
        return "Accountant{" +
                "cont=" + cont +
                '}';
    }
}
