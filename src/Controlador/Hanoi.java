package Controlador;

import Modelo.Partida;
import Vista.Menu;

public class Hanoi {

    public static void main(String[] args) {
        Menu v = new Menu();
        Partida p = new Partida();
        Controlador c = new Controlador(p,v);
    }
}
