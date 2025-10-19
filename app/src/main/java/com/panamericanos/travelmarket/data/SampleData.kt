package com.panamericanos.travelmarket.data

import com.panamericanos.travelmarket.model.Category
import com.panamericanos.travelmarket.model.TravelItem

object SampleData {
    val categories = listOf(
        Category(
            id = "eventos",
            name = "Eventos Panamericanos",
            iconName = "Stadium",
            description = "Competencias deportivas y actividades oficiales",
            itemCount = 45
        ),
        Category(
            id = "lugares",
            name = "Lugares Turísticos",
            iconName = "Place",
            description = "Descubre los mejores lugares de la ciudad",
            itemCount = 32
        ),
        Category(
            id = "gastronomia",
            name = "Gastronomía Local",
            iconName = "Restaurant",
            description = "Sabores auténticos y experiencias culinarias",
            itemCount = 28
        ),
        Category(
            id = "transporte",
            name = "Transporte",
            iconName = "DirectionsCar",
            description = "Opciones de movilidad y rutas",
            itemCount = 15
        ),
        Category(
            id = "alojamiento",
            name = "Alojamiento",
            iconName = "Hotel",
            description = "Hoteles y hospedajes cerca de las sedes",
            itemCount = 22
        ),
        Category(
            id = "experiencias",
            name = "Experiencias",
            iconName = "TheaterComedy",
            description = "Actividades únicas y entretenimiento",
            itemCount = 19
        )
    )

    val featuredItems = listOf(
        // EVENTOS PANAMERICANOS
        TravelItem(
            id = "1",
            title = "Ceremonia de Inauguración",
            category = "Eventos Panamericanos",
            description = "Disfruta del espectacular evento de apertura de los Juegos Panamericanos con shows en vivo, fuegos artificiales y desfiles de delegaciones.",
            imageUrl = "https://images.unsplash.com/photo-1540747913346-19e32dc3e97e",
            rating = 4.9f,
            reviewCount = 1520,
            price = "Desde \$150",
            location = "Estadio Nacional"
        ),
        TravelItem(
            id = "4",
            title = "Atletismo - Finales",
            category = "Eventos Panamericanos",
            description = "Presencia las emocionantes finales de atletismo con los mejores atletas del continente compitiendo por las medallas de oro.",
            imageUrl = "https://images.unsplash.com/photo-1461896836934-ffe607ba8211",
            rating = 4.9f,
            reviewCount = 1103,
            price = "Desde \$80",
            location = "Pista de Atletismo"
        ),
        TravelItem(
            id = "7",
            title = "Natación Sincronizada",
            category = "Eventos Panamericanos",
            description = "Evento acuático espectacular con las mejores rutinas artísticas del continente.",
            imageUrl = "https://images.unsplash.com/photo-1519315901367-f34ff9154487",
            rating = 4.7f,
            reviewCount = 654,
            price = "Desde \$50",
            location = "Centro Acuático"
        ),
        TravelItem(
            id = "10",
            title = "Voleibol de Playa",
            category = "Eventos Panamericanos",
            description = "Emocionantes partidos en la arena con los mejores equipos del continente.",
            imageUrl = "https://images.unsplash.com/photo-1612872087720-bb876e2e67d1",
            rating = 4.6f,
            reviewCount = 432,
            price = "Desde \$30",
            location = "Playa Costa Verde"
        ),

        // LUGARES TURÍSTICOS
        TravelItem(
            id = "2",
            title = "Centro Histórico",
            category = "Lugares Turísticos",
            description = "Recorre las calles coloniales y descubre la rica historia de la ciudad. Arquitectura impresionante y cultura en cada esquina.",
            imageUrl = "https://images.unsplash.com/photo-1518509562904-e7ef99cdcc86",
            rating = 4.7f,
            reviewCount = 2341,
            price = "Gratis",
            location = "Plaza Mayor"
        ),
        TravelItem(
            id = "5",
            title = "Museo de Arte Contemporáneo",
            category = "Lugares Turísticos",
            description = "Explora obras de artistas latinoamericanos contemporáneos en un espacio arquitectónico impresionante.",
            imageUrl = "https://images.unsplash.com/photo-1564399579883-451a5d44ec08",
            rating = 4.6f,
            reviewCount = 756,
            price = "\$15",
            location = "Zona Cultural"
        ),
        TravelItem(
            id = "8",
            title = "Parque de las Leyendas",
            category = "Lugares Turísticos",
            description = "Zoológico con especies nativas y exóticas. Perfecto para familias con actividades educativas.",
            imageUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7",
            rating = 4.5f,
            reviewCount = 1234,
            price = "\$10",
            location = "San Miguel"
        ),
        TravelItem(
            id = "11",
            title = "Circuito Mágico del Agua",
            category = "Lugares Turísticos",
            description = "Show de luces y aguas danzantes. Espectáculo nocturno imperdible con 13 fuentes diferentes.",
            imageUrl = "https://images.unsplash.com/photo-1547036967-23d11aacaee0",
            rating = 4.8f,
            reviewCount = 1876,
            price = "\$5",
            location = "Parque de la Reserva"
        ),

        // GASTRONOMÍA
        TravelItem(
            id = "3",
            title = "Restaurante El Sabor Local",
            category = "Gastronomía Local",
            description = "Experiencia culinaria única con los mejores platos tradicionales preparados por chefs reconocidos. Ingredientes frescos y locales.",
            imageUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4",
            rating = 4.8f,
            reviewCount = 892,
            price = "\$30 - \$60",
            location = "Distrito Gourmet"
        ),
        TravelItem(
            id = "9",
            title = "Cevichería La Mar",
            category = "Gastronomía Local",
            description = "El mejor ceviche de la ciudad con pescado fresco del día. Ambiente marino y vistas al océano.",
            imageUrl = "https://images.unsplash.com/photo-1559847844-5315695dadae",
            rating = 4.9f,
            reviewCount = 2156,
            price = "\$25 - \$50",
            location = "Miraflores"
        ),
        TravelItem(
            id = "21",
            title = "Anticuchería Don José",
            category = "Gastronomía Local",
            description = "Los mejores anticuchos de la ciudad con receta familiar secreta. Parrilla al carbón y salsas artesanales.",
            imageUrl = "https://images.unsplash.com/photo-1529692236671-f1f6cf9683ba",
            rating = 4.7f,
            reviewCount = 1432,
            price = "\$15 - \$30",
            location = "Pueblo Libre"
        ),

        // EXPERIENCIAS
        TravelItem(
            id = "6",
            title = "Tour Gastronómico Nocturno",
            category = "Experiencias",
            description = "Recorrido guiado por los mejores food trucks y mercados nocturnos. Degusta 8 platos diferentes en una noche inolvidable.",
            imageUrl = "https://images.unsplash.com/photo-1555939594-58d7cb561ad1",
            rating = 4.9f,
            reviewCount = 1842,
            price = "\$45",
            location = "Mercado Central"
        ),
        TravelItem(
            id = "12",
            title = "Clase de Cocina Peruana",
            category = "Experiencias",
            description = "Aprende a preparar platos típicos peruanos con chef profesional. Incluye mercado y degustación.",
            imageUrl = "https://images.unsplash.com/photo-1556910103-1c02745aae4d",
            rating = 4.9f,
            reviewCount = 567,
            price = "\$80",
            location = "Barranco"
        ),
        TravelItem(
            id = "15",
            title = "Tour de Café y Chocolate",
            category = "Experiencias",
            description = "Descubre los secretos del café peruano y chocolate artesanal. Degustación y taller interactivo.",
            imageUrl = "https://images.unsplash.com/photo-1511537190424-bbbab87ac5eb",
            rating = 4.7f,
            reviewCount = 423,
            price = "\$55",
            location = "Miraflores"
        ),

        // TRANSPORTE
        TravelItem(
            id = "13",
            title = "Bus Turístico Panorámico",
            category = "Transporte",
            description = "Recorre la ciudad en bus de dos pisos con paradas libres. Audio guía en varios idiomas incluida.",
            imageUrl = "https://images.unsplash.com/photo-1544620347-c4fd4a3d5957",
            rating = 4.5f,
            reviewCount = 789,
            price = "\$20",
            location = "Multiple paradas"
        ),
        TravelItem(
            id = "16",
            title = "Metropolitano Express",
            category = "Transporte",
            description = "Sistema de transporte rápido con conexión directa a todas las sedes deportivas. Tarjeta diaria disponible.",
            imageUrl = "https://images.unsplash.com/photo-1570125909232-eb263c188f7e",
            rating = 4.3f,
            reviewCount = 1234,
            price = "\$3 por viaje",
            location = "Red Metropolitano"
        ),
        TravelItem(
            id = "17",
            title = "Bicicletas Compartidas",
            category = "Transporte",
            description = "Alquiler de bicicletas por horas o día completo. Estaciones en puntos estratégicos de la ciudad.",
            imageUrl = "https://images.unsplash.com/photo-1571068316344-75bc76f77890",
            rating = 4.6f,
            reviewCount = 456,
            price = "\$5 por día",
            location = "100+ estaciones"
        ),

        // ALOJAMIENTO
        TravelItem(
            id = "14",
            title = "Hotel Costa del Sol",
            category = "Alojamiento",
            description = "Hotel 5 estrellas frente al mar con spa, gimnasio y restaurante gourmet. A 10 minutos del estadio.",
            imageUrl = "https://images.unsplash.com/photo-1582719478250-c89cae4dc85b",
            rating = 4.8f,
            reviewCount = 1567,
            price = "\$150 por noche",
            location = "Miraflores"
        ),
        TravelItem(
            id = "18",
            title = "Hostal Viajero",
            category = "Alojamiento",
            description = "Hostal económico con ambiente internacional. Desayuno incluido y tours organizados diariamente.",
            imageUrl = "https://images.unsplash.com/photo-1555854877-bab0e564b8d5",
            rating = 4.4f,
            reviewCount = 892,
            price = "\$25 por noche",
            location = "Barranco"
        ),
        TravelItem(
            id = "19",
            title = "Apartamentos Panamericanos",
            category = "Alojamiento",
            description = "Apartamentos equipados cerca de las sedes deportivas. Ideal para familias y grupos.",
            imageUrl = "https://images.unsplash.com/photo-1522708323590-d24dbb6b0267",
            rating = 4.6f,
            reviewCount = 678,
            price = "\$80 por noche",
            location = "San Miguel"
        ),
        TravelItem(
            id = "20",
            title = "Resort Villa Deportiva",
            category = "Alojamiento",
            description = "Resort todo incluido con piscina olímpica y canchas deportivas. Transporte gratuito a eventos.",
            imageUrl = "https://images.unsplash.com/photo-1542314831-068cd1dbfeeb",
            rating = 4.9f,
            reviewCount = 2341,
            price = "\$200 por noche",
            location = "Villa El Salvador"
        )
    )

    fun getItemsByCategory(categoryId: String): List<TravelItem> {
        return featuredItems.filter {
            when (categoryId.lowercase()) {
                "gastronomia" -> it.category.contains("Gastronomía", ignoreCase = true)
                else -> it.category.lowercase().contains(categoryId.lowercase())
            }
        }
    }

    fun getItemById(itemId: String): TravelItem? {
        return featuredItems.find { it.id == itemId }
    }
}
