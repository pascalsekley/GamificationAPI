package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * BadgeOutputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T22:46:01.300+01:00")

public class BadgeOutputDTO   {
  private String badgeId = null;

  private String name = null;

  private String description = null;

  private String imageURL = null;

  public BadgeOutputDTO badgeId(String badgeId) {
    this.badgeId = badgeId;
    return this;
  }

   /**
   * Unique identifier representing a specific badge.
   * @return badgeId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier representing a specific badge.")
  public String getBadgeId() {
    return badgeId;
  }

  public void setBadgeId(String badgeId) {
    this.badgeId = badgeId;
  }

  public BadgeOutputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of badge.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display name of badge.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BadgeOutputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of badge.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of badge.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BadgeOutputDTO imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Image URL representing the badge.
   * @return imageURL
  **/
  @ApiModelProperty(required = true, value = "Image URL representing the badge.")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadgeOutputDTO badgeOutputDTO = (BadgeOutputDTO) o;
    return Objects.equals(this.badgeId, badgeOutputDTO.badgeId) &&
        Objects.equals(this.name, badgeOutputDTO.name) &&
        Objects.equals(this.description, badgeOutputDTO.description) &&
        Objects.equals(this.imageURL, badgeOutputDTO.imageURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badgeId, name, description, imageURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeOutputDTO {\n");
    
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
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

