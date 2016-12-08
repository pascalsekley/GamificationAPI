package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RuleOutputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-08T22:46:01.300+01:00")

public class RuleOutputDTO   {
  private String ruleId = null;

  private String name = null;

  private String description = null;

  public RuleOutputDTO ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

   /**
   * Unique identifier representing a specific rule.
   * @return ruleId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier representing a specific rule.")
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public RuleOutputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display rule's name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display rule's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RuleOutputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of rule.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of rule.")
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
    RuleOutputDTO ruleOutputDTO = (RuleOutputDTO) o;
    return Objects.equals(this.ruleId, ruleOutputDTO.ruleId) &&
        Objects.equals(this.name, ruleOutputDTO.name) &&
        Objects.equals(this.description, ruleOutputDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleOutputDTO {\n");
    
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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

