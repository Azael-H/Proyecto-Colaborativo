package com.panamericanos.travelmarket.data.repository

import com.panamericanos.travelmarket.model.User
import kotlinx.coroutines.delay

object AuthRepository {

    // Simulación de base de datos de usuarios
    private val users = mutableListOf(
        User("1", "Demo User", "demo@travelmarket.com", "123456")
    )

    suspend fun login(email: String, password: String): Result<User> {
        delay(1000) // Simular latencia de red

        val user = users.find { it.email == email && it.password == password }

        return if (user != null) {
            Result.success(user)
        } else {
            Result.failure(Exception("Email o contraseña incorrectos"))
        }
    }

    suspend fun register(name: String, email: String, password: String): Result<User> {
        delay(1000) // Simular latencia de red

        // Validaciones
        if (name.isBlank()) {
            return Result.failure(Exception("El nombre es requerido"))
        }

        if (email.isBlank() || !email.contains("@")) {
            return Result.failure(Exception("Email inválido"))
        }

        if (password.length < 6) {
            return Result.failure(Exception("La contraseña debe tener al menos 6 caracteres"))
        }

        // Verificar si el email ya existe
        if (users.any { it.email == email }) {
            return Result.failure(Exception("Este email ya está registrado"))
        }

        // Crear nuevo usuario
        val newUser = User(
            id = (users.size + 1).toString(),
            name = name,
            email = email,
            password = password
        )

        users.add(newUser)

        return Result.success(newUser)
    }
}