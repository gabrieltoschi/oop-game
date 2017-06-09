/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.GameManager;
import javax.swing.JComboBox;

/**
 *
 * @author Fer
 */
public class FarmManager extends javax.swing.JFrame {
    GameManager gameData;
    /**
     * Creates new form FarmManager
     */
    public FarmManager(GameManager gameData) {
        this.setResizable(false);
        //this.setLocationRelativeTo(null);
        this.gameData = gameData;
        initComponents();
        String[] messageStrings = {"Seeds", "Cocos"};
        JComboBox<String> ComboBoxFoodProduction = new JComboBox<String>(messageStrings);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SpinnerOopyies = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        labelOopyiesEdit = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnResources = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CheckBoxSeedFertilizer = new javax.swing.JCheckBox();
        CheckBoxCocoFertilizer = new javax.swing.JCheckBox();
        SpinnerMagicPerls = new javax.swing.JSpinner();
        SpinnerPyramids = new javax.swing.JSpinner();
        CheckBoxGreatProduction = new javax.swing.JCheckBox();
        ComboBoxFoodProduction = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        jLabel1.setText("FARM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FarmBig.png"))); // NOI18N

        jLabel3.setText("Oopyies Allocated:");

        SpinnerOopyies.setModel(new javax.swing.SpinnerNumberModel(0, 0, 300, 1));

        jLabel4.setText("Oopyies Available:");

        labelOopyiesEdit.setText("0");

        btnSair.setText("Close");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnResources.setText("Resources");

        jLabel5.setText("Food Production:");

        jLabel6.setText("Seed Fertilizer:");

        jLabel7.setText("Magic Perls Used:");

        jLabel8.setText("Coco Fertilizer:");

        jLabel9.setText("Pyramids Used:");

        jLabel10.setText("Great Production:");

        CheckBoxSeedFertilizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSeedFertilizerActionPerformed(evt);
            }
        });

        CheckBoxCocoFertilizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxCocoFertilizerActionPerformed(evt);
            }
        });

        SpinnerMagicPerls.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        SpinnerPyramids.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        CheckBoxGreatProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatProductionActionPerformed(evt);
            }
        });

        ComboBoxFoodProduction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seeds", "Cocos", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                            .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CheckBoxCocoFertilizer))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SpinnerMagicPerls, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(135, 135, 135)
                                            .addComponent(SpinnerPyramids, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(184, 184, 184)
                                            .addComponent(CheckBoxGreatProduction)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(79, 79, 79)
                                        .addComponent(labelOopyiesEdit))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(btnResources))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(jLabel1)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CheckBoxSeedFertilizer)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(127, 127, 127)
                                .addComponent(ComboBoxFoodProduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResources)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelOopyiesEdit))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxFoodProduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(CheckBoxSeedFertilizer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SpinnerMagicPerls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(CheckBoxCocoFertilizer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SpinnerPyramids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(CheckBoxGreatProduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
         new Mapa(gameData).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void CheckBoxSeedFertilizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSeedFertilizerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxSeedFertilizerActionPerformed

    private void CheckBoxCocoFertilizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxCocoFertilizerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxCocoFertilizerActionPerformed

    private void CheckBoxGreatProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxGreatProductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxGreatProductionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxCocoFertilizer;
    private javax.swing.JCheckBox CheckBoxGreatProduction;
    private javax.swing.JCheckBox CheckBoxSeedFertilizer;
    private javax.swing.JComboBox<String> ComboBoxFoodProduction;
    private javax.swing.JSpinner SpinnerMagicPerls;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JSpinner SpinnerPyramids;
    private javax.swing.JButton btnResources;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelOopyiesEdit;
    // End of variables declaration//GEN-END:variables
}
