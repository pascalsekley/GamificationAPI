package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * BadgeInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-15T18:02:48.510+01:00")

public class BadgeInputDTO   {
  private String name = null;

  private String description = null;

  private String imageURL = null;

  public BadgeInputDTO name(String name) {
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

  public BadgeInputDTO description(String description) {
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

  public BadgeInputDTO imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * The URL of the image
   * @return imageURL
  **/
  @ApiModelProperty(required = true, value = "The URL of the image")
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
    BadgeInputDTO badgeInputDTO = (BadgeInputDTO) o;
    return Objects.equals(this.name, badgeInputDTO.name) &&
        Objects.equals(this.description, badgeInputDTO.description) &&
        Objects.equals(this.imageURL, badgeInputDTO.imageURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, imageURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeInputDTO {\n");
    
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

