package org.example.rest_api_mongodb_spring.dto

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
data class CityResponse(
        val id: String,
        val name: String,
        val country: String,
        val populationM: Float
) {
    init {
        require(id.isNotBlank()) { "Id cannot be blank" }
        require(name.isNotBlank()) { "Name cannot be blank" }
        require(country.isNotBlank()) { "Country cannot be blank" }
        require(populationM > 0) { "Population must be greater than 0" }
    }
}
