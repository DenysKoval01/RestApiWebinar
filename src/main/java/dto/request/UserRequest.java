package dto.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequest {

    @SerializedName("userName")
    public String userName;
    @SerializedName("password")
    public String password;
}
