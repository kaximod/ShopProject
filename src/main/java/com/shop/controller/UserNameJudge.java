package com.shop.controller;

import com.google.gson.Gson;
import com.shop.bean.User;
import com.shop.service.Impl.UserServiceImpl;
import com.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserNameJudge extends HttpServlet {
    UserService userService=new UserServiceImpl();
    User user=new User();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        user=userService.queryByName(username);
        if(user!=null){
            Map<String,Object> resultMap = new HashMap<>();
            resultMap.put("existsUsername",true);
            Gson gson = new Gson();
            String json = gson.toJson(resultMap);
            resp.getWriter().write(json);
        }else{
            Map<String,Object> resultMap = new HashMap<>();
            resultMap.put("existsUsername",false);
            Gson gson = new Gson();
            String json = gson.toJson(resultMap);
            resp.getWriter().write(json);
        }
    }
}
