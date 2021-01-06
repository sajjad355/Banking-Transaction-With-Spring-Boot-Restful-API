package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
 
}