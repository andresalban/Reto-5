package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.view.ViewRequerimientos;
import co.edu.utp.misiontic2022.c2.view.requerimientoBotones;

import java.awt.event.ActionListener;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Requerimiento 1");
        //VistaRequerimientos.requerimiento1();
        //ViewRequerimientos.requerimiento1();
         new requerimientoBotones().AreaBotones();
        System.out.println("\nRequerimiento 2");
        // VistaRequerimientos.requerimiento2();
        //ViewRequerimientos.requerimiento2();
        System.out.println("\nRequerimiento 3");
        // VistaRequerimientos.requerimiento3();
        //ViewRequerimientos.requerimiento3();
        
    }
}

