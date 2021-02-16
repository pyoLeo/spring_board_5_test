package edu.bit.ex.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class TransactionController {
	
	private TransactionService service;
	
	@GetMapping("/tran/{num}")
    public void transiotn(@PathVariable("num") int num) throws SQLException {
          
		if(num == 1){
			log.info("transionTest1");
			service.transionTest1();
		}else if(num == 2){
			log.info("transionTest2");
			service.transionTest2();
		}else if(num == 3){
			log.info("transionTest3");
			service.transionTest3();
		}else if(num == 4){
			log.info("transionTest4");
			service.transionTest4();
		}else if(num == 5){
			log.info("transionTest5");
			service.transionTest5();
		}else if(num == 6){
			log.info("transionTest6");
			service.transionTest6();
		}else if(num == 7){
			log.info("transionTest7");
			service.transionTest7();
		}			
    }
	
}
