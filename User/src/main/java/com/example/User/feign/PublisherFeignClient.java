package com.example.User.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.User.entity.Publisher;

@FeignClient(name = "publisher-service")
public interface PublisherFeignClient {
	@PostMapping("/publishers")
	void addPublisher(@RequestBody Publisher publisher);
}
