package Hello.hellospring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Hello.hellospring.repository.JdbcMemberRepository;
import Hello.hellospring.repository.MemberRepository;
import Hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
	
	private DataSource dataSource;
	
	@Autowired
	public SpringConfig(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Bean
	public MemberService memberService() {
		return new MemberService(memberRepository() );
	}
	
	@Bean
	public MemberRepository memberRepository() {
		//return new MemoryMemberRepository();
		return new JdbcMemberRepository(dataSource);
	}
}
