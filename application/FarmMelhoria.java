/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.GameManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class FarmMelhoria extends javax.swing.JFrame {
    GameManager gameData;
    /**
     * Creates new form FarmUso
     */
    public FarmMelhoria(GameManager gameData) {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.gameData = gameData;
        initComponents();
        labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
        
        
        
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
        labelFARM = new javax.swing.JLabel();
        labelFP = new javax.swing.JLabel();
        labelSF = new javax.swing.JLabel();
        labelCF = new javax.swing.JLabel();
        labelGP = new javax.swing.JLabel();
        btnFoodProduction = new javax.swing.JButton();
        btnSeedFertilizer = new javax.swing.JButton();
        btnCocoFertilizer = new javax.swing.JButton();
        btnGreatProduction = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        labelCreativityDONTEDIT = new javax.swing.JLabel();
        labelCreativity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FarmBig.png"))); // NOI18N

        labelFARM.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        labelFARM.setText("FARM");

        labelFP.setText("Food Production");

        labelSF.setText("Seed Fertilizer");

        labelCF.setText("Coco Fertilizer");

        labelGP.setText("Great Production");

        btnFoodProduction.setText("Locked: 30");
        btnFoodProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodProductionActionPerformed(evt);
            }
        });

        btnSeedFertilizer.setText("Locked: 30");

        btnCocoFertilizer.setText("Locked: 30");

        btnGreatProduction.setText("Locked: 60");

        btnSair.setText("Close");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        labelCreativityDONTEDIT.setText("Creativity:");

        labelCreativity.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(labelCreativityDONTEDIT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSF)
                            .addComponent(labelFP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelGP)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(labelImage)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCF)
                                .addGap(15, 15, 15)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(labelFARM))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelCreativity)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFoodProduction)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCocoFertilizer)
                                    .addComponent(btnGreatProduction)
                                    .addComponent(btnSeedFertilizer))
                                .addContainerGap(42, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImage)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(labelFARM)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCreativityDONTEDIT)
                    .addComponent(labelCreativity))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFP)
                    .addComponent(btnFoodProduction))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSF)
                    .addComponent(btnSeedFertilizer))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCF)
                    .addComponent(btnCocoFertilizer))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGP)
                    .addComponent(btnGreatProduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LojaVirtual(gameData).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFoodProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodProductionActionPerformed
        // TODO add your handling code here:
        btnFoodProduction.setText("Unlocked");
        btnFoodProduction.setEnabled(false);
   
    }//GEN-LAST:event_btnFoodProductionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCocoFertilizer;
    private javax.swing.JButton btnFoodProduction;
    private javax.swing.JButton btnGreatProduction;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSeedFertilizer;
    private javax.swing.JLabel labelCF;
    private javax.swing.JLabel labelCreativity;
    private javax.swing.JLabel labelCreativityDONTEDIT;
    private javax.swing.JLabel labelFARM;
    private javax.swing.JLabel labelFP;
    private javax.swing.JLabel labelGP;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelSF;
    // End of variables declaration//GEN-END:variables
}
