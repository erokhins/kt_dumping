'toRegex' @ [31:135] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'modifyCompilerArgumentsForPlugin' @ [41:9] ==> internal fun modifyCompilerArgumentsForPlugin(facet: KotlinFacet, setup: AnnotationBasedCompilerPluginSetup?, compilerPluginId: String, pluginName: String, annotationOptionName: String): Unit defined in org.jetbrains.kotlin.annotation.plugin.ide in file idePluginUtils.kt[SimpleFunctionDescriptorImpl]

'facet' @ [41:42] ==> value-parameter facet: KotlinFacet defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.importBySourceSet[ValueParameterDescriptorImpl]

'getPluginSetupBySourceSet' @ [41:49] ==> private final fun getPluginSetupBySourceSet(sourceSetNode: DataNode<GradleSourceSetData>): AnnotationBasedCompilerPluginSetup? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[SimpleFunctionDescriptorImpl]

'sourceSetNode' @ [41:75] ==> value-parameter sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.importBySourceSet[ValueParameterDescriptorImpl]

'compilerPluginId' @ [42:61] ==> public abstract val compilerPluginId: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'pluginName' @ [43:55] ==> public abstract val pluginName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'annotationOptionName' @ [44:65] ==> public abstract val annotationOptionName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'modifyCompilerArgumentsForPlugin' @ [48:9] ==> internal fun modifyCompilerArgumentsForPlugin(facet: KotlinFacet, setup: AnnotationBasedCompilerPluginSetup?, compilerPluginId: String, pluginName: String, annotationOptionName: String): Unit defined in org.jetbrains.kotlin.annotation.plugin.ide in file idePluginUtils.kt[SimpleFunctionDescriptorImpl]

'facet' @ [48:42] ==> value-parameter facet: KotlinFacet defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.importByModule[ValueParameterDescriptorImpl]

'getPluginSetupByModule' @ [48:49] ==> private final fun getPluginSetupByModule(moduleNode: DataNode<ModuleData>): AnnotationBasedCompilerPluginSetup? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[SimpleFunctionDescriptorImpl]

'moduleNode' @ [48:72] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.importByModule[ValueParameterDescriptorImpl]

'compilerPluginId' @ [49:61] ==> public abstract val compilerPluginId: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'pluginName' @ [50:55] ==> public abstract val pluginName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'annotationOptionName' @ [51:65] ==> public abstract val annotationOptionName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'emptyList' @ [54:84] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'moduleNode' @ [59:35] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[ValueParameterDescriptorImpl]

'children' @ [59:46] ==> public final val <T : (Any..Any?)> DataNode<ModuleData>.children: (MutableCollection<(DataNode<*>..DataNode<*>?)>..Collection<(DataNode<*>..DataNode<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleData

'firstOrNull' @ [59:55] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.firstOrNull(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): DataNode<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'it' @ [60:24] ==> value-parameter it: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [60:27] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'data' @ [61:13] ==> val data: TaskData defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule.<anonymous>[LocalVariableDescriptor]

'name' @ [61:18] ==> public final val TaskData.name: String[MyPropertyDescriptor]

'dataStorageTaskName' @ [61:26] ==> public abstract val dataStorageTaskName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'data' @ [62:12] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'dataStorageTaskData' @ [64:42] ==> val dataStorageTaskData: TaskData defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'description' @ [64:62] ==> public final val TaskData.description: String?[MyPropertyDescriptor]

'TASK_DESCRIPTION_REGEX' @ [65:27] ==> private final val TASK_DESCRIPTION_REGEX: Regex defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.Companion[PropertyDescriptorImpl]

'matchEntire' @ [65:50] ==> public final fun matchEntire(input: CharSequence): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'dataStorageTaskDescription' @ [65:62] ==> val dataStorageTaskDescription: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'groupValues' @ [65:91] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'drop' @ [65:104] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component1' @ [66:14] ==> @InlineOnly public operator inline fun <T> List<String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component2' @ [66:37] ==> @InlineOnly public operator inline fun <T> List<String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'matchResult' @ [66:48] ==> val matchResult: List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'annotationFqNamesList' @ [68:33] ==> val annotationFqNamesList: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'split' @ [68:55] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'presets' @ [68:68] ==> val presets: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'split' @ [68:76] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [68:87] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'getAnnotationsForPreset' @ [68:97] ==> protected open fun getAnnotationsForPreset(presetName: String): List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[SimpleFunctionDescriptorImpl]

'it' @ [68:121] ==> value-parameter it: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [72:25] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'pluginJarFileFromIdea' @ [72:32] ==> public abstract val pluginJarFileFromIdea: File defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[PropertyDescriptorImpl]

'absolutePath' @ [72:54] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'AnnotationBasedCompilerPluginSetup' @ [74:16] ==> public constructor AnnotationBasedCompilerPluginSetup(annotationFqNames: List<String>, classpath: List<String>) defined in org.jetbrains.kotlin.annotation.plugin.ide.AnnotationBasedCompilerPluginSetup[ClassConstructorDescriptorImpl]

'annotationFqNames' @ [74:51] ==> val annotationFqNames: List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'classpath' @ [74:70] ==> val classpath: List<(String..String?)> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupByModule[LocalVariableDescriptor]

'findParent' @ [78:35] ==> @Nullable public open fun <T : (Any..Any?)> findParent(@NotNull p0: DataNode<*>, @NotNull p1: Key<(ModuleData..ModuleData?)>): DataNode<(ModuleData..ModuleData?)>? defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)

'sourceSetNode' @ [78:46] ==> value-parameter sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupBySourceSet[ValueParameterDescriptorImpl]

'MODULE' @ [78:73] ==> @NotNull public final val MODULE: Key<(ModuleData..ModuleData?)> defined in com.intellij.openapi.externalSystem.model.ProjectKeys[JavaPropertyDescriptor]

'let' @ [78:82] ==> @InlineOnly public inline fun <T, R> DataNode<(ModuleData..ModuleData?)>.let(block: (DataNode<(ModuleData..ModuleData?)>) -> AnnotationBasedCompilerPluginSetup?): AnnotationBasedCompilerPluginSetup? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataNode<(com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)>
    <R> -> AnnotationBasedCompilerPluginSetup?

'getPluginSetupByModule' @ [78:88] ==> private final fun getPluginSetupByModule(moduleNode: DataNode<ModuleData>): AnnotationBasedCompilerPluginSetup? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler[SimpleFunctionDescriptorImpl]

'it' @ [78:111] ==> value-parameter it: DataNode<(ModuleData..ModuleData?)> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractGradleImportHandler.getPluginSetupBySourceSet.<anonymous>[ValueParameterDescriptorImpl]

