package edu.bit.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@AllArgsConstructor
@Log4j
public class BoardController {
	

	private BoardService boardService;
	
	/*
	 * @GetMapping("/rest/list") public String restList() { log.info("rest/list");
	 * //model.addAttribute("list", boardService.getList());
	 * 
	 * return "ajaxList"; }
	 */
	
	/*
	 * @GetMapping("/rest/content_view") public String restView(BoardVO boardVO,
	 * Model model) throws Exception { log.info("rest/view");
	 * model.addAttribute("content_view", boardService.get(boardVO.getbId()));
	 * 
	 * return "content_view2"; }
	 */
	
	@GetMapping("/ajax/delete")
	public String ajax_delete(@RequestParam("bId") int bId) {
		boardService.remove(bId);
		return "redirect:ajaxList";
	}
	
	
	  @GetMapping("/list") 
	  public void list(Model model) { 
		  log.info("list()");
		  model.addAttribute("list", boardService.getList()); //list��ü �����Ǿ�
	  }
	 
	
	@GetMapping("/list2")	//페이징
	public void list2(Criteria cri, Model model) {
		log.info("list2()");
		log.info(cri);
		System.out.println(cri);
		
		model.addAttribute("list", boardService.getList(cri));	//list��ü �����Ǿ� getList()���� ���
		int total = boardService.getTotal(cri);
		log.info("total" + total);
		
		model.addAttribute("pageMaker", new PageVO(cri, total));
	}
	
	@RequestMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) throws Exception{
		log.info("content_view()");
		model.addAttribute("content_view", boardService.get(boardVO.getbId()));
		return "content_view";
	}
	
	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view()");
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(BoardVO boardVO, Model model) throws Exception {
		log.info("write(), write complete");
		boardService.writeBoard(boardVO);
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) throws Exception {
		log.info("reply_view()");
		model.addAttribute("reply_view", boardService.get(boardVO.getbId()));
		
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(BoardVO boardVO, Model model) throws Exception {
		log.info("reply()");
		boardService.writeReply(boardVO);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bId") int bId) {
		boardService.remove(bId);
		return "redirect:list";
	}
	
}
