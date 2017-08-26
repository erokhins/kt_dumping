'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'emptyList' @ [41:45] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'KotlinScriptDefinition' @ [42:5] ==> public constructor KotlinScriptDefinition(template: KClass<out Any>) defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedClassConstructorDescriptor]

'template' @ [42:28] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'lazy' @ [44:30] ==> public fun <T> lazy(initializer: () -> String): Lazy<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'providedScriptFilePattern' @ [45:9] ==> value-parameter providedScriptFilePattern: String? = ... defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'takeUnlessError' @ [46:12] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> String?): String? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'template' @ [46:30] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'annotations' @ [46:39] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [46:51] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ScriptTemplateDefinition

'scriptFilePattern' @ [46:126] ==> public final val scriptFilePattern: String defined in kotlin.script.templates.ScriptTemplateDefinition[DeserializedPropertyDescriptor]

'takeUnlessError' @ [47:12] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> String?): String? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'template' @ [47:30] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'annotations' @ [47:39] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [47:51] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ScriptTemplateDefinition

'scriptFilePattern' @ [47:130] ==> public final val scriptFilePattern: String defined in org.jetbrains.kotlin.script.ScriptTemplateDefinition[PropertyDescriptorImpl]

'DEFAULT_SCRIPT_FILE_PATTERN' @ [48:12] ==> public const val DEFAULT_SCRIPT_FILE_PATTERN: String defined in org.jetbrains.kotlin.script in file scriptTemplate.kt[PropertyDescriptorImpl]

'lazy' @ [51:62] ==> public fun <T> lazy(initializer: () -> DependenciesResolver): Lazy<DependenciesResolver> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DependenciesResolver

'providedResolver' @ [52:9] ==> value-parameter providedResolver: DependenciesResolver? = ... defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'resolverFromAnnotation' @ [53:9] ==> private final fun resolverFromAnnotation(template: KClass<out Any>): DependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]

'template' @ [53:32] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'resolverFromLegacyAnnotation' @ [54:9] ==> private final fun resolverFromLegacyAnnotation(template: KClass<out Any>): DependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]

'template' @ [54:38] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'NoDependencies' @ [55:30] ==> public object NoDependencies : DependenciesResolver defined in kotlin.script.experimental.dependencies.DependenciesResolver[FakeCallableDescriptorForObject]

'takeUnlessError' @ [59:28] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> ScriptTemplateDefinition?): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ScriptTemplateDefinition

'template' @ [60:13] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromLegacyAnnotation[ValueParameterDescriptorImpl]

'annotations' @ [60:22] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [60:34] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ScriptTemplateDefinition

'log' @ [63:9] ==> internal final val log: Logger defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.Companion[PropertyDescriptorImpl]

'warn' @ [63:13] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'instantiateResolver' @ [65:16] ==> private final fun <T : Any> instantiateResolver(resolverClass: KClass<out ScriptDependenciesResolver>): ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ScriptDependenciesResolver

'legacyDefAnn' @ [65:36] ==> val legacyDefAnn: ScriptTemplateDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromLegacyAnnotation[LocalVariableDescriptor]

'resolver' @ [65:49] ==> public final val resolver: KClass<out ScriptDependenciesResolver> defined in org.jetbrains.kotlin.script.ScriptTemplateDefinition[PropertyDescriptorImpl]

'let' @ [65:60] ==> @InlineOnly public inline fun <T, R> ScriptDependenciesResolver.let(block: (ScriptDependenciesResolver) -> LegacyPackageDependencyResolverWrapper): LegacyPackageDependencyResolverWrapper defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesResolver
    <R> -> LegacyPackageDependencyResolverWrapper

'takeUnlessError' @ [69:22] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> ScriptTemplateDefinition?): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ScriptTemplateDefinition

'template' @ [70:13] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[ValueParameterDescriptorImpl]

'annotations' @ [70:22] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [70:34] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): ScriptTemplateDefinition? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ScriptTemplateDefinition

'instantiateResolver' @ [73:24] ==> private final fun <T : Any> instantiateResolver(resolverClass: KClass<out ScriptDependenciesResolver>): ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ScriptDependenciesResolver

'defAnn' @ [73:44] ==> val defAnn: ScriptTemplateDefinition defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[LocalVariableDescriptor]

'resolver' @ [73:51] ==> public final val resolver: KClass<out ScriptDependenciesResolver> defined in kotlin.script.templates.ScriptTemplateDefinition[DeserializedPropertyDescriptor]

'when (resolver) {
            is AsyncDependenciesResolver -> AsyncDependencyResolverWrapper(resolver)
            is DependenciesResolver -> resolver
            else -> resolver?.let(::ApiChangeDependencyResolverWrapper)
        }' @ [74:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DependenciesResolver?, entry1: DependenciesResolver?, entry2: DependenciesResolver?): DependenciesResolver?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DependenciesResolver?

'resolver' @ [74:22] ==> val resolver: ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[LocalVariableDescriptor]

'AsyncDependencyResolverWrapper' @ [75:45] ==> public constructor AsyncDependencyResolverWrapper(delegate: AsyncDependenciesResolver) defined in org.jetbrains.kotlin.script.AsyncDependencyResolverWrapper[ClassConstructorDescriptorImpl]

'resolver' @ [75:76] ==> val resolver: ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[LocalVariableDescriptor]

'resolver' @ [76:40] ==> val resolver: ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[LocalVariableDescriptor]

'resolver' @ [77:21] ==> val resolver: ScriptDependenciesResolver? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.resolverFromAnnotation[LocalVariableDescriptor]

'let' @ [77:31] ==> @InlineOnly public inline fun <T, R> ScriptDependenciesResolver.let(block: (ScriptDependenciesResolver) -> ApiChangeDependencyResolverWrapper): ApiChangeDependencyResolverWrapper defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesResolver
    <R> -> ApiChangeDependencyResolverWrapper

'resolverClass' @ [83:48] ==> value-parameter resolverClass: KClass<T> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver[ValueParameterDescriptorImpl]

'constructors' @ [83:62] ==> public abstract val constructors: Collection<KFunction<T>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'find' @ [83:75] ==> @InlineOnly public inline fun <T> Iterable<KFunction<T>>.find(predicate: (KFunction<T>) -> Boolean): KFunction<T>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<T>

'it' @ [83:82] ==> value-parameter it: KFunction<T> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [83:85] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'all' @ [83:96] ==> public inline fun <T> Iterable<KParameter>.all(predicate: (KParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter

'it' @ [83:102] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isOptional' @ [83:105] ==> public abstract val isOptional: Boolean defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'constructorWithoutParameters' @ [84:17] ==> val constructorWithoutParameters: KFunction<T>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver[LocalVariableDescriptor]

'log' @ [85:17] ==> internal final val log: Logger defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.Companion[PropertyDescriptorImpl]

'warn' @ [85:21] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'resolverClass' @ [85:35] ==> value-parameter resolverClass: KClass<T> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver[ValueParameterDescriptorImpl]

'qualifiedName' @ [85:49] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'constructorWithoutParameters' @ [88:20] ==> val constructorWithoutParameters: KFunction<T>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver[LocalVariableDescriptor]

'callBy' @ [88:49] ==> public abstract fun callBy(args: Map<KParameter, Any?>): T defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [88:56] ==> public fun <K, V> emptyMap(): Map<KParameter, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KParameter
    <V> -> Any?

'log' @ [91:13] ==> internal final val log: Logger defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.Companion[PropertyDescriptorImpl]

'warn' @ [91:17] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ex' @ [91:48] ==> val ex: ClassCastException /* = ClassCastException */ defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.instantiateResolver[LocalVariableDescriptor]

'message' @ [91:51] ==> public open val message: String? defined in java.lang.ClassCastException[DeserializedPropertyDescriptor]

'lazy' @ [96:62] ==> public fun <T> lazy(initializer: () -> List<String>?): Lazy<List<String>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>?

'takeUnlessError' @ [97:9] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> List<String>?): List<String>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<String>

'template' @ [97:27] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'annotations' @ [97:36] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [97:48] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): SamWithReceiverAnnotations? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SamWithReceiverAnnotations

'annotations' @ [97:126] ==> public final val annotations: Array<out String> defined in kotlin.script.extensions.SamWithReceiverAnnotations[DeserializedPropertyDescriptor]

'toList' @ [97:139] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'takeUnlessError' @ [98:12] ==> private final inline fun <T> takeUnlessError(reportError: Boolean = ..., body: () -> List<String>?): List<String>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<String>

'template' @ [98:30] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'annotations' @ [98:39] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [98:51] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): SamWithReceiverAnnotations? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SamWithReceiverAnnotations

'annotations' @ [98:132] ==> public final val annotations: Array<out String> defined in org.jetbrains.kotlin.script.SamWithReceiverAnnotations[PropertyDescriptorImpl]

'toList' @ [98:145] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lazy' @ [101:71] ==> public fun <T> lazy(initializer: () -> List<KClass<out Annotation>>): Lazy<List<KClass<out Annotation>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KClass<out Annotation>>

'left' @ [104:17] ==> value-parameter left: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'name' @ [104:22] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'right' @ [104:30] ==> value-parameter right: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'name' @ [104:36] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'left' @ [105:17] ==> value-parameter left: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'parameters' @ [105:22] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [105:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'right' @ [105:41] ==> value-parameter right: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'parameters' @ [105:47] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [105:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'left' @ [106:17] ==> value-parameter left: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'parameters' @ [106:22] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'zip' @ [106:33] ==> public infix fun <T, R> Iterable<KParameter>.zip(other: Iterable<KParameter>): List<Pair<KParameter, KParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> KParameter

'right' @ [106:37] ==> value-parameter right: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature[ValueParameterDescriptorImpl]

'parameters' @ [106:43] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'all' @ [106:55] ==> public inline fun <T> Iterable<Pair<KParameter, KParameter>>.all(predicate: (Pair<KParameter, KParameter>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KParameter, KParameter>

'it' @ [107:21] ==> value-parameter it: Pair<KParameter, KParameter> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [107:24] ==> public final val first: KParameter defined in kotlin.Pair[DeserializedPropertyDescriptor]

'kind' @ [107:30] ==> public abstract val kind: KParameter.Kind defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'INSTANCE' @ [107:54] ==> enum entry INSTANCE defined in kotlin.reflect.KParameter.Kind[FakeCallableDescriptorForObject]

'it' @ [108:21] ==> value-parameter it: Pair<KParameter, KParameter> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [108:24] ==> public final val first: KParameter defined in kotlin.Pair[DeserializedPropertyDescriptor]

'type' @ [108:30] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'it' @ [108:38] ==> value-parameter it: Pair<KParameter, KParameter> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.sameSignature.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [108:41] ==> public final val second: KParameter defined in kotlin.Pair[DeserializedPropertyDescriptor]

'type' @ [108:48] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'getResolveFunctions' @ [111:32] ==> private final fun getResolveFunctions(): List<KFunction<*>> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[SimpleFunctionDescriptorImpl]

'dependencyResolver' @ [113:9] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[PropertyDescriptorImpl]

'unwrap' @ [113:28] ==> public fun ScriptDependenciesResolver.unwrap(): ScriptDependenciesResolver defined in org.jetbrains.kotlin.script in file KotlinScriptDefinitionFromAnnotatedTemplate.kt[SimpleFunctionDescriptorImpl]

'memberFunctions' @ [113:44] ==> @SinceKotlin public val KClass<*>.memberFunctions: Collection<KFunction<*>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]

'filter' @ [114:18] ==> public inline fun <T> Iterable<KFunction<*>>.filter(predicate: (KFunction<*>) -> Boolean): List<KFunction<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'resolveFunctions' @ [114:39] ==> val resolveFunctions: List<KFunction<*>> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>[LocalVariableDescriptor]

'any' @ [114:56] ==> public inline fun <T> Iterable<KFunction<*>>.any(predicate: (KFunction<*>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'sameSignature' @ [114:62] ==> local final fun sameSignature(left: KFunction<*>, right: KFunction<*>): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>[SimpleFunctionDescriptorImpl]

'function' @ [114:76] ==> value-parameter function: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [114:86] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [115:18] ==> public inline fun <T, R> Iterable<KFunction<*>>.flatMap(transform: (KFunction<*>) -> Iterable<Annotation>): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>
    <R> -> Annotation

'it' @ [115:28] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [115:31] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'filterIsInstance' @ [116:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<AcceptedAnnotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> AcceptedAnnotations

'flatMap' @ [117:18] ==> public inline fun <T, R> Iterable<AcceptedAnnotations>.flatMap(transform: (AcceptedAnnotations) -> Iterable<KClass<out Annotation>>): List<KClass<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AcceptedAnnotations
    <R> -> KClass<out Annotation>

'it' @ [117:28] ==> value-parameter it: AcceptedAnnotations defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'supportedAnnotationClasses' @ [117:31] ==> public final val supportedAnnotationClasses: Array<out KClass<out Annotation>> defined in kotlin.script.templates.AcceptedAnnotations[DeserializedPropertyDescriptor]

'toList' @ [117:58] ==> public fun <T> Array<out KClass<out Annotation>>.toList(): List<KClass<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>

'distinctBy' @ [118:18] ==> public inline fun <T, K> Iterable<KClass<out Annotation>>.distinctBy(selector: (KClass<out Annotation>) -> String?): List<KClass<out Annotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>
    <K> -> String?

'it' @ [118:31] ==> value-parameter it: KClass<out Annotation> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.acceptedAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [118:34] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'memberFunctions' @ [123:49] ==> @SinceKotlin public val KClass<*>.memberFunctions: Collection<KFunction<*>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]

'filter' @ [123:65] ==> public inline fun <T> Iterable<KFunction<*>>.filter(predicate: (KFunction<*>) -> Boolean): List<KFunction<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'it' @ [123:74] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.getResolveFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [123:77] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'it' @ [123:98] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.getResolveFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [123:101] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'also' @ [123:126] ==> @InlineOnly @SinceKotlin public inline fun <T> List<KFunction<*>>.also(block: (List<KFunction<*>>) -> Unit): List<KFunction<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KFunction<*>>

'assert' @ [124:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'it' @ [124:20] ==> value-parameter it: List<KFunction<*>> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.getResolveFunctions.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [124:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'memberFunctions' @ [125:50] ==> @SinceKotlin public val KClass<*>.memberFunctions: Collection<KFunction<*>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]

'joinToString' @ [126:26] ==> public fun <T> Iterable<KFunction<*>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KFunction<*>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'qualifiedName' @ [126:84] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'it' @ [126:130] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.getResolveFunctions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [126:133] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'template' @ [131:25] ==> value-parameter template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.<init>[ValueParameterDescriptorImpl]

'simpleName' @ [131:34] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'scriptFilePattern' @ [134:13] ==> public final val scriptFilePattern: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[PropertyDescriptorImpl]

'let' @ [134:31] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'Regex' @ [134:37] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'it' @ [134:43] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.isScript.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [134:47] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'fileName' @ [134:55] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.isScript[ValueParameterDescriptorImpl]

'NameUtils' @ [137:58] ==> public object NameUtils defined in org.jetbrains.kotlin.name[FakeCallableDescriptorForObject]

'getScriptNameForFile' @ [137:68] ==> @JvmStatic public final fun getScriptNameForFile(filePath: String): Name defined in org.jetbrains.kotlin.name.NameUtils[DeserializedSimpleFunctionDescriptor]

'script' @ [137:89] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.getScriptName[ValueParameterDescriptorImpl]

'containingKtFile' @ [137:96] ==> public final val KtScript.containingKtFile: KtFile[MyPropertyDescriptor]

'name' @ [137:113] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'template' @ [139:88] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'simpleName' @ [139:97] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'samWithReceiverAnnotations' @ [142:17] ==> private final val samWithReceiverAnnotations: List<String>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[PropertyDescriptorImpl]

'super' @ [142:47] ==> <this> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[LazyClassReceiverParameterDescriptor]

'annotationsForSamWithReceivers' @ [142:53] ==> public open val annotationsForSamWithReceivers: List<String> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'invoke' @ [146:17] ==> public abstract operator fun invoke(): T? defined in kotlin.Function0[FunctionInvokeDescriptor]

'if (reportError) {
                    log.error("Invalid script template: " + template.qualifiedName, ex)
                }
                else {
                    log.warn("Invalid script template: " + template.qualifiedName, ex)
                }' @ [149:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'reportError' @ [149:21] ==> value-parameter reportError: Boolean = ... defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.takeUnlessError[ValueParameterDescriptorImpl]

'log' @ [150:21] ==> internal final val log: Logger defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.Companion[PropertyDescriptorImpl]

'error' @ [150:25] ==> public open fun error(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [150:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'template' @ [150:61] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'qualifiedName' @ [150:70] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'ex' @ [150:85] ==> val ex: Throwable defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.takeUnlessError[LocalVariableDescriptor]

'log' @ [153:21] ==> internal final val log: Logger defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.Companion[PropertyDescriptorImpl]

'warn' @ [153:25] ==> public abstract fun warn(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [153:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'template' @ [153:60] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'qualifiedName' @ [153:69] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'ex' @ [153:84] ==> val ex: Throwable defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate.takeUnlessError[LocalVariableDescriptor]

'getInstance' @ [159:35] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [159:47] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[FakeCallableDescriptorForObject]

'java' @ [159:98] ==> public val <T> KClass<KotlinScriptDefinitionFromAnnotatedTemplate>.java: Class<KotlinScriptDefinitionFromAnnotatedTemplate> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinScriptDefinitionFromAnnotatedTemplate

'if (this is DependencyResolverWrapper<*>) delegate.unwrap() else this' @ [168:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScriptDependenciesResolver, elseBranch: ScriptDependenciesResolver): ScriptDependenciesResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScriptDependenciesResolver

'this' @ [168:16] ==> <this> defined in org.jetbrains.kotlin.script.unwrap[ReceiverParameterDescriptorImpl]

'delegate' @ [168:54] ==> public abstract val delegate: ScriptDependenciesResolver defined in org.jetbrains.kotlin.script.DependencyResolverWrapper[PropertyDescriptorImpl]

'unwrap' @ [168:63] ==> public fun ScriptDependenciesResolver.unwrap(): ScriptDependenciesResolver defined in org.jetbrains.kotlin.script in file KotlinScriptDefinitionFromAnnotatedTemplate.kt[SimpleFunctionDescriptorImpl]

'this' @ [168:77] ==> <this> defined in org.jetbrains.kotlin.script.unwrap[ReceiverParameterDescriptorImpl]

