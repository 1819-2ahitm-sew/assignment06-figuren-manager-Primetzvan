
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
            return Math.PI * getA() * getB();
        }

        @Override
        public double circumference() {
            return 0;
        }

        @Override
        public String output() {
            return  " Fläche -> " + area() + ", Umfang -> " + circumference();
        }


    }

class Circle extends Figure {

    public Circle (int zahl1){
        super(zahl1,0,0);
    }

    @Override
    public double area() {
        return Math.PI * getA() * getA();
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * getA();
    }

    @Override
    public String output() {
        return " Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

 class Triangle extends Figure {

    public Triangle (int zahl1,int zahl2,int zahl3){
        super(zahl1, zahl2, zahl3);
    }

    @Override
    public double area() {
        return (getA() * getB() * Math.sin(getC()) / 2) ;
    }

    @Override
    public double circumference() {
        return Math.sqrt(getA() * getA() + getB() * getB() - (2* getA() * getB()) * Math.cos(getC()));
    }

    @Override
    public String output() {
        return " Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

class Square extends Figure{

        public Square (int zahl1){
            super(zahl1, 0, 0);
        }

    @Override
    public double area() {
        return getA() * getA();
    }

    @Override
    public double circumference() {
        return getA() *4;
    }

    @Override
    public String output() {
       return " Fläche -> " + area() + ", Umfang -> " + circumference();
    }


}

class Rectangle extends Figure{

        public Rectangle (int zahl1,int zahl2){
            super(zahl1, zahl2, 0);
        }

    @Override
    public double area() {
        return getA() * getB();
    }

    @Override
    public double circumference() {
        return (getA() + getB())* 2;
    }

    @Override
    public String output() {
        return  " Fläche -> " + area() + ", Umfang -> " + circumference();
    }

}

