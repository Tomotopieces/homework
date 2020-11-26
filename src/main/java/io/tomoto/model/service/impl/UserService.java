package io.tomoto.model.service.impl;

import io.tomoto.model.dao.impl.UserDao;
import io.tomoto.model.entity.User;
import io.tomoto.model.service.Service;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Tomoto
 * <p>
 * 2020/11/24 16:23
 */
public class UserService implements Service {
    private static final Logger logger = LogManager.getLogger(UserService.class);
    private final UserDao dao = new UserDao();

    public User getUserById(Integer id) {
        return dao.read(id);
    }

    public User getUserByAccount(String account) {
        return dao.readByAccount(account);
    }

    public Boolean resetUserPassword(Integer id, String newPassword) {
        return  dao.update(id, "password", newPassword) == 1;
    }
    
    public Boolean resetUserIntroduction(Integer id, String newIntroduction) {
        return  dao.update(id, "introduction", newIntroduction) == 1;
    }
}
