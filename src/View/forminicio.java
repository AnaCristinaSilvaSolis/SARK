
package View;

public class forminicio extends javax.swing.JFrame {

    public forminicio() {
        initComponents();
        this.setExtendedState(forminicio.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Reserva y Agendamiento de Citas - SARK");
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        lblidpersona = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblprimerapellido = new javax.swing.JLabel();
        lblsegundoapellido = new javax.swing.JLabel();
        lblacceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menusark = new javax.swing.JMenu();
        menuarchivo = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        menureservas = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuconfiguraciones = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(0, 204, 204));

        lblidpersona.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblidpersona.setForeground(new java.awt.Color(255, 255, 255));
        lblidpersona.setText("jLabel1");
        escritorio.add(lblidpersona);
        lblidpersona.setBounds(20, 20, 120, 16);

        lblnombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("jLabel2");
        escritorio.add(lblnombre);
        lblnombre.setBounds(20, 60, 120, 16);

        lblprimerapellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblprimerapellido.setForeground(new java.awt.Color(255, 255, 255));
        lblprimerapellido.setText("jLabel3");
        escritorio.add(lblprimerapellido);
        lblprimerapellido.setBounds(20, 100, 120, 16);

        lblsegundoapellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblsegundoapellido.setForeground(new java.awt.Color(255, 255, 255));
        lblsegundoapellido.setText("jLabel4");
        escritorio.add(lblsegundoapellido);
        lblsegundoapellido.setBounds(20, 140, 120, 16);

        lblacceso.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblacceso.setForeground(new java.awt.Color(255, 255, 255));
        lblacceso.setText("jLabel5");
        escritorio.add(lblacceso);
        lblacceso.setBounds(20, 170, 120, 16);

        menusark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/logosark.jpeg"))); // NOI18N
        menusark.setMnemonic('f');
        menusark.setText("SARK");
        menuBar.add(menusark);

        menuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/archivo.png"))); // NOI18N
        menuarchivo.setMnemonic('e');
        menuarchivo.setText("Archivo");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/cubiculo.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cubículos");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        menuarchivo.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/tratamiento.png"))); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Tratamientos");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        menuarchivo.add(copyMenuItem);

        menuBar.add(menuarchivo);

        menureservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/reservas.png"))); // NOI18N
        menureservas.setMnemonic('h');
        menureservas.setText("Reservas");

        contentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/servicio.png"))); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Reservas y Servicios");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        menureservas.add(contentMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        aboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/clientes.png"))); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Clientes");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        menureservas.add(aboutMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/pago.png"))); // NOI18N
        jMenuItem1.setText("Pagos");
        menureservas.add(jMenuItem1);

        menuBar.add(menureservas);

        menuconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/config.png"))); // NOI18N
        menuconfiguraciones.setText("Configuarciones");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/sobrenosotros.png"))); // NOI18N
        jMenuItem2.setText("Usuarios y Accesos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuconfiguraciones.add(jMenuItem2);

        menuBar.add(menuconfiguraciones);

        menusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/File/salir.png"))); // NOI18N
        menusalir.setText("Salir");
        menusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menusalirMouseClicked(evt);
            }
        });
        menuBar.add(menusalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        formcubiculo form = new formcubiculo();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        formtratamiento form = new formtratamiento();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        formreserva form = new formreserva();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
        
        formreserva.txtidbarbero.setText(lblidpersona.getText());
        formreserva.txtbarbero.setText(lblnombre.getText() + " " + lblprimerapellido.getText());
        formreserva.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        formcliente form = new formcliente();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        formbarbero form = new formbarbero();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_menusalirMouseClicked

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
            java.util.logging.Logger.getLogger(forminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forminicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forminicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JLabel lblacceso;
    public static javax.swing.JLabel lblidpersona;
    public static javax.swing.JLabel lblnombre;
    public static javax.swing.JLabel lblprimerapellido;
    public static javax.swing.JLabel lblsegundoapellido;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenu menuarchivo;
    public static javax.swing.JMenu menuconfiguraciones;
    private javax.swing.JMenu menureservas;
    private javax.swing.JMenu menusalir;
    private javax.swing.JMenu menusark;
    // End of variables declaration//GEN-END:variables

}
