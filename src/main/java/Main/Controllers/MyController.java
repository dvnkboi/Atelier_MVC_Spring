package Main.Controllers;

import Main.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = {"/", "/articles", "/getAll"})
    public String getAll(Model m){
        m.addAttribute("articles", articleService.listArticles());
        return "listAll";
    }
}
