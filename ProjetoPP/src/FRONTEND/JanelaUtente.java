package FRONTEND;

import BACKEND.Sistema;
import BACKEND.Serializacao;
import BACKEND.Utente;

public class JanelaUtente extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaUtente(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDoenças = new javax.swing.JButton();
        btnMarcacao = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDadosUtente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(3, 122, 118));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  UTENTE");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 55));

        btnDoenças.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDoenças.setForeground(new java.awt.Color(18, 30, 49));
        btnDoenças.setText("Doenças");
        btnDoenças.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnDoenças.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoençasActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoenças, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 220, 33));

        btnMarcacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMarcacao.setForeground(new java.awt.Color(18, 30, 49));
        btnMarcacao.setText("Marcação");
        btnMarcacao.setToolTipText("");
        btnMarcacao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnMarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMarcacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 220, 33));

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(18, 30, 49));
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 33));

        btnDadosUtente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDadosUtente.setForeground(new java.awt.Color(18, 30, 49));
        btnDadosUtente.setText("Dados Utente");
        btnDadosUtente.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnDadosUtente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosUtenteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDadosUtente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 220, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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

    private void btnDoençasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoençasActionPerformed
        dispose();
        JanelaUtenteDoencas janela = new JanelaUtenteDoencas(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnDoençasActionPerformed

    private void btnMarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcacaoActionPerformed
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        if (utente.isVacina_administrada()) {
            dispose();
            JanelaUtenteVerMarcacao janela = new JanelaUtenteVerMarcacao(sistema, dados);
            janela.setVisible(true);
        } else {
            if (utente.getCentro_vacinacao().getMarcacoes().temMarcacao(utente)) {
                dispose();
                JanelaUtenteVerMarcacao janela = new JanelaUtenteVerMarcacao(sistema, dados);
                janela.setVisible(true);
            } else {
                dispose();
                JanelaUtenteMarcarMarcacao janela = new JanelaUtenteMarcarMarcacao(sistema, dados);
                janela.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnMarcacaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dados.guardar(sistema);
        dispose();
        JanelaLogin janela = new JanelaLogin(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDadosUtenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosUtenteActionPerformed
        dispose();
        JanelaUtenteVerDados janela = new JanelaUtenteVerDados(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnDadosUtenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDadosUtente;
    private javax.swing.JButton btnDoenças;
    private javax.swing.JButton btnMarcacao;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
