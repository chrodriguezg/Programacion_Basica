package Reto1;
public class App {  
    public static void main(String[] args) throws Exception {
    NuevoProyecto np = new NuevoProyecto(6,10000000,1.2);
    System.out.println(np.calcularInteresSimple());
    System.out.println(np.calcularInteresCompuesto());
    System.out.println(np.compararInversion(6,10000000,1.2));
    }
}
