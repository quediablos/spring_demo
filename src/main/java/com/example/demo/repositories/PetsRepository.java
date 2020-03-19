package com.example.demo.repositories;

import com.example.demo.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetsRepository extends MongoRepository<Pets, String> {

    Pets findBy_id(ObjectId _id);

    List<Pets> findByNameEquals(String name);
}