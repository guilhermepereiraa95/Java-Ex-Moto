/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author lb20-05
 */
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resp;
        do{
        String cor = "";
        int m=1;
        Scanner leitor = new Scanner(System.in);
        Moto motocadoguila = new Moto("", "", "", m, 0, 6, false);
        System.out.println("Digite 1 para ligar a moto ou 0 para desliga-la:");
        resp = Integer.parseInt(leitor.nextLine());
        if (resp == 1) {
            boolean estado = true;
            motocadoguila.ligar(estado);
            System.out.println("Digite a marcha que deseja:");
            m = Integer.parseInt(leitor.nextLine());
                System.out.println("0-Descer marcha atual\n1-Subir marcha atual\n2-Setar para outra marcha de sua escolha\nQualquer outra tecla a moto desliga");
                int i = Integer.parseInt(leitor.nextLine());
                switch (i) {
                    case 0:                 
                        motocadoguila = new Moto("Suzuki", "SuzukiMaluca", "Vermelha", m, 0, 6, estado);
                        if(motocadoguila.marchaAbaixo()==true){
                        System.out.println("Escreva uma cor pra sua moto:");
                        cor=leitor.nextLine();
                        motocadoguila.setCor(cor);
                        motocadoguila.imprimir();}
                        else if (motocadoguila.marchaAbaixo()==false)
                        {System.out.println("Marcha invalida, as marchas vao de 0 a 6.");}
                        break;
                        
                    case 1:
                        motocadoguila = new Moto("Suzuki", "SuzukiMaluca", "Vermelha", m, 0, 6, estado);
                        if(motocadoguila.marchaAcima()==true){
                        System.out.println("Escreva uma cor pra sua moto:");
                        cor=leitor.nextLine();
                        motocadoguila.setCor(cor);
                        motocadoguila.imprimir();}
                        else if (motocadoguila.marchaAbaixo()==false)
                        {System.out.println("Marcha invalida, as marchas vao de 0 a 6.");}
                        break;
                    case 2:
                        int novamarcha = -1;
                        motocadoguila = new Moto("Suzuki", "SuzukiMaluca", "Vermelha", m, 0, 6, estado);
                        if (motocadoguila.setMarcha(m) == true) {
                            System.out.println("\nDigite a marcha que  trocar:");
                            novamarcha = Integer.parseInt(leitor.nextLine());
                            System.out.println("Escreva uma cor pra sua moto:");
                            cor = leitor.nextLine();
                            motocadoguila.setCor(cor);
                            motocadoguila.imprimir();
                        } else if (motocadoguila.setMarcha(novamarcha) == false) {
                            System.out.println("Marcha invalida; a mesma foi reajustada para marcha mais proxima do possivel");
                            motocadoguila.imprimir();
                        }
                        break;
                    default:
                    break;
                } System.out.println("A moto foi desligada...");
                estado = false;
                motocadoguila.desligar(estado);
            }else return;
       }while (resp!=0);
       System.out.println("Moto desligada e estacionada.");
    }
}
