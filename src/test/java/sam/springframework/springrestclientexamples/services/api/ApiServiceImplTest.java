package sam.springframework.springrestclientexamples.services.api;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sam.springframework.api.domain.User;
import sam.springframework.springrestclientexamples.services.ApiService;

@SpringBootTest
class ApiServiceImplTest {

	@Autowired
	ApiService apiService;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetUsers() {
		List<User> users = apiService.getUsers(3);
		assertEquals(1, users.size());
	}

}
