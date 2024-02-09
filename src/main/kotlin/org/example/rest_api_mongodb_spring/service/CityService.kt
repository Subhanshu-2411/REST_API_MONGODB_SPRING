package org.example.rest_api_mongodb_spring.service

import org.example.rest_api_mongodb_spring.dto.CityRequest
import org.example.rest_api_mongodb_spring.dto.CityResponse
import org.example.rest_api_mongodb_spring.models.City
import org.example.rest_api_mongodb_spring.repository.CityRepository
import org.example.rest_api_mongodb_spring.utils.Utils
import org.springframework.stereotype.Service

@Service
class CityService(
        val cityRepository: CityRepository,
        val utils: Utils
) {

    fun getCities(): MutableList<CityResponse> {
        val cities = cityRepository.findAll()
        return cities.map { city -> utils.toCityResponse(city) }.toMutableList()
    }

    fun getCity(id: String): CityResponse {
        return utils.toCityResponse(cityRepository.findById(id).get())
    }

    fun createCity(cityRequest: CityRequest): CityResponse {
        return utils.toCityResponse(cityRepository.save(utils.toCity(cityRequest)))
    }

    fun updateCity(cityRequest: CityRequest, id: String): CityResponse {
        return utils.toCityResponse(cityRepository.save(utils.toCity(cityRequest, id)))
    }

    fun deleteCity(id: String) {
        cityRepository.deleteById(id)
    }
}