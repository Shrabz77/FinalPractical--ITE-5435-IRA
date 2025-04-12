package com.example.ShrabaniSagareekaITE5435FinalExamA.controller;

import com.example.ShrabaniSagareekaITE5435FinalExamA.model.Reservation;
import com.example.ShrabaniSagareekaITE5435FinalExamA.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationRestController {

    @Autowired
    private ReservationService service;

    @GetMapping
    public List<Reservation> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return service.save(reservation);
    }

    @PutMapping("/{id}")
    public Reservation update(@PathVariable String id, @RequestBody Reservation reservation) {
        return service.update(id, reservation);
    }
}
