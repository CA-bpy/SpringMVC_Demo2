package com.ca_bpy.controller;

import com.ca_bpy.ob.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Create controller object.
 * Processing user submitted requests.
 */
@Controller
//@RequestMapping("/test")
public class MyController {
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(HttpServletRequest request,
                               HttpServletResponse response,
                               HttpSession session) {
        System.out.println("处理用户some.do请求");
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","==练习SpringMVC做web开发==" + "[ " +
                "请求用户：" + request.getParameter("name") + " ]");
        mv.addObject("med","执行doSome方法");
        mv.setViewName("some");
        return mv;
    }


    //逐个接收用户请求的参数
    //使用@RequestParam解决参数名与形参名不一样的问题
    @RequestMapping(value = "/receiveproperty.do",method = RequestMethod.POST)
    public ModelAndView doReceiveProperty(@RequestParam(value = "name",required = false) String myname,
                                          @RequestParam(value = "age",required = false) Integer myage) {
        System.out.println("处理receiveproperty.do请求");
        System.out.println("[ MyName=" + myname + "   MyAge=" + myage + " ]");
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",myname);
        mv.addObject("myage",myage);
        mv.setViewName("receiveproperty");
        return mv;
    }
    //使用对象接收用户请求的参数
    @RequestMapping(value = "/receiveobject.do",method = RequestMethod.POST)
    public ModelAndView doReceiveObject(Student myStudent) {
        System.out.println("处理receiveobject.do请求");
        System.out.println("[ MyNum=" + myStudent.getNum() +
                "  MyName=" + myStudent.getName() +
                "  MyAge=" + myStudent.getAge() + " ]");
        ModelAndView mv = new ModelAndView();
        mv.addObject("mynum",myStudent.getNum());
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.setViewName("receiveobject");
        return mv;
    }

}
