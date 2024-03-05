package element.learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Credentials {
    private String login;
    private String password;
}
