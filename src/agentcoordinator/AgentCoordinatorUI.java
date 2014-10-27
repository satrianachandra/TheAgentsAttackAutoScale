/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentcoordinator;

import jade.gui.GuiEvent;
import jade.wrapper.StaleProxyException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import messageclasses.SmithParameter;

/**
 *
 * @author Ethan_Hunt
 */
public class AgentCoordinatorUI extends javax.swing.JFrame {
    
    AgentCoordinator myAgent;
    
    /**
     * Creates new form AgentCoordinatorUI
     */
    public AgentCoordinatorUI() {
        try {
            // Set Motif L&F on any platform
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgentCoordinatorUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AgentCoordinatorUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AgentCoordinatorUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AgentCoordinatorUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        addWindowListener(new WindowEventHandler());
        setVisible(true);
        buttonKillAllAgents.setEnabled(false);
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
        textFieldNumberOfAgents = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldIntervalOfTicker = new javax.swing.JTextField();
        buttonLaunchAgents = new javax.swing.JButton();
        buttonKillAllAgents = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldServerAddress = new javax.swing.JTextField();
        textFieldServerPort = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buttonRefreshNumberOfAgents = new javax.swing.JButton();
        labelNumberOfAgents = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldFiboNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelIsReady = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaMachines = new javax.swing.JTextArea();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number of Agent Smiths");

        textFieldNumberOfAgents.setText("5");

        jLabel2.setText("Interval of TCP Requst");

        textFieldIntervalOfTicker.setText("2000");
        textFieldIntervalOfTicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIntervalOfTickerActionPerformed(evt);
            }
        });

        buttonLaunchAgents.setText("Launch!");
        buttonLaunchAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaunchAgentsActionPerformed(evt);
            }
        });

        buttonKillAllAgents.setText("Kill Agents");
        buttonKillAllAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKillAllAgentsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("The Coordinator");

        jLabel6.setText("Server Address");

        jLabel7.setText("Server Port");

        textFieldServerAddress.setText("54.171.86.46");

        textFieldServerPort.setText("8080");

        jLabel8.setText("Smiths Running");

        buttonRefreshNumberOfAgents.setText("Refresh");
        buttonRefreshNumberOfAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshNumberOfAgentsActionPerformed(evt);
            }
        });

        labelNumberOfAgents.setText("0");

        jLabel9.setText("Fibo Number");

        textFieldFiboNumber.setText("1000000");

        jLabel10.setText("Status:");

        labelIsReady.setText("Not ready yet");

        jLabel12.setText("Active Machines:");

        textAreaMachines.setColumns(20);
        textAreaMachines.setRows(5);
        jScrollPane3.setViewportView(textAreaMachines);

        buttonExit.setText("exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldIntervalOfTicker, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(textFieldNumberOfAgents)))
                                    .addComponent(buttonKillAllAgents)
                                    .addComponent(buttonLaunchAgents)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldServerPort)
                                            .addComponent(textFieldServerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(textFieldFiboNumber))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNumberOfAgents, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonRefreshNumberOfAgents)
                                        .addGap(0, 8, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelIsReady)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExit)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textFieldNumberOfAgents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textFieldServerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldIntervalOfTicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(textFieldServerPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLaunchAgents)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(textFieldFiboNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(buttonKillAllAgents))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(labelNumberOfAgents)
                            .addComponent(buttonRefreshNumberOfAgents))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(labelIsReady))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonExit))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLaunchAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaunchAgentsActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                //Start the agents
                int numberOfAgent = Integer.decode(textFieldNumberOfAgents.getText());
                long interval = Long.decode(textFieldIntervalOfTicker.getText());
                String serverAddress = textFieldServerAddress.getText();
                int serverPort = Integer.decode(textFieldServerPort.getText());
                String fiboNumber = textFieldFiboNumber.getText();
                //myAgent.startAgentSmiths(numberOfAgent,interval,serverAddress,serverPort);
                
                GuiEvent ge = new GuiEvent(this, AgentCoordinator.MESSAGE_LAUNCH_AGENTS);
                SmithParameter sp = new SmithParameter();
                sp.type=AgentCoordinator.MESSAGE_LAUNCH_AGENTS;
                sp.serverAddress = serverAddress;
                sp.interval = interval;
                sp.numberOfAgent = numberOfAgent;
                sp.serverPort = serverPort;
                sp.fiboNumber = fiboNumber;
                ge.addParameter(sp);
                myAgent.postGuiEvent(ge);
                
                
            }
        }).start();
        buttonLaunchAgents.setEnabled(false);
        buttonKillAllAgents.setEnabled(true);
    }//GEN-LAST:event_buttonLaunchAgentsActionPerformed

    private void textFieldIntervalOfTickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIntervalOfTickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIntervalOfTickerActionPerformed

    private void buttonKillAllAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKillAllAgentsActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
               // try {
                  // myAgent.killAllAgentSmith();
                   GuiEvent ge = new GuiEvent(this, AgentCoordinator.MESSAGE_KILL_AGENTS);
                   myAgent.postGuiEvent(ge);
                   buttonLaunchAgents.setEnabled(true);
                   buttonKillAllAgents.setEnabled(false);
                //} catch (StaleProxyException ex) {
                //    Logger.getLogger(AgentCoordinatorUI.class.getName()).log(Level.SEVERE, null, ex);
                //}
            }
        }).start();
    }//GEN-LAST:event_buttonKillAllAgentsActionPerformed

    private void buttonRefreshNumberOfAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshNumberOfAgentsActionPerformed
        GuiEvent ge = new GuiEvent(this, AgentCoordinator.GET_NUMBER_OF_AGENTS);
        myAgent.postGuiEvent(ge);
    }//GEN-LAST:event_buttonRefreshNumberOfAgentsActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExitActionPerformed

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
            java.util.logging.Logger.getLogger(AgentCoordinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentCoordinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentCoordinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentCoordinatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentCoordinatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonKillAllAgents;
    private javax.swing.JButton buttonLaunchAgents;
    private javax.swing.JButton buttonRefreshNumberOfAgents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelIsReady;
    private javax.swing.JLabel labelNumberOfAgents;
    private javax.swing.JTextArea textAreaMachines;
    private javax.swing.JTextField textFieldFiboNumber;
    private javax.swing.JTextField textFieldIntervalOfTicker;
    private javax.swing.JTextField textFieldNumberOfAgents;
    private javax.swing.JTextField textFieldServerAddress;
    private javax.swing.JTextField textFieldServerPort;
    // End of variables declaration//GEN-END:variables


    public void setAgent(AgentCoordinator a) {
        myAgent = a;
    }
    
    public void updateNumberOfAgents(int numberOfAgents){
        labelNumberOfAgents.setText(String.valueOf(numberOfAgents));
    }
    class WindowEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent evt) {
            //myAgent.cleanUpStuffs();
        }
    }   
    
    public void setTextAreaContent(String content){
    	textAreaMachines.setText(content);
    }
    
    public void setStatus(String content){
    	labelIsReady.setText(content);
    }
}

