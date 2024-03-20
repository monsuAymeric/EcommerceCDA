package io.ski.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.ski.api.persistance.entity.Cart;
import io.ski.api.persistance.entity.Product;
import io.ski.api.persistance.entity.Reference;
import io.ski.api.persistance.entity.User;
import io.ski.api.persistance.repository.cart.ICartRepository;
import io.ski.api.persistance.repository.reference.IReferenceRepository;

import java.util.Arrays;

@Component
public class SampleDataInitializer implements CommandLineRunner {

    private final ICartRepository cartRepository;
    private final IReferenceRepository referenceRepository;

    public SampleDataInitializer(final ICartRepository cartRepository, final IReferenceRepository referenceRepository) {
        this.cartRepository = cartRepository;
        this.referenceRepository = referenceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        insertCart();
        insertReferences();

    }

    private void insertCart() {
        if (cartRepository.count() == 0) {
            User user = new User();
            user.setEmail("test");
            user.setPassword("test");
            user.setUsername("test");
            Cart cart = new Cart();
            cart.setUser(user);
            cartRepository.save(cart);
        }
    }

    private void insertReferences() {
        if (referenceRepository.count() == 0) {
            // Product 1
            Reference reference = new Reference();
            reference.setName("Veste imperméable NorthFace");
            reference.setPrice(199.99);
            reference.setColor("Noire");
            reference.setDescription(
                    "Une veste imperméable haut de gamme conçue pour résister aux intempéries les plus extrêmes en montagne. Fabriquée avec des matériaux légers et respirants, elle offre une protection maximale tout en assurant confort et liberté de mouvement.");
            reference.setProducts(Arrays.asList(new Product()));
            // Product 2
            Reference reference2 = new Reference();
            reference2.setName("Chaussures d'escalade La Sportiva");
            reference2.setPrice(149);
            reference2.setColor("Rouge");
            reference2.setDescription(
                    "Des chaussures d'escalade de haute performance conçues pour les grimpeurs les plus exigeants. Dotées d'une semelle en caoutchouc adhérente et d'une construction légère, elles offrent une excellente sensibilité et précision sur le rocher, tout en garantissant un confort optimal lors des longues sessions d'escalade.");
            reference2.setProducts(Arrays.asList(new Product()));
            // Product 3
            Reference reference3 = new Reference();
            reference3.setName("Sac à dos de randonnée Osprey");
            reference3.setPrice(179.99);
            reference3.setColor("Vert");
            reference3.setDescription(
                    "Un sac à dos de randonnée robuste et polyvalent, idéal pour les treks en montagne. Doté d'un système de portage ergonomique et de nombreuses poches de rangement, il offre un confort optimal même lors des randonnées les plus exigeantes. Sa construction durable le rend parfait pour les aventures en plein air.");
            reference3.setProducts(Arrays.asList(new Product()));
            // Product 4
            Reference reference4 = new Reference();
            reference4.setName("Lunettes de soleil Smith");
            reference4.setPrice(129.99);
            reference4.setColor("Bleues");
            reference4.setDescription(
                    "Des lunettes de soleil de haute qualité conçues spécialement pour les activités en montagne. Dotées de verres polarisés offrant une protection UV maximale, elles assurent une vision claire et nette même dans les conditions les plus lumineuses. Leur monture légère et résistante en fait l'accessoire indispensable pour les amateurs de sports alpins.");
            reference4.setProducts(Arrays.asList(new Product()));
            // Product 5
            Reference reference5 = new Reference();
            reference5.setName("Corde d'escalade Mammut");
            reference5.setPrice(219);
            reference5.setColor("Grise");
            reference5.setDescription(
                    "Une corde d'escalade haut de gamme fabriquée avec les meilleurs matériaux disponibles. Robuste, fiable et facile à manipuler, elle offre une excellente résistance à l'abrasion et une grande longévité, ce qui en fait le choix parfait pour les grimpeurs professionnels et amateurs passionnés de montagne.");
            reference5.setProducts(Arrays.asList(new Product()));

            // Save
            referenceRepository.saveAll(Arrays.asList(reference, reference2, reference3, reference4, reference5));
        }
    }
}