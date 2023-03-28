package com.service;

import com.dto.response.GeneralResponse;
import com.dto.user.request.CreateNewUserReq;

public interface IUserService {
    GeneralResponse createNewUser(CreateNewUserReq createNewUserReq);
}
