package gui.Registrar;




import gui.Menu.VentaDialog;
import entidades.Producto;
import entidades.Usuario;
import gui.login.LoginVentas;
import implementacion.implProducto;
import implementacion.implUsuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditarUsuarios extends javax.swing.JFrame {
//    implProducto productoDao = new implProducto();
    Producto p  = new Producto();
    Usuario u   = new Usuario();  
    FondoPanel fondo = new FondoPanel();
    DefaultTableModel  modelo;
    implUsuario usuarioDao = new implUsuario();

    public EditarUsuarios() {
        this.setContentPane(fondo);
        
//        u.setNombreUsuario(LoginVentas.MostrarLabel[0]);
//        u.setCategoria(LoginVentas.MostrarLabel[1]);
      
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        v_TipoTabla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        panelregistrar = new FondoMiniPanel();
        btn_registrar = new javax.swing.JButton();
        txf_edad = new javax.swing.JTextField();
        txf_apellido = new javax.swing.JTextField();
        txf_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_persona = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txf_nombreUsuario = new javax.swing.JTextField();
        btn_femenino = new javax.swing.JRadioButton();
        btn_masculino = new javax.swing.JRadioButton();
        txf_pasword = new javax.swing.JPasswordField();
        btn_cliente = new javax.swing.JRadioButton();
        btn_admin = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txf_dni_ruc = new javax.swing.JTextField();
        btn_registrar1 = new javax.swing.JButton();
        txf_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
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
        lbl_titulo.setText("EDITAR USUARIOS");

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

        v_TipoTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        v_TipoTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Personal", "Cliente" }));
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

        panelregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_registrar.setBackground(new java.awt.Color(0, 255, 102));
        btn_registrar.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        btn_registrar.setText("ACTUALIZAR");
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        txf_edad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txf_apellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txf_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txf_nombre.setCaretColor(new java.awt.Color(204, 204, 204));
        txf_nombre.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CATEGORIA");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI/RUC");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("APELLIDO");

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR USUARIO");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("SEXO");

        btn_persona.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(btn_persona);
        btn_persona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_persona.setForeground(new java.awt.Color(204, 204, 204));
        btn_persona.setText("personal");
        btn_persona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PASWORD");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("USUARIO");

        txf_nombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_femenino.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(btn_femenino);
        btn_femenino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_femenino.setForeground(new java.awt.Color(204, 204, 204));
        btn_femenino.setText("femenino");
        btn_femenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_masculino.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(btn_masculino);
        btn_masculino.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_masculino.setForeground(new java.awt.Color(204, 204, 204));
        btn_masculino.setText("masculino");
        btn_masculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txf_pasword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_cliente.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(btn_cliente);
        btn_cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cliente.setForeground(new java.awt.Color(204, 204, 204));
        btn_cliente.setText("cliente");
        btn_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_admin.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup2.add(btn_admin);
        btn_admin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_admin.setForeground(new java.awt.Color(204, 204, 204));
        btn_admin.setText("admin");
        btn_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("EDAD");

        txf_dni_ruc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_registrar1.setBackground(new java.awt.Color(0, 255, 102));
        btn_registrar1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        btn_registrar1.setText("ELIMINAR");
        btn_registrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1ActionPerformed(evt);
            }
        });

        txf_id.setEditable(false);
        txf_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txf_id.setCaretColor(new java.awt.Color(204, 204, 204));
        txf_id.setDisabledTextColor(new java.awt.Color(0, 0, 153));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ID SELECT");

        javax.swing.GroupLayout panelregistrarLayout = new javax.swing.GroupLayout(panelregistrar);
        panelregistrar.setLayout(panelregistrarLayout);
        panelregistrarLayout.setHorizontalGroup(
            panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelregistrarLayout.createSequentialGroup()
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelregistrarLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txf_nombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                                .addComponent(btn_persona)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txf_pasword, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txf_dni_ruc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelregistrarLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txf_apellido)
                                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                                .addComponent(btn_masculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txf_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelregistrarLayout.setVerticalGroup(
            panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelregistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_masculino)
                        .addComponent(btn_femenino)))
                .addGap(18, 18, 18)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_dni_ruc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_persona)
                    .addComponent(btn_cliente)
                    .addComponent(btn_admin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v_TipoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int row=tablaProducto.getSelectedRow();
             if (evt.getClickCount()==1) {
            JTable receptor=(JTable)evt.getSource();
            
            
            txf_id.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            u.setId(txf_id.getText());
            
            usuarioDao.reporteUsuarioUnico(u);
            
            txf_nombre.setText(u.getNombre());
            txf_apellido.setText(u.getApellido());
            txf_nombre.setText(u.getNombre());           
                if(u.getSexo().equals("M")){
                    btn_masculino.doClick();
                }
                if(u.getSexo().equals("F")){
                    btn_femenino.doClick();
                }
            txf_edad.setText(u.getEdad());
            txf_dni_ruc.setText(u.getDni_ruc());
                if(u.getCategoria().equals("Cliente")){
                    btn_cliente.doClick();
                }
                if(u.getCategoria().equals("Personal")){
                    btn_persona.doClick();
                }
                if(u.getCategoria().equals("Admin")){
                    btn_admin.doClick();
                }
            txf_nombreUsuario.setText(u.getNombreUsuario());
            txf_pasword.setText(u.getPasword());

            }
    }//GEN-LAST:event_tablaProductoMouseClicked

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

    private void btn_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1ActionPerformed
    if(!txf_id.getText().equals("")){
        EliminarUsu();
        LimpiarDatos();
        ReporteData();
        JOptionPane.showMessageDialog(null, 
            "Se Elimino correctamente", 
            "Exitoso", 
            JOptionPane.INFORMATION_MESSAGE);       
    }else{
        JOptionPane.showMessageDialog(null, 
            "Por favor seleccione un usuario", 
            "Fallido", 
            JOptionPane.INFORMATION_MESSAGE);   
    }
        
        
    }//GEN-LAST:event_btn_registrar1ActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(txf_nombre.getText().equals("") || txf_apellido.getText().equals("") || txf_edad.getText().equals("") || txf_nombreUsuario.getText().equals("") || txf_pasword.getText().equals("")|| txf_dni_ruc.getText().equals("")){
            JOptionPane.showMessageDialog(
                null,
                "No se Actualizo",
                "Error/Advertencia",
                JOptionPane.INFORMATION_MESSAGE);

        }else{
            ActualizarDatos();
            ReporteData();
        }
    }//GEN-LAST:event_btn_registrarActionPerformed
    
    public void ActualizarDatos(){
        u.setId(txf_id.getText());
        u.setNombre(txf_nombre.getText());
        u.setApellido(txf_apellido.getText());
        if(btn_femenino.isSelected()==true){  
        u.setSexo("F");
        }
        if(btn_masculino.isSelected()==true){  
        u.setSexo("M");
        }  
        u.setEdad(txf_edad.getText());   
        u.setDni_ruc(txf_dni_ruc.getText());
        if(btn_admin.isSelected()==true){  
        u.setCategoria("Admin");
        }
        if(btn_persona.isSelected()==true){  
        u.setCategoria("Personal");
        }  
        if(btn_cliente.isSelected()==true){  
        u.setCategoria("Cliente");
        }
        u.setNombreUsuario(txf_nombreUsuario.getText());
        u.setPasword(txf_pasword.getText());
  
        usuarioDao.actualizarUsuario(u);
        LimpiarDatos();
        
        JOptionPane.showMessageDialog(
           null,
           "Se actualizo con Exito", 
           "Actualizar",
           JOptionPane.INFORMATION_MESSAGE);   
    }
    
    public void EliminarUsu(){
        u.setId(txf_id.getText());
        usuarioDao.eliminarRegistroUsuario(u);
    }
    public void ReporteData(){
        Usuario u = new Usuario();
        u.setCategoria(v_TipoTabla.getSelectedItem().toString());
        modelo = new DefaultTableModel();

        
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("categoria");
        modelo.addColumn("Usuario");
        modelo.addColumn("Password");
        

            for (Usuario usu : usuarioDao.reporteUsuarios(u)) {
                Object[] fila = new Object[9];
                fila[0] = usu.getId();
                fila[1] = usu.getDni_ruc();
                fila[2] = usu.getNombre();
                fila[3] = usu.getApellido();
                fila[4] = usu.getSexo();
                fila[5] = usu.getEdad();
                fila[6] = usu.getCategoria();
                fila[7] = usu.getNombreUsuario();
                fila[8] = usu.getPasword();
                modelo.addRow(fila);
            }
        tablaProducto.setModel(modelo);       
    }
    
    
    public void LimpiarDatos(){
        txf_nombre.setText("");
        txf_apellido.setText("");
        txf_edad.setText("");
        txf_dni_ruc.setText("");
        txf_nombreUsuario.setText("");
        txf_pasword.setText("");
  
    }
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditarUsuarios().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_admin;
    private javax.swing.JRadioButton btn_cliente;
    private javax.swing.JRadioButton btn_femenino;
    private javax.swing.JRadioButton btn_masculino;
    private javax.swing.JRadioButton btn_persona;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panelregistrar;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_dni_ruc;
    private javax.swing.JTextField txf_edad;
    private javax.swing.JTextField txf_id;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_nombreUsuario;
    private javax.swing.JPasswordField txf_pasword;
    private javax.swing.JComboBox<String> v_TipoTabla;
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
               imagen = new ImageIcon(getClass().getResource("/recursos/images/fondo2.jpeg")).getImage();
               g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
               setOpaque(false);
               super.paint(g);
           }
       } 

    
}
