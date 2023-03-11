package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import BACKEND.Vacina;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class JanelaGestoresMarcacoesVacinarDoses extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
    private Utente utente;
    private LocalDateTime data;
    private Vacina vacina;

    public JanelaGestoresMarcacoesVacinarDoses(Sistema sistema, Serializacao dados, Utente utente, LocalDateTime data, Vacina vacina) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.utente = utente;
        this.data = data;
        this.vacina = vacina;
        preencherDatas();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Metodo para listar as datas em que é possivel fazer marcaçoes
     */
    private void preencherDatas() {
        LocalDate dia = LocalDate.now();
        LocalDate data_min = dia.plusDays(vacina.getDiasMin());
        LocalDate data_max = dia.plusDays(vacina.getDiasMax());
        CentroVacinacao c = utente.getCentro_vacinacao();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        int n_datas = Period.between(data_min, data_max).getDays();
        for (int i = 0; i < n_datas; i++) {
            if (c.getMarcacoes().numMarcaoesPorDia(dia) <= c.getN_max_marcacoes()) { //Verificar se tem vaga para marcaçao
                comboDatas.addItem(data_min.plusDays(i).format(formatter));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboDatas = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marcação 2ª Dose");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 560, 48));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 30, 49));
        jLabel11.setText("Selecione uma Data");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        comboDatas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção..." }));
        comboDatas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        jPanel1.add(comboDatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 350, 40));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(18, 30, 49));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 90, 33));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 30, 49));
        jLabel4.setText("Escolha uma Hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 350, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza uma hora para a marcacao");
            txtHora.requestFocus();
            return;
        }
        CentroVacinacao c = utente.getCentro_vacinacao();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        LocalDate dia = LocalDate.parse(comboDatas.getSelectedItem().toString(), formatter);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(txtHora.getText(), formatter2);
        LocalDateTime d = LocalDateTime.of(dia, hora);
        if (c.getMarcacoes().numMarcacoesPorHora(d) == c.getN_posto_atend()) {
            JOptionPane.showMessageDialog(this, "Nao existem postos de atentimento disponiveis para esta hora");
            txtHora.requestFocus();
            return;
        } else {
            utente.getCentro_vacinacao().getMarcacoes().marcar(d, utente);
            dispose();
            JanelaGestor janela = new JanelaGestor(sistema, dados);
            janela.setVisible(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboDatas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
