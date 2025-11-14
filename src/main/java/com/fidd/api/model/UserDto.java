package com.fidd.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * UserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class UserDto implements Serializable
{

  private static final long serialVersionUID = 1L;

  private @Nullable Integer id;

  private @Nullable String name;

  private @Nullable String email;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public UserDto id(@Nullable Integer id)
  {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */

  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Integer getId()
  {
    return id;
  }

  public void setId(@Nullable Integer id)
  {
    this.id = id;
  }

  public UserDto name(@Nullable String name)
  {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */

  @Schema(name = "name", example = "Ivan Petrov", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName()
  {
    return name;
  }

  public void setName(@Nullable String name)
  {
    this.name = name;
  }

  public UserDto email(@Nullable String email)
  {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   */

  @Schema(name = "email", example = "ivan@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail()
  {
    return email;
  }

  public void setEmail(@Nullable String email)
  {
    this.email = email;
  }

  public UserDto createdAt(@Nullable OffsetDateTime createdAt)
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
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.id, userDto.id) &&
      Objects.equals(this.name, userDto.name) &&
      Objects.equals(this.email, userDto.email) &&
      Objects.equals(this.createdAt, userDto.createdAt);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, name, email, createdAt);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

