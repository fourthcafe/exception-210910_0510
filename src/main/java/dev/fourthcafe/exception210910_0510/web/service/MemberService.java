package dev.fourthcafe.exception210910_0510.web.service;

import dev.fourthcafe.exception210910_0510.model.Member;
import dev.fourthcafe.exception210910_0510.web.dto.MemberSaveDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

	private static final List<Member> members = new ArrayList<>();
	private static Long lastMemberId;

	static {
		members.add(new Member(1L, "ko", 27));
		members.add(new Member(2L, "yh", 53));
		members.add(new Member(3L, "tn", 37));

		lastMemberId = (long) members.size();
	}


	public List<Member> findByAll() {
		return members;
	}


	public Long save(MemberSaveDto.Request requestDto) {
		final Member memberToSave = requestDto.toEntity(++lastMemberId);
		members.add(memberToSave);
		return memberToSave.getId();
	}
}