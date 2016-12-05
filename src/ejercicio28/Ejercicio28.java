
package ejercicio28;

import cstio.*;
import java.awt.Color;
import java.io.*;
public class Ejercicio28 {
    Nadador n1 = new Nadador();
    float promedio;
    
    public void inicio(){
        Dialog d = new Dialog();
        d.display("Para un nadador que ha ganado medallas en 5 competencias");
        //System.out.println("Para un nadaro que ha ganado medallas en 5 competencias");
    }
    
    public boolean isNum(String cad){
        Dialog d = new Dialog();
        try{
            Integer.parseInt(cad);
            return true;
        }catch(NumberFormatException nfe){
            System.out.println("Solo se aceptan valores numericos");
            return false;
        }
    }
    //1. ingreso de datos
    public void datos(Nadador n1){
        Pizarra x = new Pizarra();
        Dialog d = new Dialog();
        String v;
        int numero;
        
        x.setVisible(true);
        v = d.readString("Ingresa el nombre del nadador");
        n1.setNombre(v);
        
        do
            v = d.readString("Ingresa la cantidad de medallas ganadas en Sidney");
        while(!isNum(v));
        numero=Integer.parseInt(v);
        n1.setSidney(numero);
        
        do
            v=d.readString("Ingresa la cantidad de medallas ganadas en Atenas");
        while(!isNum(v));
        numero=Integer.parseInt(v);
        n1.setAtenas(numero);
        
        do
            v = d.readString("Ingresa la cantidad de medallas ganadas en Beijing");
        while(!isNum(v));
        numero=Integer.parseInt(v);
        n1.setBeijing(numero);
        
        do
            v = d.readString("Ingresa la catindad de medallas ganadas en Londres");
        while(!isNum(v));
        numero=Integer.parseInt(v);
        n1.setLondres(numero);
        
        do
            v=d.readString("Ingresa la cantidad de medallas ganadas en Rio");
        while(!isNum(v));
        numero=Integer.parseInt(v);
        n1.setRio(numero);        
    }
    //2. operaciones
    public float operaciones(){
        int suma = n1.getSidney()+n1.getAtenas()+n1.getBeijing()+n1.getLondres()+n1.getRio();
        promedio = suma/5;
        return promedio;
    }
    //3. resultados
    public void resultados(){
        Pizarra p = new Pizarra();
        p.out("Bienvenido al programa del nadador\n");
        p.out("\n");
        p.setVisible(true);
        
        p.out(n1.printStates()+"\n");
        p.out("Y el promedio de medallas ganadas es: "+operaciones());
        p.out("\n");
        p.ofoto("images/nadador.jpg");
    }
    
    public static void main(String[] args) throws IOException{
        Ejercicio28 nadador = new Ejercicio28();
        Dialog d = new Dialog();
        char resp='s';
        
        nadador.inicio();
        while(resp=='s')
        {
            nadador.datos(nadador.n1);
            nadador.operaciones();
            nadador.resultados();
            String res = d.readString("Ver otro nadador? s/n");
            res = res.toLowerCase();
            resp = res.charAt(0);
            System.in.skip(2);                    
        }
    }
    
    
}
