package com.nicolas.hostal.vista.reservas;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class ReservarFrame extends javax.swing.JFrame {

    public ReservarFrame() {
        initComponents();
        setTitle("Reservar");
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        Calendar a = new GregorianCalendar();
        a.add(Calendar.MINUTE, 5);
        date_ingreso.setCalendar(a);
        date_salida.setCalendar(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date_ingreso = new com.toedter.calendar.JDateChooser();
        date_salida = new com.toedter.calendar.JDateChooser();
        btn_tres = new javax.swing.JButton();
        btn_veinticuatro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI del cliente:");

        jLabel2.setText("Habitación:");

        jLabel3.setText("Hora de ingreso:");

        jLabel4.setText("Hora de salida:");

        date_ingreso.setDateFormatString("dd/MM/yyyy HH:mm");

        date_salida.setDateFormatString("dd/MM/yyyy HH:mm");

        btn_tres.setText("+ 3 horas");
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_veinticuatro.setText("+ 24 horas");
        btn_veinticuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_veinticuatroActionPerformed(evt);
            }
        });

        jLabel5.setText("N°de personas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(date_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_veinticuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tres)
                    .addComponent(btn_veinticuatro))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(date_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_tresActionPerformed
        try {
            // Obtener la fecha seleccionada
            Calendar selectedDate = date_ingreso.getCalendar();

            // Obtener la fecha actual
            Calendar currentDate = new GregorianCalendar();

            // Comparar la fecha seleccionada con la fecha actual
            if (selectedDate.after(currentDate)) {
                // Agregar 3 horas a la fecha seleccionada
                selectedDate.add(Calendar.HOUR_OF_DAY, 3);

                // Establecer la fecha actualizada como fecha de salida
                date_salida.setCalendar(selectedDate);
            } else {
                // Automáticamente la fecha de ingreso es la actual más 5 minutos
                selectedDate = new GregorianCalendar();
                selectedDate.add(Calendar.MINUTE, 5);
                date_ingreso.setCalendar(selectedDate);

                // Sumarle 3 horas a la fecha de salida
                selectedDate.add(Calendar.HOUR_OF_DAY, 3);

                // Establecer la fecha de salida
                date_salida.setCalendar(selectedDate);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fecha de ingreso inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btn_tresActionPerformed

    private void btn_veinticuatroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_veinticuatroActionPerformed
        try {
            // Obtener la fecha seleccionada
            Calendar selectedDate = date_ingreso.getCalendar();

            // Obtener la fecha actual
            Calendar currentDate = new GregorianCalendar();

            // Comparar la fecha seleccionada con la fecha actual
            if (selectedDate.after(currentDate)) {
                // Agregar 24 horas a la fecha seleccionada
                selectedDate.add(Calendar.HOUR_OF_DAY, 24);

                // Establecer la fecha actualizada como fecha de salida
                date_salida.setCalendar(selectedDate);
            } else {
                // Automáticamente la fecha de ingreso es la actual más 5 minutos
                selectedDate = new GregorianCalendar();
                selectedDate.add(Calendar.MINUTE, 5);
                date_ingreso.setCalendar(selectedDate);

                // Sumarle 24 horas a la fecha de salida
                selectedDate.add(Calendar.HOUR_OF_DAY, 24);

                // Establecer la fecha de salida
                date_salida.setCalendar(selectedDate);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Fecha de ingreso inválida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btn_veinticuatroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_veinticuatro;
    private com.toedter.calendar.JDateChooser date_ingreso;
    private com.toedter.calendar.JDateChooser date_salida;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
