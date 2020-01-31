/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelhamapa;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class JogoDaVelha extends javax.swing.JFrame {

    //jogadores
    private String jogador1 = "X";
    private String jogador2 = "O";
    private String jogadorDaVez;
    private String[][] arena = new String[3][3];
    private int jogadasRestantes = 9;

    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
        initComponents();
        this.inicializacao();
    }

    /**
     * habilita e limpa botoes inicar jogadores
     */
    private void inicializacao() {
        bt1.setText("");
        bt1.setEnabled(true);
        bt2.setText("");
        bt2.setEnabled(true);
        bt3.setText("");
        bt3.setEnabled(true);
        bt4.setText("");
        bt4.setEnabled(true);
        bt5.setText("");
        bt5.setEnabled(true);
        bt6.setText("");
        bt6.setEnabled(true);
        bt7.setText("");
        bt7.setEnabled(true);
        bt8.setText("");
        bt8.setEnabled(true);
        bt9.setText("");
        bt9.setEnabled(true);
        this.mudarVez();
    }

    public void verificaVencedor() {
        //verifica linhas, diagonais e colunas
        if (((bt1.getText() == "X") && (bt2.getText() == "X") && (bt3.getText() == "X"))
                || ((bt4.getText() == "X") && (bt5.getText() == "X") && (bt6.getText() == "X"))
                || ((bt7.getText() == "X") && (bt8.getText() == "X") && (bt9.getText() == "X"))
                || ((bt1.getText() == "X") && (bt5.getText() == "X") && (bt9.getText() == "X"))
                || ((bt3.getText() == "X") && (bt5.getText() == "X") && (bt7.getText() == "X"))
                || ((bt1.getText() == "X") && (bt4.getText() == "X") && (bt7.getText() == "X"))
                || ((bt2.getText() == "X") && (bt5.getText() == "X") && (bt8.getText() == "X"))
                || ((bt3.getText() == "X") && (bt6.getText() == "X") && (bt9.getText() == "X"))) {
            //JOptionPane.showMessageDialog(null, "Jogador 'X' venceu o jogo", "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
            display.setText("Jogador 'X' venceu o jogo");
            this.desativaBotoes();
        }
        if (((bt1.getText() == "O") && (bt2.getText() == "O") && (bt3.getText() == "O"))
                || ((bt4.getText() == "O") && (bt5.getText() == "O") && (bt6.getText() == "O"))
                || ((bt7.getText() == "O") && (bt8.getText() == "O") && (bt9.getText() == "O"))
                || ((bt1.getText() == "O") && (bt5.getText() == "O") && (bt9.getText() == "O"))
                || ((bt3.getText() == "O") && (bt5.getText() == "O") && (bt7.getText() == "O"))
                || ((bt1.getText() == "O") && (bt4.getText() == "O") && (bt7.getText() == "O"))
                || ((bt2.getText() == "O") && (bt5.getText() == "O") && (bt8.getText() == "O"))
                || ((bt3.getText() == "O") && (bt6.getText() == "O") && (bt9.getText() == "O"))) {
            //JOptionPane.showMessageDialog(null, "Jogador 'O' venceu o jogo", "Fim de jogo!", JOptionPane.INFORMATION_MESSAGE);
            display.setText("Jogador 'O' venceu o jogo");
            this.desativaBotoes();
        }
    }

    private void desativaBotoes() {
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);
    }

    private void mudarVez() {
        if ((this.jogadasRestantes % 2) != 0) {
            display.setText("Vez do jogador: " + this.jogador1);
            this.jogadorDaVez = this.jogador1;
        } else {
            display.setText("Vez do jogador: " + this.jogador2);
            this.jogadorDaVez = this.jogador2;
        }
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
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        display = new javax.swing.JLabel();
        btResete = new javax.swing.JButton();
        btCreditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JogoDaVelha - MAPA");
        setResizable(false);

        bt1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        display.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        display.setText("jLabel1");

        btResete.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btResete.setForeground(java.awt.Color.red);
        btResete.setText("Resete");
        btResete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReseteActionPerformed(evt);
            }
        });

        btCreditos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btCreditos.setForeground(java.awt.Color.blue);
        btCreditos.setText("Créditos");
        btCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btResete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreditos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResete)
                    .addComponent(btCreditos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReseteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReseteActionPerformed
        this.inicializacao();
    }//GEN-LAST:event_btReseteActionPerformed

    private void btCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreditosActionPerformed
        Creditos jCreditos = new Creditos();
        jCreditos.setVisible(true);
    }//GEN-LAST:event_btCreditosActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        if (bt1.getText() == "") {
            this.arena[0][0] = this.jogadorDaVez;
            bt1.setText(this.jogadorDaVez);
            bt1.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        if (bt2.getText() == "") {
            this.arena[0][1] = this.jogadorDaVez;
            bt2.setText(this.jogadorDaVez);
            bt2.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if (bt3.getText() == "") {
            this.arena[0][2] = this.jogadorDaVez;
            bt3.setText(this.jogadorDaVez);
            bt3.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        if (bt4.getText() == "") {
            this.arena[1][0] = this.jogadorDaVez;
            bt4.setText(this.jogadorDaVez);
            bt4.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        if (bt5.getText() == "") {
            this.arena[1][1] = this.jogadorDaVez;
            bt5.setText(this.jogadorDaVez);
            bt5.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        if (bt6.getText() == "") {
            this.arena[1][2] = this.jogadorDaVez;
            bt6.setText(this.jogadorDaVez);
            bt6.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        if (bt7.getText() == "") {
            this.arena[2][0] = this.jogadorDaVez;
            bt7.setText(this.jogadorDaVez);
            bt7.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        if (bt8.getText() == "") {
            this.arena[2][1] = this.jogadorDaVez;
            bt8.setText(this.jogadorDaVez);
            bt8.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        if (bt9.getText() == "") {
            this.arena[2][2] = this.jogadorDaVez;
            bt9.setText(this.jogadorDaVez);
            bt9.setEnabled(false);
            this.jogadasRestantes--;
            this.mudarVez();
        }
        this.verificaVencedor();
    }//GEN-LAST:event_bt9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btCreditos;
    private javax.swing.JButton btResete;
    private javax.swing.JLabel display;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
