package macrocalculator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MacroCalculatorController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Matt and Missy!";
    }

}