package com.example.ShrabaniSagareekaITE5435FinalExamA.repository;

import com.example.ShrabaniSagareekaITE5435FinalExamA.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
