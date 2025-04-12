package com.example.ShrabaniSagareekaITE5435FinalExamA.service;

import com.example.ShrabaniSagareekaITE5435FinalExamA.model.Reservation;
import com.example.ShrabaniSagareekaITE5435FinalExamA.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repo;

    public List<Reservation> getAll() {
        return repo.findAll();
    }

    public Reservation getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Reservation save(Reservation reservation) {
        return repo.save(reservation);
    }

    public Reservation update(String id, Reservation reservation) {
        reservation.setId(id);
        return repo.save(reservation);
    }
}
