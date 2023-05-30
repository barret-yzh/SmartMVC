package com.yzh.smartmvc.controller;

import com.yzh.smartmvc.annotation.ControllerAdvice;
import com.yzh.smartmvc.annotation.ExceptionHandler;
import com.yzh.smartmvc.annotation.RequestParam;
import com.yzh.smartmvc.annotation.ResponseBody;
import com.yzh.smartmvc.handler.exception.TestException;
import com.yzh.smartmvc.handler.mapping.RequestMapping;
import com.yzh.smartmvc.vo.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;

@ControllerAdvice
@Controller
@RequestMapping(path = "/test")
public class DispatcherController {

    @RequestMapping(path = "/dispatch", method = RequestMethod.GET)
    public String dispatch(@RequestParam(name = "name") String name, Model model) {
        System.out.println("DispatcherController.dispatch: name=>" + name);
        model.addAttribute("name", name);
        return "redirect:/silently9527.cn";
    }

    @RequestMapping(path = "/dispatch2", method = RequestMethod.GET)
    public String dispatch2(@RequestParam(name = "name") String name) {
        System.out.println("DispatcherController.dispatch2: name=>" + name);
        throw new TestException("test exception", name);
    }

    @ResponseBody
    @ExceptionHandler({TestException.class})
    public ApiResponse exceptionHandler(TestException ex) {
        System.out.println("exception message:" + ex.getMessage());
        return new ApiResponse(200, "exception handle complete", ex.getName());
    }


}
