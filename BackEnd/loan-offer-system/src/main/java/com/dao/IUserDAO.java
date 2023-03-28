package com.dao;

import com.dto.response.GeneralResponse;
import com.dto.user.request.CreateNewUserReq;

public interface IUserDAO {
    GeneralResponse createNewUser(CreateNewUserReq createNewUserReq);
}
