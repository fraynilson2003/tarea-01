package programa.crudvector01;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CrudFrame extends JFrame{
    JLabel lb_nombres = new JLabel("Nombres");
    JLabel lb_ap_paterno = new JLabel("Ap. Paterno");
    JLabel lb_ap_materno = new JLabel("Ap. Materno");
    JLabel lb_codigo = new JLabel("Codigo");
    
    JTextField txf_nombres = new JTextField();
    JTextField txf_ap_paterno = new JTextField();
    JTextField txf_ap_materno = new JTextField();
    JTextField txf_codigo = new JTextField();
    
    MetodosSistema metodos = new MetodosSistema();
    
    
    
    public CrudFrame(){
        //Creamos el manu bar
        JMenuBar menuBar = new JMenuBar();
        //Creamos las opciones del menu bar
        JMenu menuFile   = new JMenu();
        JMenu menuMantenimiento = new JMenu();
        JMenu menuReportes = new JMenu();
        //Creamos los items que tendran las opciones del menu bar
        
        //Opciones de menuFile
        JMenuItem menuFileSave               = new JMenuItem();
        JMenuItem menuFileExit               = new JMenuItem();  
        //opciones de menuMantenimiento
        JMenuItem menuMantenimientoRegistrar = new JMenuItem();
        JMenuItem menuMantenimientoEliminar  = new JMenuItem();
        //opciones de menuReportes
        JMenuItem menuReportesGeneral   = new JMenuItem();
        JMenuItem menuReportesDetallado = new JMenuItem();
        //Damos nombre a las opciones del menu bar  
        
        //Aqui nombramos a las opccion de Menu bar y los items que este contiene
        menuFile.setText("File");
        menuFileSave.setText("Guardar");
        menuFileExit.setText("Salir");
        //Aqui nombramos a las opccion de Menu bar y los items que este contiene
        menuMantenimiento.setText("Crud");
        menuMantenimientoRegistrar.setText("Registrar");
        menuMantenimientoEliminar.setText("Eliminar");
        //Aqui nombramos a las opccion de Menu bar y los items que este contiene
        menuReportes.setText("Reportes");
        menuReportesGeneral.setText("Rep. Global");
        menuReportesDetallado.setText("Rep. Detalle");
        //Aqui agregamos las opciones creadas a sus respectivas opciones
        
        //Aqui agredamos los items a la opcion menuFile
        menuFile.add(menuFileSave);
        menuFile.add(menuFileExit);
        //Aqui agregamos los items a la opcion menuMantenimiento 
        menuMantenimiento.add(menuMantenimientoRegistrar);
        menuMantenimiento.add(menuMantenimientoEliminar);
        //Aqui agregamos los items a la opcion menuReportes
        menuReportes.add(menuReportesGeneral);
        menuReportes.add(menuReportesDetallado);
        
        //Aqui agregamos los 3 menus al menuBar (El grande y padre)
        menuBar.add(menuFile);
        menuBar.add(menuMantenimiento);
        menuBar.add(menuReportes);
        
        //Aqui agregamos un titulo a toda la venta JFrame
        //Aqui agregamos el menuBar (El grande y padre) al JFrame creado
        //Aqui damos dimension a nuestro Jrame creado
        setTitle("Practica Crud Vector");
        setJMenuBar(menuBar);
        setSize(new Dimension(650, 700));
        
        //Creamos Acciones
        menuFileExit.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0); 
                } 
            } );
        
        
        menuReportesGeneral.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //Creamos un vector tipo String
                    String columnas[] = {"Nombres","Ap. Paterno","Ap. Materno","Codigo"};
                    //Creamos una matriz tipo Object y le damos sus dimensiones
                    Object filas[][] = new Object [metodos.lista.size()][4];
                    
                    //Creamos un vector de las dimensiones metodos.lista
                    ArrayList nuevoVector = metodos.lista;
                    for(int i = 0; i<nuevoVector.size();i++){
                        DatosPersona v = (DatosPersona)metodos.lista.get(i);
                        filas[i][0] = v.nombres;
                        filas[i][1] = v.ap_paterno;
                        filas[i][2] = v.ap_materno;
                        filas[i][3] = v.codigo;
                    }
                    //Creamos un JTable con dimensiones de Fila y Columnas
                    JTable tabla  = new JTable (filas, columnas);
                    JScrollPane tabla1 = new JScrollPane(tabla);
                        
                        JPanel reporte = new JPanel();
                        reporte.add(tabla1);
                        
                             Object  msg[]={reporte};
                        JOptionPane.showMessageDialog(null, msg, "Reporte", JOptionPane.QUESTION_MESSAGE);
    } 
            } );
        
        
        
        menuMantenimientoRegistrar.addActionListener(
            new ActionListener(){
                //Creamos un panel al accionar en item "Registrar"
                public void actionPerformed(ActionEvent e){
                    //Creamos etiquetas y textField 
                    JPanel pan1 = new JPanel(new GridLayout(1,2));
                    pan1.add(lb_nombres);
                    pan1.add(txf_nombres);
                    
                    JPanel pan2 = new JPanel(new GridLayout(1,2));
                    pan2.add(lb_ap_paterno);
                    pan2.add(txf_ap_paterno);
                    
                    JPanel pan3 = new JPanel(new GridLayout(1,2));
                    pan3.add(lb_ap_materno);                  
                    pan3.add(txf_ap_materno);
                    
                    JPanel pan4 = new JPanel(new GridLayout(1,2));
                    pan4.add(lb_codigo);
                    pan4.add(txf_codigo);
                    //Colocamos nuestros paneles en un objeto
                    Object msg [] = {pan1, pan2, pan3, pan4};
                    //Creamos con un metodo automatico el cuadro de dialogo
                    if(JOptionPane.showOptionDialog(null, msg,"Registrar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){                   
                  //  System.out.println("Probando"+txf_nombres.getText());
                    
                    
                    DatosPersona dp = new DatosPersona();
                    //Extraemos los datos del "TextField y lo colocamos en variables, estas variables fueron importadas de otra clase
                    dp.nombres=txf_nombres.getText();
                    dp.ap_paterno=txf_ap_paterno.getText();
                    dp.ap_materno=txf_ap_materno.getText();
                    dp.codigo=txf_codigo.getText();
                    //Agregamos al VECTOR importado de la clase MetodosSistemas las "String" almacenadas en el Object "dp"
                    metodos.registrarPersona(dp);
                    JOptionPane.showMessageDialog(
                                        null,
                                        "Se registro conExito", 
                                        "Registro",
                                        JOptionPane.INFORMATION_MESSAGE);
                }
                }
            } );
        
        
        
        
        
        
        
        
        

   }
}


    

