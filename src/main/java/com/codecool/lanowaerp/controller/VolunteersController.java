package com.codecool.lanowaerp.controller;

import com.codecool.lanowaerp.model.Volunteer;
import com.codecool.lanowaerp.service.VolunteerService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/volunteer")
public class VolunteersController {

    private final VolunteerService volunteerService;

    public VolunteersController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public @ResponseBody
    ModelAndView getAllVolunteers(ModelAndView modelAndView) {
        List<Volunteer> volunteers = volunteerService.getAll();
        modelAndView.addObject("volunteers", volunteers);
        modelAndView.setViewName("volunteersList");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView addVolunteer(@RequestBody Volunteer volunteer, ModelAndView modelAndView) {
        volunteerService.add(volunteer);
        List<Volunteer> volunteers = volunteerService.getAll();
        modelAndView.addObject("volunteers", volunteers);
        modelAndView.setViewName("volunteersList");
        return modelAndView;
    }

}
