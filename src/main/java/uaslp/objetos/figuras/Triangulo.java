package uaslp.objetos.figuras;

import uaslp.objetos.exception.AlturaNoProvistaException;
import uaslp.objetos.exception.BaseNoProvistaException;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(){
        super("Triangulo","Cualquier triangulo");
        base = 0;
        altura = 0;
    }

    public Triangulo(String name, String description){
        super(name,description);
    }

    public Triangulo(double base, double altura){
        this();
        this.base = base;
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea()throws BaseNoProvistaException, AlturaNoProvistaException {
        if(base == 0) throw new BaseNoProvistaException();
        if(altura == 0) throw new AlturaNoProvistaException();
        return (base * altura) / 2;
    }

    @Override
    public void draw() {
        System.out.println("triangulo");
    }
}
