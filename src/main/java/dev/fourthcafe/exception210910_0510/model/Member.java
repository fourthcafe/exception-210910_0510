package dev.fourthcafe.exception210910_0510.model;

import lombok.Getter;

@Getter
public class Member {
	private final Long id;
	private final String name;
	private final int age;


	public Member(final Long id, final String name, final int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}