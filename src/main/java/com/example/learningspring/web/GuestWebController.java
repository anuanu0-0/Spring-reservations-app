package com.example.learningspring.web;

import com.example.learningspring.buisness.service.ReservationService;
import com.example.learningspring.data.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//TODO : SHOW GUEST DETAILS
@Controller
@RequestMapping("/guests")
public class GuestWebController {
    private final ReservationService reservationService;

    @Autowired
    public GuestWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getGuestList(Model model) {
        List<Guest> guests = this.reservationService.getGuestDetails();
        model.addAttribute("guests", guests);
        return "guests";
    }
}
