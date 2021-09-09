package dev.fourthcafe.exception210910_0510.web.dto;

import dev.fourthcafe.exception210910_0510.model.Member;
import lombok.Getter;

public class MemberSaveDto {

	@Getter
	public static class Request {
		private String name;
		private int age;


		public Member toEntity(Long id) {
			return new Member(id, this.getName(), this.getAge());
		}
	}


	@Getter
	public static class Response {
		private final Long id;
		private final String name;
		private final int age;


		public Response(Member member) {
			this.id = member.getId();
			this.name = member.getName();
			this.age = member.getAge();
		}
	}
}