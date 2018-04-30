package spittr.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class SpittleController {

    private SpittleRepository spittleRepository;
    
    @Autowired
    	public SpittleController(
    		SpittleRepository spittleRepository) {
	this.spittleRepository = spittleRepository;
    }
    
    // Najprostsza metoda, bez parametrow
    @RequestMapping(value="/spittles",method=RequestMethod.GET) 
	public String spittles(Model model) {
	// pierwszy parameter - spittleList to nazwa zmiennej wykorzystywanej w wywolywanym pliku jsp
    model.addAttribute("spittleList",spittleRepository.findSpittles(Long.MAX_VALUE, 20));
    return "spittles";
    }
    
    @RequestMapping(value="/spittles/{spittleId}", method=RequestMethod.GET) 
    public String oneSpittle(@PathVariable long spittleId, Model model) {
	model.addAttribute("spittle",spittleRepository.findOne(spittleId));
	return "spittleOne";
    }
    
    
	    
    }

