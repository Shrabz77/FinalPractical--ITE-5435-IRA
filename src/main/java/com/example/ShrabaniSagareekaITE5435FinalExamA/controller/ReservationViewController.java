package com.example.ShrabaniSagareekaITE5435FinalExamA.controller;

import com.example.ShrabaniSagareekaITE5435FinalExamA.model.Reservation;
import com.example.ShrabaniSagareekaITE5435FinalExamA.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationViewController {

    @Autowired
    private ReservationService service;

    @GetMapping("/reservation-form")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    @PostMapping("/reservation-form")
    public String submitForm(@ModelAttribute Reservation reservation, Model model) {
        service.save(reservation);
        model.addAttribute("message", "Reservation submitted successfully!");
        return "reservation_form";
    }
}
