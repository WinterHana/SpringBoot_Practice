package com.springboot.HelloSpring.controller;

import com.springboot.HelloSpring.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World! Get ver.";
    }
    // http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        return "Winter_1Hana";
    }

    // http://localhost:8080/api/v1/get-api/variable1/{variable}
    @GetMapping(value = "/variable1/{variable}")
    public String getVaribale1(@PathVariable String variable) {
        return "Variable1 : " + variable;
    }

    // http://localhost:8080/api/v1/get-api/variable2/{variable}
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return "Variable2 : " + var;
    }

    // http://localhost:8080/api/v1/get-api/request1?name=Winter_1Hana&email=haha920@naver.com&organization=Sejong University
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    // http://localhost:8080/api/v1/get-api/request2?name=Winter_1Hana&email=haha920@naver.com&organization=Sejong University
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    // http://localhost:8080/api/v1/get-api/request3?name=Winter_1Hana&email=haha920@naver.com&organization=Sejong University
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto) {
        return memberDto.toString();
    }
}
