package org.example.rest_api_mongodb_spring.utils

import lombok.experimental.UtilityClass
import org.example.rest_api_mongodb_spring.dto.CityRequest
import org.example.rest_api_mongodb_spring.dto.CityResponse
import org.example.rest_api_mongodb_spring.models.City
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class Utils {

    fun toCityResponse(
            city: City
    ): CityResponse {
        return CityResponse(
                id = city.id!!,
                name = city.name,
                country = city.country,
                populationM = city.populationM
        )
    }

    fun toCity(
            cityRequest: CityRequest,
            id: String? = UUID.randomUUID().toString()
    ): City {
        return City(
                id = id,
                name = cityRequest.name,
                country = cityRequest.country,
                populationM = cityRequest.populationM
        )
    }
}