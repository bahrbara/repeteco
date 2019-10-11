package com.repeteco.teste.Repository;

import com.repeteco.teste.Model.Account;
import com.repeteco.teste.Model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
//    @Query("from account a where a.id_client = :id")
    List<Account> findByIdClient(int id);
}