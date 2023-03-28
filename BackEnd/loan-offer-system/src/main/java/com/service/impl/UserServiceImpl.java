package com.service.impl;

import com.dao.IUserDAO;
import com.dto.response.GeneralResponse;
import com.dto.user.request.CreateNewUserReq;
import com.service.IUserService;
import com.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserServiceImpl implements IUserService {
    Logger logger = Logger.getLogger(this.getClass().getName());
    @Autowired
    IUserDAO userDAO;

    @Override
    public GeneralResponse createNewUser(CreateNewUserReq createNewUserReq) {
        String randomPassword = CommonUtil.generateRandomPasscode();
        logger.info("randomPassword-------------->" + randomPassword);
        createNewUserReq.setSecretKey(randomPassword);
        GeneralResponse response = userDAO.createNewUser(createNewUserReq);
        return response;
    }
}
