package hu.jolka.szamologep;

/**
 *
 * @author jolka
 */
public class Szamologep extends javax.swing.JFrame {

    /**
     * Creates new form Szamologep
     */
    public Szamologep() {
        initComponents();
        eredmeny.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ketto = new javax.swing.JButton();
        egy = new javax.swing.JButton();
        harom = new javax.swing.JButton();
        negy = new javax.swing.JButton();
        ot = new javax.swing.JButton();
        torles = new javax.swing.JButton();
        het = new javax.swing.JButton();
        nyolc = new javax.swing.JButton();
        hat = new javax.swing.JButton();
        kilenc = new javax.swing.JButton();
        egyenlo = new javax.swing.JButton();
        vesszo = new javax.swing.JButton();
        hozzaadas = new javax.swing.JButton();
        kivonas = new javax.swing.JButton();
        osztas = new javax.swing.JButton();
        szorzas = new javax.swing.JButton();
        nulla = new javax.swing.JButton();
        teljesTorles = new javax.swing.JButton();
        eredmeny = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Számológép");
        setResizable(false);

        ketto.setText("2");
        ketto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kettoActionPerformed(evt);
            }
        });

        egy.setText("1");
        egy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyActionPerformed(evt);
            }
        });

        harom.setText("3");
        harom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haromActionPerformed(evt);
            }
        });

        negy.setText("4");
        negy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negyActionPerformed(evt);
            }
        });

        ot.setText("5");
        ot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otActionPerformed(evt);
            }
        });

        torles.setText("Törlés");
        torles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torlesActionPerformed(evt);
            }
        });

        het.setText("7");
        het.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hetActionPerformed(evt);
            }
        });

        nyolc.setText("8");
        nyolc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyolcActionPerformed(evt);
            }
        });

        hat.setText("6");
        hat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hatActionPerformed(evt);
            }
        });

        kilenc.setText("9");
        kilenc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilencActionPerformed(evt);
            }
        });

        egyenlo.setText("=");
        egyenlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egyenloActionPerformed(evt);
            }
        });

        vesszo.setText(",");
        vesszo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vesszoActionPerformed(evt);
            }
        });

        hozzaadas.setText("+");
        hozzaadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hozzaadasActionPerformed(evt);
            }
        });

        kivonas.setText("-");
        kivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivonasActionPerformed(evt);
            }
        });

        osztas.setText("/");
        osztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osztasActionPerformed(evt);
            }
        });

        szorzas.setText("*");
        szorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szorzasActionPerformed(evt);
            }
        });

        nulla.setText("0");
        nulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nullaActionPerformed(evt);
            }
        });

        teljesTorles.setText("Teljes törlés");
        teljesTorles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teljesTorlesActionPerformed(evt);
            }
        });

        eredmeny.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eredmeny)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(negy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kivonas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(egy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vesszo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nulla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(egyenlo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(osztas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ketto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(harom, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(szorzas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(het, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nyolc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(teljesTorles, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kilenc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(torles, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(eredmeny, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(torles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teljesTorles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(het, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyolc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilenc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hozzaadas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(negy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kivonas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ketto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(egy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harom, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szorzas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(egyenlo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vesszo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(osztas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nulla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void egyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyActionPerformed
        hozzaIr("1");
    }//GEN-LAST:event_egyActionPerformed

    private void kettoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kettoActionPerformed
        hozzaIr("2");
    }//GEN-LAST:event_kettoActionPerformed

    private void haromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haromActionPerformed
        hozzaIr("3");
    }//GEN-LAST:event_haromActionPerformed

    private void nullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nullaActionPerformed
        hozzaIr("0");
    }//GEN-LAST:event_nullaActionPerformed

    private void negyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negyActionPerformed
        hozzaIr("4");
    }//GEN-LAST:event_negyActionPerformed

    private void otActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otActionPerformed
        hozzaIr("5");
    }//GEN-LAST:event_otActionPerformed

    private void hatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hatActionPerformed
        hozzaIr("6");
    }//GEN-LAST:event_hatActionPerformed

    private void hetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hetActionPerformed
        hozzaIr("7");
    }//GEN-LAST:event_hetActionPerformed

    private void nyolcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyolcActionPerformed
        hozzaIr("8");
    }//GEN-LAST:event_nyolcActionPerformed

    private void kilencActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilencActionPerformed
        hozzaIr("9");
    }//GEN-LAST:event_kilencActionPerformed

    private void torlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torlesActionPerformed
        if (!eredmeny.getText().trim().isEmpty()) {
            String er = eredmeny.getText();
            eredmeny.setText(er.substring(0, er.length() - 1));
        }
    }//GEN-LAST:event_torlesActionPerformed

    private void teljesTorlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teljesTorlesActionPerformed
        eredmeny.setText("");
    }//GEN-LAST:event_teljesTorlesActionPerformed

    private void vesszoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vesszoActionPerformed
        if (!isUtolsoKarakterOperator() && isUtolsoKarakterSzam()) {
            hozzaIr(",");
        }
    }//GEN-LAST:event_vesszoActionPerformed

    private void hozzaadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hozzaadasActionPerformed
        if (!isUtolsoKarakterOperator()) {
            hozzaIr("+");
        }
    }//GEN-LAST:event_hozzaadasActionPerformed

    private void kivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kivonasActionPerformed
        if (!isUtolsoKarakterOperator()) {
            hozzaIr("-");
        }
    }//GEN-LAST:event_kivonasActionPerformed

    private void szorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szorzasActionPerformed
        if (!isUtolsoKarakterOperator()) {
            hozzaIr("*");
        }
    }//GEN-LAST:event_szorzasActionPerformed

    private void osztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osztasActionPerformed
        if (!isUtolsoKarakterOperator()) {
            hozzaIr("/");
        }
    }//GEN-LAST:event_osztasActionPerformed

    private void egyenloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egyenloActionPerformed
        // TODO add your handling code here:
        System.out.println("ki kell számolni a következőt: " + eredmeny.getText());
    }//GEN-LAST:event_egyenloActionPerformed

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
            java.util.logging.Logger.getLogger(Szamologep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szamologep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szamologep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szamologep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szamologep().setVisible(true);
            }
        });
    }

    private void hozzaIr(String s) {
        eredmeny.setText(eredmeny.getText() + s);
    }

    private boolean isUtolsoKarakterOperator() {
        if (!eredmeny.getText().trim().isEmpty()) {
            int hossz = eredmeny.getText().length();
            String utolsoKarakter = eredmeny.getText().substring(hossz - 1, hossz);
            switch (utolsoKarakter) {
                case "+":
                case "-":
                case "*":
                case "/":
                case ",":
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }

    private boolean isUtolsoKarakterSzam() {
        if (!eredmeny.getText().trim().isEmpty()) {
            int hossz = eredmeny.getText().length();
            String utolsoKarakter = eredmeny.getText().substring(hossz - 1, hossz);
            switch (utolsoKarakter) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton egy;
    private javax.swing.JButton egyenlo;
    private javax.swing.JTextField eredmeny;
    private javax.swing.JButton harom;
    private javax.swing.JButton hat;
    private javax.swing.JButton het;
    private javax.swing.JButton hozzaadas;
    private javax.swing.JButton ketto;
    private javax.swing.JButton kilenc;
    private javax.swing.JButton kivonas;
    private javax.swing.JButton negy;
    private javax.swing.JButton nulla;
    private javax.swing.JButton nyolc;
    private javax.swing.JButton osztas;
    private javax.swing.JButton ot;
    private javax.swing.JButton szorzas;
    private javax.swing.JButton teljesTorles;
    private javax.swing.JButton torles;
    private javax.swing.JButton vesszo;
    // End of variables declaration//GEN-END:variables
}
