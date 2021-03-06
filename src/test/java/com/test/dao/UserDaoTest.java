package com.test.dao;

import com.test.domain.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getById_returnValid() {
        UserEntity userEntity = userDao.getUserById(0);
        assertNotNull(userEntity);
    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void getById_InvalidId() {
        UserEntity userEntity = userDao.getUserById(99);
    }
}
