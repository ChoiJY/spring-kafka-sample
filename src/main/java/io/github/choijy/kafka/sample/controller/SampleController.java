package io.github.choijy.kafka.sample.controller;

import java.security.SecureRandom;
import java.time.ZonedDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.choijy.kafka.sample.dto.TestTopic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class SampleController {

	private final KafkaTemplate<Object, Object> kafkaProducerTemplate;

	@GetMapping("/sample/topic")
	public ResponseEntity<Void> sendTestTopic() {
		TestTopic testTopic = new TestTopic(new SecureRandom().nextLong(), "test", ZonedDateTime.now());
		kafkaProducerTemplate.send("test-topic", testTopic);
		return ResponseEntity.ok().build();
	}
}
