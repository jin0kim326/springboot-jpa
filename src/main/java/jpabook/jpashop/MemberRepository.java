package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class MemberRepository {

    // 스프링부트가 "엔티티매니저"를 주입해주는 어노테이션 => jpa를 사용하기 위함!!
    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // Member를 반환하는게 아닌 id를 반환하는 이유
        // -> 커맨드와 쿼리를 분리 => 저장하고 나면 사이드이펙트를 일으키는 커맨드성이기 때문에 리턴값을 안만듦
        // 아이디값 정도만 반환하면 다시 조회가 가능함
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
