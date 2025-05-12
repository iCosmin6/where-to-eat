package com.example.Where.to.Eat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public DataLoader(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Adăugăm câteva restaurante de test
        restaurantRepository.save(new Restaurant("La Ceaun", "Strada Lunga 123", "Bucatarie traditionala romaneasca"));
        restaurantRepository.save(new Restaurant("Sub Tampa", "Piata Sfatului 45", "Bucatarie internationala si gratar"));
        restaurantRepository.save(new Restaurant("Dei Frati", "Strada Muresenilor 67", "Bucatarie italiana"));
        restaurantRepository.save(new Restaurant("Gaura Dulce", "Strada Sforii 9", "Deserturi si cafea"));

        System.out.println("Date de test adăugate în baza de date.");
    }
}
