1> cmd> mvn clean install

2> cmd> docker-compose up --build

[+] Building 2.5s (10/10) FINISHED
 => [internal] load local bake definitions                                                                                                                                 0.0s
 => => reading from stdin 761B                                                                                                                                             0.0s
 => [internal] load build definition from Dockerfile                                                                                                                       0.0s
 => => transferring dockerfile: 284B                                                                                                                                       0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-jammy                                                                                            0.8s
 => [internal] load .dockerignore                                                                                                                                          0.0s
 => => transferring context: 2B                                                                                                                                            0.0s
 => [1/3] FROM docker.io/library/eclipse-temurin:21-jdk-jammy@sha256:41c8a289jjhjh1j81fc7973c9a98bfbbbd6336eb1e32e673b1718d99c                                      0.0s
 => => resolve docker.io/library/eclipse-temurin:21-jdk-jammy@sha256:41c8a28993a03918918918918998bfbbbd6336eb1e32e673b1718d99c                                      0.0s
 => [internal] load build context                                                                                                                                          0.3s
 => => transferring context: 54.37MB                                                                                                                                       0.3s
 => CACHED [2/3] WORKDIR /Spring-Boot-Mongodb-Containers-Communication-Example                                                                                             0.0s
 => [3/3] COPY target/*.jar app.jar                                                                                                                                        0.1s
 => exporting to image                                                                                                                                                     1.1s
 => => exporting layers                                                                                                                                                    0.9s
 => => exporting manifest sha256:00b02f8b58d34f7877722677f1256829d61bc1cf7c7acd69199108de6c14e55b2d                                                                          0.0s
=> => exporting manifest list sha256:c3523cbfde1ce7676178690ea950e7005c440add70d4ef8521469cb16783ed                                                                     0.0s
 => => naming to docker.io/library/spring-boot-mongodb-containers-communication-example-springboot-app:latest                                                              0.0s
 => => unpacking to docker.io/library/spring-boot-mongodb-containers-communication-example-springboot-app:latest                                                           0.2s
 => resolving provenance for metadata file                                                                                                                                 0.0s
[+] Running 2/2
 ✔ spring-boot-mongodb-containers-communication-example-springboot-app  Built                                                                                              0.0s
 ✔ Container springboot-app                                             Recreated                                                                                          0.1s
Attaching to postgres-db, springboot-app
postgres-db  |
postgres-db  | PostgreSQL Database directory appears to contain a database; Skipping initialization
postgres-db  |
postgres-db  | 2026-01-22 17:04:17.286 UTC [1] LOG:  starting PostgreSQL 16.11 (Debian 16.11-1.pgdg13+1) on aarch64-unknown-linux-gnu, compiled by gcc (Debian 14.2.0-19) 14.2.0, 64-bit
postgres-db  | 2026-01-22 17:04:17.286 UTC [1] LOG:  listening on IPv4 address "0.0.0.0", port 5432
postgres-db  | 2026-01-22 17:04:17.286 UTC [1] LOG:  listening on IPv6 address "::", port 5432
postgres-db  | 2026-01-22 17:04:17.287 UTC [1] LOG:  listening on Unix socket "/var/run/postgresql/.s.PGSQL.5432"
postgres-db  | 2026-01-22 17:04:17.289 UTC [29] LOG:  database system was shut down at 2026-01-22 17:04:12 UTC
postgres-db  | 2026-01-22 17:04:17.291 UTC [1] LOG:  database system is ready to accept connections
springboot-app  |
springboot-app  |   .   ____          _            __ _ _
springboot-app  |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
springboot-app  | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
springboot-app  |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
springboot-app  |   '  |____| .__|_| |_|_| |_\__, | / / / /
springboot-app  |  =========|_|==============|___/=/_/_/_/
springboot-app  |
springboot-app  |  :: Spring Boot ::                (v4.0.1)
springboot-app  |
springboot-app  | 2026-01-22T17:04:23.256Z  INFO 1 --- [           main] ontainersCommunicationExampleApplication : Starting SpringBootMongodbContainersCommunicationExampleApplication v0.0.1-SNAPSHOT using Java 21.0.9 with PID 1 (/Spring-Boot-Mongodb-Containers-Communication-Example/app.jar started by root in /Spring-Boot-Mongodb-Containers-Communication-Example)
springboot-app  | 2026-01-22T17:04:23.258Z  INFO 1 --- [           main] ontainersCommunicationExampleApplication : No active profile set, falling back to 1 default profile: "default"
springboot-app  | 2026-01-22T17:04:23.508Z  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
springboot-app  | 2026-01-22T17:04:23.527Z  INFO 1 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 15 ms. Found 1 JPA repository interface.
springboot-app  | 2026-01-22T17:04:23.699Z  INFO 1 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
springboot-app  | 2026-01-22T17:04:23.705Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
springboot-app  | 2026-01-22T17:04:23.705Z  INFO 1 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.15]
springboot-app  | 2026-01-22T17:04:23.716Z  INFO 1 --- [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 434 ms
springboot-app  | 2026-01-22T17:04:23.782Z  INFO 1 --- [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
springboot-app  | 2026-01-22T17:04:23.802Z  INFO 1 --- [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.0.Final
springboot-app  | 2026-01-22T17:04:23.972Z  INFO 1 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
springboot-app  | 2026-01-22T17:04:23.985Z  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
springboot-app  | 2026-01-22T17:04:24.061Z  INFO 1 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@6f1d799
springboot-app  | 2026-01-22T17:04:24.061Z  INFO 1 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
springboot-app  | 2026-01-22T17:04:24.090Z  INFO 1 --- [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
springboot-app  |       Database JDBC URL [jdbc:postgresql://postgres-db:5432/mydatabase]
springboot-app  |       Database driver: PostgreSQL JDBC Driver
springboot-app  |       Database dialect: PostgreSQLDialect
springboot-app  |       Database version: 16.11
springboot-app  |       Default catalog/schema: mydatabase/public
springboot-app  |       Autocommit mode: undefined/unknown
springboot-app  |       Isolation level: READ_COMMITTED [default READ_COMMITTED]
springboot-app  |       JDBC fetch size: none
springboot-app  |       Pool: DataSourceConnectionProvider
springboot-app  |       Minimum pool size: undefined/unknown
springboot-app  |       Maximum pool size: undefined/unknown
springboot-app  | 2026-01-22T17:04:24.381Z  INFO 1 --- [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
springboot-app  | Hibernate:
springboot-app  |     create sequence subscribers_seq start with 1 increment by 50
springboot-app  | 2026-01-22T17:04:24.400Z  INFO 1 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
springboot-app  | 2026-01-22T17:04:24.441Z  INFO 1 --- [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
springboot-app  | 2026-01-22T17:04:24.485Z  WARN 1 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
springboot-app  | 2026-01-22T17:04:24.613Z  INFO 1 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
springboot-app  | 2026-01-22T17:04:24.616Z  INFO 1 --- [           main] ontainersCommunicationExampleApplication : Started SpringBootMongodbContainersCommunicationExampleApplication in 1.553 seconds (process running for 1.753)
springboot-app  | POSTGRES JDBC URL: jdbc:postgresql://postgres-db:5432/mydatabase
springboot-app  | 2026-01-22T17:04:37.884Z  INFO 1 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
springboot-app  | 2026-01-22T17:04:37.884Z  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
springboot-app  | 2026-01-22T17:04:37.885Z  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         nextval('subscribers_seq')
springboot-app  | Hibernate:
springboot-app  |     insert
springboot-app  |     into
springboot-app  |         subscribers
springboot-app  |         (email, name, id)
springboot-app  |     values
springboot-app  |         (?, ?, ?)
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         nextval('subscribers_seq')
springboot-app  | Hibernate:
springboot-app  |     insert
springboot-app  |     into
springboot-app  |         subscribers
springboot-app  |         (email, name, id)
springboot-app  |     values
springboot-app  |         (?, ?, ?)
springboot-app  | Hibernate:
springboot-app  |     insert
springboot-app  |     into
springboot-app  |         subscribers
springboot-app  |         (email, name, id)
springboot-app  |     values
springboot-app  |         (?, ?, ?)
springboot-app  | Hibernate:
springboot-app  |     insert
springboot-app  |     into
springboot-app  |         subscribers
springboot-app  |         (email, name, id)
springboot-app  |     values
springboot-app  |         (?, ?, ?)
springboot-app  | 2026-01-22T17:06:09.094Z  WARN 1 --- [nio-8080-exec-6] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'POST' is not supported]
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
postgres-db     | 2026-01-22 17:09:17.394 UTC [27] LOG:  checkpoint starting: time
postgres-db     | 2026-01-22 17:09:19.603 UTC [27] LOG:  checkpoint complete: wrote 24 buffers (0.1%); 0 WAL file(s) added, 0 removed, 0 recycled; write=2.200 s, sync=0.006 s, total=2.210 s; sync files=19, longest=0.004 s, average=0.001 s; distance=51 kB, estimate=51 kB; lsn=0/1994468, redo lsn=0/1994430
springboot-app  | 2026-01-22T17:09:19.951Z  WARN 1 --- [nio-8080-exec-3] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Unexpected character ('{' (code 123)): was expecting double-quote to start property name]
springboot-app  | Hibernate:
springboot-app  |     select
springboot-app  |         s1_0.id,
springboot-app  |         s1_0.email,
springboot-app  |         s1_0.name
springboot-app  |     from
springboot-app  |         subscribers s1_0
springboot-app  |     where
springboot-app  |         s1_0.id=?
springboot-app  | Hibernate:
springboot-app  |     update
springboot-app  |         subscribers
springboot-app  |     set
springboot-app  |         email=?,
springboot-app  |         name=?
springboot-app  |     where
springboot-app  |         id=?
