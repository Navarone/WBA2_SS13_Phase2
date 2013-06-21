package GUI;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.jivesoftware.smack.XMPPException;

import REST.RestService;
import XMPP.PubSub;


/**
 *
 * @author FlorianWolf
 */
public class NeuesSchnaeppchen extends javax.swing.JDialog {

    /**
     * Creates new form NeuesSchnaeppchen2
     */
    public NeuesSchnaeppchen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        uvpWaehrungComboBox.setVisible(false);
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

        titelLabel = new javax.swing.JLabel();
        titelTextField = new javax.swing.JTextField();
        urlTextField = new javax.swing.JTextField();
        urlLabel = new javax.swing.JLabel();
        bildTextField = new javax.swing.JTextField();
        bildLabel = new javax.swing.JLabel();
        kategorieComboBox = new javax.swing.JComboBox();
        kategorieLabel = new javax.swing.JLabel();
        marktTextField = new javax.swing.JTextField();
        marktLabel = new javax.swing.JLabel();
        preisTextField = new javax.swing.JTextField();
        preisLabel = new javax.swing.JLabel();
        uvpTextField = new javax.swing.JTextField();
        uvpLabel = new javax.swing.JLabel();
        uvpWaehrungComboBox = new javax.swing.JComboBox();
        preisWaehrungComboBox = new javax.swing.JComboBox();
        textTextField = new javax.swing.JTextField();
        textLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        ueberschriftLabel = new javax.swing.JLabel();
        zurueckButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titelLabel.setText("Titel");

        urlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextFieldActionPerformed(evt);
            }
        });

        urlLabel.setText("URL");

        bildLabel.setText("Bild");

        kategorieComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elektronik", "Reisen", "Kueche", "Haushalt", "Transportmittel", "Spielzeug", "Kleidung", "Freizeit", "Buecher", "Diverse", " " }));
        kategorieComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kategorieComboBoxActionPerformed(evt);
            }
        });

        kategorieLabel.setText("Kategorie");

        marktTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marktTextFieldActionPerformed(evt);
            }
        });

        marktLabel.setText("Markt");

        preisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preisTextFieldActionPerformed(evt);
            }
        });

        preisLabel.setText("Preis");

        uvpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvpTextFieldActionPerformed(evt);
            }
        });

        uvpLabel.setText("UVP");

        uvpWaehrungComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euro", "USD", "Pfund", " " }));

        preisWaehrungComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euro", "USD", "Pfund", "" }));

        textTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTextFieldActionPerformed(evt);
            }
        });

        textLabel.setText("Text");

        okButton.setText("Bestaetigen");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					okButtonActionPerformed(evt);
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        ueberschriftLabel.setText("Schnaeppchen Erstellen");

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
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(zurueckButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(okButton))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(preisLabel)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(preisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(marktLabel)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(marktTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(titelLabel)
                                        .add(139, 139, 139)
                                        .add(titelTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(bildLabel)
                                            .add(kategorieLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(urlLabel))
                                        .add(94, 94, 94)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(urlTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                                .add(bildTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                .add(kategorieComboBox, 0, 1, Short.MAX_VALUE)))))
                                .add(layout.createSequentialGroup()
                                    .add(uvpLabel)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(uvpTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(uvpWaehrungComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(preisWaehrungComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                            .add(textLabel)
                            .add(139, 139, 139)
                            .add(textTextField)))
                    .add(ueberschriftLabel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(ueberschriftLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titelLabel)
                    .add(titelTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(kategorieComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(kategorieLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bildTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bildLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(urlLabel)
                    .add(urlTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(marktLabel)
                    .add(marktTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(preisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(preisWaehrungComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(preisLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(uvpTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(uvpLabel)
                    .add(uvpWaehrungComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(textLabel)
                    .add(textTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(okButton)
                    .add(zurueckButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlTextFieldActionPerformed

    private void kategorieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kategorieComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kategorieComboBoxActionPerformed

    private void marktTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marktTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marktTextFieldActionPerformed

    private void preisTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preisTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preisTextFieldActionPerformed

    private void uvpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uvpTextFieldActionPerformed

    private void textTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTextFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) throws JAXBException, IOException {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
    	RestService rest = new RestService();
    	int id = rest.getAllSchnaeppchen(null).getSchnaeppchen().size();
    	String titel = titelTextField.getText();
    	int benutzerid;
		if(ps.benutzer.equals("user1"))
    		benutzerid = 1;
    	else
    		benutzerid = 2;
    	
    	String kategorie = kategorieComboBox.getSelectedItem().toString();
    	String URL = urlTextField.getText();
    	int markt = 2;
    	String preis = preisTextField.getText();
    	String preiswaehrung = preisWaehrungComboBox.getSelectedItem().toString();
    	String uvp = uvpTextField.getText();
    	String text = textTextField.getText();
    	String datum = "24.11.2010";
    	String uhr = "11:12";
    	rest.createSchnaeppchen(id, titel, benutzerid, kategorie, URL, markt, preis, preiswaehrung,uvp , text, datum, uhr);
    	try {
			ps.addPayloadMessage(Integer.toString(id), kategorie, titel, datum, uhr, preis);
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
            java.util.logging.Logger.getLogger(NeuesSchnaeppchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeuesSchnaeppchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeuesSchnaeppchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeuesSchnaeppchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NeuesSchnaeppchen dialog = new NeuesSchnaeppchen(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel bildLabel;
    private javax.swing.JTextField bildTextField;
    private javax.swing.JComboBox kategorieComboBox;
    private javax.swing.JLabel kategorieLabel;
    private javax.swing.JLabel marktLabel;
    private javax.swing.JTextField marktTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel preisLabel;
    private javax.swing.JTextField preisTextField;
    private javax.swing.JComboBox preisWaehrungComboBox;
    private javax.swing.JLabel textLabel;
    private javax.swing.JTextField textTextField;
    private javax.swing.JLabel titelLabel;
    private javax.swing.JTextField titelTextField;
    private javax.swing.JLabel ueberschriftLabel;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JLabel uvpLabel;
    private javax.swing.JTextField uvpTextField;
    private javax.swing.JComboBox uvpWaehrungComboBox;
    private javax.swing.JButton zurueckButton;
    
    private PubSub ps;

    // End of variables declaration//GEN-END:variables
}
