package gui.Registrar;




import gui.Menu.VentaDialog;
import entidades.Producto;
import entidades.Usuario;
import gui.login.LoginVentas;
import implementacion.implProducto;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistrarProductoDialog extends javax.swing.JFrame {
    implProducto productoDao = new implProducto();
    Producto p  = new Producto();
    Usuario u   = new Usuario();  
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel  modelo;

    public RegistrarProductoDialog() {
        this.setContentPane(fondo);
        
        u.setNombreUsuario(LoginVentas.MostrarLabel[0]);
        u.setCategoria(LoginVentas.MostrarLabel[1]);
      
        initComponents(); 
        ReporteData();
    }

  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        lbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        v_stock = new javax.swing.JTextField();
        v_id = new javax.swing.JTextField();
        v_nombre = new javax.swing.JTextField();
        v_precio = new javax.swing.JTextField();
        v_marca = new javax.swing.JTextField();
        btn_actualizar2 = new javax.swing.JButton();
        btn_grabar2 = new javax.swing.JButton();
        btn_eliminar4 = new javax.swing.JButton();
        btn_eliminar5 = new javax.swing.JButton();
        v_tipo = new javax.swing.JComboBox<>();
        v_TipoTabla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem7.setText("jMenuItem7");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");

        lbl_titulo.setBackground(new java.awt.Color(255, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Stencil", 1, 44)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("REGISTRAR PRODUCTO");

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Tipo:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Marca:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Precio:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Stock");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("ID seleccionado");

        v_id.setEditable(false);
        v_id.setBackground(new java.awt.Color(204, 204, 204));
        v_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_actualizar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_actualizar2.setForeground(new java.awt.Color(0, 153, 153));
        btn_actualizar2.setText("Actualizar");
        btn_actualizar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar2ActionPerformed(evt);
            }
        });

        btn_grabar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_grabar2.setForeground(new java.awt.Color(0, 204, 51));
        btn_grabar2.setText("Grabar");
        btn_grabar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_grabar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_grabar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabar2ActionPerformed(evt);
            }
        });

        btn_eliminar4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar4.setText("Limpiar");
        btn_eliminar4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar4ActionPerformed(evt);
            }
        });

        btn_eliminar5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminar5.setForeground(new java.awt.Color(255, 0, 0));
        btn_eliminar5.setText("Eliminar");
        btn_eliminar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_eliminar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar5ActionPerformed(evt);
            }
        });

        v_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enlatados", "embasados", "bebidas", "abarrotes" }));
        v_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v_tipoItemStateChanged(evt);
            }
        });
        v_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btn_grabar2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_actualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_eliminar5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_eliminar4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(v_nombre)
                                        .addComponent(v_marca)
                                        .addComponent(v_tipo, 0, 111, Short.MAX_VALUE))
                                    .addComponent(v_id, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(v_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(v_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(v_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(v_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(v_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(v_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(v_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(v_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btn_eliminar4)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_grabar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        v_TipoTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enlatados", "embasados", "bebidas", "abarrotes" }));
        v_TipoTabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v_TipoTablaItemStateChanged(evt);
            }
        });
        v_TipoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_TipoTablaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGRESAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu6.setText("File");

        jMenuItem8.setText("jMenuItem8");
        jMenu6.add(jMenuItem8);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar2ActionPerformed
        if(!v_nombre.getText().equals("") && !v_marca.getText().equals("") && !v_precio.getText().equals("") && !v_stock.getText().equals("") ){
            
//            if(p.getProducto_nombre().equals(v_nombre.getText()) && p.getProducto_tipo().equals(v_tipo.getSelectedItem().toString()) && p.getProducto_marca().equals(v_marca.getText())){
                p.setProducto_id(v_id.getText());
                p.setProducto_nombre(v_nombre.getText());
                p.setProducto_tipo(v_tipo.getSelectedItem().toString());
                p.setProducto_marca(v_marca.getText()); 
                p.setProducto_precio(Double.parseDouble(v_precio.getText()));                              
                int Polimorfismo=0;
                productoDao.actualizarRegistroProducto(p, Polimorfismo);
                LimpiarDatos();
                JOptionPane.showMessageDialog(
                    null,
                    "Se registro con Exito",
                    "Registro",
                    JOptionPane.INFORMATION_MESSAGE);
                ReporteData();
//            }else{
//                JOptionPane.showMessageDialog(null,
//                    "El producto que desea actualizar no existe",
//                    "Error/Advertencia",
//                    JOptionPane.INFORMATION_MESSAGE);
//            }
            
          
        }else{
            JOptionPane.showMessageDialog(null,
                "No se registro, error en datos ingresados",
                "Error/Advertencia",
                JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btn_actualizar2ActionPerformed

    private void btn_grabar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabar2ActionPerformed
        if(!v_nombre.getText().equals("") && !v_marca.getText().equals("") && !v_precio.getText().equals("") && !v_stock.getText().equals("") && Double.parseDouble(v_stock.getText())>0){
            
            p.setProducto_nombre(v_nombre.getText());
            p.setProducto_tipo(v_tipo.getSelectedItem().toString());
            p.setProducto_marca(v_marca.getText()); 
            p.setProducto_precio(Double.parseDouble(v_precio.getText()));
            p.setProducto_stock(Double.parseDouble(v_stock.getText()));

            productoDao.registrarProducto(p);
            
            p.setRegistroProducto_cantidad_vendida(Double.parseDouble(v_stock.getText()));
            double igvTotal = (Double.parseDouble(v_precio.getText())*Double.parseDouble(v_stock.getText()))*0.18;
            p.setRegistroProducto_igv_total(igvTotal);
            double montoTotal = Double.parseDouble(v_precio.getText())*Double.parseDouble(v_stock.getText());
            p.setRegistroProducto_monto_total(montoTotal);
            
            productoDao.registrarCompraProducto(p);
            LimpiarDatos();

            JOptionPane.showMessageDialog(
                null,
                "Se registro con Exito",
                "Registro",
                JOptionPane.INFORMATION_MESSAGE);

            
            ReporteData();
        }else{
            JOptionPane.showMessageDialog(null,
                "No se registro",
                "Error/Advertencia",
                JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_grabar2ActionPerformed
    
    private void btn_eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar4ActionPerformed
        LimpiarDatos();   
    }//GEN-LAST:event_btn_eliminar4ActionPerformed

    private void btn_eliminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar5ActionPerformed
        p.setProducto_id(v_id.getText());

        if(!v_nombre.getText().equals("") || !v_marca.getText().equals("") || !v_precio.getText().equals("") || !v_stock.getText().equals("")){
            productoDao.eliminarRegistroProducto(p);
            JOptionPane.showMessageDialog(
                null,
                "Se elimino con Exito",
                "Registro",
                JOptionPane.INFORMATION_MESSAGE);

            
            ReporteData();
        }else{
            JOptionPane.showMessageDialog(null,
                "No se elimino",
                "Error/Advertencia",
                JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btn_eliminar5ActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int row=tablaProducto.getSelectedRow();
             if (evt.getClickCount()==1) {
            JTable receptor=(JTable)evt.getSource();

            v_nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            p.setProducto_nombre(v_nombre.getText());
            
            productoDao.reporteProductoUnico(p);
            
            v_id.setText(p.getProducto_id());
            v_nombre.setText(p.getProducto_nombre());
            v_tipo.setSelectedItem(p.getProducto_tipo());
            v_marca.setText(p.getProducto_marca());
            v_precio.setText(String.valueOf(p.getProducto_precio()));
            v_stock.setText(String.valueOf(p.getProducto_stock()));
//            if(p.getSexo().equals("M")){
//                v_masculino.doClick();
//            }
//            if(p.getSexo().equals("F")){
//                v_femenino.doClick();
//            }
//            v_usuario.setText(p.getUsuario());
//            v_contrasenia.setText(p.getPassword()    
            }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void v_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_tipoActionPerformed
       
        
        
        
    }//GEN-LAST:event_v_tipoActionPerformed

    private void v_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v_tipoItemStateChanged
     
    }//GEN-LAST:event_v_tipoItemStateChanged

    private void v_TipoTablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v_TipoTablaItemStateChanged
        ReporteData();
    }//GEN-LAST:event_v_TipoTablaItemStateChanged

    private void v_TipoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_TipoTablaActionPerformed
       
 
        
    }//GEN-LAST:event_v_TipoTablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentaDialog vntDialog = new VentaDialog();
        vntDialog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
        public void ReporteData(){
            Producto p = new Producto();
            p.setProducto_tipo(v_TipoTabla.getSelectedItem().toString());
            modelo = new DefaultTableModel();
           
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo");
            modelo.addColumn("Marca");
            modelo.addColumn("Precio");
            modelo.addColumn("Stock");

                for (Producto prod : productoDao.reporteProducto(p)) {
                    Object[] fila = new Object[6];
                    fila[0] = prod.getProducto_id();
                    fila[1] = prod.getProducto_nombre();
                    fila[2] = prod.getProducto_tipo();
                    fila[3] = prod.getProducto_marca();
                    fila[4] = prod.getProducto_precio();
                    fila[5] = prod.getProducto_stock();
                    modelo.addRow(fila);
                }
            tablaProducto.setModel(modelo);       
    }
    
    
    public void LimpiarDatos(){
        v_id.setText(""); v_stock.setText("");
        v_nombre.setText("");
        v_tipo.setSelectedItem("enlatados");
        v_marca.setText("");
        v_precio.setText("");
        v_stock.setText("");
    }
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrarProductoDialog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar2;
    private javax.swing.JButton btn_eliminar4;
    private javax.swing.JButton btn_eliminar5;
    private javax.swing.JButton btn_grabar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JComboBox<String> v_TipoTabla;
    private javax.swing.JTextField v_id;
    private javax.swing.JTextField v_marca;
    private javax.swing.JTextField v_nombre;
    private javax.swing.JTextField v_precio;
    private javax.swing.JTextField v_stock;
    private javax.swing.JComboBox<String> v_tipo;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
           private Image imagen;

           @Override
           public void paint (Graphics g){
               imagen = new ImageIcon(getClass().getResource("/recursos/images/carritoventas.png")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       }   
    class FondoMiniPanel extends JPanel{
           private Image imagen;

           @Override
           public void paint (Graphics g){
               imagen = new ImageIcon(getClass().getResource("/recursos/images/fondolabel3.png")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       } 

    
}
