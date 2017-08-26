'if (negated) {
                if (expression is KtBinaryExpression && expression.operationToken == KtTokens.OROR) {
                    //TODO: check Boolean type for operands
                    val left = expression.left
                    val right = expression.right
                    if (left != null && right != null) {
                        val leftCondition = create(left, negated = true)
                        val rightCondition = create(right, negated = true)
                        return CompositeCondition.create(leftCondition.toAtomicConditions() + rightCondition.toAtomicConditions())
                    }
                }
            }
            else {
                if (expression is KtBinaryExpression && expression.operationToken == KtTokens.ANDAND) {
                    //TODO: check Boolean type for operands
                    val left = expression.left
                    val right = expression.right
                    if (left != null && right != null) {
                        val leftCondition = create(left)
                        val rightCondition = create(right)
                        return CompositeCondition.create(leftCondition.toAtomicConditions() + rightCondition.toAtomicConditions())
                    }
                }
            }' @ [31:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'negated' @ [31:17] ==> value-parameter negated: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'expression' @ [32:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'expression' @ [32:57] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'operationToken' @ [32:68] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'OROR' @ [32:95] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [34:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'left' @ [34:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [35:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'right' @ [35:44] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [36:25] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'right' @ [36:41] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'create' @ [37:45] ==> public final fun create(expression: KtExpression, negated: Boolean = ...): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion[SimpleFunctionDescriptorImpl]

'left' @ [37:52] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'create' @ [38:46] ==> public final fun create(expression: KtExpression, negated: Boolean = ...): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion[SimpleFunctionDescriptorImpl]

'right' @ [38:53] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'CompositeCondition' @ [39:32] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[FakeCallableDescriptorForObject]

'create' @ [39:51] ==> public final fun create(conditions: List<AtomicCondition>): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.Companion[SimpleFunctionDescriptorImpl]

'leftCondition' @ [39:58] ==> val leftCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'toAtomicConditions' @ [39:72] ==> public abstract fun toAtomicConditions(): List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'rightCondition' @ [39:95] ==> val rightCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'toAtomicConditions' @ [39:110] ==> public abstract fun toAtomicConditions(): List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'expression' @ [44:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'expression' @ [44:57] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'operationToken' @ [44:68] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [44:95] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [46:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'left' @ [46:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [47:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'right' @ [47:44] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [48:25] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'right' @ [48:41] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'create' @ [49:45] ==> public final fun create(expression: KtExpression, negated: Boolean = ...): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion[SimpleFunctionDescriptorImpl]

'left' @ [49:52] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'create' @ [50:46] ==> public final fun create(expression: KtExpression, negated: Boolean = ...): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion[SimpleFunctionDescriptorImpl]

'right' @ [50:53] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'CompositeCondition' @ [51:32] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[FakeCallableDescriptorForObject]

'create' @ [51:51] ==> public final fun create(conditions: List<AtomicCondition>): Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.Companion[SimpleFunctionDescriptorImpl]

'leftCondition' @ [51:58] ==> val leftCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'toAtomicConditions' @ [51:72] ==> public abstract fun toAtomicConditions(): List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'rightCondition' @ [51:95] ==> val rightCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[LocalVariableDescriptor]

'toAtomicConditions' @ [51:110] ==> public abstract fun toAtomicConditions(): List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'AtomicCondition' @ [55:20] ==> public constructor AtomicCondition(expression: KtExpression, isNegated: Boolean = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[ClassConstructorDescriptorImpl]

'expression' @ [55:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'negated' @ [55:48] ==> value-parameter negated: Boolean = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition.Companion.create[ValueParameterDescriptorImpl]

'assert' @ [62:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [62:16] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'isPhysical' @ [62:27] ==> public final val KtExpression.isPhysical: Boolean[MyPropertyDescriptor]

'if (isNegated) expression.negate() else expression' @ [65:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'isNegated' @ [65:39] ==> private final val isNegated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'expression' @ [65:50] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'negate' @ [65:61] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [65:75] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'if (isNegated) expression else expression.negate()' @ [66:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'isNegated' @ [66:46] ==> private final val isNegated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'expression' @ [66:57] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'expression' @ [66:73] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'negate' @ [66:84] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [67:41] ==> public fun <T> listOf(element: AtomicCondition): List<AtomicCondition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AtomicCondition

'this' @ [67:48] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[LazyClassReceiverParameterDescriptor]

'AtomicCondition' @ [69:20] ==> public constructor AtomicCondition(expression: KtExpression, isNegated: Boolean = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[ClassConstructorDescriptorImpl]

'expression' @ [69:36] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'!' @ [69:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNegated' @ [69:49] ==> private final val isNegated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'KtPsiFactory' @ [74:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'conditions' @ [74:36] ==> public final val conditions: List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[PropertyDescriptorImpl]

'first' @ [74:47] ==> public fun <T> List<AtomicCondition>.first(): AtomicCondition defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AtomicCondition

'expression' @ [74:55] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

'factory' @ [75:16] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.asExpression[LocalVariableDescriptor]

'buildExpression' @ [75:24] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'component1' @ [76:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [76:26] ==> public final operator fun component2(): AtomicCondition defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'conditions' @ [76:40] ==> public final val conditions: List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[PropertyDescriptorImpl]

'withIndex' @ [76:51] ==> public fun <T> Iterable<AtomicCondition>.withIndex(): Iterable<IndexedValue<AtomicCondition>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AtomicCondition

'index' @ [77:21] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.asExpression.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [78:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [80:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'condition' @ [80:34] ==> val condition: AtomicCondition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.asExpression.<anonymous>[LocalVariableDescriptor]

'asExpression' @ [80:44] ==> public open fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[SimpleFunctionDescriptorImpl]

'asExpression' @ [86:16] ==> public open fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[SimpleFunctionDescriptorImpl]

'negate' @ [86:31] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'conditions' @ [89:41] ==> public final val conditions: List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[PropertyDescriptorImpl]

'conditions' @ [93:20] ==> value-parameter conditions: List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.Companion.create[ValueParameterDescriptorImpl]

'singleOrNull' @ [93:31] ==> public fun <T> List<AtomicCondition>.singleOrNull(): AtomicCondition? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AtomicCondition

'CompositeCondition' @ [93:49] ==> private constructor CompositeCondition(conditions: List<AtomicCondition>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition[ClassConstructorDescriptorImpl]

'conditions' @ [93:68] ==> value-parameter conditions: List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.CompositeCondition.Companion.create[ValueParameterDescriptorImpl]

'toAtomicConditions' @ [99:12] ==> public abstract fun toAtomicConditions(): List<AtomicCondition> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'any' @ [99:33] ==> public inline fun <T> Iterable<AtomicCondition>.any(predicate: (AtomicCondition) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AtomicCondition

'variable' @ [99:39] ==> value-parameter variable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.hasUsagesOf[ValueParameterDescriptorImpl]

'hasUsages' @ [99:48] ==> public fun KtCallableDeclaration.hasUsages(inElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [99:58] ==> value-parameter it: AtomicCondition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.hasUsagesOf.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [99:61] ==> public final val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AtomicCondition[PropertyDescriptorImpl]

