package katarem.genshin.backend;

import java.util.NoSuchElementException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ExceptionsMapper implements ExceptionMapper<NoSuchElementException>{
	
	@Override
	public Response toResponse(NoSuchElementException exception) {
		ReturnException r = new ReturnException(exception,404);
		return Response
				.status(404)
				.entity(r)
				.build();
	}

}
