package com.example.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public Map<String, Integer> getBotInfo(){
        Map<String, Integer> botInfo = new HashMap<>();
        botInfo.put("name", 5);
        botInfo.put("rating", 10000);
        return botInfo;
    }
}
