package com.example.projectJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mirror")
public class MirrorController {

    @GetMapping
    public String mirror(@RequestParam("key") String name) {
        return name;
    }
}