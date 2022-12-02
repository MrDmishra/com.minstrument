package com.minstrument.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstrument.dao.RoleDao;
import com.minstrument.entity.Role;

@Service
public class RoleService {

    @Autowired
    public RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
