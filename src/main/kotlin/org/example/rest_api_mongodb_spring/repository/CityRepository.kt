package org.example.rest_api_mongodb_spring.repository

import org.example.rest_api_mongodb_spring.models.City
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository: MongoRepository<City, String> {
}