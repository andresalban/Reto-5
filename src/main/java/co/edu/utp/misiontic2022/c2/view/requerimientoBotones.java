package co.edu.utp.misiontic2022.c2.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class requerimientoBotones {


    public void AreaBotones() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("RETO 5");

        label.setBounds(250,50,150,30);
        frame.add(label);

        JButton buttonR1 = new JButton("Requerimiento 1");
        JButton buttonR2 = new JButton("Requerimiento 2");
        JButton buttonR3 = new JButton("Requerimiento 3");

        buttonR1.setBounds(0, 100, 150, 30);
        buttonR1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewRequerimientos viewRequerimientos = new ViewRequerimientos();
                ViewRequerimientos.requerimiento1();
            }
        });
        frame.add(buttonR1);

        buttonR2.setBounds(160, 100, 150, 30);
        buttonR2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewRequerimientos viewRequerimientos = new ViewRequerimientos();
                ViewRequerimientos.requerimiento2();
            }
        });
        frame.add(buttonR2);

        buttonR3.setBounds(320, 100, 150, 30);
        buttonR3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewRequerimientos viewRequerimientos = new ViewRequerimientos();
                ViewRequerimientos.requerimiento3();
            }
        });

        frame.add(buttonR3);

        frame.setLayout(null);
        frame.setSize(500,300);
        frame.setVisible(true);


    }


}
