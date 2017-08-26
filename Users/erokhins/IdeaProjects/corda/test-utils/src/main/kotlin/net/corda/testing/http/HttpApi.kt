'defaultMapper' @ [7:57] ==> private final val defaultMapper: ObjectMapper defined in net.corda.testing.http.HttpApi.Companion[PropertyDescriptorImpl]

'Unit' @ [13:43] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'HttpUtils' @ [13:51] ==> public object HttpUtils defined in net.corda.testing.http in file HttpUtils.kt[FakeCallableDescriptorForObject]

'putJson' @ [13:61] ==> public final fun putJson(url: URL, data: String): Boolean defined in net.corda.testing.http.HttpUtils[SimpleFunctionDescriptorImpl]

'URL' @ [13:69] ==> public constructor URL(p0: (URL..URL?), p1: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'root' @ [13:73] ==> public final val root: URL defined in net.corda.testing.http.HttpApi[PropertyDescriptorImpl]

'path' @ [13:79] ==> value-parameter path: String defined in net.corda.testing.http.HttpApi.putJson[ValueParameterDescriptorImpl]

'toJson' @ [13:86] ==> private final fun toJson(any: Any): (String..String?) defined in net.corda.testing.http.HttpApi[SimpleFunctionDescriptorImpl]

'data' @ [13:93] ==> value-parameter data: Any = ... defined in net.corda.testing.http.HttpApi.putJson[ValueParameterDescriptorImpl]

'Unit' @ [20:44] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'HttpUtils' @ [20:52] ==> public object HttpUtils defined in net.corda.testing.http in file HttpUtils.kt[FakeCallableDescriptorForObject]

'postJson' @ [20:62] ==> public final fun postJson(url: URL, data: String): Boolean defined in net.corda.testing.http.HttpUtils[SimpleFunctionDescriptorImpl]

'URL' @ [20:71] ==> public constructor URL(p0: (URL..URL?), p1: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'root' @ [20:75] ==> public final val root: URL defined in net.corda.testing.http.HttpApi[PropertyDescriptorImpl]

'path' @ [20:81] ==> value-parameter path: String defined in net.corda.testing.http.HttpApi.postJson[ValueParameterDescriptorImpl]

'toJson' @ [20:88] ==> private final fun toJson(any: Any): (String..String?) defined in net.corda.testing.http.HttpApi[SimpleFunctionDescriptorImpl]

'data' @ [20:95] ==> value-parameter data: Any = ... defined in net.corda.testing.http.HttpApi.postJson[ValueParameterDescriptorImpl]

'mapOf' @ [25:86] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'HttpUtils' @ [25:97] ==> public object HttpUtils defined in net.corda.testing.http in file HttpUtils.kt[FakeCallableDescriptorForObject]

'getJson' @ [25:107] ==> public final inline fun <reified T : Any> getJson(url: URL, params: Map<String, String> = ..., mapper: ObjectMapper = ...): T defined in net.corda.testing.http.HttpUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> T

'URL' @ [25:118] ==> public constructor URL(p0: (URL..URL?), p1: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'root' @ [25:122] ==> public final val root: URL defined in net.corda.testing.http.HttpApi[PropertyDescriptorImpl]

'path' @ [25:128] ==> value-parameter path: String defined in net.corda.testing.http.HttpApi.getJson[ValueParameterDescriptorImpl]

'params' @ [25:135] ==> value-parameter params: Map<String, String> = ... defined in net.corda.testing.http.HttpApi.getJson[ValueParameterDescriptorImpl]

'mapper' @ [25:143] ==> public final val mapper: ObjectMapper defined in net.corda.testing.http.HttpApi[PropertyDescriptorImpl]

'any' @ [27:36] ==> value-parameter any: Any defined in net.corda.testing.http.HttpApi.toJson[ValueParameterDescriptorImpl]

'HttpUtils' @ [27:54] ==> public object HttpUtils defined in net.corda.testing.http in file HttpUtils.kt[FakeCallableDescriptorForObject]

'defaultMapper' @ [27:64] ==> public final val defaultMapper: ObjectMapper defined in net.corda.testing.http.HttpUtils[PropertyDescriptorImpl]

'writeValueAsString' @ [27:78] ==> public open fun writeValueAsString(p0: (Any..Any?)): (String..String?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'any' @ [27:97] ==> value-parameter any: Any defined in net.corda.testing.http.HttpApi.toJson[ValueParameterDescriptorImpl]

'defaultMapper' @ [30:126] ==> private final val defaultMapper: ObjectMapper defined in net.corda.testing.http.HttpApi.Companion[PropertyDescriptorImpl]

'HttpApi' @ [31:19] ==> public constructor HttpApi(root: URL, mapper: ObjectMapper = ...) defined in net.corda.testing.http.HttpApi[ClassConstructorDescriptorImpl]

'URL' @ [31:27] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'protocol' @ [31:33] ==> value-parameter protocol: String = ... defined in net.corda.testing.http.HttpApi.Companion.fromHostAndPort[ValueParameterDescriptorImpl]

'hostAndPort' @ [31:45] ==> value-parameter hostAndPort: NetworkHostAndPort defined in net.corda.testing.http.HttpApi.Companion.fromHostAndPort[ValueParameterDescriptorImpl]

'base' @ [31:58] ==> value-parameter base: String defined in net.corda.testing.http.HttpApi.Companion.fromHostAndPort[ValueParameterDescriptorImpl]

'mapper' @ [31:67] ==> value-parameter mapper: ObjectMapper = ... defined in net.corda.testing.http.HttpApi.Companion.fromHostAndPort[ValueParameterDescriptorImpl]

'lazy' @ [32:52] ==> public fun <T> lazy(initializer: () -> ObjectMapper): Lazy<ObjectMapper> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObjectMapper

'createNonRpcMapper' @ [33:46] ==> @JvmStatic @JvmOverloads public final fun createNonRpcMapper(factory: JsonFactory = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

