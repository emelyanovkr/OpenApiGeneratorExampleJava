package com.fidd.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * UserCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
public class UserCreateRequest implements Serializable
{

  private static final long serialVersionUID = 1L;

  private String name;

  private String email;

  public UserCreateRequest()
  {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserCreateRequest(String name, String email)
  {
    this.name = name;
    this.email = email;
  }

  public UserCreateRequest name(String name)
  {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @NotNull
  @Schema(name = "name", example = "Ivan Petrov", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public UserCreateRequest email(String email)
  {
    this.email = email;
    return this;
  }

  /**
   * Get email
   *
   * @return email
   */
  @NotNull
  @Schema(name = "email", example = "ivan@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
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
    UserCreateRequest userCreateRequest = (UserCreateRequest) o;
    return Objects.equals(this.name, userCreateRequest.name) &&
      Objects.equals(this.email, userCreateRequest.email);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, email);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

