package cn.richard.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.richard.ssm.pojo.Items;

public class ItemsController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Items>itemsList=new ArrayList();
		
		Items item1=new Items();
		item1.setId(100);
		item1.setName("Lenovo notebook");
		item1.setPrice(6899f);
		item1.setCreatetime(new Date());
		item1.setDetail("Thinkpad E450联想笔记本电脑");
		itemsList.add(item1);
		
		Items item2=new Items();
		item2.setId(101);
		item2.setName("Apple mobile");
		item2.setPrice(5808f);
		item2.setCreatetime(new Date());
		item2.setDetail("Apple mobile 6s Plus");
		itemsList.add(item2);
		
		request.setAttribute("itemList", itemsList);
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);		
	}

	/*@Override
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
	}*/

}
