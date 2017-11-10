/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_carlosromero;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Will
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();   
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        ecivil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensajes = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        per = new javax.swing.JRadioButton();
        fam = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        personas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 84, 270, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(txID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 270, -1));

        jLabel3.setText("Edad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 270, -1));
        jPanel1.add(ecivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 270, 30));

        jLabel4.setText("Estado Civil:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel5.setText("Sexo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        buttonGroup2.add(m);
        m.setText("M");
        m.setToolTipText("");
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        buttonGroup2.add(f);
        f.setText("F");
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        mensajes.setEditable(false);
        mensajes.setColumns(20);
        mensajes.setRows(5);
        jScrollPane1.setViewportView(mensajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 270, 140));

        jLabel7.setText("Mensajes:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 70));

        jLabel6.setText("Tipo de Persona:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 90, 20));

        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 170, 140));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Agregar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 34));

        buttonGroup1.add(per);
        per.setText("Personal");
        jPanel1.add(per, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 90, 30));

        buttonGroup1.add(fam);
        fam.setText("Familiar");
        jPanel1.add(fam, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 90, 30));

        jTabbedPane1.addTab("Agregar", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Estado Civil", "Tipo de Persona"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 650, 220));

        personas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                personasItemStateChanged(evt);
            }
        });
        jPanel2.add(personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 30));

        jLabel11.setText("Personas:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        jPanel2.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, 70));

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mensajes Kim", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
    String Nombre;
    int Edad;
    int ID;
    String Sexo;
    String EstadoCivil;
    String Rol;
    String Trabajo;
    double altura;
    double Peso;
    ArrayList Cosas=new ArrayList();
    String Ocupacion;
    String Horario;
    int SeamanasTrabajando;
    double Sueldo;
    try {
            ID=Integer.parseInt(txID.getText());
            Nombre=txnombre.getText();
            if(m.isSelected()){
                Sexo="M";
            }else{
                Sexo="F";
            }
            Edad=Integer.parseInt(edad.getText());
            EstadoCivil=ecivil.getText();
            String x="";
            int X=9;
                for (Object t : person) {
                    if(t instanceof Familiares){
                        X=X+1;
                    }
                }
            if(fam.isSelected()){                
                if(X>8);
                Rol=JOptionPane.showInputDialog("Ingrese el Rol:","Madre, Padre, Hermana, Hermano o Esposo");
                Trabajo=JOptionPane.showInputDialog("Ingrese el Trabajo:");
                altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el la altura:","1.7"));
                Peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Peso:","90"));
                Familiares F=new Familiares(Rol,Trabajo,altura,Peso,Nombre,Edad,ID,Sexo,EstadoCivil);
                person.add(F);
                DefaultComboBoxModel modelo=
                        (DefaultComboBoxModel) personas.getModel();
                modelo.addElement(F);
                personas.setModel(modelo);
                personas.setModel(modelo);
            }else if(per.isSelected()){
                Ocupacion=JOptionPane.showInputDialog("Ingrese la ocupacion:","Jardinero");
                Horario=JOptionPane.showInputDialog("Ingrese el Horario:","1:00-3:00");
                SeamanasTrabajando=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las semanas trabajadas:","6"));
                Sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo:","7000"));
                Personal Y=new Personal(Ocupacion,Horario,SeamanasTrabajando,Sueldo,Nombre,Edad,ID,Sexo,EstadoCivil);
                person.add(Y);
                DefaultComboBoxModel modelo=
                        (DefaultComboBoxModel) personas.getModel();
                modelo.addElement(Y);
                personas.setModel(modelo);
                personas.setModel(modelo);
            }else{
                JOptionPane.showMessageDialog(this, "Debe Seleccionar Un tipo!");
            }
//               txnombre.setText("");
//               txID.setText("");
//               edad.setText("");
//               ecivil.setText("");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió una error y no se guardaron los datos!");
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void personasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_personasItemStateChanged
            if (evt.getStateChange()==2) {
                Personas s= (Personas) personas.getSelectedItem();
                Object[] newrow ={
                    s.getID(),
                    s.getNombre(),
                    s.getEdad(),
                    s.getEstadoCivil(),
                    s.getClass().getSimpleName()
                };
                //para agregar una nueva fila
                DefaultTableModel modelo=
                (DefaultTableModel) tabla.getModel();//se captura el modelo
                modelo.addRow(newrow);//se agega la fila
                tabla.setModel(modelo);//se envial el modelo
            }
    }//GEN-LAST:event_personasItemStateChanged

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        if (tabla.getSelectedRow()>=0) {
            DefaultTableModel modelo =(DefaultTableModel) tabla.getModel();
            modelo.removeRow(tabla.getSelectedRow());
            tabla.setModel(modelo);
            person.remove(tabla.getSelectedRow()+1);
            tabla.setModel(modelo);
            System.out.println(person);
        }
    }//GEN-LAST:event_eliminarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField ecivil;
    private javax.swing.JTextField edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JRadioButton f;
    private javax.swing.JRadioButton fam;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextArea mensajes;
    private javax.swing.JRadioButton per;
    private javax.swing.JComboBox<String> personas;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txnombre;
    // End of variables declaration//GEN-END:variables

    ArrayList <Personas> person=new ArrayList();
    int tipo=0;
}
