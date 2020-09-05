package sam.springframework.springrestclientexamples.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sam.springframework.api.domain.User;
import sam.springframework.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		UserData userData = restTemplate.getForObject("http://private-anon-e22e8ad064-apifaketory.apiary-mock.com/api/user?limit="+limit, UserData.class);
		return userData.getData();
	}

}
