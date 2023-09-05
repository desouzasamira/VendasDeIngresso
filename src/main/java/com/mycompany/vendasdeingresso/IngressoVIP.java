package com.mycompany.vendasdeingresso;
import javax.swing.JOptionPane;
 
/**
 *
 * @author desou
 */
public class IngressoVIP extends Ingresso {
    public double valorVip;
    public IngressoVIP(){
        valorVip = this.festa * 0.3; 
    }
    @Override
    public void imprimirPreço(){
        JOptionPane.showMessageDialog(null, "Ingresso vendido para: "+this.getNome()+ "\nCPF: "+this.getCPF() + "\nEvento: "+this.getEvento() +"\nData: "+this.getData() +"\nvalor do ingressoVip: "+this.getfesta());
    }
}
