package issue;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Info about the user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	/** User's ID */
	private String userID;
	
	/** User's name */
	private String name;
	
	/** User's age */
	@Schema(type = "integer", format = "int8")
	private byte age;
}
