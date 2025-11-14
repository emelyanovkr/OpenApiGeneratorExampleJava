package com.fidd.api.controller;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.16.0")
@Controller
@RequestMapping("${openapi.userManagement.base-path:}")
public class UserApiController implements UserApi
{

  private final NativeWebRequest request;

  @Autowired
  public UserApiController(NativeWebRequest request)
  {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest()
  {
    return Optional.ofNullable(request);
  }

}
