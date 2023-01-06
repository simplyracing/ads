package ch.vardanega.simplyracing.ads;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AdsController {
    
    @GetMapping("hello")
    public String getHello() {
        return "Ads module";
    }

}
