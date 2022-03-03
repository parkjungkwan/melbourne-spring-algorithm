package net.zerotoweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.member.domain.CalcDTO;
import net.zerotoweb.api.member.domain.MemberDTO;
import net.zerotoweb.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

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

    @PostMapping("/calc") public String calc(@RequestBody CalcDTO calc){

        int a = (int)Math.random();
        Random r = new Random();
        return service.calc(calc);
    }
    @PostMapping("/bmi") public String bmi(@RequestBody MemberDTO bmi){
        return service.bmi(bmi);
    }
    @PostMapping("/grade") public String grade(@RequestBody MemberDTO grade){
        return service.grade(grade);
    }

}
