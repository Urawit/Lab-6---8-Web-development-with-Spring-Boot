// Urawit Jearrajinda 6410406932
package ku.cs.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // GET POST DELETE มาที่ method นี้หมดเลย
    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee kub welcome to 6410406932 cafe");
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        return "home";
    }

}
