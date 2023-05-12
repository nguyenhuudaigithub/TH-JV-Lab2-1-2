package nguyenhuudai.demo.Controller;

import nguyenhuudai.demo.Model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Index() {
        return "Home/Index";
    }
    @GetMapping("/Contact")
    public String showContactForm(Model model) {
        model.addAttribute("Contact", new Contact());
        return "Home/Contact";
    }
    @PostMapping("/Contact")
    public String submitContactForm(@ModelAttribute("Contact") Contact contact, Model model) {
        model.addAttribute("Contact", contact);
        return "Home/Result";
    }

}
