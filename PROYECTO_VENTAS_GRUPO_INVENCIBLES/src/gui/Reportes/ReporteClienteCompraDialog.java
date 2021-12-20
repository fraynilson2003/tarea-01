/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.Reportes;

import entidades.RegistroVentaCliente;
import gui.Menu.VentaDialog;
import entidades.Producto;
import entidades.Usuario;
import generator.Eventos;
import implementacion.implCliente;
import implementacion.implUsuario;
import implementacion.implVenta;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fray
 */
public class ReporteClienteCompraDialog extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel modelo;
    implUsuario usuarioDao = new implUsuario();
    implCliente clienteDao = new implCliente();
    Usuario u = new Usuario();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Eventos event = new Eventos();
    Producto p = new Producto();
    RegistroVentaCliente c = new RegistroVentaCliente();
    
    double Totalpagar=0.0;
    /**
     * Creates new form ReporteVentaDialog
     */
    public ReporteClienteCompraDialog() {
        this.setContentPane(fondo);
        initComponents();
        lbl_total_generado.setText("0.00");
        ReporteData();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCalendarBeanInfo1 = new rojeru_san.componentes.RSCalendarBeanInfo();
        rSPopuMenu1 = new rojeru_san.complementos.RSPopuMenu();
        rSYearDateBeanInfo1 = new rojeru_san.componentes.RSYearDateBeanInfo();
        lbl_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporteVenta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        fecha_antes = new rojeru_san.componentes.RSDateChooser();
        fecha_fin = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_total_generado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        v_cliente_dni_ruc = new javax.swing.JTextField();
        v_cliente_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setBackground(new java.awt.Color(255, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Stencil", 1, 40)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("REPORTE Cliente Compra");

        tablaReporteVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaReporteVenta);

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("REPORTAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESDE");

        lbl_total_generado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TOTAL");

        v_cliente_dni_ruc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v_cliente_dni_ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_cliente_dni_rucActionPerformed(evt);
            }
        });
        v_cliente_dni_ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                v_cliente_dni_rucKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                v_cliente_dni_rucKeyTyped(evt);
            }
        });

        v_cliente_nombre.setEditable(false);
        v_cliente_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DNI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NOMBRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total_generado, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fecha_antes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(fecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v_cliente_dni_ruc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_total_generado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(fecha_antes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_fin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(v_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v_cliente_dni_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGRESAR");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentaDialog vntDialog = new VentaDialog();
        vntDialog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.setCliente_DNI_RUC(v_cliente_dni_ruc.getText());
        c.setFecha_antes(formatter.format(fecha_antes.getDatoFecha()));
        c.setFecha_actual(formatter.format(fecha_fin.getDatoFecha()));
        System.out.println(p.getFecha_ant());
        System.out.println(p.getFecha_des());            
        
//       ventaDao.reporteVentas2(p);
        ReporteData();
        TotalPagar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void v_cliente_dni_rucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v_cliente_dni_rucKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println(u.getNombre());
            if (!"".equals(v_cliente_dni_ruc.getText())) {
                u.setDni_ruc(v_cliente_dni_ruc.getText());
                clienteDao.ReporteClienteUnico(u);

                v_cliente_nombre.setText(u.getNombre()+" "+u.getApellido());

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el codigo del productos");
                //                txtCodigoVenta.requestFocus();
            }
        }
    }//GEN-LAST:event_v_cliente_dni_rucKeyPressed

    private void v_cliente_dni_rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_v_cliente_dni_rucKeyTyped
        event.numberKeyPress(evt);

    }//GEN-LAST:event_v_cliente_dni_rucKeyTyped

    private void v_cliente_dni_rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_cliente_dni_rucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_cliente_dni_rucActionPerformed

  
    public void ReporteData(){  
        
      
      modelo = new DefaultTableModel();


      modelo.addColumn("Nombre Cliente");
      modelo.addColumn("DNI / RUC");
      modelo.addColumn("Producto");
      modelo.addColumn("Tipo Producto");
      modelo.addColumn("Precio Unid.");
      modelo.addColumn("Cantidad Vend.");
      modelo.addColumn("IGV Total");
      modelo.addColumn("Total Soles");
      modelo.addColumn("Fecha");

          for (RegistroVentaCliente cli : clienteDao.reporteVentaCliente(c)) {
              Object[] fila = new Object[9];                 
              fila[0] = cli.getCliente_Nombre();
              fila[1] = cli.getCliente_DNI_RUC();
              fila[2] = cli.getCliente_Producto_compra();
              fila[3] = cli.getCliente_Producto_tipo();
              fila[4] = cli.getCliente_Producto_precio();
              fila[5] = cli.getCliente_Cantidad_comprada();
              fila[6] = cli.getCliente_IGV_total();
              fila[7] = cli.getCliente_Total_soles();
              fila[8] = cli.getCliente_Fecha_Venta();
              modelo.addRow(fila);
          }
      tablaReporteVenta.setModel(modelo);       
    }
    private void TotalPagar() {
        Totalpagar = 0.00;
        int numFila = tablaReporteVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tablaReporteVenta.getModel().getValueAt(i, 7)));
            Totalpagar = Totalpagar + cal;
        }
        String Total=String.format("%.2f", Totalpagar);
        lbl_total_generado.setText(Total+"   Soles");
    }
    
    
    
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReporteClienteCompraDialog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser fecha_antes;
    private rojeru_san.componentes.RSDateChooser fecha_fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_total_generado;
    private rojeru_san.componentes.RSCalendarBeanInfo rSCalendarBeanInfo1;
    private rojeru_san.complementos.RSPopuMenu rSPopuMenu1;
    private rojeru_san.componentes.RSYearDateBeanInfo rSYearDateBeanInfo1;
    private javax.swing.JTable tablaReporteVenta;
    private javax.swing.JTextField v_cliente_dni_ruc;
    private javax.swing.JTextField v_cliente_nombre;
    // End of variables declaration//GEN-END:variables
  class FondoPanel extends JPanel{
           private Image imagen;

           @Override
           public void paint (Graphics g){
               imagen = new ImageIcon(getClass().getResource("/recursos/images/campus2.jpg")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       } 
}
