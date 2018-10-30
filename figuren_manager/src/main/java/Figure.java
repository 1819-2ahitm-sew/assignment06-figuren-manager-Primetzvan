
abstract class Figure {

    private int a = 0;
    private int b = 0;
    private int c = 0;

    public Figure (int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

   abstract public double area();

   abstract public double circumference();

   abstract public String output();


    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }


    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}


    class Ellipse extends Figure {

        public Ellipse (int zahl1, int zahl2){
            super(zahl1,zahl2,0);
        }


        @Override
        public double area() {
            return Math.round((Math.PI * getA() * getB()) * 1000 ) / 1000.0;
        }

        @Override
        public double circumference() {
            int lamba = (getA() - getB())/(getA()+getB());
            return Math.round(((getA()+getB()) * Math.PI * (1 +( 3 * lamba * lamba ) / ( 10 + Math.pow(4 - 3 * lamba * lamba,2) )) )* 1000 ) / 1000.0 ;
        }

        @Override
        public String output() {
            return  "Ellipse mit Hauptachse " + this.getA() + " und Nebenachse " + this.getB() + ": Fläche -> " + area() + ", Umfang -> " + circumference();
        }


    }

class Circle extends Figure {

    public Circle (int zahl1){
        super(zahl1,0,0);
    }

    @Override
    public double area() {
        return Math.round((Math.PI * getA() * getA()) * 1000 ) / 1000.0;
    }

    @Override
    public double circumference() {
        return Math.round((2 * Math.PI * getA()) * 1000 ) / 1000.0;
    }

    @Override
    public String output() {
        return "Kreis mit Radius " + this.getA() + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

 class Triangle extends Figure {

    public Triangle (int zahl1,int zahl2,int zahl3){
        super(zahl1, zahl2, zahl3);
    }

    @Override
    public double area() {
        return Math.round(((getA() * getB() * Math.sin(getC()) / 2)) * 1000 ) / 1000.0 ;
    }

    @Override
    public double circumference() {
        return Math.round((Math.sqrt(getA() * getA() + getB() * getB() - (2* getA() * getB()) * Math.cos(getC())) ) * 1000 ) / 1000.0;
    }

    @Override
    public String output() {
        return "Dreieck mit Seite 1: " + this.getA() + " Seite 2: " + this.getB() + " und eingeschlossenem Winkel " + this.getC() + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

class Square extends Figure{

        public Square (int zahl1){
            super(zahl1, 0, 0);
        }

    @Override
    public double area() {
        return Math.round((getA() * getA()) * 1000 ) / 1000.0;
    }

    @Override
    public double circumference() {
        return Math.round((getA() *4) * 1000 ) / 1000.0;
    }

    @Override
    public String output() {
       return "Quadrat mit Seitenlänge " + this.getA() + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

class Rectangle extends Figure{

        public Rectangle (int zahl1,int zahl2){
            super(zahl1, zahl2, 0);
        }

    @Override
    public double area() {
        return Math.round((getA() * getB()) * 1000 ) / 1000.0;
    }

    @Override
    public double circumference() {
        return Math.round(((getA() + getB())* 2) * 1000 ) / 1000.0;
    }

    @Override
    public String output() {
        return  "Rechteck mit Seite 1: " + this.getA() + " und Seite 2: " + this.getB() + ": Fläche -> " + area() + ", Umfang -> " + circumference();
    }

}

