package FRONTEND;

import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class JanelaUtenteEditarDados extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaUtenteEditarDados(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        txtNome.setText(utente.getNome());
        txtMorada.setText(utente.getMorada());
        txtLocalidade.setText(utente.getLocalidade());
        txtContacto.setText(Long.toString(utente.getContacto_tel()));
        txtEmail.setText(utente.getEmail());
        txtPassword.setText(utente.getPassword());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Metodo para verficar se uma String é um email valido
     *
     * @param email
     * @return
     */
    private boolean validarEmail(String email) {
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtMorada = new javax.swing.JTextField();
        txtLocalidade = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 30, 49));
        jLabel1.setText("Dados Utente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 141, 48));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 30, 49));
        jLabel5.setText("Nome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 30, 49));
        jLabel6.setText("Morada");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jLabel7.setText("Localidade");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 30, 49));
        jLabel8.setText("Contacto telefónico");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(18, 30, 49));
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(18, 30, 49));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 90, 33));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(18, 30, 49));
        jLabel17.setText("Password");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 250, 30));

        txtMorada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 250, 30));

        txtLocalidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtLocalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 250, 30));

        txtContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 250, 30));

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 250, 30));

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 250, 29));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 600, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu Nome");
            txtNome.requestFocus();
            return;
        }
        if (txtMorada.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua morada");
            txtMorada.requestFocus();
            return;
        }
        if (txtLocalidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua Localidade");
            txtLocalidade.requestFocus();
            return;
        }
        if (txtContacto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu contacto telefonico");
            txtContacto.requestFocus();
            return;
        }
        if (txtContacto.getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "O contato tem 9 digitos");
            txtContacto.requestFocus();
            return;
        }
        if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu email");
            txtEmail.requestFocus();
            return;
        }
        if (!validarEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Introduza um emial valido");
            txtEmail.requestFocus();
            return;
        }
        if (txtPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a sua password");
            txtPassword.requestFocus();
            return;
        }
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        utente.setNome(txtNome.getText());
        utente.setMorada(txtMorada.getText());
        utente.setLocalidade(txtLocalidade.getText());
        utente.setContacto_tel(Long.parseLong(txtContacto.getText()));
        utente.setEmail(txtEmail.getText());
        utente.setPassword(new String(txtPassword.getPassword()));
        dispose();
        JanelaUtente janela = new JanelaUtente(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
