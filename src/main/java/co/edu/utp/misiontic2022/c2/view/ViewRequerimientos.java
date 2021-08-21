package co.edu.utp.misiontic2022.c2.view;

import java.util.ArrayList;

import co.edu.utp.misiontic2022.c2.controller.ControllerRequerimientos;

import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_1;
import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_2;
import co.edu.utp.misiontic2022.c2.model.vo.Requerimiento_3;

import javax.swing.*;

public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1() {
        try {
            ArrayList<Requerimiento_1> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.consultarRequerimiento1();

            String vista = "Requerimiento 1\n";
            JFrame frame = new JFrame();

            for (Requerimiento_1 requerimiento_1 : listaRequerimiento_1) {
                vista += requerimiento_1.getFechaCompra() + " " +
                        requerimiento_1.getCodCompra() + " " +
                        requerimiento_1.getNombreProveedor() + " " +
                        requerimiento_1.getPagado()+"\n";
            }
            JTextArea textArea = new JTextArea(vista);
            textArea.setBounds(50,30,200,200);
            frame.add(textArea);
            frame.setSize(500,500);
            frame.setVisible(true);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.consultarRequerimiento2();

            String vista = "Requerimiento 2\n";
            JFrame frame = new JFrame();
            for (Requerimiento_2 requerimiento_2 : listaRequerimiento_2) {

                vista +=  requerimiento_2.getFechaIncio() + " " +
                                requerimiento_2.getCuidad() + " " +
                                requerimiento_2.getNombreConstructora() + " " +
                                requerimiento_2.getNommbreLider() + " " +
                                requerimiento_2.getCodigoTipo() + " " +
                                requerimiento_2.getEstrato()+"\n";

            }
            JTextArea textArea = new JTextArea(vista);
            textArea.setBounds(50,100,200,200);
            frame.add(textArea);
            frame.setSize(500,500);
            frame.setVisible(true);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {

        String vista = "Requerimiento 3\n";
        JFrame frame = new JFrame();
        try {
            ArrayList<Requerimiento_3> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 requerimiento_3 : listaRequerimiento_3) {
                vista +=requerimiento_3.getAbrev()+"\n";
            }
            JTextArea textArea = new JTextArea(vista);
            textArea.setBounds(50,100,200,200);
            frame.add(textArea);
            frame.setSize(500,500);
            frame.setVisible(true);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

