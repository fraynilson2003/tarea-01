/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.Reportes;


import gui.Menu.VentaDialog;
import entidades.Producto;
import implementacion.implProducto;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fray
 */
public class ReporteCompraProductoDialog extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel modelo;
//    implVenta ventaDao = new implVenta();
    implProducto productoDao = new implProducto();
    Producto p = new Producto();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    double Totalpagar=0.0;
    /**
     * Creates new form ReporteVentaDialog
     */
    public ReporteCompraProductoDialog() {
        this.setContentPane(fondo);
        initComponents();
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
        v_TipoTabla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        fecha_antes = new rojeru_san.componentes.RSDateChooser();
        fecha_fin = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_total_generado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbl_titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setBackground(new java.awt.Color(255, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Stencil", 1, 40)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("REPORTE COMPRA");

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

        v_TipoTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v_TipoTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todo", "enlatados", "embasados", "bebidas", "abarrotes" }));
        v_TipoTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v_TipoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_TipoTablaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("REPORTAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HASTA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESDE");

        lbl_total_generado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TOTAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total_generado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fecha_antes, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(fecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_total_generado, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(fecha_antes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

        lbl_titulo1.setBackground(new java.awt.Color(255, 0, 0));
        lbl_titulo1.setFont(new java.awt.Font("Stencil", 1, 40)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo1.setText("PRODUCTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(187, 187, 187))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_titulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void v_TipoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_TipoTablaActionPerformed


        
    }//GEN-LAST:event_v_TipoTablaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentaDialog vntDialog = new VentaDialog();
        vntDialog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p.setProducto_tipo(v_TipoTabla.getSelectedItem().toString());
        p.setFecha_ant(formatter.format(fecha_antes.getDatoFecha()));
        p.setFecha_des(formatter.format(fecha_fin.getDatoFecha()));
        System.out.println(p.getFecha_ant());
        System.out.println(p.getFecha_des());   

        if((v_TipoTabla.getSelectedItem().toString()).equals("todo")){
            ReporteDataTodo();  
        }else{
        ReporteData();   
        }

        TotalPagar();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public void ReporteData(){  
        modelo = new DefaultTableModel();

        modelo.addColumn("Producto");
        modelo.addColumn("Tipo Prod.");
        modelo.addColumn("Precio Unid.");
        modelo.addColumn("Cantidad Comprada");
        modelo.addColumn("IGV Total");
        modelo.addColumn("Total Soles");
        modelo.addColumn("Fecha");

          for (Producto prod : productoDao.reporteCompraProductos(p)) {
              Object[] fila = new Object[7];                 
              fila[0] = prod.getProducto_nombre();
              fila[1] = prod.getProducto_tipo();
              fila[2] = prod.getProducto_precio();
              fila[3] = prod.getRegistroProducto_cantidad_vendida();
              fila[4] = prod.getRegistroProducto_igv_total();
              fila[5] = prod.getRegistroProducto_monto_total();
              fila[6] = prod.getVenta_fecha();
              modelo.addRow(fila);
          }
        tablaReporteVenta.setModel(modelo);       
    }
    
    public void ReporteDataTodo(){  
        modelo = new DefaultTableModel();

        modelo.addColumn("Producto");
        modelo.addColumn("Tipo Prod.");
        modelo.addColumn("Precio Unid.");
        modelo.addColumn("Cantidad Comprada");
        modelo.addColumn("IGV Total");
        modelo.addColumn("Total Soles");
        modelo.addColumn("Fecha");

          for (Producto prod : productoDao.reporteCompraProductosTodo(p)) {
              Object[] fila = new Object[7];                 
              fila[0] = prod.getProducto_nombre();
              fila[1] = prod.getProducto_tipo();
              fila[2] = prod.getProducto_precio();
              fila[3] = prod.getRegistroProducto_cantidad_vendida();
              fila[4] = prod.getRegistroProducto_igv_total();
              fila[5] = prod.getRegistroProducto_monto_total();
              fila[6] = prod.getVenta_fecha();
              modelo.addRow(fila);
          }
         tablaReporteVenta.setModel(modelo);       
    }
     
    private void TotalPagar() {
        Totalpagar = 0.00;
        int numFila = tablaReporteVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tablaReporteVenta.getModel().getValueAt(i, 5)));
            Totalpagar = Totalpagar + cal;
        }
        String Total=String.format("%.2f", Totalpagar);
        lbl_total_generado.setText(Total+"   Soles");
    }
    
    
    
    
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReporteCompraProductoDialog().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JLabel lbl_total_generado;
    private rojeru_san.componentes.RSCalendarBeanInfo rSCalendarBeanInfo1;
    private rojeru_san.complementos.RSPopuMenu rSPopuMenu1;
    private rojeru_san.componentes.RSYearDateBeanInfo rSYearDateBeanInfo1;
    private javax.swing.JTable tablaReporteVenta;
    private javax.swing.JComboBox<String> v_TipoTabla;
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
