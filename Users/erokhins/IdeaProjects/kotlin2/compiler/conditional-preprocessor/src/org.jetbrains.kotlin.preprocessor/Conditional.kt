'minimum' @ [30:38] ==> public final val minimum: Int defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion[PropertyDescriptorImpl]

'maximum' @ [30:47] ==> public final val maximum: Int defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion[PropertyDescriptorImpl]

'Parser' @ [31:28] ==> public constructor Parser(name: String, parse: (arguments: PositionalAndNamedArguments) -> Conditional) defined in org.jetbrains.kotlin.preprocessor.Conditional.Parser[ClassConstructorDescriptorImpl]

'arguments' @ [32:27] ==> value-parameter arguments: PositionalAndNamedArguments defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'parseIntegerValue' @ [32:52] ==> public fun ValueArgument.parseIntegerValue(): Int defined in org.jetbrains.kotlin.preprocessor in file ValueArguments.kt[SimpleFunctionDescriptorImpl]

'arguments' @ [33:27] ==> value-parameter arguments: PositionalAndNamedArguments defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'parseIntegerValue' @ [33:52] ==> public fun ValueArgument.parseIntegerValue(): Int defined in org.jetbrains.kotlin.preprocessor in file ValueArguments.kt[SimpleFunctionDescriptorImpl]

'JvmVersion' @ [35:13] ==> public constructor JvmVersion(minimum: Int, maximum: Int) defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion[ClassConstructorDescriptorImpl]

'minimum' @ [35:24] ==> val minimum: Int? defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion.Companion.<init>.<anonymous>[LocalVariableDescriptor]

'maximum' @ [35:38] ==> val maximum: Int? defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion.Companion.<init>.<anonymous>[LocalVariableDescriptor]

'Parser' @ [40:28] ==> public constructor Parser(name: String, parse: (arguments: PositionalAndNamedArguments) -> Conditional) defined in org.jetbrains.kotlin.preprocessor.Conditional.Parser[ClassConstructorDescriptorImpl]

'JsVersion' @ [40:58] ==> public constructor JsVersion(version: Int = ...) defined in org.jetbrains.kotlin.preprocessor.Conditional.JsVersion[ClassConstructorDescriptorImpl]

'Parser' @ [44:28] ==> public constructor Parser(name: String, parse: (arguments: PositionalAndNamedArguments) -> Conditional) defined in org.jetbrains.kotlin.preprocessor.Conditional.Parser[ClassConstructorDescriptorImpl]

'arguments' @ [45:24] ==> value-parameter arguments: PositionalAndNamedArguments defined in org.jetbrains.kotlin.preprocessor.Conditional.TargetName.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'parseStringValue' @ [45:47] ==> public fun ValueArgument.parseStringValue(): String defined in org.jetbrains.kotlin.preprocessor in file ValueArguments.kt[SimpleFunctionDescriptorImpl]

'TargetName' @ [46:13] ==> public constructor TargetName(name: String) defined in org.jetbrains.kotlin.preprocessor.Conditional.TargetName[ClassConstructorDescriptorImpl]

'name' @ [46:24] ==> val name: String defined in org.jetbrains.kotlin.preprocessor.Conditional.TargetName.Companion.<init>.<anonymous>[LocalVariableDescriptor]

'listOf' @ [52:48] ==> public fun <T> listOf(vararg elements: Conditional.Parser): List<Conditional.Parser> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parser

'JvmVersion' @ [52:63] ==> public companion object : Conditional.Parser defined in org.jetbrains.kotlin.preprocessor.Conditional.JvmVersion[FakeCallableDescriptorForObject]

'JsVersion' @ [52:75] ==> public companion object : Conditional.Parser defined in org.jetbrains.kotlin.preprocessor.Conditional.JsVersion[FakeCallableDescriptorForObject]

'TargetName' @ [52:86] ==> public companion object : Conditional.Parser defined in org.jetbrains.kotlin.preprocessor.Conditional.TargetName[FakeCallableDescriptorForObject]

'associateBy' @ [52:98] ==> public inline fun <T, K> Iterable<Conditional.Parser>.associateBy(keySelector: (Conditional.Parser) -> String): Map<String, Conditional.Parser> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parser
    <K> -> String

'it' @ [52:112] ==> value-parameter it: Conditional.Parser defined in org.jetbrains.kotlin.preprocessor.Conditional.Companion.ANNOTATIONS.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [52:115] ==> public final val name: String defined in org.jetbrains.kotlin.preprocessor.Conditional.Parser[PropertyDescriptorImpl]

'annotationEntries' @ [57:9] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'mapNotNull' @ [57:27] ==> public inline fun <T, R : Any> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.mapNotNull(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Conditional?): List<Conditional> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R : Any> -> Conditional

'Conditional' @ [58:26] ==> public companion object defined in org.jetbrains.kotlin.preprocessor.Conditional[FakeCallableDescriptorForObject]

'ANNOTATIONS' @ [58:38] ==> public final val ANNOTATIONS: Map<String, Conditional.Parser> defined in org.jetbrains.kotlin.preprocessor.Conditional.Companion[PropertyDescriptorImpl]

'get' @ [58:50] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out String?, Conditional.Parser>.get(key: String?): Conditional.Parser? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> String?
    <V> -> Parser

'it' @ [58:54] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.preprocessor.parseConditionalAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'typeReferenceName' @ [58:57] ==> public val KtAnnotationEntry.typeReferenceName: String? defined in org.jetbrains.kotlin.preprocessor in file Conditional.kt[PropertyDescriptorImpl]

'parser' @ [59:13] ==> val parser: Conditional.Parser? defined in org.jetbrains.kotlin.preprocessor.parseConditionalAnnotations.<anonymous>[LocalVariableDescriptor]

'parse' @ [59:21] ==> public final val parse: (arguments: PositionalAndNamedArguments) -> Conditional defined in org.jetbrains.kotlin.preprocessor.Conditional.Parser[PropertyDescriptorImpl]

'invoke' @ [59:28] ==> public abstract operator fun invoke(arguments: @ParameterName PositionalAndNamedArguments): Conditional defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [59:35] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.preprocessor.parseConditionalAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'valueArguments' @ [59:38] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'splitToPositionalAndNamed' @ [59:53] ==> public fun List<ValueArgument>.splitToPositionalAndNamed(): PositionalAndNamedArguments defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'typeReference' @ [64:10] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeElement' @ [64:25] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'referencedName' @ [64:54] ==> public final val KtUserType.referencedName: String?[MyPropertyDescriptor]

