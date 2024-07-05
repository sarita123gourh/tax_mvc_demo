package com.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.db.model.TaxModel;
import com.db.servlet.TaxService;

@Controller
public class DemoController 
{
    @RequestMapping("/tax")
	public String showInputPage()
	{
		return "input.jsp";
	}
    
    @RequestMapping("/compute")
    public ModelAndView computeTax(@RequestParam("t1") int income,@RequestParam("t2") int age)
    {
    	TaxModel taxModel=new TaxModel();
    	taxModel.setIncome(income);
    	taxModel.setAge(age);
    	
    	//proccess
    	
    	TaxService taxService=new TaxService();
    	taxModel=taxService.computeTax(taxModel);
    	
    	
    	//provide response
    	
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("taxModel",taxModel);
    	mv.setViewName("result.jsp");
    	
    	return mv;
    	
    }
}
