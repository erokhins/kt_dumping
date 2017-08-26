'setProperty' @ [22:12] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'args' @ [24:9] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.serialization.builtins.main[ValueParameterDescriptorImpl]

'size' @ [24:14] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'println' @ [25:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [36:19] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'args' @ [36:24] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.serialization.builtins.main[ValueParameterDescriptorImpl]

'args' @ [38:19] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.serialization.builtins.main[ValueParameterDescriptorImpl]

'drop' @ [38:24] ==> public fun <T> Array<out String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [38:32] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'assert' @ [39:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'srcDirs' @ [39:12] ==> val srcDirs: List<File> defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'isNotEmpty' @ [39:20] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'srcDirs' @ [41:19] ==> val srcDirs: List<File> defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'filterNot' @ [41:27] ==> public inline fun <T> Iterable<File>.filterNot(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'assert' @ [42:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'missing' @ [42:12] ==> val missing: List<File> defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'isEmpty' @ [42:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'missing' @ [42:73] ==> val missing: List<File> defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'BuiltInsSerializer' @ [44:5] ==> public constructor BuiltInsSerializer(dependOnOldBuiltIns: Boolean) defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[ClassConstructorDescriptorImpl]

'serialize' @ [44:53] ==> public final fun serialize(destDir: File, srcDirs: List<File>, extraClassPath: List<File>, onComplete: (totalSize: Int, totalFiles: Int) -> Unit): Unit defined in org.jetbrains.kotlin.serialization.builtins.BuiltInsSerializer[SimpleFunctionDescriptorImpl]

'destDir' @ [44:63] ==> val destDir: File defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'srcDirs' @ [44:72] ==> val srcDirs: List<File> defined in org.jetbrains.kotlin.serialization.builtins.main[LocalVariableDescriptor]

'listOf' @ [44:81] ==> @InlineOnly public inline fun <T> listOf(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'println' @ [45:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'totalSize' @ [45:40] ==> value-parameter totalSize: Int defined in org.jetbrains.kotlin.serialization.builtins.main.<anonymous>[ValueParameterDescriptorImpl]

'totalFiles' @ [45:54] ==> value-parameter totalFiles: Int defined in org.jetbrains.kotlin.serialization.builtins.main.<anonymous>[ValueParameterDescriptorImpl]

