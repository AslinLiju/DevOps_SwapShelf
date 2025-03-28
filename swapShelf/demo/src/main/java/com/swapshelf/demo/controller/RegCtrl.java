package com.swapshelf.demo.controller;
@Controller
public class RegCtrl {
@Autowired
private RegService regser;
@GetMapping("/index")
public String showRegisterPage()
{
    return "index";
}

}
