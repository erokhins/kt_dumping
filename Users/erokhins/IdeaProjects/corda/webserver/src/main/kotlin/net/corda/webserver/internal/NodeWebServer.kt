'loggerFor' @ [34:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeWebServer

'config' @ [38:19] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'webAddress' @ [38:26] ==> public final val webAddress: NetworkHostAndPort defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'logAndMaybePrint' @ [43:9] ==> public final fun logAndMaybePrint(description: String, info: String? = ...): Unit defined in net.corda.webserver.internal.NodeWebServer[SimpleFunctionDescriptorImpl]

'config' @ [43:52] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'webAddress' @ [43:59] ==> public final val webAddress: NetworkHostAndPort defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'server' @ [44:9] ==> private final lateinit var server: Server defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'initWebServer' @ [44:18] ==> private final fun initWebServer(localRpc: CordaRPCOps): Server defined in net.corda.webserver.internal.NodeWebServer[SimpleFunctionDescriptorImpl]

'retryConnectLocalRpc' @ [44:32] ==> private final fun retryConnectLocalRpc(): CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer[SimpleFunctionDescriptorImpl]

'server' @ [48:16] ==> private final lateinit var server: Server defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'isRunning' @ [48:23] ==> public final val Server.isRunning: Boolean[MyPropertyDescriptor]

'sleep' @ [49:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'HandlerCollection' @ [55:33] ==> public constructor HandlerCollection() defined in org.eclipse.jetty.server.handler.HandlerCollection[JavaClassConstructorDescriptor]

'config' @ [58:13] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'exportJMXto' @ [58:20] ==> public final val exportJMXto: String defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'split' @ [58:32] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'contains' @ [58:43] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [59:36] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'split' @ [59:67] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [59:80] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'classpath' @ [60:27] ==> val classpath: List<String> defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'firstOrNull' @ [60:37] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [60:51] ==> value-parameter it: String defined in net.corda.webserver.internal.NodeWebServer.initWebServer.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [60:54] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [60:89] ==> value-parameter it: String defined in net.corda.webserver.internal.NodeWebServer.initWebServer.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [60:92] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (warpath != null) {
                handlerCollection.addHandler(WebAppContext().apply {
                    // Find the jolokia WAR file on the classpath.
                    contextPath = "/monitoring/json"
                    setInitParameter("mimeType", MediaType.APPLICATION_JSON)
                    war = warpath
                })
            } else {
                log.warn("Unable to locate Jolokia WAR on classpath")
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'warpath' @ [61:17] ==> val warpath: String? defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'handlerCollection' @ [62:17] ==> val handlerCollection: HandlerCollection defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'addHandler' @ [62:35] ==> public open fun addHandler(p0: (Handler..Handler?)): Unit defined in org.eclipse.jetty.server.handler.HandlerCollection[JavaMethodDescriptor]

'WebAppContext' @ [62:46] ==> public constructor WebAppContext() defined in org.eclipse.jetty.webapp.WebAppContext[JavaClassConstructorDescriptor]

'apply' @ [62:62] ==> @InlineOnly public inline fun <T> WebAppContext.apply(block: WebAppContext.() -> Unit): WebAppContext defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebAppContext

'contextPath' @ [64:21] ==> public final var WebAppContext.contextPath: (String..String?)[MyPropertyDescriptor]

'setInitParameter' @ [65:21] ==> public open fun setInitParameter(p0: (String..String?), p1: (String..String?)): (String..String?) defined in org.eclipse.jetty.webapp.WebAppContext[JavaMethodDescriptor]

'APPLICATION_JSON' @ [65:60] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'war' @ [66:21] ==> public final var WebAppContext.war: (String..String?)[MyPropertyDescriptor]

'warpath' @ [66:27] ==> val warpath: String? defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'log' @ [69:17] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'warn' @ [69:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'handlerCollection' @ [74:9] ==> val handlerCollection: HandlerCollection defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'addHandler' @ [74:27] ==> public open fun addHandler(p0: (Handler..Handler?)): Unit defined in org.eclipse.jetty.server.handler.HandlerCollection[JavaMethodDescriptor]

'buildServletContextHandler' @ [74:38] ==> private final fun buildServletContextHandler(localRpc: CordaRPCOps): ServletContextHandler defined in net.corda.webserver.internal.NodeWebServer[SimpleFunctionDescriptorImpl]

'localRpc' @ [74:65] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.initWebServer[ValueParameterDescriptorImpl]

'Server' @ [76:22] ==> public constructor Server() defined in org.eclipse.jetty.server.Server[JavaClassConstructorDescriptor]

'if (config.useHTTPS) {
            val httpsConfiguration = HttpConfiguration()
            httpsConfiguration.outputBufferSize = 32768
            httpsConfiguration.addCustomizer(SecureRequestCustomizer())
            val sslContextFactory = SslContextFactory()
            sslContextFactory.keyStorePath = config.sslKeystore.toString()
            sslContextFactory.setKeyStorePassword(config.keyStorePassword)
            sslContextFactory.setKeyManagerPassword(config.keyStorePassword)
            sslContextFactory.setTrustStorePath(config.trustStoreFile.toString())
            sslContextFactory.setTrustStorePassword(config.trustStorePassword)
            sslContextFactory.setExcludeProtocols("SSL.*", "TLSv1", "TLSv1.1")
            sslContextFactory.setIncludeProtocols("TLSv1.2")
            sslContextFactory.setExcludeCipherSuites(".*NULL.*", ".*RC4.*", ".*MD5.*", ".*DES.*", ".*DSS.*")
            sslContextFactory.setIncludeCipherSuites(".*AES.*GCM.*")
            val sslConnector = ServerConnector(server, SslConnectionFactory(sslContextFactory, "http/1.1"), HttpConnectionFactory(httpsConfiguration))
            sslConnector.port = address.port
            sslConnector
        } else {
            val httpConfiguration = HttpConfiguration()
            httpConfiguration.outputBufferSize = 32768
            val httpConnector = ServerConnector(server, HttpConnectionFactory(httpConfiguration))
            httpConnector.port = address.port
            httpConnector
        }' @ [78:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ServerConnector, elseBranch: ServerConnector): ServerConnector[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ServerConnector

'config' @ [78:29] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'useHTTPS' @ [78:36] ==> public final val useHTTPS: Boolean defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'HttpConfiguration' @ [79:38] ==> public constructor HttpConfiguration() defined in org.eclipse.jetty.server.HttpConfiguration[JavaClassConstructorDescriptor]

'httpsConfiguration' @ [80:13] ==> val httpsConfiguration: HttpConfiguration defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'outputBufferSize' @ [80:32] ==> public final var HttpConfiguration.outputBufferSize: Int[MyPropertyDescriptor]

'httpsConfiguration' @ [81:13] ==> val httpsConfiguration: HttpConfiguration defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'addCustomizer' @ [81:32] ==> public open fun addCustomizer(p0: (HttpConfiguration.Customizer..HttpConfiguration.Customizer?)): Unit defined in org.eclipse.jetty.server.HttpConfiguration[JavaMethodDescriptor]

'SecureRequestCustomizer' @ [81:46] ==> public constructor SecureRequestCustomizer() defined in org.eclipse.jetty.server.SecureRequestCustomizer[JavaClassConstructorDescriptor]

'SslContextFactory' @ [82:37] ==> public constructor SslContextFactory() defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaClassConstructorDescriptor]

'sslContextFactory' @ [83:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'keyStorePath' @ [83:31] ==> public final var SslContextFactory.keyStorePath: (String..String?)[MyPropertyDescriptor]

'config' @ [83:46] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'sslKeystore' @ [83:53] ==> public open val sslKeystore: Path defined in net.corda.webserver.WebServerConfig[DeserializedPropertyDescriptor]

'toString' @ [83:65] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'sslContextFactory' @ [84:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setKeyStorePassword' @ [84:31] ==> public open fun setKeyStorePassword(p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'config' @ [84:51] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'keyStorePassword' @ [84:58] ==> public open val keyStorePassword: String defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'sslContextFactory' @ [85:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setKeyManagerPassword' @ [85:31] ==> public open fun setKeyManagerPassword(p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'config' @ [85:53] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'keyStorePassword' @ [85:60] ==> public open val keyStorePassword: String defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'sslContextFactory' @ [86:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setTrustStorePath' @ [86:31] ==> public open fun setTrustStorePath(p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'config' @ [86:49] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'trustStoreFile' @ [86:56] ==> public open val trustStoreFile: Path defined in net.corda.webserver.WebServerConfig[DeserializedPropertyDescriptor]

'toString' @ [86:71] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'sslContextFactory' @ [87:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setTrustStorePassword' @ [87:31] ==> public open fun setTrustStorePassword(p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'config' @ [87:53] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'trustStorePassword' @ [87:60] ==> public open val trustStorePassword: String defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'sslContextFactory' @ [88:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setExcludeProtocols' @ [88:31] ==> public open fun setExcludeProtocols(vararg p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'sslContextFactory' @ [89:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setIncludeProtocols' @ [89:31] ==> public open fun setIncludeProtocols(vararg p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'sslContextFactory' @ [90:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setExcludeCipherSuites' @ [90:31] ==> public open fun setExcludeCipherSuites(vararg p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'sslContextFactory' @ [91:13] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'setIncludeCipherSuites' @ [91:31] ==> public open fun setIncludeCipherSuites(vararg p0: (String..String?)): Unit defined in org.eclipse.jetty.util.ssl.SslContextFactory[JavaMethodDescriptor]

'ServerConnector' @ [92:32] ==> public constructor ServerConnector(@Name p0: (Server..Server?), @Name vararg p1: (ConnectionFactory..ConnectionFactory?)) defined in org.eclipse.jetty.server.ServerConnector[JavaClassConstructorDescriptor]

'server' @ [92:48] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'SslConnectionFactory' @ [92:56] ==> public constructor SslConnectionFactory(@Name p0: (SslContextFactory..SslContextFactory?), @Name p1: (String..String?)) defined in org.eclipse.jetty.server.SslConnectionFactory[JavaClassConstructorDescriptor]

'sslContextFactory' @ [92:77] ==> val sslContextFactory: SslContextFactory defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'HttpConnectionFactory' @ [92:109] ==> public constructor HttpConnectionFactory(@Name p0: (HttpConfiguration..HttpConfiguration?)) defined in org.eclipse.jetty.server.HttpConnectionFactory[JavaClassConstructorDescriptor]

'httpsConfiguration' @ [92:131] ==> val httpsConfiguration: HttpConfiguration defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'sslConnector' @ [93:13] ==> val sslConnector: ServerConnector defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'port' @ [93:26] ==> public final var ServerConnector.port: Int[MyPropertyDescriptor]

'address' @ [93:33] ==> public final val address: NetworkHostAndPort defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'port' @ [93:41] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'sslConnector' @ [94:13] ==> val sslConnector: ServerConnector defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'HttpConfiguration' @ [96:37] ==> public constructor HttpConfiguration() defined in org.eclipse.jetty.server.HttpConfiguration[JavaClassConstructorDescriptor]

'httpConfiguration' @ [97:13] ==> val httpConfiguration: HttpConfiguration defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'outputBufferSize' @ [97:31] ==> public final var HttpConfiguration.outputBufferSize: Int[MyPropertyDescriptor]

'ServerConnector' @ [98:33] ==> public constructor ServerConnector(@Name p0: (Server..Server?), @Name vararg p1: (ConnectionFactory..ConnectionFactory?)) defined in org.eclipse.jetty.server.ServerConnector[JavaClassConstructorDescriptor]

'server' @ [98:49] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'HttpConnectionFactory' @ [98:57] ==> public constructor HttpConnectionFactory(@Name p0: (HttpConfiguration..HttpConfiguration?)) defined in org.eclipse.jetty.server.HttpConnectionFactory[JavaClassConstructorDescriptor]

'httpConfiguration' @ [98:79] ==> val httpConfiguration: HttpConfiguration defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'httpConnector' @ [99:13] ==> val httpConnector: ServerConnector defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'port' @ [99:27] ==> public final var ServerConnector.port: Int[MyPropertyDescriptor]

'address' @ [99:34] ==> public final val address: NetworkHostAndPort defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'port' @ [99:42] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'httpConnector' @ [100:13] ==> val httpConnector: ServerConnector defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'server' @ [102:9] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'connectors' @ [102:16] ==> public final var Server.connectors: (Array<(Connector..Connector?)>..Array<out (Connector..Connector?)>?)[MyPropertyDescriptor]

'arrayOf' @ [102:29] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Connector): Array<Connector> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Connector

'connector' @ [102:48] ==> val connector: ServerConnector defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'server' @ [104:9] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'handler' @ [104:16] ==> public final var Server.handler: (Handler..Handler?)[MyPropertyDescriptor]

'handlerCollection' @ [104:26] ==> val handlerCollection: HandlerCollection defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'server' @ [105:9] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'start' @ [105:16] ==> public final fun start(): Unit defined in org.eclipse.jetty.server.Server[JavaMethodDescriptor]

'log' @ [106:9] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'info' @ [106:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'address' @ [106:50] ==> public final val address: NetworkHostAndPort defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'server' @ [107:16] ==> val server: Server defined in net.corda.webserver.internal.NodeWebServer.initWebServer[LocalVariableDescriptor]

'htmlEscaper' @ [111:29] ==> public open fun htmlEscaper(): (Escaper..Escaper?) defined in com.google.common.html.HtmlEscapers[JavaMethodDescriptor]

'escape' @ [111:43] ==> public abstract fun escape(p0: (String..String?)): (String..String?) defined in com.google.common.escape.Escaper[JavaMethodDescriptor]

'config' @ [111:50] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'myLegalName' @ [111:57] ==> public final val myLegalName: String defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'ServletContextHandler' @ [112:16] ==> public constructor ServletContextHandler() defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaClassConstructorDescriptor]

'apply' @ [112:40] ==> @InlineOnly public inline fun <T> ServletContextHandler.apply(block: ServletContextHandler.() -> Unit): ServletContextHandler defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServletContextHandler

'contextPath' @ [113:13] ==> public final var ServletContextHandler.contextPath: (String..String?)[MyPropertyDescriptor]

'errorHandler' @ [114:13] ==> public final var ServletContextHandler.errorHandler: (ErrorHandler..ErrorHandler?)[MyPropertyDescriptor]

'ErrorHandler' @ [114:37] ==> public constructor ErrorHandler() defined in org.eclipse.jetty.server.handler.ErrorHandler[JavaClassConstructorDescriptor]

'Throws' @ [115:17] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [115:25] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'writer' @ [117:21] ==> value-parameter writer: Writer defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageHead[ValueParameterDescriptorImpl]

'write' @ [117:28] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'writer' @ [118:21] ==> value-parameter writer: Writer defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageHead[ValueParameterDescriptorImpl]

'write' @ [118:28] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'safeLegalName' @ [118:49] ==> val safeLegalName: (String..String?) defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[LocalVariableDescriptor]

'code' @ [118:72] ==> value-parameter code: Int defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageHead[ValueParameterDescriptorImpl]

'Throws' @ [121:17] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [121:25] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'writer' @ [123:21] ==> value-parameter writer: Writer defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'write' @ [123:28] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'safeLegalName' @ [123:46] ==> val safeLegalName: (String..String?) defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[LocalVariableDescriptor]

'super' @ [124:21] ==> <this> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'writeErrorPageMessage' @ [124:27] ==> protected/*protected and package*/ open fun writeErrorPageMessage(p0: (HttpServletRequest..HttpServletRequest?), p1: (Writer..Writer?), p2: Int, p3: (String..String?), p4: (String..String?)): Unit defined in org.eclipse.jetty.server.handler.ErrorHandler[JavaMethodDescriptor]

'request' @ [124:49] ==> value-parameter request: HttpServletRequest defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'writer' @ [124:58] ==> value-parameter writer: Writer defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'code' @ [124:66] ==> value-parameter code: Int defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'message' @ [124:72] ==> value-parameter message: String defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'uri' @ [124:81] ==> value-parameter uri: String defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<no name provided>.writeErrorPageMessage[ValueParameterDescriptorImpl]

'setAttribute' @ [127:13] ==> public open fun setAttribute(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'localRpc' @ [127:33] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[ValueParameterDescriptorImpl]

'addServlet' @ [128:13] ==> public open fun addServlet(p0: (Class<out (Servlet..Servlet?)>..Class<out (Servlet..Servlet?)>?), p1: (String..String?)): (ServletHolder..ServletHolder?) defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'DataUploadServlet' @ [128:24] ==> public constructor DataUploadServlet() defined in net.corda.webserver.servlets.DataUploadServlet[ClassConstructorDescriptorImpl]

'java' @ [128:49] ==> public val <T> KClass<DataUploadServlet>.java: Class<DataUploadServlet> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DataUploadServlet

'addServlet' @ [129:13] ==> public open fun addServlet(p0: (Class<out (Servlet..Servlet?)>..Class<out (Servlet..Servlet?)>?), p1: (String..String?)): (ServletHolder..ServletHolder?) defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'AttachmentDownloadServlet' @ [129:24] ==> public constructor AttachmentDownloadServlet() defined in net.corda.webserver.servlets.AttachmentDownloadServlet[ClassConstructorDescriptorImpl]

'java' @ [129:57] ==> public val <T> KClass<AttachmentDownloadServlet>.java: Class<AttachmentDownloadServlet> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AttachmentDownloadServlet

'pluginRegistries' @ [131:35] ==> public final val pluginRegistries: List<WebServerPluginRegistry> defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'fold' @ [131:52] ==> public inline fun <T, R> Iterable<WebServerPluginRegistry>.fold(initial: ObjectMapper, operation: (acc: ObjectMapper, WebServerPluginRegistry) -> ObjectMapper): ObjectMapper defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry
    <R> -> ObjectMapper

'createDefaultMapper' @ [131:72] ==> @JvmStatic @JvmOverloads public final fun createDefaultMapper(rpc: CordaRPCOps, factory: JsonFactory = ..., fuzzyIdentityMatch: Boolean = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

'localRpc' @ [131:92] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[ValueParameterDescriptorImpl]

'plugin' @ [132:17] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'customizeJSONSerialization' @ [132:24] ==> public open fun customizeJSONSerialization(om: ObjectMapper): Unit defined in net.corda.webserver.services.WebServerPluginRegistry[SimpleFunctionDescriptorImpl]

'om' @ [132:51] ==> value-parameter om: ObjectMapper defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'om' @ [133:17] ==> value-parameter om: ObjectMapper defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ResourceConfig' @ [136:34] ==> public constructor ResourceConfig() defined in org.glassfish.jersey.server.ResourceConfig[JavaClassConstructorDescriptor]

'register' @ [137:18] ==> public open fun register(p0: (Any..Any?)): (ResourceConfig..ResourceConfig?) defined in org.glassfish.jersey.server.ResourceConfig[JavaMethodDescriptor]

'ObjectMapperConfig' @ [137:27] ==> public constructor ObjectMapperConfig(defaultObjectMapper: ObjectMapper) defined in net.corda.webserver.servlets.ObjectMapperConfig[ClassConstructorDescriptorImpl]

'rpcObjectMapper' @ [137:46] ==> val rpcObjectMapper: ObjectMapper defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'register' @ [138:18] ==> public open fun register(p0: (Any..Any?)): (ResourceConfig..ResourceConfig?) defined in org.glassfish.jersey.server.ResourceConfig[JavaMethodDescriptor]

'ResponseFilter' @ [138:27] ==> public constructor ResponseFilter() defined in net.corda.webserver.servlets.ResponseFilter[ClassConstructorDescriptorImpl]

'register' @ [139:18] ==> public open fun register(p0: (Any..Any?)): (ResourceConfig..ResourceConfig?) defined in org.glassfish.jersey.server.ResourceConfig[JavaMethodDescriptor]

'APIServerImpl' @ [139:27] ==> public constructor APIServerImpl(rpcOps: CordaRPCOps) defined in net.corda.webserver.internal.APIServerImpl[ClassConstructorDescriptorImpl]

'localRpc' @ [139:41] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[ValueParameterDescriptorImpl]

'pluginRegistries' @ [141:38] ==> public final val pluginRegistries: List<WebServerPluginRegistry> defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'flatMap' @ [141:55] ==> public inline fun <T, R> Iterable<WebServerPluginRegistry>.flatMap(transform: (WebServerPluginRegistry) -> Iterable<Function<CordaRPCOps, out Any>>): List<Function<CordaRPCOps, out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry
    <R> -> Function<CordaRPCOps, out Any>

'x' @ [141:70] ==> value-parameter x: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'webApis' @ [141:72] ==> public open val webApis: List<Function<CordaRPCOps, out Any>> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'webAPIsOnClasspath' @ [142:28] ==> val webAPIsOnClasspath: List<Function<CordaRPCOps, out Any>> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'log' @ [143:17] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'info' @ [143:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'webapi' @ [143:63] ==> val webapi: Function<CordaRPCOps, out Any> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'webapi' @ [145:21] ==> val webapi: Function<CordaRPCOps, out Any> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'apply' @ [145:28] ==> public abstract fun apply(p0: CordaRPCOps): Any defined in java.util.function.Function[JavaMethodDescriptor]

'localRpc' @ [145:34] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[ValueParameterDescriptorImpl]

'log' @ [147:21] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'error' @ [147:25] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'webapi' @ [147:45] ==> val webapi: Function<CordaRPCOps, out Any> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'ex' @ [147:71] ==> val ex: InvocationTargetException defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'targetException' @ [147:74] ==> public final val InvocationTargetException.targetException: (Throwable..Throwable?)[MyPropertyDescriptor]

'resourceConfig' @ [150:17] ==> val resourceConfig: (ResourceConfig..ResourceConfig?) defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'register' @ [150:32] ==> public open fun register(p0: (Any..Any?)): (ResourceConfig..ResourceConfig?) defined in org.glassfish.jersey.server.ResourceConfig[JavaMethodDescriptor]

'customAPI' @ [150:41] ==> val customAPI: Any defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'pluginRegistries' @ [153:33] ==> public final val pluginRegistries: List<WebServerPluginRegistry> defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'map' @ [153:50] ==> public inline fun <T, R> Iterable<WebServerPluginRegistry>.map(transform: (WebServerPluginRegistry) -> Map<String, String>): List<Map<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry
    <R> -> Map<String, String>

'x' @ [153:61] ==> value-parameter x: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'staticServeDirs' @ [153:63] ==> public open val staticServeDirs: Map<String, String> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'staticDirMaps' @ [154:30] ==> val staticDirMaps: List<Map<String, String>> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [154:44] ==> public inline fun <T, R> Iterable<Map<String, String>>.flatMap(transform: (Map<String, String>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, String>
    <R> -> String

'it' @ [154:54] ==> value-parameter it: Map<String, String> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'keys' @ [154:57] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'zip' @ [154:64] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'staticDirMaps' @ [154:68] ==> val staticDirMaps: List<Map<String, String>> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [154:82] ==> public inline fun <T, R> Iterable<Map<String, String>>.flatMap(transform: (Map<String, String>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, String>
    <R> -> String

'it' @ [154:92] ==> value-parameter it: Map<String, String> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [154:95] ==> public abstract val values: Collection<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'staticDirs' @ [155:13] ==> val staticDirs: List<Pair<String, String>> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'forEach' @ [155:24] ==> @HidesMembers public inline fun <T> Iterable<Pair<String, String>>.forEach(action: (Pair<String, String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'ServletHolder' @ [156:33] ==> public constructor ServletHolder(p0: (Class<out (Servlet..Servlet?)>..Class<out (Servlet..Servlet?)>?)) defined in org.eclipse.jetty.servlet.ServletHolder[JavaClassConstructorDescriptor]

'DefaultServlet' @ [156:47] ==> public constructor DefaultServlet() defined in org.eclipse.jetty.servlet.DefaultServlet[JavaClassConstructorDescriptor]

'java' @ [156:69] ==> public val <T> KClass<DefaultServlet>.java: Class<DefaultServlet> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DefaultServlet

'staticDir' @ [157:17] ==> val staticDir: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setInitParameter' @ [157:27] ==> public open fun setInitParameter(p0: (String..String?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletHolder[JavaMethodDescriptor]

'it' @ [157:60] ==> value-parameter it: Pair<String, String> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [157:63] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'staticDir' @ [158:17] ==> val staticDir: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setInitParameter' @ [158:27] ==> public open fun setInitParameter(p0: (String..String?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletHolder[JavaMethodDescriptor]

'staticDir' @ [159:17] ==> val staticDir: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setInitParameter' @ [159:27] ==> public open fun setInitParameter(p0: (String..String?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletHolder[JavaMethodDescriptor]

'addServlet' @ [160:17] ==> public open fun addServlet(p0: (ServletHolder..ServletHolder?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'staticDir' @ [160:28] ==> val staticDir: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [160:47] ==> value-parameter it: Pair<String, String> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [160:50] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'resourceConfig' @ [164:13] ==> val resourceConfig: (ResourceConfig..ResourceConfig?) defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'addProperties' @ [164:28] ==> public final fun addProperties(p0: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)): (ResourceConfig..ResourceConfig?) defined in org.glassfish.jersey.server.ResourceConfig[JavaMethodDescriptor]

'mapOf' @ [164:42] ==> public fun <K, V> mapOf(vararg pairs: Pair<(String..String?), String>): Map<(String..String?), String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> String

'to' @ [164:48] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'APPLICATION_NAME' @ [164:65] ==> public const final val APPLICATION_NAME: String defined in org.glassfish.jersey.server.ServerProperties[JavaPropertyDescriptor]

'to' @ [165:21] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'MONITORING_STATISTICS_MBEANS_ENABLED' @ [165:38] ==> public const final val MONITORING_STATISTICS_MBEANS_ENABLED: String defined in org.glassfish.jersey.server.ServerProperties[JavaPropertyDescriptor]

'pluginRegistries' @ [167:35] ==> public final val pluginRegistries: List<WebServerPluginRegistry> defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'filterNot' @ [167:52] ==> public inline fun <T> Iterable<WebServerPluginRegistry>.filterNot(predicate: (WebServerPluginRegistry) -> Boolean): List<WebServerPluginRegistry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry

'it' @ [168:17] ==> value-parameter it: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [168:20] ==> public val <T : Any> WebServerPluginRegistry.javaClass: Class<WebServerPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> WebServerPluginRegistry

'name' @ [168:30] ==> public final val <T : (Any..Any?)> Class<WebServerPluginRegistry>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WebServerPluginRegistry

'startsWith' @ [168:35] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [169:25] ==> value-parameter it: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [169:28] ==> public val <T : Any> WebServerPluginRegistry.javaClass: Class<WebServerPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> WebServerPluginRegistry

'name' @ [169:38] ==> public final val <T : (Any..Any?)> Class<WebServerPluginRegistry>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WebServerPluginRegistry

'startsWith' @ [169:43] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [170:25] ==> value-parameter it: WebServerPluginRegistry defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [170:28] ==> public val <T : Any> WebServerPluginRegistry.javaClass: Class<WebServerPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> WebServerPluginRegistry

'name' @ [170:38] ==> public final val <T : (Any..Any?)> Class<WebServerPluginRegistry>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WebServerPluginRegistry

'startsWith' @ [170:43] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ServletHolder' @ [173:31] ==> public constructor ServletHolder(p0: (Servlet..Servlet?)) defined in org.eclipse.jetty.servlet.ServletHolder[JavaClassConstructorDescriptor]

'CorDappInfoServlet' @ [173:45] ==> public constructor CorDappInfoServlet(plugins: List<WebServerPluginRegistry>, rpc: CordaRPCOps) defined in net.corda.webserver.servlets.CorDappInfoServlet[ClassConstructorDescriptorImpl]

'filteredPlugins' @ [173:64] ==> val filteredPlugins: List<WebServerPluginRegistry> defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'localRpc' @ [173:81] ==> value-parameter localRpc: CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler[ValueParameterDescriptorImpl]

'addServlet' @ [174:13] ==> public open fun addServlet(p0: (ServletHolder..ServletHolder?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'infoServlet' @ [174:24] ==> val infoServlet: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'ServletContainer' @ [176:29] ==> public constructor ServletContainer(p0: (ResourceConfig..ResourceConfig?)) defined in org.glassfish.jersey.servlet.ServletContainer[JavaClassConstructorDescriptor]

'resourceConfig' @ [176:46] ==> val resourceConfig: (ResourceConfig..ResourceConfig?) defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'ServletHolder' @ [177:33] ==> public constructor ServletHolder(p0: (Servlet..Servlet?)) defined in org.eclipse.jetty.servlet.ServletHolder[JavaClassConstructorDescriptor]

'container' @ [177:47] ==> val container: ServletContainer defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'addServlet' @ [178:13] ==> public open fun addServlet(p0: (ServletHolder..ServletHolder?), p1: (String..String?)): Unit defined in org.eclipse.jetty.servlet.ServletContextHandler[JavaMethodDescriptor]

'jerseyServlet' @ [178:24] ==> val jerseyServlet: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'jerseyServlet' @ [179:13] ==> val jerseyServlet: ServletHolder defined in net.corda.webserver.internal.NodeWebServer.buildServletContextHandler.<anonymous>[LocalVariableDescriptor]

'initOrder' @ [179:27] ==> public final var ServletHolder.initOrder: Int[MyPropertyDescriptor]

'connectLocalRpcAsNodeUser' @ [186:24] ==> private final fun connectLocalRpcAsNodeUser(): CordaRPCOps defined in net.corda.webserver.internal.NodeWebServer[SimpleFunctionDescriptorImpl]

'log' @ [188:17] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'debug' @ [188:21] ==> public abstract fun debug(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [188:51] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'p2pAddress' @ [188:58] ==> public final val p2pAddress: NetworkHostAndPort defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'e' @ [188:91] ==> val e: ActiveMQNotConnectedException defined in net.corda.webserver.internal.NodeWebServer.retryConnectLocalRpc[LocalVariableDescriptor]

'sleep' @ [189:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'retryDelay' @ [189:30] ==> public const final val retryDelay: Long defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'log' @ [194:17] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'debug' @ [194:21] ==> public abstract fun debug(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [194:84] ==> val e: NoSuchFileException defined in net.corda.webserver.internal.NodeWebServer.retryConnectLocalRpc[LocalVariableDescriptor]

'sleep' @ [195:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'retryDelay' @ [195:30] ==> public const final val retryDelay: Long defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'log' @ [199:17] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'error' @ [199:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [199:53] ==> val e: Throwable defined in net.corda.webserver.internal.NodeWebServer.retryConnectLocalRpc[LocalVariableDescriptor]

'e' @ [200:23] ==> val e: Throwable defined in net.corda.webserver.internal.NodeWebServer.retryConnectLocalRpc[LocalVariableDescriptor]

'log' @ [206:9] ==> public final val log: Logger defined in net.corda.webserver.internal.NodeWebServer.Companion[PropertyDescriptorImpl]

'info' @ [206:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [206:43] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'p2pAddress' @ [206:50] ==> public final val p2pAddress: NetworkHostAndPort defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'CordaRPCClient' @ [207:22] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'config' @ [207:37] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'p2pAddress' @ [207:44] ==> public final val p2pAddress: NetworkHostAndPort defined in net.corda.webserver.WebServerConfig[PropertyDescriptorImpl]

'config' @ [207:56] ==> public final val config: WebServerConfig defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'client' @ [208:26] ==> val client: CordaRPCClient defined in net.corda.webserver.internal.NodeWebServer.connectLocalRpcAsNodeUser[LocalVariableDescriptor]

'start' @ [208:33] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'NODE_USER' @ [208:65] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'NODE_USER' @ [208:102] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'connection' @ [209:16] ==> val connection: CordaRPCConnection defined in net.corda.webserver.internal.NodeWebServer.connectLocalRpcAsNodeUser[LocalVariableDescriptor]

'proxy' @ [209:27] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'getValue' @ [213:60] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'load' @ [214:23] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(WebServerPluginRegistry..WebServerPluginRegistry?)>..Class<(WebServerPluginRegistry..WebServerPluginRegistry?)>?)): (ServiceLoader<(WebServerPluginRegistry..WebServerPluginRegistry?)>..ServiceLoader<(WebServerPluginRegistry..WebServerPluginRegistry?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.webserver.services.WebServerPluginRegistry..net.corda.webserver.services.WebServerPluginRegistry?)

'java' @ [214:59] ==> public val <T> KClass<WebServerPluginRegistry>.java: Class<WebServerPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry

'toList' @ [214:65] ==> public fun <T> Iterable<(WebServerPluginRegistry..WebServerPluginRegistry?)>.toList(): List<(WebServerPluginRegistry..WebServerPluginRegistry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.webserver.services.WebServerPluginRegistry..net.corda.webserver.services.WebServerPluginRegistry?)

'if (info == null) description else "${description.padEnd(40)}: $info"' @ [219:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'info' @ [219:23] ==> value-parameter info: String? = ... defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[ValueParameterDescriptorImpl]

'description' @ [219:37] ==> value-parameter description: String defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[ValueParameterDescriptorImpl]

'description' @ [219:57] ==> value-parameter description: String defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[ValueParameterDescriptorImpl]

'padEnd' @ [219:69] ==> public fun String.padEnd(length: Int, padChar: Char = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'info' @ [219:83] ==> value-parameter info: String? = ... defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[ValueParameterDescriptorImpl]

'if (renderBasicInfoToConsole) "BasicInfo" else "Main"' @ [220:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'renderBasicInfoToConsole' @ [220:30] ==> private final var renderBasicInfoToConsole: Boolean defined in net.corda.webserver.internal.NodeWebServer[PropertyDescriptorImpl]

'getLogger' @ [221:23] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'loggerName' @ [221:33] ==> val loggerName: String defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[LocalVariableDescriptor]

'info' @ [221:45] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'msg' @ [221:50] ==> val msg: String defined in net.corda.webserver.internal.NodeWebServer.logAndMaybePrint[LocalVariableDescriptor]

