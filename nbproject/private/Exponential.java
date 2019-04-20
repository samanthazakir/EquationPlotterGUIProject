
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Exponential extends javax.swing.JFrame {

    /**
     * Creates new form Exponential
     */
    public Exponential() {
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
            JFreeChart xylineChart = ChartFactory.createXYLineChart(chartTitle ,"Category" ,"Score" ,dataset ,PlotOrientation.VERTICAL ,true , true , false);

            ChartPanel chartPanel = new ChartPanel( xylineChart );
            chartPanel.setPreferredSize( new java.awt.Dimension( 1200 , 450 ) );
            XYPlot plot = xylineChart.getXYPlot( );
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
            renderer.setSeriesPaint( 0 , Color.GREEN );
            renderer.setSeriesStroke( 0 , new BasicStroke( 1.0f ) );
            plot.setRenderer( renderer );
            setContentPane( chartPanel );
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

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Telenor", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exponential function: f(x) = e^x");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 50, 660, 90);

        jLabel4.setFont(new java.awt.Font("Telenor", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Values of range:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 640, 270, 37);

        jButton4.setFont(new java.awt.Font("Telenor", 1, 24)); // NOI18N
        jButton4.setText("Low: ");
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 710, 90, 50);

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(420, 700, 60, 60);

        jButton5.setFont(new java.awt.Font("Telenor", 1, 24)); // NOI18N
        jButton5.setText("High:");
        getContentPane().add(jButton5);
        jButton5.setBounds(620, 710, 90, 50);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(730, 700, 60, 60);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1280, 740, 55, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\background new.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1440, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
            double i, x, y;
        int a, b;
        a=(int)jSpinner1.getValue();
        b=(int)jSpinner2.getValue();
        //Using jFreeChart to form the chart
        String s = "y = |x| from " + a + " to " + b;
        XYSeries graph = new XYSeries(s);
        for(i=a; i<=b; i+=0.01){
            x = i;
            y = Math.abs(x);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new options().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Exponential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exponential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exponential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exponential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exponential().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
