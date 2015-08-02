package Assignment2;



import java.awt.Color;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;


public class CrawlerGUI extends javax.swing.JFrame {
    private double startTime, stopTime;
    /**
     * Creates new form CrawlerGUI
     */
    public CrawlerGUI() {
        initComponents();
    }
    
    public void startTimer() {
        //Check time when URLs are submitted.
        startTime = System.nanoTime();
    }
    
    public void stopTimer() {
        //Check time when threads are done.
        stopTime = System.nanoTime();
    }
    
    public Double getTimeElapsed() {
        double timeElapsed = stopTime - startTime;
        return Double.parseDouble(new DecimalFormat("#.##").format(timeElapsed / 1000000000));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        wcLabel = new javax.swing.JLabel();
        spideImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userUrl1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        userUrl2 = new javax.swing.JTextPane();
        url2Label = new javax.swing.JLabel();
        url1Label = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        validate1 = new javax.swing.JLabel();
        validate2 = new javax.swing.JLabel();
        timeTakenLabel = new javax.swing.JLabel();
        retrievalTimeTaken = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        wcLabel.setBackground(new java.awt.Color(204, 0, 51));
        wcLabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        wcLabel.setForeground(new java.awt.Color(204, 0, 51));
        wcLabel.setText("Web Crawler");

        spideImage.setText("jLabel1");

        userUrl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userUrl1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(userUrl1);

        userUrl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userUrl2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(userUrl2);

        url2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        url2Label.setForeground(new java.awt.Color(102, 204, 0));
        url2Label.setText("Url2:");

        url1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        url1Label.setForeground(new java.awt.Color(102, 204, 0));
        url1Label.setText("Url1:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "URL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        validate1.setForeground(new java.awt.Color(255, 0, 0));

        validate2.setForeground(new java.awt.Color(255, 0, 51));

        timeTakenLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        timeTakenLabel.setForeground(new java.awt.Color(102, 204, 0));
        timeTakenLabel.setText("Time Taken (URL Retrieval) :");

        retrievalTimeTaken.setEditable(false);
        retrievalTimeTaken.setText("0.00 s");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(wcLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 359, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(url2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(url1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(validate2)
                                .addGap(37, 37, 37)
                                .addComponent(submitBtn))
                            .addComponent(validate1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(timeTakenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(retrievalTimeTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE))
                        .addGap(171, 171, 171)))
                .addComponent(spideImage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(wcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(url1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validate1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(spideImage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(url2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(submitBtn)
                                .addComponent(validate2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeTakenLabel)
                    .addComponent(retrievalTimeTaken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (!jTable1.isEnabled()) {
            jTable1.setEnabled(true);
        }
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        LinkedList<String> storedUrls = new LinkedList<>(); //stored validated url
        boolean isValidUrl1, isValidUrl2;
        //String firstUrl, secondUrl;
        isValidUrl1 = validateUrl(userUrl1.getText()); //validate user's urls
        isValidUrl2 = validateUrl(userUrl2.getText());
        
        //Create threads.
        CrawlerUser crawler = new CrawlerUser();
        Thread t1 = new ThreadMethod(crawler, userUrl1.getText());
        t1.setName("t1");

        Thread t2 = new ThreadMethod(crawler, userUrl2.getText());
        t2.setName("t2");
        
        if (isValidUrl1) { 
            if (isValidUrl2) { 
                startTimer();
                t1.start();
                t2.start();
                while (t1.isAlive() || t2.isAlive()) {
                    stopTimer();
                }
            } else { //Only URL 1 is valid.
                t2 = new ThreadMethod(crawler);
                t2.setName("t2Assist");
                startTimer();
                t1.start();
                t2.start();
                while (t1.isAlive() || t2.isAlive()) {
                    stopTimer();
                }
            }
        } else if (isValidUrl2) { //URL 1 is not valid, check URL 2.
            t1 = new ThreadMethod(crawler);
            t1.setName("t1Assist");
            startTimer();
            t2.start();
            t1.start();
            while (t1.isAlive() || t2.isAlive()) {
                stopTimer();
            }
        } else { //Both are not valid.
            JOptionPane.showMessageDialog(null, "Connection cannot be established. Check your Internet connection and your links again.");
        }
        
        if (!t1.isAlive() && !t2.isAlive()) {
            retrievalTimeTaken.setText(getTimeElapsed() + " s");
            crawler.addRows();
        }
        
         

    }//GEN-LAST:event_submitBtnActionPerformed
      
    public boolean validateUrl(String url) {
        boolean validUrl;
        Pattern p = Pattern.compile("^(http:\\/\\/|https:\\/\\/|ftp:\\/\\/)(www.|web.|.....)(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?(([0-9]{1,3}\\.){3}[0-9]{1,3}|([0-9a-z_!~*'()-]+)*\\.([0-9a-z][0-9a-z-]{0,61})?[0-9a-z][a-z]{1,6})(:[0-9]{1,4})?((/?)|(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)?\\.?(\\w{2,3})?((/?)|(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$");
        Matcher m1 = p.matcher(url);
        validUrl = m1.matches();
        if (validUrl) {
            validUrl = true;
        } else {
            validUrl = false;
        }
        return validUrl;
    }
    private void userUrl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userUrl1KeyReleased
        boolean validLabel1;
        validLabel1 = validateUrl(userUrl1.getText());
        if (validLabel1) {
            validate1.setForeground(Color.green);
            validate1.setText("Valid");
        } else {
            validate1.setForeground(Color.red);
            validate1.setText("Invalid");
        }
    }//GEN-LAST:event_userUrl1KeyReleased
    
    private void userUrl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userUrl2KeyReleased
        // TODO add your handling code here:
        boolean validLabel2 = validateUrl(userUrl2.getText());
        if (validLabel2) {
            validate2.setForeground(Color.green);

            validate2.setText("Valid");
        } else {
            validate2.setForeground(Color.red);
            validate2.setText("Invalid");
        }
    }//GEN-LAST:event_userUrl2KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRow() != -1) {
        int row = jTable1.getSelectedRow();
        String clickedUrl = (String) jTable1.getValueAt(row, 0);
        PageRead PR = new PageRead();
        ArrayList<String> Texts = new ArrayList<>();
            try {
                Texts = PR.getUrlText(clickedUrl);
            } catch (IOException ex) {
                Logger.getLogger(CrawlerGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        String texts = "";
        for (String text : Texts) {
            //  jTextArea1.setText(text);
            
            texts += text;
            
        }
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setText(texts);
        }
        if (jTextArea1.getText().isEmpty()) {
            jTextArea1.setText("Text cannot be loaded from URL.");
        }
      
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(CrawlerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrawlerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrawlerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrawlerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrawlerGUI().setVisible(true);
                userUrl1.setText("http://");
                userUrl2.setText("http://");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField retrievalTimeTaken;
    private static javax.swing.JLabel spideImage;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel timeTakenLabel;
    private javax.swing.JLabel url1Label;
    private javax.swing.JLabel url2Label;
    private static javax.swing.JTextPane userUrl1;
    private static javax.swing.JTextPane userUrl2;
    private javax.swing.JLabel validate1;
    private javax.swing.JLabel validate2;
    private javax.swing.JLabel wcLabel;
    // End of variables declaration//GEN-END:variables

}
