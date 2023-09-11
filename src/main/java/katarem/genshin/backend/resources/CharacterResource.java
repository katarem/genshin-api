package katarem.genshin.backend.resources;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import katarem.genshin.backend.services.CharacterService;
import katarem.genshin.backend.models.Character;
@Path("/characters/")
@Transactional
public class CharacterResource {

	@Inject
	private CharacterService cs;
	
	@GET
	public List<Character> listAll(){
		return cs.list();
	}
	
	@POST
	@Path("/add")
	public String insert(Character c){
		return cs.insert(c);
	}
	
	@DELETE
	@Path("/delete/{id}")
	public String delete(@PathParam(value = "id")String id) {
		return cs.delete(id)?"Eliminado correctamente":"No existía";
	}
	
	@GET
	@Path("/{id}")
	public Character get(@PathParam(value = "id")String id) {
		return cs.get(id);
	}
	
	@PUT
	@Path("/{id}")
	public String update(@PathParam(value = "id")String id, Character c) {
		return cs.update(id, c);
	}
	
	@GET
	@Path("/sort")
	public List<Character> getPage(@QueryParam(value = "p")int page, @QueryParam(value = "s")int size) {
		return cs.getPage(page,size);
	}
	
	
}
