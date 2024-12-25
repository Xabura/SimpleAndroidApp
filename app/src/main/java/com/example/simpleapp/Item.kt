package com.example.simpleapp

data class Item(
    val name: String,
    val imageResId: Int
)

data class ListItem(
    val title: String,
    val items: List<Item>
)