'asList' @ [29:12] ==> @NotNull @Override public open fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'filterClassFiles' @ [29:21] ==> public fun List<OutputFile>.filterClassFiles(): Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'filter' @ [33:12] ==> public inline fun <T> Iterable<OutputFile>.filter(predicate: (OutputFile) -> Boolean): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'it' @ [33:21] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.codegen.filterClassFiles.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [33:24] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'endsWith' @ [33:37] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'addCompiledParts' @ [37:9] ==> private fun Iterable<PackageParts>.addCompiledParts(state: GenerationState): List<PackageParts> defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'state' @ [37:26] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.addCompiledPartsAndSort[ValueParameterDescriptorImpl]

'sortedBy' @ [37:33] ==> public inline fun <T, R : Comparable<String>> Iterable<PackageParts>.sortedBy(crossinline selector: (PackageParts) -> String?): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <R : Comparable<R>> -> String

'it' @ [37:44] ==> value-parameter it: PackageParts defined in org.jetbrains.kotlin.codegen.addCompiledPartsAndSort.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [37:47] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'state' @ [40:28] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.addCompiledParts[ValueParameterDescriptorImpl]

'incrementalCacheForThisTarget' @ [40:34] ==> public final val incrementalCacheForThisTarget: IncrementalCache? defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'this' @ [40:74] ==> <this> defined in org.jetbrains.kotlin.codegen.addCompiledParts[ReceiverParameterDescriptorImpl]

'toList' @ [40:79] ==> public fun <T> Iterable<PackageParts>.toList(): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts

'incrementalCache' @ [41:29] ==> val incrementalCache: IncrementalCache defined in org.jetbrains.kotlin.codegen.addCompiledParts[LocalVariableDescriptor]

'getModuleMappingData' @ [41:46] ==> public abstract fun getModuleMappingData(): ByteArray? defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'this' @ [41:79] ==> <this> defined in org.jetbrains.kotlin.codegen.addCompiledParts[ReceiverParameterDescriptorImpl]

'toList' @ [41:84] ==> public fun <T> Iterable<PackageParts>.toList(): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts

'ModuleMapping' @ [43:19] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'create' @ [43:33] ==> public final fun create(bytes: ByteArray?, debugName: String, configuration: DeserializationConfiguration): ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedSimpleFunctionDescriptor]

'moduleMappingData' @ [43:40] ==> val moduleMappingData: ByteArray defined in org.jetbrains.kotlin.codegen.addCompiledParts[LocalVariableDescriptor]

'state' @ [43:76] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.addCompiledParts[ValueParameterDescriptorImpl]

'deserializationConfiguration' @ [43:82] ==> public final val deserializationConfiguration: DeserializationConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'incrementalCache' @ [45:5] ==> val incrementalCache: IncrementalCache defined in org.jetbrains.kotlin.codegen.addCompiledParts[LocalVariableDescriptor]

'getObsoletePackageParts' @ [45:22] ==> public abstract fun getObsoletePackageParts(): Collection<String> defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCache[DeserializedSimpleFunctionDescriptor]

'forEach' @ [45:48] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'internalName' @ [46:25] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[ValueParameterDescriptorImpl]

'substringBeforeLast' @ [46:38] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [46:67] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'internalName' @ [47:20] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[ValueParameterDescriptorImpl]

'substringAfterLast' @ [47:33] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mapping' @ [48:9] ==> val mapping: ModuleMapping defined in org.jetbrains.kotlin.codegen.addCompiledParts[LocalVariableDescriptor]

'findPackageParts' @ [48:17] ==> public final fun findPackageParts(packageFqName: String): PackageParts? defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedSimpleFunctionDescriptor]

'qualifier' @ [48:34] ==> val qualifier: String defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[LocalVariableDescriptor]

'removePart' @ [48:46] ==> public final fun removePart(shortName: String): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'name' @ [48:57] ==> val name: String defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[LocalVariableDescriptor]

'this' @ [51:13] ==> <this> defined in org.jetbrains.kotlin.codegen.addCompiledParts[ReceiverParameterDescriptorImpl]

'mapping' @ [51:20] ==> val mapping: ModuleMapping defined in org.jetbrains.kotlin.codegen.addCompiledParts[LocalVariableDescriptor]

'packageFqName2Parts' @ [51:28] ==> public final val packageFqName2Parts: Map<String, PackageParts> defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedPropertyDescriptor]

'values' @ [51:48] ==> public abstract val values: Collection<PackageParts> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'groupBy' @ [52:14] ==> public inline fun <T, K> Iterable<PackageParts>.groupBy(keySelector: (PackageParts) -> String): Map<String, List<PackageParts>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts
    <K> -> String

'it' @ [52:24] ==> value-parameter it: PackageParts defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [52:27] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'map' @ [53:14] ==> public inline fun <K, V, R> Map<out String, List<PackageParts>>.map(transform: (Map.Entry<String, List<PackageParts>>) -> PackageParts): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PackageParts>
    <R> -> PackageParts

'component1' @ [53:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<PackageParts>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PackageParts>

'component2' @ [53:36] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<PackageParts>>.component2(): List<PackageParts> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PackageParts>

'PackageParts' @ [54:17] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedClassConstructorDescriptor]

'packageFqName' @ [54:30] ==> val packageFqName: String defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[LocalVariableDescriptor]

'apply' @ [54:45] ==> @InlineOnly public inline fun <T> PackageParts.apply(block: PackageParts.() -> Unit): PackageParts defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts

'allOldPackageParts' @ [55:21] ==> val allOldPackageParts: List<PackageParts> defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>[LocalVariableDescriptor]

'forEach' @ [55:40] ==> @HidesMembers public inline fun <T> Iterable<PackageParts>.forEach(action: (PackageParts) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts

'this' @ [55:66] ==> <this> defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'packageParts' @ [55:74] ==> value-parameter packageParts: PackageParts defined in org.jetbrains.kotlin.codegen.addCompiledParts.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ByteArrayOutputStream' @ [61:25] ==> public constructor ByteArrayOutputStream(p0: Int) defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'DataOutputStream' @ [62:15] ==> public constructor DataOutputStream(p0: (OutputStream..OutputStream?)) defined in com.intellij.util.io.DataOutputStream[JavaClassConstructorDescriptor]

'moduleMapping' @ [62:32] ==> val moduleMapping: ByteArrayOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'JvmMetadataVersion' @ [63:19] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [63:38] ==> @field:JvmField public final val INSTANCE: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[DeserializedPropertyDescriptor]

'toArray' @ [63:47] ==> public final fun toArray(): IntArray defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'out' @ [64:5] ==> val out: DataOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'writeInt' @ [64:9] ==> public final fun writeInt(p0: Int): Unit defined in com.intellij.util.io.DataOutputStream[JavaMethodDescriptor]

'version' @ [64:18] ==> val version: IntArray defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'size' @ [64:26] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'version' @ [65:20] ==> val version: IntArray defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'out' @ [66:9] ==> val out: DataOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'writeInt' @ [66:13] ==> public final fun writeInt(p0: Int): Unit defined in com.intellij.util.io.DataOutputStream[JavaMethodDescriptor]

'number' @ [66:22] ==> val number: Int defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'build' @ [68:5] ==> public open fun build(): (JvmPackageTable.PackageTable..JvmPackageTable.PackageTable?) defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable.Builder[JavaMethodDescriptor]

'writeTo' @ [68:13] ==> public open fun writeTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.jvm.JvmPackageTable.PackageTable[JavaMethodDescriptor]

'out' @ [68:21] ==> val out: DataOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'out' @ [69:5] ==> val out: DataOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'flush' @ [69:9] ==> public open fun flush(): Unit defined in com.intellij.util.io.DataOutputStream[JavaMethodDescriptor]

'moduleMapping' @ [70:12] ==> val moduleMapping: ByteArrayOutputStream defined in org.jetbrains.kotlin.codegen.serializeToByteArray[LocalVariableDescriptor]

'toByteArray' @ [70:26] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

