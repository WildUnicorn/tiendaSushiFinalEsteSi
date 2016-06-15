package gui;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import model.*;

/**
 *
 * @author Piaa FernanDaa
 */
public class App extends javax.swing.JFrame {

    private Data d;
    private String passAdm = "12345";
    private String usuAdm = "admi";
    private String rutUsuario;
    public App() {
        initComponents();
        setLocationRelativeTo(null);

        try {
            d = new Data();
            cargarCombos();

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPedido = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        tab2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboSaboresSushi = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        spnUniSushi = new javax.swing.JSpinner();
        btnFinalizar1 = new javax.swing.JButton();
        lblImgSushi = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cboBebidas = new javax.swing.JComboBox();
        cboJugos = new javax.swing.JComboBox();
        cboCervezas = new javax.swing.JComboBox();
        cboOtros = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        spnBebida = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        spnJugos = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        spnCervezas = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        spnOtros = new javax.swing.JSpinner();
        btnFinalizar3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cboPapas = new javax.swing.JComboBox();
        cboEmpanadas = new javax.swing.JComboBox();
        cboGyosas = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblAgregados = new javax.swing.JLabel();
        btnFinalizar2 = new javax.swing.JButton();
        spnUniEmpanadas = new javax.swing.JSpinner();
        spnUniGyosas = new javax.swing.JSpinner();
        spnUniPapas2 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();
        jAdmin = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEliminarAdmi = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabProductoAdmi = new javax.swing.JTable();
        btnEliminarAdmin = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtidEliminar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAgregarAdmi = new javax.swing.JTextField();
        txtPrecioAgregarAdmi = new javax.swing.JTextField();
        btnAgregarAdmi = new javax.swing.JButton();
        cboTipoAdmi = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtUsuAdmi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnIngresarAdmi = new javax.swing.JButton();
        txtPassAdmi = new javax.swing.JPasswordField();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        bgMedioPago = new javax.swing.ButtonGroup();
        jUsuario = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtNombreUsuarioNuevo = new javax.swing.JTextField();
        txtApellidoUsuarioNuevo = new javax.swing.JTextField();
        txtTelefonoUsuarioNuevo = new javax.swing.JTextField();
        txtDireccionUsuarioNuevo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtRutUsuarioNuevo = new javax.swing.JTextField();
        btnCrearUsuarioNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtClaveUsuarioNuevo = new javax.swing.JPasswordField();
        jClienteAntiguo = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsuarioInicio = new javax.swing.JTextField();
        txtClaveInicio = new javax.swing.JPasswordField();
        btnIniciarSesionUsuario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPedido = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnIniciarSesionU = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arma tu pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 2, 12))); // NOI18N
        jPanel2.setName("Pedido"); // NOI18N

        jLabel7.setText("Sabores: ");

        cboSaboresSushi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        cboSaboresSushi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSaboresSushiActionPerformed(evt);
            }
        });

        jLabel11.setText("Unidades:");

        spnUniSushi.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniSushi.setToolTipText("");
        spnUniSushi.setRequestFocusEnabled(false);
        spnUniSushi.setValue(0);

        btnFinalizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/finalizarCompra.png"))); // NOI18N
        btnFinalizar1.setText("Finalizar compra");
        btnFinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar1ActionPerformed(evt);
            }
        });

        lblImgSushi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboSaboresSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(20, 20, 20)
                                        .addComponent(spnUniSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblImgSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnFinalizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImgSushi, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(spnUniSushi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cboSaboresSushi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnFinalizar1)
                .addGap(48, 48, 48))
        );

        tab2.addTab("SUSHI", jPanel4);

        jLabel15.setText("Bebidas:");

        jLabel16.setText("Jugos:");

        jLabel17.setText("Otros:");

        jLabel18.setText("Cervezas:");

        cboBebidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboJugos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboCervezas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));

        cboOtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cboOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOtrosActionPerformed(evt);
            }
        });

        jLabel35.setText("Unidades:");

        spnBebida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnBebida.setToolTipText("");

        jLabel36.setText("Unidades:");

        spnJugos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnJugos.setToolTipText("");

        jLabel37.setText("Unidades:");

        spnCervezas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnCervezas.setToolTipText("");

        jLabel38.setText("Unidades:");

        spnOtros.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnOtros.setToolTipText("");

        btnFinalizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/finalizarCompra.png"))); // NOI18N
        btnFinalizar3.setText("Finalizar compra");
        btnFinalizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCervezas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboJugos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboOtros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(345, 345, 345))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(37, 37, 37)
                        .addComponent(cboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnJugos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnCervezas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnFinalizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cboBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(spnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cboJugos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(spnJugos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cboCervezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(spnCervezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(spnOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnFinalizar3)
                .addGap(70, 70, 70))
        );

        tab2.addTab("BEBIDAS", jPanel6);

        cboPapas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        cboPapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPapasActionPerformed(evt);
            }
        });

        cboEmpanadas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        cboEmpanadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpanadasActionPerformed(evt);
            }
        });

        cboGyosas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        cboGyosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGyosasActionPerformed(evt);
            }
        });

        jLabel32.setText("Papas Fritas:");

        jLabel33.setText("Empanadas:");

        jLabel34.setText("Gyosas: ");

        lblAgregados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFinalizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/finalizarCompra.png"))); // NOI18N
        btnFinalizar2.setText("Finalizar compra");
        btnFinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar2ActionPerformed(evt);
            }
        });

        spnUniEmpanadas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniEmpanadas.setToolTipText("");

        spnUniGyosas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniGyosas.setToolTipText("");

        spnUniPapas2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnUniPapas2.setToolTipText("");

        jLabel12.setText("Unidades:");

        jLabel13.setText("Unidades:");

        jLabel14.setText("Unidades:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnUniEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnUniGyosas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnUniPapas2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboPapas, 0, 223, Short.MAX_VALUE)
                    .addComponent(cboEmpanadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboGyosas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAgregados, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(cboPapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(spnUniPapas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(cboEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(spnUniEmpanadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboGyosas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAgregados, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnUniGyosas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(35, 35, 35)
                .addComponent(btnFinalizar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab2.addTab("AGREGADOS", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N

        jMSalir.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jMSalir);

        jMenuBar2.add(jMenu2);

        jPedido.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jPedidoLayout = new javax.swing.GroupLayout(jPedido.getContentPane());
        jPedido.getContentPane().setLayout(jPedidoLayout);
        jPedidoLayout.setHorizontalGroup(
            jPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPedidoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 117, Short.MAX_VALUE))
        );
        jPedidoLayout.setVerticalGroup(
            jPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar producto"));

        jLabel1.setText("Nombre:");

        txtEliminarAdmi.setEnabled(false);
        txtEliminarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarAdmiActionPerformed(evt);
            }
        });
        txtEliminarAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEliminarAdmiKeyReleased(evt);
            }
        });

        tabProductoAdmi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabProductoAdmi.setEnabled(false);
        tabProductoAdmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabProductoAdmiMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tabProductoAdmi);

        btnEliminarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        btnEliminarAdmin.setText("Eliminar");
        btnEliminarAdmin.setEnabled(false);
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });

        jLabel31.setText("ID:");

        txtidEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEliminarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEliminarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtidEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarAdmin)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar producto"));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel4.setText("Tipo: ");

        txtNombreAgregarAdmi.setEnabled(false);

        txtPrecioAgregarAdmi.setEnabled(false);

        btnAgregarAdmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarse.png"))); // NOI18N
        btnAgregarAdmi.setText("Agregar");
        btnAgregarAdmi.setEnabled(false);
        btnAgregarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdmiActionPerformed(evt);
            }
        });

        cboTipoAdmi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        cboTipoAdmi.setEnabled(false);
        cboTipoAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoAdmiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioAgregarAdmi, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(cboTipoAdmi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100)
                        .addComponent(txtNombreAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioAgregarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAdmi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboTipoAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Usuario:");

        jLabel8.setText("Contraseña: ");

        btnIngresarAdmi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicioSesion.png"))); // NOI18N
        btnIngresarAdmi.setText("Ingresar");
        btnIngresarAdmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnIngresarAdmiMouseReleased(evt);
            }
        });
        btnIngresarAdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdmiActionPerformed(evt);
            }
        });

        txtPassAdmi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassAdmiKeyReleased(evt);
            }
        });

        jMenu4.setText("Archivo");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar4.add(jMenu4);

        jAdmin.setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout jAdminLayout = new javax.swing.GroupLayout(jAdmin.getContentPane());
        jAdmin.getContentPane().setLayout(jAdminLayout);
        jAdminLayout.setHorizontalGroup(
            jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminLayout.createSequentialGroup()
                .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jAdminLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIngresarAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jAdminLayout.setVerticalGroup(
            jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnIngresarAdmi)
                    .addComponent(txtPassAdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jUsuario.setMinimumSize(new java.awt.Dimension(455, 443));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo cliente"));
        jPanel14.setMinimumSize(new java.awt.Dimension(450, 460));
        jPanel14.setName(""); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicioSesion.png"))); // NOI18N
        jLabel29.setText("Nombre:");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicioSesion.png"))); // NOI18N
        jLabel39.setText("Apellido:");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/telefono.png"))); // NOI18N
        jLabel40.setText("Telefono:");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/direccion.png"))); // NOI18N
        jLabel41.setText("Direccion:");

        txtNombreUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreUsuarioNuevoKeyReleased(evt);
            }
        });

        txtApellidoUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoUsuarioNuevoKeyReleased(evt);
            }
        });

        txtTelefonoUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoUsuarioNuevoActionPerformed(evt);
            }
        });
        txtTelefonoUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoUsuarioNuevoKeyReleased(evt);
            }
        });

        txtDireccionUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionUsuarioNuevoKeyReleased(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/editar.png"))); // NOI18N
        jLabel44.setText("Rut:");

        txtRutUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutUsuarioNuevoActionPerformed(evt);
            }
        });
        txtRutUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutUsuarioNuevoKeyReleased(evt);
            }
        });

        btnCrearUsuarioNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarse.png"))); // NOI18N
        btnCrearUsuarioNuevo.setText("Crear usuario");
        btnCrearUsuarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioNuevoActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        jLabel5.setText("Clave:");

        txtClaveUsuarioNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveUsuarioNuevoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel44))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUsuarioNuevo)
                                    .addComponent(txtTelefonoUsuarioNuevo)
                                    .addComponent(txtRutUsuarioNuevo)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(23, 23, 23)
                                .addComponent(txtApellidoUsuarioNuevo))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionUsuarioNuevo)
                                    .addComponent(txtClaveUsuarioNuevo)))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnCrearUsuarioNuevo)
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRutUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtNombreUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtApellidoUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtTelefonoUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtDireccionUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtClaveUsuarioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCrearUsuarioNuevo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jUsuarioLayout = new javax.swing.GroupLayout(jUsuario.getContentPane());
        jUsuario.getContentPane().setLayout(jUsuarioLayout);
        jUsuarioLayout.setHorizontalGroup(
            jUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jUsuarioLayout.setVerticalGroup(
            jUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jClienteAntiguo.setTitle("Inicio Sesion");
        jClienteAntiguo.setMinimumSize(new java.awt.Dimension(400, 300));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicioSesion.png"))); // NOI18N
        jLabel9.setText("Rut Usuario:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        jLabel10.setText("Clave:");

        txtClaveInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveInicioKeyReleased(evt);
            }
        });

        btnIniciarSesionUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/finalizarCompra.png"))); // NOI18N
        btnIniciarSesionUsuario.setText("Iniciar sesion");
        btnIniciarSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jClienteAntiguoLayout = new javax.swing.GroupLayout(jClienteAntiguo.getContentPane());
        jClienteAntiguo.getContentPane().setLayout(jClienteAntiguoLayout);
        jClienteAntiguoLayout.setHorizontalGroup(
            jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jClienteAntiguoLayout.createSequentialGroup()
                .addGroup(jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jClienteAntiguoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtClaveInicio)))
                    .addGroup(jClienteAntiguoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnIniciarSesionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jClienteAntiguoLayout.setVerticalGroup(
            jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jClienteAntiguoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUsuarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jClienteAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClaveInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnIniciarSesionUsuario)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        btnPedido.setBackground(new java.awt.Color(255, 51, 153));
        btnPedido.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logoPedido.jpg"))); // NOI18N
        btnPedido.setEnabled(false);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        lblImagen.setBackground(new java.awt.Color(255, 204, 153));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.jpg"))); // NOI18N

        txtDesc.setEditable(false);
        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Century Gothic", 2, 13)); // NOI18N
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setText("Ven a maravillarte con tu sushi favorito, tenemos deliveriy para que puedas disfrutar en tu hogar de nuestros deliciosos productos! Hecha un vistazo a la variedad de sabores que te ofrecemos. Sabemos que te van a encantar...");
        jScrollPane1.setViewportView(txtDesc);

        btnIniciarSesionU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicioSesion.png"))); // NOI18N
        btnIniciarSesionU.setText("Iniciar sesion");
        btnIniciarSesionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionUActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/registrarse.png"))); // NOI18N
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesionU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnIniciarSesionU)
                        .addGap(31, 31, 31)
                        .addComponent(btnRegistrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/admi.png"))); // NOI18N
        jMenuItem1.setText("Ingresar como Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        jPedido.setVisible(true);
        jPedido.setBounds(0, 0, 650, 580);
        jPedido.setLocationRelativeTo(null);
   
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jAdmin.setVisible(true);
        jAdmin.setBounds(0, 0, 700, 600);
        jAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        jPedido.setVisible(false);
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jAdmin.setVisible(false);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnIngresarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdmiActionPerformed
       
        if (txtUsuAdmi.equals(usuAdm) && txtPassAdmi.getText().equals(passAdm)) {
            
            try {
                txtEliminarAdmi.setEnabled(true);
                txtNombreAgregarAdmi.setEnabled(true);
                txtPrecioAgregarAdmi.setEnabled(true);
                tabProductoAdmi.setEnabled(true);
                btnAgregarAdmi.setEnabled(true);
                btnEliminarAdmin.setEnabled(true);
                cboTipoAdmi.setEnabled(true);
                txtPassAdmi.setText(null);
                txtUsuAdmi.setText(null);
                cargarTablaProducto(d.getProductos());
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(
                    jAdmin,
                    "Datos de usuario incorrectos",
                    "Error en inicio de sesion",
                    ERROR_MESSAGE
            );
            txtPassAdmi.setText(null);
            txtUsuAdmi.setText(null);
            txtUsuAdmi.requestFocus();
        }
    }//GEN-LAST:event_btnIngresarAdmiActionPerformed

    private void btnIngresarAdmiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarAdmiMouseReleased
    }//GEN-LAST:event_btnIngresarAdmiMouseReleased

    private void cboOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOtrosActionPerformed
    }//GEN-LAST:event_cboOtrosActionPerformed

    private void txtEliminarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarAdmiActionPerformed
        try {
            String filtro = txtEliminarAdmi.getText();
            List<Producto> lista = d.BuscarProducto(filtro);
            cargarTablaProducto(lista);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEliminarAdmiActionPerformed

    private void btnAgregarAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdmiActionPerformed
        try {
            Producto p = new Producto();

            p.setNombre(txtNombreAgregarAdmi.getText());

            String precioStr = txtPrecioAgregarAdmi.getText();
            int precio = Integer.parseInt(precioStr);

            Tipo t = (Tipo) cboTipoAdmi.getSelectedItem();
            int idTipo = t.getId();

            p.setPrecio(precio);
            p.setTipo(idTipo);

            d.crearProducto(p);
            txtNombreAgregarAdmi.setText(null);
            txtPrecioAgregarAdmi.setText(null);
            cboTipoAdmi.setSelectedIndex(0);

            cargarTablaProducto(d.getProductos());
            JOptionPane.showMessageDialog(jAdmin, "Producto Agregado con éxito!");

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarAdmiActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        try {
            String strId = txtidEliminar.getText();
            int id = Integer.parseInt(strId);

            d.eliminarProducto(id);

            cargarTablaProducto(d.getProductos());
            JOptionPane.showConfirmDialog(jAdmin, "Eliminar " + txtEliminarAdmi.getText() + "?");
            txtEliminarAdmi.setText(null);
            txtidEliminar.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

    private void btnFinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar1ActionPerformed
        try {
             Cliente cl = d.buscarClienteRut(rutUsuario);
             total();
             
            JOptionPane.showMessageDialog(jPedido, "El pedido se enviara a: "+cl.getDireccion()
            +"\n periodo maximo de entrega: 30 min\nTotal:"+total()+"Gracias por su compra!");
            spnBebida.setValue(0);
            spnCervezas.setValue(0);
            spnJugos.setValue(0);
            spnOtros.setValue(0);
            spnUniEmpanadas.setValue(0);
            spnUniGyosas.setValue(0);
            spnUniPapas2.setValue(0);
            spnUniSushi.setValue(0);
            cboBebidas.setSelectedIndex(0);
            cboCervezas.setSelectedIndex(0);
            cboEmpanadas.setSelectedIndex(0);
            cboGyosas.setSelectedIndex(0);
            cboJugos.setSelectedIndex(0);
            cboOtros.setSelectedIndex(0);
            cboPapas.setSelectedIndex(0);
            cboSaboresSushi.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPedido, "Error al procesar el pedido");
        }
    }//GEN-LAST:event_btnFinalizar1ActionPerformed

    private void btnFinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar2ActionPerformed
        try {
            
             Cliente cl = d.buscarClienteRut(rutUsuario);
             total();
             
            JOptionPane.showMessageDialog(jPedido, "El pedido se enviara a: "+cl.getDireccion()
            +"\n periodo maximo de entrega: 30 min\nTotal:"+total()+"Gracias por su compra!");
            spnBebida.setValue(0);
            spnCervezas.setValue(0);
            spnJugos.setValue(0);
            spnOtros.setValue(0);
            spnUniEmpanadas.setValue(0);
            spnUniGyosas.setValue(0);
            spnUniPapas2.setValue(0);
            spnUniSushi.setValue(0);
            cboBebidas.setSelectedIndex(0);
            cboCervezas.setSelectedIndex(0);
            cboEmpanadas.setSelectedIndex(0);
            cboGyosas.setSelectedIndex(0);
            cboJugos.setSelectedIndex(0);
            cboOtros.setSelectedIndex(0);
            cboPapas.setSelectedIndex(0);
            cboSaboresSushi.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPedido, "Error al procesar el pedido");
        }
    }//GEN-LAST:event_btnFinalizar2ActionPerformed

    private void btnFinalizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar3ActionPerformed
        try {
            
             Cliente cl = d.buscarClienteRut(rutUsuario);
             total();
             
            JOptionPane.showMessageDialog(jPedido, "El pedido se enviara a: "+cl.getDireccion()
            +"\n periodo maximo de entrega: 30 min\nTotal:"+total()+"Gracias por su compra!");
            spnBebida.setValue(0);
            spnCervezas.setValue(0);
            spnJugos.setValue(0);
            spnOtros.setValue(0);
            spnUniEmpanadas.setValue(0);
            spnUniGyosas.setValue(0);
            spnUniPapas2.setValue(0);
            spnUniSushi.setValue(0);
            cboBebidas.setSelectedIndex(0);
            cboCervezas.setSelectedIndex(0);
            cboEmpanadas.setSelectedIndex(0);
            cboGyosas.setSelectedIndex(0);
            cboJugos.setSelectedIndex(0);
            cboOtros.setSelectedIndex(0);
            cboPapas.setSelectedIndex(0);
            cboSaboresSushi.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jPedido, "Error al procesar el pedido");
        }
    }//GEN-LAST:event_btnFinalizar3ActionPerformed

    private void txtEliminarAdmiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarAdmiKeyReleased
        try {
            String filtro = txtEliminarAdmi.getText();
            List<Producto> lista = d.BuscarProducto(filtro);
            cargarTablaProducto(lista);
            txtidEliminar.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtEliminarAdmiKeyReleased

    private void tabProductoAdmiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProductoAdmiMouseReleased
        if (evt.getClickCount() == 2) {
            try {
                int fila = tabProductoAdmi.getSelectedRow();
                String strId = tabProductoAdmi.getValueAt(fila, 0).toString();
                int id = Integer.parseInt(strId);

                Producto p = d.getProductoPorId(id);

                txtidEliminar.setText(Integer.toString(p.getId()));
                txtEliminarAdmi.setText(p.getNombre());
                txtidEliminar.setEditable(false);
                txtEliminarAdmi.setEditable(false);
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_tabProductoAdmiMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtEliminarAdmi.setText(null);
        txtidEliminar.setText(null);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtidEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEliminarActionPerformed

    private void cboTipoAdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoAdmiActionPerformed

    }//GEN-LAST:event_cboTipoAdmiActionPerformed

    private void txtPassAdmiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassAdmiKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarAdmi.doClick();
        }
    }//GEN-LAST:event_txtPassAdmiKeyReleased

    private void cboSaboresSushiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSaboresSushiActionPerformed

        if (cboSaboresSushi.getSelectedIndex() == 1) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/camaronPalta.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 2) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/camaronTempura.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 3) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/camaronCibulette.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 4) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/kanikamaPalta.png"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 5) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/kanikamaTempura.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 6) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/kanikamaCibulette.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 7) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/salmonPalta.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 8) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/salmonTempura.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 9) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/SalmonCibulette.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 10) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/polloPalta.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 11) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/polloTempura.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 12) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/polloCibulette.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 13) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/pandaRoll.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 14) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi17_1.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 15) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi18_1.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 16) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi10_1.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 17) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi16_2.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboSaboresSushi.getSelectedIndex() == 18) {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/hamburgesa.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        } else {
            lblImgSushi.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi.jpg"))
                    .getImage().getScaledInstance(lblImgSushi.getWidth(), lblImgSushi.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_cboSaboresSushiActionPerformed

    private void cboPapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPapasActionPerformed
        if (cboPapas.getSelectedIndex() == 1) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/papasPequeñas.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboPapas.getSelectedIndex() == 2) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/papasMedianas.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboPapas.getSelectedIndex() == 3) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/papasFamiliares.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboPapas.getSelectedIndex() == 4) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/papasMega.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_cboPapasActionPerformed

    private void cboEmpanadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpanadasActionPerformed
        if (cboEmpanadas.getSelectedIndex() == 1) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/4empanadas.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboEmpanadas.getSelectedIndex() == 2) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/8empanadas.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboEmpanadas.getSelectedIndex() == 3) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/12empanadas.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_cboEmpanadasActionPerformed

    private void cboGyosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGyosasActionPerformed
        if (cboGyosas.getSelectedIndex() == 1) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/arrollado.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboGyosas.getSelectedIndex() == 2) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/6gyosasPollo.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboGyosas.getSelectedIndex() == 3) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/12gyosasPollo.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboGyosas.getSelectedIndex() == 4) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/6gyosasCerdo.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else if (cboGyosas.getSelectedIndex() == 5) {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/12gyosasCerdo.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        } else {
            lblAgregados.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                    .getResource("/recursos/sushi.jpg"))
                    .getImage().getScaledInstance(lblAgregados.getWidth(), lblAgregados.getHeight(), Image.SCALE_DEFAULT)));

        }
    }//GEN-LAST:event_cboGyosasActionPerformed

    private void txtTelefonoUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoUsuarioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoUsuarioNuevoActionPerformed

    private void txtRutUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (d.isRutRegistrado(txtRutUsuarioNuevo.getText()) == true ) {
                    JOptionPane.showMessageDialog(
                            jUsuario,
                            "El rut ya se encuentra registrado\n Ingrese un rut Direfente",
                            "Usuario ya existente",
                            ERROR_MESSAGE);
                    txtRutUsuarioNuevo.setText(null);
                    txtRutUsuarioNuevo.requestFocus();

                } else {
                    txtNombreUsuarioNuevo.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtRutUsuarioNuevoKeyReleased

    private void txtRutUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutUsuarioNuevoActionPerformed

    }//GEN-LAST:event_txtRutUsuarioNuevoActionPerformed

    private void txtNombreUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellidoUsuarioNuevo.requestFocus();
        }
    }//GEN-LAST:event_txtNombreUsuarioNuevoKeyReleased

    private void txtApellidoUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefonoUsuarioNuevo.requestFocus();
        }
    }//GEN-LAST:event_txtApellidoUsuarioNuevoKeyReleased

    private void txtTelefonoUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccionUsuarioNuevo.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoUsuarioNuevoKeyReleased

    private void txtDireccionUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClaveUsuarioNuevo.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionUsuarioNuevoKeyReleased

    private void btnCrearUsuarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioNuevoActionPerformed

        try {
            Cliente cl = new Cliente();

            cl.setNombre(txtNombreUsuarioNuevo.getText());

            cl.setApellido(txtApellidoUsuarioNuevo.getText());

            int telefono = Integer.parseInt(txtTelefonoUsuarioNuevo.getText());
            cl.setTelefono(telefono);

            cl.setDireccion(txtDireccionUsuarioNuevo.getText());

            cl.setRut(txtRutUsuarioNuevo.getText());

            cl.setClave(txtClaveUsuarioNuevo.getText());

            d.agregarCliente(cl);

            txtRutUsuarioNuevo.setText(null);
            txtNombreUsuarioNuevo.setText(null);
            txtApellidoUsuarioNuevo.setText(null);
            txtTelefonoUsuarioNuevo.setText(null);
            txtDireccionUsuarioNuevo.setText(null);
            txtClaveUsuarioNuevo.setText(null);
            
            JOptionPane.showMessageDialog(jUsuario, "Usuario creado con exito!");
            jUsuario.setVisible(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(jUsuario, "Error al agregar un nuevo usuario");

        }

    }//GEN-LAST:event_btnCrearUsuarioNuevoActionPerformed

    private void btnIniciarSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionUsuarioActionPerformed
        try {            
            if (d.isRegistrado(txtUsuarioInicio.getText(), txtClaveInicio.getText())) {
                rutUsuario = txtUsuarioInicio.getText();
                
                btnPedido.setEnabled(true);
                txtUsuarioInicio.setText(null);
                txtClaveInicio.setText(null);

                jClienteAntiguo.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(jClienteAntiguo, "Datos incorrectos");
                txtUsuarioInicio.setText(null);
                txtClaveInicio.setText(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIniciarSesionUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        jClienteAntiguo.setLocationRelativeTo(null);
        jUsuario.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIniciarSesionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionUActionPerformed
        jClienteAntiguo.setLocationRelativeTo(null);
        jClienteAntiguo.setVisible(true);
    }//GEN-LAST:event_btnIniciarSesionUActionPerformed

    private void txtClaveUsuarioNuevoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveUsuarioNuevoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCrearUsuarioNuevo.doClick();
        }
    }//GEN-LAST:event_txtClaveUsuarioNuevoKeyReleased

    private void txtClaveInicioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveInicioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnIniciarSesionUsuario.doClick();
        }
    }//GEN-LAST:event_txtClaveInicioKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMedioPago;
    private javax.swing.JButton btnAgregarAdmi;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearUsuarioNuevo;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnFinalizar1;
    private javax.swing.JButton btnFinalizar2;
    private javax.swing.JButton btnFinalizar3;
    private javax.swing.JButton btnIngresarAdmi;
    private javax.swing.JButton btnIniciarSesionU;
    private javax.swing.JButton btnIniciarSesionUsuario;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboBebidas;
    private javax.swing.JComboBox cboCervezas;
    private javax.swing.JComboBox cboEmpanadas;
    private javax.swing.JComboBox cboGyosas;
    private javax.swing.JComboBox cboJugos;
    private javax.swing.JComboBox cboOtros;
    private javax.swing.JComboBox cboPapas;
    private javax.swing.JComboBox cboSaboresSushi;
    private javax.swing.JComboBox cboTipoAdmi;
    private javax.swing.JFrame jAdmin;
    private javax.swing.JFrame jClienteAntiguo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JFrame jPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JFrame jUsuario;
    private javax.swing.JLabel lblAgregados;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImgSushi;
    private javax.swing.JSpinner spnBebida;
    private javax.swing.JSpinner spnCervezas;
    private javax.swing.JSpinner spnJugos;
    private javax.swing.JSpinner spnOtros;
    private javax.swing.JSpinner spnUniEmpanadas;
    private javax.swing.JSpinner spnUniGyosas;
    private javax.swing.JSpinner spnUniPapas2;
    private javax.swing.JSpinner spnUniSushi;
    private javax.swing.JTabbedPane tab2;
    private javax.swing.JTable tabProductoAdmi;
    private javax.swing.JTextField txtApellidoUsuarioNuevo;
    private javax.swing.JPasswordField txtClaveInicio;
    private javax.swing.JPasswordField txtClaveUsuarioNuevo;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtDireccionUsuarioNuevo;
    private javax.swing.JTextField txtEliminarAdmi;
    private javax.swing.JTextField txtNombreAgregarAdmi;
    private javax.swing.JTextField txtNombreUsuarioNuevo;
    private javax.swing.JPasswordField txtPassAdmi;
    private javax.swing.JTextField txtPrecioAgregarAdmi;
    private javax.swing.JTextField txtRutUsuarioNuevo;
    private javax.swing.JTextField txtTelefonoUsuarioNuevo;
    private javax.swing.JTextField txtUsuAdmi;
    private javax.swing.JTextField txtUsuarioInicio;
    private javax.swing.JTextField txtidEliminar;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProducto(List<Producto> productos) {
        try {
            TMAdmin modelPro = new TMAdmin(productos);
            tabProductoAdmi.setModel(modelPro);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCombos() {
        cargarComboBebestibles();
        cargarComboTipo();
        cargarCombosAgregado();
        cargarComboSushi();
    }

    private void cargarComboBebestibles() {
        try {
            List<Producto> productos = d.getProductos();

            for (Producto p : productos) {
                if (p.getTipo() == 3) {
                    cboBebidas.addItem(p);
                } else if (p.getTipo() == 4) {
                    cboJugos.addItem(p);
                } else if (p.getTipo() == 5) {
                    cboCervezas.addItem(p);
                } else if (p.getTipo() == 6) {
                    cboOtros.addItem(p);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarComboTipo() {
        try {

            List<Tipo> tipo = d.getTipo();
            cboTipoAdmi.removeAllItems();

            for (Tipo t : tipo) {
                cboTipoAdmi.addItem(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarCombosAgregado() {

        try {
            List<Producto> productos = d.getProductos();

            for (Producto p : productos) {
                if (p.getTipo() == 2) {
                    cboPapas.addItem(p);
                } else if (p.getTipo() == 7) {
                    cboEmpanadas.addItem(p);
                } else if (p.getTipo() == 8) {
                    cboGyosas.addItem(p);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarComboSushi() {
        try {
            List<Producto> productos = d.getProductos();

            for (Producto p : productos) {
                if (p.getTipo() == 1) {
                    cboSaboresSushi.addItem(p);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int total() throws SQLException {
        Producto p = new Producto();
        int total = 0;
        int totalBebida;
        int totalCerveza;
        int totalEmpanadas;
        int totalGyosas;
        int totalJugos;
        int totalOtros;
        int totalPapas;
        int totalSushi;
        
        if (cboSaboresSushi.getSelectedIndex() != 0){
             p = d.getProductoPorId(cboSaboresSushi.getSelectedIndex());
             int precioSushi = p.getPrecio();
             int cantidadSushi = Integer.parseInt(spnUniSushi.getValue().toString());
             totalSushi= precioSushi*cantidadSushi;
             total = total + totalSushi;
             
        }else if (cboBebidas.getSelectedIndex() != 0){ 
             p = d.getProductoPorId(cboBebidas.getSelectedIndex());
             int precioBebida = p.getPrecio();
             int cantidadBebida = Integer.parseInt(spnBebida.getValue().toString());
             totalBebida= precioBebida*cantidadBebida;
             total = total + totalBebida;
             
        }else if (cboCervezas.getSelectedIndex() != 0){   
            p = d.getProductoPorId(cboCervezas.getSelectedIndex());
             int precioCerveza = p.getPrecio();
             int cantidadCerveza = Integer.parseInt(spnCervezas.getValue().toString());
             totalCerveza= precioCerveza*cantidadCerveza;
             total = total + totalCerveza;
             
        }else if (cboEmpanadas.getSelectedIndex() != 0){ 
            p = d.getProductoPorId(cboEmpanadas.getSelectedIndex());
             int precioEmpanadas = p.getPrecio();
             int cantidadEmpanadas = Integer.parseInt(spnUniEmpanadas.getValue().toString());
             totalEmpanadas= precioEmpanadas*cantidadEmpanadas;
             total = total + totalEmpanadas;
             
        }   else if (cboGyosas.getSelectedIndex() != 0){ 
             p = d.getProductoPorId(cboGyosas.getSelectedIndex());
             int precioGyosas = p.getPrecio();
             int cantidadGyosas = Integer.parseInt(spnUniGyosas.getValue().toString());
             totalGyosas= precioGyosas*cantidadGyosas;
             total = total + totalGyosas;
             
        }else if (cboJugos.getSelectedIndex() != 0){  
             p = d.getProductoPorId(cboJugos.getSelectedIndex());
             int precioJugos = p.getPrecio();
             int cantidadJugos = Integer.parseInt(spnJugos.getValue().toString());
             totalJugos= precioJugos*cantidadJugos;
             total = total + totalJugos;
             
        }else if (cboOtros.getSelectedIndex()!= 0){ 
             p = d.getProductoPorId(cboOtros.getSelectedIndex());
             int precioOtros = p.getPrecio();
             int cantidadOtros = Integer.parseInt(spnOtros.getValue().toString());
             totalOtros= precioOtros*cantidadOtros;
             total = total+ totalOtros;
             
        }else if (cboPapas.getSelectedIndex() != 0){  
             p = d.getProductoPorId(cboPapas.getSelectedIndex());
             int precioPapas = p.getPrecio();
             int cantidadPapas = Integer.parseInt(spnUniPapas2.getValue().toString());
             totalPapas= precioPapas*cantidadPapas;
             total = total+ totalPapas;
             
        }else {
            return 0;
        } 

             return total;
    }
}
