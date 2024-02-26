package com.ramakanth.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ramakanth.entity.Incentive;


@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(Exception.class)
	public String exception(Model model, Exception e) {
					
			model.addAttribute("errormsg", "please enter valid details");
			Incentive incentive1=new Incentive();
			model.addAttribute("incentive", incentive1);
			
			
			return "incentive";
		}
	}

