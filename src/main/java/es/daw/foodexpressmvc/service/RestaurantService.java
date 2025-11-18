package es.daw.foodexpressmvc.service;

import es.daw.foodexpressmvc.dto.RestaurantDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    public List<RestaurantDTO> getRestaurants() {

        // Pendiente usar WebClient para hacer la petición al endpoint GET http://localhost:8082/api/restaurants
        // Obtendremos un json la la lista de objetos RestaurantDTO

        return null;

    }
}
