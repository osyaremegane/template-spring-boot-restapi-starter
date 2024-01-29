package jp.co.exacorp.customrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomRestapiController {

    @GetMapping("/test")
    public Map<String, String> getDemo() {
        return Map.of("msg", "こんにちは。");
    }
}

