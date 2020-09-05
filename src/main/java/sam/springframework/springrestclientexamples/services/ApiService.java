package sam.springframework.springrestclientexamples.services;

import java.util.List;

import sam.springframework.api.domain.User;

public interface ApiService {

	List<User> getUsers(Integer limit);

}
