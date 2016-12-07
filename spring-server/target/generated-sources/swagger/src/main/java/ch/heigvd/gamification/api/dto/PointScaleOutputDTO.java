package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PointScaleOutputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T20:36:58.390+01:00")

public class PointScaleOutputDTO   {
  private String pointScaleId = null;

  private String name = null;

  private String description = null;

  private Integer coefficient = null;

  public PointScaleOutputDTO pointScaleId(String pointScaleId) {
    this.pointScaleId = pointScaleId;
    return this;
  }

   /**
   * Unique identifier representing a specific point scale.
   * @return pointScaleId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific point scale.")
  public String getPointScaleId() {
    return pointScaleId;
  }

  public void setPointScaleId(String pointScaleId) {
    this.pointScaleId = pointScaleId;
  }

  public PointScaleOutputDTO name(String name) {
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

  public PointScaleOutputDTO description(String description) {
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

  public PointScaleOutputDTO coefficient(Integer coefficient) {
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
    PointScaleOutputDTO pointScaleOutputDTO = (PointScaleOutputDTO) o;
    return Objects.equals(this.pointScaleId, pointScaleOutputDTO.pointScaleId) &&
        Objects.equals(this.name, pointScaleOutputDTO.name) &&
        Objects.equals(this.description, pointScaleOutputDTO.description) &&
        Objects.equals(this.coefficient, pointScaleOutputDTO.coefficient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointScaleId, name, description, coefficient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointScaleOutputDTO {\n");
    
    sb.append("    pointScaleId: ").append(toIndentedString(pointScaleId)).append("\n");
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

