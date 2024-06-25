package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
  @GetMapping("/")
  public String welcome(Model model) {
    model.addAttribute("message", "Spring Bootの世界へようこそ！");
    return "welcome";
  }

  // 参考用のページ
  @GetMapping("/stock")
  public String stock() {
    return "stock";
  }
}
