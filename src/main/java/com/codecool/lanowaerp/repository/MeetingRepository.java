package com.codecool.lanowaerp.repository;


import com.codecool.lanowaerp.model.Meeting;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRepository extends CrudRepository<Meeting, Integer> {

    Meeting getByDate(Date date);
}
