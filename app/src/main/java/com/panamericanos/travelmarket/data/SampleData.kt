package com.panamericanos.travelmarket.data

import com.panamericanos.travelmarket.model.Category
import com.panamericanos.travelmarket.model.TravelItem

object SampleData {
    val categories = listOf(
        Category(
            id = "eventos",
            name = "Eventos Panamericanos",
            icon = "[Eventos]",
            description = "Competencias deportivas y actividades oficiales",
            itemCount = 45
        ),
        Category(
            id = "lugares",
            name = "Lugares Turisticos",
            icon = "[Lugares]",
            description = "Descubre los mejores lugares de la ciudad",
            itemCount = 32
        ),
        Category(
            id = "gastronomia",
            name = "Gastronomia Local",
            icon = "[Comida]",
            description = "Sabores autenticos y experiencias culinarias",
            itemCount = 28
        ),
        Category(
            id = "transporte",
            name = "Transporte",
            icon = "[Taxi]",
            description = "Opciones de movilidad y rutas",
            itemCount = 15
        ),
        Category(
            id = "alojamiento",
            name = "Alojamiento",
            icon = "[Hotel]",
            description = "Hoteles y hospedajes cerca de las sedes",
            itemCount = 22
        ),
        Category(
            id = "experiencias",
            name = "Experiencias",
            icon = "[Teatro]",
            description = "Actividades unicas y entretenimiento",
            itemCount = 19
        )
    )

    val featuredItems = listOf(
        TravelItem(
            id = "1",
            title = "Ceremonia de Inauguracion",
            category = "Eventos Panamericanos",
            description = "Disfruta del espectacular evento de apertura de los Juegos Panamericanos con shows en vivo, fuegos artificiales y desfiles de delegaciones.",
            imageUrl = "https://images.unsplash.com/photo-1540747913346-19e32dc3e97e?w=800",
            rating = 4.9f,
            reviewCount = 1520,
            price = "Desde $150",
            location = "Estadio Nacional"
        ),
        TravelItem(
            id = "2",
            title = "Centro Historico",
            category = "Lugares Turisticos",
            description = "Recorre las calles coloniales y descubre la rica historia de la ciudad. Arquitectura impresionante y cultura en cada esquina.",
            imageUrl = "https://images.unsplash.com/photo-1518509562904-e7ef99cdcc86?w=800",
            rating = 4.7f,
            reviewCount = 2341,
            price = "Gratis",
            location = "Plaza Mayor"
        ),
        TravelItem(
            id = "3",
            title = "Restaurante El Sabor Local",
            category = "Gastronomia",
            description = "Experiencia culinaria unica con los mejores platos tradicionales preparados por chefs reconocidos. Ingredientes frescos y locales.",
            imageUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=800",
            rating = 4.8f,
            reviewCount = 892,
            price = "$30 - $60",
            location = "Distrito Gourmet"
        ),
        TravelItem(
            id = "4",
            title = "Atletismo - Finales",
            category = "Eventos Panamericanos",
            description = "Presencia las emocionantes finales de atletismo con los mejores atletas del continente compitiendo por las medallas de oro.",
            imageUrl = "https://images.unsplash.com/photo-1461896836934-ffe607ba8211?w=800",
            rating = 4.9f,
            reviewCount = 1103,
            price = "Desde $80",
            location = "Pista de Atletismo"
        ),
        TravelItem(
            id = "5",
            title = "Museo de Arte Contemporaneo",
            category = "Lugares Turisticos",
            description = "Explora obras de artistas latinoamericanos contemporaneos en un espacio arquitectonico impresionante.",
            imageUrl = "https://images.unsplash.com/photo-1564399579883-451a5d44ec08?w=800",
            rating = 4.6f,
            reviewCount = 756,
            price = "$15",
            location = "Zona Cultural"
        ),
        TravelItem(
            id = "6",
            title = "Tour Gastronomico Nocturno",
            category = "Experiencias",
            description = "Recorrido guiado por los mejores food trucks y mercados nocturnos. Degusta 8 platos diferentes en una noche inolvidable.",
            imageUrl = "https://images.unsplash.com/photo-1555939594-58d7cb561ad1?w=800",
            rating = 4.9f,
            reviewCount = 1842,
            price = "$45",
            location = "Mercado Central"
        ),
        TravelItem(
            id = "7",
            title = "Natacion Sincronizada",
            category = "Eventos Panamericanos",
            description = "Evento acuatico espectacular con las mejores rutinas artisticas del continente.",
            imageUrl = "https://images.unsplash.com/photo-1560089000-7433a4ebbd64?w=800",
            rating = 4.7f,
            reviewCount = 654,
            price = "Desde $50",
            location = "Centro Acuatico"
        ),
        TravelItem(
            id = "8",
            title = "Parque de las Leyendas",
            category = "Lugares Turisticos",
            description = "Zoologico con especies nativas y exoticas. Perfecto para familias con actividades educativas.",
            imageUrl = "https://images.unsplash.com/photo-1564349683136-77e08dba1ef7?w=800",
            rating = 4.5f,
            reviewCount = 1234,
            price = "$10",
            location = "San Miguel"
        ),
        TravelItem(
            id = "9",
            title = "Cevicheria La Mar",
            category = "Gastronomia",
            description = "El mejor ceviche de la ciudad con pescado fresco del dia. Ambiente marino y vistas al oceano.",
            imageUrl = "https://images.unsplash.com/photo-1559847844-5315695dadae?w=800",
            rating = 4.9f,
            reviewCount = 2156,
            price = "$25 - $50",
            location = "Miraflores"
        ),
        TravelItem(
            id = "10",
            title = "Voleibol de Playa",
            category = "Eventos Panamericanos",
            description = "Emocionantes partidos en la arena con los mejores equipos del continente.",
            imageUrl = "https://images.unsplash.com/photo-1612872087720-bb876e2e67d1?w=800",
            rating = 4.6f,
            reviewCount = 432,
            price = "Desde $30",
            location = "Playa Costa Verde"
        ),
        TravelItem(
            id = "11",
            title = "Circuito Magico del Agua",
            category = "Lugares Turisticos",
            description = "Show de luces y aguas danzantes. Espectaculo nocturno imperdible con 13 fuentes diferentes.",
            imageUrl = "https://images.unsplash.com/photo-1582268611958-ebfd161ef9cf?w=800",
            rating = 4.8f,
            reviewCount = 1876,
            price = "$5",
            location = "Parque de la Reserva"
        ),
        TravelItem(
            id = "12",
            title = "Clase de Cocina Peruana",
            category = "Experiencias",
            description = "Aprende a preparar platos tipicos peruanos con chef profesional. Incluye mercado y degustacion.",
            imageUrl = "https://images.unsplash.com/photo-1556910103-1c02745aae4d?w=800",
            rating = 4.9f,
            reviewCount = 567,
            price = "$80",
            location = "Barranco"
        )
    )

    fun getItemsByCategory(categoryId: String): List<TravelItem> {
        return featuredItems.filter {
            it.category.lowercase().contains(categoryId.lowercase())
        }
    }

    fun getItemById(itemId: String): TravelItem? {
        return featuredItems.find { it.id == itemId }
    }
}