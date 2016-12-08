package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * ApplicationInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T22:46:01.300+01:00")

public class ApplicationInputDTO   {
  private String name = null;

  private String description = null;

  public ApplicationInputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of the application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display name of the application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationInputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the application.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInputDTO applicationInputDTO = (ApplicationInputDTO) o;
    return Objects.equals(this.name, applicationInputDTO.name) &&
        Objects.equals(this.description, applicationInputDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

