package com.example.finalproject.servise;

import com.example.finalproject.dao.RoleDaoImpl;
import com.example.finalproject.entity.Role;

public class RoleServise {

    RoleDaoImpl roleDao ;


    public  RoleServise()
    {
        roleDao = new RoleDaoImpl();
    }


     public Role getRoleByName(String name )
     {
         Role role = roleDao.findRoleByName(name);
         return role;
     }

    public Role getRoleByID(long id )
    {
        Role role = roleDao.findRoleById(id);
        return role;
    }


}
