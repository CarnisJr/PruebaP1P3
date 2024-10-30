package Logica;

import javax.swing.*;
import java.util.concurrent.ForkJoinTask;

public class ColaGuerrero {

    private Nodo inicio, fin;

    public ColaGuerrero() {

        this.fin = null;
        this.inicio = null;
    }

    public boolean isEmpty(){

        return this.inicio == null && this.fin == null;
    }

    public void enqueue(Guerrero entrada, JTextArea textArea){

        Nodo newNode = new Nodo(entrada, null);

        if(!isEmpty()){

            this.fin.setNext(newNode);
            this.fin = newNode;
        }else{

            this.inicio = this.fin = newNode;
        }
        refresh(textArea);
    }

    public void dequeue(JTextArea textArea){

        if(!isEmpty()){

            if(this.inicio == this.fin){

                this.inicio = this.fin = null;
            }else{

                inicio = this.inicio.getNext();
            }
        }else{

            JOptionPane.showMessageDialog(null, "Esta vacio");
        }
        refresh(textArea);
    }

    public String showElements(){

        StringBuilder string = new StringBuilder();
        Nodo aux = this.inicio;

        if(!isEmpty()){

            while(aux != null){

                string.append(aux.getEntrada().getNombre()).append(", ").append(aux.getEntrada().getRaza()).append(", ")
                        .append(aux.getEntrada().getHabilidad()).append(", ").append(aux.getEntrada().getNivelPoder()).append("\n");
                aux = aux.getNext();
            }
        }else{

            string.append("Este vacio");
        }

        return string.toString();
    }

    public void refresh(JTextArea textArea){

        textArea.setText(showElements());
    }


    /*public void agregarACola(JTextArea textArea){

        Guerrero guerrero1 = new Guerrero();
        Guerrero guerrero2 = new Guerrero("Juan", "Namekusain", "Hamehameha", 15);
        Guerrero guerrero3 = new Guerrero("Antonio", "Terricola", "Onda explosiva", 89);
        Guerrero guerrero4 = new Guerrero("Carlos", "Saiyajin", "Canio especial", 45);
        Guerrero guerrero5 = new Guerrero("Kevin", "Namekusain", "Onda explosiva", 156);

        enqueue(guerrero1, textArea);
        enqueue(guerrero2, textArea);
        enqueue(guerrero3, textArea);
        enqueue(guerrero4, textArea);
        enqueue(guerrero5, textArea);
        refresh(textArea);
    }*/

    public void calcularPoder(){

        StringBuilder string = new StringBuilder();
        double poder = 0;
        Nodo aux = this.inicio;

        if(!isEmpty()){

            while(aux != null){

                if(aux.getEntrada().getRaza().equals("Saiyajin")){

                    poder = aux.getEntrada().getNivelPoder() * 1.5;
                    string.append(aux.getEntrada().getNombre()).append(", ").append(aux.getEntrada().getRaza()).append(", ")
                            .append(aux.getEntrada().getHabilidad()).append(", ").append(aux.getEntrada().getNivelPoder()).append(", ").append(poder).append("\n");
                }else if(aux.getEntrada().getRaza().equals("Namekusein")){

                    poder = aux.getEntrada().getNivelPoder() * 1.2;
                    string.append(aux.getEntrada().getNombre()).append(", ").append(aux.getEntrada().getRaza()).append(", ")
                            .append(aux.getEntrada().getHabilidad()).append(", ").append(aux.getEntrada().getNivelPoder()).append(", ").append(poder).append("\n");
                }else if(aux.getEntrada().getRaza().equals("Terricola")){

                    poder = aux.getEntrada().getNivelPoder();
                    string.append(aux.getEntrada().getNombre()).append(", ").append(aux.getEntrada().getRaza()).append(", ")
                            .append(aux.getEntrada().getHabilidad()).append(", ").append(aux.getEntrada().getNivelPoder()).append(poder).append("\n");
                }

                JOptionPane.showMessageDialog(null, string.toString());
                aux = aux.getNext();
            }
        }
    }

    public void copyQueue(ColaGuerrero cola, JTextArea textArea){

        Nodo aux = this.inicio;

        if(!isEmpty()){

            while(aux != null){

                if(aux.getEntrada().getHabilidad().equals("Kamehameha")){

                    cola.enqueue(aux.getEntrada(), textArea);
                }

                aux = aux.getNext();
            }
        }else{

            JOptionPane.showMessageDialog(null, "Este vacio");
        }

    }
}
