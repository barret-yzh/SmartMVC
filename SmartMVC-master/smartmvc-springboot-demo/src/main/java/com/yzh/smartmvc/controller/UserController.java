package com.yzh.smartmvc.controller;


import com.yzh.smartmvc.annotation.MyUserParam;
import com.yzh.smartmvc.annotation.RequestMapping;
import com.yzh.smartmvc.annotation.RequestParam;
import com.yzh.smartmvc.annotation.ResponseBody;
import com.yzh.smartmvc.http.RequestMethod;
import com.yzh.smartmvc.vo.UserVo;
import org.springframework.stereotype.Controller;
import java.util.Date;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    //http://localhost:7979/user/redirect
    @RequestMapping(path = "/redirect", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:http://silently9527.cn";
    }

    //http://localhost:7979/user/get?userId=123
    @ResponseBody
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public UserVo get(@RequestParam(name = "userId") Long userId) {
        UserVo userVo = new UserVo();
        userVo.setName(userId + "_silently9527");
        userVo.setAge(25);
        userVo.setBirthday(new Date());
        return userVo;
    }

    //http://localhost:7979/user/build?user=silently9527,123
    @ResponseBody
    @RequestMapping(path = "/build", method = RequestMethod.GET)
    public UserVo build(@MyUserParam(name = "user") UserVo vo) {
        return vo;
    }

}
