package GUI;

import org.jivesoftware.smack.XMPPException;

import XMPP.PubSub;


/**
 *
 * @author FlorianWolf
 */
public class Abos extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public Abos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        zurueckButton.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elektronikBox = new javax.swing.JCheckBox();
        reisenBox = new javax.swing.JCheckBox();
        kuecheBox = new javax.swing.JCheckBox();
        haushaltBox = new javax.swing.JCheckBox();
        transportBox = new javax.swing.JCheckBox();
        spielzeugBox = new javax.swing.JCheckBox();
        kleidungBox = new javax.swing.JCheckBox();
        freizeitBox = new javax.swing.JCheckBox();
        buecherBox = new javax.swing.JCheckBox();
        diverseBox = new javax.swing.JCheckBox();
        okButton = new javax.swing.JButton();
        ueberschriftLabel = new javax.swing.JLabel();
        zurueckButton = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        elektronikBox.setText("Elektronik");
        elektronikBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektronikBoxActionPerformed(evt);
            }
        });
        
        
        reisenBox.setText("Reisen");
        reisenBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reisenBoxActionPerformed(evt);
            }
        });

        kuecheBox.setText("Kueche");

        haushaltBox.setText("Haushalt");

        transportBox.setText("Transportmittel");

        spielzeugBox.setText("Spielzeug");

        kleidungBox.setText("Kleidung");

        freizeitBox.setText("Freizeit");

        buecherBox.setText("Buecher");

        diverseBox.setText("Diverse");

        okButton.setText("Bestaetigen");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        ueberschriftLabel.setText("Abonnements verwalten");

        zurueckButton.setText("Zurueck");
        zurueckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zurueckButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(zurueckButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(okButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(elektronikBox)
                                    .add(reisenBox)
                                    .add(kuecheBox)
                                    .add(haushaltBox)
                                    .add(transportBox))
                                .add(72, 72, 72)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(diverseBox)
                                    .add(buecherBox)
                                    .add(freizeitBox)
                                    .add(kleidungBox)
                                    .add(spielzeugBox)))
                            .add(ueberschriftLabel))
                        .add(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(ueberschriftLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(elektronikBox)
                    .add(spielzeugBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(kleidungBox)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, reisenBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(freizeitBox)
                    .add(kuecheBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(haushaltBox)
                    .add(buecherBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(transportBox)
                    .add(diverseBox))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(okButton)
                    .add(zurueckButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reisenBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reisenBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reisenBoxActionPerformed
    
    private void elektronikBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reisenBoxActionPerformed
        // TODO add your handling code here:
    		
    }//GEN-LAST:event_reisenBoxActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
    	try {
			changeSubscriptions();
		} catch (XMPPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_okButtonActionPerformed

    private void zurueckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zurueckButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zurueckButtonActionPerformed

	public void setPubSub(PubSub ps){
	    	
	    	this.ps=ps;
	    	
	}
	
	public void checkSubscriptions() throws XMPPException{
		if(ps.isSubscriberof("Elektronik"))
			elektronikBox.setSelected(true);
		
		if(ps.isSubscriberof("Reisen"))
			reisenBox.setSelected(true);
		
		if(ps.isSubscriberof("Kueche"))
			kuecheBox.setSelected(true);
		
		if(ps.isSubscriberof("Haushalt"))
			haushaltBox.setSelected(true);
		
		if(ps.isSubscriberof("Transportmittel"))
			transportBox.setSelected(true);
		
		if(ps.isSubscriberof("Spielzeug"))
			spielzeugBox.setSelected(true);
		
		if(ps.isSubscriberof("Kleidung"))
			kleidungBox.setSelected(true);
		
		if(ps.isSubscriberof("Freizeit"))
			freizeitBox.setSelected(true);
		
		if(ps.isSubscriberof("Buecher"))
			buecherBox.setSelected(true);
		
		if(ps.isSubscriberof("Diverse"))
			diverseBox.setSelected(true);
			
	}
	
	public void changeSubscriptions() throws XMPPException{
		if(elektronikBox.isSelected()==true&&ps.isSubscriberof("Elektronik")==false){
			ps.subscribe("Elektronik");
			
		}
		if(elektronikBox.isSelected()==false&&ps.isSubscriberof("Elektronik")==true){
			ps.unsubscribe("Elektronik");
			
		}
		
		if(reisenBox.isSelected()==true&&ps.isSubscriberof("Reisen")==false){
			ps.subscribe("Reisen");
			
		}
		if(reisenBox.isSelected()==false&&ps.isSubscriberof("Reisen")==true){
			ps.unsubscribe("Reisen");
			
		}
		
		if(kuecheBox.isSelected()==true&&ps.isSubscriberof("Kueche")==false){
			ps.subscribe("Kueche");
			
		}
		if(kuecheBox.isSelected()==false&&ps.isSubscriberof("Kueche")==true){
			ps.unsubscribe("Kueche");
			
		}
		
		if(haushaltBox.isSelected()==true&&ps.isSubscriberof("Haushalt")==false){
			ps.subscribe("Haushalt");
			
		}
		if(haushaltBox.isSelected()==false&&ps.isSubscriberof("Haushalt")==true){
			ps.unsubscribe("Haushalt");
			
		}
		
		if(transportBox.isSelected()==true&&ps.isSubscriberof("Transportmittel")==false){
			ps.subscribe("Transportmittel");
			
		}
		if(transportBox.isSelected()==false&&ps.isSubscriberof("Transportmittel")==true){
			ps.unsubscribe("Transportmittel");
			
		}
		
		if(spielzeugBox.isSelected()==true&&ps.isSubscriberof("Spielzeug")==false){
			ps.subscribe("Spielzeug");
			
		}
		if(spielzeugBox.isSelected()==false&&ps.isSubscriberof("Spielzeug")==true){
			ps.unsubscribe("Spielzeug");
			
		}
		
		if(kleidungBox.isSelected()==true&&ps.isSubscriberof("Kleidung")==false){
			ps.subscribe("Kleidung");
			
		}
		if(kleidungBox.isSelected()==false&&ps.isSubscriberof("Kleidung")==true){
			ps.unsubscribe("Kleidung");
			
		}
		
		if(freizeitBox.isSelected()==true&&ps.isSubscriberof("Freizeit")==false){
			ps.subscribe("Freizeit");
			
		}
		if(freizeitBox.isSelected()==false&&ps.isSubscriberof("Freizeit")==true){
			ps.unsubscribe("Freizeit");
			
		}
		
		if(buecherBox.isSelected()==true&&ps.isSubscriberof("Buecher")==false){
			ps.subscribe("Buecher");
			
		}
		if(buecherBox.isSelected()==false&&ps.isSubscriberof("Buecher")==true){
			ps.unsubscribe("Buecher");
			
		}
		
		if(diverseBox.isSelected()==true&&ps.isSubscriberof("Diverse")==false){
			ps.subscribe("Diverse");
			
		}
		if(diverseBox.isSelected()==false&&ps.isSubscriberof("Diverse")==true){
			ps.unsubscribe("Diverse");
			
		}
		
	}
    
    
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
            java.util.logging.Logger.getLogger(Abos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Abos dialog = new Abos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox buecherBox;
    private javax.swing.JCheckBox diverseBox;
    private javax.swing.JCheckBox elektronikBox;
    private javax.swing.JCheckBox freizeitBox;
    private javax.swing.JCheckBox haushaltBox;
    private javax.swing.JCheckBox kleidungBox;
    private javax.swing.JCheckBox kuecheBox;
    private javax.swing.JButton okButton;
    private javax.swing.JCheckBox reisenBox;
    private javax.swing.JCheckBox spielzeugBox;
    private javax.swing.JCheckBox transportBox;
    private javax.swing.JLabel ueberschriftLabel;
    private javax.swing.JButton zurueckButton;
    
    private PubSub ps;
    // End of variables declaration//GEN-END:variables
}
