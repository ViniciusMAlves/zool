/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.ArrayList;

/**
 *
 * @author SATC
 */
public class Zoologico {

    private int id;
    private ArrayList<Animal> animais = new ArrayList<>();

    public Zoologico(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    
    
    @Override
    public String toString() {
        return "Zoologico" + "\n id=" + id + ",\n animais=" + animais ;
    }

}
