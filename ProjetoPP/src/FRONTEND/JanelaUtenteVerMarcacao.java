package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import java.time.format.DateTimeFormatter;

public class JanelaUtenteVerMarcacao extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaUtenteVerMarcacao(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/MM/uuuu - HH:mm");
        CentroVacinacao c = utente.getCentro_vacinacao();
        txtCentro.setText(c.getLocalidade());
        if (utente.isVacina_administrada()) {
            txtVacina.setText(utente.getVacina().getNome());
            txtData1.setText(utente.getDatas_vacinacao().get(0).format(formatter));
            if (utente.getVacina().getNumTomas() != 2) {
                Data1.setText("Data Vacinação:");
                txtData2.setVisible(false);
                Data2.setVisible(false);
            } else {
                txtData2.setText(utente.getDatas_vacinacao().get(1).format(formatter));
            }
        } else {
            txtVacina.setText("Ainda nao foi vacinado");
            if (utente.getDatas_vacinacao().isEmpty()) {
                Data1.setText("Proxima Marcação: ");
                txtData1.setText(c.getMarcacoes().ProxMarcacao(utente).format(formatter2));
                txtData2.setVisible(false);
                Data2.setVisible(false);
            } else if (utente.getDatas_vacinacao().size() == 1) {
                txtData1.setText(utente.getDatas_vacinacao().get(0).format(formatter));
                Data2.setText("Marcação 2ª Dose");
                txtData2.setText(c.getMarcacoes().ProxMarcacao(utente).format(formatter2));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Data2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCentro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVacina = new javax.swing.JLabel();
        txtData2 = new javax.swing.JLabel();
        Data1 = new javax.swing.JLabel();
        txtData1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Data2.setForeground(new java.awt.Color(18, 30, 49));
        Data2.setText("Data 2ª Vacinação:");
        Data2.setToolTipText("");
        jPanel1.add(Data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 30, 49));
        jLabel4.setText("Centro Vacinação:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 30));

        txtCentro.setBackground(new java.awt.Color(255, 255, 255));
        txtCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCentro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtCentro.setOpaque(true);
        jPanel1.add(txtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 300, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 30, 49));
        jLabel1.setText("Marcação Vacinação");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 200, 48));

        txtVacina.setBackground(new java.awt.Color(255, 255, 255));
        txtVacina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVacina.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtVacina.setOpaque(true);
        jPanel1.add(txtVacina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 300, 30));

        txtData2.setBackground(new java.awt.Color(255, 255, 255));
        txtData2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtData2.setOpaque(true);
        jPanel1.add(txtData2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 300, 30));

        Data1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Data1.setForeground(new java.awt.Color(18, 30, 49));
        Data1.setText("Data 1ª Vacinação:");
        jPanel1.add(Data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 130, 30));

        txtData1.setBackground(new java.awt.Color(255, 255, 255));
        txtData1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtData1.setOpaque(true);
        jPanel1.add(txtData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 300, 30));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar.setText("Voltar");
        btnVoltar.setToolTipText("");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 531, 80, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 30, 49));
        jLabel9.setText("Vacina:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaUtente janela = new JanelaUtente(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Data1;
    private javax.swing.JLabel Data2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCentro;
    private javax.swing.JLabel txtData1;
    private javax.swing.JLabel txtData2;
    private javax.swing.JLabel txtVacina;
    // End of variables declaration//GEN-END:variables
}
