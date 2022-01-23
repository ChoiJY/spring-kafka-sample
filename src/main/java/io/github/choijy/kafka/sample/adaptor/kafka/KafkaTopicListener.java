package io.github.choijy.kafka.sample.adaptor.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import io.github.choijy.kafka.sample.dto.TestTopic;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class KafkaTopicListener {

	@KafkaListener(id = "${app.kafka.topic.test.consumer-group}", topics = "${app.kafka.topic.test.name}")
	public void testTopicListener(TestTopic testTopic) {
		log.info("received topic = {}", testTopic.toString());
	}
}
