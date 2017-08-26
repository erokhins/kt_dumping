'getInstance' @ [29:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'PsiPrecedences' @ [29:42] ==> public object PsiPrecedences defined in org.jetbrains.kotlin.idea.util in file PsiPrecedences.kt[FakeCallableDescriptorForObject]

'java' @ [29:64] ==> public val <T> KClass<PsiPrecedences>.java: Class<PsiPrecedences> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiPrecedences

'HashMap' @ [33:23] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> IElementType
    <V : (Any..Any?)> -> Int

'component1' @ [34:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [34:18] ==> public final operator fun component2(): KotlinExpressionParsing.Precedence defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'iterator' @ [34:29] ==> public abstract operator fun iterator(): Iterator<IndexedValue<KotlinExpressionParsing.Precedence>> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'values' @ [34:64] ==> public final fun values(): Array<KotlinExpressionParsing.Precedence> defined in org.jetbrains.kotlin.parsing.KotlinExpressionParsing.Precedence[SimpleFunctionDescriptorImpl]

'withIndex' @ [34:73] ==> public fun <T> Array<out KotlinExpressionParsing.Precedence>.withIndex(): Iterable<IndexedValue<KotlinExpressionParsing.Precedence>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Precedence

'record' @ [35:33] ==> val record: KotlinExpressionParsing.Precedence defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.<init>[LocalVariableDescriptor]

'operations' @ [35:40] ==> public final val KotlinExpressionParsing.Precedence.operations: TokenSet[MyPropertyDescriptor]

'types' @ [35:51] ==> public final val TokenSet.types: (Array<(IElementType..IElementType?)>..Array<out (IElementType..IElementType?)>)[MyPropertyDescriptor]

'builder' @ [36:17] ==> val builder: HashMap<IElementType, Int> defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.<init>[LocalVariableDescriptor]

'elementType' @ [36:25] ==> val elementType: (IElementType..IElementType?) defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.<init>[LocalVariableDescriptor]

'i' @ [36:40] ==> val i: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.<init>[LocalVariableDescriptor]

'precedence' @ [39:9] ==> private final val precedence: Map<IElementType, Int> defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'builder' @ [39:22] ==> val builder: HashMap<IElementType, Int> defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.<init>[LocalVariableDescriptor]

'-' @ [42:48] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PREFIX' @ [43:48] ==> enum entry PREFIX defined in org.jetbrains.kotlin.parsing.KotlinExpressionParsing.Precedence[FakeCallableDescriptorForObject]

'ordinal' @ [43:55] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.parsing.KotlinExpressionParsing.Precedence[DeserializedPropertyDescriptor]

'POSTFIX' @ [44:49] ==> enum entry POSTFIX defined in org.jetbrains.kotlin.parsing.KotlinExpressionParsing.Precedence[FakeCallableDescriptorForObject]

'ordinal' @ [44:57] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.parsing.KotlinExpressionParsing.Precedence[DeserializedPropertyDescriptor]

'when (expression) {
            is KtAnnotatedExpression,
            is KtLabeledExpression,
            is KtPrefixExpression -> PRECEDENCE_OF_PREFIX_EXPRESSION
            is KtPostfixExpression -> PRECEDENCE_OF_POSTFIX_EXPRESSION
            is KtOperationExpression -> {
                val operation = expression.operationReference.getReferencedNameElementType()
                val precedenceNumber = precedence[operation]
                if (precedenceNumber == null) {
                    LOG.error("No precedence for operation: " + operation)
                    precedence.size
                }
                else precedenceNumber
            }
            else -> PRECEDENCE_OF_ATOMIC_EXPRESSION
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'expression' @ [47:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[ValueParameterDescriptorImpl]

'PRECEDENCE_OF_PREFIX_EXPRESSION' @ [50:38] ==> public final val PRECEDENCE_OF_PREFIX_EXPRESSION: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'PRECEDENCE_OF_POSTFIX_EXPRESSION' @ [51:39] ==> public final val PRECEDENCE_OF_POSTFIX_EXPRESSION: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'expression' @ [53:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[ValueParameterDescriptorImpl]

'operationReference' @ [53:44] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [53:63] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'precedence' @ [54:40] ==> private final val precedence: Map<IElementType, Int> defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'operation' @ [54:51] ==> val operation: IElementType defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[LocalVariableDescriptor]

'if (precedenceNumber == null) {
                    LOG.error("No precedence for operation: " + operation)
                    precedence.size
                }
                else precedenceNumber' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'precedenceNumber' @ [55:21] ==> val precedenceNumber: Int? defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[LocalVariableDescriptor]

'LOG' @ [56:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'error' @ [56:25] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [56:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'operation' @ [56:65] ==> val operation: IElementType defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[LocalVariableDescriptor]

'precedence' @ [57:21] ==> private final val precedence: Map<IElementType, Int> defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'size' @ [57:32] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'precedenceNumber' @ [59:22] ==> val precedenceNumber: Int? defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.getPrecedence[LocalVariableDescriptor]

'PRECEDENCE_OF_ATOMIC_EXPRESSION' @ [61:21] ==> public final val PRECEDENCE_OF_ATOMIC_EXPRESSION: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[PropertyDescriptorImpl]

'subject' @ [66:16] ==> value-parameter subject: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.isTighter[ValueParameterDescriptorImpl]

'tighterThan' @ [66:26] ==> value-parameter tighterThan: Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences.isTighter[ValueParameterDescriptorImpl]

