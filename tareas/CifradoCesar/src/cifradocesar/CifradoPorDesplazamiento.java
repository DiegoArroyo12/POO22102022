/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author diego
 */
public class CifradoPorDesplazamiento extends JFrame{
    private FlowLayout layout;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JComboBox n;
    private JTextArea mensaje;
    private JTextArea cifrado;
    private JButton boton;
    
    public CifradoPorDesplazamiento() throws HeadlessException{
        this.setTitle("Cifrado César");
        this.setSize(490, 600);
        this.setVisible(true);
        this.setResizable(false);
        layout = new FlowLayout();
        this.setLayout(null);
        etiqueta = new JLabel("Tipo de desplazamineto: ");
        n = new JComboBox <String>();
        n.addItem("1");
        n.addItem("2");
        n.addItem("3");
        n.addItem("4");
        n.addItem("5");
        n.addItem("6");
        n.addItem("7");
        n.addItem("8");
        n.addItem("9");
        n.addItem("10");
        n.addItem("11");
        n.addItem("12");
        n.addItem("13");
        n.addItem("14");
        n.addItem("15");
        n.addItem("16");
        n.addItem("17");
        n.addItem("18");
        n.addItem("19");
        n.addItem("20");
        n.addItem("21");
        n.addItem("22");
        n.addItem("23");
        n.addItem("24");
        n.addItem("25");
        n.addItem("26");
        etiqueta2 = new JLabel("Ingresa un mensaje: ");
        mensaje = new JTextArea();
        etiqueta3 = new JLabel("Mensaje cifrado: ");
        cifrado = new JTextArea();
        boton = new JButton("Cifrar");
        
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(n);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(mensaje);
        this.getContentPane().add(etiqueta3);
        this.getContentPane().add(cifrado);
        this.getContentPane().add(boton);
        
        etiqueta.setBounds(20, 20, 150, 15);
        n.setBounds(165,16,45,24);
        etiqueta2.setBounds(20,50,130,15);
        mensaje.setBounds(20,75,210,400);
        etiqueta3.setBounds(245, 50, 130, 15);
        cifrado.setBounds(245,75,210,400);
        cifrado.setEditable(false); // Para que no se pueda editar el texto
        boton.setBounds(186,500,100,40);
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String frase = mensaje.getText();
                StringBuilder cifra = new StringBuilder();
                float codigo = Float.parseFloat((String)n.getSelectedItem());
                String minusculas = "abcdefghijklmnñopqrstuvwxyz";
                String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                
                for (int i = 0; i < frase.length(); i++) {
                    if(frase.charAt(i) == ' '){
                            cifra.append((char)(frase.charAt(i)));
                        }
                    if (frase.charAt(i) == '\n') {
                            cifra.append(("\n"));
                    }
                    if (frase.charAt(i) == '.' | frase.charAt(i) == ',') {
                        cifra.append((char) (frase.charAt(i)));
                    }
                    for (int j = 0; j < minusculas.length(); j++) {
                        if (frase.charAt(i) == minusculas.charAt(j)) {
                            if ((j + codigo) > minusculas.length()){
                                cifra.append((char)(minusculas.charAt((int) ((j + codigo) % minusculas.length()))));
                            }else{
                                cifra.append((char)(minusculas.charAt((int) ((j + codigo) % minusculas.length()))));
                            }
                        }else if (frase.charAt(i) == mayusculas.charAt(j)){
                            if ((j + codigo) > mayusculas.length()){
                                cifra.append((char)(mayusculas.charAt((int) ((j + codigo) % mayusculas.length()))));
                            }else{
                                cifra.append((char)(mayusculas.charAt((int) ((j + codigo) % mayusculas.length()))));
                            }
                        }
                    }
                }
                cifrado.setText(cifra.toString());
            }
            
        });
    }
}
