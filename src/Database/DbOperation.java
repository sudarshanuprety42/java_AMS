/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import GUI.LecturerRegistered;
import GUI.StudentRegistered;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudarsan
 */
public class DbOperation {

    public void updateStudent(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "UPDATE \"Student_Info\" set first_name=?, last_name=?, gender=?, address=?,"
                + "city=?,phone_number=?, email=?, dob=?, security_word=?, password=? WHERE id=?;";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setString(5, dataToSave.get(4).toString());
            ps.setLong(6, Long.parseLong(dataToSave.get(5).toString()));
            ps.setString(7, dataToSave.get(6).toString());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(dataToSave.get(7).toString());

            ps.setDate(8, new java.sql.Date(d.getTime()));
            ps.setString(9, dataToSave.get(8).toString());
            ps.setString(10, dataToSave.get(9).toString());
            ps.setInt(11, Integer.parseInt(dataToSave.get(10).toString()));
            ps.executeUpdate();
            SQL = "select id from \"Student_Info\" where phone_number=?";
            PreparedStatement ps1 = dc.conn.prepareStatement(SQL);
            ps1.setLong(1, Long.parseLong(dataToSave.get(5).toString()));
            ResultSet rs = ps1.executeQuery();
            String a = "";
            while (rs.next()) {
                a += rs.getString("id");
            }
            StudentRegistered sr = new StudentRegistered(a, dataToSave.get(9).toString());
            sr.setLabelValue("Student successfully updated with:");
            sr.setVisible(true);
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateAttendence(String colname, boolean a, String date) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "UPDATE \"DAA\" set " + colname + "=" + a + " where lecture_date=?;";

        PreparedStatement ps;
        try {
            ps = dc.conn.prepareStatement(SQL);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(date);

            ps.setDate(1, new java.sql.Date(d.getTime()));

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Statement s;
//        try {
//            s = dc.conn.createStatement();
//                        s.executeUpdate(SQL);
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
//        }
        dc.closeDBConnection();

    }

    public void updateLecturer(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "UPDATE \"Lecturer_Info\" set first_name=?, last_name=?, gender=?, address=?,"
                + "city=?,phone_number=?, email=?, dob=?, security_word=?, password=? WHERE id=?;";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setString(5, dataToSave.get(4).toString());
            ps.setLong(6, Long.parseLong(dataToSave.get(5).toString()));
            ps.setString(7, dataToSave.get(6).toString());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(dataToSave.get(7).toString());

            ps.setDate(8, new java.sql.Date(d.getTime()));
            ps.setString(9, dataToSave.get(8).toString());
            ps.setString(10, dataToSave.get(9).toString());
            ps.setInt(11, Integer.parseInt(dataToSave.get(10).toString()));
            ps.executeUpdate();
            SQL = "select id from \"Lecturer_Info\" where phone_number=?";
            PreparedStatement ps1 = dc.conn.prepareStatement(SQL);
            ps1.setLong(1, Long.parseLong(dataToSave.get(5).toString()));
            ResultSet rs = ps1.executeQuery();
            String a = "";
            while (rs.next()) {
                a += rs.getString("id");
            }
            LecturerRegistered sr = new LecturerRegistered(a, dataToSave.get(9).toString());
            sr.setLabelValue("Lecturer successfully updated with:");
            sr.setVisible(true);
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verifyAdmin(String uname, String pw) {
        String a = "";
        boolean valid = false;
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "select password from \"Admin_Info\" where username=?;";
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
            if (a.equals(pw)) {
                valid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        dc.closeDBConnection();
        return valid;
    }

    public boolean verifyLecturer(String uname, String pw) {
        String a = "";
        boolean valid = false;
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "select password from \"Lecturer_Info\" where id=?;";
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(uname));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
            if (a.equals(pw)) {
                valid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        dc.closeDBConnection();
        return valid;
    }

    public boolean verifyStudent(String uname, String pw) {
        String a = "";
        boolean valid = false;
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "select password from \"Student_Info\" where id=?;";
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(uname));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
            if (a.equals(pw)) {
                valid = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        dc.closeDBConnection();
        return valid;
    }

    public ResultSet getNameByID(String id) {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select first_name,last_name from \"Student_Info\" where id=" + id;

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public ResultSet getName() {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select first_name,last_name from \"Student_Info\" order by id";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public void saveAttendence(ArrayList dataToSave, ArrayList fullnames) {
        System.out.println(dataToSave.size());
        System.out.println(fullnames.size());
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "insert into \"DAA\"(";
        SQL += "lecture_date";
        for (int i = 0; i < fullnames.size(); i++) {
            SQL += "," + fullnames.get(i);
        }

        SQL += ") values (" + "current_timeStamp";
        for (int i = 1; i < dataToSave.size(); i++) {
            SQL += "," + dataToSave.get(i);
        }
        SQL += ");";

        Statement s;
        try {
            s = dc.conn.createStatement();
            s.executeUpdate(SQL);

//            int b=s.executeUpdate(SQL);
//            if(b==0){
//                                    JOptionPane.showMessageDialog(this, "Attendence already registered for today");
//
//            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

        dc.closeDBConnection();
    }

    public void saveDataToStudentTable(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String name = dataToSave.get(0).toString() + "_" + dataToSave.get(1).toString();
        String SQL = "insert into \"Student_Info\"(first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password) values (?,?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setString(5, dataToSave.get(4).toString());
            ps.setLong(6, Long.parseLong(dataToSave.get(5).toString()));
            ps.setString(7, dataToSave.get(6).toString());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(dataToSave.get(7).toString());

            ps.setDate(8, new java.sql.Date(d.getTime()));
            ps.setString(9, dataToSave.get(8).toString());
            ps.setString(10, dataToSave.get(9).toString());

            ps.executeUpdate();
            SQL = "select id from \"Student_Info\" where phone_number=?";
            PreparedStatement ps1 = dc.conn.prepareStatement(SQL);
            ps1.setLong(1, Long.parseLong(dataToSave.get(5).toString()));
            ResultSet rs = ps1.executeQuery();
            String a = "";
            while (rs.next()) {
                a += rs.getString("id");
            }
            StudentRegistered sr = new StudentRegistered(a, dataToSave.get(9).toString());
            sr.setLabelValue("Student successfully registered with:");
            sr.setVisible(true);

            String asql = "alter table \"DAA\" add column " + name + " varchar";
            Statement s2 = dc.conn.createStatement();
            s2.executeUpdate(asql);
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet getReason(String date, String fn) {
        String query;
        System.out.println(date+fn);
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select absent_reason from reason where fullname=? and absent_date=?";
            PreparedStatement ps = dc.conn.prepareStatement(query);

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(date);

            ps.setDate(2, new java.sql.Date(d.getTime()));
            ps.setString(1, fn);

            rs = ps.executeQuery();
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public void saveReason(String date, String fn, String reason, boolean exist) {
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            String SQL = "insert into \"reason\"(absent_date,fullname,absent_reason) values (?,?,?);";

            String SQL1 = "delete from reason where fullname=? and absent_date=?";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            PreparedStatement ps1 = dc.conn.prepareStatement(SQL1);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(date);

            ps.setDate(1, new java.sql.Date(d.getTime()));
            ps.setString(2, fn);
            ps.setString(3, reason);

            ps1.setDate(2, new java.sql.Date(d.getTime()));
            ps1.setString(1, fn);
            ps1.executeUpdate();
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet viewAttendenceStudent(String columnName) {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select lecture_date," + columnName + " from \"DAA\" ;";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public void dropColumn(String columnName) {
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();

            String asql = "alter table \"DAA\" drop column " + columnName + ";";
            Statement s2 = dc.conn.createStatement();
            s2.executeUpdate(asql);
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet viewAttendence() {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select * from \"DAA\" order by lecture_date asc";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public ResultSet viewStudentTable() {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Student_Info\" order by id asc";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public ResultSet viewFromIDStudentTable(String fn, String ln) {

        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            query = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Student_Info\" where first_name ilike ?"
                    + "and last_name ilike ?";

            PreparedStatement ps = dc.conn.prepareStatement(query);
            ps.setString(1, fn + "%");
            ps.setString(2, ln + "%");
            rs = ps.executeQuery();
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public ArrayList loadFromIDStudentTable(String id) {
        String SQL;
        ArrayList data = new ArrayList();
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Student_Info\" where id=?;";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            data.add(id);
            while (rs.next()) {
                data.add(rs.getString("first_name"));
                data.add(rs.getString("last_name"));
                data.add(rs.getString("gender"));
                data.add(rs.getString("address"));
                data.add(rs.getString("city"));
                data.add(rs.getString("phone_number"));
                data.add(rs.getString("email"));
                data.add(rs.getString("dob"));
                data.add(rs.getString("security_word"));
                data.add(rs.getString("password"));
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
    }

    public ArrayList loadFromIDLecturerTable(String id) {
        String SQL;
        ArrayList data = new ArrayList();
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Lecturer_Info\" where id=?;";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            data.add(id);
            while (rs.next()) {
                data.add(rs.getString("first_name"));
                data.add(rs.getString("last_name"));
                data.add(rs.getString("gender"));
                data.add(rs.getString("address"));
                data.add(rs.getString("city"));
                data.add(rs.getString("phone_number"));
                data.add(rs.getString("email"));
                data.add(rs.getString("dob"));
                data.add(rs.getString("security_word"));
                data.add(rs.getString("password"));
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return data;
    }

    public String deleteFromIDStudentTable(String id) {
        String SQL;
        String a = "";
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select first_name,last_name from \"Student_Info\" where id=?;";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a += rs.getString("first_name");
                a += " ";
                a += rs.getString("last_name");
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return a;
    }

    public void DeleteStudent(String id) {
        String SQL = "DELETE FROM \"Student_Info\" WHERE id=?;";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String deleteFromIDLecturerTable(String id) {
        String SQL;
        String a = "";
        try {

            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            SQL = "select first_name,last_name from \"Lecturer_Info\" where id=?;";
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a += rs.getString("first_name");
                a += " ";
                a += rs.getString("last_name");
            }
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return a;
    }

    public void DeleteLecturer(String id) {
        String SQL = "DELETE FROM \"Lecturer_Info\" WHERE id=?;";
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet viewFromIDLecturerTable(String fn, String ln) {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            query = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Lecturer_Info\" where first_name ilike ?"
                    + "and last_name ilike ?";

            PreparedStatement ps = dc.conn.prepareStatement(query);
            ps.setString(1, fn + "%");
            ps.setString(2, ln + "%");
            rs = ps.executeQuery();
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public ResultSet viewLecturerTable() {
        String query;
        ResultSet rs = null;
        try {
            DB_Connect dc = new DB_Connect();
            dc.connectDatabase();
            Statement s = dc.conn.createStatement();
            query = "select id,first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password from \"Lecturer_Info\" order by id asc";

            rs = s.executeQuery(query);
            dc.closeDBConnection();

        } catch (SQLException ex) {
            System.out.println("cant create statement" + ex);
        }
        return rs;
    }

    public void saveDataToLecturerTable(ArrayList dataToSave) {
        DB_Connect dc = new DB_Connect();
        dc.connectDatabase();
        String SQL = "insert into \"Lecturer_Info\"(first_name,last_name,gender,address,city,phone_number,email,dob,security_word,password) values (?,?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = dc.conn.prepareStatement(SQL);
            ps.setString(1, dataToSave.get(0).toString());
            ps.setString(2, dataToSave.get(1).toString());
            ps.setString(3, dataToSave.get(2).toString());
            ps.setString(4, dataToSave.get(3).toString());
            ps.setString(5, dataToSave.get(4).toString());
            ps.setLong(6, Long.parseLong(dataToSave.get(5).toString()));
            ps.setString(7, dataToSave.get(6).toString());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date d = df.parse(dataToSave.get(7).toString());

            ps.setDate(8, new java.sql.Date(d.getTime()));
            ps.setString(9, dataToSave.get(8).toString());
            ps.setString(10, dataToSave.get(9).toString());

            ps.executeUpdate();
            SQL = "select id from \"Lecturer_Info\" where phone_number=?";
            PreparedStatement ps1 = dc.conn.prepareStatement(SQL);
            ps1.setLong(1, Long.parseLong(dataToSave.get(5).toString()));
            ResultSet rs = ps1.executeQuery();
            String a = "";
            while (rs.next()) {
                a += rs.getString("id");
            }
            LecturerRegistered sr = new LecturerRegistered(a, dataToSave.get(9).toString());
            sr.setLabelValue("Lecturer successfully registered with:");
            sr.setVisible(true);
            dc.closeDBConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
