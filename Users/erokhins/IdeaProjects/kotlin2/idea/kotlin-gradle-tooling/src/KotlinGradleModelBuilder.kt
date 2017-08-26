'listOf' @ [63:40] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [65:33] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'linkedMapOf' @ [66:32] ==> public fun <K, V> linkedMapOf(vararg pairs: Pair<String, String>): LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [67:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [68:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'listOf' @ [70:31] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'create' @ [76:36] ==> public open fun create(@NotNull p0: Project, @Nullable p1: Exception?, @NotNull p2: String): (ErrorMessageBuilder..ErrorMessageBuilder?) defined in org.jetbrains.plugins.gradle.tooling.ErrorMessageBuilder[JavaMethodDescriptor]

'project' @ [76:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getErrorMessageBuilder[ValueParameterDescriptorImpl]

'e' @ [76:52] ==> value-parameter e: Exception defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getErrorMessageBuilder[ValueParameterDescriptorImpl]

'withDescription' @ [76:79] ==> public open fun withDescription(@NotNull p0: String): (ErrorMessageBuilder..ErrorMessageBuilder?) defined in org.jetbrains.plugins.gradle.tooling.ErrorMessageBuilder[JavaMethodDescriptor]

'modelName' @ [79:58] ==> value-parameter modelName: String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.canBuild[ValueParameterDescriptorImpl]

'java' @ [79:96] ==> public val <T> KClass<KotlinGradleModel>.java: Class<KotlinGradleModel> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinGradleModel

'name' @ [79:101] ==> public final val <T : (Any..Any?)> Class<KotlinGradleModel>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinGradleModel

'project' @ [82:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getImplements[ValueParameterDescriptorImpl]

'configurations' @ [82:47] ==> public final val Project.configurations: (ConfigurationContainer..ConfigurationContainer?)[MyPropertyDescriptor]

'findByName' @ [82:62] ==> public abstract fun findByName(p0: (String..String?)): (Configuration..Configuration?) defined in org.gradle.api.artifacts.ConfigurationContainer[JavaMethodDescriptor]

'implementsConfiguration' @ [83:43] ==> val implementsConfiguration: Configuration defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getImplements[LocalVariableDescriptor]

'dependencies' @ [83:67] ==> public final val Configuration.dependencies: (DependencySet..DependencySet?)[MyPropertyDescriptor]

'filterIsInstance' @ [83:80] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ProjectDependency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ProjectDependency

'firstOrNull' @ [83:118] ==> public fun <T> List<ProjectDependency>.firstOrNull(): ProjectDependency? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProjectDependency

'implementsProjectDependency' @ [84:16] ==> val implementsProjectDependency: ProjectDependency? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getImplements[LocalVariableDescriptor]

'dependencyProject' @ [84:45] ==> public final val ProjectDependency.dependencyProject: (Project..Project?)[MyPropertyDescriptor]

'LinkedList' @ [88:25] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Project

'toProcess' @ [89:9] ==> val toProcess: LinkedList<Project> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'add' @ [89:19] ==> public open fun add(element: Project): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'startingProject' @ [89:23] ==> value-parameter startingProject: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[ValueParameterDescriptorImpl]

'HashSet' @ [90:25] ==> public final fun <E> <init>(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'HashSet' @ [91:22] ==> public final fun <E> <init>(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'result' @ [92:9] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'add' @ [92:16] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'startingProject' @ [92:20] ==> value-parameter startingProject: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[ValueParameterDescriptorImpl]

'path' @ [92:36] ==> public final val Project.path: (String..String?)[MyPropertyDescriptor]

'toProcess' @ [94:16] ==> val toProcess: LinkedList<Project> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'isNotEmpty' @ [94:26] ==> @InlineOnly public inline fun <T> Collection<Project>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project

'toProcess' @ [95:27] ==> val toProcess: LinkedList<Project> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'pollFirst' @ [95:37] ==> public open fun pollFirst(): (Project..Project?) defined in java.util.LinkedList[JavaMethodDescriptor]

'processed' @ [96:13] ==> val processed: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'add' @ [96:23] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'project' @ [96:27] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'path' @ [96:35] ==> public final val Project.path: (String..String?)[MyPropertyDescriptor]

'!' @ [98:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'project' @ [98:18] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'plugins' @ [98:26] ==> public final val Project.plugins: (PluginContainer..PluginContainer?)[MyPropertyDescriptor]

'hasPlugin' @ [98:34] ==> public abstract fun hasPlugin(p0: (String..String?)): Boolean defined in org.gradle.api.plugins.PluginContainer[JavaMethodDescriptor]

'kotlinPlatformCommonPluginId' @ [98:44] ==> private final val kotlinPlatformCommonPluginId: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'result' @ [100:13] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'add' @ [100:20] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'project' @ [100:24] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'path' @ [100:32] ==> public final val Project.path: (String..String?)[MyPropertyDescriptor]

'project' @ [102:40] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'configurations' @ [102:48] ==> public final val Project.configurations: (ConfigurationContainer..ConfigurationContainer?)[MyPropertyDescriptor]

'findByName' @ [102:63] ==> public abstract fun findByName(p0: (String..String?)): (Configuration..Configuration?) defined in org.gradle.api.artifacts.ConfigurationContainer[JavaMethodDescriptor]

'compileConfiguration' @ [103:32] ==> val compileConfiguration: Configuration defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'dependencies' @ [104:22] ==> public final val Configuration.dependencies: (DependencySet..DependencySet?)[MyPropertyDescriptor]

'filterIsInstance' @ [105:22] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ProjectDependency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ProjectDependency

'map' @ [106:22] ==> public inline fun <T, R> Iterable<ProjectDependency>.map(transform: (ProjectDependency) -> (Project..Project?)): List<(Project..Project?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProjectDependency
    <R> -> (org.gradle.api.Project..org.gradle.api.Project?)

'it' @ [106:28] ==> value-parameter it: ProjectDependency defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies.<anonymous>[ValueParameterDescriptorImpl]

'dependencyProject' @ [106:31] ==> public final val ProjectDependency.dependencyProject: (Project..Project?)[MyPropertyDescriptor]

'dependencies' @ [108:25] ==> val dependencies: List<(Project..Project?)> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'dep' @ [109:21] ==> val dep: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'path' @ [109:25] ==> public final val Project.path: (String..String?)[MyPropertyDescriptor]

'processed' @ [109:34] ==> val processed: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'toProcess' @ [110:21] ==> val toProcess: LinkedList<Project> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'add' @ [110:31] ==> public open fun add(element: Project): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'dep' @ [110:35] ==> val dep: (Project..Project?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'result' @ [115:16] ==> val result: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.transitiveCommonDependencies[LocalVariableDescriptor]

'Suppress' @ [118:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'javaClass' @ [121:13] ==> public val <T : Any> Task.javaClass: Class<Task> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Task

'getDeclaredMethod' @ [121:23] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'methodName' @ [121:41] ==> value-parameter methodName: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCompilerArguments[ValueParameterDescriptorImpl]

'invoke' @ [121:53] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'this' @ [121:60] ==> <this> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCompilerArguments[ReceiverParameterDescriptorImpl]

'emptyList' @ [125:13] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javaClass' @ [131:46] ==> public val <T : Any> Task.javaClass: Class<Task> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Task

'classLoader' @ [131:56] ==> public final val <T : (Any..Any?)> Class<Task>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Task

'loadClass' @ [131:68] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'ABSTRACT_KOTLIN_COMPILE_CLASS' @ [131:78] ==> private final val ABSTRACT_KOTLIN_COMPILE_CLASS: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'abstractKotlinCompileClass' @ [132:39] ==> val abstractKotlinCompileClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getDependencyClasspath[LocalVariableDescriptor]

'getDeclaredMethod' @ [132:66] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'apply' @ [132:107] ==> @InlineOnly public inline fun <T> (Method..Method?).apply(block: (Method..Method?).() -> Unit): (Method..Method?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'isAccessible' @ [132:115] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [133:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getCompileClasspath' @ [134:21] ==> val getCompileClasspath: (Method..Method?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getDependencyClasspath[LocalVariableDescriptor]

'invoke' @ [134:41] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'this' @ [134:48] ==> <this> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getDependencyClasspath[ReceiverParameterDescriptorImpl]

'map' @ [134:75] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [134:81] ==> value-parameter it: File defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getDependencyClasspath.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [134:84] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [146:16] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'project' @ [150:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCoroutines[ValueParameterDescriptorImpl]

'extensions' @ [150:39] ==> public final val Project.extensions: (ExtensionContainer..ExtensionContainer?)[MyPropertyDescriptor]

'findByName' @ [150:50] ==> public abstract fun findByName(p0: (String..String?)): (Any..Any?) defined in org.gradle.api.plugins.ExtensionContainer[JavaMethodDescriptor]

'kotlinExtension' @ [152:13] ==> val kotlinExtension: Any defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCoroutines[LocalVariableDescriptor]

'java' @ [152:36] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'getMethod' @ [152:41] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'invoke' @ [152:70] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'kotlinExtension' @ [152:77] ==> val kotlinExtension: Any defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCoroutines[LocalVariableDescriptor]

'experimentalExtension' @ [159:13] ==> val experimentalExtension: (Any..Any?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCoroutines[LocalVariableDescriptor]

'java' @ [159:42] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'getMethod' @ [159:47] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'invoke' @ [159:74] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'experimentalExtension' @ [159:81] ==> val experimentalExtension: (Any..Any?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getCoroutines[LocalVariableDescriptor]

'toString' @ [159:105] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'?:' @ [167:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'javaClass' @ [168:13] ==> public val <T : Any> Task.javaClass: Class<Task> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Task

'methods' @ [168:23] ==> public final val <T : (Any..Any?)> Class<Task>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Task

'firstOrNull' @ [168:31] ==> public inline fun <T> Array<out (Method..Method?)>.firstOrNull(predicate: ((Method..Method?)) -> Boolean): Method? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [168:45] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getSourceSetName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [168:48] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [168:53] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [168:87] ==> value-parameter it: (Method..Method?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getSourceSetName.<anonymous>[ValueParameterDescriptorImpl]

'parameterCount' @ [168:90] ==> public final val Method.parameterCount: Int[MyPropertyDescriptor]

'invoke' @ [168:113] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'this' @ [168:120] ==> <this> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.getSourceSetName[ReceiverParameterDescriptorImpl]

'kotlinPluginIds' @ [175:30] ==> public final val kotlinPluginIds: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'singleOrNull' @ [175:46] ==> public inline fun <T> Iterable<String>.singleOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'project' @ [175:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'plugins' @ [175:69] ==> public final val Project.plugins: (PluginContainer..PluginContainer?)[MyPropertyDescriptor]

'findPlugin' @ [175:77] ==> public abstract fun findPlugin(p0: (String..String?)): raw (Plugin<(Any..Any?)>..Plugin<*>?) defined in org.gradle.api.plugins.PluginContainer[JavaMethodDescriptor]

'it' @ [175:88] ==> value-parameter it: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'platformPluginIds' @ [176:32] ==> public final val platformPluginIds: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'singleOrNull' @ [176:50] ==> public inline fun <T> Iterable<String>.singleOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'project' @ [176:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'plugins' @ [176:73] ==> public final val Project.plugins: (PluginContainer..PluginContainer?)[MyPropertyDescriptor]

'findPlugin' @ [176:81] ==> public abstract fun findPlugin(p0: (String..String?)): raw (Plugin<(Any..Any?)>..Plugin<*>?) defined in org.gradle.api.plugins.PluginContainer[JavaMethodDescriptor]

'it' @ [176:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [178:44] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> ArgsInfo

'project' @ [180:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'getAllTasks' @ [180:17] ==> public abstract fun getAllTasks(p0: Boolean): (MutableMap<(Project..Project?), (MutableSet<(Task..Task?)>..Set<(Task..Task?)>?)>..Map<(Project..Project?), (MutableSet<(Task..Task?)>..Set<(Task..Task?)>?)>?) defined in org.gradle.api.Project[JavaMethodDescriptor]

'project' @ [180:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'forEach' @ [180:46] ==> @HidesMembers public inline fun <T> Iterable<(Task..Task?)>.forEach(action: ((Task..Task?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.gradle.api.Task..org.gradle.api.Task?)

'compileTask' @ [181:17] ==> value-parameter compileTask: (Task..Task?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [181:29] ==> public val <T : Any> (Task..Task?).javaClass: Class<(Task..Task?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (org.gradle.api.Task..org.gradle.api.Task?)

'name' @ [181:39] ==> public final val <T : (Any..Any?)> Class<(Task..Task?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.gradle.api.Task..org.gradle.api.Task?)

'kotlinCompileTaskClasses' @ [181:48] ==> public final val kotlinCompileTaskClasses: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'compileTask' @ [183:33] ==> value-parameter compileTask: (Task..Task?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'getSourceSetName' @ [183:45] ==> private final fun Task.getSourceSetName(): String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'compileTask' @ [184:36] ==> value-parameter compileTask: (Task..Task?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'getCompilerArguments' @ [184:48] ==> @Suppress private final fun Task.getCompilerArguments(methodName: String): List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'compileTask' @ [185:36] ==> value-parameter compileTask: (Task..Task?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'getCompilerArguments' @ [185:48] ==> @Suppress private final fun Task.getCompilerArguments(methodName: String): List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'compileTask' @ [186:39] ==> value-parameter compileTask: (Task..Task?) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'getDependencyClasspath' @ [186:51] ==> private final fun Task.getDependencyClasspath(): List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'compilerArgumentsBySourceSet' @ [187:13] ==> val compilerArgumentsBySourceSet: LinkedHashMap<String, ArgsInfo> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'sourceSetName' @ [187:42] ==> val sourceSetName: String defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[LocalVariableDescriptor]

'ArgsInfoImpl' @ [187:59] ==> public constructor ArgsInfoImpl(currentArguments: List<String>, defaultArguments: List<String>, dependencyClasspath: List<String>) defined in org.jetbrains.kotlin.gradle.ArgsInfoImpl[ClassConstructorDescriptorImpl]

'currentArguments' @ [187:72] ==> val currentArguments: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[LocalVariableDescriptor]

'defaultArguments' @ [187:90] ==> val defaultArguments: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[LocalVariableDescriptor]

'dependencyClasspath' @ [187:108] ==> val dependencyClasspath: List<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[LocalVariableDescriptor]

'platformPluginId' @ [190:24] ==> val platformPluginId: String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'pluginToPlatform' @ [190:44] ==> public final val pluginToPlatform: LinkedHashMap<String, String> /* = LinkedHashMap<String, String> */ defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.Companion[PropertyDescriptorImpl]

'entries' @ [190:61] ==> public open val entries: MutableSet<MutableMap.MutableEntry<String, String>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'singleOrNull' @ [190:69] ==> public inline fun <T> Iterable<MutableMap.MutableEntry<String, String>>.singleOrNull(predicate: (MutableMap.MutableEntry<String, String>) -> Boolean): MutableMap.MutableEntry<String, String>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<String, String>

'project' @ [190:84] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'plugins' @ [190:92] ==> public final val Project.plugins: (PluginContainer..PluginContainer?)[MyPropertyDescriptor]

'findPlugin' @ [190:100] ==> public abstract fun findPlugin(p0: (String..String?)): raw (Plugin<(Any..Any?)>..Plugin<*>?) defined in org.gradle.api.plugins.PluginContainer[JavaMethodDescriptor]

'it' @ [190:111] ==> value-parameter it: MutableMap.MutableEntry<String, String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [190:114] ==> public abstract val key: String defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'value' @ [190:130] ==> public abstract val value: String defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'getImplements' @ [191:32] ==> private final fun getImplements(project: Project): Project? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'project' @ [191:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'let' @ [191:56] ==> @InlineOnly public inline fun <T, R> Project.let(block: (Project) -> Set<String>): Set<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project
    <R> -> Set<String>

'transitiveCommonDependencies' @ [191:62] ==> private final fun transitiveCommonDependencies(startingProject: Project): Set<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'it' @ [191:91] ==> value-parameter it: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll.<anonymous>[ValueParameterDescriptorImpl]

'emptySet' @ [191:100] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KotlinGradleModelImpl' @ [193:16] ==> public constructor KotlinGradleModelImpl(hasKotlinPlugin: Boolean, compilerArgumentsBySourceSet: CompilerArgumentsBySourceSet /* = Map<String, ArgsInfo> */, coroutines: String?, platformPluginId: String?, transitiveCommonDependencies: Set<String>) defined in org.jetbrains.kotlin.gradle.KotlinGradleModelImpl[ClassConstructorDescriptorImpl]

'kotlinPluginId' @ [194:17] ==> val kotlinPluginId: String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'platformPluginId' @ [194:43] ==> val platformPluginId: String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'compilerArgumentsBySourceSet' @ [195:17] ==> val compilerArgumentsBySourceSet: LinkedHashMap<String, ArgsInfo> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'getCoroutines' @ [196:17] ==> private final fun getCoroutines(project: Project): String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder[SimpleFunctionDescriptorImpl]

'project' @ [196:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[ValueParameterDescriptorImpl]

'platform' @ [197:17] ==> val platform: String? defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

'transitiveCommon' @ [198:17] ==> val transitiveCommon: Set<String> defined in org.jetbrains.kotlin.gradle.KotlinGradleModelBuilder.buildAll[LocalVariableDescriptor]

