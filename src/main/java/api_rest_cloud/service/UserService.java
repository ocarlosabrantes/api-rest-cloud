package api_rest_cloud.service;

import api_rest_cloud.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}