package com.myapp.demo.filters;

import com.myapp.demo.utils.Utils;
import java.io.IOException;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import com.myapp.demo.utils.Constants;

@Slf4j
@Provider
public class RequestContextFilter implements ContainerRequestFilter {

  private static final String QUERY_PARAM_SABS = "sabs";
  private static final String QUERY_PARAM_LATS = "lats";

  @Context
  HttpServletRequest httpServletRequest;

  @Override
  public void filter(ContainerRequestContext requestContext) throws IOException {

    final MultivaluedMap<String, String> queryParams = requestContext.getUriInfo().getQueryParameters();
    String lats = queryParams.getFirst(QUERY_PARAM_LATS);
    String sabs = queryParams.getFirst(QUERY_PARAM_SABS);
    if (!StringUtils.isBlank(lats)) {
      Set<String> languageList = Utils.convertCommaSeparatedStringToList(lats);
      requestContext.setProperty(Constants.REQUEST_CONTEXT_PROP_LATS, languageList);
      log.info("Language list for the request set to {}", languageList);
    }
    if (!StringUtils.isBlank(sabs)) {
      Set<String> sabList = Utils.convertCommaSeparatedStringToList(sabs);
      requestContext.setProperty(Constants.REQUEST_CONTEXT_PROP_SABS, sabList);
      log.info("Source vocab list for the request set to {}", sabList);
    }
  }
}
