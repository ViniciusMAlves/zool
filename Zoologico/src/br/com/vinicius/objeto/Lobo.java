/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Lobo extends Animal {

    private float peso;
    private float tamanho;
    private Date dataNascimento;

    public Lobo(float peso, float tamanho, Date dataNascimento, int id, Grupo grupo, String descrição, char status) {
        super( grupo, descrição, status);
        this.peso = peso;
        this.tamanho = tamanho;
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nLobo:" + " peso=" + peso + ", tamanho=" + tamanho + ", dataNascimento=" + dataNascimento ;
    }

}
