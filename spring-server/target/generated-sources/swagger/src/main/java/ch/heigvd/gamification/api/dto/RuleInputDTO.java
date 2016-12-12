package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RuleInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-12T23:59:39.533+01:00")

public class RuleInputDTO   {
  private String ruleName = null;

  private String description = null;

  private Integer badgeId = null;

  private Integer pointScaleId = null;

  private Integer points = null;

  public RuleInputDTO ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Display rule's name.
   * @return ruleName
  **/
  @ApiModelProperty(required = true, value = "Display rule's name.")
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public RuleInputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the rule.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the rule.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RuleInputDTO badgeId(Integer badgeId) {
    this.badgeId = badgeId;
    return this;
  }

   /**
   * The id of the badge to be given to a user
   * @return badgeId
  **/
  @ApiModelProperty(required = true, value = "The id of the badge to be given to a user")
  public Integer getBadgeId() {
    return badgeId;
  }

  public void setBadgeId(Integer badgeId) {
    this.badgeId = badgeId;
  }

  public RuleInputDTO pointScaleId(Integer pointScaleId) {
    this.pointScaleId = pointScaleId;
    return this;
  }

   /**
   * The id of the pointScale to be given to a user
   * @return pointScaleId
  **/
  @ApiModelProperty(required = true, value = "The id of the pointScale to be given to a user")
  public Integer getPointScaleId() {
    return pointScaleId;
  }

  public void setPointScaleId(Integer pointScaleId) {
    this.pointScaleId = pointScaleId;
  }

  public RuleInputDTO points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * score of point to get/lose by this rule
   * @return points
  **/
  @ApiModelProperty(required = true, value = "score of point to get/lose by this rule")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleInputDTO ruleInputDTO = (RuleInputDTO) o;
    return Objects.equals(this.ruleName, ruleInputDTO.ruleName) &&
        Objects.equals(this.description, ruleInputDTO.description) &&
        Objects.equals(this.badgeId, ruleInputDTO.badgeId) &&
        Objects.equals(this.pointScaleId, ruleInputDTO.pointScaleId) &&
        Objects.equals(this.points, ruleInputDTO.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleName, description, badgeId, pointScaleId, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleInputDTO {\n");
    
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    badgeId: ").append(toIndentedString(badgeId)).append("\n");
    sb.append("    pointScaleId: ").append(toIndentedString(pointScaleId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

