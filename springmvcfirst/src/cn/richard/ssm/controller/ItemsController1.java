package cn.richard.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.richard.ssm.pojo.Items;

public class ItemsController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List<Items> itemList=new ArrayList();
		
		Items item1=new Items();
		item1.setId(100);
		item1.setName("Lenovo notebook");
		item1.setPrice(6899f);
		item1.setDetail("Thinkpad E450联想笔记本电脑");
		itemList.add(item1);
		
		Items item2=new Items();
		item2.setId(101);
		item2.setName("Apple mobile");
		item2.setPrice(5808f);
		item2.setDetail("Apple mobile 6s Plus");
		itemList.add(item2);
		
		ModelAndView view=new ModelAndView();
		view.addObject("itemList", itemList);
		view.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return view;
	}

}
