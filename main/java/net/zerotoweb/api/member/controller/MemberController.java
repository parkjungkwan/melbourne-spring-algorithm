package net.zerotoweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.member.domain.MemberDTO;
import net.zerotoweb.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName: net.zerotoweb.api.member.controller
 * fileName   : MemberController
 * author     : parkjungkwan
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   parkjungkwan  최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;


    @PostMapping("/bmi")
    public String getBmi(@RequestBody MemberDTO member){
        System.out.println(" 리액트에서 넘어온 이름: "+member.getName());
        System.out.println(" 리액트에서 넘어온 키: "+member.getHeight());
        System.out.println(" 리액트에서 넘어온 몸무게: "+member.getWeight());
        return "BMI 는 정상";
    }
    @GetMapping("/grade")
    public String getGrade(@PathVariable String name,
                         @PathVariable double height,
                         @PathVariable double weight){
        System.out.println(" 리액트에서 넘어온 이름: "+name);
        System.out.println(" 리액트에서 넘어온 키: "+height);
        System.out.println(" 리액트에서 넘어온 몸무게: "+weight);
        return "BMI 는 정상";
    }
    @GetMapping("/calc")
    public String calc(@PathVariable String name,
                           @PathVariable double height,
                           @PathVariable double weight){
        System.out.println(" 리액트에서 넘어온 이름: "+name);
        System.out.println(" 리액트에서 넘어온 키: "+height);
        System.out.println(" 리액트에서 넘어온 몸무게: "+weight);
        return "BMI 는 정상";
    }
    @GetMapping("/login")
    public String login(@PathVariable String name,
                          @PathVariable double height,
                          @PathVariable double weight){
        System.out.println(" 리액트에서 넘어온 이름: "+name);
        System.out.println(" 리액트에서 넘어온 키: "+height);
        System.out.println(" 리액트에서 넘어온 몸무게: "+weight);
        return "BMI 는 정상";
    }
}
