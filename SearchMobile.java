/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchMobile.java
 *
 * 
 */

package mobilestorenew;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @
 */
public class SearchMobile extends javax.swing.JFrame {

    /** Creates new form SearchMobile */
    int flag=0,rows=0,b=0,sprice,eprice;
    String id,mname;
    Object data[][];
    JTable table;
    JScrollPane jsp;
    ResultSet rs;
    public SearchMobile() {
        initComponents();
        setVisible(true);
        setSize(1270,740);
        setTitle("Search Mobile Phone");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        ButtonGroup bg=new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jsp.setVisible(false);
        
    }
    public void tabledisp()
    {
                try
                {

                    data=new Object[rows][8];
                    Object[] colheads={"Mobile Phone Id","Mobile Phone Model","Mobile Phone Name","Mobile Phone Price","phone color","IMEI no","Manufacture Date","Accessories"};


                    Connection co;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
                    st = co.createStatement();

                    rs=st.executeQuery("select * from msearch");
                    for(int i=0;i<rows;i++)
                    {
                            rs.next();
                            for(int j=0;j<8;j++)
                            {
                                data [i][j]=rs.getString(j+1);
                                System.out.println(data[i][j]);
                            }
                    }
                    table=new JTable(data,colheads);

                    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                    jsp=new JScrollPane(table,v,h);
                    jsp.setBounds(70,420,900,200);
                    jPanel2.add(jsp);
                    add(jsp);
                    System.out.println("hai we came here");
                    rows=0;
                    st.close();
                    //co.commit();
                    co.close();

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"here the error is1:"+e);
                }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 380, 940, 260);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 40, 150, 30);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText(" Search By Mobile ID or IMEI No.");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(20, 40, 260, 25);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText(" Search By Mobile Name");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(20, 100, 200, 25);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButton3.setText("Search By Mobile Price");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(20, 160, 190, 25);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(290, 100, 150, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(290, 160, 150, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(480, 160, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("to");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 160, 20, 30);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 40, 120, 30);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 100, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 100, 640, 250);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 200, 120, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(870, 200, 110, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Search Mobile Phone Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 350, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:

        jTextField2.setEditable(true);
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        flag=1;
        jsp.setVisible(false);
}//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField4.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        flag=2;
        jsp.setVisible(false);
}//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(flag==0)
        {
            if(jTextField1.getText().equals(""))
            {
                jLabel3.setText("Entry is Must");
            }
            else
            {
                id=jTextField1.getText();
                try
                {
                    Connection co;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
                    st = co.createStatement();
                    ResultSet res=st.executeQuery("select * from newmobile_details where imeino="+"'"+id+"'");
                    Boolean rec=res.next();
                    if(!rec)
                    {
                        JOptionPane.showMessageDialog(null,"There are no records");

                    }
                    else
                    {
                        do
                        {
                            String mid=res.getString(1);
                            String model=res.getString(2);
                            String name=res.getString(3);
                            int price=Integer.parseInt(res.getString(4));
                            String pcolor=res.getString(5);
                            String imei=res.getString(6);
                            String date=res.getString(7);
                            String access=res.getString(8);
                            System.out.println("****"+mid+model+name+pcolor+imei+date+access+"*****");
                            if(id.equals(mid) || id.equals(imei))
                            {
                                        rows++;
                            }
                                    
                            
                        }while(res.next());
                            data=new Object[rows][8];
                    Object[] colheads={"Mobile Phone Id","Mobile Phone Model","Mobile Phone Name","Mobile Phone Price","phone color","IMEI no","Manufacture Date","Accessories"};

                       ResultSet res1=st.executeQuery("select * from newmobile_details where imeino="+"'"+id+"'");
                    //Class.forName("sun.jdbc.odbc.JdbcOdbc");
                    //Connection con=DriverManager.getConnection("Jdbc:Odbc:mobileDSN","scott","tiger");
                    
                    for(int i=0;i<rows;i++)
                    {
                            res1.next();
                            for(int j=0;j<8;j++)
                            {
                                data [i][j]=res1.getString(j+1);
                                System.out.println(data[i][j]);
                            }
                    }
                    table=new JTable(data,colheads);

                    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                    jsp=new JScrollPane(table,v,h);
                    jsp.setBounds(70,420,900,200);
                    jPanel2.add(jsp);
                    add(jsp);
                    System.out.println("hai we came here");
                    rows=0;
                    }
                    //co.commit();
                    co.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"The error is2:" +e);
                }
                //tabledisp();
            }
        }
        
        else if(flag==1)
        {
            if(jTextField2.getText().equals(""))
            {
                jLabel4.setText("Entry is Must");
            }
            else
            {
                mname=jTextField2.getText();
                System.out.println(mname);
                try
                {
                    Connection co;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
                    st = co.createStatement();
                    ResultSet res=st.executeQuery("select * from newmobile_details where mobile_name="+"'"+mname+"'");
                    Boolean rec=res.next();
               
                    if(!rec)
                    {
                        JOptionPane.showMessageDialog(null,"There are no records");
                    }
                    else
                    {
                        do
                        {
                         String name=res.getString(3);
                         String mid;
                            String model;
                            int price;
                            String pcolor;
                            String imei;
                            String date;
                            String access;
                            mid=res.getString(1);
                            model=res.getString(2);
                            name=res.getString(3);
                            price=Integer.parseInt(res.getString(4));
                            pcolor=res.getString(5);
                            imei=res.getString(6);
                            date=res.getString(7);
                            access=res.getString(8);
                
                         System.out.println(name);
                            System.out.println("****"+mid+model+name+pcolor+imei+date+access+"*****");
                            if(mname.equalsIgnoreCase(name))
                        {
                            rows++;
                        }
                        }while(res.next());
                         
                            data=new Object[rows][8];
                    Object[] colheads={"Mobile Phone Id","Mobile Phone Model","Mobile Phone Name","Mobile Phone Price","phone color","IMEI no","Manufacture Date","Accessories"};

                ResultSet res1=st.executeQuery("select * from newmobile_details where mobile_name="+"'"+mname+"'");
                    //Class.forName("sun.jdbc.odbc.JdbcOdbc");
                    //Connection con=DriverManager.getConnection("Jdbc:Odbc:mobileDSN","scott","tiger");
                    
                    for(int i=0;i<rows;i++)
                    {
                            res1.next();
                            for(int j=0;j<8;j++)
                            {
                                data [i][j]=res1.getString(j+1);
                                System.out.println(data[i][j]);
                            }
                    }
                    table=new JTable(data,colheads);

                    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                    jsp=new JScrollPane(table,v,h);
                    jsp.setBounds(70,420,900,200);
                    jPanel2.add(jsp);
                    add(jsp);
                    System.out.println("hai we came here");
                    rows=0;
                    
                    }
                    //co.commit();
                    co.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"The error is3:" +e);
                }
                //tabledisp();
                
            }
        }
        else if(flag==2)
        {
            if(jTextField3.getText().equals("") || jTextField4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill the both fields");
            }
            else if(Integer.parseInt(jTextField3.getText())>Integer.parseInt(jTextField4.getText()))
            {
                JOptionPane.showMessageDialog(null,"First Enter small price and then Enter Big Price");
                jTextField3.setText("");
                jTextField4.setText("");
            }
            else
            {
                sprice=Integer.parseInt(jTextField3.getText());
                eprice=Integer.parseInt(jTextField4.getText());
                System.out.println(sprice+","+eprice);
                try
                {
                    Connection co;
                    Statement st;
                    Class.forName("com.mysql.jdbc.Driver");
                    co = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
                    st = co.createStatement();
                    ResultSet res=st.executeQuery("select * from newmobile_details where mobile_price between"+"'"+sprice+"'"+"and"+"'"+eprice+"'");
                    Boolean rec=res.next();
                    if(!rec)
                    {
                        JOptionPane.showMessageDialog(null,"There are no records");
                    }
                    else
                    {
                            do
                            {

                                String mid=res.getString(1);
                                String model=res.getString(2);
                                String name=res.getString(3);
                                int price=Integer.parseInt(res.getString(4));
                                String pcolor=res.getString(5);
                                String imei=res.getString(6);
                                String date=res.getString(7);
                                String access=res.getString(8);
                                if(price>=sprice&&price<=eprice)
                                {
                                    rows++;
                                }
                            }while(res.next());
                                System.out.append("iam stuck here");
                            data=new Object[rows][8];
                    Object[] colheads={"Mobile Phone Id","Mobile Phone Model","Mobile Phone Name","Mobile Phone Price","phone color","IMEI no","Manufacture Date","Accessories"};

                ResultSet res1=st.executeQuery("select * from newmobile_details where mobile_price between"+"'"+sprice+"'"+"and"+"'"+eprice+"'");
                    //Class.forName("sun.jdbc.odbc.JdbcOdbc");
                    //Connection con=DriverManager.getConnection("Jdbc:Odbc:mobileDSN","scott","tiger");
                    
                    for(int i=0;i<rows;i++)
                    {
                            res1.next();
                            for(int j=0;j<8;j++)
                            {
                                data [i][j]=res1.getString(j+1);
                                //System.out.println(data[i][j]);
                            }
                    }
                    table=new JTable(data,colheads);

                    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                    jsp=new JScrollPane(table,v,h);
                    jsp.setBounds(70,420,900,200);
                    jPanel2.add(jsp);
                    add(jsp);
                    jPanel2.repaint();
                    //table.repaint();
                    jsp.repaint();
                    System.out.println("hai we came here");
                    rows=0;
                                /*for(int i=sprice;i<=eprice;i++)
                                {
                                    if(i==price)
                                    {
                                        PreparedStatement prp=con.prepareStatement("insert into msearch values(?,?,?,?,?,?,?,?)");
                                        prp.setString(1,mid);
                                        prp.setString(2,model);
                                        prp.setString(3,name);
                                        prp.setString(4,Integer.toString(price));
                                        prp.setString(5,pcolor);
                                        prp.setString(6,imei);
                                        prp.setString(7,date);
                                        prp.setString(8,access);

                                        prp.executeUpdate();

                                        System.out.println("iam inside2");
                                        rows++;
                                        b=1;
                                        jTextField3.setText("");
                                        jTextField4.setText("");

                                    }
                                }*/
                            

                            /*if(b==0)
                            {
                                JOptionPane.showMessageDialog(null,"There are no mobiles between the price you entered");
                                jTextField3.setText("");
                                jTextField4.setText("");
                            }*/
                        
                    }
                    //co.commit();
                    co.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,"The error is:4"+e);
                }
               //tabledisp();
                
            }
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
}//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jsp.setVisible(false);
        b=0;
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        jsp.setVisible(false);
        b=0;
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        jsp.setVisible(false);
        b=0;
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        jsp.setVisible(false);
        b=0;
    }//GEN-LAST:event_jTextField4FocusGained

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        flag=0;
        jTextField1.setEditable(true);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField2.setText("");
        jTextField2.setText("");
        jTextField2.setText("");

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMobile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
