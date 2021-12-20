package gui.Registrar;


import entidades.Usuario;
import gui.login.LoginVentas;
import implementacion.implUsuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RegistrarUsuarioDialog extends javax.swing.JFrame {
    Usuario u = new Usuario();
    implUsuario implUsu = new implUsuario();
    FondoPanel fondo = new FondoPanel();
    String nombre, apellido, sexo, edad, dni, categoria, nombre_usuario, pasword;
 
    public RegistrarUsuarioDialog() {
        this.setContentPane(fondo);
        initComponents();
        panelconfirmacion.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panelregistrar = new FondoPanel();
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
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txf_dni_ruc = new javax.swing.JTextField();
        panelconfirmacion = new FondoPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txf_usuarioinit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txf_paswortinit = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(521, 580));
        getContentPane().setLayout(null);

        panelregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_registrar.setBackground(new java.awt.Color(0, 255, 102));
        btn_registrar.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        btn_registrar.setText("REGISTRAR");
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

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("volver");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("EDAD");

        txf_dni_ruc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelregistrarLayout = new javax.swing.GroupLayout(panelregistrar);
        panelregistrar.setLayout(panelregistrarLayout);
        panelregistrarLayout.setHorizontalGroup(
            panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelregistrarLayout.createSequentialGroup()
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txf_nombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelregistrarLayout.createSequentialGroup()
                                    .addComponent(btn_persona)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txf_pasword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelregistrarLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_dni_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txf_apellido)
                            .addGroup(panelregistrarLayout.createSequentialGroup()
                                .addComponent(btn_masculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_femenino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelregistrarLayout.setVerticalGroup(
            panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelregistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_femenino)
                            .addComponent(btn_masculino))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_dni_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(panelregistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelregistrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(panelregistrar);
        panelregistrar.setBounds(40, 20, 430, 490);

        panelconfirmacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INTRODUSCA UN USARIO CATEGORIA ");

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" ADMIN PARA REGISTRAR OTRO ADMIN");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("USUARIO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PASSWORD");

        jButton2.setBackground(new java.awt.Color(0, 255, 102));
        jButton2.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("volver");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelconfirmacionLayout = new javax.swing.GroupLayout(panelconfirmacion);
        panelconfirmacion.setLayout(panelconfirmacionLayout);
        panelconfirmacionLayout.setHorizontalGroup(
            panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfirmacionLayout.createSequentialGroup()
                .addGroup(panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelconfirmacionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelconfirmacionLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelconfirmacionLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelconfirmacionLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addComponent(txf_usuarioinit, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txf_paswortinit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelconfirmacionLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        panelconfirmacionLayout.setVerticalGroup(
            panelconfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconfirmacionLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txf_usuarioinit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_paswortinit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(panelconfirmacion);
        panelconfirmacion.setBounds(20, 10, 470, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(txf_nombre.getText().equals("") || txf_apellido.getText().equals("") || txf_edad.getText().equals("") || txf_nombreUsuario.getText().equals("") || txf_pasword.getText().equals("")|| txf_dni_ruc.getText().equals("")){
             JOptionPane.showMessageDialog(
               null,
               "No se registro", 
               "Error/Advertencia",
               JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            Registro();
        }  
        
    }//GEN-LAST:event_btn_registrarActionPerformed

       public void Registro(){
        nombre=(txf_nombre.getText());
        apellido=(txf_apellido.getText());      
        if(btn_femenino.isSelected()==true){  
        sexo=("F");
        }
        if(btn_masculino.isSelected()==true){  
        sexo=("M");
        }  
        edad=(txf_edad.getText());   
        dni=(txf_dni_ruc.getText());
        
        if(btn_admin.isSelected()==true){  
        categoria=("Admin");
        }
        if(btn_persona.isSelected()==true){  
        categoria=("Personal");
        }  
        if(btn_cliente.isSelected()==true){  
        categoria=("Cliente");
        }
        nombre_usuario=(txf_nombreUsuario.getText());
        pasword=(txf_pasword.getText());
 
        if(btn_admin.isSelected()==false ){  
            implUsu.registrarUsuario(nombre, apellido, sexo, edad, dni, categoria, nombre_usuario, pasword);
            LimpiarDatos();   
            JOptionPane.showMessageDialog(
               null,
               "Se registro con Exito", 
               "Registro",
               JOptionPane.INFORMATION_MESSAGE);
        }       
        if(btn_admin.isSelected()==true ) {  
            panelregistrar.setVisible(false);
            panelconfirmacion.setVisible(true);
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        implUsuario ip= new implUsuario();
        Usuario u   = new Usuario();

        if(!txf_usuarioinit.getText().equals("") || !txf_paswortinit.getText().equals("")){
        u=ip.LoginReportePersonaUnico(txf_usuarioinit.getText(), txf_paswortinit.getText(), "Admin");
        
        }

        System.out.println("estoy ´probandoooo: "+txf_usuarioinit.getText()+"-"+txf_paswortinit.getText());
        if(u.isAcceso()){

            System.out.println("ingreso al sistema");
                implUsu.registrarUsuario(nombre, apellido, sexo, edad, dni, categoria, nombre_usuario, pasword);
                LimpiarDatos();   
                JOptionPane.showMessageDialog(
                    null,
                    "Se registro con Exito un admin", 
                    "Registro",
                    JOptionPane.INFORMATION_MESSAGE);
            panelregistrar.setVisible(true);
            panelconfirmacion.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(
                    null,
                    "Datos incorrectos", 
                    "Error/advertencia",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelregistrar.setVisible(true);
        panelconfirmacion.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoginVentas lg = new LoginVentas();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void LimpiarDatos(){
        txf_nombre.setText("");
        txf_apellido.setText("");
        txf_edad.setText("");
        txf_nombreUsuario.setText("");
        txf_pasword.setText("");
    }
// 
//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrarUsuarioDialog().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelconfirmacion;
    private javax.swing.JPanel panelregistrar;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_dni_ruc;
    private javax.swing.JTextField txf_edad;
    private javax.swing.JTextField txf_nombre;
    private javax.swing.JTextField txf_nombreUsuario;
    private javax.swing.JPasswordField txf_pasword;
    private javax.swing.JPasswordField txf_paswortinit;
    private javax.swing.JTextField txf_usuarioinit;
    // End of variables declaration//GEN-END:variables
   class FondoPanel extends JPanel{
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
