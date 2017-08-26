'Test' @ [29:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'File' @ [31:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [31:25] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest[PropertyDescriptorImpl]

'assertTrue' @ [32:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [32:44] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions[LocalVariableDescriptor]

'exists' @ [32:49] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [34:20] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions[LocalVariableDescriptor]

'bufferedReader' @ [34:25] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [34:42] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> (JsonElement..JsonElement?)): (JsonElement..JsonElement?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)

'JsonParser' @ [35:13] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [35:26] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'it' @ [35:32] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'KotlinMavenArchetypesProvider' @ [38:24] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedClassConstructorDescriptor]

'extractVersions' @ [38:93] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedSimpleFunctionDescriptor]

'json' @ [38:109] ==> val json: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions[LocalVariableDescriptor]

'assertEquals' @ [40:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'listOf' @ [41:17] ==> public fun <T> listOf(vararg elements: MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'MavenArchetype' @ [42:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [43:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'sortedBy' @ [44:19] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [44:30] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [44:33] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [44:52] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [44:55] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versions' @ [45:17] ==> val versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions[LocalVariableDescriptor]

'sortedBy' @ [45:26] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [45:37] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [45:40] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [45:59] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersions.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [45:62] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'Test' @ [49:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'File' @ [51:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [51:25] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest[PropertyDescriptorImpl]

'assertTrue' @ [52:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [52:44] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin[LocalVariableDescriptor]

'exists' @ [52:49] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [54:20] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin[LocalVariableDescriptor]

'bufferedReader' @ [54:25] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [54:42] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> (JsonElement..JsonElement?)): (JsonElement..JsonElement?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)

'JsonParser' @ [55:13] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [55:26] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'it' @ [55:32] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin.<anonymous>[ValueParameterDescriptorImpl]

'KotlinMavenArchetypesProvider' @ [58:24] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedClassConstructorDescriptor]

'extractVersions' @ [58:98] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedSimpleFunctionDescriptor]

'json' @ [58:114] ==> val json: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin[LocalVariableDescriptor]

'assertEquals' @ [60:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'listOf' @ [61:17] ==> public fun <T> listOf(element: MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'MavenArchetype' @ [62:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'sortedBy' @ [63:19] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [63:30] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [63:33] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [63:52] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [63:55] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versions' @ [64:17] ==> val versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin[LocalVariableDescriptor]

'sortedBy' @ [64:26] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [64:37] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [64:40] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [64:59] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsNewPlugin.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [64:62] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'Test' @ [68:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'File' @ [70:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [70:25] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest[PropertyDescriptorImpl]

'assertTrue' @ [71:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [71:44] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode[LocalVariableDescriptor]

'exists' @ [71:49] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [73:20] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode[LocalVariableDescriptor]

'bufferedReader' @ [73:25] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [73:42] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> (JsonElement..JsonElement?)): (JsonElement..JsonElement?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)

'JsonParser' @ [74:13] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [74:26] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'it' @ [74:32] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode.<anonymous>[ValueParameterDescriptorImpl]

'KotlinMavenArchetypesProvider' @ [77:24] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedClassConstructorDescriptor]

'extractVersions' @ [77:92] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedSimpleFunctionDescriptor]

'json' @ [77:108] ==> val json: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode[LocalVariableDescriptor]

'assertEquals' @ [79:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'listOf' @ [80:17] ==> public fun <T> listOf(vararg elements: MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'MavenArchetype' @ [81:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [82:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [83:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'sortedBy' @ [84:19] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [84:30] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [84:33] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [84:52] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [84:55] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versions' @ [85:17] ==> val versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode[LocalVariableDescriptor]

'sortedBy' @ [85:26] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [85:37] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [85:40] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [85:59] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsInternalMode.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [85:62] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'Test' @ [89:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'File' @ [91:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [91:25] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest[PropertyDescriptorImpl]

'assertTrue' @ [92:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [92:44] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion[LocalVariableDescriptor]

'exists' @ [92:49] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [94:20] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion[LocalVariableDescriptor]

'bufferedReader' @ [94:25] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [94:42] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> (JsonElement..JsonElement?)): (JsonElement..JsonElement?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)

'JsonParser' @ [95:13] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [95:26] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'it' @ [95:32] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion.<anonymous>[ValueParameterDescriptorImpl]

'KotlinMavenArchetypesProvider' @ [98:24] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedClassConstructorDescriptor]

'extractVersions' @ [98:101] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedSimpleFunctionDescriptor]

'json' @ [98:117] ==> val json: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion[LocalVariableDescriptor]

'assertEquals' @ [100:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'listOf' @ [101:17] ==> public fun <T> listOf(vararg elements: MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'MavenArchetype' @ [102:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [103:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [104:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'sortedBy' @ [105:19] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [105:30] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [105:33] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [105:52] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [105:55] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versions' @ [106:17] ==> val versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion[LocalVariableDescriptor]

'sortedBy' @ [106:26] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [106:37] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [106:40] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [106:59] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsTooDifferentPluginVersion.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [106:62] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'Test' @ [110:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'File' @ [112:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [112:25] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest[PropertyDescriptorImpl]

'assertTrue' @ [113:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'file' @ [113:44] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin[LocalVariableDescriptor]

'exists' @ [113:49] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [115:20] ==> val file: File defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin[LocalVariableDescriptor]

'bufferedReader' @ [115:25] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [115:42] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> (JsonElement..JsonElement?)): (JsonElement..JsonElement?) defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> (com.google.gson.JsonElement..com.google.gson.JsonElement?)

'JsonParser' @ [116:13] ==> public constructor JsonParser() defined in com.google.gson.JsonParser[JavaClassConstructorDescriptor]

'parse' @ [116:26] ==> public open fun parse(p0: (Reader..Reader?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonParser[JavaMethodDescriptor]

'it' @ [116:32] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin.<anonymous>[ValueParameterDescriptorImpl]

'KotlinMavenArchetypesProvider' @ [119:24] ==> public constructor KotlinMavenArchetypesProvider(kotlinPluginVersion: String, predefinedInternalMode: Boolean?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedClassConstructorDescriptor]

'extractVersions' @ [119:75] ==> internal final fun extractVersions(root: JsonElement): List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProvider[DeserializedSimpleFunctionDescriptor]

'json' @ [119:91] ==> val json: (JsonElement..JsonElement?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin[LocalVariableDescriptor]

'assertEquals' @ [121:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'listOf' @ [122:17] ==> public fun <T> listOf(vararg elements: MavenArchetype): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype

'MavenArchetype' @ [123:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [124:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'MavenArchetype' @ [125:25] ==> public constructor MavenArchetype(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @Nullable p3: String?, @Nullable p4: String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaClassConstructorDescriptor]

'sortedBy' @ [126:19] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [126:30] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [126:33] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [126:52] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [126:55] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'versions' @ [127:17] ==> val versions: List<MavenArchetype> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin[LocalVariableDescriptor]

'sortedBy' @ [127:26] ==> public inline fun <T, R : Comparable<String>> Iterable<MavenArchetype>.sortedBy(crossinline selector: (MavenArchetype) -> String?): List<MavenArchetype> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenArchetype
    <R : Comparable<R>> -> String

'it' @ [127:37] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [127:40] ==> public final val artifactId: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

'it' @ [127:59] ==> value-parameter it: MavenArchetype defined in org.jetbrains.kotlin.idea.maven.KotlinMavenArchetypesProviderTest.extractVersionsSnapshotPlugin.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [127:62] ==> public final val version: (String..String?) defined in org.jetbrains.idea.maven.model.MavenArchetype[JavaPropertyDescriptor]

