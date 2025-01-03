package cn.bdqn.controller;

import cn.bdqn.entity.Smove;
import cn.bdqn.entity.cseat;
import cn.bdqn.entity.screening;
import cn.bdqn.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class userController {
    @Autowired
    @Qualifier("userService")
    private userService userService;

    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("list")
    public String list(){
        return "list";
    }
    @RequestMapping("zhu")
    public String zhu(){
        return "zhu";
    }
    @RequestMapping("zhuan")
    public String zhuan(){
        return "zhuan";
    }
    @RequestMapping("Smove")
    public String Smove(Model model){
        List<Smove> smoveList = userService.SmoveList();
        model.addAttribute("smoveList",smoveList);
        return "Smove";
    }
    @RequestMapping("Ymove")
    public String Ymove(){
        return "redirect:/user/YList";
    }
    @GetMapping("screeningById")
    @ResponseBody
    public String chang(Integer id,HttpSession session){
        Smove screenings = userService.changId(id);
        if (screenings!=null) {
            session.setAttribute("screenings",screenings);
            return "true";
        }else{
            return "false";
        }
    }
    @RequestMapping("screening")
    public String screening(){
        return "screening";
    }
    @GetMapping("dingPById")
    @ResponseBody
    public String dingPById(Integer cid,HttpSession session){
        List<cseat> cseat = userService.dingPById(cid);
        session.setAttribute("cseat",cseat);
        return "true";
    }
    @RequestMapping("Zuo")
    public String Zuo(){
        return "Zuo";
    }
}
