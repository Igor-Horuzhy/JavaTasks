package com.xyz;


import model.Library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class servlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(servlet.class);
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
    JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);

    private static Library queryForComplexObject(JdbcTemplate jdbc,int i) {
        Library lib = jdbc.queryForObject("select * from library.minilib where id = ?", new Object[]{i}, new RowMapper<Library>() {
            public Library mapRow(ResultSet resultSet,int i) throws SQLException {
                return new Library(resultSet.getInt("id"), resultSet.getString("Book"), resultSet.getString("Author"));
            }
        });
        return lib;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "Igor");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String par = req.getParameter("id");

        if (par != null) {
                System.out.println(queryForComplexObject(jdbc,Integer.parseInt(par)));
                req.setAttribute("result",queryForComplexObject(jdbc,Integer.parseInt(par)));
        }
        req.getRequestDispatcher("MyPage.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}