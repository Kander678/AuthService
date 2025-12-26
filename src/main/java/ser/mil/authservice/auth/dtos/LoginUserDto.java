package ser.mil.authservice.auth.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class LoginUserDto {

    @Email(message = "Email is required")
    @NotBlank(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
