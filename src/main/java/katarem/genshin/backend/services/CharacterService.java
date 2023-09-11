package katarem.genshin.backend.services;

import java.util.List;
import java.util.NoSuchElementException;

import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import katarem.genshin.backend.models.Character;
import katarem.genshin.backend.repos.CharacterRepository;

@ApplicationScoped
public class CharacterService implements ICharacterService {

	@Inject
	private CharacterRepository repo;
	
	@Override
	public String insert(Character c) {
		if(repo.find("id=?1", c.getId()).count()<1) {
			repo.persist(c);
			return "Character " + c.getId() + "was added.";
		}
		else {
			throw new NoSuchElementException("It wasn't added");
		}
	}

	@Override
	public boolean delete(String id) {
		return repo.delete("id=?1",id)>0;
	}

	@Override
	public List<Character> list() {
		return repo.listAll(Sort.ascending("name"));
	}

	@Override
	public Character get(String id) {
		var c = repo.find("id=?1", id).firstResult();
		if(c==null) {
			throw new NoSuchElementException("No existe ese personaje");
		}
		else
			return c;
		
	}

	@Override
	public String update(String id, Character c) {
		var updatedC = repo.find("id=?1", id).firstResult();
		if(updatedC!=null) {
			updatedC.setBirthday(c.getBirthday());
			updatedC.setConstellation(c.getConstellation());
			updatedC.setElement(c.getElement());
			updatedC.setIcon(c.getIcon());
			updatedC.setSplashArt(c.getSplashArt());
			updatedC.setTitle(c.getTitle());
			updatedC.setName(c.getName());
			repo.persist(updatedC);
			return "Character with id " + c.getId() + " was updated.";
		}
		else {
			throw new NoSuchElementException("Character wasn't found");
		}
	}

	@Override
	public List<Character> getPage(int page,int items) {
		
		var list = repo.findAll(Sort.ascending("name"))
				 .page(page,items)
				 .list();
		if(list.isEmpty()) {
			throw new NoSuchElementException("No existe esa página");
		}
		else
			return list;
	}

}
