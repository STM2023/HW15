package com.goit.HW15.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
@Slf4j
@RestController
public class TestControler {
  @GetMapping(value = "/test")

    public ModelAndView hello() {
       ModelAndView result = new ModelAndView("test/test");

        log.info("test");
        return result;
   }

}

