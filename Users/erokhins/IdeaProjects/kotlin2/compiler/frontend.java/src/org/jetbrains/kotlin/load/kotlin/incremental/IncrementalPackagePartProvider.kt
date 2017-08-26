'storageManager' @ [32:34] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [32:49] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<ModuleMapping>): NotNullLazyValue<List<ModuleMapping>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<ModuleMapping>

'incrementalCaches' @ [33:9] ==> value-parameter incrementalCaches: List<IncrementalCache> defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.<init>[ValueParameterDescriptorImpl]

'map' @ [33:27] ==> public inline fun <T, R> Iterable<IncrementalCache>.map(transform: (IncrementalCache) -> ModuleMapping): List<ModuleMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCache
    <R> -> ModuleMapping

'ModuleMapping' @ [34:13] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'create' @ [34:27] ==> public final fun create(bytes: ByteArray?, debugName: String, configuration: DeserializationConfiguration): ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedSimpleFunctionDescriptor]

'cache' @ [34:34] ==> value-parameter cache: IncrementalCache defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.moduleMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getModuleMappingData' @ [34:40] ==> public abstract fun getModuleMappingData(): ByteArray? defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'deserializationConfiguration' @ [34:81] ==> public final lateinit var deserializationConfiguration: DeserializationConfiguration defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider[PropertyDescriptorImpl]

'invoke' @ [39:17] ==> public abstract fun invoke(): List<ModuleMapping> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'mapNotNull' @ [39:34] ==> public inline fun <T, R : Any> Iterable<ModuleMapping>.mapNotNull(transform: (ModuleMapping) -> PackageParts?): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleMapping
    <R : Any> -> PackageParts

'it' @ [39:47] ==> value-parameter it: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'findPackageParts' @ [39:50] ==> public final fun findPackageParts(packageFqName: String): PackageParts? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [39:67] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.findPackageParts[ValueParameterDescriptorImpl]

'flatMap' @ [39:84] ==> public inline fun <T, R> Iterable<PackageParts>.flatMap(transform: (PackageParts) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <R> -> String

'it' @ [39:94] ==> value-parameter it: PackageParts defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.findPackageParts.<anonymous>[ValueParameterDescriptorImpl]

'parts' @ [39:97] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'parent' @ [40:17] ==> private final val parent: PackagePartProvider defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider[PropertyDescriptorImpl]

'findPackageParts' @ [40:24] ==> public abstract fun findPackageParts(packageFqName: String): List<String> defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [40:41] ==> value-parameter packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider.findPackageParts[ValueParameterDescriptorImpl]

'distinct' @ [40:57] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TODO' @ [44:82] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

