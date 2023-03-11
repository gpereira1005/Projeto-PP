package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class JanelaAdmEstatisticas extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
    private AbstractTableModel modeloTabela;

    public JanelaAdmEstatisticas(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.modeloTabela = criarTabela();
        tabelaEfeitos.setModel(modeloTabela);
        txtNVacinas.setText(Integer.toString(calcNumVacinas()));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * Metodo para calcular o numero de vacinas administradas em todos os
     * centros
     *
     * @return
     */
    private int calcNumVacinas() {
        int total = 0;
        ArrayList<CentroVacinacao> centros = sistema.getCentros_Vacinacao().verCentros();
        for (CentroVacinacao c : centros) {
            total = total + c.getVacinas_administradas();
        }
        return total;
    }

    /**
     * Metodo para listar os efeitos secundários de todos os centros
     *
     * @return
     */
    private ArrayList<String> listarEfeitos() {
        ArrayList<String> efeitos = new ArrayList<>();
        ArrayList<CentroVacinacao> centros = sistema.getCentros_Vacinacao().verCentros();
        for (CentroVacinacao centro : centros) {
            ArrayList<String> efeitos_centro = centro.getEfeitos_sec_registados().listaDoencas();
            for (String e : efeitos_centro) {
                efeitos.add(e);
            }
        }
        return efeitos;
    }

    private AbstractTableModel criarTabela() {
        String[] nomeColunas = {"Efeitos Secundarios"};

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                //Retorna o número de linhas que a tabela deverá ter
                return listarEfeitos().size();
            }

            @Override
            public int getColumnCount() {
                //Retorna o número de colunas que a tabela deverá ter
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                /*
                Este método é invocado quando se pretende "popular" cada uma das células da tabela
                Se a tabela tem 3 linhas e 2 colunas existem 6 células (3*2), logo o método será invocado 6 vezes
                    rowIndex representa a linha da célula (0 a rowCount -1)
                    columnIndex representa a coluna da célula (0 a ColumnCount -1)
                 */
                switch (columnIndex) {
                    case 0:
                        return listarEfeitos().get(rowIndex);
                    default:
                        return "";
                }
            }
        };
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
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEfeitos = new javax.swing.JTable();
        txtNVacinas = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estatísticas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 560, 48));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 30, 49));
        jLabel8.setText("Efeitos Secundários Registados");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 40));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 30, 49));
        jLabel7.setText("Nº Vacinas Administradas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        tabelaEfeitos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaEfeitos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 470, 170));

        txtNVacinas.setBackground(new java.awt.Color(255, 255, 255));
        txtNVacinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNVacinas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(18, 30, 49)));
        txtNVacinas.setOpaque(true);
        jPanel1.add(txtNVacinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 30));

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
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 90, 33));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaAdministradores janela = new JanelaAdministradores(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEfeitos;
    private javax.swing.JLabel txtNVacinas;
    // End of variables declaration//GEN-END:variables

}
