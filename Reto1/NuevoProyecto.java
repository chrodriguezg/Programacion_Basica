package Reto1;
public class NuevoProyecto{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    private int pPeriodo;
    private double pMonto; 
    private double pInteres;
    // -----------------------------------------------------------------
    // Metodos
    // -----------------------------------------------------------------
    public NuevoProyecto(){
        this.pPeriodo=0; 
        this.pMonto=0; 
        this.pInteres=0;
    }
    public NuevoProyecto(int pPeriodo, double pMonto, double pInteres){
        this.pPeriodo=pPeriodo; 
        this.pMonto=pMonto; 
        this.pInteres=pInteres;
    }
    public double calcularInteresSimple(){
        double interes_simple=0;
        interes_simple=this.pMonto*(this.pInteres/100)*this.pPeriodo;
        return Math.round(interes_simple);
    }
    public double calcularInteresCompuesto(){
        double interes_compuesto=0;
        interes_compuesto=this.pMonto*(Math.pow((1+(this.pInteres/100)),this.pPeriodo)-1);
        return Math.round(interes_compuesto);
    }
    public double compararInversion(int pPeriodo, double pMonto, double pInteres){
        this.pPeriodo=pPeriodo; 
        this.pMonto=pMonto; 
        this.pInteres=pInteres;
        double interes_compuesto=this.calcularInteresCompuesto();
        double interes_simple=this.calcularInteresSimple();
        double compararInversion = interes_compuesto-interes_simple;
        return Math.round(compararInversion);
    }
    public double compararInversion( ){
        double compararInversion = this.calcularInteresCompuesto()-this.calcularInteresSimple();
        return compararInversion;
    }
}