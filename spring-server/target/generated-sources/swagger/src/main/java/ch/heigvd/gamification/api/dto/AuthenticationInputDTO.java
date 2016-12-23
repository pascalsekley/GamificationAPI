package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * AuthenticationInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-19T20:02:53.332+01:00")

public class AuthenticationInputDTO   {
  private String name = null;

  private String password = null;

  public AuthenticationInputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of application to authenticate.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of application to authenticate.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthenticationInputDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of the application.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password of the application.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationInputDTO authenticationInputDTO = (AuthenticationInputDTO) o;
    return Objects.equals(this.name, authenticationInputDTO.name) &&
        Objects.equals(this.password, authenticationInputDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

