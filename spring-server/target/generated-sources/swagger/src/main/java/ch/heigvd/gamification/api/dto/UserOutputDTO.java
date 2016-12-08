package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * UserOutputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T22:46:01.300+01:00")

public class UserOutputDTO   {
  private Integer userId = null;

  private Integer userIdApp = null;

  private Integer appId = null;

  public UserOutputDTO userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique identifier representing a specific user.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier representing a specific user.")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UserOutputDTO userIdApp(Integer userIdApp) {
    this.userIdApp = userIdApp;
    return this;
  }

   /**
   * Unique identifier of a user in the gamification platform.
   * @return userIdApp
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of a user in the gamification platform.")
  public Integer getUserIdApp() {
    return userIdApp;
  }

  public void setUserIdApp(Integer userIdApp) {
    this.userIdApp = userIdApp;
  }

  public UserOutputDTO appId(Integer appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Unique identifier of the application
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the application")
  public Integer getAppId() {
    return appId;
  }

  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOutputDTO userOutputDTO = (UserOutputDTO) o;
    return Objects.equals(this.userId, userOutputDTO.userId) &&
        Objects.equals(this.userIdApp, userOutputDTO.userIdApp) &&
        Objects.equals(this.appId, userOutputDTO.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userIdApp, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOutputDTO {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userIdApp: ").append(toIndentedString(userIdApp)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

