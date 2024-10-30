package vn.iotstar.Controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeControllder {
	@GetMapping("/home")
	public String index() {
		return "admin/home";
	}

}
