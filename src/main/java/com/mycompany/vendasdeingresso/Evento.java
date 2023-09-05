/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendasdeingresso;
 
import java.util.List;
import javax.swing.JOptionPane;
 
/**
 *
 * @author desou
 */
public class  Evento {
    private String nome;
    private String data;
    private String local;
    private List<Ingresso> ings;
    private final int QuantMax=87;
    private final int valorUnic=67; 
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public String getLocal() {
        return local;
    }
 
    public void setLocal(String local) {
        this.local = local;
    }
    public int getQuantMax (){
        return QuantMax;
    }

    public List<Ingresso> getIngs() {
        return ings;
    }
 
    public void setIngs(List<Ingresso> ings) {
        this.ings = ings;
    }
    public void venderIngresso (Ingresso ingresso){
            ings.add(ingresso);}

      public void IngressosComercializado(){
               String notif ="Evento:  "+this.nome + "\n";
                notif+= "data:  " + this.data + "\n";
                notif+= "local:  " + this.local + "\n";
                notif+="valor Unico ingressos:  " + this.valorUnic + "\n";
                notif+= "quantidade maxima de ingresso:  " + this.QuantMax;
          for (int i=0; i < ings.size (); i++){
              String nomes;
              nomes = ings.get (i).getNome();
              notif+= "Comercializado: "+ (i+1)+": "+ nomes+"\n";

          }
      } 
    public int QuantMax() {
        JOptionPane.showMessageDialog(null,QuantMax);
        return QuantMax;
    }
}
