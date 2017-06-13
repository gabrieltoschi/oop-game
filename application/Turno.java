/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.GameManager;
import core.ResourceManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Fer
 */
public class Turno extends javax.swing.JFrame {
    GameManager gameData;
    /**
     * Creates new form Turno
     */
    public Turno(GameManager gameData) {
        this.setResizable(false);
        //this.setLocationRelativeTo(null);
        this.gameData = gameData;
        initComponents();
        jProgressBar1.setValue(0);
        
        jButton1.setVisible(false);
    }

    public class progresso implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            
            int n = jProgressBar1.getValue();
            if(n<100){
                n++;
                 jProgressBar1.setValue(n);
                
            }else{
                timer.stop();
                jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wow.gif")));
                JOptionPane.showMessageDialog(null, "Acabou o dia", null, 0, new javax.swing.ImageIcon(getClass().getResource("/Imagens/pordosol.png")));
                jButton1.setVisible(true);
//                if(JOptionPane.OK_OPTION==1){
//                
//               }
            }
            
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jProgressBar1.setBackground(java.awt.SystemColor.textHighlight);
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setStringPainted(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wow.gif"))); // NOI18N

        jButton1.setText("Encerrar Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        timer = new Timer(50, new progresso());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	ResourceManager tomorrow = gameData.grid.runTurn();
    	JOptionPane.showMessageDialog(null, tomorrow.resultsToString(), "Batendo o Ponto",
				JOptionPane.INFORMATION_MESSAGE);
    	gameData.resources.incorpore(tomorrow);
    	gameData.grid.reset();
    	
    	gameData.turns.nextTurn();
    	
    	// alimentar oopyies
    	int oopyiesGone = gameData.turns.feedOopyies(gameData.resources);
    	if (oopyiesGone > 0) {
    		JOptionPane.showMessageDialog(this, "Por falta de comida, " + oopyiesGone + " Oopyies foram embora. Triste. "
    				+ "N�o deixe mais isso acontecer. Eles n�o merecem.", "Bando de Antrop�logos Noruegueses Dando Estruturas de Comida para Oopyies",
					JOptionPane.ERROR_MESSAGE);
    	} else {
    		
    	}
    	
    	// checagem do dia de pagamento
    	if (gameData.turns.isPayTurn()){
    		if (gameData.turns.executePayTurn(gameData.resources)){
    			JOptionPane.showMessageDialog(this, "Para continuar usando o sistema, voc� dever� pagar " +
							gameData.turns.getPayTurnRubies() + " Great Rubies no dia " +
							gameData.turns.getNextPayTurn() + ".", "Servi�o Semi-Volunt�rio de Colabora��o Monet�ria",
							JOptionPane.INFORMATION_MESSAGE);
    			new Principal(gameData).setVisible(true);
    		} else {
    			JOptionPane.showMessageDialog(this, "Voc� n�o colaborou com Great Rubies no dia correto. Voc� est� sendo"
    					+ "desligado do nosso sistema.", "Servi�o Semi-Volunt�rio de Colabora��o Monet�ria",
						JOptionPane.ERROR_MESSAGE);
    		}
    	} else {
    		new Principal(gameData).setVisible(true);
    	}
    	
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Turno().setVisible(true);
//            }
//        });
//    }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
