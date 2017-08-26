'typeReference' @ [30:58] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [30:73] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'referencedName' @ [30:102] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

'orAnonymous' @ [30:117] ==> internal fun String?.orAnonymous(kind: String = ...): String defined in org.jetbrains.kotlin.script in file scriptAnnotationsPreprocessing.kt[SimpleFunctionDescriptorImpl]

'this' @ [33:9] ==> <this> defined in org.jetbrains.kotlin.script.orAnonymous[ReceiverParameterDescriptorImpl]

'+' @ [33:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (kind.isNotBlank()) " $kind" else ""' @ [33:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'kind' @ [33:37] ==> value-parameter kind: String = ... defined in org.jetbrains.kotlin.script.orAnonymous[ValueParameterDescriptorImpl]

'isNotBlank' @ [33:42] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kind' @ [33:59] ==> value-parameter kind: String = ... defined in org.jetbrains.kotlin.script.orAnonymous[ValueParameterDescriptorImpl]

'psi' @ [37:26] ==> value-parameter psi: KtAnnotationEntry defined in org.jetbrains.kotlin.script.constructAnnotation[ValueParameterDescriptorImpl]

'valueArguments' @ [37:30] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'map' @ [37:45] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> Pair<String?, Any?>): List<Pair<String?, Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> Pair<String?, Any?>

'ConstantExpressionEvaluator' @ [38:25] ==> public constructor ConstantExpressionEvaluator(builtIns: KotlinBuiltIns, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedClassConstructorDescriptor]

'Instance' @ [38:69] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'DEFAULT' @ [38:107] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'BindingTraceContext' @ [39:21] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'evaluator' @ [40:22] ==> val evaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[LocalVariableDescriptor]

'evaluateToConstantValue' @ [40:32] ==> public final fun evaluateToConstantValue(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[DeserializedSimpleFunctionDescriptor]

'arg' @ [40:56] ==> value-parameter arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [40:60] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'trace' @ [40:87] ==> val trace: BindingTraceContext defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[LocalVariableDescriptor]

'NO_EXPECTED_TYPE' @ [40:104] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'arg' @ [42:23] ==> value-parameter arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [42:27] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [42:46] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'toString' @ [42:54] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'argName' @ [43:9] ==> val argName: String? defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[LocalVariableDescriptor]

'result' @ [43:20] ==> val result: ConstantValue<*>? defined in org.jetbrains.kotlin.script.constructAnnotation.<anonymous>[LocalVariableDescriptor]

'value' @ [43:28] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'tryCreateCallableMappingFromNamedArgs' @ [46:9] ==> public fun tryCreateCallableMappingFromNamedArgs(callable: KCallable<*>, args: List<Pair<String?, Any?>>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script in file reflectionUtil.kt[SimpleFunctionDescriptorImpl]

'targetClass' @ [46:47] ==> value-parameter targetClass: KClass<out Annotation> defined in org.jetbrains.kotlin.script.constructAnnotation[ValueParameterDescriptorImpl]

'constructors' @ [46:59] ==> public abstract val constructors: Collection<KFunction<Annotation>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'first' @ [46:72] ==> public fun <T> Iterable<KFunction<Annotation>>.first(): KFunction<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<Annotation>

'valueArguments' @ [46:81] ==> val valueArguments: List<Pair<String?, Any?>> defined in org.jetbrains.kotlin.script.constructAnnotation[LocalVariableDescriptor]

'InvalidScriptResolverAnnotation' @ [47:19] ==> public constructor InvalidScriptResolverAnnotation(name: String, annParams: List<Pair<String?, Any?>>?, error: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.script.InvalidScriptResolverAnnotation[ClassConstructorDescriptorImpl]

'psi' @ [47:51] ==> value-parameter psi: KtAnnotationEntry defined in org.jetbrains.kotlin.script.constructAnnotation[ValueParameterDescriptorImpl]

'typeName' @ [47:55] ==> internal val KtAnnotationEntry.typeName: String defined in org.jetbrains.kotlin.script in file scriptAnnotationsPreprocessing.kt[PropertyDescriptorImpl]

'valueArguments' @ [47:65] ==> val valueArguments: List<Pair<String?, Any?>> defined in org.jetbrains.kotlin.script.constructAnnotation[LocalVariableDescriptor]

'targetClass' @ [50:16] ==> value-parameter targetClass: KClass<out Annotation> defined in org.jetbrains.kotlin.script.constructAnnotation[ValueParameterDescriptorImpl]

'primaryConstructor' @ [50:28] ==> @SinceKotlin public val <T : Any> KClass<out Annotation>.primaryConstructor: KFunction<Annotation>? defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Annotation)

'callBy' @ [50:49] ==> public abstract fun callBy(args: Map<KParameter, Any?>): Annotation defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'mappedArguments' @ [50:56] ==> val mappedArguments: Map<KParameter, Any?> defined in org.jetbrains.kotlin.script.constructAnnotation[LocalVariableDescriptor]

'InvalidScriptResolverAnnotation' @ [53:16] ==> public constructor InvalidScriptResolverAnnotation(name: String, annParams: List<Pair<String?, Any?>>?, error: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.script.InvalidScriptResolverAnnotation[ClassConstructorDescriptorImpl]

'psi' @ [53:48] ==> value-parameter psi: KtAnnotationEntry defined in org.jetbrains.kotlin.script.constructAnnotation[ValueParameterDescriptorImpl]

'typeName' @ [53:52] ==> internal val KtAnnotationEntry.typeName: String defined in org.jetbrains.kotlin.script in file scriptAnnotationsPreprocessing.kt[PropertyDescriptorImpl]

'valueArguments' @ [53:62] ==> val valueArguments: List<Pair<String?, Any?>> defined in org.jetbrains.kotlin.script.constructAnnotation[LocalVariableDescriptor]

'ex' @ [53:78] ==> val ex: Exception /* = Exception */ defined in org.jetbrains.kotlin.script.constructAnnotation[LocalVariableDescriptor]

'Suppress' @ [60:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'InvalidScriptResolverAnnotation' @ [62:60] ==> public constructor InvalidScriptResolverAnnotation(name: String, annParams: List<Pair<String?, Any?>>?, error: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.script.InvalidScriptResolverAnnotation[ClassConstructorDescriptorImpl]

'java' @ [62:99] ==> public val <T> KClass<InvalidScriptResolverAnnotation>.java: Class<InvalidScriptResolverAnnotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InvalidScriptResolverAnnotation

