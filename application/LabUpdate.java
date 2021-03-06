
package application;

import javax.swing.JOptionPane;

import buildings.Lab;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para melhorias do Lab.
 * @author Fernanda Marana
 */
public class LabUpdate extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;

    public LabUpdate(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        
        labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
        
        if (BuildingTools.getUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION)){
    		btnCreativityProduction.setText("Liberado");
    		btnCreativityProduction.setEnabled(false);
    	} else {
    		btnCreativityProduction.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
            btnCreativityProduction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCreativityProductionActionPerformed(evt);
                }
            });
    	}

        if (BuildingTools.getUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH)){
    		btnBasicResearch.setText("Liberado");
    		btnBasicResearch.setEnabled(false);
    	} else {
    		btnBasicResearch.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.BASIC_RESEARCH));
            btnBasicResearch.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBasicResearchActionPerformed(evt);
                }
            });
    	}

        if (BuildingTools.getUpgrade(BuildingTools.LAB, Lab.GREAT_RESEARCH)){
    		btnGreatResearch.setText("Liberado");
    		btnGreatResearch.setEnabled(false);
    	} else {
    		btnGreatResearch.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.GREAT_RESEARCH));
            btnGreatResearch.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGreatResearchActionPerformed(evt);
                }
            });
    	}
    }

    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelLAB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCreativityProduction = new javax.swing.JButton();
        btnBasicResearch = new javax.swing.JButton();
        btnGreatResearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelCreativity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LabBig.png"))); 

        labelLAB.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); 
        labelLAB.setText("LAB");

        jLabel3.setText("Pesquisa Cientifica:");

        jLabel4.setText("Grupo de Controle:");

        jLabel5.setText("Inspiracao Rubra:");

        btnCreativityProduction.setText("Bloqueado: 30");

        btnBasicResearch.setText("Bloqueado: 30");

        btnGreatResearch.setText("Bloqueado: 30");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setText("Criatividade:");

        labelCreativity.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnClose)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(labelImage))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCreativity)))
                        .addGap(72, 72, 72)
                        .addComponent(labelLAB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGreatResearch)
                            .addComponent(btnBasicResearch)
                            .addComponent(btnCreativityProduction))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(labelImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(labelLAB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelCreativity))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnCreativityProduction))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBasicResearch)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnGreatResearch))
                        .addGap(25, 25, 25)
                        .addComponent(btnClose)))
                .addGap(39, 39, 39))
        );

        pack();
    }
    
    private void btnCreativityProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
    		BuildingTools.unlockUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION);
    		
    		btnCreativityProduction.setText("Liberado");
    		btnCreativityProduction.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnBasicResearchActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.BASIC_RESEARCH)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.BASIC_RESEARCH));
    		BuildingTools.unlockUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH);
    		
    		btnBasicResearch.setText("Liberado");
    		btnBasicResearch.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnGreatResearchActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.GREAT_RESEARCH)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.LAB, Lab.GREAT_RESEARCH));
    		BuildingTools.unlockUpgrade(BuildingTools.LAB, Lab.GREAT_RESEARCH);
    		
    		btnGreatResearch.setText("Liberado");
    		btnGreatResearch.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MyClasses(gameData).setVisible(true);
    }

  


    private javax.swing.JButton btnBasicResearch;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreativityProduction;
    private javax.swing.JButton btnGreatResearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelCreativity;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelLAB;
}
