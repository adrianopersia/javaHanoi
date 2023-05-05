package Controlador;

import Modelo.Modelo;
import Vista.Menu;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener{
    private Modelo m;
    private Menu v;
    private String[] torre;
    
    public Controlador(Modelo m,Menu v){
        this.m=m;
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
    }
    

    @Override
    public void actionPerformed(ActionEvent e){
        v.setVisible(false);
        v.setVisible(true);

        if(e.getSource().equals(v.getMOVERT2())){
            v.getjTable2().add(v.getjTable1().getValueAt(1, 1));
        }
        
    }
}
