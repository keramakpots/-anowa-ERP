package com.codecool.lanowaerp.service;

import com.codecool.lanowaerp.model.Volunteer;
import com.codecool.lanowaerp.repository.VolunteerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VolunteerService {

    private VolunteerRepository volunteerRepository;

    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public void add(Volunteer volunteer) {
        volunteerRepository.save(volunteer);
    }

    public List<Volunteer> getAll() {
        return (List<Volunteer>) volunteerRepository.findAll();
    }

}
