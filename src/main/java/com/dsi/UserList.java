package com.dsi;

import jakarta.persistence.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserList {
    private int id;
    private UserInfo user;
    protected List<Lists> lists = new ArrayList<>();

    @RequestMapping("/view")
    public ModelAndView showList(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("okay");
        EntityManager entityManager = SessionManager.createSession();


        lists = entityManager.createQuery("from Lists where userName='Mirr'").getResultList();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lists", lists);
        modelAndView.setViewName("display.jsp");
        return modelAndView;
    }

    public void addList(Lists lists) {
        this.lists.add(lists);

    }

}
