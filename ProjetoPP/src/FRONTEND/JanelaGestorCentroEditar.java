package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Gestor;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import javax.swing.JOptionPane;

public class JanelaGestorCentroEditar extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaGestorCentroEditar(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        Gestor g = (Gestor) sistema.getUtilizadorLigado();
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor(g);
        txtPosto.setText(Integer.toString(c.getN_posto_atend()));
        txtMaxMarcacoes.setText(Integer.toString(c.getN_max_marcacoes()));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaxMarcacoes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPosto = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar Centro Vacinação");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 560, 48));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jLabel7.setText("Nº Posto Atendimento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        txtMaxMarcacoes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtMaxMarcacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 250, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(18, 30, 49));
        jLabel13.setText("Nº Máximo Marcações");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txtPosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtPosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 250, 30));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(18, 30, 49));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 90, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtMaxMarcacoes.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza um nº válido");
            txtMaxMarcacoes.requestFocus();
            return;
        }
        if (txtPosto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza um nº válido");
            txtPosto.requestFocus();
            return;
        }

        Gestor g = (Gestor) sistema.getUtilizadorLigado();
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor(g);
        c.setN_max_marcacoes(Integer.parseInt(txtMaxMarcacoes.getText()));
        c.setN_posto_atend(Integer.parseInt(txtPosto.getText()));
        dispose();
        JanelaGestorCentro janela = new JanelaGestorCentro(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMaxMarcacoes;
    private javax.swing.JTextField txtPosto;
    // End of variables declaration//GEN-END:variables
}
