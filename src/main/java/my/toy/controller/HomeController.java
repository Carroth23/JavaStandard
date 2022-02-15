package my.toy.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		System.out.println("이게 찍혀야 홈으로 온겁니다.");
		System.out.println("이게 찍혀야 홈으로 온겁니다.");
		return "Home";
	}
	
}
