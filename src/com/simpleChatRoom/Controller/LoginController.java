package com.simpleChatRoom.Controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.simpleChatRoom.Module.UserBean;
import com.simpleChatRoom.Service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/login/")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "user/checkin", method = RequestMethod.GET)
	public @ResponseBody UserBean userCheckIn(
			HttpServletRequest request,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "pwd", defaultValue = "") String pwd
			) throws  Exception{
		return userService.checkin(userName,pwd);
	}
	
	@RequestMapping(value = "user/getUser", method = RequestMethod.GET)
	public @ResponseBody UserBean getUser(
			HttpServletRequest request,
			@RequestParam(value = "userName", defaultValue = "") String userName
			) throws  Exception{
		return userService.getUser(userName);
	}
	
	@RequestMapping(value = "user/register", method = RequestMethod.POST)
	public @ResponseBody String getTeamResources(
			HttpServletRequest request,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "pwd", defaultValue = "") String	pwd,
			@RequestParam(value = "age", defaultValue = "") String age,
			@RequestParam(value = "city", defaultValue = "") String city,
			@RequestParam(value = "desc", defaultValue = "") String desc
			) throws  Exception{
			
			try{
				userService.saveUser(userName, pwd, age, city, desc);
			}catch( Exception e){

				return e.getMessage();
			}
			return "success";
	}

}
