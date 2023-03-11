package FRONTEND;

import BACKEND.CentroVacinacao;
import BACKEND.Gestor;
import BACKEND.Serializacao;
import BACKEND.Sistema;
import BACKEND.Utente;
import BACKEND.Vacina;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class JanelaGestoresMarcacoes extends javax.swing.JFrame {

    private Sistema sistema;
    private Serializacao dados;
    private AbstractTableModel modeloTabela;

    public JanelaGestoresMarcacoes(Sistema sistema, Serializacao dados) {
        initComponents();
        this.sistema = sistema;
        this.dados = dados;
        this.modeloTabela = criarTabela();
        tabelaMarcacoes.setModel(modeloTabela);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    private AbstractTableModel criarTabela() {
        String[] nomeColunas = {"Utente", "Data / Hora"};
        Gestor gestor = (Gestor) sistema.getUtilizadorLigado();

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                //Retorna o número de linhas que a tabela deverá ter
                return listaUtentes().size();
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
                 */ Utente u = listaUtentes().get(rowIndex);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
                switch (columnIndex) {
                    case 0:
                        return u.getNome();
                    case 1:
                        return sistema.getCentros_Vacinacao().procurarPorGestor(gestor).getMarcacoes().ProxMarcacao(u).format(formatter);
                    default:
                        return "";
                }
            }

        };
    }

    /**
     * Metodo para criar novamente a tabela apenas com as marcaçoes de uma dada
     * data
     *
     * @param data
     * @return
     */
    private AbstractTableModel filtrarTabela(LocalDate data) {
        String[] nomeColunas = {"Utente", "Data / Hora"};
        Gestor gestor = (Gestor) sistema.getUtilizadorLigado();
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor(gestor);

        return new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }

            @Override
            public int getRowCount() {
                //Retorna o número de linhas que a tabela deverá ter
                return c.getMarcacoes().listarUtentesParaDia(data).size();
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
                 */ Utente u = c.getMarcacoes().listarUtentesParaDia(data).get(rowIndex);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
                switch (columnIndex) {
                    case 0:
                        return u.getNome();
                    case 1:
                        return c.getMarcacoes().ProxMarcacao(u).format(formatter);
                    default:
                        return "";
                }
            }

        };
    }

    /**
     * Metodo para listar todos os utentes que tem marcaçoes
     *
     * @return
     */
    public ArrayList<Utente> listaUtentes() {
        CentroVacinacao c = sistema.getCentros_Vacinacao().procurarPorGestor((Gestor) sistema.getUtilizadorLigado());
        ArrayList<LocalDateTime> datas = c.getMarcacoes().listarDatas();
        Collections.sort(datas); //Permite ordenar a lista de datas por ordem crescente 
        ArrayList<Utente> todos = new ArrayList<>();
        for (LocalDateTime data : datas) {
            ArrayList<Utente> utentes = c.getMarcacoes().verMarcacoes(data);
            todos.addAll(utentes);
        }
        return todos;
    }

    private void atualizar() {
        modeloTabela.fireTableDataChanged();
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
        jLabel11 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMarcacoes = new javax.swing.JTable();
        btnProcurar = new javax.swing.JButton();
        btnFaltas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVacinar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 30, 49));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Marcações");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 560, 48));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(18, 30, 49));
        jLabel11.setText("Procurar por Data");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 230, 30));

        tabelaMarcacoes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaMarcacoes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 470, 210));

        btnProcurar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProcurar.setForeground(new java.awt.Color(18, 30, 49));
        btnProcurar.setText("Procurar");
        btnProcurar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 30));

        btnFaltas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFaltas.setForeground(new java.awt.Color(18, 30, 49));
        btnFaltas.setText("Faltas");
        btnFaltas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaltasActionPerformed(evt);
            }
        });
        jPanel1.add(btnFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 90, 33));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(18, 30, 49));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 90, 33));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(18, 30, 49));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 90, 33));

        btnVacinar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVacinar.setForeground(new java.awt.Color(18, 30, 49));
        btnVacinar.setText("Vacinar");
        btnVacinar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(18, 30, 49), new java.awt.Color(18, 30, 49)));
        btnVacinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVacinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 90, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENS/borda2222.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        if (txtData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza uma data");
            txtData.requestFocus();
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/uuuu");
        LocalDate data = LocalDate.parse(txtData.getText(), formatter);
        this.modeloTabela = filtrarTabela(data);
        tabelaMarcacoes.setModel(modeloTabela);
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        JanelaGestor janela = new JanelaGestor(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaltasActionPerformed
        dispose();
        JanelaGestorMarcacoesFaltas janela = new JanelaGestorMarcacoesFaltas(sistema, dados);
        janela.setVisible(true);
    }//GEN-LAST:event_btnFaltasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int rowIndex = tabelaMarcacoes.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma marcação para cancelar");
            return;
        }
        String n = (String) modeloTabela.getValueAt(rowIndex, 0);
        String d = (String) modeloTabela.getValueAt(rowIndex, 1);
        Utente utente = (Utente) sistema.getUtilizadores().getUtilizadorNome(n);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
        LocalDateTime data = LocalDateTime.parse(d, formatter);
        sistema.getCentros_Vacinacao().procurarPorGestor((Gestor) sistema.getUtilizadorLigado()).getMarcacoes().cancelar(data, utente);
        atualizar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinarActionPerformed

        int rowIndex = tabelaMarcacoes.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma marcação para vacinar");
            return;
        }
        String n = (String) modeloTabela.getValueAt(rowIndex, 0);
        String d = (String) modeloTabela.getValueAt(rowIndex, 1);
        Utente utente = (Utente) sistema.getUtilizadores().getUtilizadorNome(n);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu HH:mm");
        LocalDateTime data = LocalDateTime.parse(d, formatter);
        if (utente.getN_vacinas_tomadas() == 0) {
            dispose();
            JanelaGestoresMarcacoesVacinar janela = new JanelaGestoresMarcacoesVacinar(sistema, dados, utente, data);
            janela.setVisible(true);
        } else {
            Vacina v = utente.getVacina();
            dispose();
            JanelaGestoresMarcacoesVacinar janela = new JanelaGestoresMarcacoesVacinar(sistema, dados, utente, data, v);
            janela.setVisible(true);
        }
    }//GEN-LAST:event_btnVacinarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFaltas;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnVacinar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMarcacoes;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
