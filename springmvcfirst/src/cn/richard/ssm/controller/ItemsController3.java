package cn.richard.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.richard.ssm.pojo.Items;

@Controller
public class ItemsController3 {
	
	@RequestMapping("/queryItems5")
	public ModelAndView queryItems() throws Exception{
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
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("itemList", itemsList);
		//通过在InternalResourceViewResolver中配置前缀和后缀来简化视图路径 
//		mv.setViewName("items/itemsList");
		mv.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		
		return mv;
	}
}
