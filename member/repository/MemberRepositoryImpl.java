package net.zerotoweb.api.member.repository;

import net.zerotoweb.api.member.domain.CalcDTO;
import net.zerotoweb.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName: net.zerotoweb.api.member.repository
 * fileName   : MemberRepositoryImpl
 * author     : parkjungkwan
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11   parkjungkwan  최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }
}
