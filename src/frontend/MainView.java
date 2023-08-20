/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

/**
 *
 * @author Diego
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
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

        panel_bg = new javax.swing.JPanel();
        panel_footer = new javax.swing.JPanel();
        img_philosopher1 = new javax.swing.JLabel();
        img_philosopher2 = new javax.swing.JLabel();
        img_philosopher3 = new javax.swing.JLabel();
        img_philosopher4 = new javax.swing.JLabel();
        img_philosopher5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_bg.setBackground(new java.awt.Color(102, 0, 0));

        panel_footer.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_footerLayout = new javax.swing.GroupLayout(panel_footer);
        panel_footer.setLayout(panel_footerLayout);
        panel_footerLayout.setHorizontalGroup(
            panel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        panel_footerLayout.setVerticalGroup(
            panel_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        img_philosopher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eating.png"))); // NOI18N

        img_philosopher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N

        img_philosopher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waiting.png"))); // NOI18N

        img_philosopher4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sleeping.png"))); // NOI18N

        img_philosopher5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thinking.png"))); // NOI18N

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(img_philosopher1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_philosopher3)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(img_philosopher4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_philosopher2)
                .addGap(93, 93, 93))
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_bgLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(img_philosopher5)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(img_philosopher1)
                .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(img_philosopher2))
                    .addGroup(panel_bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(img_philosopher4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img_philosopher3)
                .addGap(33, 33, 33)
                .addComponent(panel_footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                    .addContainerGap(275, Short.MAX_VALUE)
                    .addComponent(img_philosopher5)
                    .addGap(202, 202, 202)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_philosopher1;
    private javax.swing.JLabel img_philosopher2;
    private javax.swing.JLabel img_philosopher3;
    private javax.swing.JLabel img_philosopher4;
    private javax.swing.JLabel img_philosopher5;
    private javax.swing.JPanel panel_bg;
    private javax.swing.JPanel panel_footer;
    // End of variables declaration//GEN-END:variables
}