/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg58_ahmadubaid_assignment_1_aoop;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class Quiz_FormGK extends javax.swing.JFrame {
    VarDB dbt = new VarDB();
      DAO dao = new DAO();
    String w;
    
    
    
   
    /**
     * Creates new form Quiz_Form
     */
  
    public Quiz_FormGK() {
        initComponents();
     
       
  
      ResultSet rs;
        rs = dao.SelectAll4();
        try{
           
         

            
            try {

                if(rs.next()){
                    q1.setText(rs.getString(1));
                    opt1.setText(rs.getString(4));
                    opt2.setText(rs.getString(5));
                    opt3.setText(rs.getString(6));
                    opt4.setText(rs.getString(7));
                    dbt.a= rs.getString(8);
                    dbt.mark1=rs.getString(9);
                    m1.setText("/"+dbt.mark1);
                }

                if(rs.next()){
                    q2.setText(rs.getString(1));
                    opt11.setText(rs.getString(4));
                    opt12.setText(rs.getString(5));
                    opt13.setText(rs.getString(6));
                    opt14.setText(rs.getString(7));
                       dbt.b= rs.getString(8);
                dbt.mark2=rs.getString(9);
                m2.setText( "/"+dbt.mark2);
                }

                if(rs.next()){
                    q3.setText(rs.getString(1));
                    opt21.setText(rs.getString(4));
                    opt22.setText(rs.getString(5));
                    opt23.setText(rs.getString(6));
                    opt24.setText(rs.getString(7));
                   dbt.c= rs.getString(8);
                   dbt.mark3=rs.getString(9);
                m3.setText("/"+dbt.mark3);
                }

                if(rs.next()){
                    q4.setText(rs.getString(1));
                    opt31.setText(rs.getString(4));
                    opt32.setText(rs.getString(5));
                    opt33.setText(rs.getString(6));
                    opt34.setText(rs.getString(7));
                dbt.d= rs.getString(8);
                dbt.mark4=rs.getString(9);
               
                m4.setText("/"+dbt.mark4);
                }
                if(rs.next()){
                    q5.setText(rs.getString(1));
                    opt41.setText(rs.getString(4));
                    opt42.setText(rs.getString(5));
                    opt43.setText(rs.getString(6));
                    opt44.setText(rs.getString(7));
                dbt.e= rs.getString(8);
                dbt.mark5=rs.getString(9);
                m5.setText("/"+dbt.mark5);
                
                }
                if(rs.next()){
                    q6.setText(rs.getString(1));
                    opt51.setText(rs.getString(4));
                    opt52.setText(rs.getString(5));
                    opt53.setText(rs.getString(6));
                    opt54.setText(rs.getString(7));
                dbt.f= rs.getString(8);
                dbt.mark6=rs.getString(9);
                m6.setText("/"+dbt.mark6);
                }
                if(rs.next()){
                    q7.setText(rs.getString(1));
                    opt61.setText(rs.getString(4));
                    opt62.setText(rs.getString(5));
                    opt63.setText(rs.getString(6));
                    opt64.setText(rs.getString(7));
                dbt.g= rs.getString(8);
                dbt.mark7=rs.getString(9);
                m7.setText("/"+dbt.mark7);
                }
                if(rs.next()){
                    q8.setText(rs.getString(1));
                    opt71.setText(rs.getString(4));
                    opt72.setText(rs.getString(5));
                    opt73.setText(rs.getString(6));
                    opt74.setText(rs.getString(7));
                dbt.h= rs.getString(8);
                dbt.mark8=rs.getString(9);
                m8.setText("/"+dbt.mark8);
                }
                if(rs.next()){
                    q9.setText(rs.getString(1));
                    opt81.setText(rs.getString(4));
                    opt82.setText(rs.getString(5));
                    opt83.setText(rs.getString(6));
                    opt84.setText(rs.getString(7));
                dbt.i= rs.getString(8);
                dbt.mark9=rs.getString(9);
                m9.setText("/"+dbt.mark9);
                }
                if(rs.next()){
                    q10.setText(rs.getString(1));
                    opt91.setText(rs.getString(4));
                    opt92.setText(rs.getString(5));
                    opt93.setText(rs.getString(6));
                    opt94.setText(rs.getString(7));
             dbt.j= rs.getString(8);
             dbt.mark10=rs.getString(9);
               m10.setText("/"+dbt.mark10);
                }

             } catch (SQLException ex) {
                Logger.getLogger(Add_Question.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        catch(HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }
         m1.setVisible(false);
      mark1.setVisible(false);
        m2.setVisible(false);
      mark2.setVisible(false);
         m3.setVisible(false);
      mark3.setVisible(false);
         m4.setVisible(false);
      mark4.setVisible(false);
         m5.setVisible(false);
      mark5.setVisible(false);
         m6.setVisible(false);
      mark6.setVisible(false);
         m7.setVisible(false);
      mark7.setVisible(false);
         m8.setVisible(false);
      mark8.setVisible(false);
         m9.setVisible(false);
      mark9.setVisible(false);
        m10.setVisible(false);
     mark10.setVisible(false);
      total.setVisible(false);
      count.setVisible(false);
     finish.setVisible(false);
   
    
    }
 int roll;
    
 void setRoll(int n){
 roll=n;}

 String nam;

 void setNam(String n){
 nam=n;}

 String cls;

 void setcls(String n){
 cls=n;}


    
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        pn11 = new javax.swing.JPanel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        m1 = new javax.swing.JLabel();
        opt1 = new javax.swing.JLabel();
        opt2 = new javax.swing.JLabel();
        opt3 = new javax.swing.JLabel();
        opt4 = new javax.swing.JLabel();
        mark1 = new javax.swing.JLabel();
        pn12 = new javax.swing.JPanel();
        op11 = new javax.swing.JRadioButton();
        op12 = new javax.swing.JRadioButton();
        op13 = new javax.swing.JRadioButton();
        op14 = new javax.swing.JRadioButton();
        m2 = new javax.swing.JLabel();
        opt11 = new javax.swing.JLabel();
        opt12 = new javax.swing.JLabel();
        opt13 = new javax.swing.JLabel();
        opt14 = new javax.swing.JLabel();
        mark2 = new javax.swing.JLabel();
        pn13 = new javax.swing.JPanel();
        op21 = new javax.swing.JRadioButton();
        op22 = new javax.swing.JRadioButton();
        op23 = new javax.swing.JRadioButton();
        op24 = new javax.swing.JRadioButton();
        m3 = new javax.swing.JLabel();
        opt21 = new javax.swing.JLabel();
        opt22 = new javax.swing.JLabel();
        opt23 = new javax.swing.JLabel();
        opt24 = new javax.swing.JLabel();
        mark3 = new javax.swing.JLabel();
        pn15 = new javax.swing.JPanel();
        op41 = new javax.swing.JRadioButton();
        op42 = new javax.swing.JRadioButton();
        op43 = new javax.swing.JRadioButton();
        op44 = new javax.swing.JRadioButton();
        m5 = new javax.swing.JLabel();
        opt41 = new javax.swing.JLabel();
        opt42 = new javax.swing.JLabel();
        opt43 = new javax.swing.JLabel();
        opt44 = new javax.swing.JLabel();
        mark5 = new javax.swing.JLabel();
        pn16 = new javax.swing.JPanel();
        op51 = new javax.swing.JRadioButton();
        op52 = new javax.swing.JRadioButton();
        op53 = new javax.swing.JRadioButton();
        op54 = new javax.swing.JRadioButton();
        m6 = new javax.swing.JLabel();
        opt51 = new javax.swing.JLabel();
        opt52 = new javax.swing.JLabel();
        opt53 = new javax.swing.JLabel();
        opt54 = new javax.swing.JLabel();
        mark6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CR = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        finish = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        pn14 = new javax.swing.JPanel();
        op31 = new javax.swing.JRadioButton();
        op32 = new javax.swing.JRadioButton();
        op33 = new javax.swing.JRadioButton();
        op34 = new javax.swing.JRadioButton();
        m4 = new javax.swing.JLabel();
        opt31 = new javax.swing.JLabel();
        opt32 = new javax.swing.JLabel();
        opt33 = new javax.swing.JLabel();
        opt34 = new javax.swing.JLabel();
        mark4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        pn17 = new javax.swing.JPanel();
        op61 = new javax.swing.JRadioButton();
        op62 = new javax.swing.JRadioButton();
        op63 = new javax.swing.JRadioButton();
        op64 = new javax.swing.JRadioButton();
        m7 = new javax.swing.JLabel();
        opt61 = new javax.swing.JLabel();
        opt62 = new javax.swing.JLabel();
        opt63 = new javax.swing.JLabel();
        opt64 = new javax.swing.JLabel();
        mark7 = new javax.swing.JLabel();
        pn22 = new javax.swing.JPanel();
        op71 = new javax.swing.JRadioButton();
        op72 = new javax.swing.JRadioButton();
        op73 = new javax.swing.JRadioButton();
        op74 = new javax.swing.JRadioButton();
        m8 = new javax.swing.JLabel();
        opt71 = new javax.swing.JLabel();
        opt72 = new javax.swing.JLabel();
        opt73 = new javax.swing.JLabel();
        opt74 = new javax.swing.JLabel();
        mark8 = new javax.swing.JLabel();
        pn23 = new javax.swing.JPanel();
        op81 = new javax.swing.JRadioButton();
        op82 = new javax.swing.JRadioButton();
        op83 = new javax.swing.JRadioButton();
        op84 = new javax.swing.JRadioButton();
        m9 = new javax.swing.JLabel();
        opt81 = new javax.swing.JLabel();
        opt82 = new javax.swing.JLabel();
        opt83 = new javax.swing.JLabel();
        opt84 = new javax.swing.JLabel();
        mark9 = new javax.swing.JLabel();
        pn24 = new javax.swing.JPanel();
        op91 = new javax.swing.JRadioButton();
        op92 = new javax.swing.JRadioButton();
        op93 = new javax.swing.JRadioButton();
        op94 = new javax.swing.JRadioButton();
        m10 = new javax.swing.JLabel();
        opt91 = new javax.swing.JLabel();
        opt92 = new javax.swing.JLabel();
        opt93 = new javax.swing.JLabel();
        opt94 = new javax.swing.JLabel();
        mark10 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(op1);

        buttonGroup1.add(op2);

        buttonGroup1.add(op3);

        buttonGroup1.add(op4);

        m1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m1.setText("/Dificulty Level (1)");

        opt1.setText("jLabel15");

        opt2.setText("jLabel15");

        opt3.setText("jLabel15");

        opt4.setText("jLabel15");

        mark1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark1.setForeground(new java.awt.Color(51, 153, 0));
        mark1.setText("jLabel2");

        javax.swing.GroupLayout pn11Layout = new javax.swing.GroupLayout(pn11);
        pn11.setLayout(pn11Layout);
        pn11Layout.setHorizontalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addComponent(op1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opt2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opt3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opt4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mark1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pn11Layout.setVerticalGroup(
            pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn11Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(opt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn11Layout.createSequentialGroup()
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(opt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mark1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        buttonGroup2.add(op11);

        buttonGroup2.add(op12);

        buttonGroup2.add(op13);

        buttonGroup2.add(op14);

        m2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m2.setText("/Dificulty Level (2)");

        opt11.setText("jLabel16");

        opt12.setText("jLabel15");

        opt13.setText("jLabel15");

        opt14.setText("jLabel15");

        mark2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark2.setForeground(new java.awt.Color(51, 153, 0));
        mark2.setText("jLabel2");

        javax.swing.GroupLayout pn12Layout = new javax.swing.GroupLayout(pn12);
        pn12.setLayout(pn12Layout);
        pn12Layout.setHorizontalGroup(
            pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn12Layout.createSequentialGroup()
                .addComponent(op11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(op12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt12, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(m2)
                .addGap(17, 17, 17))
        );
        pn12Layout.setVerticalGroup(
            pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(opt11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(opt12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn12Layout.createSequentialGroup()
                .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(op12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mark2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttonGroup3.add(op21);

        buttonGroup3.add(op22);

        buttonGroup3.add(op23);

        buttonGroup3.add(op24);

        m3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m3.setText("/Dificulty Level (3)");

        opt21.setText("jLabel15");

        opt22.setText("jLabel15");

        opt23.setText("jLabel15");

        opt24.setText("jLabel15");

        mark3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark3.setForeground(new java.awt.Color(51, 153, 0));
        mark3.setText("jLabel2");

        javax.swing.GroupLayout pn13Layout = new javax.swing.GroupLayout(pn13);
        pn13.setLayout(pn13Layout);
        pn13Layout.setHorizontalGroup(
            pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn13Layout.createSequentialGroup()
                .addComponent(op21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt22, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(mark3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn13Layout.setVerticalGroup(
            pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn13Layout.createSequentialGroup()
                .addComponent(opt21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
            .addGroup(pn13Layout.createSequentialGroup()
                .addGroup(pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(op22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m3)
                        .addComponent(opt24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mark3))
                    .addComponent(op24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup5.add(op41);

        buttonGroup5.add(op42);

        buttonGroup5.add(op43);

        buttonGroup5.add(op44);

        m5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m5.setText("/Dificulty Level (5)");

        opt41.setText("jLabel15");

        opt42.setText("jLabel16");

        opt43.setText("jLabel15");

        opt44.setText("jLabel15");

        mark5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark5.setForeground(new java.awt.Color(51, 153, 0));
        mark5.setText("jLabel2");

        javax.swing.GroupLayout pn15Layout = new javax.swing.GroupLayout(pn15);
        pn15.setLayout(pn15Layout);
        pn15Layout.setHorizontalGroup(
            pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn15Layout.createSequentialGroup()
                .addComponent(op41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt41, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt42, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt43, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt44, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mark5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn15Layout.setVerticalGroup(
            pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(op41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(op43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(op44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(op42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opt42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opt43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opt44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mark5)
                    .addComponent(m5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        buttonGroup6.add(op51);

        buttonGroup6.add(op52);

        buttonGroup6.add(op53);

        buttonGroup6.add(op54);

        m6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m6.setText("/6 ");

        opt51.setText("jLabel15");

        opt52.setText("jLabel16");

        opt53.setText("jLabel17");

        opt54.setText("jLabel18");

        mark6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark6.setForeground(new java.awt.Color(51, 153, 0));
        mark6.setText("jLabel2");

        javax.swing.GroupLayout pn16Layout = new javax.swing.GroupLayout(pn16);
        pn16.setLayout(pn16Layout);
        pn16Layout.setHorizontalGroup(
            pn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn16Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(op51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt51, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt53, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt54, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mark6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m6)
                .addGap(14, 14, 14))
        );
        pn16Layout.setVerticalGroup(
            pn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(opt51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(opt52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn16Layout.createSequentialGroup()
                .addGroup(pn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(op52)
                        .addComponent(op51))
                    .addComponent(op53)
                    .addComponent(op54)
                    .addGroup(pn16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opt54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mark6)
                        .addComponent(m6))
                    .addComponent(opt53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gernal Knowledge");

        CR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CR.setText("Submit Test");
        CR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total.setText("/10 ( Total Marks)");

        finish.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        finish.setText("Finish");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });

        q1.setText("jLabel15");

        q2.setText("jLabel15");

        q3.setText("jLabel15");

        q4.setText("jLabel15");

        buttonGroup4.add(op31);

        buttonGroup4.add(op32);

        buttonGroup4.add(op33);

        buttonGroup4.add(op34);

        m4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m4.setText("/Dificulty Level (4)");

        opt31.setText("jLabel15");

        opt32.setText("jLabel15");

        opt33.setText("jLabel15");

        opt34.setText("jLabel15");

        mark4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark4.setForeground(new java.awt.Color(51, 153, 0));
        mark4.setText("jLabel2");

        javax.swing.GroupLayout pn14Layout = new javax.swing.GroupLayout(pn14);
        pn14.setLayout(pn14Layout);
        pn14Layout.setHorizontalGroup(
            pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn14Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(op31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opt31, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opt32, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt33, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op34, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt34, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mark4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(m4)
                .addContainerGap())
        );
        pn14Layout.setVerticalGroup(
            pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn14Layout.createSequentialGroup()
                .addGroup(pn14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(op32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mark4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        q5.setText("jLabel15");

        q6.setText("jLabel15");

        q7.setText("jLabel15");

        buttonGroup7.add(op61);

        buttonGroup7.add(op62);

        buttonGroup7.add(op63);

        buttonGroup7.add(op64);

        m7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m7.setText("/7 ");

        opt61.setText("jLabel15");

        opt62.setText("jLabel16");

        opt63.setText("jLabel15");

        opt64.setText("jLabel15");

        mark7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark7.setForeground(new java.awt.Color(51, 153, 0));
        mark7.setText("jLabel2");

        javax.swing.GroupLayout pn17Layout = new javax.swing.GroupLayout(pn17);
        pn17.setLayout(pn17Layout);
        pn17Layout.setHorizontalGroup(
            pn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn17Layout.createSequentialGroup()
                .addComponent(op61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt61, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op62, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt62, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt63, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt64, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mark7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(m7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn17Layout.setVerticalGroup(
            pn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opt62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opt63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(opt64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m7)
                .addComponent(mark7))
        );

        buttonGroup8.add(op71);

        buttonGroup8.add(op72);

        buttonGroup8.add(op73);

        buttonGroup8.add(op74);

        m8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m8.setText("/8");

        opt71.setText("jLabel15");

        opt72.setText("jLabel16");

        opt73.setText("jLabel15");

        opt74.setText("jLabel15");

        mark8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark8.setForeground(new java.awt.Color(51, 153, 0));
        mark8.setText("jLabel3");

        javax.swing.GroupLayout pn22Layout = new javax.swing.GroupLayout(pn22);
        pn22.setLayout(pn22Layout);
        pn22Layout.setHorizontalGroup(
            pn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn22Layout.createSequentialGroup()
                .addComponent(op71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt71, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op72, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt72, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt73, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt74, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mark8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(m8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn22Layout.setVerticalGroup(
            pn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn22Layout.createSequentialGroup()
                .addGroup(pn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(op71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opt74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m8)
                        .addComponent(mark8))
                    .addComponent(opt71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttonGroup9.add(op81);

        buttonGroup9.add(op82);

        buttonGroup9.add(op83);

        buttonGroup9.add(op84);

        m9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m9.setText("/9 ");

        opt81.setText("jLabel15");

        opt82.setText("jLabel16");

        opt83.setText("jLabel15");

        opt84.setText("jLabel15");

        mark9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark9.setForeground(new java.awt.Color(51, 153, 0));
        mark9.setText("jLabel3");

        javax.swing.GroupLayout pn23Layout = new javax.swing.GroupLayout(pn23);
        pn23.setLayout(pn23Layout);
        pn23Layout.setHorizontalGroup(
            pn23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn23Layout.createSequentialGroup()
                .addComponent(op81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt81, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op82, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt82, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt83, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt84, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mark9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn23Layout.setVerticalGroup(
            pn23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(op82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opt82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opt83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(opt84))
            .addGroup(pn23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(mark9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m9))
        );

        buttonGroup10.add(op91);

        buttonGroup10.add(op92);

        buttonGroup10.add(op93);

        buttonGroup10.add(op94);

        m10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        m10.setText("/10 ");

        opt91.setText("jLabel15");

        opt92.setText("jLabel16");

        opt93.setText("jLabel15");

        opt94.setText("jLabel15");

        mark10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark10.setForeground(new java.awt.Color(51, 153, 0));
        mark10.setText("jLabel3");

        javax.swing.GroupLayout pn24Layout = new javax.swing.GroupLayout(pn24);
        pn24.setLayout(pn24Layout);
        pn24Layout.setHorizontalGroup(
            pn24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn24Layout.createSequentialGroup()
                .addComponent(op91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt91, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op92, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt92, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt93, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(op94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt94, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mark10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn24Layout.setVerticalGroup(
            pn24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn24Layout.createSequentialGroup()
                .addGroup(pn24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(op91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(op92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opt93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opt94)
                        .addComponent(mark10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m10)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        q8.setText("jLabel19");

        q9.setText("jLabel20");

        q10.setText("jLabel21");

        count.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        count.setForeground(new java.awt.Color(255, 0, 0));
        count.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q9, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q10, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pn17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CR)
                        .addGap(18, 18, 18)
                        .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(total))
                    .addComponent(pn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(total)
                        .addComponent(count, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(q1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q9)
                .addGap(10, 10, 10)
                .addComponent(pn23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRActionPerformed
    
         int x1=Integer.parseInt( dbt.mark1);
         int x2=Integer.parseInt( dbt.mark2); 
         int x3=Integer.parseInt( dbt.mark3);
         int x4=Integer.parseInt( dbt.mark4);
         int x5=Integer.parseInt( dbt.mark5);
         int x6=Integer.parseInt( dbt.mark6);
         int x7=Integer.parseInt( dbt.mark7);
         int x8=Integer.parseInt( dbt.mark8);
         int x9=Integer.parseInt( dbt.mark9);
         int x10=Integer.parseInt( dbt.mark10);
         dbt.Counter=0;
       if(!(op1.isSelected()||op2.isSelected()||op3.isSelected()||op4.isSelected()) ){
       JOptionPane.showMessageDialog(null,"Ansewr to Question 1 is Empty Fill You answer");
       }else if(!(op11.isSelected()||op12.isSelected()||op13.isSelected()||op14.isSelected()) ){
       JOptionPane.showMessageDialog(null,"Ansewr to Question 2 is Empty Fill You answer");    
       }else if(!(op21.isSelected()||op22.isSelected()||op23.isSelected()||op24.isSelected())){
       JOptionPane.showMessageDialog(null,"Ansewr to Question 3 is Empty Fill You answer");    
       }else if(!(op31.isSelected()||op32.isSelected()||op33.isSelected()||op34.isSelected())){
        JOptionPane.showMessageDialog(null,"Ansewr to Question 4 is Empty Fill You answer");   
       }else if(!(op41.isSelected()||op42.isSelected()||op43.isSelected()||op44.isSelected())){
       JOptionPane.showMessageDialog(null,"Ansewr to Question 5 is Empty Fill You answer");    
       }else if(!(op51.isSelected()||op52.isSelected()||op53.isSelected()||op54.isSelected())){
        JOptionPane.showMessageDialog(null,"Ansewr to Question 6 is Empty Fill You answer");   
       }else if(!(op61.isSelected()||op62.isSelected()||op63.isSelected()||op64.isSelected())){
        JOptionPane.showMessageDialog(null,"Ansewr to Question 7 is Empty Fill You answer");   
       }else if(!(op71.isSelected()||op72.isSelected()||op73.isSelected()||op74.isSelected())){
        JOptionPane.showMessageDialog(null,"Ansewr to Question 8 is Empty Fill You answer");   
       }else if(!(op81.isSelected()||op82.isSelected()||op83.isSelected()||op84.isSelected())){
        JOptionPane.showMessageDialog(null,"Ansewr to Question 9 is Empty Fill You answer");   
       }else if(!(op91.isSelected()||op92.isSelected()||op93.isSelected()||op94.isSelected())){
       JOptionPane.showMessageDialog(null,"Ansewr to Question 10 is Empty Fill You answer");    
       }
       
       else{ 
           
               try
       {
         
         System.out.println(roll); 
          dbt.Rollno_rslt=roll;
          dbt.Stdname=cls;
          dbt.Class=nam;
          dbt.q1=q1.getText();
          
          dbt.q2=q2.getText();
          
          dbt.q3=q3.getText();
          
          dbt.q4=q4.getText();
          
          dbt.q5=q5.getText();
          
          dbt.q6=q6.getText();
          
          dbt.q7=q7.getText();
          
          dbt.q8=q8.getText();
          
          dbt.q9=q9.getText();
          
          dbt.q10=q10.getText();
           
           
       if(op1.isSelected()){ dbt.r1=opt1.getText();
       dbt.answer1=opt1.getText();
       if(dbt.r1.equals(dbt.a)){  dbt.Counter=dbt.Counter+x1;mark1.setText(""+dbt.mark1); }
        else {mark1.setText(""+dbt.id);}
}else if (op2.isSelected()){
    dbt.answer1=opt2.getText();
    dbt.r2=opt2.getText(); if(dbt.r2.equals(dbt.a)){ dbt.Counter=dbt.Counter+x1;mark1.setText(""+dbt.mark1); }
else {mark1.setText(""+dbt.id);}
}else if (op3.isSelected()){
    dbt.answer1=opt3.getText();
    dbt.r3=opt3.getText();if(dbt.r3.equals(dbt.a)){dbt.Counter=dbt.Counter+x1; mark1.setText(""+dbt.mark1); }
else {mark1.setText(""+dbt.id);}
}else if (op4.isSelected()){
    dbt.answer1=opt4.getText();
    dbt.r4=opt4.getText();if(dbt.r4.equals(dbt.a)){dbt.Counter=dbt.Counter+x1;mark1.setText(""+dbt.mark1); }
else {mark1.setText(""+dbt.id);}
}          
       
       
       if(op11.isSelected()){
           dbt.answer2=opt11.getText();
           dbt.r11=opt11.getText();if(dbt.r11.equals(dbt.b)){dbt.Counter=dbt.Counter+x2;mark2.setText(""+dbt.mark2); }
       else {mark2.setText(""+dbt.id);}
}else if (op12.isSelected()){
    dbt.answer2=opt12.getText();
    dbt.r12=opt12.getText(); if(dbt.r12.equals(dbt.b)){ dbt.Counter=dbt.Counter+x2;mark2.setText(""+dbt.mark2); }
else {mark2.setText(""+dbt.id);}
}else if (op13.isSelected()){
    dbt.answer2=opt13.getText();
    dbt.r13=opt13.getText();if(dbt.r13.equals(dbt.b)){dbt.Counter=dbt.Counter+x2;mark2.setText(""+dbt.mark2); }
else {mark2.setText(""+dbt.id);}
}else if (op14.isSelected()){ 
    dbt.answer2=opt14.getText();
    dbt.r14=opt14.getText();if(dbt.r14.equals(dbt.b)){dbt.Counter=dbt.Counter+x2;mark2.setText(""+dbt.mark2); }
else {mark2.setText(""+dbt.id);}
}           
 
      if(op21.isSelected()){ 
          dbt.answer3=opt21.getText();
          dbt.r21=opt21.getText();if(dbt.r21.equals(dbt.c)){dbt.Counter=dbt.Counter+x3;mark3.setText(""+dbt.mark3);
   }else {mark3.setText(""+dbt.id);}
}else if (op22.isSelected()){
    dbt.answer3=opt22.getText();
    dbt.r22=opt22.getText(); if(dbt.r22.equals(dbt.c)){ dbt.Counter=dbt.Counter+x3;mark3.setText(""+dbt.mark3); 
}else {mark3.setText(""+dbt.id);}
}else if (op23.isSelected()){
    dbt.answer3=opt23.getText();
    dbt.r23=opt23.getText();if(dbt.r23.equals(dbt.c)){dbt.Counter=dbt.Counter+x3;mark3.setText(""+dbt.mark3); 
}else {mark3.setText(""+dbt.id);}
}else if (op24.isSelected()){ 
     dbt.answer3=opt24.getText();
    dbt.r24=opt24.getText();if(dbt.r24.equals(dbt.c)){dbt.Counter=dbt.Counter+x3;mark3.setText(""+dbt.mark3); }
else {mark3.setText(""+dbt.id);}}           
   
    if(op31.isSelected()){
        dbt.answer4=opt31.getText();
        dbt.r31=opt31.getText();if(dbt.r31.equals(dbt.d)){dbt.Counter=dbt.Counter+x4;mark4.setText(""+dbt.mark4); }
    else {mark4.setText(""+dbt.id);}
}else if (op32.isSelected()){
    dbt.answer4=opt32.getText();
    dbt.r32=opt32.getText(); if(dbt.r32.equals(dbt.d)){ dbt.Counter=dbt.Counter+x4;mark4.setText(""+dbt.mark4); }
else {mark4.setText(""+dbt.id);}
}else if (op33.isSelected()){
    dbt.answer4=opt33.getText();
    dbt.r33=opt33.getText();if(dbt.r33.equals(dbt.d)){dbt.Counter=dbt.Counter+x4;mark4.setText(""+dbt.mark4); }
else {mark4.setText(""+dbt.id);}
}else if (op34.isSelected()){ 
    dbt.answer4=opt34.getText();
    dbt.r34=opt34.getText();if(dbt.r34.equals(dbt.d)){dbt.Counter=dbt.Counter+x4;mark4.setText(""+dbt.mark4); }
else {mark4.setText(""+dbt.id);}}           
   
    if(op41.isSelected()){ 
        dbt.answer5=opt41.getText();
        dbt.r41=opt41.getText();if(dbt.r41.equals(dbt.e)){dbt.Counter=dbt.Counter+x5;mark5.setText(""+dbt.mark5); }
else {mark5.setText(""+dbt.id);}    
}else if (op42.isSelected()){
    dbt.answer5=opt41.getText();
    dbt.r42=opt42.getText(); if(dbt.r42.equals(dbt.e)){ dbt.Counter=dbt.Counter+x5;mark5.setText(""+dbt.mark5); }
else {mark5.setText(""+dbt.id);}
}else if (op43.isSelected()){
    dbt.answer5=opt43.getText();
    dbt.r43=opt43.getText();if(dbt.r43.equals(dbt.e)){dbt.Counter=dbt.Counter+x5;mark5.setText(""+dbt.mark5); }
else {mark5.setText(""+dbt.id);}
}else if (op44.isSelected()){
    dbt.answer5=opt44.getText();
    dbt.r44=opt44.getText();if(dbt.r44.equals(dbt.e)){dbt.Counter=dbt.Counter+x5;mark5.setText(""+dbt.mark5); }
else {mark5.setText(""+dbt.id);}}           
     
      if(op51.isSelected()){
      dbt.answer6=opt51.getText();
          dbt.r51=opt51.getText();if(dbt.r51.equals(dbt.f)){dbt.Counter=dbt.Counter+x6;mark6.setText(""+dbt.mark6); }
 else {mark6.setText(""+dbt.id);}
}else if (op52.isSelected()){
    dbt.answer6=opt52.getText();
    dbt.r52=opt52.getText(); if(dbt.r52.equals(dbt.f)){ dbt.Counter=dbt.Counter+x6;mark6.setText(""+dbt.mark6); }
else {mark6.setText(""+dbt.id);}
}else if (op53.isSelected()){
    dbt.answer6=opt53.getText();
    dbt.r53=opt53.getText();if(dbt.r53.equals(dbt.f)){dbt.Counter=dbt.Counter+x6;mark6.setText(""+dbt.mark6); }
else {mark6.setText(""+dbt.id);}
}else if (op54.isSelected()){ 
    dbt.answer6=opt54.getText();
    dbt.r54=opt54.getText();if(dbt.r54.equals(dbt.f)){dbt.Counter=dbt.Counter+x6;mark6.setText(""+dbt.mark6); }
else {mark6.setText(""+dbt.id);}}           
 
      if(op61.isSelected()){ 
          dbt.answer7=opt61.getText();
          dbt.r61=opt61.getText();if(dbt.r61.equals(dbt.g)){dbt.Counter=dbt.Counter+x7;mark7.setText(""+dbt.mark7); }
else {mark7.setText(""+dbt.id);}
}else if (op62.isSelected()){
    dbt.answer7=opt62.getText();
    dbt.r62=opt62.getText(); if(dbt.r62.equals(dbt.g)){ dbt.Counter=dbt.Counter+x7;mark7.setText(""+dbt.mark7); }
else {mark7.setText(""+dbt.id);}
}else if (op63.isSelected()){
    dbt.answer7=opt63.getText();
    dbt.r63=opt63.getText();if(dbt.r63.equals(dbt.g)){dbt.Counter=dbt.Counter+x7;mark7.setText(""+dbt.mark7); }
else {mark7.setText(""+dbt.id);}
}else if (op64.isSelected()){ 
    dbt.answer7=opt64.getText();
    dbt.r64=opt64.getText();if(dbt.r64.equals(dbt.g)){dbt.Counter=dbt.Counter+x7;mark7.setText(""+dbt.mark7); }
else {mark7.setText(""+dbt.id);}}           
 
if(op71.isSelected()){
    dbt.answer8=opt71.getText();
    dbt.r71=opt71.getText();if(dbt.r71.equals(dbt.h)){dbt.Counter=dbt.Counter+x8;mark8.setText(""+dbt.mark8); }
    else {mark8.setText(""+dbt.id);}
}else if (op72.isSelected()){
    dbt.answer8=opt72.getText();
    dbt.r72=opt72.getText(); if(dbt.r72.equals(dbt.h)){ dbt.Counter=dbt.Counter+x8;mark8.setText(""+dbt.mark8); }
else {mark8.setText(""+dbt.id);}
}else if (op73.isSelected()){
    dbt.answer8=opt73.getText();
    dbt.r73=opt73.getText();if(dbt.r73.equals(dbt.h)){dbt.Counter=dbt.Counter+x8;mark8.setText(""+dbt.mark8); }
else {mark8.setText(""+dbt.id);}
}else if (op74.isSelected()){
    dbt.answer8=opt74.getText();
    dbt.r74=opt74.getText();if(dbt.r74.equals(dbt.h)){dbt.Counter=dbt.Counter+x8;mark8.setText(""+dbt.mark8); }
else {mark8.setText(""+dbt.id);}}           
        
       if(op81.isSelected()){
           dbt.answer9=opt81.getText();
           dbt.r81=opt81.getText();if(dbt.r81.equals(dbt.i)){dbt.Counter=dbt.Counter+x9;mark9.setText(""+dbt.mark9); }
 else {mark9.setText(""+dbt.id);}
}else if (op82.isSelected()){
           dbt.answer9=opt82.getText();
    dbt.r82=opt82.getText(); if(dbt.r82.equals(dbt.i)){ dbt.Counter=dbt.Counter+x9;mark9.setText(""+dbt.mark9); }
else {mark9.setText(""+dbt.id);}
}else if (op83.isSelected()){
    dbt.answer9=opt83.getText();
    dbt.r83=opt83.getText();if(dbt.r83.equals(dbt.i)){dbt.Counter=dbt.Counter+x9;mark9.setText(""+dbt.mark9); }
else {mark9.setText(""+dbt.id);}
}else if (op84.isSelected()){ 
    dbt.answer9=opt84.getText();
    dbt.r84=opt84.getText();if(dbt.r84.equals(dbt.i)){dbt.Counter=dbt.Counter+x9;mark9.setText(""+dbt.mark9); }
else {mark9.setText(""+dbt.id);}}           

       if(op91.isSelected()){
           dbt.answer10=opt91.getText();
           dbt.r91=opt91.getText();if(dbt.r91.equals(dbt.j)){dbt.Counter=dbt.Counter+x10;mark10.setText(""+dbt.mark10); }
       else {mark10.setText(""+dbt.id);}
}else if (op92.isSelected()){
    dbt.answer10=opt92.getText();
    dbt.r92=opt92.getText(); if(dbt.r92.equals(dbt.j)){ dbt.Counter=dbt.Counter+x10;mark10.setText(""+dbt.mark10); }
else {mark10.setText(""+dbt.id);}
}else if (op93.isSelected()){
    dbt.answer10=opt93.getText();
    dbt.r93=opt93.getText();if(dbt.r93.equals(dbt.j)){dbt.Counter=dbt.Counter+x10;mark10.setText(""+dbt.mark10); }
else {mark10.setText(""+dbt.id);}
}else if (op94.isSelected()){
dbt.answer10=opt94.getText();    
dbt.r94=opt94.getText();if(dbt.r94.equals(dbt.j)){dbt.Counter=dbt.Counter+x10;mark10.setText(""+dbt.mark10); }
else {mark10.setText(""+dbt.id);}}        
       dbt.Cat_Total=dbt.Counter;
       dbt.Cat_Type=jLabel1.getText();
       dbt.mark1=mark1.getText();
       dbt.mark2=mark2.getText();
       dbt.mark3=mark3.getText();
       dbt.mark4=mark4.getText();
       dbt.mark5=mark5.getText();
       dbt.mark6=mark6.getText();
       dbt.mark7=mark7.getText();
       dbt.mark8=mark8.getText();
       dbt.mark9=mark9.getText();
       dbt.mark10=mark10.getText();
       int res = dao.Insert_Catagory5_Result(dbt);
            if (res>0)
            {
           
                JOptionPane.showMessageDialog(null,"Saved Successfully");
              
            }
            }
        catch(HeadlessException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }
       
count.setText(""+dbt.Counter);
      m1.setVisible(true);
      mark1.setVisible(true);
      m2.setVisible(true);
      mark2.setVisible(true);
      m3.setVisible(true);
      mark3.setVisible(true);
      m4.setVisible(true);
      mark4.setVisible(true);
      m5.setVisible(true);
      mark5.setVisible(true);
      m6.setVisible(true);
      mark6.setVisible(true);
      m7.setVisible(true);
      mark7.setVisible(true);
      m8.setVisible(true);
      mark8.setVisible(true);
      m9.setVisible(true);
      mark9.setVisible(true);
      m10.setVisible(true);
      mark10.setVisible(true);
      total.setVisible(true);
      count.setVisible(true);
      CR.setVisible(false);
      finish.setVisible(true);  
  
       }
    }//GEN-LAST:event_CRActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
         
         
       
        
        this.dispose();
    }//GEN-LAST:event_finishActionPerformed

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
            java.util.logging.Logger.getLogger(Student_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
           
            new Quiz_FormGK().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel count;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m10;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JLabel m8;
    private javax.swing.JLabel m9;
    private javax.swing.JLabel mark1;
    private javax.swing.JLabel mark10;
    private javax.swing.JLabel mark2;
    private javax.swing.JLabel mark3;
    private javax.swing.JLabel mark4;
    private javax.swing.JLabel mark5;
    private javax.swing.JLabel mark6;
    private javax.swing.JLabel mark7;
    private javax.swing.JLabel mark8;
    private javax.swing.JLabel mark9;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op11;
    private javax.swing.JRadioButton op12;
    private javax.swing.JRadioButton op13;
    private javax.swing.JRadioButton op14;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op21;
    private javax.swing.JRadioButton op22;
    private javax.swing.JRadioButton op23;
    private javax.swing.JRadioButton op24;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op31;
    private javax.swing.JRadioButton op32;
    private javax.swing.JRadioButton op33;
    private javax.swing.JRadioButton op34;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op41;
    private javax.swing.JRadioButton op42;
    private javax.swing.JRadioButton op43;
    private javax.swing.JRadioButton op44;
    private javax.swing.JRadioButton op51;
    private javax.swing.JRadioButton op52;
    private javax.swing.JRadioButton op53;
    private javax.swing.JRadioButton op54;
    private javax.swing.JRadioButton op61;
    private javax.swing.JRadioButton op62;
    private javax.swing.JRadioButton op63;
    private javax.swing.JRadioButton op64;
    private javax.swing.JRadioButton op71;
    private javax.swing.JRadioButton op72;
    private javax.swing.JRadioButton op73;
    private javax.swing.JRadioButton op74;
    private javax.swing.JRadioButton op81;
    private javax.swing.JRadioButton op82;
    private javax.swing.JRadioButton op83;
    private javax.swing.JRadioButton op84;
    private javax.swing.JRadioButton op91;
    private javax.swing.JRadioButton op92;
    private javax.swing.JRadioButton op93;
    private javax.swing.JRadioButton op94;
    private javax.swing.JLabel opt1;
    private javax.swing.JLabel opt11;
    private javax.swing.JLabel opt12;
    private javax.swing.JLabel opt13;
    private javax.swing.JLabel opt14;
    private javax.swing.JLabel opt2;
    private javax.swing.JLabel opt21;
    private javax.swing.JLabel opt22;
    private javax.swing.JLabel opt23;
    private javax.swing.JLabel opt24;
    private javax.swing.JLabel opt3;
    private javax.swing.JLabel opt31;
    private javax.swing.JLabel opt32;
    private javax.swing.JLabel opt33;
    private javax.swing.JLabel opt34;
    private javax.swing.JLabel opt4;
    private javax.swing.JLabel opt41;
    private javax.swing.JLabel opt42;
    private javax.swing.JLabel opt43;
    private javax.swing.JLabel opt44;
    private javax.swing.JLabel opt51;
    private javax.swing.JLabel opt52;
    private javax.swing.JLabel opt53;
    private javax.swing.JLabel opt54;
    private javax.swing.JLabel opt61;
    private javax.swing.JLabel opt62;
    private javax.swing.JLabel opt63;
    private javax.swing.JLabel opt64;
    private javax.swing.JLabel opt71;
    private javax.swing.JLabel opt72;
    private javax.swing.JLabel opt73;
    private javax.swing.JLabel opt74;
    private javax.swing.JLabel opt81;
    private javax.swing.JLabel opt82;
    private javax.swing.JLabel opt83;
    private javax.swing.JLabel opt84;
    private javax.swing.JLabel opt91;
    private javax.swing.JLabel opt92;
    private javax.swing.JLabel opt93;
    private javax.swing.JLabel opt94;
    private javax.swing.JPanel pn11;
    private javax.swing.JPanel pn12;
    private javax.swing.JPanel pn13;
    private javax.swing.JPanel pn14;
    private javax.swing.JPanel pn15;
    private javax.swing.JPanel pn16;
    private javax.swing.JPanel pn17;
    private javax.swing.JPanel pn22;
    private javax.swing.JPanel pn23;
    private javax.swing.JPanel pn24;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
