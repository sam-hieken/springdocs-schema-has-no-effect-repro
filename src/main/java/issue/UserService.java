package issue;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public UserModel getUser(String userID) {
		if (userID.equals("000"))
			return new UserModel("000", "John", (byte) 18);
		
		else if (userID.equals("001"))
			return new UserModel("001", "Jane", (byte) 19);
		
		return null;
	}
}
