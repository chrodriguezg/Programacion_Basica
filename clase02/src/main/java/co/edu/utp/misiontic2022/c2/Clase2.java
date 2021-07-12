package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Clase2 {

    public Clase2(){

    }
    public void exc1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su fecha de nacimiento: (dia/mes/año)");
    String fecha = sc.nextLine();
    int posref1 = fecha.indexOf('/',0);
    int posref2 = fecha.indexOf('/',posref1+1);
    
    String diaS = fecha.substring(0, posref1);
    int dia=Integer.parseInt(diaS);
    String mesS = fecha.substring(posref1+1, posref2);
    int mes=Integer.parseInt(mesS);
    String añoS = fecha.substring(posref2+1);
    int año=Integer.parseInt(añoS);
    String luckyNumberS = Integer.toString(dia+mes+año);
    int luckyNumber = Integer.parseInt(String.valueOf(luckyNumberS.charAt(0)))+Integer.parseInt(String.valueOf(luckyNumberS.charAt(1)))+Integer.parseInt(String.valueOf(luckyNumberS.charAt(2)))+Integer.parseInt(String.valueOf(luckyNumberS.charAt(3)));
    
    System.out.printf("La suma de dia mas mes mas año es: %d\n",dia+mes+año);   
    System.out.printf("El número de la suerte es: %d\n",luckyNumber);   
    sc.close(); 
    }
}
