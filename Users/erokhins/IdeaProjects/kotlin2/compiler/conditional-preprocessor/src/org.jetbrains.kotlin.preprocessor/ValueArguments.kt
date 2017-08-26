'positional' @ [26:13] ==> public final val positional: List<ValueArgument> defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments[PropertyDescriptorImpl]

'getOrNull' @ [26:24] ==> public fun <T> List<ValueArgument>.getOrNull(index: Int): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'position' @ [26:34] ==> value-parameter position: Int defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments.get[ValueParameterDescriptorImpl]

'named' @ [26:47] ==> public final val named: List<ValueArgument> defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments[PropertyDescriptorImpl]

'find' @ [26:53] ==> @InlineOnly public inline fun <T> Iterable<ValueArgument>.find(predicate: (ValueArgument) -> Boolean): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'it' @ [26:60] ==> value-parameter it: ValueArgument defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments.get.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [26:63] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [26:83] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'asString' @ [26:90] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [26:104] ==> value-parameter name: String defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments.get[ValueParameterDescriptorImpl]

'component1' @ [30:10] ==> public final operator fun component1(): List<ValueArgument> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [30:22] ==> public final operator fun component2(): List<ValueArgument> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'partition' @ [30:31] ==> public inline fun <T> Iterable<ValueArgument>.partition(predicate: (ValueArgument) -> Boolean): Pair<List<ValueArgument>, List<ValueArgument>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'!' @ [30:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [30:44] ==> value-parameter it: ValueArgument defined in org.jetbrains.kotlin.preprocessor.splitToPositionalAndNamed.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [30:47] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'PositionalAndNamedArguments' @ [31:12] ==> public constructor PositionalAndNamedArguments(positional: List<ValueArgument>, named: List<ValueArgument>) defined in org.jetbrains.kotlin.preprocessor.PositionalAndNamedArguments[ClassConstructorDescriptorImpl]

'positional' @ [31:40] ==> val positional: List<ValueArgument> defined in org.jetbrains.kotlin.preprocessor.splitToPositionalAndNamed[LocalVariableDescriptor]

'named' @ [31:52] ==> val named: List<ValueArgument> defined in org.jetbrains.kotlin.preprocessor.splitToPositionalAndNamed[LocalVariableDescriptor]

'getArgumentExpression' @ [34:46] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [34:72] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'toInt' @ [34:77] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getArgumentExpression' @ [35:48] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'getChildrenOfType' @ [35:74] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<KtStringTemplateEntry> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtStringTemplateEntry

'joinToString' @ [35:117] ==> public fun <T> Array<out KtStringTemplateEntry>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtStringTemplateEntry) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtStringTemplateEntry

'it' @ [35:136] ==> value-parameter it: KtStringTemplateEntry defined in org.jetbrains.kotlin.preprocessor.parseStringValue.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [35:139] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

