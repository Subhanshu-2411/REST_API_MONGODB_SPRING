package org.example.rest_api_mongodb_spring.controller

import org.example.rest_api_mongodb_spring.dto.CityRequest
import org.example.rest_api_mongodb_spring.dto.CityResponse
import org.example.rest_api_mongodb_spring.models.City
import org.example.rest_api_mongodb_spring.service.CityService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cities")
class CityController(
        val cityService: CityService
) {

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    fun getCities(): MutableList<CityResponse> {
        return cityService.getCities()
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getCity(@PathVariable id: String): CityResponse {
        return cityService.getCity(id)
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun createCity(@RequestBody cityRequest: CityRequest): CityResponse {
        return cityService.createCity(cityRequest)
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun updateCity(@RequestBody cityRequest: CityRequest, @PathVariable id: String): CityResponse {
        return cityService.updateCity(cityRequest, id)
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteCity(@PathVariable id: String) {
        cityService.deleteCity(id)
    }

}