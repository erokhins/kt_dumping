'modifyCompilerArgumentsForPlugin' @ [36:9] ==> internal fun modifyCompilerArgumentsForPlugin(facet: KotlinFacet, setup: AnnotationBasedCompilerPluginSetup?, compilerPluginId: String, pluginName: String, annotationOptionName: String): Unit defined in org.jetbrains.kotlin.annotation.plugin.ide in file idePluginUtils.kt[SimpleFunctionDescriptorImpl]

'facet' @ [36:42] ==> value-parameter facet: KotlinFacet defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.invoke[ValueParameterDescriptorImpl]

'getPluginSetup' @ [36:49] ==> private final fun getPluginSetup(mavenProject: MavenProject): AnnotationBasedCompilerPluginSetup? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'mavenProject' @ [36:64] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.invoke[ValueParameterDescriptorImpl]

'compilerPluginId' @ [37:61] ==> public abstract val compilerPluginId: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[PropertyDescriptorImpl]

'pluginName' @ [38:55] ==> public abstract val pluginName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[PropertyDescriptorImpl]

'annotationOptionName' @ [39:65] ==> public abstract val annotationOptionName: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[PropertyDescriptorImpl]

'mavenProject' @ [45:28] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[ValueParameterDescriptorImpl]

'plugins' @ [45:41] ==> public final val MavenProject.plugins: (MutableList<(MavenPlugin..MavenPlugin?)>..List<(MavenPlugin..MavenPlugin?)>)[MyPropertyDescriptor]

'firstOrNull' @ [45:49] ==> public inline fun <T> Iterable<(MavenPlugin..MavenPlugin?)>.firstOrNull(predicate: ((MavenPlugin..MavenPlugin?)) -> Boolean): MavenPlugin? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin..org.jetbrains.idea.maven.model.MavenPlugin?)

'it' @ [46:13] ==> value-parameter it: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>[ValueParameterDescriptorImpl]

'groupId' @ [46:16] ==> public final val MavenPlugin.groupId: (String..String?)[MyPropertyDescriptor]

'KOTLIN_PLUGIN_GROUP_ID' @ [46:27] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyImportedFromObject]

'it' @ [46:53] ==> value-parameter it: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>[ValueParameterDescriptorImpl]

'artifactId' @ [46:56] ==> public final val MavenPlugin.artifactId: (String..String?)[MyPropertyDescriptor]

'KOTLIN_PLUGIN_ARTIFACT_ID' @ [46:70] ==> public final val KOTLIN_PLUGIN_ARTIFACT_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyImportedFromObject]

'kotlinPlugin' @ [49:29] ==> val kotlinPlugin: MavenPlugin defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'configurationElement' @ [49:42] ==> public final val MavenPlugin.configurationElement: Element?[MyPropertyDescriptor]

'configuration' @ [51:38] ==> val configuration: Element defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'getElement' @ [51:52] ==> private final fun Element.getElement(name: String): Element? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'getElements' @ [52:19] ==> @Suppress private final fun Element.getElements(): List<Element> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'flatMap' @ [53:19] ==> public inline fun <T, R> Iterable<Element>.flatMap(transform: (Element) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element
    <R> -> String

'plugin' @ [53:39] ==> value-parameter plugin: Element defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [53:46] ==> public final val Element.content: (MutableList<(Content..Content?)>..List<(Content..Content?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [53:54] ==> public inline fun <T, R : Any> Iterable<(Content..Content?)>.mapNotNull(transform: ((Content..Content?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Content..org.jdom.Content?)
    <R : Any> -> String

'it' @ [53:68] ==> value-parameter it: (Content..Content?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [53:82] ==> public final var Text.text: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [54:20] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [56:37] ==> val configuration: Element defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'getElement' @ [56:51] ==> private final fun Element.getElement(name: String): Element? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'getElements' @ [57:19] ==> @Suppress private final fun Element.getElements(): List<Element> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'flatMap' @ [58:19] ==> public inline fun <T, R> Iterable<Element>.flatMap(transform: (Element) -> Iterable<(Content..Content?)>): List<(Content..Content?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element
    <R> -> (org.jdom.Content..org.jdom.Content?)

'it' @ [58:29] ==> value-parameter it: Element defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [58:32] ==> public final val Element.content: (MutableList<(Content..Content?)>..List<(Content..Content?)>?)[MyPropertyDescriptor]

'mapTo' @ [59:19] ==> public inline fun <T, R, C : MutableCollection<in (String..String?)>> Iterable<(Content..Content?)>.mapTo(destination: MutableList<(String..String?)>, transform: ((Content..Content?)) -> (String..String?)): MutableList<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Content..org.jdom.Content?)
    <R> -> (kotlin.String..kotlin.String?)
    <C : MutableCollection<in R>> -> MutableList<(kotlin.String..kotlin.String?)>

'mutableListOf' @ [59:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [59:45] ==> value-parameter it: (Content..Content?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [59:57] ==> public final var Text.text: (String..String?)[MyPropertyDescriptor]

'mutableListOf' @ [60:20] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [63:25] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'pluginJarFileFromIdea' @ [63:32] ==> public abstract val pluginJarFileFromIdea: File defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[PropertyDescriptorImpl]

'absolutePath' @ [63:54] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'getAnnotations' @ [65:33] ==> public abstract fun getAnnotations(enabledCompilerPlugins: List<String>, compilerPluginOptions: List<String>): List<String>? defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler[SimpleFunctionDescriptorImpl]

'enabledCompilerPlugins' @ [65:48] ==> val enabledCompilerPlugins: List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'compilerPluginOptions' @ [65:72] ==> val compilerPluginOptions: MutableList<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'AnnotationBasedCompilerPluginSetup' @ [66:16] ==> public constructor AnnotationBasedCompilerPluginSetup(annotationFqNames: List<String>, classpath: List<String>) defined in org.jetbrains.kotlin.annotation.plugin.ide.AnnotationBasedCompilerPluginSetup[ClassConstructorDescriptorImpl]

'annotationFqNames' @ [66:51] ==> val annotationFqNames: List<String> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'classpath' @ [66:70] ==> val classpath: List<(String..String?)> defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getPluginSetup[LocalVariableDescriptor]

'content' @ [69:52] ==> public final val Element.content: (MutableList<(Content..Content?)>..List<(Content..Content?)>?)[MyPropertyDescriptor]

'firstOrNull' @ [69:60] ==> public inline fun <T> Iterable<(Content..Content?)>.firstOrNull(predicate: ((Content..Content?)) -> Boolean): Content? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Content..org.jdom.Content?)

'it' @ [69:74] ==> value-parameter it: (Content..Content?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getElement.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [69:91] ==> value-parameter it: (Content..Content?) defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getElement.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [69:94] ==> public final var Element.name: (String..String?)[MyPropertyDescriptor]

'name' @ [69:102] ==> value-parameter name: String defined in org.jetbrains.kotlin.annotation.plugin.ide.AbstractMavenImportHandler.getElement[ValueParameterDescriptorImpl]

'Suppress' @ [71:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'content' @ [72:41] ==> public final val Element.content: (MutableList<(Content..Content?)>..List<(Content..Content?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [72:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Element

