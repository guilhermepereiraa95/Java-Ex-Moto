/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author lb20-05
 */
public class Moto {

    //abaixo a declaração de atributos e getters como pedido
    private String marca;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public int getMaiorMarcha() {
        return maiorMarcha;
    }

    public int getMenorMarcha() {
        return menorMarcha;
    }

    public boolean isEstado() {
        return estado;
    }
    private String modelo;
    private String cor;
    private int marcha = 0;
    private int maiorMarcha;
    private int menorMarcha;
    private boolean estado;

    //exercicio construtor - coletar as informações da moto por parametros
    public Moto(String marca, String modelo, String cor, int marcha, int menor, int maior, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.marcha = marcha;
        this.menorMarcha = menor;
        this.maiorMarcha = maior;
        this.estado = estado;
    }

    //os metodos abaixo decidem os movimentos de marcha, estado da moto e validez de marcha
    private boolean marchaValida(int validez) {
        this.marcha = validez;
        if (this.marcha >= 0 && this.marcha <= 6) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ligar(boolean estado) {
        this.estado = estado;
        return this.estado;
    }

    public boolean desligar(boolean estado) {
        this.estado = estado;
        return this.estado;
    }

    public void imprimir() {
        System.out.println("Estado da moto:\nMarca: " + marca + ", Modelo: " + modelo + ", Cor:  " + cor + ", Marcha: " + marcha + ", Estado: " + estado);
    }

    public boolean marchaAcima() {
        if (this.marchaValida(this.marcha) == true) {
            this.marcha++;
            return true;
        } else if (this.marchaValida(this.marcha) == false) {
            return false;
        }
        return false;
    }

    public boolean marchaAbaixo() {
        if (this.marchaValida(this.marcha) == true) {
            this.marcha--;
            return true;
        } else if (this.marchaValida(this.marcha) == false) {
            return false;
        }
        return false;
    }

    public boolean setMarcha(int marcha) {
        if (this.marchaValida(marcha) == true) {
            this.marcha = marcha;
            return true;
        } else if (this.marchaValida(marcha) == false) {
            if (marcha <= 0) {
                this.marcha = 0;
            } else if (marcha >= 6) {
                this.marcha = 6;
            }
            return false;
        }
        return false;
    }
}
