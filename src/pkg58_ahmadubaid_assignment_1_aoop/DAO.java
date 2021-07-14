package pkg58_ahmadubaid_assignment_1_aoop;
import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class DAO 
{
    Connection conn = null;
    PreparedStatement pst = null;
    VarDB dbt = new VarDB();
    
    
    void Connection(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/examsystemahmadubaid";
        conn = DriverManager.getConnection(url,"root","");
        Statement st = conn.createStatement();
        }
        catch(HeadlessException | ClassNotFoundException | SQLException ex)
        {JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());}}
  
    ResultSet SelectTotalrslt()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT rollno,name,class,Total_Marks_30,Catagory1,Catagory1_total_10,Catagory2,Catagory2_total_10,Catagory3,Catagory3_total_10 FROM display_result ORDER BY `display_result`.`Total_Marks_30` DESC";
            Statement st = conn.createStatement();
            a = st.executeQuery(qry);  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
   ResultSet SelectTotalForModify()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT question,catagory,qid FROM question_add";
            Statement st = conn.createStatement();
            a = st.executeQuery(qry);  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    
     ResultSet SelectbyID1(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM student_add WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.tmpstd);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
     
     
    ResultSet SelectAllrslt()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM display_result Where rollno=?";
            pst=conn.prepareStatement(qry);
           
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
   
    ResultSet SelectAll()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM question_add  where catagory=? ORDER BY RAND() LIMIT 10 ";
         pst=conn.prepareStatement(qry);
        pst.setString(1, "Science");
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    ResultSet SelectAll1()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM question_add  where catagory=? ORDER BY RAND() LIMIT 10 ";
         pst=conn.prepareStatement(qry);
        pst.setString(1, "Computer Studies");
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    ResultSet SelectAll2()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM question_add  where catagory=? ORDER BY RAND() LIMIT 10 ";
         pst=conn.prepareStatement(qry);
        pst.setString(1, "Math");
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    ResultSet SelectAll3()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM question_add  where catagory=? ORDER BY RAND() LIMIT 10 ";
         pst=conn.prepareStatement(qry);
        pst.setString(1, "PakStudy");
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        ResultSet SelectAll4()
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM question_add  where catagory=? ORDER BY RAND() LIMIT 10 ";
         pst=conn.prepareStatement(qry);
        pst.setString(1, "Gernal Knowledge");
            a = pst.executeQuery();  
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    
    
       
     int Delete(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry="DELETE FROM question_add  WHERE  qid=?";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.qid);
            a = pst.executeUpdate();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
    
    
    int Insert(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " INSERT INTO student_add values (?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.rollno);
            pst.setString(2,dbt.date);
            pst.setString(3,dbt.amount);
            pst.setString(4,dbt.accno);
           
         
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
    
     int InsertTotalResult(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " INSERT INTO display_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
          
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2,dbt.Disp_Stdname);
            pst.setString(3,dbt.Disp_Class);
            pst.setInt(4,dbt.Disp_total_reslt);
            pst.setString(5,dbt.Cat1_Type);           
            pst.setInt(6,dbt.Cat1_Total);
            pst.setString(7,dbt.Cat2_Type);           
            pst.setInt(8,dbt.Cat2_Total);
            pst.setString(9,dbt.Cat3_Type);           
            pst.setInt(10,dbt.Cat3_Total);
            
            pst.setString(11,dbt.c1q1);
            pst.setString(12,dbt.c1answer1);
            pst.setString(13,dbt.c1mark1);
            
            pst.setString(14,dbt.c1q2);
            pst.setString(15,dbt.c1answer2);
            pst.setString(16,dbt.c1mark2);
            
            pst.setString(17,dbt.c1q3);
            pst.setString(18,dbt.c1answer3);
            pst.setString(19,dbt.c1mark3);
            
            pst.setString(20,dbt.c1q4);
            pst.setString(21,dbt.c1answer4);
            pst.setString(22,dbt.c1mark4);
            
            
            pst.setString(23,dbt.c1q5);
            pst.setString(24,dbt.c1answer5);
            pst.setString(25,dbt.c1mark5);
            
            pst.setString(26,dbt.c1q6);
            pst.setString(27,dbt.c1answer6);
            pst.setString(28,dbt.c1mark6);
            
            pst.setString(29,dbt.c1q7);
            pst.setString(30,dbt.c1answer7);
            pst.setString(31,dbt.c1mark7);
            
            
            pst.setString(32,dbt.c1q8);
            pst.setString(33,dbt.c1answer8);
            pst.setString(34,dbt.c1mark8);
            
            pst.setString(35,dbt.c1q9);
            pst.setString(36,dbt.c1answer9);
            pst.setString(37,dbt.c1mark9);
            
            pst.setString(38,dbt.c1q10);
            pst.setString(39,dbt.c1answer10);
            pst.setString(40,dbt.c1mark10);
            
            
            
            
            
            
            
            pst.setString(41,dbt.c2q1);
            pst.setString(42,dbt.c2answer1);
            pst.setString(43,dbt.c2mark1);
            
            pst.setString(44,dbt.c2q2);
            pst.setString(45,dbt.c2answer2);
            pst.setString(46,dbt.c2mark2);
            
            pst.setString(47,dbt.c2q3);
            pst.setString(48,dbt.c2answer3);
            pst.setString(49,dbt.c2mark3);
            
            pst.setString(50,dbt.c2q4);
            pst.setString(51,dbt.c2answer4);
            pst.setString(52,dbt.c2mark4);
            
            
            pst.setString(53,dbt.c2q5);
            pst.setString(54,dbt.c2answer5);
            pst.setString(55,dbt.c2mark5);
            
            pst.setString(56,dbt.c2q6);
            pst.setString(57,dbt.c2answer6);
            pst.setString(58,dbt.c2mark6);
            
            pst.setString(59,dbt.c2q7);
            pst.setString(60,dbt.c2answer7);
            pst.setString(61,dbt.c2mark7);
            
            
            pst.setString(62,dbt.c2q8);
            pst.setString(63,dbt.c2answer8);
            pst.setString(64,dbt.c2mark8);
            
            pst.setString(65,dbt.c2q9);
            pst.setString(66,dbt.c2answer9);
            pst.setString(67,dbt.c2mark9);
            
            pst.setString(68,dbt.c2q10);
            pst.setString(69,dbt.c2answer10);
            pst.setString(70,dbt.c2mark10);
            
            
            
              pst.setString(71,dbt.c3q1);
            pst.setString(72,dbt.c3answer1);
            pst.setString(73,dbt.c3mark1);
            
            pst.setString(74,dbt.c3q2);
            pst.setString(75,dbt.c3answer2);
            pst.setString(76,dbt.c3mark2);
            
            pst.setString(77,dbt.c3q3);
            pst.setString(78,dbt.c3answer3);
            pst.setString(79,dbt.c3mark3);
            
            pst.setString(80,dbt.c3q4);
            pst.setString(81,dbt.c3answer4);
            pst.setString(82,dbt.c3mark4);
            
            
            pst.setString(83,dbt.c3q5);
            pst.setString(84,dbt.c3answer5);
            pst.setString(85,dbt.c3mark5);
            
            pst.setString(86,dbt.c3q6);
            pst.setString(87,dbt.c3answer6);
            pst.setString(88,dbt.c3mark6);
            
            pst.setString(89,dbt.c3q7);
            pst.setString(90,dbt.c3answer7);
            pst.setString(91,dbt.c3mark7);
            
            
            pst.setString(92,dbt.c3q8);
            pst.setString(93,dbt.c3answer8);
            pst.setString(94,dbt.c3mark8);
            
            pst.setString(95,dbt.c3q9);
            pst.setString(96,dbt.c3answer9);
            pst.setString(97,dbt.c3mark9);
            
            pst.setString(98,dbt.c3q10);
            pst.setString(99,dbt.c3answer10);
            pst.setString(100,dbt.c3mark10);

            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
    
     int Insert_Catagory1_Result(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
 String qry = " INSERT INTO display_science_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2, dbt.Stdname);
            pst.setString(3, dbt.Class);
            pst.setString(4, dbt.Cat_Type);
            pst.setInt(5, dbt.Cat_Total);
            
            pst.setString(6, dbt.q1);
            pst.setString(7, dbt.answer1);
            pst.setString(8, dbt.mark1);
            pst.setString(9, dbt.q2);
            pst.setString(10, dbt.answer2);
            
            pst.setString(11, dbt.mark2);
            pst.setString(12, dbt.q3);
            pst.setString(13, dbt.answer3);
            pst.setString(14, dbt.mark3);
            pst.setString(15, dbt.q4);
            
            pst.setString(16, dbt.answer4);
            pst.setString(17, dbt.mark4);
            pst.setString(18, dbt.q5);
            pst.setString(19, dbt.answer5);
            pst.setString(20, dbt.mark5);
           
            pst.setString(21, dbt.q6);
            pst.setString(22, dbt.answer6);
            pst.setString(23, dbt.mark6);
            pst.setString(24, dbt.q7);
            pst.setString(25, dbt.answer7);
           
            pst.setString(26, dbt.mark7);
            pst.setString(27, dbt.q8);
            pst.setString(28, dbt.answer8);
            pst.setString(29, dbt.mark8);
            pst.setString(30, dbt.q9);
           
            pst.setString(31, dbt.answer9);
            pst.setString(32, dbt.mark9);
            pst.setString(33, dbt.q10);
            pst.setString(34, dbt.answer10);
            pst.setString(35, dbt.mark10);
           
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
     
    int Insert_Catagory2_Result(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
 String qry = " INSERT INTO display_computerstudies_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2, dbt.Stdname);
            pst.setString(3, dbt.Class);
            pst.setString(4, dbt.Cat_Type);
            pst.setInt(5, dbt.Cat_Total);
            
            pst.setString(6, dbt.q1);
            pst.setString(7, dbt.answer1);
            pst.setString(8, dbt.mark1);
            pst.setString(9, dbt.q2);
            pst.setString(10, dbt.answer2);
            
            pst.setString(11, dbt.mark2);
            pst.setString(12, dbt.q3);
            pst.setString(13, dbt.answer3);
            pst.setString(14, dbt.mark3);
            pst.setString(15, dbt.q4);
            
            pst.setString(16, dbt.answer4);
            pst.setString(17, dbt.mark4);
            pst.setString(18, dbt.q5);
            pst.setString(19, dbt.answer5);
            pst.setString(20, dbt.mark5);
           
            pst.setString(21, dbt.q6);
            pst.setString(22, dbt.answer6);
            pst.setString(23, dbt.mark6);
            pst.setString(24, dbt.q7);
            pst.setString(25, dbt.answer7);
           
            pst.setString(26, dbt.mark7);
            pst.setString(27, dbt.q8);
            pst.setString(28, dbt.answer8);
            pst.setString(29, dbt.mark8);
            pst.setString(30, dbt.q9);
           
            pst.setString(31, dbt.answer9);
            pst.setString(32, dbt.mark9);
            pst.setString(33, dbt.q10);
            pst.setString(34, dbt.answer10);
            pst.setString(35, dbt.mark10);
           
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    } 
    int Insert_Catagory3_Result(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
 String qry = " INSERT INTO display_maths_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2, dbt.Stdname);
            pst.setString(3, dbt.Class);
            pst.setString(4, dbt.Cat_Type);
            pst.setInt(5, dbt.Cat_Total);
            
            pst.setString(6, dbt.q1);
            pst.setString(7, dbt.answer1);
            pst.setString(8, dbt.mark1);
            pst.setString(9, dbt.q2);
            pst.setString(10, dbt.answer2);
            
            pst.setString(11, dbt.mark2);
            pst.setString(12, dbt.q3);
            pst.setString(13, dbt.answer3);
            pst.setString(14, dbt.mark3);
            pst.setString(15, dbt.q4);
            
            pst.setString(16, dbt.answer4);
            pst.setString(17, dbt.mark4);
            pst.setString(18, dbt.q5);
            pst.setString(19, dbt.answer5);
            pst.setString(20, dbt.mark5);
           
            pst.setString(21, dbt.q6);
            pst.setString(22, dbt.answer6);
            pst.setString(23, dbt.mark6);
            pst.setString(24, dbt.q7);
            pst.setString(25, dbt.answer7);
           
            pst.setString(26, dbt.mark7);
            pst.setString(27, dbt.q8);
            pst.setString(28, dbt.answer8);
            pst.setString(29, dbt.mark8);
            pst.setString(30, dbt.q9);
           
            pst.setString(31, dbt.answer9);
            pst.setString(32, dbt.mark9);
            pst.setString(33, dbt.q10);
            pst.setString(34, dbt.answer10);
            pst.setString(35, dbt.mark10);
           
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    } 
     int Insert_Catagory4_Result(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
 String qry = " INSERT INTO display_pakstudy_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2, dbt.Stdname);
            pst.setString(3, dbt.Class);
            pst.setString(4, dbt.Cat_Type);
            pst.setInt(5, dbt.Cat_Total);
            
            pst.setString(6, dbt.q1);
            pst.setString(7, dbt.answer1);
            pst.setString(8, dbt.mark1);
            pst.setString(9, dbt.q2);
            pst.setString(10, dbt.answer2);
            
            pst.setString(11, dbt.mark2);
            pst.setString(12, dbt.q3);
            pst.setString(13, dbt.answer3);
            pst.setString(14, dbt.mark3);
            pst.setString(15, dbt.q4);
            
            pst.setString(16, dbt.answer4);
            pst.setString(17, dbt.mark4);
            pst.setString(18, dbt.q5);
            pst.setString(19, dbt.answer5);
            pst.setString(20, dbt.mark5);
           
            pst.setString(21, dbt.q6);
            pst.setString(22, dbt.answer6);
            pst.setString(23, dbt.mark6);
            pst.setString(24, dbt.q7);
            pst.setString(25, dbt.answer7);
           
            pst.setString(26, dbt.mark7);
            pst.setString(27, dbt.q8);
            pst.setString(28, dbt.answer8);
            pst.setString(29, dbt.mark8);
            pst.setString(30, dbt.q9);
           
            pst.setString(31, dbt.answer9);
            pst.setString(32, dbt.mark9);
            pst.setString(33, dbt.q10);
            pst.setString(34, dbt.answer10);
            pst.setString(35, dbt.mark10);
           
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    } 
      int Insert_Catagory5_Result(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
 String qry = " INSERT INTO display_gernalknowledge_result values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            pst.setString(2, dbt.Stdname);
            pst.setString(3, dbt.Class);
            pst.setString(4, dbt.Cat_Type);
            pst.setInt(5, dbt.Cat_Total);
            
            pst.setString(6, dbt.q1);
            pst.setString(7, dbt.answer1);
            pst.setString(8, dbt.mark1);
            pst.setString(9, dbt.q2);
            pst.setString(10, dbt.answer2);
            
            pst.setString(11, dbt.mark2);
            pst.setString(12, dbt.q3);
            pst.setString(13, dbt.answer3);
            pst.setString(14, dbt.mark3);
            pst.setString(15, dbt.q4);
            
            pst.setString(16, dbt.answer4);
            pst.setString(17, dbt.mark4);
            pst.setString(18, dbt.q5);
            pst.setString(19, dbt.answer5);
            pst.setString(20, dbt.mark5);
           
            pst.setString(21, dbt.q6);
            pst.setString(22, dbt.answer6);
            pst.setString(23, dbt.mark6);
            pst.setString(24, dbt.q7);
            pst.setString(25, dbt.answer7);
           
            pst.setString(26, dbt.mark7);
            pst.setString(27, dbt.q8);
            pst.setString(28, dbt.answer8);
            pst.setString(29, dbt.mark8);
            pst.setString(30, dbt.q9);
           
            pst.setString(31, dbt.answer9);
            pst.setString(32, dbt.mark9);
            pst.setString(33, dbt.q10);
            pst.setString(34, dbt.answer10);
            pst.setString(35, dbt.mark10);
           
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    } 
    int Inserttmpdetails(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " INSERT INTO stview values (?)";
            pst = conn.prepareStatement(qry); 
            pst.setString(1,dbt.sidcatch);
          
           
         
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
    
    int InsertQuestion(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " INSERT INTO question_add values (?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(qry); 
           
            pst.setString(1,dbt.Question);
            pst.setString(2,dbt.Catagory);
            pst.setInt(3, dbt.qid);
            pst.setString(4, dbt.option1);
            pst.setString(5, dbt.option2);
            pst.setString(6, dbt.option3);
            pst.setString(7, dbt.option4);
             pst.setString(8, dbt.CorrectOpt);
             pst.setInt(9, dbt.Dificulty);
            a = pst.executeUpdate();
            
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }
    
    
        ResultSet Cat1ID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM display_science_result WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        ResultSet Cat2ID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM display_computerstudies_result WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        ResultSet Cat3ID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM display_maths_result WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        ResultSet Cat4ID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM display_pakstudy_result WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
     ResultSet Cat5ID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM display_gernalknowledge_result WHERE rollno = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
    
    
        ResultSet SelectbyID(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT  * FROM question_add WHERE qid = ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.qid);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        
          ResultSet SelectbyID_admin(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM admin_login WHERE Username= ? ";
            pst = conn.prepareStatement(qry); 
            pst.setString(1,dbt.var_Login);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
          ResultSet SelectbyID_admin_Login(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
             String qry ="SELECT * FROM admin_login WHERE Username=? AND Password=?";
            pst = conn.prepareStatement(qry); 
            pst.setString(1,dbt.user);
            pst.setString(2,dbt.passcode);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
          ResultSet SelectbyID_Student_Login(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry ="SELECT * FROM student_add WHERE  rollno=? AND password=?";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Stduser);
            pst.setString(2,dbt.passcode);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        
        
      int Update(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " UPDATE question_add SET catagory = ?  WHERE  qid=?";
            pst = conn.prepareStatement(qry); 
            pst.setString(1,dbt.Catagory);
          
            pst.setInt(2,dbt.qid);
            a = pst.executeUpdate();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }  
      
        int UpdateQuestion(VarDB dbt)
    {
        int a = 0;
        try
        {
            Connection ();
            String qry = " UPDATE question_add SET question= ?,option1=?,option2=?,option3=?,option4=?,CorrectOption=?,difficultyLevel=?  WHERE  qid=?";
            pst = conn.prepareStatement(qry); 
            pst.setString(1,dbt.Question);
            pst.setString(2,dbt.option1);
            pst.setString(3,dbt.option2);
            pst.setString(4,dbt.option3);
            pst.setString(5,dbt.option4);
            pst.setString(6,dbt.Correctoption);
            pst.setInt(7,dbt.Dificulty);
            pst.setInt(8,dbt.qid);
            a = pst.executeUpdate();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a;
    }   
      
      
      
      
      
      
      
      
      
      
          ResultSet SelectbyID_Result(VarDB dbt)
    {
        ResultSet a = null;
        try
        {
            Connection();
            String qry = " SELECT * FROM display_result WHERE rollno= ? ";
            pst = conn.prepareStatement(qry); 
            pst.setInt(1,dbt.Rollno_rslt);
            a = pst.executeQuery();
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Exception Occured-->"+ex.getMessage());
        }   
        return a; 
    }
        
}

