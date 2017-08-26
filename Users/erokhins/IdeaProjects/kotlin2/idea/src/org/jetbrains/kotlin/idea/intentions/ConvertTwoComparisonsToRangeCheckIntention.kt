'IntentionBasedInspection<KtBinaryExpression>' @ [35:53] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtBinaryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'ConvertTwoComparisonsToRangeCheckIntention' @ [36:9] ==> public constructor ConvertTwoComparisonsToRangeCheckIntention() defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[ClassConstructorDescriptorImpl]

'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [39:52] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [40:9] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [40:35] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'generateRangeExpressionData' @ [46:64] ==> private final fun generateRangeExpressionData(condition: KtBinaryExpression): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'element' @ [46:92] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isApplicableTo[ValueParameterDescriptorImpl]

'generateRangeExpressionData' @ [49:25] ==> private final fun generateRangeExpressionData(condition: KtBinaryExpression): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'element' @ [49:53] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [50:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [50:36] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [51:9] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [51:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'factory' @ [51:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [51:33] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'rangeData' @ [51:75] ==> val rangeData: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'value' @ [51:85] ==> public final val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData[PropertyDescriptorImpl]

'factory' @ [52:59] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'createExpression' @ [52:67] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'rangeData' @ [52:84] ==> val rangeData: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'min' @ [52:94] ==> public final val min: String defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData[PropertyDescriptorImpl]

'factory' @ [53:59] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'createExpression' @ [53:67] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'rangeData' @ [53:84] ==> val rangeData: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.applyTo[LocalVariableDescriptor]

'max' @ [53:94] ==> public final val max: String defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData[PropertyDescriptorImpl]

'condition' @ [57:13] ==> value-parameter condition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'operationToken' @ [57:23] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [57:50] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'condition' @ [58:30] ==> value-parameter condition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'left' @ [58:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'condition' @ [59:31] ==> value-parameter condition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'right' @ [59:41] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'firstCondition' @ [60:28] ==> val firstCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'operationToken' @ [60:43] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'secondCondition' @ [61:29] ==> val secondCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'operationToken' @ [61:45] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'firstCondition' @ [62:25] ==> val firstCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'left' @ [62:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'firstCondition' @ [63:26] ==> val firstCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'right' @ [63:41] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'secondCondition' @ [64:26] ==> val secondCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'left' @ [64:42] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'secondCondition' @ [65:27] ==> val secondCondition: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'right' @ [65:43] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'this' @ [67:49] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.isStrictComparison[ReceiverParameterDescriptorImpl]

'GT' @ [67:66] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [67:72] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.isStrictComparison[ReceiverParameterDescriptorImpl]

'LT' @ [67:89] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'firstOpToken' @ [69:27] ==> val firstOpToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isStrictComparison' @ [69:40] ==> local final fun IElementType.isStrictComparison(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'secondOpToken' @ [70:28] ==> val secondOpToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isStrictComparison' @ [70:42] ==> local final fun IElementType.isStrictComparison(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'when (this) {
            KtTokens.GTEQ, KtTokens.GT -> right to left
            KtTokens.LTEQ, KtTokens.LT -> left to right
            else -> null
        }' @ [72:124] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KtExpression, KtExpression>?, entry1: Pair<KtExpression, KtExpression>?, entry2: Pair<KtExpression, KtExpression>?): Pair<KtExpression, KtExpression>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KtExpression, KtExpression>?

'this' @ [72:130] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.orderLessAndGreater[ReceiverParameterDescriptorImpl]

'GTEQ' @ [73:22] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [73:37] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'right' @ [73:43] ==> value-parameter right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.orderLessAndGreater[ValueParameterDescriptorImpl]

'left' @ [73:52] ==> value-parameter left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.orderLessAndGreater[ValueParameterDescriptorImpl]

'LTEQ' @ [74:22] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [74:37] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'left' @ [74:43] ==> value-parameter left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.orderLessAndGreater[ValueParameterDescriptorImpl]

'right' @ [74:51] ==> value-parameter right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.orderLessAndGreater[ValueParameterDescriptorImpl]

'component1' @ [78:14] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [78:25] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'firstOpToken' @ [78:41] ==> val firstOpToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'orderLessAndGreater' @ [78:54] ==> local final fun IElementType.orderLessAndGreater(left: KtExpression, right: KtExpression): Pair<KtExpression, KtExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'firstLeft' @ [78:74] ==> val firstLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'firstRight' @ [78:85] ==> val firstRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'component1' @ [79:14] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [79:26] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'secondOpToken' @ [79:43] ==> val secondOpToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'orderLessAndGreater' @ [79:57] ==> local final fun IElementType.orderLessAndGreater(left: KtExpression, right: KtExpression): Pair<KtExpression, KtExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'secondLeft' @ [79:77] ==> val secondLeft: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'secondRight' @ [79:89] ==> val secondRight: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'generateRangeExpressionData' @ [81:16] ==> private final fun generateRangeExpressionData(firstLess: KtExpression, firstGreater: KtExpression, firstStrict: Boolean, secondLess: KtExpression, secondGreater: KtExpression, secondStrict: Boolean): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'firstLess' @ [81:44] ==> val firstLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'firstGreater' @ [81:55] ==> val firstGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'firstStrict' @ [81:69] ==> val firstStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'secondLess' @ [81:82] ==> val secondLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'secondGreater' @ [81:94] ==> val secondGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'secondStrict' @ [81:109] ==> val secondStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'this' @ [84:43] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isSimple[ReceiverParameterDescriptorImpl]

'this' @ [84:75] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isSimple[ReceiverParameterDescriptorImpl]

'when {
        firstGreater !is KtConstantExpression && firstGreater.evaluatesTo(secondLess) ->
            generateRangeExpressionData(firstGreater,
                                        min = firstLess,
                                        max = secondGreater,
                                        incrementMinByOne = firstStrict,
                                        decrementMaxByOne = secondStrict)
        firstLess !is KtConstantExpression && firstLess.evaluatesTo(secondGreater) ->
            generateRangeExpressionData(firstLess,
                                        min = secondLess,
                                        max = firstGreater,
                                        incrementMinByOne = secondStrict,
                                        decrementMaxByOne = firstStrict)
        else ->
            null
    }' @ [89:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData?, entry1: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData?, entry2: ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData?): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RangeExpressionData?

'firstGreater' @ [90:9] ==> value-parameter firstGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstGreater' @ [90:50] ==> value-parameter firstGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'evaluatesTo' @ [90:63] ==> public fun KtExpression.evaluatesTo(other: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'secondLess' @ [90:75] ==> value-parameter secondLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'generateRangeExpressionData' @ [91:13] ==> private final fun generateRangeExpressionData(value: KtExpression, min: KtExpression, max: KtExpression, incrementMinByOne: Boolean, decrementMaxByOne: Boolean): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'firstGreater' @ [91:41] ==> value-parameter firstGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstLess' @ [92:47] ==> value-parameter firstLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'secondGreater' @ [93:47] ==> value-parameter secondGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstStrict' @ [94:61] ==> value-parameter firstStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'secondStrict' @ [95:61] ==> value-parameter secondStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstLess' @ [96:9] ==> value-parameter firstLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstLess' @ [96:47] ==> value-parameter firstLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'evaluatesTo' @ [96:57] ==> public fun KtExpression.evaluatesTo(other: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'secondGreater' @ [96:69] ==> value-parameter secondGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'generateRangeExpressionData' @ [97:13] ==> private final fun generateRangeExpressionData(value: KtExpression, min: KtExpression, max: KtExpression, incrementMinByOne: Boolean, decrementMaxByOne: Boolean): ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'firstLess' @ [97:41] ==> value-parameter firstLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'secondLess' @ [98:47] ==> value-parameter secondLess: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstGreater' @ [99:47] ==> value-parameter firstGreater: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'secondStrict' @ [100:61] ==> value-parameter secondStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'firstStrict' @ [101:61] ==> value-parameter firstStrict: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'getType' @ [110:24] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [110:32] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'!' @ [111:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [111:18] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'isValidTypeForIncrementDecrementByOne' @ [111:23] ==> private final fun KotlinType?.isValidTypeForIncrementDecrementByOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'when (this) {
                is KtConstantExpression -> {
                    val constantValue = ConstantExpressionEvaluator.getConstant(this, context)?.getValue(type) ?: return null
                    return when {
                        KotlinBuiltIns.isInt(type) -> (constantValue as Int + number).toString()
                        KotlinBuiltIns.isLong(type) -> (constantValue as Long + number).toString()
                        KotlinBuiltIns.isChar(type) -> "'${constantValue as Char + number}'"
                        else -> return null
                    }
                }
                else -> return if (number >= 0) "($text + $number)" else "($text - ${-number})"
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'this' @ [113:19] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ReceiverParameterDescriptorImpl]

'?:' @ [115:41] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Any

'getConstant' @ [115:69] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [115:81] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ReceiverParameterDescriptorImpl]

'context' @ [115:87] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'getValue' @ [115:97] ==> public open fun getValue(expectedType: KotlinType): Any? defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'type' @ [115:106] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'when {
                        KotlinBuiltIns.isInt(type) -> (constantValue as Int + number).toString()
                        KotlinBuiltIns.isLong(type) -> (constantValue as Long + number).toString()
                        KotlinBuiltIns.isChar(type) -> "'${constantValue as Char + number}'"
                        else -> return null
                    }' @ [116:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'isInt' @ [117:40] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [117:46] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'constantValue' @ [117:56] ==> val constantValue: Any defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'number' @ [117:79] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'toString' @ [117:87] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'isLong' @ [118:40] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [118:47] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'constantValue' @ [118:57] ==> val constantValue: Any defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'number' @ [118:81] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'toString' @ [118:89] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'isChar' @ [119:40] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [119:47] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'constantValue' @ [119:60] ==> val constantValue: Any defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[LocalVariableDescriptor]

'number' @ [119:84] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'if (number >= 0) "($text + $number)" else "($text - ${-number})"' @ [123:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'number' @ [123:36] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'text' @ [123:52] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'number' @ [123:60] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'text' @ [123:77] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'-' @ [123:86] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'number' @ [123:87] ==> value-parameter number: Int defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData.getChangeBy[ValueParameterDescriptorImpl]

'!' @ [128:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'min' @ [128:14] ==> value-parameter min: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'isSimple' @ [128:18] ==> private final fun KtExpression.isSimple(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'!' @ [128:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'max' @ [128:33] ==> value-parameter max: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'isSimple' @ [128:37] ==> private final fun KtExpression.isSimple(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'value' @ [130:23] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'analyze' @ [130:29] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'value' @ [131:23] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'getType' @ [131:29] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [131:37] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'min' @ [132:23] ==> value-parameter min: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'getType' @ [132:27] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [132:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'max' @ [133:23] ==> value-parameter max: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'getType' @ [133:27] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [133:35] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'valType' @ [135:13] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'minType' @ [135:32] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'maxType' @ [135:51] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'!' @ [137:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valType' @ [137:14] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isComparable' @ [137:22] ==> private final fun KotlinType.isComparable(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'min' @ [139:22] ==> value-parameter min: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'max' @ [140:22] ==> value-parameter max: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'minType' @ [142:13] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'valType' @ [142:24] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'maxType' @ [142:35] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'valType' @ [142:46] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'if (valType.isPrimitiveNumberType() && minType.isPrimitiveNumberType() && maxType.isPrimitiveNumberType()) {
                //char is comparable to chars only
                if (KotlinBuiltIns.isChar(valType) || KotlinBuiltIns.isChar(minType) || KotlinBuiltIns.isChar(maxType)) return null

                if (valType.isFloatingPoint()) {
                    if (minType.isInteger())
                        minVal = KtPsiFactory(minVal).createExpression(getDoubleConstant(min, minType, context) ?: return null)
                    if (maxType.isInteger())
                        maxVal = KtPsiFactory(maxVal).createExpression(getDoubleConstant(max, maxType, context) ?: return null)
                }
            } else {
                return null
            }' @ [144:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'valType' @ [144:17] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [144:25] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'minType' @ [144:52] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [144:60] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'maxType' @ [144:87] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isPrimitiveNumberType' @ [144:95] ==> public fun KotlinType.isPrimitiveNumberType(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'isChar' @ [146:36] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'valType' @ [146:43] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isChar' @ [146:70] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'minType' @ [146:77] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isChar' @ [146:104] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'maxType' @ [146:111] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'valType' @ [148:21] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isFloatingPoint' @ [148:29] ==> private final fun KotlinType.isFloatingPoint(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'minType' @ [149:25] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isInteger' @ [149:33] ==> private final fun KotlinType.isInteger(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'minVal' @ [150:25] ==> var minVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'KtPsiFactory' @ [150:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'minVal' @ [150:47] ==> var minVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'createExpression' @ [150:55] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getDoubleConstant' @ [150:72] ==> private final fun getDoubleConstant(intExpr: KtExpression, type: KotlinType, context: BindingContext): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'min' @ [150:90] ==> value-parameter min: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'minType' @ [150:95] ==> val minType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'context' @ [150:104] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'maxType' @ [151:25] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isInteger' @ [151:33] ==> private final fun KotlinType.isInteger(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'maxVal' @ [152:25] ==> var maxVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'KtPsiFactory' @ [152:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'maxVal' @ [152:47] ==> var maxVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'createExpression' @ [152:55] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'getDoubleConstant' @ [152:72] ==> private final fun getDoubleConstant(intExpr: KtExpression, type: KotlinType, context: BindingContext): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'max' @ [152:90] ==> value-parameter max: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'maxType' @ [152:95] ==> val maxType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'context' @ [152:104] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'incrementMinByOne' @ [159:13] ==> value-parameter incrementMinByOne: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'decrementMaxByOne' @ [159:34] ==> value-parameter decrementMaxByOne: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'!' @ [160:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valType' @ [160:18] ==> val valType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'isValidTypeForIncrementDecrementByOne' @ [160:26] ==> private final fun KotlinType?.isValidTypeForIncrementDecrementByOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'if (incrementMinByOne) minVal.getChangeBy(context, 1) else minVal.text' @ [163:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'incrementMinByOne' @ [163:27] ==> value-parameter incrementMinByOne: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'minVal' @ [163:46] ==> var minVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'getChangeBy' @ [163:53] ==> local final fun KtExpression.getChangeBy(context: BindingContext, number: Int): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'context' @ [163:65] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'minVal' @ [163:82] ==> var minVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'text' @ [163:89] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (decrementMaxByOne) maxVal.getChangeBy(context, -1) else maxVal.text' @ [164:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'decrementMaxByOne' @ [164:27] ==> value-parameter decrementMaxByOne: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'maxVal' @ [164:46] ==> var maxVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'getChangeBy' @ [164:53] ==> local final fun KtExpression.getChangeBy(context: BindingContext, number: Int): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[SimpleFunctionDescriptorImpl]

'context' @ [164:65] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'-' @ [164:74] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maxVal' @ [164:83] ==> var maxVal: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'text' @ [164:90] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'RangeExpressionData' @ [165:16] ==> public constructor RangeExpressionData(value: KtExpression, min: String, max: String) defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.RangeExpressionData[ClassConstructorDescriptorImpl]

'value' @ [165:36] ==> value-parameter value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[ValueParameterDescriptorImpl]

'minText' @ [165:43] ==> val minText: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'maxText' @ [165:67] ==> val maxText: String? defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.generateRangeExpressionData[LocalVariableDescriptor]

'?:' @ [169:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Any?, right: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Any

'getConstant' @ [169:52] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[DeserializedSimpleFunctionDescriptor]

'intExpr' @ [169:64] ==> value-parameter intExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.getDoubleConstant[ValueParameterDescriptorImpl]

'context' @ [169:73] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.getDoubleConstant[ValueParameterDescriptorImpl]

'getValue' @ [169:83] ==> public open fun getValue(expectedType: KotlinType): Any? defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'type' @ [169:92] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.getDoubleConstant[ValueParameterDescriptorImpl]

'intConst' @ [170:17] ==> val intConst: Any defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.getDoubleConstant[LocalVariableDescriptor]

'toDouble' @ [170:39] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'toString' @ [170:51] ==> public open fun toString(): String defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'isSubtypeOfClass' @ [173:61] ==> public open fun isSubtypeOfClass(@NotNull p0: KotlinType, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [173:78] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isComparable[ReceiverParameterDescriptorImpl]

'this' @ [173:84] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isComparable[ReceiverParameterDescriptorImpl]

'builtIns' @ [173:89] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'getComparable' @ [173:98] ==> @NotNull public open fun getComparable(): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'isFloat' @ [176:31] ==> public open fun isFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [176:39] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isFloatingPoint[ReceiverParameterDescriptorImpl]

'isDouble' @ [176:63] ==> public open fun isDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [176:72] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isFloatingPoint[ReceiverParameterDescriptorImpl]

'isInt' @ [180:31] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [180:37] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isInteger[ReceiverParameterDescriptorImpl]

'isLong' @ [181:31] ==> public open fun isLong(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [181:38] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isInteger[ReceiverParameterDescriptorImpl]

'isShort' @ [182:31] ==> public open fun isShort(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [182:39] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isInteger[ReceiverParameterDescriptorImpl]

'isByte' @ [183:31] ==> public open fun isByte(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [183:38] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isInteger[ReceiverParameterDescriptorImpl]

'this' @ [187:9] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isValidTypeForIncrementDecrementByOne[ReceiverParameterDescriptorImpl]

'this' @ [188:16] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isValidTypeForIncrementDecrementByOne[ReceiverParameterDescriptorImpl]

'isInteger' @ [188:21] ==> private final fun KotlinType.isInteger(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention[SimpleFunctionDescriptorImpl]

'isChar' @ [188:50] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [188:57] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.ConvertTwoComparisonsToRangeCheckIntention.isValidTypeForIncrementDecrementByOne[ReceiverParameterDescriptorImpl]

