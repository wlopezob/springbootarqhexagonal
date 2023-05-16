package pe.edu.galaxy.appcomisaria.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.comisaria.ComisariaRestControllerImpl;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.departamento.DepartamentoRestControllerImpl;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.distrito.DistritoRestControllerImpl;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.provincia.ProvinciaRestControllerImpl;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.ComisariaResponseMapper;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.DepartamentoResponseMapper;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.DistritoResponseMapper;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.ProvinciaResponseMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.ComisariaWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.DepartamentoWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.DistritoWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.ProvinciaWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.comisaria.ComisariaWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.departamento.DepartamentoWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.distrito.DistritoWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.provincia.ProvinciaWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.ComisariaWebClientMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.DepartamentoWebClientMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.DistritoWebClientMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.ProvinciaWebClientMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.ComisariaMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.DepartamentoMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.DistritoMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.ProvinciaMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.ComisariaMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.DepartamentoMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.DistritoMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.ProvinciaMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.ComisariaMysqlRepository;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.DepartamentoMysqlRepository;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.DistritoMysqlRepository;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.ProvinciaMysqlRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaCountCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaInsertAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoInsertAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoInsertAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaInsertAllPort;
import pe.edu.galaxy.appcomisaria.application.services.ComisariaService;
import pe.edu.galaxy.appcomisaria.application.services.DepartamentoService;
import pe.edu.galaxy.appcomisaria.application.services.DistritoService;
import pe.edu.galaxy.appcomisaria.application.services.ProvinciaService;

@Configuration
public class GlobalConfiguration {

  @Bean
  DepartamentoRestControllerImpl departamentoRestControllerImpl(DepartamentoService departamentoService,
                                                                DepartamentoResponseMapper mapper) {
    return new DepartamentoRestControllerImpl(departamentoService, mapper);
  }

  @Bean
  DepartamentoService departamentoService(DepartamentoDeleteAllPort departamentoDeleteAllPort,
                                          DepartamentoInsertAllPort departamentoInsertAllPort,
                                          DepartamentoGetAllCallApiPort departamentoGetAllCallApiPort) {
    return new DepartamentoService(departamentoDeleteAllPort, departamentoInsertAllPort,
      departamentoGetAllCallApiPort);
  }

  @Bean
  DepartamentoMysqlAdapter departamentoMysqlAdapter(DepartamentoMysqlRepository departamentoMysqlRepository,
                                                    DepartamentoMysqlMapper departamentoMapper) {
    return new DepartamentoMysqlAdapter(departamentoMysqlRepository, departamentoMapper);
  }

  @Bean
  DepartamentoWebClientAdapter departamentoWebClientAdapter(DepartamentoWebClient departamentoWebClient,
                                                            DepartamentoWebClientMapper mapper) {
    return new DepartamentoWebClientAdapter(departamentoWebClient, mapper);
  }

  @Bean
  ProvinciaRestControllerImpl provinciaRestControllerImpl(ProvinciaService provinciaService,
                                                          ProvinciaResponseMapper mapper) {
    return new ProvinciaRestControllerImpl(provinciaService, mapper);
  }

  @Bean
  ProvinciaService provinciaService(ProvinciaGetAllCallApiPort provinciaGetAllCallApiPort,
                                    ProvinicaDeleteAllPort provinicaDeleteAllPort,
                                    DepartamentoGetAllPort departamentoGetAllPort,
                                    ProvinicaInsertAllPort provinicaInsertAllPort) {
    return new ProvinciaService(provinciaGetAllCallApiPort,
      provinicaDeleteAllPort, departamentoGetAllPort, provinicaInsertAllPort);
  }

  @Bean
  ProvinciaMysqlAdapter provinciaMysqlAdapter(ProvinciaMysqlRepository provinciaMysqlRepository,
                                              ProvinciaMysqlMapper provinciaMysqlMapper) {
    return new ProvinciaMysqlAdapter(provinciaMysqlRepository, provinciaMysqlMapper);
  }

  @Bean
  ProvinciaWebClientAdapter provinciaWebClientAdapter(ProvinciaWebClient provinciaWebClient,
                                                      ProvinciaWebClientMapper mapper) {
    return new ProvinciaWebClientAdapter(provinciaWebClient, mapper);
  }

  @Bean
  DistritoRestControllerImpl distritoRestControllerImpl(DistritoService distritoService,
                                                    DistritoResponseMapper mapper) {
    return new DistritoRestControllerImpl(distritoService, mapper);
  }

  @Bean
  DistritoService distritoService(DistritoGetAllCallApiPort distritoGetAllCallApiPort,
                                  DistritoDeleteAllPort distritoDeleteAllPort,
                                  DistritoInsertAllPort distritoInsertAllPort,
                                  ProvinciaGetAllPort provinciaGetAllPort) {
    return new DistritoService(distritoGetAllCallApiPort,
      distritoDeleteAllPort, distritoInsertAllPort, provinciaGetAllPort);
  }

  @Bean
  DistritoMysqlAdapter distritoMysqlMapper(DistritoMysqlRepository distritoMysqlRepository,
                                           DistritoMysqlMapper distritoMapper) {
    return new DistritoMysqlAdapter(distritoMysqlRepository, distritoMapper);
  }


  @Bean
  DistritoWebClientAdapter distritoWebClientAdapter(DistritoWebClient distritoWebClient,
                                                    DistritoWebClientMapper mapper) {
    return new DistritoWebClientAdapter(distritoWebClient, mapper);
  }

  @Bean
  ComisariaRestControllerImpl comisariaRestControllerImpl(ComisariaService distritoService,
                                                      ComisariaResponseMapper mapper) {
    return new ComisariaRestControllerImpl(distritoService, mapper);
  }

  @Bean
  ComisariaService comisariaService(ComisariaCountCallApiPort comisariaCountCallApiPort,
                                    ComisariaDeleteAllPort comisariaDeleteAllPort,
                                    ComisariaGetAllCallApiPort comisariaGetAllCallApiPort,
                                    ComisariaInsertAllPort comisariaInsertAllPort) {
    return new ComisariaService(comisariaCountCallApiPort, comisariaDeleteAllPort,
      comisariaGetAllCallApiPort, comisariaInsertAllPort);
  }

  @Bean
  ComisariaMysqlAdapter comisariaMysqlAdapter(ComisariaMysqlRepository comisariaMysqlRepository,
                                              ComisariaMysqlMapper comisariaMysqlMapper) {
    return new ComisariaMysqlAdapter(comisariaMysqlRepository, comisariaMysqlMapper);
  }

  @Bean
  ComisariaWebClientAdapter comisariaWebClientAdapter(ComisariaWebClient comisariaWebClient,
                                                      ComisariaWebClientMapper mapper) {
    return new ComisariaWebClientAdapter(comisariaWebClient, mapper);
  }
}
