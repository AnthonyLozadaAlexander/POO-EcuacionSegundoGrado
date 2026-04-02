package Clases;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double[] obtenerRaices() {
        double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);

        return new double []{x1, x2};
    }

    private double obtenerRaiz(){

        double x = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        return x;

    }

    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }

    private boolean tieneRaices(){
        if(getDiscriminante()>= 0){return true;}else{return false;}
    }

    private boolean tieneRaiz(){
        if(getDiscriminante() == 0){return true;}else{return false;}

    }

    private void calcular(){

    }

}
