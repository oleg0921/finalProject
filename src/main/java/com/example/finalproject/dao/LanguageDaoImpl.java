package com.example.finalproject.dao;

import com.example.finalproject.db.DBManager;
import com.example.finalproject.entity.Language;
import com.example.finalproject.entity.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LanguageDaoImpl {


    private final static String FIND_LANGUAGE_BY_NAME = "SELECT * FROM variant3schema.language WHERE code = ?";


    public Language findLangugeByCode(String name) {
        Language role = new Language();


        try(Connection connection = DBManager.GetInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_LANGUAGE_BY_NAME))
        {
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                role.setId(resultSet.getInt(1));
                role.setCode(resultSet.getString(2));
            }
        }
        catch (SQLException exception){
            System.out.println(exception.getMessage());
        }

        return  role;
    }
}
