
package View;

import Controllers.Vcomprobante;
import Controllers.Vcubiculo;
import Controllers.Vreserva;
import Models.Fcomprobante;
import Models.Fcubiculo;
import Models.Freserva;
import Models.Fservicio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formcomprobante extends javax.swing.JInternalFrame {

    public formcomprobante() {
        initComponents();
        mostrar(idreserva);
        inhabilitar();
        txtidreserva.setText(idreserva);
        txtcliente.setText(cliente);
        txtcubiculo.setText(cubiculo);
        txtidcubiculo.setText(idcubiculo);
        txttotalreserva.setText(Double.toString(totalreserva));
        
        Fservicio funcion = new Fservicio();
        funcion.mostrar(idreserva);
        
        txttotalpago.setText(Double.toString(totalreserva + funcion.totalservicios));
    }
    
    private String accion = "guardar";
    public static String idreserva;
    public static String cliente;
    public static String idcubiculo;
    public static String cubiculo;
    public static Double totalreserva;

    void ocultarColumnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
    }
    
    void ocultarColumnasServicios() {
        tablalistadoservicios.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistadoservicios.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tablalistadoservicios.getColumnModel().getColumn(2).setMaxWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(2).setMinWidth(0);
        tablalistadoservicios.getColumnModel().getColumn(2).setPreferredWidth(0);
    }

    //deshabilitar cosas
    void inhabilitar() {
        txtidcomprobante.setVisible(false);
        
        txtidreserva.setVisible(false);
        txtcliente.setEnabled(false);
        
        txtnumerocomprobante.setEnabled(false);
        cdotipocomprobante.setEnabled(false);
        
        txtigv.setEnabled(false);
        txttotalpago.setEnabled(false);
        txttotalreserva.setEnabled(false);

        dcfechaemision.setEnabled(false);
        dcfechapago.setEnabled(false);
        
        txtidcubiculo.setVisible(false);
        txtcubiculo.setEnabled(false);
        
        
        btnguardar2.setEnabled(false);
        btncancelar2.setEnabled(false);
        btneliminar.setEnabled(false);

        txtidcomprobante.setText("");
        txtnumerocomprobante.setText("");
        txtigv.setText("");
        txttotalpago.setText("");
    }

    //habilitar
    void habilitar() {
        txtidcomprobante.setVisible(false);
        
        txtidreserva.setVisible(true);
        txtcliente.setEnabled(true);
        
        txtnumerocomprobante.setEnabled(true);
        cdotipocomprobante.setEnabled(true);
        
        txtigv.setEnabled(true);
        txttotalpago.setEnabled(true);
        txttotalreserva.setEnabled(true);

        dcfechaemision.setEnabled(true);
        dcfechapago.setEnabled(true);
        
        txtidcubiculo.setVisible(true);
        txtcubiculo.setEnabled(true);
        
        
        btnguardar2.setEnabled(true);
        btncancelar2.setEnabled(true);
        btneliminar.setEnabled(true);

        txtidcomprobante.setText("");
        txtnumerocomprobante.setText("");
        txtigv.setText("");
        //txttotalpago.setText("");
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fcomprobante funcion = new Fcomprobante();

            modelo = funcion.mostrar(buscar);

            tablalistado.setModel(modelo);
            ocultarColumnas();
            lbltotalregistros.setText("Total Pagos " + Integer.toString(funcion.totalRegistros));
            
            //mostrar datos de los servicios
            Fservicio funcion2 = new Fservicio();
            modelo = funcion2.mostrar(buscar);
            tablalistadoservicios.setModel(modelo);
            ocultarColumnasServicios();
            
            lbltotalregistrosservicios.setText("Total Servicios " + funcion2.totalRegistros);
            lbltotalregistrosservicios.setText("Servicio Total: $" + funcion2.totalservicios);
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtidreserva = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtidcomprobante = new javax.swing.JTextField();
        cdotipocomprobante = new javax.swing.JComboBox<>();
        btnnuevo2 = new javax.swing.JButton();
        btnguardar2 = new javax.swing.JButton();
        btncancelar2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtnumerocomprobante = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        txttotalreserva = new javax.swing.JTextField();
        txtidcubiculo = new javax.swing.JTextField();
        txtcubiculo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtigv = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txttotalpago = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        dcfechaemision = new com.toedter.calendar.JDateChooser();
        dcfechapago = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablalistadoservicios = new javax.swing.JTable();
        lbltotalregistrosservicios = new javax.swing.JLabel();
        lbltotalservicios = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 204));
        jLabel17.setText("Comprobante");

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registro de comprobantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        txtidreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidreservaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reserva: ");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Total reserva: ");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cubículo: ");

        txtidcomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcomprobanteActionPerformed(evt);
            }
        });

        cdotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "QR", "Tarjeta", "Otro" }));
        cdotipocomprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdotipocomprobanteActionPerformed(evt);
            }
        });

        btnnuevo2.setBackground(new java.awt.Color(0, 204, 255));
        btnnuevo2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnnuevo2.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btnnuevos.png"))); // NOI18N
        btnnuevo2.setText("Nuevo");
        btnnuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo2ActionPerformed(evt);
            }
        });

        btnguardar2.setBackground(new java.awt.Color(0, 204, 255));
        btnguardar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnguardar2.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btneditaroguardar.png"))); // NOI18N
        btnguardar2.setText("Guardar");
        btnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardar2ActionPerformed(evt);
            }
        });

        btncancelar2.setBackground(new java.awt.Color(0, 204, 255));
        btncancelar2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncancelar2.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btncancelar.png"))); // NOI18N
        btncancelar2.setText("Cancelar");
        btncancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelar2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Tipo de comprobante: ");

        txtidcubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcubiculoActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Número de comprobante: ");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("IGV: ");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Fecha emisión: ");

        txttotalpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalpagoActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Total pago: ");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Fecha pago: ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                    .addComponent(btnnuevo2))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcubiculo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnguardar2)
                                            .addComponent(txtidcubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btncancelar2))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(108, 108, 108)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dcfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dcfechapago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cdotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtidcomprobante, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(txtcliente))
                            .addComponent(txttotalreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumerocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txttotalreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtidcubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(cdotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtnumerocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(dcfechaemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(dcfechapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar2)
                    .addComponent(btnguardar2)
                    .addComponent(btnnuevo2))
                .addGap(24, 24, 24))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado de comprobantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablalistado);

        btneliminar.setBackground(new java.awt.Color(0, 204, 255));
        btneliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btneliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 204, 255));
        btnsalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btnsalir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbltotalregistros.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(btneliminar)
                        .addGap(31, 31, 31)
                        .addComponent(btnsalir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado de servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tablalistadoservicios.setModel(new javax.swing.table.DefaultTableModel(
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
        tablalistadoservicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadoserviciosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablalistadoservicios);

        lbltotalregistrosservicios.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalregistrosservicios.setText("Registros");

        lbltotalservicios.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalservicios.setText("Total");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbltotalservicios)
                        .addGap(129, 129, 129)
                        .addComponent(lbltotalregistrosservicios))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalregistrosservicios)
                    .addComponent(lbltotalservicios)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar2.setText("Editar");
        habilitar(); //habilitamos las cajas de texto
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint()); //se almacena de la tabla listado la fila a la que hago click

        txtidcomprobante.setText(tablalistado.getValueAt(fila, 0).toString());
        //txtidreserva.setText(tablalistado.getValueAt(fila, 1).toString()); //este no ya que el codigo lo enviare desde el form reserva
        
        cdotipocomprobante.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
        txtnumerocomprobante.setText(tablalistado.getValueAt(fila, 3).toString());
        txtigv.setText(tablalistado.getValueAt(fila, 4).toString());
        txttotalpago.setText(tablalistado.getValueAt(fila, 5).toString());
        
        // Manejo de fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Fecha de emision
        String fechaStringEmision = tablalistado.getValueAt(fila, 6).toString();
        LocalDate fechaEmision = LocalDate.parse(fechaStringEmision, formatter);
        Date dateEmision = Date.from(fechaEmision.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcfechaemision.setDate(dateEmision);

        // Fecha de pago
        String fechaStringPago = tablalistado.getValueAt(fila, 7).toString();
        LocalDate fechaPago = LocalDate.parse(fechaStringPago, formatter);
        Date datePago = Date.from(fechaPago.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcfechaemision.setDate(datePago);
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        if(!txtidcomprobante.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar el pago?", "Confirmar", 2);

            if(confirmacion == 0){
                Fcomprobante funcion = new Fcomprobante();
                Vcomprobante dts = new Vcomprobante();

                dts.setIdcomprobante(Integer.parseInt(txtidcomprobante.getText()));
                funcion.eliminar(dts);
                mostrar(idreserva);
                inhabilitar(); //para dejar desactivadas todas las cajitas
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txttotalpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpagoActionPerformed

    private void txtidcubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcubiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcubiculoActionPerformed

    private void btncancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelar2ActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed

        //validamos que todos los campos esten llenos
        if (txtigv.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el IGV del comprobante de pago");
            txtigv.requestFocus();
            return;
        }
        if (txttotalpago.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el total de pago del comprobante");
            txttotalpago.requestFocus();
            return;
        }
        if (txtnumerocomprobante.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un número del comprobante del pago");
            txtnumerocomprobante.requestFocus();
            return;
        }

        Vcomprobante dts = new Vcomprobante();
        Fcomprobante funcion = new Fcomprobante();

        dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));

        int seleccionado = cdotipocomprobante.getSelectedIndex();
        dts.setTipo_comprobante((String) cdotipocomprobante.getItemAt(seleccionado));
        
        dts.setNum_comprobante(txtnumerocomprobante.getText());
        dts.setIgv(Double.parseDouble(txtigv.getText()));
        dts.setTotal_pago(Double.parseDouble(txttotalpago.getText()));
        
        //vamos a usar LocalDate para las fechas MIO!!
        LocalDate fechaReserva = convertirDateALocalDate(dcfechaemision.getDate());
        LocalDate fechaInicio = convertirDateALocalDate(dcfechapago.getDate());

        dts.setFecha_emision(fechaReserva);
        dts.setFecha_pago(fechaInicio);
        
        if(accion.equals("guardar")){
            if(funcion.insertar(dts)){
                JOptionPane.showMessageDialog(rootPane, "El pago por $" + txttotalpago.getText() + " de " + txtcliente.getText() + " ha sido realizado de manera exitosa");
                mostrar(idreserva); //vacia para que muestre todos los registros
                inhabilitar();
                
                
                //desocupar el cubiculo
                Fcubiculo funcion2 = new Fcubiculo();
                Vcubiculo dts2 = new Vcubiculo();
                
                dts2.setIdcubiculo(Integer.parseInt(txtidcubiculo.getText()));
                funcion2.desocupar(dts2);
                
                //cancelar o pagar la reserva
                Freserva funcion3 = new Freserva();
                Vreserva dts3 = new Vreserva();
                
                dts3.setIdreserva(Integer.parseInt(txtidreserva.getText()));
                funcion3.pagar(dts3);
                
            }
        }else if(accion.equals("editar")){
            dts.setIdcomprobante(Integer.parseInt(txtidcomprobante.getText()));

            if(funcion.editar(dts)){
                JOptionPane.showMessageDialog(rootPane, "El pago de " + txtcliente.getText() + " ha sido modificado de manera exitosa.");
                mostrar(idreserva);
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private LocalDate convertirDateALocalDate(Date fecha) {
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private void btnnuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo2ActionPerformed

        habilitar();
        btnguardar2.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevo2ActionPerformed

    private void cdotipocomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdotipocomprobanteActionPerformed
        //para que al dar enter despues de escribir, pase al siguiente label

        cdotipocomprobante.transferFocus();
    }//GEN-LAST:event_cdotipocomprobanteActionPerformed

    private void txtidcomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcomprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcomprobanteActionPerformed

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
        //para que al dar enter despues de escribir, pase al siguiente label

        txtidreserva.transferFocus();
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void tablalistadoserviciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoserviciosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoserviciosMouseClicked

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
            java.util.logging.Logger.getLogger(formcomprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formcomprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formcomprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formcomprobante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formcomprobante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar2;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnnuevo2;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cdotipocomprobante;
    private com.toedter.calendar.JDateChooser dcfechaemision;
    private com.toedter.calendar.JDateChooser dcfechapago;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JLabel lbltotalregistrosservicios;
    private javax.swing.JLabel lbltotalservicios;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTable tablalistadoservicios;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcubiculo;
    private javax.swing.JTextField txtidcomprobante;
    private javax.swing.JTextField txtidcubiculo;
    private javax.swing.JTextField txtidreserva;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtnumerocomprobante;
    private javax.swing.JTextField txttotalpago;
    private javax.swing.JTextField txttotalreserva;
    // End of variables declaration//GEN-END:variables
}
