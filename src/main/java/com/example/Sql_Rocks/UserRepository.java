package com.example.Sql_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    //first part is in <> : with whom to connect,what is the datatype of the primary key


    //generally in interfaces you have to write custom queries


//    @Query("select * from user_info where id=1");
}
