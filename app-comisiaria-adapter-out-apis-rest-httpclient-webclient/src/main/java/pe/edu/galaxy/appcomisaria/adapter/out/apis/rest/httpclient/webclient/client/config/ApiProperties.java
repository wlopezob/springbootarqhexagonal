package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties
public class ApiProperties {

  @Value("${api_comisaria.url_dpto}")
  private String dptoUrl;

  @Value("${api_comisaria.url_prov}")
  private String provUrl;

  @Value("${api_comisaria.url_dist}")
  private String distUrl;

  @Value("${api_comisaria.url_comisaria_count}")
  private String comisariaCountUrl;

  @Value("${api_comisaria.url_comisaria}")
  private String comisariaUrl;

  @Value("${api_comisaria.host}")
  private String host;

  @Value("${api_comisaria.origin}")
  private String origin;
}
