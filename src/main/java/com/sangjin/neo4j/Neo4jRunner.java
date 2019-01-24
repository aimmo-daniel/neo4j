package com.sangjin.neo4j;

import com.sangjin.neo4j.account.Account;
import com.sangjin.neo4j.account.AccountRepository;
import com.sangjin.neo4j.account.Role;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {
/*    @Autowired
    SessionFactory sessionFactory;*/

    @Autowired
    AccountRepository accountRepository;

   /* @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("roletest@naver.com");
        account.setUsername("role");;

        Role role = new Role();
        role.setName("admin");

        account.getRoles().add(role);

        Session session = sessionFactory.openSession();
        session.save(account);
        sessionFactory.close();

        System.out.println("finished");
    }*/

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("aaa@naver.com");
        account.setUsername("aaa");;

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

        accountRepository.save(account);

        System.out.println("finished");
    }
}
