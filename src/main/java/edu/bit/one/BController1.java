package edu.bit.one;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.bit.ex.HomeController;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.page.PageVO;
import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
/*
1.interface IBDao를  XML namespace에 매핑 <mapper namespace="edu.bit.ex.one.IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */
@Controller
public class BController1 {

   @Inject
   Bservice1 bservice;
   
   @RequestMapping("/list1")
   public String list(Model model) throws Exception{
      System.out.println("list1()");   
      
      model.addAttribute("list", bservice.selectBoardList());         
      return "list";      
   }
   
   /*
    * @RequestMapping("/write_view") public String write_view(Model model) {
    * System.out.println("write_view()");
    * 
    * return "write_view"; }
    * 
    * @RequestMapping("/content_view") public String
    * content_view(HttpServletRequest request, Model model){
    * System.out.println("content_view()");
    * 
    * String bid = request.getParameter("bId");
    * 
    * IBDao dao = sqlSession.getMapper(IBDao.class);
    * model.addAttribute("content_view", dao.ContentDao(bid));
    * 
    * 
    * return "content_view"; }
    * 
    * @RequestMapping("/delete") public String delete(HttpServletRequest request,
    * Model model){ System.out.println("delete()");
    * 
    * String bId = request.getParameter("bId");
    * 
    * IBDao dao = sqlSession.getMapper(IBDao.class);
    * 
    * int num = Integer.parseInt(bId);
    * 
    * dao.deleteDao(num);
    * 
    * 
    * return "redirect:list"; }
    * 
    * @RequestMapping(value="/modify", method=RequestMethod.POST ) public String
    * modify(BDto bDto, Model model){ System.out.println("modify()");
    * 
    * 
    * IBDao dao = sqlSession.getMapper(IBDao.class); dao.updateDao(bDto);
    * 
    * return "redirect:list"; }
    */
}
