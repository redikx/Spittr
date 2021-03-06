package spittr.test;

import spittr.web.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class testHomeController {

    @Test
    public void testHomePage() throws Exception {
	HomeController controller = new HomeController();
	MockMvc mockMvc = standaloneSetup(controller).build();
	mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
    
}
