package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Gestor;
import BACKEND.Serializacao;
import BACKEND.Sistema;

public class JanelaGestor extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaGestor(Sistema sistema, Serializacao dados) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCentroVacinacao = new javax.swing.JButton();
        btnMarcacoes = new javax.swing.JButton();
        btnStockVacinas = new javax.swing.JButton();
        btnUtentes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEstatisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(3, 122, 118));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GESTOR");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 55));

        btnCentroVacinacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCentroVacinacao.setForeground(new java.awt.Color(18, 30, 49));
        btnCentroVacinacao.setText("Centro de Vacinação");
        btnCentroVacinacao.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnCentroVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroVacinacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCentroVacinacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 217, 33));

        btnMarcacoes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMarcacoes.setForeground(new java.awt.Color(18, 30, 49));
        btnMarcacoes.setText("Marcações");
        btnMarcacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnMarcacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcacoesActionPerformed(evt);
            }
        });
        jPanel1.add(btnMarcacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 217, 33));

        btnStockVacinas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStockVacinas.setForeground(new java.awt.Color(18, 30, 49));
        btnStockVacinas.setText("Stock Vacinas");
        btnStockVacinas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnStockVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockVacinasActionPerformed(evt);
            }
        });
        jPanel1.add(btnStockVacinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 217, 33));

        btnUtentes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUtentes.setForeground(new java.awt.Color(18, 30, 49));
        btnUtentes.setText("Utentes ");
        btnUtentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnUtentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUtentesActionPerformed(evt);
            }
        });
        jPanel1.add(btnUtentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 217, 33));

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(18, 30, 49));
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 80, 30));

        btnEstatisticas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstatisticas.setForeground(new java.awt.Color(18, 30, 49));
        btnEstatisticas.setText("Estatísticas");
        btnEstatisticas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(3, 122, 118), new java.awt.Color(3, 122, 118)));
        btnEstatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatisticasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstatisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 217, 33));

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

    private void btnCentroVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroVacinacaoActionPerformed
        dispose();
        JanelaGestorCentro janela = new JanelaGestorCentro(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnCentroVacinacaoActionPerformed

    private void btnMarcacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcacoesActionPerformed
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor((Gestor) sistema.getUtilizadorLigado());
        c.getMarcacoes().verificarFaltas();
        dispose();
        JanelaGestoresMarcacoes janela = new JanelaGestoresMarcacoes(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnMarcacoesActionPerformed

    private void btnStockVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockVacinasActionPerformed
        dispose();
        JanelaGestoresStock janela = new JanelaGestoresStock(sistema, dados);
        janela.setVisible(true);

    }//GEN-LAST:event_btnStockVacinasActionPerformed

    private void btnUtentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUtentesActionPerformed
        dispose();
        JanelaGestoresUtentes janela = new JanelaGestoresUtentes(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnUtentesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dados.guardar(sistema);
        dispose();
        JanelaLogin janela = new JanelaLogin(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEstatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatisticasActionPerformed
        dispose();
        JanelaGestorEstatisticas janela = new JanelaGestorEstatisticas(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnEstatisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentroVacinacao;
    private javax.swing.JButton btnEstatisticas;
    private javax.swing.JButton btnMarcacoes;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnStockVacinas;
    private javax.swing.JButton btnUtentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
