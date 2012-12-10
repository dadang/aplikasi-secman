/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.service;

import com.artivisi.training.domain.SecmanService;
import com.artivisi.training.domain.User;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author endy
 */
@Service @Transactional
public class SecmanServiceImpl implements SecmanService {
    @Autowired private EntityManagerFactory entityManagerFactory;

    @Override
    public List<User> cariSemuaUser() {
        return entityManagerFactory.createEntityManager()
                .createQuery("select u from User u")
                .getResultList();
    }
    
}
