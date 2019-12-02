/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconnect;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cordotoma_sd2081
 */
public class Sqlconnect {

    int no1 = 0;
    int no2 = 2;
    int no3 = 3;
    int no4 = 4;
    int no5 = 5;
    Date today = new Date();

    public Connection sqlConnect() {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/sqlconnect";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            return conn;
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return null;
        }

    }
public boolean addData(String sqlString) {
        try {
            Connection conn = sqlConnect();
            Statement st = conn.createStatement();

            st.executeUpdate(sqlString);
            conn.close();
            return true;
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            return false;
        }

    }

    public void insert() { //This function is to insert 1000 rows

        int counter = 0;
        long startime = today.getTime();
        SimpleDateFormat started = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Time Started: " + started.format(today));
        try {
            while (counter != 1000) {
                System.out.println("Sulod");
                no1 += 1;
                no2 += 1;
                no3 += 1;
                no4 += 1;
                no5 += 1;
               String sqlString = ("INSERT INTO `dbconnected`( `number1`, `number2`, `number3`, `number4`, `number5`)"
                        + "VALUES('" + no1 + "','" + no2 + "','" + no3 + "','" + no4 + "','" + no5 + "')");
                addData(sqlString);
                counter += 1;

            }
            System.out.println(counter + " inserted row in your database");
            long endtime = today.getTime();
            SimpleDateFormat ended = new SimpleDateFormat("hh:mm:ss a");
            System.out.println("Time Ended: " + ended.format(today));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void insert300(){
        int counter = 0;
        long startime = today.getTime();
        SimpleDateFormat started = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Time Started: " + started.format(today));
        try {
            while (counter != 300) {
                System.out.println("Sulod");
                no1 += 1;
                no2 += 1;
                no3 += 1;
                no4 += 1;
                no5 += 1;
               String sqlString = ("INSERT INTO `dbconnected`( `number1`, `number2`, `number3`, `number4`, `number5`)"
                        + "VALUES('" + no1 + "','" + no2 + "','" + no3 + "','" + no4 + "','" + no5 + "')");
                addData(sqlString);
                counter += 1;

            }
            System.out.println(counter + " inserted row in your database");
            long endtime = today.getTime();
            SimpleDateFormat ended = new SimpleDateFormat("hh:mm:ss a");
            System.out.println("Time Ended: " + ended.format(today));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void delete() {

        int counter = 0;
        long startime = today.getTime();
        SimpleDateFormat started = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Time Started: " + started.format(today));
        try {
            while (counter != 1000) {
                no1 += 1;
                String sqlString = ("DELETE FROM `dbconnected` where " + no1);
                addData(sqlString);
                counter += 1;

            }
            System.out.println(counter + " deleted row in your database");
            long endtime = today.getTime();
            SimpleDateFormat ended = new SimpleDateFormat("hh:mm:ss a");
            System.out.println("Time Ended: " + ended.format(today));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void delete300(){

        int counter = 0;
        long startime = today.getTime();
        SimpleDateFormat started = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Time Started: " + started.format(today));
        try {
            while (counter != 300) {
                no1 += 1;
                String sqlString = ("DELETE FROM `dbconnected` where " + no1);
                addData(sqlString);
                counter += 1;

            }
            System.out.println(counter + " deleted row in your database");
            long endtime = today.getTime();
            SimpleDateFormat ended = new SimpleDateFormat("hh:mm:ss a");
            System.out.println("Time Ended: " + ended.format(today));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static void main(String[] args) {
        Sqlconnect sql = new Sqlconnect();
        //sql.insert();
//         sql.delete();
//        sql.insert300();
        sql.delete300();

    }

}
