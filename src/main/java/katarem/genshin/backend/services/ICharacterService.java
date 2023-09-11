package katarem.genshin.backend.services;

import java.util.List;

import katarem.genshin.backend.models.Character;

public interface ICharacterService {

	public String insert(Character c);
	
	public boolean delete(String id);
	
	public List<Character> list();
	
	public Character get(String id);
	
	public String update(String id, Character c);
	
	public List<Character> getPage(int page,int items);
}
