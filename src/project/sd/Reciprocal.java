/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.sd;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Toolkit;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 *
 */
public class Reciprocal extends javax.swing.JFrame {

    /**
     * Creates new form Reciprocal
     */
    public Reciprocal() {
        this.setUndecorated (true);
        this.setVisible (true);
        this.setAlwaysOnTop (true);
        this.setResizable (false);

        initComponents();

        Toolkit tk = Toolkit.getDefaultToolkit();

        //int xsize,ysize;
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();

        this.setSize (xsize,ysize);


    }
public class XYLineChart_AWT extends ApplicationFrame
    {
        public XYLineChart_AWT( String applicationTitle, String chartTitle, XYSeriesCollection dataset )
        {
            super(applicationTitle);
            this.setUndecorated(true);
            JFreeChart xylineChart = ChartFactory.createXYLineChart(chartTitle ,"Category" ,"Score" ,dataset ,PlotOrientation.VERTICAL ,true , true , false);

            ChartPanel chartPanel = new ChartPanel( xylineChart );
            chartPanel.setPreferredSize( new java.awt.Dimension( 1200 , 450 ) );
            XYPlot plot = xylineChart.getXYPlot( );
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
            renderer.setSeriesPaint( 0 , Color.BLUE );
            renderer.setSeriesStroke( 0 , new BasicStroke( 1.0f ) );
            plot.setRenderer( renderer );
            setContentPane( chartPanel );
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

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(440, 650, 60, 60);

        jSpinner2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(700, 650, 60, 60);

        jLabel2.setFont(new java.awt.Font("Telenor", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Values of range:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 570, 340, 80);

        jButton1.setText("Back\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1270, 700, 73, 23);

        jButton4.setFont(new java.awt.Font("Telenor", 1, 24)); // NOI18N
        jButton4.setText("Low: ");
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 660, 90, 50);

        jButton5.setFont(new java.awt.Font("Telenor", 1, 24)); // NOI18N
        jButton5.setText("High:");
        getContentPane().add(jButton5);
        jButton5.setBounds(590, 660, 90, 50);

        jLabel6.setFont(new java.awt.Font("Telenor", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reciprocal Function. f(x) = 1/x");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 40, 660, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\background new.jpg")); // NOI18N
        jLabel1.setText("Values of range:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -390, 1440, 1600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new Options().setVisible (true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
double i, x, y;
        int a, b, a1, b1;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        //Using jFreeChart to form the chart
        String s = "y = 1/x from " + a + " to " + b;
        a1=min(a,b);
        b1=max(a,b);
        XYSeries graph = new XYSeries(s);
        for(i=a1; i<=b1; i+=0.01){
            if(i>=-0.50 && i<=0.50)
            {
                i=0.50;
                continue;
            }
            x = i;
            y = x*x;
            graph.add(x,y);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(graph);
        XYLineChart_AWT chart = new XYLineChart_AWT("Graph", " ", dataset); // This constructor is given above
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setAlwaysOnTop(true);
            // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
double i, x, y;
        int a, b, a1, b1;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        //Using jFreeChart to form the chart
        String s = "y = 1/x from " + a + " to " + b;
        a1=min(a,b);
        b1=max(a,b);
        XYSeries graph = new XYSeries(s);
        for(i=a1; i<=b1; i+=0.01){
            if(i>=-0.50 && i<=0.50)
            {
                i=0.50;
                continue;
            }
            x = i;
            y = x*x;
            graph.add(x,y);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(graph);
        XYLineChart_AWT chart = new XYLineChart_AWT("Graph", " ", dataset); // This constructor is given above
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        chart.setAlwaysOnTop(true);
            // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner2StateChanged

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
            java.util.logging.Logger.getLogger(Reciprocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reciprocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reciprocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reciprocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reciprocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
