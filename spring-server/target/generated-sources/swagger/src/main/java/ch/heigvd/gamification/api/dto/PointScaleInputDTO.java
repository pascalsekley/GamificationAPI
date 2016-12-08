package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PointScaleInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T00:27:22.592+01:00")

public class PointScaleInputDTO   {
  private String name = null;

  private String description = null;

  private Integer coefficient = null;

  public PointScaleInputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of point scale.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display name of point scale.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PointScaleInputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of point scale.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of point scale.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PointScaleInputDTO coefficient(Integer coefficient) {
    this.coefficient = coefficient;
    return this;
  }

   /**
   * Coeffcient of the point scale.
   * @return coefficient
  **/
  @ApiModelProperty(required = true, value = "Coeffcient of the point scale.")
  public Integer getCoefficient() {
    return coefficient;
  }

  public void setCoefficient(Integer coefficient) {
    this.coefficient = coefficient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointScaleInputDTO pointScaleInputDTO = (PointScaleInputDTO) o;
    return Objects.equals(this.name, pointScaleInputDTO.name) &&
        Objects.equals(this.description, pointScaleInputDTO.description) &&
        Objects.equals(this.coefficient, pointScaleInputDTO.coefficient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, coefficient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointScaleInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coefficient: ").append(toIndentedString(coefficient)).append("\n");
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

