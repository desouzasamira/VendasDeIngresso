package com.mycompany.vendasdeingresso;
 
import javax.swing.JOptionPane;
 

/**
 *
 * @author desou
 */
public class IngressoCamarote extends Ingresso{
    public double valorCamarote; 
 
    public IngressoCamarote (){
        this.valorCamarote = this.festa * 0.6;
    }
    public void imprimirPreço(){
            JOptionPane.showMessageDialog(null, "Ingresso vendido para: "+this.getNome()+ "\nCPF: "+this.getCPF() + "\nEvento: "+this.getEvento() +"\nData: "+this.getData() +"\nvalor do ingressoCamarote: "+this.getfesta());
        }
}