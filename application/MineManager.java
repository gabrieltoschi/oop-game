package application;

import buildings.Mine;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para gerenciamento de uma Mina.
 * @author Fernanda Marana
 */
public class MineManager extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;
    int row, col;

    public MineManager(GameManager gameData, int row, int col) {
        this.setResizable(false);
        this.gameData = gameData;
        this.row = row;
        this.col = col;
        
        Mine mine = (Mine) gameData.grid.getBuilding(row, col);
        mine.reconfig(gameData.resources);
        
        initComponents();
        labelOopyiesEdit.setText(Integer.toString(gameData.resources.getOopyies()));
        
        CheckBoxStoneProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION));
        SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION));
        CheckBoxPickAxe.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE));
        SpinnerSeeds.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE));
        CheckBoxGreatEscavation.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.GREAT_ESCAVATION));
        
        CheckBoxGreatEscavation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatEscavationActionPerformed(evt);
            }
        });
        
        SpinnerOopyies.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getOopyies(), 1));

        SpinnerSeeds.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getJavaSeeds(), 1));
    }

    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelMINE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnResources = new javax.swing.JButton();
        labelOopyiesEdit = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        CheckBoxGreatEscavation = new javax.swing.JCheckBox();
        SpinnerOopyies = new javax.swing.JSpinner();
        SpinnerSeeds = new javax.swing.JSpinner();
        CheckBoxPickAxe = new javax.swing.JCheckBox();
        CheckBoxStoneProduction = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MineBig.png"))); // NOI18N

        labelMINE.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        labelMINE.setText("MINA");

        jLabel3.setText("Oopyies Disponiveis:");

        jLabel4.setText("Escavacao de Pedras:");

        jLabel5.setText("Oopyies Alocados:");

        jLabel6.setText("Usar Picaretas:");

        jLabel7.setText("Sementes Usadas:");

        jLabel8.setText("Explosao Rubra:");

        btnResources.setText("Recursos");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        labelOopyiesEdit.setText("0");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxStoneProduction)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxPickAxe)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(56, 56, 56)
                                        .addComponent(labelOopyiesEdit))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(btnClose)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerSeeds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(CheckBoxGreatEscavation)
                                        .addGap(17, 17, 17))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelImage)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(labelMINE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnResources)))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(labelMINE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResources)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelOopyiesEdit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CheckBoxStoneProduction))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SpinnerSeeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CheckBoxPickAxe))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckBoxGreatEscavation)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(41, 41, 41))
        );

        pack();
    }

    private void CheckBoxGreatEscavationActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    	if (CheckBoxGreatEscavation.isSelected()){
    		CheckBoxStoneProduction.setEnabled(false);
            SpinnerOopyies.setEnabled(false);
            CheckBoxPickAxe.setEnabled(false);
            SpinnerSeeds.setEnabled(false);
    	} else {
    		CheckBoxStoneProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION));
            SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION));
            CheckBoxPickAxe.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE));
            SpinnerSeeds.setEnabled(BuildingTools.getUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE));
    	}
    }
    
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
    	Mine mine = (Mine) gameData.grid.getBuilding(row, col);
    	
        if(CheckBoxGreatEscavation.isSelected()){
        	// great production
        	mine.checkGreatEscavation(true);
        	gameData.resources.updateGreatRubies(-1);
        } else {       	
        	// oopyies allocated
        	int oopyies = (Integer) SpinnerOopyies.getValue();
        	mine.allocateOopyies(oopyies);
        	gameData.resources.updateOopyies(-oopyies);
        	
        	// basic research
        	if (CheckBoxPickAxe.isSelected()){
        		int seeds = (Integer) SpinnerSeeds.getValue();
        		mine.setSeeds(seeds);
        		gameData.resources.updateJavaSeeds(-seeds);
        	}
        }
        
        this.dispose();
        new MapForUse(gameData).setVisible(true);
    }

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {      
        new Resources(gameData,1).setVisible(true);
    }

    private javax.swing.JCheckBox CheckBoxGreatEscavation;
    private javax.swing.JCheckBox CheckBoxPickAxe;
    private javax.swing.JCheckBox CheckBoxStoneProduction;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JSpinner SpinnerSeeds;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnResources;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelMINE;
    private javax.swing.JLabel labelOopyiesEdit;
}
