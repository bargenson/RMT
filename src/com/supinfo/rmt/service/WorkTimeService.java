package com.supinfo.rmt.service;

import com.supinfo.rmt.entity.WorkTime;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: bargenson
 * Date: 4/30/12
 * Time: 5:54 PM
 */
@Stateless
public class WorkTimeService {

    @PersistenceContext
    private EntityManager em;

    public WorkTime addWorkTime(WorkTime workTime) {
        em.persist(workTime);
        return workTime;
    }

}
