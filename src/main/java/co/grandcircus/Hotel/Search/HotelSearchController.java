package co.grandcircus.Hotel.Search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Hotel.Search.dao.HotelDao;


@Controller
public class HotelSearchController {

	private HotelDao dao;
	
	@RequestMapping("/") 
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/results")
	public ModelAndView results(
			@RequestParam("city") String result) {
		ModelAndView mv = new ModelAndView("results");
		mv.addObject("city", result);
		mv.addObject("list", dao.findByCity(result));
		return mv;
		
	}
	
}