'listOf' @ [17:28] ==> public fun <T> listOf(element: Function<@ParameterName CordaRPCOps, PortfolioApi>): List<Function<@ParameterName CordaRPCOps, PortfolioApi>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function<[@kotlin.ParameterName] CordaRPCOps, PortfolioApi>

'Function' @ [17:35] ==> @FunctionalInterface public fun <T : (Any..Any?), R : (Any..Any?)> Function(function: (rpc: CordaRPCOps) -> PortfolioApi): Function<@ParameterName CordaRPCOps, PortfolioApi> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> [@kotlin.ParameterName] CordaRPCOps
    <R : (Any..Any?)> -> PortfolioApi

'PortfolioApi' @ [17:46] ==> public constructor PortfolioApi(rpc: CordaRPCOps) defined in net.corda.vega.api.PortfolioApi[ClassConstructorDescriptorImpl]

'mapOf' @ [18:57] ==> public fun <K, V> mapOf(pair: Pair<String, (String..String?)>): Map<String, (String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.String..kotlin.String?)

'to' @ [18:63] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'javaClass' @ [18:86] ==> public val <T : Any> SimmPlugin.javaClass: Class<SimmPlugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SimmPlugin

'classLoader' @ [18:96] ==> public final val <T : (Any..Any?)> Class<SimmPlugin>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SimmPlugin

'getResource' @ [18:108] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'toExternalForm' @ [18:140] ==> public open fun toExternalForm(): (String..String?) defined in java.net.URL[JavaMethodDescriptor]

'registerFinanceJSONMappers' @ [19:71] ==> public fun registerFinanceJSONMappers(objectMapper: ObjectMapper): Unit defined in net.corda.finance.plugin[DeserializedSimpleFunctionDescriptor]

'om' @ [19:98] ==> value-parameter om: ObjectMapper defined in net.corda.vega.plugin.SimmPlugin.customizeJSONSerialization[ValueParameterDescriptorImpl]

