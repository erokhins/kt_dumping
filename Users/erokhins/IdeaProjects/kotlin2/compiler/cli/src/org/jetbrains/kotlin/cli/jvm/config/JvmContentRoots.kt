'add' @ [36:5] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [36:30] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmClasspathRoot' @ [36:45] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[ClassConstructorDescriptorImpl]

'file' @ [36:62] ==> value-parameter file: File defined in org.jetbrains.kotlin.cli.jvm.config.addJvmClasspathRoot[ValueParameterDescriptorImpl]

'files' @ [40:5] ==> value-parameter files: List<File> defined in org.jetbrains.kotlin.cli.jvm.config.addJvmClasspathRoots[ValueParameterDescriptorImpl]

'forEach' @ [40:11] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'this' @ [40:19] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.config.addJvmClasspathRoots[ReceiverParameterDescriptorImpl]

'getList' @ [44:13] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [44:42] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'filterIsInstance' @ [44:57] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<JvmClasspathRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JvmClasspathRoot

'map' @ [44:94] ==> public inline fun <T, R> Iterable<JvmClasspathRoot>.map(transform: (JvmClasspathRoot) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClasspathRoot
    <R> -> File

'JvmOverloads' @ [46:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'add' @ [48:5] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [48:30] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JavaSourceRoot' @ [48:45] ==> public constructor JavaSourceRoot(file: File, packagePrefix: String?) defined in org.jetbrains.kotlin.cli.jvm.config.JavaSourceRoot[ClassConstructorDescriptorImpl]

'file' @ [48:60] ==> value-parameter file: File defined in org.jetbrains.kotlin.cli.jvm.config.addJavaSourceRoot[ValueParameterDescriptorImpl]

'packagePrefix' @ [48:66] ==> value-parameter packagePrefix: String? = ... defined in org.jetbrains.kotlin.cli.jvm.config.addJavaSourceRoot[ValueParameterDescriptorImpl]

'JvmOverloads' @ [51:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'files' @ [53:5] ==> value-parameter files: List<File> defined in org.jetbrains.kotlin.cli.jvm.config.addJavaSourceRoots[ValueParameterDescriptorImpl]

'forEach' @ [53:11] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'addJavaSourceRoot' @ [53:21] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoot(file: File, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[SimpleFunctionDescriptorImpl]

'it' @ [53:39] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.config.addJavaSourceRoots.<anonymous>[ValueParameterDescriptorImpl]

'packagePrefix' @ [53:43] ==> value-parameter packagePrefix: String? = ... defined in org.jetbrains.kotlin.cli.jvm.config.addJavaSourceRoots[ValueParameterDescriptorImpl]

'getList' @ [57:13] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [57:42] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'mapNotNullTo' @ [57:57] ==> public inline fun <T, R : Any, C : MutableCollection<in String>> Iterable<(ContentRoot..ContentRoot?)>.mapNotNullTo(destination: LinkedHashSet<String> /* = LinkedHashSet<String> */, transform: ((ContentRoot..ContentRoot?)) -> String?): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)
    <R : Any> -> String
    <C : MutableCollection<in R>> -> LinkedHashSet<String>

'linkedSetOf' @ [57:70] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (root) {
                    is KotlinSourceRoot -> root.path
                    is JavaSourceRoot -> root.file.path
                    else -> null
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'root' @ [58:23] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.config.<get-javaSourceRoots>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [59:44] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.config.<get-javaSourceRoots>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [59:49] ==> public final val path: String defined in org.jetbrains.kotlin.config.KotlinSourceRoot[DeserializedPropertyDescriptor]

'root' @ [60:42] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.config.<get-javaSourceRoots>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [60:47] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JavaSourceRoot[PropertyDescriptorImpl]

'path' @ [60:52] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

