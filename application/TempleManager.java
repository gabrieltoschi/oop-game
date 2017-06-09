/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.GameManager;

/**
 *
 * @author Fer
 */
public class TempleManager extends javax.swing.JFrame {
    GameManager gameData;
    /**
     * Creates new form TempleManager
     */
    public TempleManager(GameManager gameData) {
        this.setResizable(false);
        //this.setLocationRelativeTo(null);
        this.gameData = gameData;
        initComponents();
        labelOopyiesEdit.setText(Integer.toString(gameData.resources.getOopyies()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelTEMPLE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelOopyiesEdit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResources = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CheckBoxGemProduction = new javax.swing.JCheckBox();
        CheckBoxPerlRitual = new javax.swing.JCheckBox();
        CheckBoxPyramidRitual = new javax.swing.JCheckBox();
        CheckBoxGreatRitual = new javax.swing.JCheckBox();
        SpinnerOopyies = new javax.swing.JSpinner();
        SpinnerSeeds = new javax.swing.JSpinner();
        SpinnerCoco = new javax.swing.JSpinner();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TempleBig.png"))); // NOI18N

        labelTEMPLE.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        labelTEMPLE.setText("TEMPLE");

        jLabel3.setText("Oopyies Available:");

        labelOopyiesEdit.setText("0");

        jLabel5.setText("Gem Production:");

        jLabel6.setText("Oopyies Allocated:");

        btnResources.setText("Resources");

        jLabel7.setText("Perl Ritual:");

        jLabel8.setText("Seeds Used:");

        jLabel9.setText("Pyramid Ritual:");

        jLabel10.setText("Coco Used:");

        jLabel11.setText("Great Ritual:");

        CheckBoxGemProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGemProductionActionPerformed(evt);
            }
        });

        CheckBoxPerlRitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPerlRitualActionPerformed(evt);
            }
        });

        CheckBoxPyramidRitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPyramidRitualActionPerformed(evt);
            }
        });

        CheckBoxGreatRitual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatRitualActionPerformed(evt);
            }
        });

        btnSair.setText("Close");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(labelImage)
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnResources))
                                .addComponent(labelTEMPLE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxPerlRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxGemProduction))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxPyramidRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxGreatRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelOopyiesEdit)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerSeeds, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SpinnerCoco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnSair)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(labelTEMPLE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResources)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelOopyiesEdit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBoxGemProduction)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(CheckBoxPerlRitual))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(SpinnerSeeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(CheckBoxPyramidRitual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SpinnerCoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckBoxGreatRitual, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxGemProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGemProductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxGemProductionActionPerformed

    private void CheckBoxPerlRitualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPerlRitualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxPerlRitualActionPerformed

    private void CheckBoxPyramidRitualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPyramidRitualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxPyramidRitualActionPerformed

    private void CheckBoxGreatRitualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGreatRitualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxGreatRitualActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
         this.dispose();
         new Mapa(gameData).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxGemProduction;
    private javax.swing.JCheckBox CheckBoxGreatRitual;
    private javax.swing.JCheckBox CheckBoxPerlRitual;
    private javax.swing.JCheckBox CheckBoxPyramidRitual;
    private javax.swing.JSpinner SpinnerCoco;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JSpinner SpinnerSeeds;
    private javax.swing.JButton btnResources;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelOopyiesEdit;
    private javax.swing.JLabel labelTEMPLE;
    // End of variables declaration//GEN-END:variables
}