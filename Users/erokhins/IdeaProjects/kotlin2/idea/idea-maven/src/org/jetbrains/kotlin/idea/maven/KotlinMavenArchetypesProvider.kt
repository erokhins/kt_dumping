'this' @ [33:21] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[ClassConstructorDescriptorImpl]

'getPluginVersion' @ [33:43] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'mavenSearchUrl' @ [35:29] ==> private final fun mavenSearchUrl(group: String, artifactId: String? = ..., version: String? = ..., packaging: String? = ..., rowsLimit: Int = ...): String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'lazy' @ [36:34] ==> public fun <T> lazy(initializer: () -> String?): Lazy<String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'versionPrefix' @ [36:41] ==> private final fun versionPrefix(version: String): String? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'kotlinPluginVersion' @ [36:55] ==> public final val kotlinPluginVersion: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'predefinedInternalMode' @ [39:17] ==> public final val predefinedInternalMode: Boolean? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'KotlinInternalMode' @ [39:43] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [39:62] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'lazy' @ [41:39] ==> public fun <T> lazy(initializer: () -> List<MavenArchetype>): Lazy<List<MavenArchetype>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<MavenArchetype>

'loadVersions' @ [43:13] ==> private final fun loadVersions(): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'ifEmpty' @ [43:28] ==> public inline fun <T, C : Collection<MavenArchetype>> List<MavenArchetype>.ifEmpty(body: () -> List<MavenArchetype>): List<MavenArchetype> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <C : Collection<T>> -> List<MavenArchetype>

'fallbackArchetypes' @ [43:38] ==> private final fun fallbackArchetypes(): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'fallbackArchetypes' @ [46:13] ==> private final fun fallbackArchetypes(): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'archetypesBlocking' @ [50:36] ==> private final val archetypesBlocking: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'toMutableList' @ [50:55] ==> public fun <T> Collection<MavenArchetype>.toMutableList(): MutableList<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'listOf' @ [53:13] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [54:22] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> MavenArchetype

'MavenArchetype' @ [54:28] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'it' @ [54:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.fallbackArchetypes.<anonymous>[ValueParameterDescriptorImpl]

'fallbackVersion' @ [54:71] ==> private final val fallbackVersion: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'connectAndApply' @ [57:16] ==> private final fun <R> connectAndApply(url: String, timeoutSeconds: Int = ..., block: (HttpURLConnection) -> List<MavenArchetype>): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> List<MavenArchetype>

'VERSIONS_LIST_URL' @ [57:32] ==> public final val VERSIONS_LIST_URL: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'urlConnection' @ [58:13] ==> value-parameter urlConnection: HttpURLConnection defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.loadVersions.<anonymous>[ValueParameterDescriptorImpl]

'inputStream' @ [58:27] ==> public final val HttpURLConnection.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'bufferedReader' @ [58:39] ==> @InlineOnly public inline fun InputStream.bufferedReader(charset: Charset = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [58:56] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> List<MavenArchetype>): List<MavenArchetype> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> List<MavenArchetype>

'extractVersions' @ [59:17] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'JsonParser' @ [59:33] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [59:46] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'reader' @ [59:52] ==> value-parameter reader: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.loadVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [65:13] ==> value-parameter root: JsonElement defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions[ValueParameterDescriptorImpl]

'asJsonObject' @ [65:18] ==> public final val JsonElement.asJsonObject: (JsonObject..JsonObject?)[MyPropertyDescriptor]

'get' @ [65:31] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asJsonObject' @ [66:22] ==> public final val JsonElement.asJsonObject: (JsonObject..JsonObject?)[MyPropertyDescriptor]

'get' @ [66:35] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asJsonArray' @ [67:22] ==> public final val JsonElement.asJsonArray: (JsonArray..JsonArray?)[MyPropertyDescriptor]

'map' @ [68:22] ==> public inline fun <T, R> Iterable<(JsonElement..JsonElement?)>.map(transform: ((JsonElement..JsonElement?)) -> (JsonObject..JsonObject?)): List<(JsonObject..JsonObject?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)
    <R> -> (com.google.gson.JsonObject..com.google.gson.JsonObject?)

'it' @ [68:28] ==> value-parameter it: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'asJsonObject' @ [68:31] ==> public final val JsonElement.asJsonObject: (JsonObject..JsonObject?)[MyPropertyDescriptor]

'map' @ [69:22] ==> public inline fun <T, R> Iterable<(JsonObject..JsonObject?)>.map(transform: ((JsonObject..JsonObject?)) -> MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.gson.JsonObject..com.google.gson.JsonObject?)
    <R> -> MavenArchetype

'MavenArchetype' @ [69:28] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'it' @ [69:43] ==> value-parameter it: (JsonObject..JsonObject?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [69:46] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asString' @ [69:55] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'it' @ [69:65] ==> value-parameter it: (JsonObject..JsonObject?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [69:68] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asString' @ [69:77] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'it' @ [69:87] ==> value-parameter it: (JsonObject..JsonObject?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [69:90] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asString' @ [69:99] ==> public final val JsonElement.asString: (String..String?)[MyPropertyDescriptor]

'let' @ [70:22] ==> @InlineOnly public inline fun <T, R> List<MavenArchetype>.let(block: (List<MavenArchetype>) -> List<MavenArchetype>): List<MavenArchetype> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<MavenArchetype>
    <R> -> List<MavenArchetype>

'versionPrefix' @ [71:38] ==> private final val versionPrefix: String? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'when {
                            internalMode || prefix == null -> versions
                            else -> versions.filter { it.version?.startsWith(prefix) ?: false }.ifEmpty { versions }
                        }' @ [73:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<MavenArchetype>, entry1: List<MavenArchetype>): List<MavenArchetype>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<MavenArchetype>

'internalMode' @ [74:29] ==> private final val internalMode: Boolean defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[PropertyDescriptorImpl]

'prefix' @ [74:45] ==> val prefix: String? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[LocalVariableDescriptor]

'versions' @ [74:63] ==> value-parameter versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'versions' @ [75:37] ==> value-parameter versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [75:46] ==> public inline fun <T> Iterable<MavenArchetype>.filter(predicate: (MavenArchetype) -> Boolean): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'it' @ [75:55] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [75:58] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'startsWith' @ [75:67] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [75:78] ==> val prefix: String? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[LocalVariableDescriptor]

'ifEmpty' @ [75:97] ==> public inline fun <T, C : Collection<MavenArchetype>> List<MavenArchetype>.ifEmpty(body: () -> List<MavenArchetype>): List<MavenArchetype> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <C : Collection<T>> -> List<MavenArchetype>

'versions' @ [75:107] ==> value-parameter versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'groupBy' @ [77:34] ==> public inline fun <T, K> Iterable<MavenArchetype>.groupBy(keySelector: (MavenArchetype) -> String): Map<String, List<MavenArchetype>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <K> -> String

'it' @ [77:44] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [77:47] ==> public final val groupId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [77:63] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [77:66] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versionPrefix' @ [77:85] ==> private final fun versionPrefix(version: String): String? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'it' @ [77:99] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [77:102] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'mapValues' @ [78:34] ==> public inline fun <K, V, R> Map<out String, List<MavenArchetype>>.mapValues(transform: (Map.Entry<String, List<MavenArchetype>>) -> MavenArchetype?): Map<String, MavenArchetype?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<MavenArchetype>
    <R> -> MavenArchetype?

'chooseVersion' @ [78:46] ==> private final fun chooseVersion(versions: List<MavenArchetype>): MavenArchetype? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'it' @ [78:60] ==> value-parameter it: Map.Entry<String, List<MavenArchetype>> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [78:63] ==> public abstract val value: List<MavenArchetype> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'mapNotNull' @ [79:34] ==> public inline fun <K, V, R : Any> Map<out String, MavenArchetype?>.mapNotNull(transform: (Map.Entry<String, MavenArchetype?>) -> MavenArchetype?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MavenArchetype?
    <R : Any> -> MavenArchetype

'it' @ [79:47] ==> value-parameter it: Map.Entry<String, MavenArchetype?> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.extractVersions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [79:50] ==> public abstract val value: MavenArchetype? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'versions' @ [83:16] ==> value-parameter versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.chooseVersion[ValueParameterDescriptorImpl]

'maxBy' @ [83:25] ==> public inline fun <T, R : Comparable<MavenVersionComparable>> Iterable<MavenArchetype>.maxBy(selector: (MavenArchetype) -> MavenVersionComparable): MavenArchetype? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> MavenVersionComparable

'MavenVersionComparable' @ [83:33] ==> public constructor MavenVersionComparable(p0: (String..String?)) defined in org.jetbrains.idea.maven.dom.MavenVersionComparable[JavaClassConstructorDescriptor]

'it' @ [83:56] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.chooseVersion.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [83:59] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'listOf' @ [87:17] ==> public fun <T> listOf(vararg elements: Pair<String, String?>): List<Pair<String, String?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String?>

'to' @ [88:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'group' @ [88:24] ==> value-parameter group: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[ValueParameterDescriptorImpl]

'to' @ [89:17] ==> public infix fun <A, B> String.to(that: String?): Pair<String, String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String?

'artifactId' @ [89:24] ==> value-parameter artifactId: String? = ... defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[ValueParameterDescriptorImpl]

'to' @ [90:17] ==> public infix fun <A, B> String.to(that: String?): Pair<String, String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String?

'version' @ [90:24] ==> value-parameter version: String? = ... defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[ValueParameterDescriptorImpl]

'to' @ [91:17] ==> public infix fun <A, B> String.to(that: String?): Pair<String, String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String?

'packaging' @ [91:24] ==> value-parameter packaging: String? = ... defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[ValueParameterDescriptorImpl]

'filter' @ [93:18] ==> public inline fun <T> Iterable<Pair<String, String?>>.filter(predicate: (Pair<String, String?>) -> Boolean): List<Pair<String, String?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String?>

'it' @ [93:27] ==> value-parameter it: Pair<String, String?> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [93:30] ==> public final val second: String? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'joinToString' @ [93:47] ==> public fun <T> Iterable<Pair<String, String?>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<String, String?>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String?>

'it' @ [93:86] ==> value-parameter it: Pair<String, String?> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [93:89] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [93:100] ==> value-parameter it: Pair<String, String?> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [93:103] ==> public final val second: String? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'q' @ [95:63] ==> val q: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[LocalVariableDescriptor]

'encodeURL' @ [95:65] ==> private final fun String.encodeURL(): (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]

'rowsLimit' @ [95:93] ==> value-parameter rowsLimit: Int = ... defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.mavenSearchUrl[ValueParameterDescriptorImpl]

'getInstance' @ [99:33] ==> public open fun getInstance(): (HttpConfigurable..HttpConfigurable?) defined in com.intellij.util.net.HttpConfigurable[JavaMethodDescriptor]

'openHttpConnection' @ [99:47] ==> @NotNull public open fun openHttpConnection(@NotNull p0: String): HttpURLConnection defined in com.intellij.util.net.HttpConfigurable[JavaMethodDescriptor]

'url' @ [99:66] ==> value-parameter url: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply[ValueParameterDescriptorImpl]

'use' @ [99:71] ==> private final fun <R> HttpURLConnection.use(block: (HttpURLConnection) -> R): R defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'toMillis' @ [100:44] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'timeoutSeconds' @ [100:53] ==> value-parameter timeoutSeconds: Int = ... defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply[ValueParameterDescriptorImpl]

'toLong' @ [100:68] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toInt' @ [100:78] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'urlConnection' @ [101:13] ==> value-parameter urlConnection: HttpURLConnection defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[ValueParameterDescriptorImpl]

'connectTimeout' @ [101:27] ==> public final var HttpURLConnection.connectTimeout: Int[MyPropertyDescriptor]

'timeout' @ [101:44] ==> val timeout: Int defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[LocalVariableDescriptor]

'urlConnection' @ [102:13] ==> value-parameter urlConnection: HttpURLConnection defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[ValueParameterDescriptorImpl]

'readTimeout' @ [102:27] ==> public final var HttpURLConnection.readTimeout: Int[MyPropertyDescriptor]

'timeout' @ [102:41] ==> val timeout: Int defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[LocalVariableDescriptor]

'urlConnection' @ [104:13] ==> value-parameter urlConnection: HttpURLConnection defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[ValueParameterDescriptorImpl]

'connect' @ [104:27] ==> public abstract fun connect(): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'invoke' @ [105:13] ==> public abstract operator fun invoke(p1: HttpURLConnection): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'urlConnection' @ [105:19] ==> value-parameter urlConnection: HttpURLConnection defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.connectAndApply.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [111:17] ==> public abstract operator fun invoke(p1: HttpURLConnection): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [111:23] ==> <this> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.use[ReceiverParameterDescriptorImpl]

'disconnect' @ [114:17] ==> public abstract fun disconnect(): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'encode' @ [117:49] ==> public open fun encode(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.net.URLEncoder[JavaMethodDescriptor]

'this' @ [117:56] ==> <this> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.encodeURL[ReceiverParameterDescriptorImpl]

'toRegex' @ [119:68] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'find' @ [119:78] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'version' @ [119:83] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider.versionPrefix[ValueParameterDescriptorImpl]

'value' @ [119:93] ==> public abstract val value: String defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

