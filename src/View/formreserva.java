package View;

import Controllers.Vcubiculo;
import Controllers.Vreserva;
import Models.Fcubiculo;
import Models.Freserva;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class formreserva extends javax.swing.JInternalFrame {
    
    public formreserva() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    
    private String accion = "guardar";
    public static int idusuario;
    
    void ocultarColumnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(3).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(3).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        tablalistado.getColumnModel().getColumn(5).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(5).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(5).setPreferredWidth(0);
    }

    //deshabilitar cosas
    void inhabilitar() {
        txtidreserva.setVisible(false);
        txtidcubiculo.setVisible(false);
        txtidcliente.setVisible(false);
        txtidbarbero.setVisible(false);
        
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txtbarbero.setEnabled(false);
        
        cdotiporeserva.setEnabled(false);
        
        dcfechareserva.setEnabled(false);
        dcfechainicio.setEnabled(false);
        dcfechafin.setEnabled(false);
        
        txtcostototal.setEnabled(false);
        cdoestadoreserva.setEnabled(false);
        
        btnguardar2.setEnabled(false);
        btncancelar2.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbuscacliente.setEnabled(false);
        btnbuscacubiculo.setEnabled(false);
        
        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtcostototal.setText("");
        txtidcubiculo.setText("");
    }

    //habilitar
    void habilitar() {
        txtidreserva.setVisible(false);
        txtidcubiculo.setVisible(false);
        txtidcliente.setVisible(false);
        txtidbarbero.setVisible(false);
        
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txtbarbero.setEnabled(false);
        
        cdotiporeserva.setEnabled(true);
        
        dcfechareserva.setEnabled(true);
        dcfechainicio.setEnabled(true);
        dcfechafin.setEnabled(true);
        
        txtcostototal.setEnabled(true);
        cdoestadoreserva.setEnabled(true);
        
        btnguardar2.setEnabled(true);
        btncancelar2.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbuscacliente.setEnabled(true);
        btnbuscacubiculo.setEnabled(true);
        
        txtidreserva.setText("");
        txtidcliente.setText("");
        txtnumero.setText("");
        txtcliente.setText("");
        txtcostototal.setText("");
        txtidcubiculo.setText("");
    }
    
    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Freserva funcion = new Freserva();
            
            modelo = funcion.mostrar(buscar);
            
            tablalistado.setModel(modelo);
            ocultarColumnas();
            lbltotalregistros.setText("Total Registros " + Integer.toString(funcion.totalRegistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtidcubiculo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtidreserva = new javax.swing.JTextField();
        cdotiporeserva = new javax.swing.JComboBox<>();
        btnnuevo2 = new javax.swing.JButton();
        btnguardar2 = new javax.swing.JButton();
        btncancelar2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtcostototal = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        txtbarbero = new javax.swing.JTextField();
        txtidbarbero = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dcfechareserva = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        dcfechainicio = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        dcfechafin = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        cdoestadoreserva = new javax.swing.JComboBox<>();
        btnbuscacubiculo = new javax.swing.JButton();
        btnbuscacliente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();
        btnverservicio = new javax.swing.JButton();
        btnrealizarpagos = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 204));
        jLabel17.setText("Reservas");

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registro de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        txtidcubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcubiculoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cubículo:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cliente: ");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tipo de reserva:");

        txtidreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidreservaActionPerformed(evt);
            }
        });

        cdotiporeserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservado", "En Uso" }));
        cdotiporeserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdotiporeservaActionPerformed(evt);
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
        jLabel26.setText("Precio:");

        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        txtbarbero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarberoActionPerformed(evt);
            }
        });

        txtidbarbero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidbarberoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Barbero: ");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Fecha reserva:");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Fecha inicio:");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fecha fin: ");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Estado reserva:");

        cdoestadoreserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adquirido", "Pagado", "Anulado" }));
        cdoestadoreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdoestadoreservaActionPerformed(evt);
            }
        });

        btnbuscacubiculo.setText("...");
        btnbuscacubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscacubiculoActionPerformed(evt);
            }
        });

        btnbuscacliente.setText("...");
        btnbuscacliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaclienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtidcubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtidbarbero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbarbero)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbuscacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbuscacubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dcfechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(dcfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dcfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(cdotiporeserva, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cdoestadoreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(txtcostototal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(24, 24, 24))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnnuevo2)
                .addGap(97, 97, 97)
                .addComponent(btnguardar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar2)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidcubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscacubiculo)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscacliente))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txtidbarbero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtbarbero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcfechareserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(dcfechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdotiporeserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdoestadoreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcostototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo2)
                    .addComponent(btnguardar2)
                    .addComponent(btncancelar2))
                .addGap(18, 18, 18))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado de reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

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

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Buscar");

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(0, 204, 255));
        btnbuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btnbuscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

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

        btnverservicio.setBackground(new java.awt.Color(0, 204, 255));
        btnverservicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnverservicio.setForeground(new java.awt.Color(255, 255, 255));
        btnverservicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btnnuevos.png"))); // NOI18N
        btnverservicio.setText("Servicios");
        btnverservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverservicioActionPerformed(evt);
            }
        });

        btnrealizarpagos.setBackground(new java.awt.Color(0, 204, 255));
        btnrealizarpagos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnrealizarpagos.setForeground(new java.awt.Color(255, 255, 255));
        btnrealizarpagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/btneditaroguardar.png"))); // NOI18N
        btnrealizarpagos.setText("Realizar pagos");
        btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrealizarpagosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(26, 26, 26)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(26, 26, 26)
                        .addComponent(btneliminar)
                        .addGap(31, 31, 31)
                        .addComponent(btnsalir)
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbltotalregistros))
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnrealizarpagos)
                                    .addComponent(btnverservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(btnverservicio)
                .addGap(18, 18, 18)
                .addComponent(btnrealizarpagos)
                .addGap(22, 22, 22)
                .addComponent(lbltotalregistros))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidcubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcubiculoActionPerformed
        //para que al dar enter despues de escribir, pase al siguiente label

        txtidcubiculo.transferFocus();
    }//GEN-LAST:event_txtidcubiculoActionPerformed

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void cdotiporeservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdotiporeservaActionPerformed
        //para que al dar enter despues de escribir, pase al siguiente label

        cdotiporeserva.transferFocus();
    }//GEN-LAST:event_cdotiporeservaActionPerformed

    private void btnnuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo2ActionPerformed
        
        habilitar();
        btnguardar2.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevo2ActionPerformed

    private void btnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardar2ActionPerformed

        //validamos que todos los campos esten llenos
        if (txtidcubiculo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un cubículo");
            txtidcubiculo.requestFocus();
            return;
        }
        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un cliente");
            txtidcliente.requestFocus();
            return;
        }
        if (txtcostototal.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un precio del cubículo");
            txtcostototal.requestFocus();
            return;
        }
        
        Vreserva dts = new Vreserva();
        Freserva funcion = new Freserva();
        
        dts.setIdCubiculo(Integer.parseInt(txtidcubiculo.getText()));
        dts.setIdCliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdBarbero(idusuario);
        
        int seleccionado = cdotiporeserva.getSelectedIndex();
        dts.setTipo_reserva((String) cdotiporeserva.getItemAt(seleccionado));

        //vamos a usar LocalDate para las fechas MIO!!
        LocalDate fechaReserva = convertirDateALocalDate(dcfechareserva.getDate());
        LocalDate fechaInicio = convertirDateALocalDate(dcfechainicio.getDate());
        LocalDate fechaFin = convertirDateALocalDate(dcfechafin.getDate());
        
        dts.setFecha_reserva(fechaReserva);
        dts.setFecha_inicio(fechaInicio);
        dts.setFecha_fin(fechaFin);
        
        dts.setCosto_total(Double.parseDouble(txtcostototal.getText()));
        
        seleccionado = cdoestadoreserva.getSelectedIndex();
        dts.setEstado((String) cdoestadoreserva.getItemAt(seleccionado));
        
        if (accion.equals("guardar")) {
            if (funcion.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva fue registrada de manera exitosa.");
                mostrar(""); //vacia para que muestre todos los registros
                inhabilitar();

                //ocupar el cubiculo
                Fcubiculo funcion3 = new Fcubiculo();
                Vcubiculo dts3 = new Vcubiculo();
                
                dts3.setIdcubiculo(Integer.parseInt(txtidcubiculo.getText()));
                funcion3.ocupar(dts3);
            }
        } else if (accion.equals("editar")) {
            dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdBarbero(Integer.parseInt(txtidbarbero.getText()));
            
            if (funcion.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "La reserva fue editada de manera exitosa.");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardar2ActionPerformed

    private void btncancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelar2ActionPerformed

    //ESTO ES MIOOO
    private LocalDate convertirDateALocalDate(Date fecha) {
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        btnguardar2.setText("Editar");
        habilitar(); //habilitamos las cajas de texto
        btneliminar.setEnabled(true);
        accion = "editar";
        
        int fila = tablalistado.rowAtPoint(evt.getPoint()); //se almacena de la tabla listado la fila a la que hago click

        txtidreserva.setText(tablalistado.getValueAt(fila, 0).toString());
        txtidcubiculo.setText(tablalistado.getValueAt(fila, 1).toString());
        txtnumero.setText(tablalistado.getValueAt(fila, 2).toString());
        txtidcliente.setText(tablalistado.getValueAt(fila, 3).toString());
        txtcliente.setText(tablalistado.getValueAt(fila, 4).toString());
        txtidbarbero.setText(tablalistado.getValueAt(fila, 5).toString());
        txtbarbero.setText(tablalistado.getValueAt(fila, 6).toString());
        cdotiporeserva.setSelectedItem(tablalistado.getValueAt(fila, 7).toString());
        //dcfechareserva.setDate(Date.valueOf(tablalistado.getValueAt(fila, 8).toString()));

        // Manejo de fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Fecha de Reserva
        String fechaStringReserva = tablalistado.getValueAt(fila, 8).toString();
        LocalDate fechaReserva = LocalDate.parse(fechaStringReserva, formatter);
        Date dateReserva = Date.from(fechaReserva.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcfechareserva.setDate(dateReserva);

        // Fecha de Inicio
        String fechaStringInicio = tablalistado.getValueAt(fila, 9).toString();
        LocalDate fechaInicio = LocalDate.parse(fechaStringInicio, formatter);
        Date dateInicio = Date.from(fechaInicio.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcfechainicio.setDate(dateInicio);

        // Fecha de Fin
        String fechaStringFin = tablalistado.getValueAt(fila, 10).toString();
        LocalDate fechaFin = LocalDate.parse(fechaStringFin, formatter);
        Date dateFin = Date.from(fechaFin.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dcfechafin.setDate(dateFin);
        
        txtcostototal.setText(tablalistado.getValueAt(fila, 11).toString());
        cdoestadoreserva.setSelectedItem(tablalistado.getValueAt(fila, 12).toString());
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        if (!txtidreserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar la reserva?", "Confirmar", 2);
            
            if (confirmacion == 0) {
                Freserva funcion = new Freserva();
                Vreserva dts = new Vreserva();
                
                dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
                funcion.eliminar(dts);
                mostrar("");
                inhabilitar(); //para dejar desactivadas todas las cajitas
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txtbarberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarberoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarberoActionPerformed

    private void txtidbarberoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidbarberoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidbarberoActionPerformed

    private void cdoestadoreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdoestadoreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdoestadoreservaActionPerformed

    private void btnbuscacubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscacubiculoActionPerformed
        formvistacubiculo form = new formvistacubiculo();
        form.toFront(); //delante de cualquier formulario
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscacubiculoActionPerformed

    private void btnbuscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaclienteActionPerformed
        formvistacliente form = new formvistacliente();
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnbuscaclienteActionPerformed

    private void btnverservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverservicioActionPerformed
        
        int fila = tablalistado.getSelectedRow();
        formservicio.idreserva = tablalistado.getValueAt(fila, 0).toString();
        formservicio.cliente = tablalistado.getValueAt(fila, 4).toString();
        
        formservicio form = new formservicio();
        forminicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        

    }//GEN-LAST:event_btnverservicioActionPerformed

    private void btnrealizarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarpagosActionPerformed
        int fila = tablalistado.getSelectedRow();
        formcomprobante.idreserva = tablalistado.getValueAt(fila, 0).toString();
        formcomprobante.cliente = tablalistado.getValueAt(fila, 4).toString();
        formcomprobante.totalreserva = Double.parseDouble(tablalistado.getValueAt(fila, 11).toString());
        formcomprobante.idcubiculo = tablalistado.getValueAt(fila, 1).toString();
        formcomprobante.cubiculo = tablalistado.getValueAt(fila, 2).toString();
        
        formcomprobante form = new formcomprobante();
        forminicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        

    }//GEN-LAST:event_btnrealizarpagosActionPerformed

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
            java.util.logging.Logger.getLogger(formreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formreserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formreserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscacliente;
    private javax.swing.JButton btnbuscacubiculo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar2;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar2;
    private javax.swing.JButton btnnuevo2;
    private javax.swing.JButton btnrealizarpagos;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnverservicio;
    private javax.swing.JComboBox<String> cdoestadoreserva;
    private javax.swing.JComboBox<String> cdotiporeserva;
    private com.toedter.calendar.JDateChooser dcfechafin;
    private com.toedter.calendar.JDateChooser dcfechainicio;
    private com.toedter.calendar.JDateChooser dcfechareserva;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablalistado;
    public static javax.swing.JTextField txtbarbero;
    private javax.swing.JTextField txtbuscar;
    public static javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtcostototal;
    public static javax.swing.JTextField txtidbarbero;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidcubiculo;
    private javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
