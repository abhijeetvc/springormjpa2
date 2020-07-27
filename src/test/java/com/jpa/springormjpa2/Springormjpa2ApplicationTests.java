package com.jpa.springormjpa2;

import com.jpa.springormjpa2.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.http.HttpStatus.OK;

//RestTemplate

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Springormjpa2ApplicationTests {

	@Autowired
	TestRestTemplate testRestTemplate;

	@Test
	void testGetAllEmployees(){
		ResponseEntity<Employee[]> responseEntity=testRestTemplate
				.getForEntity("/getallemp/1",Employee[].class);

		assertEquals(1,responseEntity.getBody().length);
	}


}
