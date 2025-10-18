package com.panamericanos.travelmarket.data

import com.panamericanos.travelmarket.model.Category
import com.panamericanos.travelmarket.model.TravelItem

object SampleData {
    val categories = listOf(
        Category(
            id = "eventos",
            name = "Eventos Panamericanos",
            icon = "🏟️",
            description = "Competencias deportivas y actividades oficiales",
            itemCount = 45
        ),
        Category(
            id = "lugares",
            name = "Lugares Turísticos",
            icon = "🗺️",
            description = "Descubre los mejores lugares de la ciudad",
            itemCount = 32
        ),
        Category(
            id = "gastronomia",
            name = "Gastronomía Local",
            icon = "🍽️",
            description = "Sabores auténticos y experiencias culinarias",
            itemCount = 28
        ),
        Category(
            id = "transporte",
            name = "Transporte",
            icon = "🚕",
            description = "Opciones de movilidad y rutas",
            itemCount = 15
        ),
        Category(
            id = "alojamiento",
            name = "Alojamiento",
            icon = "🏨",
            description = "Hoteles y hospedajes cerca de las sedes",
            itemCount = 22
        ),
        Category(
            id = "experiencias",
            name = "Experiencias",
            icon = "🎭",
            description = "Actividades únicas y entretenimiento",
            itemCount = 19
        )
    )

    val featuredItems = listOf(
        TravelItem(
            id = "1",
            title = "Ceremonia de Inauguración",
            category = "Eventos Panamericanos",
            description = "Disfruta del espectacular evento de apertura de los Juegos Panamericanos con shows en vivo, fuegos artificiales y desfiles de delegaciones.",
            imageUrl = "https://images.unsplash.com/photo-1540747913346-19e32dc3e97e?w=800",
            rating = 4.9f,
            reviewCount = 1520,
            price = "Desde \$150",
            location = "Estadio Nacional"
        ),
        TravelItem(
            id = "2",
            title = "Centro Histórico",
            category = "Lugares Turísticos",
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
            category = "Gastronomía",
            description = "Experiencia culinaria única con los mejores platos tradicionales preparados por chefs reconocidos. Ingredientes frescos y locales.",
            imageUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=800",
            rating = 4.8f,
            reviewCount = 892,
            price = "\$30 - \$60",
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
            price = "Desde \$80",
            location = "Pista de Atletismo"
        ),
        TravelItem(
            id = "5",
            title = "Museo de Arte Contemporáneo",
            category = "Lugares Turísticos",
            description = "Explora obras de artistas latinoamericanos contemporáneos en un espacio arquitectónico impresionante.",
            imageUrl = "https://images.unsplash.com/photo-1564399579883-451a5d44ec08?w=800",
            rating = 4.6f,
            reviewCount = 756,
            price = "\$15",
            location = "Zona Cultural"
        ),
        TravelItem(
            id = "6",
            title = "Tour Gastronómico Nocturno",
            category = "Experiencias",
            description = "Recorrido guiado por los mejores food trucks y mercados nocturnos. Degusta 8 platos diferentes en una noche inolvidable.",
            imageUrl = "https://images.unsplash.com/photo-1555939594-58d7cb561ad1?w=800",
            rating = 4.9f,
            reviewCount = 1842,
            price = "\$45",
            location = "Mercado Central"
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