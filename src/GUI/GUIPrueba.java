package GUI;

import Logica.ColaGuerrero;
import Logica.Guerrero;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPrueba {
    private JButton copiarButton;
    private JButton calcularNivelPoderButton;
    private JButton agregarButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel PruebaCola;
    private JTextField nombre;
    private JTextField raza;
    private JTextField habilidad;
    private JTextField poder;
    private ColaGuerrero cola1 = new ColaGuerrero();
    private ColaGuerrero cola2 = new ColaGuerrero();

    public GUIPrueba() {
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(nombre.getText().isEmpty() && raza.getText().isEmpty() && habilidad.getText().isEmpty() && poder.getText().isEmpty()) {

                    Guerrero guerrero =new Guerrero();
                    cola1.enqueue(guerrero, textArea1);
                }else{


                    Guerrero guerrero = new Guerrero(nombre.getText(), raza.getText(), habilidad.getText(), Integer.parseInt(poder.getText()));
                    cola1.enqueue(guerrero, textArea1);
                }
            }
        });
        calcularNivelPoderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                cola1.calcularPoder();
            }
        });
        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                cola1.copyQueue(cola2, textArea2);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIPrueba");
        frame.setContentPane(new GUIPrueba().PruebaCola);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
