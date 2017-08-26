'listOf' @ [10:28] ==> public fun <T> listOf(element: Function<@ParameterName CordaRPCOps, InterestRateSwapAPI>): List<Function<@ParameterName CordaRPCOps, InterestRateSwapAPI>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function<[@kotlin.ParameterName] CordaRPCOps, InterestRateSwapAPI>

'Function' @ [10:35] ==> @FunctionalInterface public fun <T : (Any..Any?), R : (Any..Any?)> Function(function: (rpc: CordaRPCOps) -> InterestRateSwapAPI): Function<@ParameterName CordaRPCOps, InterestRateSwapAPI> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> [@kotlin.ParameterName] CordaRPCOps
    <R : (Any..Any?)> -> InterestRateSwapAPI

'InterestRateSwapAPI' @ [10:46] ==> public constructor InterestRateSwapAPI(rpc: CordaRPCOps) defined in net.corda.irs.api.InterestRateSwapAPI[ClassConstructorDescriptorImpl]

'mapOf' @ [11:57] ==> public fun <K, V> mapOf(pair: Pair<String, (String..String?)>): Map<String, (String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (kotlin.String..kotlin.String?)

'to' @ [12:13] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'javaClass' @ [12:26] ==> public val <T : Any> IRSPlugin.javaClass: Class<IRSPlugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> IRSPlugin

'classLoader' @ [12:36] ==> public final val <T : (Any..Any?)> Class<IRSPlugin>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IRSPlugin

'getResource' @ [12:48] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'toExternalForm' @ [12:70] ==> public open fun toExternalForm(): (String..String?) defined in java.net.URL[JavaMethodDescriptor]

'registerFinanceJSONMappers' @ [15:71] ==> public fun registerFinanceJSONMappers(objectMapper: ObjectMapper): Unit defined in net.corda.finance.plugin[DeserializedSimpleFunctionDescriptor]

'om' @ [15:98] ==> value-parameter om: ObjectMapper defined in net.corda.irs.plugin.IRSPlugin.customizeJSONSerialization[ValueParameterDescriptorImpl]

