package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Gestor;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class JanelaGestoresUtentes extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
    private AbstractTableModel modeloTabela;

    public JanelaGestoresUtentes(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.modeloTabela = criarTabela();
        tabelaUtentes.setModel(modeloTabela);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    private AbstractTableModel criarTabela() {
        String[] nomeColunas = {"Nº SNS", "Nome", "Estado de Vacinação"};
        ArrayList<Utente> utentes = utentesCentro();

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                return utentes.size();
            }

            @Override
            public int getColumnCount() {
                //Retorna o número de colunas que a tabela deverá ter
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Utente utente = utentes.get(rowIndex);
                switch (columnIndex) {
                    case 0:
                        return utente.getUsername();
                    case 1:
                        return utente.getNome();
                    case 2:
                        if (utente.isVacina_administrada()) {
                            return "Vacinado";
                        } else {
                            return "Não Vacinado";
                        }
                    default:
                        return "";
                }
            }
        };
    }

    /**
     * Metodo para listar os utentes que pertencem ao centro de vacinaçao
     *
     * @return
     */
    private ArrayList<Utente> utentesCentro() {
        ArrayList<Utente> utentes = sistema.getUtilizadores().getUtentes();
        ArrayList<Utente> u_centro = new ArrayList<>();
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor((Gestor) sistema.getUtilizadorLigado());
        for (Utente u : utentes) {
            if (u.getCentro_vacinacao().equals(c)) {
                u_centro.add(u);
            }
        }
        return u_centro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUtentes = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lista Utentes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 560, 48));

        tabelaUtentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaUtentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 470, 220));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaGestor janela = new JanelaGestor(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUtentes;
    // End of variables declaration//GEN-END:variables
}
