package com.example.demomysql.repository;


import com.example.demomysql.controller.PersonController;
import com.example.demomysql.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);



    private Connection connection;
/*
    public PersonRepository() throws SQLException {

//  1st
//        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbl_person", "root", "eon9934");
//        This constructor will only once while creating bean of this class (i.e. personRepository)
//        If we have more than one Repository class then we need create constructor again & again for a class so, solve this
//        we will create DBConfig class through which we will get connection object

//  2nd
//            Before executing statement we need to create table and table need to create only once so, will create table
//            inside this constructor.
        createTable();
//  3rd
//        FYI:
//        if we call createTable() inside default constructor then createTable() will execute
//        1st then Connection object will create due this it will give run-type exception since didn't handle it.
//        To solve this need call 1st Connection connection instead of autowired then createTable()
}
*/
    public PersonRepository(Connection connection) throws SQLException
    {
        this.connection=connection;
        createTable();
    }





    public void  createPerson(Person person) {
        //logic to create person into the DB

//         create table person(id primary key,first_name varchar(30), age int, dob varchar(12));

        // 1. DB connection.
        try {
//
            // 2. write query
            PreparedStatement statement = connection.prepareStatement("insert into person(first_name,  last_name, age, dob) " +
                    "VALUES(?,?,?,?)");

            statement.setString(1,person.getFirstName());
            statement.setString(2,person.getLastName());
            statement.setInt(3,person.getAge());
            statement.setString(4, person.getDob());

            // 3. execute the query
            int result= statement.executeUpdate();
//           logger.info("personRepository result {}", result);
            logger.info("Insert statement result {}", result >= 1 ? true : false);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTable()
    {
        Statement statement= null;
        try {
            statement = connection.createStatement();
            statement.execute("create table if not exists person(id int primary key auto_increment,first_name varchar(30)," +
                    "last_name varchar(30), age int, dob varchar(12))");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Person getPersonById(int pId) {

        try {
            PreparedStatement statement = connection.prepareStatement("select * " +
                    "from person where id = ?");

            statement.setInt(1, pId);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Person person = getPersonFromResultSet(resultSet);

                return person;
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;

    }

    public List<Person> getPeople() {
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from person");
            List<Person> personList = new ArrayList<>();
//            To travels
            while (resultSet.next()){
                Person person = getPersonFromResultSet(resultSet);
                personList.add(person);
            }
            return personList;
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    private Person getPersonFromResultSet(ResultSet resultSet) throws SQLException{
        String first_name = resultSet.getString("first_name");
        String last_name = resultSet.getString("last_name");
        int id = resultSet.getInt("id");
        int age = resultSet.getInt(4);
        String dob = resultSet.getString(5);

        Person person = Person.builder()
                .id(id)
                .firstName(first_name)
                .lastName(last_name)
                .age(age)
                .dob(dob)
                .build();

        return person;

    }

//    public Person deleteById(int pId) {
    public boolean deleteById(int pId) {
        try {
            PreparedStatement statement = connection.prepareStatement("delete from person where id = ?");

            statement.setInt(1, pId);

            int result = statement.executeUpdate();
            logger.info("Delete statement result {}", result >= 1 ? true : false);

            return result >= 1 ? true : false ;
            }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
}


// Model contains main field
// controller-- service-- repository