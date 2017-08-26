'ConcurrentHashMap' @ [25:34] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> ModuleMapping

'moduleName' @ [29:43] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule[ValueParameterDescriptorImpl]

'ModuleMapping' @ [29:56] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'MAPPING_FILE_EXT' @ [29:70] ==> @field:JvmField public final val MAPPING_FILE_EXT: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'classLoader' @ [30:13] ==> private final val classLoader: ClassLoader defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider[PropertyDescriptorImpl]

'getResourceAsStream' @ [30:25] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'resourcePath' @ [30:45] ==> val resourcePath: String defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule[LocalVariableDescriptor]

'use' @ [30:60] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> ModuleMapping): ModuleMapping defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> ModuleMapping

'ModuleMapping' @ [31:17] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'create' @ [31:31] ==> public final fun create(bytes: ByteArray?, debugName: String, configuration: DeserializationConfiguration): ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedSimpleFunctionDescriptor]

'stream' @ [31:38] ==> value-parameter stream: InputStream defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [31:45] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'resourcePath' @ [31:58] ==> val resourcePath: String defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule[LocalVariableDescriptor]

'Default' @ [31:101] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'module2Mapping' @ [38:9] ==> private final val module2Mapping: ConcurrentHashMap<String, ModuleMapping> defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider[PropertyDescriptorImpl]

'putIfAbsent' @ [38:24] ==> public open fun putIfAbsent(p0: (String..String?), p1: (ModuleMapping..ModuleMapping?)): (ModuleMapping..ModuleMapping?) defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'moduleName' @ [38:36] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule[ValueParameterDescriptorImpl]

'mapping' @ [38:48] ==> val mapping: ModuleMapping? defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.registerModule[LocalVariableDescriptor]

'EMPTY' @ [38:73] ==> @field:JvmField public final val EMPTY: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'module2Mapping' @ [42:16] ==> private final val module2Mapping: ConcurrentHashMap<String, ModuleMapping> defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider[PropertyDescriptorImpl]

'values' @ [42:31] ==> public open val values: MutableCollection<ModuleMapping> defined in java.util.concurrent.ConcurrentHashMap[JavaPropertyDescriptor]

'mapNotNull' @ [42:38] ==> public inline fun <T, R : Any> Iterable<ModuleMapping>.mapNotNull(transform: (ModuleMapping) -> PackageParts?): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleMapping
    <R : Any> -> PackageParts

'it' @ [42:51] ==> value-parameter it: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'findPackageParts' @ [42:54] ==> public final fun findPackageParts(packageFqName: String): PackageParts? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [42:71] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.findPackageParts[ValueParameterDescriptorImpl]

'flatMap' @ [42:88] ==> public inline fun <T, R> Iterable<PackageParts>.flatMap(transform: (PackageParts) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <R> -> String

'it' @ [42:98] ==> value-parameter it: PackageParts defined in org.jetbrains.kotlin.load.kotlin.reflect.RuntimePackagePartProvider.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'parts' @ [42:101] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'distinct' @ [42:109] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TODO' @ [46:82] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

