package Modelo;

import java.awt.Component;

import java.util.Stack;


public class Partida {

    public Stack <Discos> Torre1=new Stack();
    public Stack <Discos> Torre2=new Stack();
    public Stack <Discos> Torre3=new Stack();
    
    
    public Stack Generador(){
        
        for(int i=1;i<6;i++){
            Discos D=new Discos(i);
            Torre1.add(D);
        }
        return Torre1;
    }
    
    public boolean IsEmpty(int PrimerDisco){
        return PrimerDisco==0;
    }
    
    public boolean ConfirmarMov(Discos DiscoAMover, Discos DiscoYaMovido){
        System.out.println(DiscoYaMovido.getDiscoN()+DiscoAMover.getDiscoN()+"  +  ");
        if(DiscoAMover.getDiscoN()<DiscoYaMovido.getDiscoN()){
         return true;
        }
        else{return false;}
    }
    
    //TODO: LOGICA PARA DETERMINAR SI GANÓ

}
