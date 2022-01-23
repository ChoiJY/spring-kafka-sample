package io.github.choijy.kafka.sample.dto;

import java.io.Serializable;
import java.time.ZonedDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter
public class TestTopic implements Serializable {

	@Override
	public String toString() {
		return "TestTopic{" +
			"id=" + id +
			", message='" + message + '\'' +
			", zonedDateTime=" + zonedDateTime +
			'}';
	}

	private Long id;
	private String message;
	private ZonedDateTime zonedDateTime;
}
