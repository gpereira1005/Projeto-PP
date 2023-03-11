package FRONTEND;

import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import java.time.format.DateTimeFormatter;

public class JanelaUtenteVerDados extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaUtenteVerDados(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        txtNSNS.setText(utente.getUsername());
        txtNome.setText(utente.getNome());
        txtMorada.setText(utente.getMorada());
        txtLocalidade.setText(utente.getLocalidade());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        txtData.setText(utente.getData_nasc().format(formatter));
        txtContacto.setText(Long.toString(utente.getContacto_tel()));
        txtEmail.setText(utente.getEmail());
        txtCentro.setText(utente.getCentro_vacinacao().getLocalidade());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCentro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNSNS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMorada = new javax.swing.JLabel();
        txtLocalidade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtEmail = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 30, 49));
        jLabel5.setText("Nome:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtCentro.setBackground(new java.awt.Color(255, 255, 255));
        txtCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCentro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtCentro.setOpaque(true);
        jPanel1.add(txtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 300, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 30, 49));
        jLabel4.setText("Nº SNS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtNSNS.setBackground(new java.awt.Color(255, 255, 255));
        txtNSNS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNSNS.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtNSNS.setOpaque(true);
        jPanel1.add(txtNSNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 300, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setText("Dados Utente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jLabel7.setText("Morada:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtNome.setOpaque(true);
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 300, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 30, 49));
        jLabel9.setText("Localidade:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtMorada.setBackground(new java.awt.Color(255, 255, 255));
        txtMorada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMorada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtMorada.setOpaque(true);
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 300, 30));

        txtLocalidade.setBackground(new java.awt.Color(255, 255, 255));
        txtLocalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLocalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtLocalidade.setOpaque(true);
        jPanel1.add(txtLocalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 300, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 30, 49));
        jLabel13.setText("Contacto telefónico:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtData.setBackground(new java.awt.Color(255, 255, 255));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtData.setOpaque(true);
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 300, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 30, 49));
        jLabel11.setText("Data de Nascimento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(18, 30, 49));
        jLabel15.setText("Centro de Vacinação:");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        txtContacto.setBackground(new java.awt.Color(255, 255, 255));
        txtContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtContacto.setOpaque(true);
        jPanel1.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 300, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(18, 30, 49));
        jLabel17.setText("Email:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(18, 30, 49));
        btnEditar.setText("Editar Dados ");
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 100, 33));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtEmail.setOpaque(true);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 300, 30));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 90, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        dispose();
        JanelaUtenteEditarDados janela = new JanelaUtenteEditarDados(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaUtente janela = new JanelaUtente(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCentro;
    private javax.swing.JLabel txtContacto;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLocalidade;
    private javax.swing.JLabel txtMorada;
    private javax.swing.JLabel txtNSNS;
    private javax.swing.JLabel txtNome;
    // End of variables declaration//GEN-END:variables
}
