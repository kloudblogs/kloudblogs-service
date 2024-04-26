package com.kloudblogs.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class AwsParamstoreConfigs {

	@Value("${test1}")
	private String test;
	
	
}
