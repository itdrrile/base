/**
 * jdk自带webservice：JAX-WS（Java API for XML Web Services），简写为JWS；支持基于SOAP协议、基于REST风格；1.x版本称为JAX-RPC，2.x版本称为JAX-WS
 * 	1、服务端
 * 		（1）定义服务端点接口：SEI（Service Endpoint Interface） --> 声明Web服务需要完成或实现的业务方法
 * 		（2）服务实现Bean：SIB（Service Implementation Bean） --> 可以是一个POJO或一个无状态会话EJB
 * 		（3）部署发布
 * 			1）jdk提供的应用程序包直接部署发布
 * 			2）使用tomcat、glassFish等中间件进行部署发布
 * 	2、客户端
 * 
 * 
 */
/**
 * @author itdrrile
 *
 */
/**
 * javax.jws.WebService
 * @Retention(value=RUNTIME) 运行时解析
 * @Target(value=TYPE) 标注在type类型（类、接口（包括注释类型）或枚举声明）
 * public @interface WebService
 * （1）标注在接口上：定义一个webservice接口
 * （2）标注在类上：webservice的一个实现类
 * （3）属性
 * 	1）name：
 * 		Web Service的名称。当映射到 WSDL 1.1 时，该名称被用作 wsdl:portType的名称。
 * 		默认值""
 * 	2）targetNamespace：
 * 		如果 @WebService.targetNamespace注释是关于某一服务端点接口的，则 targetNamespace用于 wsdl:portType（以及关联的 XML元素）的名称空间。
 * 		如果 @WebService.targetNamespace注释是关于某个没有引用服务端点接口（通过 endpointInterface属性）的服务实现 bean的，则 targetNamespace既可以用于 wsdl:portType也可以用于 wsdl:service（以及关联的 XML元素）。
 * 		如果 @WebService.targetNamespace注释是关于某个引用服务端点接口（通过 endpointInterface属性）的服务实现 bean的，则 targetNamespace仅用于 wsdl:service（以及关联的 XML元素）。
 * 		默认值""
 * 	3）serviceName：
 * 		Web Service的服务名称。当映射到 WSDL 1.1 时，此名称被用作 wsdl:service的名称。
 * 		不允许在端点接口上使用此成员值。
 * 		默认值""
 * 	4）portName：
 * 		Web Service的端口名称。当映射到 WSDL 1.1 时，此名称被用作 wsdl:port的名称。
 * 		不允许在端点接口上使用此成员值。
 * 		默认值""
 * 	5）wsdlLocation：
 * 		描述服务的预定义 WSDL的位置。
 * 		wsdlLocation是引用预先存在的 WSDL文件的 URL（相对或绝对）。wsdlLocation值的存在指示服务实现 bean将实现预先定义的 WSDL协定。如果服务实现 bean与此 WSDL中声明的 portType和绑定不一致，则 JSR-181工具必须提供反馈。注意，单个 WSDL文件可能包含多个 portType和多个绑定。服务实现 bean上的注释确定对应于 Web Service的特定 portType和绑定。
 * 		默认值""
 * 	6）endpointInterface：
 * 		定义服务抽象 Web Service协定的服务端点接口的完整名称。
 * 		此注释允许开发人员将接口协定与实现分离。如果此注释存在，则使用服务端点接口来确定抽象 WSDL协定（portType和绑定）。服务端点接口可以包含用来定制Java到WSDL的映射关系的JSR-181注释。
 * 		服务实现 bean可以实现服务端点接口，但并不要求这样做。
 * 		如果此成员值不存在，则 Web Service协定是根据服务实现 bean上的注释生成的。如果目标环境需要一个服务端点接口，则将生成一个由实现定义的包，该包具有由实现定义的名称。
 * 		不允许在端点接口上使用此成员值。
 * 		默认值""
 */
package drrile.webservice.jdk;
