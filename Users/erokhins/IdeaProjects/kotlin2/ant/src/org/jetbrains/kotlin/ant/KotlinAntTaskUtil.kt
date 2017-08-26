'SoftReference' @ [28:34] ==> public constructor SoftReference<T : (Any..Any?)>(p0: ClassLoader?) defined in java.lang.ref.SoftReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassLoader?

'getValue' @ [30:34] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'+' @ [32:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [32:34] ==> <this> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[LazyClassReceiverParameterDescriptor]

'java' @ [32:46] ==> public val <T> KClass<out KotlinAntTaskUtil>.java: Class<out KotlinAntTaskUtil> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAntTaskUtil)

'name' @ [32:51] ==> public final val <T : (Any..Any?)> Class<out KotlinAntTaskUtil>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out KotlinAntTaskUtil)

'replace' @ [32:56] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [33:29] ==> <this> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[LazyClassReceiverParameterDescriptor]

'java' @ [33:41] ==> public val <T> KClass<out KotlinAntTaskUtil>.java: Class<out KotlinAntTaskUtil> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAntTaskUtil)

'getResource' @ [33:46] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.Class[JavaMethodDescriptor]

'resourcePath' @ [33:58] ==> val resourcePath: String defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.libPath.<anonymous>[LocalVariableDescriptor]

'openConnection' @ [33:72] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'UnsupportedOperationException' @ [34:38] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'File' @ [35:30] ==> public constructor File(p0: (URI..URI?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jarConnection' @ [35:35] ==> val jarConnection: JarURLConnection defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.libPath.<anonymous>[LocalVariableDescriptor]

'jarFileURL' @ [35:49] ==> public final val JarURLConnection.jarFileURL: (URL..URL?)[MyPropertyDescriptor]

'toURI' @ [35:60] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'antTaskJarPath' @ [37:9] ==> val antTaskJarPath: File defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.libPath.<anonymous>[LocalVariableDescriptor]

'parentFile' @ [37:24] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'jar' @ [40:30] ==> private final fun jar(name: String): Lazy<File> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[SimpleFunctionDescriptorImpl]

'jar' @ [41:29] ==> private final fun jar(name: String): Lazy<File> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[SimpleFunctionDescriptorImpl]

'jar' @ [42:29] ==> private final fun jar(name: String): Lazy<File> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[SimpleFunctionDescriptorImpl]

'lazy' @ [44:37] ==> public fun <T> lazy(initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [45:9] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'libPath' @ [45:14] ==> private final val libPath: File defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[PropertyDescriptorImpl]

'name' @ [45:23] ==> value-parameter name: String defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.jar[ValueParameterDescriptorImpl]

'apply' @ [45:29] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'!' @ [46:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [46:18] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'IllegalStateException' @ [47:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'name' @ [47:102] ==> value-parameter name: String defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.jar[ValueParameterDescriptorImpl]

'Synchronized' @ [52:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'classLoaderRef' @ [54:22] ==> private final var classLoaderRef: SoftReference<ClassLoader?> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[PropertyDescriptorImpl]

'get' @ [54:37] ==> public open fun get(): ClassLoader? defined in java.lang.ref.SoftReference[JavaMethodDescriptor]

'cached' @ [55:13] ==> val cached: ClassLoader? defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'cached' @ [55:36] ==> val cached: ClassLoader? defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'this' @ [57:24] ==> <this> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[LazyClassReceiverParameterDescriptor]

'java' @ [57:36] ==> public val <T> KClass<out KotlinAntTaskUtil>.java: Class<out KotlinAntTaskUtil> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAntTaskUtil)

'classLoader' @ [57:41] ==> public final val <T : (Any..Any?)> Class<out KotlinAntTaskUtil>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out KotlinAntTaskUtil)

'myLoader' @ [58:13] ==> val myLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'myLoader' @ [58:49] ==> val myLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'preloadClasses' @ [60:48] ==> public open fun preloadClasses(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: Int, p2: (ClassLoader..ClassLoader?), p3: (ClassCondition..ClassCondition?)): (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.preloading.ClassPreloadingUtils[JavaMethodDescriptor]

'listOf' @ [60:63] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'compilerJar' @ [60:70] ==> public final val compilerJar: File defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[PropertyDescriptorImpl]

'DEFAULT_CLASS_NUMBER_ESTIMATE' @ [60:94] ==> public const final val DEFAULT_CLASS_NUMBER_ESTIMATE: Int defined in org.jetbrains.kotlin.preloading.Preloader[JavaPropertyDescriptor]

'myLoader' @ [60:125] ==> val myLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'classLoaderRef' @ [61:9] ==> private final var classLoaderRef: SoftReference<ClassLoader?> defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil[PropertyDescriptorImpl]

'SoftReference' @ [61:26] ==> public constructor SoftReference<T : (Any..Any?)>(p0: ClassLoader?) defined in java.lang.ref.SoftReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassLoader?

'classLoader' @ [61:40] ==> val classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'classLoader' @ [63:16] ==> val classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.ant.KotlinAntTaskUtil.getOrCreateClassLoader[LocalVariableDescriptor]

'owningTarget' @ [68:13] ==> public final var Task.owningTarget: (Target..Target?)[MyPropertyDescriptor]

'name' @ [68:27] ==> public final var Target.name: (String..String?)[MyPropertyDescriptor]

'project' @ [68:35] ==> public final var Task.project: (Project..Project?)[MyPropertyDescriptor]

'name' @ [68:44] ==> public final var Project.name: (String..String?)[MyPropertyDescriptor]

