'AssignToVariableResultTransformation' @ [31:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [31:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [31:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.<init>[ValueParameterDescriptorImpl]

'previousTransformation' @ [34:13] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'previousTransformation' @ [35:13] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'indexVariable' @ [35:36] ==> public abstract val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'if (filter == null)
            previousTransformation.effectiveCondition.asExpression()
        else
            KtPsiFactory(filter).createExpressionByPattern("$0 && $1", previousTransformation.effectiveCondition.asExpression(), filter)' @ [36:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'filter' @ [36:29] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [37:13] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'effectiveCondition' @ [37:36] ==> public abstract val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'asExpression' @ [37:55] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [39:13] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'filter' @ [39:26] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'createExpressionByPattern' @ [39:34] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'previousTransformation' @ [39:72] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'effectiveCondition' @ [39:95] ==> public abstract val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'asExpression' @ [39:114] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'filter' @ [39:130] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'CountTransformation' @ [40:16] ==> public constructor CountTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, initialization: VariableInitialization, filter: KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[ClassConstructorDescriptorImpl]

'loop' @ [40:36] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [40:42] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'inputVariable' @ [40:65] ==> public abstract val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'initialization' @ [40:80] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'newFilter' @ [40:96] ==> val newFilter: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.mergeWithPrevious[LocalVariableDescriptor]

'+' @ [44:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (filter != null) "{}" else "()"' @ [44:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'filter' @ [44:32] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'if (filter != null) {
            val lambda = generateLambda(inputVariable, filter)
            chainedCallGenerator.generate("count $0:'{}'", lambda)
        }
        else {
            chainedCallGenerator.generate("count()")
        }' @ [47:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'filter' @ [47:24] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'generateLambda' @ [48:26] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [48:41] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'filter' @ [48:56] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [49:13] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [49:34] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'lambda' @ [49:60] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[LocalVariableDescriptor]

'chainedCallGenerator' @ [52:13] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [52:34] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'if (initialization.initializer.isZeroConstant()) {
            call
        }
        else {
            KtPsiFactory(call).createExpressionByPattern("$0 + $1", initialization.initializer, call)
        }' @ [55:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'initialization' @ [55:20] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'initializer' @ [55:35] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'isZeroConstant' @ [55:47] ==> public fun KtExpression.isZeroConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'call' @ [56:13] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[LocalVariableDescriptor]

'KtPsiFactory' @ [59:13] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'call' @ [59:26] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[LocalVariableDescriptor]

'createExpressionByPattern' @ [59:32] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'initialization' @ [59:69] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[PropertyDescriptorImpl]

'initializer' @ [59:84] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'call' @ [59:97] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.generateCode[LocalVariableDescriptor]

'state' @ [79:27] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [79:33] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [79:44] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'isPlusPlusOf' @ [79:60] ==> public fun KtExpression.isPlusPlusOf(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'operand' @ [80:34] ==> val operand: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

'findVariableInitializationBeforeLoop' @ [80:42] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [80:79] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [80:85] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initialization' @ [82:17] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

'variable' @ [82:32] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'countUsages' @ [82:41] ==> public fun KtCallableDeclaration.countUsages(inElement: KtElement): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [82:53] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [82:59] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'?:' @ [84:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'initialization' @ [84:33] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

'variable' @ [84:48] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'resolveToDescriptorIfAny' @ [84:57] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'type' @ [84:109] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [85:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInt' @ [85:33] ==> public open fun isInt(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'variableType' @ [85:39] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

'CountTransformation' @ [87:34] ==> public constructor CountTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, initialization: VariableInitialization, filter: KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[ClassConstructorDescriptorImpl]

'state' @ [87:54] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [87:60] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [87:71] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [87:77] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initialization' @ [87:92] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

'Result' @ [88:40] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [88:47] ==> val transformation: CountTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation.Matcher.match[LocalVariableDescriptor]

