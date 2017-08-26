'loggerFor' @ [18:26] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> HttpUtils

'getValue' @ [19:27] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'Builder' @ [20:22] ==> public constructor Builder() defined in okhttp3.OkHttpClient.Builder[JavaClassConstructorDescriptor]

'connectTimeout' @ [21:18] ==> public open fun connectTimeout(p0: Long, p1: (TimeUnit..TimeUnit?)): (OkHttpClient.Builder..OkHttpClient.Builder?) defined in okhttp3.OkHttpClient.Builder[JavaMethodDescriptor]

'SECONDS' @ [21:45] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'readTimeout' @ [22:18] ==> public open fun readTimeout(p0: Long, p1: (TimeUnit..TimeUnit?)): (OkHttpClient.Builder..OkHttpClient.Builder?) defined in okhttp3.OkHttpClient.Builder[JavaMethodDescriptor]

'SECONDS' @ [22:43] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'build' @ [22:52] ==> public open fun build(): (OkHttpClient..OkHttpClient?) defined in okhttp3.OkHttpClient.Builder[JavaMethodDescriptor]

'getValue' @ [24:40] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'createNonRpcMapper' @ [25:42] ==> @JvmStatic @JvmOverloads public final fun createNonRpcMapper(factory: JsonFactory = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

'create' @ [29:32] ==> public open fun create(p0: (MediaType..MediaType?), p1: (String..String?)): (RequestBody..RequestBody?) defined in okhttp3.RequestBody[JavaMethodDescriptor]

'parse' @ [29:49] ==> public open fun parse(p0: (String..String?)): (MediaType..MediaType?) defined in okhttp3.MediaType[JavaMethodDescriptor]

'data' @ [29:91] ==> value-parameter data: String defined in net.corda.testing.http.HttpUtils.putJson[ValueParameterDescriptorImpl]

'makeRequest' @ [30:16] ==> private final fun makeRequest(request: Request): Boolean defined in net.corda.testing.http.HttpUtils[SimpleFunctionDescriptorImpl]

'Builder' @ [30:36] ==> public constructor Builder() defined in okhttp3.Request.Builder[JavaClassConstructorDescriptor]

'url' @ [30:46] ==> public open fun url(p0: (URL..URL?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'url' @ [30:50] ==> value-parameter url: URL defined in net.corda.testing.http.HttpUtils.putJson[ValueParameterDescriptorImpl]

'header' @ [30:55] ==> public open fun header(p0: (String..String?), p1: (String..String?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'put' @ [30:98] ==> public open fun put(p0: (RequestBody..RequestBody?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'body' @ [30:102] ==> val body: (RequestBody..RequestBody?) defined in net.corda.testing.http.HttpUtils.putJson[LocalVariableDescriptor]

'build' @ [30:108] ==> public open fun build(): (Request..Request?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'create' @ [34:32] ==> public open fun create(p0: (MediaType..MediaType?), p1: (String..String?)): (RequestBody..RequestBody?) defined in okhttp3.RequestBody[JavaMethodDescriptor]

'parse' @ [34:49] ==> public open fun parse(p0: (String..String?)): (MediaType..MediaType?) defined in okhttp3.MediaType[JavaMethodDescriptor]

'data' @ [34:91] ==> value-parameter data: String defined in net.corda.testing.http.HttpUtils.postJson[ValueParameterDescriptorImpl]

'makeRequest' @ [35:16] ==> private final fun makeRequest(request: Request): Boolean defined in net.corda.testing.http.HttpUtils[SimpleFunctionDescriptorImpl]

'Builder' @ [35:36] ==> public constructor Builder() defined in okhttp3.Request.Builder[JavaClassConstructorDescriptor]

'url' @ [35:46] ==> public open fun url(p0: (URL..URL?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'url' @ [35:50] ==> value-parameter url: URL defined in net.corda.testing.http.HttpUtils.postJson[ValueParameterDescriptorImpl]

'header' @ [35:55] ==> public open fun header(p0: (String..String?), p1: (String..String?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'post' @ [35:98] ==> public open fun post(p0: (RequestBody..RequestBody?)): (Request.Builder..Request.Builder?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'body' @ [35:103] ==> val body: (RequestBody..RequestBody?) defined in net.corda.testing.http.HttpUtils.postJson[LocalVariableDescriptor]

'build' @ [35:109] ==> public open fun build(): (Request..Request?) defined in okhttp3.Request.Builder[JavaMethodDescriptor]

'mapOf' @ [38:82] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'defaultMapper' @ [38:114] ==> public final val defaultMapper: ObjectMapper defined in net.corda.testing.http.HttpUtils[PropertyDescriptorImpl]

'if (params.isEmpty()) "" else "?" + params.map { "${it.key}=${it.value}" }.joinToString("&")' @ [39:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'params' @ [39:31] ==> value-parameter params: Map<String, String> = ... defined in net.corda.testing.http.HttpUtils.getJson[ValueParameterDescriptorImpl]

'isEmpty' @ [39:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'+' @ [39:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'params' @ [39:63] ==> value-parameter params: Map<String, String> = ... defined in net.corda.testing.http.HttpUtils.getJson[ValueParameterDescriptorImpl]

'map' @ [39:70] ==> public inline fun <K, V, R> Map<out String, String>.map(transform: (Map.Entry<String, String>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> String

'it' @ [39:79] ==> value-parameter it: Map.Entry<String, String> defined in net.corda.testing.http.HttpUtils.getJson.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [39:82] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [39:89] ==> value-parameter it: Map.Entry<String, String> defined in net.corda.testing.http.HttpUtils.getJson.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [39:92] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'joinToString' @ [39:102] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'URL' @ [40:32] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'url' @ [40:36] ==> value-parameter url: URL defined in net.corda.testing.http.HttpUtils.getJson[ValueParameterDescriptorImpl]

'toExternalForm' @ [40:40] ==> public open fun toExternalForm(): (String..String?) defined in java.net.URL[JavaMethodDescriptor]

'paramString' @ [40:59] ==> val paramString: String defined in net.corda.testing.http.HttpUtils.getJson[LocalVariableDescriptor]

'mapper' @ [41:16] ==> value-parameter mapper: ObjectMapper = ... defined in net.corda.testing.http.HttpUtils.getJson[ValueParameterDescriptorImpl]

'readValue' @ [41:23] ==> public open fun <T : (Any..Any?)> readValue(p0: (URL..URL?), p1: (Class<(T..T?)>..Class<(T..T?)>?)): (T..T?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'parameterisedUrl' @ [41:33] ==> val parameterisedUrl: URL defined in net.corda.testing.http.HttpUtils.getJson[LocalVariableDescriptor]

'java' @ [41:60] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'client' @ [45:24] ==> private final val client: (OkHttpClient..OkHttpClient?) defined in net.corda.testing.http.HttpUtils[PropertyDescriptorImpl]

'newCall' @ [45:31] ==> public open fun newCall(p0: (Request..Request?)): (Call..Call?) defined in okhttp3.OkHttpClient[JavaMethodDescriptor]

'request' @ [45:39] ==> value-parameter request: Request defined in net.corda.testing.http.HttpUtils.makeRequest[ValueParameterDescriptorImpl]

'execute' @ [45:48] ==> public abstract fun execute(): (Response..Response?) defined in okhttp3.Call[JavaMethodDescriptor]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'response' @ [47:14] ==> val response: (Response..Response?) defined in net.corda.testing.http.HttpUtils.makeRequest[LocalVariableDescriptor]

'isSuccessful' @ [47:23] ==> public final val Response.isSuccessful: Boolean[MyPropertyDescriptor]

'logger' @ [48:13] ==> private final val logger: Logger defined in net.corda.testing.http.HttpUtils[PropertyDescriptorImpl]

'error' @ [48:20] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'request' @ [48:68] ==> value-parameter request: Request defined in net.corda.testing.http.HttpUtils.makeRequest[ValueParameterDescriptorImpl]

'method' @ [48:76] ==> public open fun method(): (String..String?) defined in okhttp3.Request[JavaMethodDescriptor]

'request' @ [48:91] ==> value-parameter request: Request defined in net.corda.testing.http.HttpUtils.makeRequest[ValueParameterDescriptorImpl]

'url' @ [48:99] ==> public open fun url(): (HttpUrl..HttpUrl?) defined in okhttp3.Request[JavaMethodDescriptor]

'response' @ [48:122] ==> val response: (Response..Response?) defined in net.corda.testing.http.HttpUtils.makeRequest[LocalVariableDescriptor]

'code' @ [48:131] ==> public open fun code(): Int defined in okhttp3.Response[JavaMethodDescriptor]

'response' @ [48:151] ==> val response: (Response..Response?) defined in net.corda.testing.http.HttpUtils.makeRequest[LocalVariableDescriptor]

'body' @ [48:160] ==> public open fun body(): (ResponseBody..ResponseBody?) defined in okhttp3.Response[JavaMethodDescriptor]

'string' @ [48:167] ==> public final fun string(): (String..String?) defined in okhttp3.ResponseBody[JavaMethodDescriptor]

'response' @ [51:16] ==> val response: (Response..Response?) defined in net.corda.testing.http.HttpUtils.makeRequest[LocalVariableDescriptor]

'isSuccessful' @ [51:25] ==> public final val Response.isSuccessful: Boolean[MyPropertyDescriptor]

