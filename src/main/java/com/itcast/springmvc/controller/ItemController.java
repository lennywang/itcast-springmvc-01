package com.itcast.springmvc.controller;

import com.itcast.springmvc.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 **/
@Controller
public class ItemController {

    @RequestMapping(value = "/item/itemList.action")
    public ModelAndView itemList()
    {
        System.out.println("==============>>");
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");

        modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
        System.out.println("==============>>");

        return modelAndView;
//        ArrayList<Item> list = new ArrayList<>();
//        list.add(new Item(1,"1 华为荣耀8",2399f,new Date(),"质量好！1"));
//        list.add(new Item(2,"2 华为荣耀8",2399f,new Date(),"质量好！2"));
//        list.add(new Item(3,"3 华为荣耀8",2399f,new Date(),"质量好！3"));
//        list.add(new Item(4,"4 华为荣耀8",2399f,new Date(),"质量好！4"));
//        list.add(new Item(5,"5 华为荣耀8",2399f,new Date(),"质量好！5"));
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("itemList",list);
//        modelAndView.setViewName("itemList");
//
//        return modelAndView;
    }

}
