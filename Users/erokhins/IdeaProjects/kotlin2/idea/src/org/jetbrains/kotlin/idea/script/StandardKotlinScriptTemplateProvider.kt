'listOf' @ [36:63] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ScriptTemplateWithArgs' @ [36:70] ==> public constructor ScriptTemplateWithArgs(args: Array<String>) defined in kotlin.script.templates.standard.ScriptTemplateWithArgs[DeserializedClassConstructorDescriptor]

'qualifiedName' @ [36:100] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'emptyList' @ [37:44] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'mapOf' @ [40:16] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any?>): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'KotlinScriptResolveScopeProvider' @ [41:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider[FakeCallableDescriptorForObject]

'USE_NULL_RESOLVE_SCOPE' @ [41:50] ==> public final val USE_NULL_RESOLVE_SCOPE: String defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.Companion[DeserializedPropertyDescriptor]

'to' @ [42:17] ==> public infix fun <A, B> String.to(that: String?): Pair<String, String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String?

'getScriptSDK' @ [42:26] ==> private final fun getScriptSDK(project: Project): String? defined in org.jetbrains.kotlin.idea.script.StandardKotlinScriptTemplateProvider[SimpleFunctionDescriptorImpl]

'project' @ [42:39] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.script.StandardKotlinScriptTemplateProvider[PropertyDescriptorImpl]

'BundledKotlinScriptDependenciesResolver' @ [46:51] ==> public constructor BundledKotlinScriptDependenciesResolver() defined in org.jetbrains.kotlin.idea.script.BundledKotlinScriptDependenciesResolver[ClassConstructorDescriptorImpl]

'?:' @ [49:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Sdk?, right: Sdk?): Sdk?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Sdk?

'getAnyJdk' @ [49:30] ==> @Nullable public open fun getAnyJdk(p0: (Project..Project?)): Sdk? defined in com.intellij.openapi.projectRoots.ex.PathUtilEx[JavaMethodDescriptor]

'project' @ [49:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.script.StandardKotlinScriptTemplateProvider.getScriptSDK[ValueParameterDescriptorImpl]

'getInstance' @ [50:35] ==> public open fun getInstance(): (ProjectJdkTable..ProjectJdkTable?) defined in com.intellij.openapi.projectRoots.ProjectJdkTable[JavaMethodDescriptor]

'allJdks' @ [50:49] ==> public final val ProjectJdkTable.allJdks: (Array<(Sdk..Sdk?)>..Array<out (Sdk..Sdk?)>)[MyPropertyDescriptor]

'firstOrNull' @ [50:57] ==> public inline fun <T> Array<out (Sdk..Sdk?)>.firstOrNull(predicate: ((Sdk..Sdk?)) -> Boolean): Sdk? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.projectRoots.Sdk..com.intellij.openapi.projectRoots.Sdk?)

'sdk' @ [50:78] ==> value-parameter sdk: (Sdk..Sdk?) defined in org.jetbrains.kotlin.idea.script.StandardKotlinScriptTemplateProvider.getScriptSDK.<anonymous>[ValueParameterDescriptorImpl]

'sdkType' @ [50:82] ==> public final val Sdk.sdkType: SdkTypeId[MyPropertyDescriptor]

'jdk' @ [52:16] ==> val jdk: Sdk? defined in org.jetbrains.kotlin.idea.script.StandardKotlinScriptTemplateProvider.getScriptSDK[LocalVariableDescriptor]

'homePath' @ [52:21] ==> public final val Sdk.homePath: String?[MyPropertyDescriptor]

'environment' @ [61:24] ==> value-parameter environment: Environment /* = Map<String, Any?> */ defined in org.jetbrains.kotlin.idea.script.BundledKotlinScriptDependenciesResolver.resolve[ValueParameterDescriptorImpl]

'get' @ [61:36] ==> public abstract operator fun get(key: String): Any? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'ScriptDependencies' @ [62:28] ==> public constructor ScriptDependencies(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...) defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedClassConstructorDescriptor]

'javaHome' @ [63:28] ==> val javaHome: String? defined in org.jetbrains.kotlin.idea.script.BundledKotlinScriptDependenciesResolver.resolve[LocalVariableDescriptor]

'let' @ [63:38] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [63:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'with' @ [64:29] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinPaths, block: KotlinPaths.() -> List<File>): List<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPaths
    <R> -> List<File>

'kotlinPathsForIdeaPlugin' @ [64:43] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'listOf' @ [65:21] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'reflectPath' @ [66:29] ==> public final val KotlinPaths.reflectPath: File[MyPropertyDescriptor]

'stdlibPath' @ [67:29] ==> public final val KotlinPaths.stdlibPath: File[MyPropertyDescriptor]

'scriptRuntimePath' @ [68:29] ==> public final val KotlinPaths.scriptRuntimePath: File[MyPropertyDescriptor]

'dependencies' @ [72:16] ==> val dependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.script.BundledKotlinScriptDependenciesResolver.resolve[LocalVariableDescriptor]

'asSuccess' @ [72:29] ==> public fun ScriptDependencies.asSuccess(): DependenciesResolver.ResolveResult.Success defined in kotlin.script.experimental.dependencies[DeserializedSimpleFunctionDescriptor]

