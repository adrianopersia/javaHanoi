package Controlador;

import Modelo.Modelo;
import Vista.Menu;

public class Hanoi {

    public static void main(String[] args) {
        String n1 = "**";
        String n2 = "***";
        System.out.println(n1.length());
        System.out.println(n2.length());
        
        
        
        
        
        
        Menu v = new Menu();
        Modelo m = new Modelo();
        Controlador c = new Controlador(m,v);
    }
}
