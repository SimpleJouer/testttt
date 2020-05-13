package cn.hhit.springbootfreemaker.controller;

import cn.hhit.springbootfreemaker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther:搬砖小能手
 * @Date:2020/4/25
 * @Description:cn.hhit.springbootfreemaker.controller
 * @version:1.0
 */
@Controller
public class Mycontroller {

    @RequestMapping("/show")
    public String show(Model model){
        System.out.println("<<<<<<<<<<<");
    List<User> list =new ArrayList<>();
    list.add(new User("zhangsan","123456"));
    list.add(new User("lisi","123456"));
    model.addAttribute("list",list);
    return "index";


    }

}
