package katarem.genshin.backend.repos;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import katarem.genshin.backend.models.Character;

@ApplicationScoped
public class CharacterRepository implements PanacheRepository<Character>{

}
