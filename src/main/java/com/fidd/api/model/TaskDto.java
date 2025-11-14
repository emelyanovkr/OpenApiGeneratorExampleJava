package com.fidd.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TaskDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class TaskDto implements Serializable
{

  private static final long serialVersionUID = 1L;

  private @Nullable Integer id;

  private @Nullable String title;

  private @Nullable String description;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum
  {
    TODO("TODO"),

    IN_PROGRESS("IN_PROGRESS"),

    DONE("DONE");

    private final String value;

    StatusEnum(String value)
    {
      this.value = value;
    }

    @JsonValue
    public String getValue()
    {
      return value;
    }

    @Override
    public String toString()
    {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value)
    {
      for (StatusEnum b : StatusEnum.values())
      {
        if (b.value.equals(value))
        {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public TaskDto id(@Nullable Integer id)
  {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */

  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Integer getId()
  {
    return id;
  }

  public void setId(@Nullable Integer id)
  {
    this.id = id;
  }

  public TaskDto title(@Nullable String title)
  {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */

  @Schema(name = "title", example = "Implement API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle()
  {
    return title;
  }

  public void setTitle(@Nullable String title)
  {
    this.title = title;
  }

  public TaskDto description(@Nullable String description)
  {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */

  @Schema(name = "description", example = "Implement backend endpoints for user management", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription()
  {
    return description;
  }

  public void setDescription(@Nullable String description)
  {
    this.description = description;
  }

  public TaskDto status(@Nullable StatusEnum status)
  {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */

  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus()
  {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status)
  {
    this.status = status;
  }

  public TaskDto createdAt(@Nullable OffsetDateTime createdAt)
  {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @Valid
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public @Nullable OffsetDateTime getCreatedAt()
  {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt)
  {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    TaskDto taskDto = (TaskDto) o;
    return Objects.equals(this.id, taskDto.id) &&
      Objects.equals(this.title, taskDto.title) &&
      Objects.equals(this.description, taskDto.description) &&
      Objects.equals(this.status, taskDto.status) &&
      Objects.equals(this.createdAt, taskDto.createdAt);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, title, description, status, createdAt);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o)
  {
    if (o == null)
    {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

