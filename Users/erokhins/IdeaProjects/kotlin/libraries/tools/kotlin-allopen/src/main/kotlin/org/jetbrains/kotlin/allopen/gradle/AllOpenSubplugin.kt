'project' @ [30:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.Companion.isEnabled[ValueParameterDescriptorImpl]

'plugins' @ [30:51] ==> public final val Project.plugins: (PluginContainer..PluginContainer?)[MyPropertyDescriptor]

'findPlugin' @ [30:59] ==> public abstract fun <T : raw (Plugin<(Any..Any?)>..Plugin<*>?)> findPlugin(p0: (Class<(AllOpenGradleSubplugin..AllOpenGradleSubplugin?)>..Class<(AllOpenGradleSubplugin..AllOpenGradleSubplugin?)>?)): (AllOpenGradleSubplugin..AllOpenGradleSubplugin?) defined in org.gradle.api.plugins.PluginContainer[JavaMethodDescriptor]
Inferred types:
    <T : raw (Plugin<(Any..Any?)>..Plugin<*>?)> -> AllOpenGradleSubplugin

'AllOpenGradleSubplugin' @ [30:70] ==> public companion object defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin[FakeCallableDescriptorForObject]

'java' @ [30:100] ==> public val <T> KClass<AllOpenGradleSubplugin>.java: Class<AllOpenGradleSubplugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AllOpenGradleSubplugin

'project' @ [33:20] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.Companion.getAllOpenExtension[ValueParameterDescriptorImpl]

'extensions' @ [33:28] ==> public final val Project.extensions: (ExtensionContainer..ExtensionContainer?)[MyPropertyDescriptor]

'getByType' @ [33:39] ==> public abstract fun <T : (Any..Any?)> getByType(p0: (Class<(AllOpenExtension..AllOpenExtension?)>..Class<(AllOpenExtension..AllOpenExtension?)>?)): (AllOpenExtension..AllOpenExtension?) defined in org.gradle.api.plugins.ExtensionContainer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AllOpenExtension

'AllOpenExtension' @ [33:49] ==> public constructor AllOpenExtension() defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[ClassConstructorDescriptorImpl]

'java' @ [33:73] ==> public val <T> KClass<AllOpenExtension>.java: Class<AllOpenExtension> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AllOpenExtension

'buildscript' @ [38:13] ==> public final val Project.buildscript: (ScriptHandler..ScriptHandler?)[MyPropertyDescriptor]

'configurations' @ [38:25] ==> public final val ScriptHandler.configurations: (ConfigurationContainer..ConfigurationContainer?)[MyPropertyDescriptor]

'findByName' @ [38:40] ==> public abstract fun findByName(p0: (String..String?)): (Configuration..Configuration?) defined in org.gradle.api.artifacts.ConfigurationContainer[JavaMethodDescriptor]

'resolvedConfiguration' @ [38:65] ==> public final val Configuration.resolvedConfiguration: (ResolvedConfiguration..ResolvedConfiguration?)[MyPropertyDescriptor]

'resolvedArtifacts' @ [38:88] ==> public final val ResolvedConfiguration.resolvedArtifacts: (MutableSet<(ResolvedArtifact..ResolvedArtifact?)>..Set<(ResolvedArtifact..ResolvedArtifact?)>?)[MyPropertyDescriptor]

'emptySet' @ [38:109] ==> public fun <T> emptySet(): Set<ResolvedArtifact> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedArtifact

'project' @ [41:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'extensions' @ [41:40] ==> public final val Project.extensions: (ExtensionContainer..ExtensionContainer?)[MyPropertyDescriptor]

'create' @ [41:51] ==> public abstract fun <T : (Any..Any?)> create(p0: (String..String?), p1: (Class<(AllOpenExtension..AllOpenExtension?)>..Class<(AllOpenExtension..AllOpenExtension?)>?), vararg p2: (Any..Any?)): (AllOpenExtension..AllOpenExtension?) defined in org.gradle.api.plugins.ExtensionContainer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AllOpenExtension

'AllOpenExtension' @ [41:69] ==> public constructor AllOpenExtension() defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[ClassConstructorDescriptorImpl]

'java' @ [41:93] ==> public val <T> KClass<AllOpenExtension>.java: Class<AllOpenExtension> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AllOpenExtension

'project' @ [43:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'afterEvaluate' @ [43:17] ==> public final fun afterEvaluate(p0: (((Project..Project?)) -> Unit..(((Project..Project?)) -> Unit)?)): Unit defined in org.gradle.api.Project[MyFunctionDescriptor]

'allOpenExtension' @ [44:35] ==> val allOpenExtension: (AllOpenExtension..AllOpenExtension?) defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[LocalVariableDescriptor]

'myAnnotations' @ [44:52] ==> internal final val myAnnotations: MutableList<String> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[PropertyDescriptorImpl]

'joinToString' @ [44:66] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'allOpenExtension' @ [45:35] ==> val allOpenExtension: (AllOpenExtension..AllOpenExtension?) defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[LocalVariableDescriptor]

'myPresets' @ [45:52] ==> internal final val myPresets: MutableList<String> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[PropertyDescriptorImpl]

'joinToString' @ [45:62] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'project' @ [46:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'extensions' @ [46:21] ==> public final val Project.extensions: (ExtensionContainer..ExtensionContainer?)[MyPropertyDescriptor]

'extraProperties' @ [46:32] ==> public final val ExtensionContainer.extraProperties: (ExtraPropertiesExtension..ExtraPropertiesExtension?)[MyPropertyDescriptor]

'set' @ [46:48] ==> public abstract operator fun set(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.gradle.api.plugins.ExtraPropertiesExtension[JavaMethodDescriptor]

'fqNamesAsString' @ [46:80] ==> val fqNamesAsString: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>[LocalVariableDescriptor]

'project' @ [48:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'getBuildscriptArtifacts' @ [48:51] ==> public final fun Project.getBuildscriptArtifacts(): Set<ResolvedArtifact> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin[SimpleFunctionDescriptorImpl]

'project' @ [48:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'rootProject' @ [48:87] ==> public final val Project.rootProject: (Project..Project?)[MyPropertyDescriptor]

'getBuildscriptArtifacts' @ [48:99] ==> public final fun Project.getBuildscriptArtifacts(): Set<ResolvedArtifact> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin[SimpleFunctionDescriptorImpl]

'allBuildscriptArtifacts' @ [49:45] ==> val allBuildscriptArtifacts: Set<ResolvedArtifact> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>[LocalVariableDescriptor]

'filter' @ [49:69] ==> public inline fun <T> Iterable<ResolvedArtifact>.filter(predicate: (ResolvedArtifact) -> Boolean): List<ResolvedArtifact> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedArtifact

'it' @ [50:26] ==> value-parameter it: ResolvedArtifact defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'moduleVersion' @ [50:29] ==> public final val ResolvedArtifact.moduleVersion: (ResolvedModuleVersion..ResolvedModuleVersion?)[MyPropertyDescriptor]

'id' @ [50:43] ==> public final val ResolvedModuleVersion.id: (ModuleVersionIdentifier..ModuleVersionIdentifier?)[MyPropertyDescriptor]

'id' @ [51:17] ==> val id: (ModuleVersionIdentifier..ModuleVersionIdentifier?) defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'group' @ [51:20] ==> public final val ModuleVersionIdentifier.group: (String..String?)[MyPropertyDescriptor]

'AllOpenKotlinGradleSubplugin' @ [51:29] ==> public companion object defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin[FakeCallableDescriptorForObject]

'ALLOPEN_GROUP_NAME' @ [51:58] ==> public final val ALLOPEN_GROUP_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

'id' @ [52:28] ==> val id: (ModuleVersionIdentifier..ModuleVersionIdentifier?) defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [52:31] ==> public final val ModuleVersionIdentifier.name: (String..String?)[MyPropertyDescriptor]

'AllOpenKotlinGradleSubplugin' @ [52:39] ==> public companion object defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin[FakeCallableDescriptorForObject]

'ALLOPEN_ARTIFACT_NAME' @ [52:68] ==> public final val ALLOPEN_ARTIFACT_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

'firstOrNull' @ [53:15] ==> public fun <T> List<ResolvedArtifact>.firstOrNull(): ResolvedArtifact? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedArtifact

'file' @ [53:30] ==> public final val ResolvedArtifact.file: (File..File?)[MyPropertyDescriptor]

'absolutePath' @ [53:36] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'AbstractTask' @ [55:41] ==> protected/*protected and package*/ constructor AbstractTask() defined in org.gradle.api.internal.AbstractTask[JavaClassConstructorDescriptor]

'project' @ [56:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'tasks' @ [56:21] ==> public final val Project.tasks: (TaskContainer..TaskContainer?)[MyPropertyDescriptor]

'add' @ [56:27] ==> public abstract fun add(element: (Task..Task?)): Boolean defined in org.gradle.api.tasks.TaskContainer[JavaMethodDescriptor]

'project' @ [56:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply[ValueParameterDescriptorImpl]

'tasks' @ [56:39] ==> public final val Project.tasks: (TaskContainer..TaskContainer?)[MyPropertyDescriptor]

'create' @ [56:45] ==> public abstract fun <T : (Task..Task?)> create(p0: (String..String?), p1: (Class<(TaskForAllOpen..TaskForAllOpen?)>..Class<(TaskForAllOpen..TaskForAllOpen?)>?)): (TaskForAllOpen..TaskForAllOpen?) defined in org.gradle.api.tasks.TaskContainer[JavaMethodDescriptor]
Inferred types:
    <T : (Task..Task?)> -> TaskForAllOpen

'TaskForAllOpen' @ [56:78] ==> public constructor TaskForAllOpen() defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.TaskForAllOpen[ClassConstructorDescriptorImpl]

'java' @ [56:100] ==> public val <T> KClass<TaskForAllOpen>.java: Class<TaskForAllOpen> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TaskForAllOpen

'apply' @ [56:106] ==> @InlineOnly public inline fun <T> (TaskForAllOpen..TaskForAllOpen?).apply(block: (TaskForAllOpen..TaskForAllOpen?).() -> Unit): (TaskForAllOpen..TaskForAllOpen?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.TaskForAllOpen..org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>.TaskForAllOpen?)

'isEnabled' @ [57:17] ==> public final var TaskForAllOpen.isEnabled: Boolean[MyPropertyDescriptor]

'description' @ [58:17] ==> public final var TaskForAllOpen.description: (String..String?)[MyPropertyDescriptor]

'+' @ [58:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fqNamesAsString' @ [58:56] ==> val fqNamesAsString: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>[LocalVariableDescriptor]

'presetsAsString' @ [59:38] ==> val presetsAsString: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>[LocalVariableDescriptor]

'allOpenCompilerPluginFile' @ [60:56] ==> val allOpenCompilerPluginFile: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.apply.<anonymous>[LocalVariableDescriptor]

'AllOpenGradleSubplugin' @ [75:74] ==> public companion object defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin[FakeCallableDescriptorForObject]

'isEnabled' @ [75:97] ==> public final fun isEnabled(project: Project): Boolean defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.Companion[SimpleFunctionDescriptorImpl]

'project' @ [75:107] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.isApplicable[ValueParameterDescriptorImpl]

'!' @ [85:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'AllOpenGradleSubplugin' @ [85:14] ==> public companion object defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin[FakeCallableDescriptorForObject]

'isEnabled' @ [85:37] ==> public final fun isEnabled(project: Project): Boolean defined in org.jetbrains.kotlin.allopen.gradle.AllOpenGradleSubplugin.Companion[SimpleFunctionDescriptorImpl]

'project' @ [85:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[ValueParameterDescriptorImpl]

'emptyList' @ [85:64] ==> public fun <T> emptyList(): List<SubpluginOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SubpluginOption

'project' @ [87:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[ValueParameterDescriptorImpl]

'extensions' @ [87:40] ==> public final val Project.extensions: (ExtensionContainer..ExtensionContainer?)[MyPropertyDescriptor]

'findByType' @ [87:51] ==> public abstract fun <T : (Any..Any?)> findByType(p0: (Class<(AllOpenExtension..AllOpenExtension?)>..Class<(AllOpenExtension..AllOpenExtension?)>?)): (AllOpenExtension..AllOpenExtension?) defined in org.gradle.api.plugins.ExtensionContainer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AllOpenExtension

'AllOpenExtension' @ [87:62] ==> public constructor AllOpenExtension() defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[ClassConstructorDescriptorImpl]

'java' @ [87:86] ==> public val <T> KClass<AllOpenExtension>.java: Class<AllOpenExtension> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AllOpenExtension

'emptyList' @ [87:102] ==> public fun <T> emptyList(): List<SubpluginOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SubpluginOption

'mutableListOf' @ [89:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<SubpluginOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SubpluginOption

'allOpenExtension' @ [91:22] ==> val allOpenExtension: AllOpenExtension defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'myAnnotations' @ [91:39] ==> internal final val myAnnotations: MutableList<String> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[PropertyDescriptorImpl]

'options' @ [92:13] ==> val options: MutableList<SubpluginOption> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'SubpluginOption' @ [92:24] ==> public constructor SubpluginOption(key: String, value: String) defined in org.jetbrains.kotlin.gradle.plugin.SubpluginOption[DeserializedClassConstructorDescriptor]

'ANNOTATION_ARG_NAME' @ [92:40] ==> private final val ANNOTATION_ARG_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

'anno' @ [92:61] ==> val anno: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'allOpenExtension' @ [95:24] ==> val allOpenExtension: AllOpenExtension defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'myPresets' @ [95:41] ==> internal final val myPresets: MutableList<String> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenExtension[PropertyDescriptorImpl]

'options' @ [96:13] ==> val options: MutableList<SubpluginOption> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'SubpluginOption' @ [96:24] ==> public constructor SubpluginOption(key: String, value: String) defined in org.jetbrains.kotlin.gradle.plugin.SubpluginOption[DeserializedClassConstructorDescriptor]

'PRESET_ARG_NAME' @ [96:40] ==> private final val PRESET_ARG_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

'preset' @ [96:57] ==> val preset: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'options' @ [99:16] ==> val options: MutableList<SubpluginOption> defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.apply[LocalVariableDescriptor]

'ALLOPEN_GROUP_NAME' @ [102:35] ==> public final val ALLOPEN_GROUP_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

'ALLOPEN_ARTIFACT_NAME' @ [103:38] ==> public final val ALLOPEN_ARTIFACT_NAME: String defined in org.jetbrains.kotlin.allopen.gradle.AllOpenKotlinGradleSubplugin.Companion[PropertyDescriptorImpl]

