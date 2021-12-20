package gui.Registrar;

import gui.Menu.VentaDialog;
import entidades.Producto;
import entidades.Usuario;
import generator.Eventos;
import gui.login.LoginVentas;
import implementacion.implCliente;
import implementacion.implProducto;
import implementacion.implUsuario;
import implementacion.implVenta;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistrarVentaDialog extends javax.swing.JFrame {
    Usuario u   = new Usuario();  
    FondoPanel fondo = new FondoPanel();
    Producto p = new Producto();
    DefaultTableModel modelo;
    DefaultTableModel tmp = new DefaultTableModel();
    implVenta ventaDao = new implVenta();
    implProducto productoDao = new implProducto();
    implUsuario usuarioDao = new implUsuario();
    implCliente clienteDao = new implCliente();
    Eventos event = new Eventos();
    
    int contadorItem;
    double Totalpagar = 0.00;
    

    
    public RegistrarVentaDialog() {
        this.setContentPane(fondo);
        u.setNombreUsuario(LoginVentas.MostrarLabel[0]);
        u.setCategoria(LoginVentas.MostrarLabel[1]);
        
        System.out.println("Dentro de Ventas\n----------------------");
        System.out.println(u.getNombreUsuario());
        System.out.println(u.getCategoria());
        
        initComponents(); 
        ReporteData();
        
        
   
    }

  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new FondoPanelCrema2();
        v_tipo = new javax.swing.JTextField();
        v_nombre = new javax.swing.JTextField();
        v_precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        v_stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_carrito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        v_TipoTabla = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        v_stockAnt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        v_cliente_dni_ruc = new javax.swing.JTextField();
        v_cliente_nombre = new javax.swing.JTextField();
        jPanel2 = new FondoPanelCrema2();
        btn_vender = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_montoTotal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");

        lbl_titulo.setBackground(new java.awt.Color(255, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Stencil", 1, 40)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("REGISTRAR VENTA");

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGRESAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        v_tipo.setEditable(false);
        v_tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        v_nombre.setEditable(false);
        v_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        v_precio.setEditable(false);
        v_precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_precioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TIPO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PRECIO UNIDAD");

        v_stock.setBackground(new java.awt.Color(51, 255, 204));
        v_stock.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        v_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_stockActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CANTIDAD A VENDER");

        btn_carrito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images/carritoVentas3.jpg"))); // NOI18N
        btn_carrito.setText("CARRITO");
        btn_carrito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btn_carrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carritoActionPerformed(evt);
            }
        });

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

        v_TipoTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        v_TipoTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enlatados", "embasados", "bebidas", "abarrotes" }));
        v_TipoTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v_TipoTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_TipoTablaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LISTA PRODUCTOS");

        v_stockAnt.setEditable(false);
        v_stockAnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("STOCK");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLIENTE");

        v_cliente_dni_ruc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
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

        v_cliente_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(v_stockAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(v_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(v_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(v_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(v_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(v_cliente_dni_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(v_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_carrito)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(v_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(v_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(v_tipo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_stockAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(v_cliente_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(v_cliente_dni_ruc, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btn_vender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/images/moneda.jpg"))); // NOI18N
        btn_vender.setText("VENDER");
        btn_vender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btn_vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LISTA A COMPRAR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TOTAL");

        lbl_montoTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_montoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_montoTotal.setText("-------");

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "TIPO", "PRECIO U.", "CANT VENTA", "IGV TOTAL", "TOTAL SOLES"
            }
        ));
        jScrollPane3.setViewportView(TableVenta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_montoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_vender)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem6.setText("Editar Usuarios");
        jMenu1.add(jMenuItem6);

        jMenuItem1.setText("Registar Venta");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Reporte Venta");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Registrar producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Reporte producto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentaDialog vntDialog = new VentaDialog();
        vntDialog.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int row=tablaProducto.getSelectedRow();
        if (evt.getClickCount()==1) {
            JTable receptor=(JTable)evt.getSource();

            v_nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            String Producto_nombre=(v_nombre.getText());

            ventaDao.reporteProductoUnico(p, Producto_nombre);

            v_nombre.setText(p.getProducto_nombre());
            v_tipo.setText(p.getProducto_tipo());
            v_precio.setText(String.valueOf(p.getProducto_precio()));
            v_stockAnt.setText(String.valueOf(p.getProducto_stock()));
          
        }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void v_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_precioActionPerformed

    private void v_TipoTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_TipoTablaActionPerformed
        ReporteData();
    }//GEN-LAST:event_v_TipoTablaActionPerformed

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        //Hacemos el reporteCliente unico para validar si existe
        u.setDni_ruc(v_cliente_dni_ruc.getText());
        clienteDao.ReporteClienteUnico(u);
        //Aqui validamos si el Cliente existe o si la venta no se registrara en un cliente
        if((u.getNombre()+" "+u.getApellido()).equals(v_cliente_nombre.getText()) || v_cliente_nombre.getText().equals("")){
            if (TableVenta.getRowCount() > 0) {          
                RegistrarDetalleVenta();
                RegistrarDetalleCliente();
                LimpiarTableVenta();   
                lbl_montoTotal.setText(String.format("%.2f", Totalpagar*0 ));
                ReporteData();  
                //Enviamos un mensaje afirmando la venta exitosa
                JOptionPane.showMessageDialog(
                null, 
                "Venta realizada correctamente", 
                "Exito", 
                JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(null, "Noy productos en la venta");
            }
        }else{
            JOptionPane.showMessageDialog(
                null, 
                "El cliente no existe", 
                "Fallido", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        
 
    }//GEN-LAST:event_btn_venderActionPerformed

    private void v_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_stockActionPerformed
        LimpiarDatos();
        
        
        
    }//GEN-LAST:event_v_stockActionPerformed

    private void btn_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carritoActionPerformed
         if (!"".equals(v_stock.getText()) ) {
                if(Double.parseDouble(v_stock.getText())>0){
                  p.setProducto_nombre(v_nombre.getText());       
                    ventaDao.reporteProductoUnico(p); 

                    String nombreProducto   = p.getProducto_nombre();
                    String productoTipo     = p.getProducto_tipo();
                    double precioUnid       = p.getProducto_precio();
                    double cantVendida      = Double.parseDouble(v_stock.getText());
                    double igvTotal         =(precioUnid * cantVendida)*0.18;
                    double montoTotal       =precioUnid * cantVendida;
                    double stockAnt = Double.parseDouble(v_stockAnt.getText());
                    if (stockAnt >= cantVendida) {
                        contadorItem = contadorItem + 1;
                        tmp = (DefaultTableModel) TableVenta.getModel();
                        for (int i = 0; i < TableVenta.getRowCount(); i++) {
                            if (TableVenta.getValueAt(i, 0).equals(v_nombre.getText())) {
                                JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                                return;
                            }
                        }
                            System.out.println(nombreProducto);
                            System.out.println(productoTipo);
                            System.out.println(precioUnid);
                            System.out.println(cantVendida);
                            System.out.println(igvTotal);
                            System.out.println(montoTotal);



                            ArrayList lista = new ArrayList();
                            lista.add(contadorItem);
                            lista.add(nombreProducto);
                            lista.add(productoTipo);
                            lista.add(precioUnid);
                            lista.add(cantVendida);
                            lista.add(igvTotal);
                            lista.add(montoTotal);

                            Object[] O = new Object[6];
                            O[0] = lista.get(1);
                            O[1] = lista.get(2);
                            O[2] = lista.get(3);
                            O[3] = lista.get(4);
                            O[4] = lista.get(5);
                            O[5] = lista.get(6);
                            tmp.addRow(O);
                            TableVenta.setModel(tmp);
                            TotalPagar();
                            LimpiarDatos();
                    
                        
                        
                    } else {
                        JOptionPane.showMessageDialog(
                            null,
                            "Stock no disponible",
                            "Fallido",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                 
                }else{
                JOptionPane.showMessageDialog(
                       null,
                       "Ingrese un una cantidad Valida",
                       "Fallido",
                       JOptionPane.INFORMATION_MESSAGE);
                }
               
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Ingrese una cantidad",
                    "Fallido",
                    JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btn_carritoActionPerformed

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
   
    private void RegistrarDetalleVenta() {
      for (int i = 0; i < TableVenta.getRowCount(); i++) {
          String producto   = String.valueOf(TableVenta.getValueAt(i, 0).toString());
          String tipo       = String.valueOf(TableVenta.getValueAt(i, 1).toString());          
          double precioUnid = Double.parseDouble(TableVenta.getValueAt(i, 2).toString());
          double canVent       = Double.parseDouble(TableVenta.getValueAt(i, 3).toString());
          double igvTotal   = Double.parseDouble(TableVenta.getValueAt(i, 4 ).toString());
          double montoTotal   = Double.parseDouble(TableVenta.getValueAt(i, 5 ).toString());
          
          p.setVenta_Cliente(v_cliente_dni_ruc.getText());
          p.setProducto_nombre(producto);
          p.setProducto_tipo(tipo);
          p.setProducto_precio(precioUnid);
          p.setVenta_cantidad_vendida(canVent);
          p.setVenta_igv_total(igvTotal);
          p.setVenta_monto_total(montoTotal);             
          ventaDao.registrarVenta(p);
          
          ventaDao.reporteProductoUnico(p);  
          double stockActual = p.getProducto_stock()-canVent;
          p.setProducto_stock(stockActual);
          ventaDao.actualizarStock(p);
          
      }
    }
    
    private void RegistrarDetalleCliente() {
      for (int i = 0; i < TableVenta.getRowCount(); i++) {
          String producto   = String.valueOf(TableVenta.getValueAt(i, 0).toString());
          String tipo       = String.valueOf(TableVenta.getValueAt(i, 1).toString());          
          double precioUnid = Double.parseDouble(TableVenta.getValueAt(i, 2).toString());
          double canVent       = Double.parseDouble(TableVenta.getValueAt(i, 3).toString());
          double igvTotal   = Double.parseDouble(TableVenta.getValueAt(i, 4 ).toString());
          double montoTotal   = Double.parseDouble(TableVenta.getValueAt(i, 5 ).toString());
          
          //Enviamos el DNI al SET para hacer una consulta
          //Tambien extraemos los datos del cliente respecto al DNI
          u.setDni_ruc(v_cliente_dni_ruc.getText());
          clienteDao.ReporteClienteUnico(u);
          
          //Enviamos los datos de Producto y Registro Venta para poder registrar la venta
          p.setProducto_nombre(producto);
          p.setProducto_tipo(tipo);
          p.setProducto_precio(precioUnid);
          p.setVenta_cantidad_vendida(canVent);
          p.setVenta_igv_total(igvTotal);
          p.setVenta_monto_total(montoTotal);   
          
          //Aqui llamamos a un metodo de implUsuario para registrar la compra del cliente
          clienteDao.registrarVentaProductoCliente(u, p);
          
          ventaDao.reporteProductoUnico(p);          
      }
    }
    
    private void LimpiarTableVenta() {
        tmp = (DefaultTableModel) TableVenta.getModel();
        int fila = TableVenta.getRowCount();
        for (int i = 0; i < fila; i++) {
            tmp.removeRow(0);
        }
    }

    public void LimpiarDatos(){
        v_nombre.setText("");
        v_tipo.setText("");
        v_precio.setText("");
        v_stock.setText("");
        v_stockAnt.setText("");
    }
    private void TotalPagar() {
        Totalpagar = 0.00;
        int numFila = TableVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(TableVenta.getModel().getValueAt(i, 5)));
            Totalpagar = Totalpagar + cal;
        }
        lbl_montoTotal.setText(String.format("%.2f", Totalpagar));
    }
//    

    public void ReporteData(){
      Producto p = new Producto();
      p.setProducto_tipo(v_TipoTabla.getSelectedItem().toString());
      modelo = new DefaultTableModel();


      modelo.addColumn("Nombre");
      modelo.addColumn("Tipo");
      modelo.addColumn("Marca");
      modelo.addColumn("Precio");
      modelo.addColumn("Stock");

          for (Producto prod : productoDao.reporteProducto(p)) {
              Object[] fila = new Object[5];                 
              fila[0] = prod.getProducto_nombre();
              fila[1] = prod.getProducto_tipo();
              fila[2] = prod.getProducto_marca();
              fila[3] = prod.getProducto_precio();
              fila[4] = prod.getProducto_stock();
              modelo.addRow(fila);
          }
      tablaProducto.setModel(modelo);       
    }
  
    
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrarVentaDialog().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableVenta;
    public javax.swing.JButton btn_carrito;
    public javax.swing.JButton btn_vender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_montoTotal;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JComboBox<String> v_TipoTabla;
    private javax.swing.JTextField v_cliente_dni_ruc;
    private javax.swing.JTextField v_cliente_nombre;
    private javax.swing.JTextField v_nombre;
    private javax.swing.JTextField v_precio;
    private javax.swing.JTextField v_stock;
    private javax.swing.JTextField v_stockAnt;
    private javax.swing.JTextField v_tipo;
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
    class FondoPanelCrema extends JPanel{
           private Image imagen;

           @Override
           public void paint (Graphics g){
               imagen = new ImageIcon(getClass().getResource("/recursos/images/fondoCrema.png")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       } 
       class FondoPanelCrema2 extends JPanel{
           private Image imagen;

           @Override
           public void paint (Graphics g){
               imagen = new ImageIcon(getClass().getResource("/recursos/images/crema.jpg")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       }
  

    
}
