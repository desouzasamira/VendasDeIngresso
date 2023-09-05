/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vendasdeingresso;


public class VendasDeIngresso {
 
   
    public static void main(String[] args) {
          Ingresso Pista= new Ingresso ();
          Pista.setNome("Yan Nunes");
          Pista.setCPF("84.879.563-74");
          Pista.setData("18/09/2022");
          Pista.setEvento("Caetano Veloso");
          Pista.imprimirPreço();


          Ingresso vip= new IngressoVIP ();
          vip.setNome("Yan Nunes");
          vip.setCPF("03.987.557-05");
          vip.setEvento("Caetano Veloso");
          vip.setData("18/09/2022");
          vip.imprimirPreço ();

          
          Ingresso camarote= new IngressoCamarote ();
          camarote.setNome("Yan Nunes");
          camarote.setCPF("84.879.563-74");
          camarote.setData("18/09/2022");
          camarote.setEvento("Caetano Veloso");
          camarote.imprimirPreço();

          
          Evento event= new Evento ();
          event.setNome("Caetano Veloso");
          event.setData("18/09/2022");
          event.setLocal("RJ");
          event.venderIngresso (Pista);
          event.venderIngresso (vip);
          event.venderIngresso (camarote);


          event.IngressosComercializado();        



        }  
    }
