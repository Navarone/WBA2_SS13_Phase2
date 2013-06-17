package GUI;

import XMPP.PubSub;

/**
 *
 * @author FlorianWolf
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        schnaeppchenListeScrollPane = new javax.swing.JScrollPane();
        schnaeppchenListe = new javax.swing.JList();
        kategorienListe = new javax.swing.JComboBox();
        benutzerLabel = new javax.swing.JLabel();
        schnaeppchenScrollPane = new javax.swing.JScrollPane();
        schnaeppchenBeschreibung = new javax.swing.JTextArea();
        abonnementsButton = new javax.swing.JButton();
        neuesSchnaeppchenButton = new javax.swing.JButton();
        kommentarText = new javax.swing.JTextField();
        kommentarButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kategorien");

        schnaeppchenListeScrollPane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        schnaeppchenListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Schnäppchen 1", "Schnäppchen 2", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        schnaeppchenListeScrollPane.setViewportView(schnaeppchenListe);

        kategorienListe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alle Kategorien", "Elektronik", "Reisen", "Küche", "Haushalt", "Transportmittel", "Spielzeug", "Kleidung", "Freizeit", "Bücher", "Diverse", " " }));

        benutzerLabel.setText("Benutzer");

        schnaeppchenBeschreibung.setColumns(20);
        schnaeppchenBeschreibung.setRows(5);
        schnaeppchenBeschreibung.setText("Schnäppchen 1 Beschreibung");
        schnaeppchenScrollPane.setViewportView(schnaeppchenBeschreibung);

        abonnementsButton.setText("Abonnements");
        abonnementsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonnementsButtonActionPerformed(evt);
            }
        });

        neuesSchnaeppchenButton.setText("Neues Schnäppchen");
        neuesSchnaeppchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neuesSchnaeppchenButtonActionPerformed(evt);
            }
        });

        kommentarText.setText("Kommentar");

        kommentarButton.setText("Abschicken");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(kategorienListe, 0, 224, Short.MAX_VALUE)
                            .add(schnaeppchenListeScrollPane))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(schnaeppchenScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(kommentarText)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(kommentarButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(benutzerLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(neuesSchnaeppchenButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(abonnementsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(logoutButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(benutzerLabel)
                        .add(19, 19, 19))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(neuesSchnaeppchenButton)
                            .add(abonnementsButton)
                            .add(logoutButton))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(kategorienListe, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(schnaeppchenScrollPane)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, kommentarText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, kommentarButton)))
                    .add(schnaeppchenListeScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 318, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void neuesSchnaeppchenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neuesSchnaeppchenButtonActionPerformed

        NeuesSchnaeppchen dialog = new NeuesSchnaeppchen(null, true);
        dialog.setPubSub(ps);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_neuesSchnaeppchenButtonActionPerformed

    private void abonnementsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonnementsButtonActionPerformed

        Abos dialog = new Abos(null, true);
        dialog.setPubSub(ps);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_abonnementsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed

        ps.disconnect();
        dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abonnementsButton;
    private javax.swing.JLabel benutzerLabel;
    private javax.swing.JComboBox kategorienListe;
    private javax.swing.JButton kommentarButton;
    private javax.swing.JTextField kommentarText;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton neuesSchnaeppchenButton;
    private javax.swing.JTextArea schnaeppchenBeschreibung;
    private javax.swing.JList schnaeppchenListe;
    private javax.swing.JScrollPane schnaeppchenListeScrollPane;
    private javax.swing.JScrollPane schnaeppchenScrollPane;
    
    private PubSub ps;
    // End of variables declaration//GEN-END:variables
}
