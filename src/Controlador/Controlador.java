package Controlador;

import Modelo.Partida;
import Vista.Menu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.util.Stack;



public class Controlador implements ActionListener{
    private Partida p;
    private Menu v;
    public int CantidadAlojada;
    

    
    public Controlador(Partida p,Menu v){
        this.p=p;
        this.v=v;
        v.setVisible(true);
        v.getMOVERT2().addActionListener(this);
        v.getMOVERT3().addActionListener(this);
        v.getMOVERT4().addActionListener(this);
        v.getMOVERT5().addActionListener(this);
        v.getMOVERT6().addActionListener(this);
        v.getMOVERT7().addActionListener(this);
        v.getMOVERT8().addActionListener(this);
        v.getBG().addActionListener(this);
        v.getBIJ().addActionListener(this);
        v.getBMP().addActionListener(this);
        v.getBS().addActionListener(this);
        v.getIniciarButt().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e){    
        if(e.getSource().equals(v.getIniciarButt())){
            v.getTorre1().getComponent(0).setName("ooooo");
            v.getTorre1().getComponent(1).setName("oooo");
            v.getTorre1().getComponent(2).setName("ooo");
            v.getTorre1().getComponent(3).setName("oo");
            v.getTorre1().getComponent(4).setName("o");
            p.Generador();
        }
        
        
        if(e.getSource().equals(v.getMOVERT2())){
        int pasa=0;
          if(p.IsEmpty(v.getTorre2().getComponentCount())==true){     
            cambiarDiscoIsEmpty(v.getTorre1().getComponent(0),v.getTorre2());
            p.Torre2.push(p.Torre1.pop());
            pasa++;
          }
          else if(pasa==0){
              if(p.ConfirmarMov(p.Torre1.peek(),p.Torre2.peek())==true){
                   cambiarDiscoMovimiento(v.getTorre1().getComponent(0), v.getTorre2());
              }
          } 
        }
        
        if(e.getSource().equals(v.getMOVERT3())){
            if(p.IsEmpty(v.getTorre3().getComponentCount())==true){
              cambiarDiscoIsEmpty(v.getTorre1().getComponent(0),v.getTorre3());
          }
        }
        
        
        
        refresh();
    }
    
    public void cambiarDiscoIsEmpty(Component Disco, JPanel Torre){
        Torre.add(Disco);
    }
    
    public void cambiarDiscoMovimiento(Component Disco, JPanel Torre){
        
        Torre.add(Disco);
    }

    
    public void refresh(){
        v.setVisible(false);
        v.setVisible(true);
    }
    
    
}
    

