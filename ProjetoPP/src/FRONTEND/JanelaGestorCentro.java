package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Gestor;
import BACKEND.Serializacao;
import BACKEND.Sistema;

public class JanelaGestorCentro extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaGestorCentro(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        Gestor gestor = (Gestor) sistema.getUtilizadorLigado();
        CentroVacinacao centro = sistema.getCentros_Vacinacao().procurarPorGestor(gestor);
        txtCodigo.setText(centro.getCodigo());
        txtMorada.setText(centro.getMorada());
        txtLocalidade.setText(centro.getLocalidade());
        txtPosto.setText(Integer.toString(centro.getN_posto_atend()));
        txtMaxMarcacoes.setText(Integer.toString(centro.getN_max_marcacoes()));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JLabel();
        txtMorada = new javax.swing.JLabel();
        txtLocalidade = new javax.swing.JLabel();
        txtPosto = new javax.swing.JLabel();
        txtMaxMarcacoes = new javax.swing.JLabel();
        btnVoltar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Centro Vacinação");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 560, 48));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 30, 49));
        jLabel5.setText("Morada");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 30, 49));
        jLabel6.setText("Localidade");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jLabel7.setText("Nº Posto Atendimento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 20));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 30, 49));
        jLabel11.setText("Código");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 30, 49));
        jLabel13.setText("Nº Máximo Marcações");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar.setText("Editar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 90, 33));

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtCodigo.setOpaque(true);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 300, 30));

        txtMorada.setBackground(new java.awt.Color(255, 255, 255));
        txtMorada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMorada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtMorada.setOpaque(true);
        jPanel1.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 300, 30));

        txtLocalidade.setBackground(new java.awt.Color(255, 255, 255));
        txtLocalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLocalidade.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtLocalidade.setOpaque(true);
        jPanel1.add(txtLocalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 300, 30));

        txtPosto.setBackground(new java.awt.Color(255, 255, 255));
        txtPosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPosto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtPosto.setOpaque(true);
        jPanel1.add(txtPosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 300, 30));

        txtMaxMarcacoes.setBackground(new java.awt.Color(255, 255, 255));
        txtMaxMarcacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaxMarcacoes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtMaxMarcacoes.setOpaque(true);
        jPanel1.add(txtMaxMarcacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 300, 30));

        btnVoltar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar1.setText("Voltar");
        btnVoltar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 600));

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
        JanelaGestorCentroEditar janela = new JanelaGestorCentroEditar(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        dispose();
        JanelaGestor janela = new JanelaGestor(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtLocalidade;
    private javax.swing.JLabel txtMaxMarcacoes;
    private javax.swing.JLabel txtMorada;
    private javax.swing.JLabel txtPosto;
    // End of variables declaration//GEN-END:variables
}
