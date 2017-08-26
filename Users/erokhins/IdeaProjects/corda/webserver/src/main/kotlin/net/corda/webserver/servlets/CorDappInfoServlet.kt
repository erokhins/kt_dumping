'HttpServlet' @ [18:93] ==> public constructor HttpServlet() defined in javax.servlet.http.HttpServlet[JavaClassConstructorDescriptor]

'Throws' @ [20:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [20:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'resp' @ [22:9] ==> value-parameter resp: HttpServletResponse defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet[ValueParameterDescriptorImpl]

'writer' @ [22:14] ==> public final val HttpServletResponse.writer: (PrintWriter..PrintWriter?)[MyPropertyDescriptor]

'appendHTML' @ [22:21] ==> public fun <O : Appendable /* = Appendable */> (PrintWriter..PrintWriter?).appendHTML(prettyPrint: Boolean = ...): TagConsumer<(PrintWriter..PrintWriter?)> defined in kotlinx.html.stream[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O : Appendable /* = Appendable */> -> (java.io.PrintWriter..java.io.PrintWriter?)

'html' @ [22:34] ==> public fun <T, C : TagConsumer<(PrintWriter..PrintWriter?)>> TagConsumer<(PrintWriter..PrintWriter?)>.html(block: HTML.() -> Unit = ...): (PrintWriter..PrintWriter?) defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.PrintWriter..java.io.PrintWriter?)
    <C : TagConsumer<T>> -> TagConsumer<(java.io.PrintWriter..java.io.PrintWriter?)>

'head' @ [23:13] ==> public fun HTML.head(block: HEAD.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'title' @ [24:17] ==> public fun MetaDataContent.title(block: TITLE.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [24:25] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.TITLE[DeserializedSimpleFunctionDescriptor]

'body' @ [26:13] ==> public fun HTML.body(classes: String? = ..., block: BODY.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'h2' @ [27:17] ==> public fun FlowOrHeadingContent.h2(classes: String? = ..., block: H2.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [27:22] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.H2[DeserializedSimpleFunctionDescriptor]

'if (plugins.isEmpty()) {
                    p { +"No installed custom CorDapps." }
                } else {
                    plugins.forEach { plugin ->
                        h3 { +plugin::class.java.name }
                        if (plugin.webApis.isNotEmpty()) {
                            div {
                                plugin.webApis.forEach { api ->
                                    val resource = Resource.from(api.apply(rpc)::class.java)
                                    p { +"${resource.name}:" }
                                    val endpoints = processEndpoints("", resource, mutableListOf<Endpoint>())
                                    ul {
                                        endpoints.forEach {
                                            li { a(it.uri) { +"${it.method}\t${it.text}" } }
                                        }
                                    }
                                }
                            }
                        }
                        if (plugin.staticServeDirs.isNotEmpty()) {
                            div {
                                p { +"Static web content:" }
                                ul {
                                    plugin.staticServeDirs.keys.forEach {
                                        li { a("web/$it") { +it } }
                                    }
                                }
                            }
                        }
                    }
                }' @ [28:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'plugins' @ [28:21] ==> public final val plugins: List<WebServerPluginRegistry> defined in net.corda.webserver.servlets.CorDappInfoServlet[PropertyDescriptorImpl]

'isEmpty' @ [28:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'p' @ [29:21] ==> public fun FlowContent.p(classes: String? = ..., block: P.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [29:25] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.P[DeserializedSimpleFunctionDescriptor]

'plugins' @ [31:21] ==> public final val plugins: List<WebServerPluginRegistry> defined in net.corda.webserver.servlets.CorDappInfoServlet[PropertyDescriptorImpl]

'forEach' @ [31:29] ==> @HidesMembers public inline fun <T> Iterable<WebServerPluginRegistry>.forEach(action: (WebServerPluginRegistry) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WebServerPluginRegistry

'h3' @ [32:25] ==> public fun FlowOrHeadingContent.h3(classes: String? = ..., block: H3.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [32:30] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.H3[DeserializedSimpleFunctionDescriptor]

'plugin' @ [32:31] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [32:45] ==> public val <T> KClass<out WebServerPluginRegistry>.java: Class<out WebServerPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out WebServerPluginRegistry)

'name' @ [32:50] ==> public final val <T : (Any..Any?)> Class<out WebServerPluginRegistry>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out WebServerPluginRegistry)

'plugin' @ [33:29] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'webApis' @ [33:36] ==> public open val webApis: List<Function<CordaRPCOps, out Any>> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'isNotEmpty' @ [33:44] ==> @InlineOnly public inline fun <T> Collection<Function<CordaRPCOps, out Any>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function<CordaRPCOps, out Any>

'div' @ [34:29] ==> public fun FlowContent.div(classes: String? = ..., block: DIV.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'plugin' @ [35:33] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'webApis' @ [35:40] ==> public open val webApis: List<Function<CordaRPCOps, out Any>> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'forEach' @ [35:48] ==> @HidesMembers public inline fun <T> Iterable<Function<CordaRPCOps, out Any>>.forEach(action: (Function<CordaRPCOps, out Any>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function<CordaRPCOps, out Any>

'from' @ [36:61] ==> public open fun from(p0: (Class<*>..Class<*>?)): (Resource..Resource?) defined in org.glassfish.jersey.server.model.Resource[JavaMethodDescriptor]

'api' @ [36:66] ==> value-parameter api: Function<CordaRPCOps, out Any> defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [36:70] ==> public abstract fun apply(p0: CordaRPCOps): Any defined in java.util.function.Function[JavaMethodDescriptor]

'rpc' @ [36:76] ==> public final val rpc: CordaRPCOps defined in net.corda.webserver.servlets.CorDappInfoServlet[PropertyDescriptorImpl]

'java' @ [36:88] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'p' @ [37:37] ==> public fun FlowContent.p(classes: String? = ..., block: P.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [37:41] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.P[DeserializedSimpleFunctionDescriptor]

'resource' @ [37:45] ==> val resource: (Resource..Resource?) defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [37:54] ==> public final val Resource.name: (String..String?)[MyPropertyDescriptor]

'processEndpoints' @ [38:53] ==> private final fun processEndpoints(uriPrefix: String, resource: Resource, endpoints: MutableList<CorDappInfoServlet.Endpoint>): List<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet[SimpleFunctionDescriptorImpl]

'resource' @ [38:74] ==> val resource: (Resource..Resource?) defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mutableListOf' @ [38:84] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<CorDappInfoServlet.Endpoint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Endpoint

'ul' @ [39:37] ==> public fun FlowContent.ul(classes: String? = ..., block: UL.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'endpoints' @ [40:41] ==> val endpoints: List<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [40:51] ==> @HidesMembers public inline fun <T> Iterable<CorDappInfoServlet.Endpoint>.forEach(action: (CorDappInfoServlet.Endpoint) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Endpoint

'li' @ [41:45] ==> public fun UL.li(classes: String? = ..., block: LI.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'a' @ [41:50] ==> public fun FlowOrInteractiveOrPhrasingContent.a(href: String? = ..., target: String? = ..., classes: String? = ..., block: A.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'it' @ [41:52] ==> value-parameter it: CorDappInfoServlet.Endpoint defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'uri' @ [41:55] ==> public final val uri: String defined in net.corda.webserver.servlets.CorDappInfoServlet.Endpoint[PropertyDescriptorImpl]

'+' @ [41:62] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.A[DeserializedSimpleFunctionDescriptor]

'it' @ [41:66] ==> value-parameter it: CorDappInfoServlet.Endpoint defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [41:69] ==> public final val method: String defined in net.corda.webserver.servlets.CorDappInfoServlet.Endpoint[PropertyDescriptorImpl]

'it' @ [41:80] ==> value-parameter it: CorDappInfoServlet.Endpoint defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [41:83] ==> public final val text: String defined in net.corda.webserver.servlets.CorDappInfoServlet.Endpoint[PropertyDescriptorImpl]

'plugin' @ [47:29] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'staticServeDirs' @ [47:36] ==> public open val staticServeDirs: Map<String, String> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'isNotEmpty' @ [47:52] ==> @InlineOnly public inline fun <K, V> Map<out String, String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'div' @ [48:29] ==> public fun FlowContent.div(classes: String? = ..., block: DIV.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'p' @ [49:33] ==> public fun FlowContent.p(classes: String? = ..., block: P.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'+' @ [49:37] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.P[DeserializedSimpleFunctionDescriptor]

'ul' @ [50:33] ==> public fun FlowContent.ul(classes: String? = ..., block: UL.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'plugin' @ [51:37] ==> value-parameter plugin: WebServerPluginRegistry defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'staticServeDirs' @ [51:44] ==> public open val staticServeDirs: Map<String, String> defined in net.corda.webserver.services.WebServerPluginRegistry[PropertyDescriptorImpl]

'keys' @ [51:60] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [51:65] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'li' @ [52:41] ==> public fun UL.li(classes: String? = ..., block: LI.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'a' @ [52:46] ==> public fun FlowOrInteractiveOrPhrasingContent.a(href: String? = ..., target: String? = ..., classes: String? = ..., block: A.() -> Unit = ...): Unit defined in kotlinx.html[DeserializedSimpleFunctionDescriptor]

'it' @ [52:54] ==> value-parameter it: String defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [52:61] ==> public open fun String.unaryPlus(): Unit defined in kotlinx.html.A[DeserializedSimpleFunctionDescriptor]

'it' @ [52:62] ==> value-parameter it: String defined in net.corda.webserver.servlets.CorDappInfoServlet.doGet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'arrayListOf' @ [69:25] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Resource> /* = ArrayList<Resource> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resource

'if (resource.path != null) "$uriPrefix/${resource.path}" else uriPrefix' @ [70:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'resource' @ [70:24] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'path' @ [70:33] ==> public final val Resource.path: (String..String?)[MyPropertyDescriptor]

'uriPrefix' @ [70:49] ==> value-parameter uriPrefix: String defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'resource' @ [70:61] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'path' @ [70:70] ==> public final val Resource.path: (String..String?)[MyPropertyDescriptor]

'uriPrefix' @ [70:82] ==> value-parameter uriPrefix: String defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'resources' @ [72:9] ==> val resources: ArrayList<Resource> /* = ArrayList<Resource> */ defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'addAll' @ [72:19] ==> public open fun addAll(elements: Collection<Resource>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'resource' @ [72:26] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'childResources' @ [72:35] ==> public final val Resource.childResources: (MutableList<(Resource..Resource?)>..List<(Resource..Resource?)>?)[MyPropertyDescriptor]

'resource' @ [74:24] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'allMethods' @ [74:33] ==> public final val Resource.allMethods: (MutableList<(ResourceMethod..ResourceMethod?)>..List<(ResourceMethod..ResourceMethod?)>?)[MyPropertyDescriptor]

'if (method.type == ResourceMethod.JaxrsType.SUB_RESOURCE_LOCATOR) {
                resources.add( Resource.from(resource.resourceLocator.invocable.definitionMethod.returnType))
            } else {
                endpoints.add(Endpoint(method.httpMethod, "api$path", resource.path))
            }' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'method' @ [75:17] ==> val method: (ResourceMethod..ResourceMethod?) defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'type' @ [75:24] ==> public final val ResourceMethod.type: (ResourceMethod.JaxrsType..ResourceMethod.JaxrsType?)[MyPropertyDescriptor]

'SUB_RESOURCE_LOCATOR' @ [75:57] ==> enum entry SUB_RESOURCE_LOCATOR defined in org.glassfish.jersey.server.model.ResourceMethod.JaxrsType[FakeCallableDescriptorForObject]

'resources' @ [76:17] ==> val resources: ArrayList<Resource> /* = ArrayList<Resource> */ defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'add' @ [76:27] ==> public open fun add(element: Resource): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'from' @ [76:41] ==> public open fun from(p0: (Class<*>..Class<*>?)): (Resource..Resource?) defined in org.glassfish.jersey.server.model.Resource[JavaMethodDescriptor]

'resource' @ [76:46] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'resourceLocator' @ [76:55] ==> public final val Resource.resourceLocator: (ResourceMethod..ResourceMethod?)[MyPropertyDescriptor]

'invocable' @ [76:71] ==> public final val ResourceMethod.invocable: (Invocable..Invocable?)[MyPropertyDescriptor]

'definitionMethod' @ [76:81] ==> public final val Invocable.definitionMethod: (Method..Method?)[MyPropertyDescriptor]

'returnType' @ [76:98] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'endpoints' @ [78:17] ==> value-parameter endpoints: MutableList<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'add' @ [78:27] ==> public abstract fun add(element: CorDappInfoServlet.Endpoint): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Endpoint' @ [78:31] ==> public constructor Endpoint(method: String, uri: String, text: String) defined in net.corda.webserver.servlets.CorDappInfoServlet.Endpoint[ClassConstructorDescriptorImpl]

'method' @ [78:40] ==> val method: (ResourceMethod..ResourceMethod?) defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'httpMethod' @ [78:47] ==> public final val ResourceMethod.httpMethod: (String..String?)[MyPropertyDescriptor]

'path' @ [78:64] ==> val path: String defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'resource' @ [78:71] ==> value-parameter resource: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'path' @ [78:80] ==> public final val Resource.path: (String..String?)[MyPropertyDescriptor]

'resources' @ [82:9] ==> val resources: ArrayList<Resource> /* = ArrayList<Resource> */ defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'forEach' @ [82:19] ==> @HidesMembers public inline fun <T> Iterable<Resource>.forEach(action: (Resource) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Resource

'processEndpoints' @ [83:13] ==> private final fun processEndpoints(uriPrefix: String, resource: Resource, endpoints: MutableList<CorDappInfoServlet.Endpoint>): List<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet[SimpleFunctionDescriptorImpl]

'path' @ [83:30] ==> val path: String defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[LocalVariableDescriptor]

'it' @ [83:36] ==> value-parameter it: Resource defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints.<anonymous>[ValueParameterDescriptorImpl]

'endpoints' @ [83:40] ==> value-parameter endpoints: MutableList<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

'endpoints' @ [86:16] ==> value-parameter endpoints: MutableList<CorDappInfoServlet.Endpoint> defined in net.corda.webserver.servlets.CorDappInfoServlet.processEndpoints[ValueParameterDescriptorImpl]

