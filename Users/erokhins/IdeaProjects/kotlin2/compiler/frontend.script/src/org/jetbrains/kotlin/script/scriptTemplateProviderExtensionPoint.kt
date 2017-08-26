'Deprecated' @ [32:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'+' @ [32:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'ReplaceWith' @ [34:17] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'emptyList' @ [53:57] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'create' @ [59:36] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): ExtensionPointName<(ScriptTemplatesProvider..ScriptTemplatesProvider?)> defined in com.intellij.openapi.extensions.ExtensionPointName[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptTemplatesProvider

'makeScriptDefsFromTemplatesProviders' @ [66:9] ==> public fun makeScriptDefsFromTemplatesProviders(providers: Iterable<ScriptTemplatesProvider>, errorsHandler: (ScriptTemplatesProvider, Throwable) -> Unit = ...): List<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]

'getArea' @ [66:57] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'project' @ [66:65] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviderExtensions[ValueParameterDescriptorImpl]

'getExtensionPoint' @ [66:74] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensionPoint(@NotNull p0: ExtensionPointName<(ScriptTemplatesProvider..ScriptTemplatesProvider?)>): ExtensionPoint<(ScriptTemplatesProvider..ScriptTemplatesProvider?)> defined in com.intellij.openapi.extensions.ExtensionsArea[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptTemplatesProvider

'ScriptTemplatesProvider' @ [66:92] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[FakeCallableDescriptorForObject]

'EP_NAME' @ [66:116] ==> public final val EP_NAME: ExtensionPointName<ScriptTemplatesProvider> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider.Companion[PropertyDescriptorImpl]

'extensions' @ [66:125] ==> public final val <T : (Any..Any?)> ExtensionPoint<(ScriptTemplatesProvider..ScriptTemplatesProvider?)>.extensions: (Array<(ScriptTemplatesProvider..ScriptTemplatesProvider?)>..Array<out (ScriptTemplatesProvider..ScriptTemplatesProvider?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.script.ScriptTemplatesProvider..org.jetbrains.kotlin.script.ScriptTemplatesProvider?)

'asIterable' @ [66:136] ==> public fun <T> Array<out (ScriptTemplatesProvider..ScriptTemplatesProvider?)>.asIterable(): Iterable<(ScriptTemplatesProvider..ScriptTemplatesProvider?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.script.ScriptTemplatesProvider..org.jetbrains.kotlin.script.ScriptTemplatesProvider?)

'errorsHandler' @ [67:46] ==> value-parameter errorsHandler: (ScriptTemplatesProvider, Throwable) -> Unit defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviderExtensions[ValueParameterDescriptorImpl]

'ex' @ [70:123] ==> value-parameter ex: Throwable defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'providers' @ [71:35] ==> value-parameter providers: Iterable<ScriptTemplatesProvider> defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders[ValueParameterDescriptorImpl]

'flatMap' @ [71:45] ==> public inline fun <T, R> Iterable<ScriptTemplatesProvider>.flatMap(transform: (ScriptTemplatesProvider) -> Iterable<KotlinScriptDefinition>): List<KotlinScriptDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptTemplatesProvider
    <R> -> KotlinScriptDefinition

'createClassLoader' @ [73:22] ==> private fun createClassLoader(provider: ScriptTemplatesProvider): ClassLoader defined in org.jetbrains.kotlin.script in file scriptTemplateProviderExtensionPoint.kt[SimpleFunctionDescriptorImpl]

'provider' @ [73:40] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'provider' @ [74:9] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'templateClassNames' @ [74:18] ==> public abstract val templateClassNames: Iterable<String> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'map' @ [74:37] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> KotlinScriptDefinitionFromAnnotatedTemplate): List<KotlinScriptDefinitionFromAnnotatedTemplate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KotlinScriptDefinitionFromAnnotatedTemplate

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [75:13] ==> public constructor KotlinScriptDefinitionFromAnnotatedTemplate(template: KClass<out Any>, providedResolver: DependenciesResolver? = ..., providedScriptFilePattern: String? = ..., environment: Map<String, Any?>? = ..., templateClasspath: List<File> = ...) defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[ClassConstructorDescriptorImpl]

'loader' @ [76:21] ==> val loader: ClassLoader defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[LocalVariableDescriptor]

'loadClass' @ [76:28] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'it' @ [76:38] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kotlin' @ [76:42] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'provider' @ [76:50] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'resolver' @ [76:59] ==> public open val resolver: DependenciesResolver? defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'provider' @ [77:21] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'filePattern' @ [77:30] ==> public open val filePattern: String? defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'provider' @ [77:43] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'environment' @ [77:52] ==> public abstract val environment: Map<String, Any?>? defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'provider' @ [77:65] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'templateClasspath' @ [77:74] ==> public abstract val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'LOG' @ [82:9] ==> private val LOG: Logger defined in org.jetbrains.kotlin.script in file scriptTemplateProviderExtensionPoint.kt[PropertyDescriptorImpl]

'info' @ [82:13] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'provider' @ [82:40] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [82:49] ==> public abstract val id: String defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'ex' @ [82:67] ==> val ex: Throwable defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[LocalVariableDescriptor]

'message' @ [82:70] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'invoke' @ [83:9] ==> public abstract operator fun invoke(p1: ScriptTemplatesProvider, p2: Throwable): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'provider' @ [83:23] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[ValueParameterDescriptorImpl]

'ex' @ [83:33] ==> val ex: Throwable defined in org.jetbrains.kotlin.script.makeScriptDefsFromTemplatesProviders.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [84:9] ==> public fun <T> emptyList(): List<KotlinScriptDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinition

'provider' @ [89:21] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.createClassLoader[ValueParameterDescriptorImpl]

'templateClasspath' @ [89:30] ==> public abstract val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'provider' @ [89:50] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.createClassLoader[ValueParameterDescriptorImpl]

'additionalResolverClasspath' @ [89:59] ==> public open val additionalResolverClasspath: List<File> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'LOG' @ [90:5] ==> private val LOG: Logger defined in org.jetbrains.kotlin.script in file scriptTemplateProviderExtensionPoint.kt[PropertyDescriptorImpl]

'info' @ [90:9] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'provider' @ [90:50] ==> value-parameter provider: ScriptTemplatesProvider defined in org.jetbrains.kotlin.script.createClassLoader[ValueParameterDescriptorImpl]

'templateClassNames' @ [90:59] ==> public abstract val templateClassNames: Iterable<String> defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[PropertyDescriptorImpl]

'classpath' @ [90:91] ==> val classpath: List<File> defined in org.jetbrains.kotlin.script.createClassLoader[LocalVariableDescriptor]

'joinToString' @ [90:101] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [90:119] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'ScriptTemplatesProvider' @ [91:22] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptTemplatesProvider[FakeCallableDescriptorForObject]

'java' @ [91:53] ==> public val <T> KClass<ScriptTemplatesProvider>.java: Class<ScriptTemplatesProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptTemplatesProvider

'classLoader' @ [91:58] ==> public final val <T : (Any..Any?)> Class<ScriptTemplatesProvider>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptTemplatesProvider

'if (classpath.isEmpty()) baseLoader else URLClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray(), baseLoader)' @ [92:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassLoader, elseBranch: ClassLoader): ClassLoader[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassLoader

'classpath' @ [92:16] ==> val classpath: List<File> defined in org.jetbrains.kotlin.script.createClassLoader[LocalVariableDescriptor]

'isEmpty' @ [92:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'baseLoader' @ [92:37] ==> val baseLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.script.createClassLoader[LocalVariableDescriptor]

'URLClassLoader' @ [92:53] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classpath' @ [92:68] ==> val classpath: List<File> defined in org.jetbrains.kotlin.script.createClassLoader[LocalVariableDescriptor]

'map' @ [92:78] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [92:84] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.createClassLoader.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [92:87] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [92:95] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [92:105] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'baseLoader' @ [92:121] ==> val baseLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.script.createClassLoader[LocalVariableDescriptor]

'getInstance' @ [95:26] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

