/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gs.nom.mx.views;

import java.awt.BorderLayout;
import java.awt.Window;
import javax.swing.JProgressBar;

/**
 *
 * @author Temporal
 */
public class DialogLoading extends javax.swing.JDialog {

    private JProgressBar progressBar;
    /**
     * Creates new form DialogLoading
     * @param owner
     */
    public DialogLoading(Window owner) {
        super(owner);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        initComponents();
        progressBar = new JProgressBar();
        init();
    }
    
    private void init(){
        progressBar.setIndeterminate(true);
        panelContenido.add(progressBar, BorderLayout.CENTER);
    }
    
    public void setIndeterminateMode(){
        progressBar.setIndeterminate(true);
        progressBar.setStringPainted(false);
    }
    
    public void setScaleMode(){
        progressBar.setIndeterminate(false);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        
    }
    public void setValueBar(int value){
        progressBar.setValue(value);
        progressBar.setString(value + "%");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelContenido.setForeground(new java.awt.Color(102, 153, 0));
        panelContenido.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables
}
