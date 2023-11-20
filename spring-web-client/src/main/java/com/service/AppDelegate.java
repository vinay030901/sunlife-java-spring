package com.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {

	RestTemplate template = new RestTemplate();

	public String loademp() {
		return template.exchange("http://localhost:8090/users/loadusers", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
	}
	public String delegateLoadLogisitics() {
		return template.exchange("http://localhost:8060/logisitics/userList", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
	}
}
