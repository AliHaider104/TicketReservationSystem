package com.TicketController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

@Controller
public class TicketController {


    @RequestMapping("/Signup")
    public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {

        String Name = request.getParameter("t1");
        String Password = request.getParameter("t2");
        boolean result = addUser(Name,Password);


        ModelAndView mv = new ModelAndView();

        if(result==true)
            mv.setViewName("ResultAdded.jsp");
        else
            mv.setViewName("Result.jsp");
        return mv;

    }

    @RequestMapping("/Purchase")
    public ModelAndView Buy(HttpServletRequest request,HttpServletResponse response) {

        String Name = GetLoginUser();
        boolean result = addData(Name);


        ModelAndView mv = new ModelAndView();

        if(result==true)
            mv.setViewName("PurchasedS.jsp");
        else
            mv.setViewName("PurchasedF.jsp");
        return mv;

    }

    @RequestMapping("/Login")
    public ModelAndView Login(HttpServletRequest request,HttpServletResponse response) {

        String Name = request.getParameter("t1");
        String Password = request.getParameter("t2");

        if(Name.contentEquals("Admin") && Password.contentEquals("Admin"))
        {
            List<String> L = GetTicketUser();
            ModelAndView mv = new ModelAndView();
            mv.addObject("Users",L);
            mv.setViewName("adminPage.jsp");
            return mv;

        }else {

            boolean result = LoginUser(Name,Password);


            ModelAndView mv = new ModelAndView();

            if(result==true) {
                AddLogin(Name);
                mv.setViewName("MainPage.jsp");
                mv.addObject("Name",Name);
            }
            else
                mv.setViewName("loginFail.jsp");
            return mv;

        }


    }


    @RequestMapping("/login")
    public ModelAndView loginPage()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login.jsp");
        return mv;

    }
    @RequestMapping("/signup")
    public ModelAndView SignupPage()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        return mv;

    }


    // This function will add user to database

    public static boolean addUser(String Name,String Password)
    {
        try{
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            String query="insert into signup (userName,userPassword) values (?,?);";
            PreparedStatement st= con.prepareStatement(query);


            st.setString(1, Name);
            st.setString(2, Password);
            st.executeUpdate();
            System.out.print("Added");
            return true;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return false;
        }

    }

    public static boolean AddLogin(String Name)
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            // delete previous data
            String query1="delete from loggedin";
            PreparedStatement st1=con.prepareStatement(query1);
            st1.executeUpdate();

            // enter new data
            String query="insert into loggedin (userName) values (?);";
            PreparedStatement st= con.prepareStatement(query);


            st.setString(1, Name);
            st.executeUpdate();
            System.out.print("Added");
            return true;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return false;
        }

    }

    public static boolean addData(String Name)
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            String query="insert into Purchase (userName) values (?);";
            PreparedStatement st= con.prepareStatement(query);


            st.setString(1, Name);

            st.executeUpdate();
            System.out.print("Added");
            return true;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return false;
        }

    }

    // This function will check login
    public static boolean LoginUser(String Name,String Password)
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            String query="select* from signup";
            PreparedStatement st= con.prepareStatement(query);

            ResultSet rs=st.executeQuery();
            boolean found=false;


            while(rs.next())
            {
                if(Name.contentEquals(rs.getNString("userName")) &&
                        Password.contentEquals(rs.getNString("userPassword")))
                {
                    found=true;
                    return true;
                }
            }


            return false;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return false;
        }

    }

    public static String GetLoginUser()
    {
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            String query="select* from loggedin";
            PreparedStatement st= con.prepareStatement(query);

            ResultSet rs=st.executeQuery();
            boolean found=false;


            while(rs.next())
            {
                return rs.getNString("userName");
            }
        return null;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return null;

        }

    }

    public static List<String> GetTicketUser()
    {
        try{
            List<String> S= new ArrayList<>();

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url="jdbc:ucanaccess://C:\\Users\\Ali Haider\\Desktop\\TicketSystem.mdb";
            Connection con= DriverManager.getConnection(url);

            String query="select* from Purchase";
            PreparedStatement st= con.prepareStatement(query);

            ResultSet rs=st.executeQuery();
            boolean found=false;


            while(rs.next())
            {
                S.add(rs.getNString("userName"));
            }
            return S;

        }
        catch(Exception ex)
        {
            System.out.print(ex);
            return null;

        }

    }



}
