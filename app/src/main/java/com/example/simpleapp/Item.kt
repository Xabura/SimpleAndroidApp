package com.example.simpleapp

data class Vehicle(
    val name: String,
    val imageUrls: List<Int>
)

data class VehicleCategory(
    val title: String,
    val Vehicles: List<Vehicle>
)