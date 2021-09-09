package dev.fourthcafe.exception210910_0510.web.controller;

import dev.fourthcafe.exception210910_0510.web.dto.MemberSaveDto;
import dev.fourthcafe.exception210910_0510.web.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;


	@GetMapping
	public ResponseEntity<?> list() {
		return ResponseEntity.ok(memberService.findByAll());
	}


	@PostMapping
	public ResponseEntity<?> save(@RequestBody MemberSaveDto.Request requestDto) {
		final Long save = memberService.save(requestDto);
		return new ResponseEntity<>(save, HttpStatus.NO_CONTENT);
	}
}