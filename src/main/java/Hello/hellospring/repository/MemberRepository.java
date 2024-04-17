package Hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import Hello.hellospring.domain.Member;

public interface MemberRepository {
	Member save(Member member);
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	List<Member> findAll();
}
