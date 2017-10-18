package com.codecool.lanowaerp.repository;

import com.codecool.lanowaerp.model.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Integer> {

}
