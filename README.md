Github discussion: https://github.com/Netflix/dgs-framework/discussions/2246

# To reproduce

```shell
./gradlew clean build

./gradlew :hello-app:bootRun
```


```log
2025-12-15T17:27:47.264+01:00  WARN 31236 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'routerFunctionMapping' defined in class path resource [org/springframework/boot/autoconfigure/web/servlet/WebMvcAutoConfiguration$EnableWebMvcConfiguration.class]: Error creating bean with name 'graphQlRouterFunction' defined in class path resource [org/springframework/boot/autoconfigure/graphql/servlet/GraphQlWebMvcAutoConfiguration.class]: Unsatisfied dependency expressed through method 'graphQlRouterFunction' parameter 0: Error creating bean with name 'graphQlHttpHandler' defined in class path resource [org/springframework/boot/autoconfigure/graphql/servlet/GraphQlWebMvcAutoConfiguration.class]: Unsatisfied dependency expressed through method 'graphQlHttpHandler' parameter 0: Error creating bean with name 'webGraphQlHandler' defined in class path resource [org/springframework/boot/autoconfigure/graphql/servlet/GraphQlWebMvcAutoConfiguration.class]: Unsatisfied dependency expressed through method 'webGraphQlHandler' parameter 0: Error creating bean with name 'executionGraphQlService' defined in class path resource [org/springframework/boot/autoconfigure/graphql/GraphQlAutoConfiguration.class]: Failed to instantiate [org.springframework.graphql.ExecutionGraphQlService]: Factory method 'executionGraphQlService' threw exception with message: errors=[There is no scalar implementation for the named  'Year' scalar type]
Related cause: org.springframework.beans.factory.BeanCurrentlyInCreationException: Error creating bean with name 'viewResolver': Requested bean is currently in creation: Is there an unresolvable circular reference or an asynchronous initialization dependency?
2025-12-15T17:27:47.266+01:00  INFO 31236 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-12-15T17:27:47.278+01:00  INFO 31236 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-12-15T17:27:47.290+01:00 ERROR 31236 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

There are problems with the GraphQL Schema:
         * There is no scalar implementation for the named  'Year' scalar type
         ```