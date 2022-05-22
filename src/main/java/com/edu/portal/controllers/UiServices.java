package com.edu.portal.controllers;

import com.edu.portal.models.StudentLoginData;
import com.edu.portal.repositories.StudentLoginDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/details")
public class UiServices {

    @Autowired
    StudentLoginDataRepo studentLoginDataRepo;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(WebRequest webRequest, Model model, HttpServletRequest request, HttpServletResponse response) {
        StudentLoginData studentLoginData = studentLoginDataRepo.findByusername(webRequest.getParameter("mail"));
        if (studentLoginData != null) {
            if (studentLoginData.getPassword().equals(webRequest.getParameter("password"))) {
                return "Dashboard";
            }
        }

        return "login";

    }


}
