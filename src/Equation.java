public class Equation {
    private int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a!=0)
            this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Equation(){
        a=1;b=1;c=1;
    }

    public Equation(int a,int b,int c){
        if (a!=0)
            this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String toString() {
        String number ="";
        if (a > 1 || a < -1)
            number += a+"x^2";
        else if (a == 1)
            number += "x^2";
        else if (a == -1)
            number += "-x^2";

        if (b > 1)
            number += "+"+b+"x";
        else if (b < -1)
            number += b+"x";
        else if (b == 1)
            number += "+x";
        else if (b == -1)
            number += "-x";

        if (c >= 1)
            number += "+"+c+"=0";
        else if (c <= -1)
            number += c+"=0";
        else number += "=0";

        return number;
    }

    public String VerifierEquation(int x){
        if((a*Math.pow(x,2)) + (b*x) + c == 0){
            return x+" verifie l'equation !";
        }else
            return x+" ne verifie pas l'equation !";
    }

    public String calculerSolutions(){
        double delta = Math.pow(b,2) - (4*a*c);

        if (delta < 0 )
            return null;
        else if (delta == 0) {
            return "x = " + -b/(2*a);
        }else {
            return "x1 ="+ ((-b)-Math.sqrt(delta))/(2*a) + ", x2 = "+((-b)+Math.sqrt(delta))/(2*a);
        }
    }

    public Equation (double x1 , double x2){
        this.a = 1;
        this.b = (int) -(x1+x2);
        this.c = (int) (x1*x2);
    }
}
