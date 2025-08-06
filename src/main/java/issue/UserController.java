package issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@Tag(name = "all", description = "All endpoints.")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	/**
	 * Get information about the user specified by the supplied userID.
	 * @return The user's information.
	 */
	@Operation(summary = "Get user's info by userID")
	@GetMapping("/{userID}")
	public UserModel getUser(
			HttpServletRequest req,
			@Parameter(description = "The user's ID", example = "000")
			@PathVariable("userID") String userID) {
		return service.getUser(userID);
	}
}
