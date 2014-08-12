package constellations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConstellationController {
    private static final String LOG_TAG = "Constellation_Controller";

    @RequestMapping("/home")
    public
    @ResponseBody
    String home() {
        return "hello world";
    }
}
