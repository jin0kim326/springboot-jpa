package jpabook.jpashop;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {
    // @GeneratedValue DB가 자동생성해줌
    @Id @GeneratedValue
    private Long id;
    private String username;
}
