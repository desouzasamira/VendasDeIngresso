package com.mycompany.vendasdeingresso;
import javax.swing.JOptionPane;
/**
 *
 * @author desou
 */
class Ingresso {
    private String nome;
    private String CPF;
    private String evento;
    private String data;

    public final int festa=67;
    public int getfesta(){
        return festa;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getCPF() {
        return CPF;
    }
 
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
 
    public String getEvento() {
        return evento;
    }
 
    public void setEvento(String evento) {
        this.evento = evento;
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }

    public void imprimirPreço(){
        JOptionPane.showMessageDialog(null, "Ingresso vendido para: " + nome +
                "\nCPF: "+ CPF +
                "\nEvento: " + evento +
                "\nData: " + data +
                "\nvalor do ingresso: "+festa);
    }
}