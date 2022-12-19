public class Punto {

    private int ejeX;
    private int ejeY;
    public Punto() {
        ejeX = 0;
        ejeY = 0;

    }
    public Punto(int X, int ejeY) {
        this.ejeX = X;
        this.ejeY = ejeY;
    }

    public int getEjeX() {
        return ejeX;
    }
//e
    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    public int getEjeY() {
        return ejeY;
    }

    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
    }

    public void arribaPunto(int distance){
       this.ejeY+= distance;
    }
    public void bajoPunto(int distance){
        this.ejeY-= distance;
    }
    public void derechaPunto(int distance){
        this.ejeX+= distance;
    }
    public void izquierdaPunto(int distance){
      this.ejeX-=distance;
    }



    public double getDistance(Punto punto){
        double result =0;
        int difX = punto.getEjeX() - this.ejeX;
        int difY = punto.getEjeY() - this.ejeY;

        return Math.sqrt(Math.pow(difX,2)+Math.pow(difY,2));


    }

     public Punto nuevoArriba(int distancie){

        return  new Punto(this.ejeX,this.ejeY+distancie);



     }

     public Punto nuevoAbajo(int distancie){

        return  new Punto(this.ejeX,this.ejeY-distancie);



    }
    public Punto nuevoDerecha(int distancie){

        return  new Punto(this.ejeX+distancie,this.ejeY);



    }     public Punto nuevoIzquierda(int distancie){

        return  new Punto(this.ejeX-distancie,this.ejeY);



    }







    @Override
    public String toString() {
        return "Punto{" +
                "coordenada=" + ejeX +","+ ejeY +
                '}';
    }



}
