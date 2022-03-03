package net.zerotoweb.api.member.repository;

import net.zerotoweb.api.member.domain.CalcDTO;
import net.zerotoweb.api.member.domain.MemberDTO;

/**
 * packageName: net.zerotoweb.api.member.repository
 * fileName   : MemberRepository
 * author     : parkjungkwan
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   parkjungkwan  최초 생성
 */
public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);
}
