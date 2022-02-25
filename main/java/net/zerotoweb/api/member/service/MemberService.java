package net.zerotoweb.api.member.service;

import net.zerotoweb.api.member.domain.CalcDTO;
import net.zerotoweb.api.member.domain.MemberDTO;

/**
 * packageName: net.zerotoweb.api.member.service
 * fileName   : MemberService
 * author     : parkjungkwan
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   parkjungkwan  최초 생성
 */
public interface MemberService {


    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);
}
