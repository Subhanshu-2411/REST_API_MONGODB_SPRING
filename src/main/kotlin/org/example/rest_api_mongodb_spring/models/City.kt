package org.example.rest_api_mongodb_spring.models

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
data class City(
        @Id
        val id: String?,
        val name: String,
        val country: String,
        val populationM: Float
)
