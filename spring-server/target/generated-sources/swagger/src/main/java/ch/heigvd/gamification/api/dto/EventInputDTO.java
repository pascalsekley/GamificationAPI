package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * EventInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-05T20:36:58.390+01:00")

public class EventInputDTO   {
  private String name = null;

  private String description = null;

  private Integer score = null;

  private String applicationType = null;

  public EventInputDTO name(String name) {
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

  public EventInputDTO description(String description) {
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

  public EventInputDTO score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Description of the event
   * @return score
  **/
  @ApiModelProperty(required = true, value = "Description of the event")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public EventInputDTO applicationType(String applicationType) {
    this.applicationType = applicationType;
    return this;
  }

   /**
   * Description of the type of the application using the gamification platform
   * @return applicationType
  **/
  @ApiModelProperty(value = "Description of the type of the application using the gamification platform")
  public String getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInputDTO eventInputDTO = (EventInputDTO) o;
    return Objects.equals(this.name, eventInputDTO.name) &&
        Objects.equals(this.description, eventInputDTO.description) &&
        Objects.equals(this.score, eventInputDTO.score) &&
        Objects.equals(this.applicationType, eventInputDTO.applicationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, score, applicationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
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

