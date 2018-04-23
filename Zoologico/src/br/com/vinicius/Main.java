/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import br.com.vinicius.objeto.Animal;
import br.com.vinicius.objeto.Grupo;
import br.com.vinicius.objeto.Lobo;
import br.com.vinicius.objeto.Zoologico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        int cod,n = 0;
        ArrayList<Zoologico> zoologicos = new ArrayList<>();
        ArrayList<Lobo> animais = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       

        do {
            cod = Integer.parseInt(JOptionPane.showInputDialog("Imforme o codigo que você escolheu"
                    + "\n1 : cadastrar grupo"
                    + "\n2 : cadastrar Zoologico"
                    + "\n3 : consutar"
                    + "\n4 : Sair"));
            switch (cod) {
                case 1: {
                    do {

                        int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o ID do grupo"));
                        String nome = JOptionPane.showInputDialog("Qual é o nome do grupo :");
                        String descricao = JOptionPane.showInputDialog("Qual é a descrição do grupo");

                        grupos.add(new Grupo(id, nome, descricao));
                    } while (JOptionPane.showConfirmDialog(null, "A mais algum grupo ?") == 0);

                    break;

                }
                case 2: {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o codigo do seu Zoologico"));

                    zoologicos.add(new Zoologico(id));

                    do {
                        float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual é o peso do animal :"));
                        float tamanho = Float.parseFloat(JOptionPane.showInputDialog("Qual é o tamanho do animal :"));
                        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Quando o animal nasceu :"));
                        int idani = Integer.parseInt(JOptionPane.showInputDialog("Qual é o codigo do animal :"));
                        String descricao = JOptionPane.showInputDialog("Qual é a descrição do animal :");
                        char status = JOptionPane.showInputDialog("Qual é o estatus do animal").charAt(0);
                        String nomclente = "";
                        for (Grupo grup : grupos) {
                            nomclente += "\n" + grupos.indexOf(grup) + " : " + grup.getNome();
                        }
                        int gru = Integer.parseInt(JOptionPane.showInputDialog("Qual é o codigo do grupo :" + nomclente));
                        Grupo grupo = grupos.get(gru);
                        n++;

                        animais.add(new Lobo(peso, tamanho, dataNascimento, idani, grupo, descricao, status));
                        zoologicos.get(zoologicos.size()-1).getAnimais().add(animais.get(n));
                        

                    } while (JOptionPane.showConfirmDialog(null, "A mais algum animal ?") == 0);
                    break;

                }

                case 3: {
                    String z = " ";
                    for (Zoologico zool : zoologicos) {
                        z += "\n" + zoologicos.indexOf(zool) + " : Zoologico com o codigo de " + zool.getId();
                    }
                    int zo = Integer.parseInt(JOptionPane.showInputDialog("Qual é o codigo do seu nome :" + z));

                    JOptionPane.showMessageDialog(null, zoologicos.get(zo).toString());
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Tchal");
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null, "Numero errado !!!");

                    break;
                }
            }

        } while (cod != 4);

    }
}
