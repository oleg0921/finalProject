package com.example.finalproject.servise;

import com.example.finalproject.dao.UserDaoImpl;
import com.example.finalproject.dto.UserDto;
import com.example.finalproject.entity.User;

public class UserServise {

    UserDaoImpl userDao;

    public UserServise() {
        userDao = new UserDaoImpl();
    }

    public  void save(UserDto userDto)
    {
        User user = new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setRoleId(userDto.getRoleId());

        userDao.save(user);
    }

    public UserDto getByemail(String email) throws Exception {


        User user = userDao.findByEmail(email);
        if(user == null)
        {
            throw new Exception("not right email");
        }
        UserDto userDto = new UserDto();

        userDto.setLastName(user.getLastName());
        userDto.setFirstName(user.getFirstName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setRoleId(user.getRoleId());
        userDto.setId(user.getId());
        return userDto;
    }



}
