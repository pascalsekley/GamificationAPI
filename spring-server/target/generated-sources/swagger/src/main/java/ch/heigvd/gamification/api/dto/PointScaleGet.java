package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * PointScaleGet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T20:15:04.390+01:00")

public class PointScaleGet   {
  private String pointScaleId = null;

  private String name = null;

  private String description = null;

  private Integer coeffcient = null;

  public PointScaleGet pointScaleId(String pointScaleId) {
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

  public PointScaleGet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of point scale.
   * @return name
  **/
  @ApiModelProperty(value = "Display name of point scale.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PointScaleGet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of point scale.
   * @return description
  **/
  @ApiModelProperty(value = "Description of point scale.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PointScaleGet coeffcient(Integer coeffcient) {
    this.coeffcient = coeffcient;
    return this;
  }

   /**
   * Coeffcient of the point scale.
   * @return coeffcient
  **/
  @ApiModelProperty(value = "Coeffcient of the point scale.")
  public Integer getCoeffcient() {
    return coeffcient;
  }

  public void setCoeffcient(Integer coeffcient) {
    this.coeffcient = coeffcient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointScaleGet pointScaleGet = (PointScaleGet) o;
    return Objects.equals(this.pointScaleId, pointScaleGet.pointScaleId) &&
        Objects.equals(this.name, pointScaleGet.name) &&
        Objects.equals(this.description, pointScaleGet.description) &&
        Objects.equals(this.coeffcient, pointScaleGet.coeffcient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointScaleId, name, description, coeffcient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointScaleGet {\n");
    
    sb.append("    pointScaleId: ").append(toIndentedString(pointScaleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    coeffcient: ").append(toIndentedString(coeffcient)).append("\n");
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

