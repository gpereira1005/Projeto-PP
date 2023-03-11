package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.ListaCentroVacinacao;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import javax.swing.JOptionPane;

public class JanelaEscolhaCentro extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;

    public JanelaEscolhaCentro(Sistema sistema, Serializacao dados) {

        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        verCentros();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Metodo para listar os centros que existem no sistema
     */
    private void verCentros() {
        ListaCentroVacinacao centros = sistema.getCentros_Vacinacao();
        for (CentroVacinacao centro : centros.verCentros()) {
            comboCentros.addItem(centro.getLocalidade());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboCentros = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Preferência de localidade do Centro de Vacinação");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 580, 30));

        comboCentros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um centro..." }));
        comboCentros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(3, 122, 118)));
        jPanel1.add(comboCentros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 290, 50));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(18, 30, 49));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

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
        if (comboCentros.getSelectedItem().toString().equalsIgnoreCase("Selecione um centro...")) {
            JOptionPane.showMessageDialog(this, "Selecione um centro de vacinação");
            return;
        }
        CentroVacinacao centro = sistema.getCentros_Vacinacao().getCentroPorLocalidade(comboCentros.getSelectedItem().toString());
        Utente utente = (Utente) sistema.getUtilizadorLigado();
        utente.setCentro_vacinacao(centro);
        dispose();
        JanelaUtente janela = new JanelaUtente(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboCentros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
