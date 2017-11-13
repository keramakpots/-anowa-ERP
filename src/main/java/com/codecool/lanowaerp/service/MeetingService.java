package com.codecool.lanowaerp.service;


import com.codecool.lanowaerp.model.Meeting;
import com.codecool.lanowaerp.repository.MeetingRepository;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {

    private MeetingRepository meetingRepository;

    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    public void addMeetting(Meeting meeting) {
        meetingRepository.save(meeting);
    }

    public Meeting getMeetingByDate(Date date) {
        return meetingRepository.getByDate(date);
    }

    public List<Meeting> getAll() {
        return (List<Meeting>) meetingRepository.findAll();
    }

}
