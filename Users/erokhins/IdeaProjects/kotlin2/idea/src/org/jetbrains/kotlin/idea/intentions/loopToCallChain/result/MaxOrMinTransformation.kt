'AssignToVariableResultTransformation' @ [29:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [29:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [29:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.<init>[ValueParameterDescriptorImpl]

'if (isMax) "max()" else "min()"' @ [32:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isMax' @ [32:21] ==> private final val isMax: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [35:20] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [35:41] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'presentation' @ [35:50] ==> public open val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[PropertyDescriptorImpl]

'KtPsiFactory' @ [36:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'call' @ [36:29] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.generateCode[LocalVariableDescriptor]

'createExpressionByPattern' @ [36:35] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'call' @ [36:75] ==> val call: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.generateCode[LocalVariableDescriptor]

'initialization' @ [36:81] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[PropertyDescriptorImpl]

'initializer' @ [36:96] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'matchIfAssign' @ [74:20] ==> private final fun matchIfAssign(state: MatchingState): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'state' @ [74:34] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'matchAssignIf' @ [75:23] ==> private final fun matchAssignIf(state: MatchingState): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'state' @ [75:37] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'matchMathMaxOrMin' @ [76:23] ==> private final fun matchMathMaxOrMin(state: MatchingState): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'state' @ [76:41] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'state' @ [80:32] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[ValueParameterDescriptorImpl]

'statements' @ [80:38] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [80:49] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'ifExpression' @ [81:17] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'`else`' @ [81:30] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [83:24] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'then' @ [83:37] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'then' @ [84:29] ==> val then: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'blockExpressionsOrSingle' @ [84:34] ==> public fun KtElement.blockExpressionsOrSingle(): Sequence<KtElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [84:61] ==> public fun <T> Sequence<KtElement>.singleOrNull(): KtElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'statement' @ [85:17] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'operationToken' @ [85:27] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [85:54] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'match' @ [87:20] ==> private final fun match(condition: KtExpression?, assignmentTarget: KtExpression?, valueAssignedIfTrue: KtExpression?, valueAssignedIfFalse: KtExpression?, inputVariable: KtCallableDeclaration, loop: KtForExpression): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'ifExpression' @ [87:26] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'condition' @ [87:39] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'statement' @ [87:50] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'left' @ [87:60] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'statement' @ [87:66] ==> val statement: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[LocalVariableDescriptor]

'right' @ [87:76] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'state' @ [87:89] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[ValueParameterDescriptorImpl]

'inputVariable' @ [87:95] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [87:110] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchIfAssign[ValueParameterDescriptorImpl]

'outerLoop' @ [87:116] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [91:30] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[ValueParameterDescriptorImpl]

'statements' @ [91:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [91:47] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'assignment' @ [92:17] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'operationToken' @ [92:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [92:55] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'assignment' @ [94:32] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'right' @ [94:43] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'match' @ [96:20] ==> private final fun match(condition: KtExpression?, assignmentTarget: KtExpression?, valueAssignedIfTrue: KtExpression?, valueAssignedIfFalse: KtExpression?, inputVariable: KtCallableDeclaration, loop: KtForExpression): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'ifExpression' @ [96:26] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'condition' @ [96:39] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'assignment' @ [96:50] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'left' @ [96:61] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [96:67] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'then' @ [96:80] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [96:86] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[LocalVariableDescriptor]

'`else`' @ [96:99] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'state' @ [96:107] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[ValueParameterDescriptorImpl]

'inputVariable' @ [96:113] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [96:128] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchAssignIf[ValueParameterDescriptorImpl]

'outerLoop' @ [96:134] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [100:30] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'statements' @ [100:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [100:47] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'assignment' @ [101:17] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'operationToken' @ [101:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [101:55] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'assignment' @ [103:42] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'left' @ [103:53] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'findVariableInitializationBeforeLoop' @ [103:58] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [103:95] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'outerLoop' @ [103:101] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'matchMathMaxOrMin' @ [106:20] ==> private final fun matchMathMaxOrMin(variableInitialization: VariableInitialization, assignment: KtBinaryExpression, state: MatchingState, isMax: Boolean): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [106:38] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'assignment' @ [106:62] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'state' @ [106:74] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'matchMathMaxOrMin' @ [107:23] ==> private final fun matchMathMaxOrMin(variableInitialization: VariableInitialization, assignment: KtBinaryExpression, state: MatchingState, isMax: Boolean): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [107:41] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'assignment' @ [107:65] ==> val assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'state' @ [107:77] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'if (isMax) "max" else "min"' @ [116:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isMax' @ [116:36] ==> value-parameter isMax: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'assignment' @ [117:29] ==> value-parameter assignment: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'right' @ [117:40] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'extractStaticFunctionCallArguments' @ [117:46] ==> public fun KtExpression?.extractStaticFunctionCallArguments(functionFqName: String): List<KtExpression?>? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'+' @ [117:81] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionName' @ [117:101] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'arguments' @ [118:17] ==> val arguments: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'size' @ [118:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when {
                arguments[0].isVariableReference(variableInitialization.variable) -> arguments[1] ?: return null
                arguments[1].isVariableReference(variableInitialization.variable) -> arguments[0] ?: return null
                else -> return null
            }' @ [119:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression, entry1: KtExpression, entry2: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression

'arguments' @ [120:17] ==> val arguments: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'isVariableReference' @ [120:30] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [120:50] ==> value-parameter variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'variable' @ [120:73] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'arguments' @ [120:86] ==> val arguments: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'arguments' @ [121:17] ==> val arguments: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'isVariableReference' @ [121:30] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [121:50] ==> value-parameter variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'variable' @ [121:73] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'arguments' @ [121:86] ==> val arguments: List<KtExpression?> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'if (value.isVariableReference(state.inputVariable))
                null
            else
                MapTransformation(state.outerLoop, state.inputVariable, state.indexVariable, value, mapNotNull = false)' @ [125:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MapTransformation?, elseBranch: MapTransformation?): MapTransformation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MapTransformation?

'value' @ [125:41] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'isVariableReference' @ [125:47] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [125:67] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'inputVariable' @ [125:73] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'MapTransformation' @ [128:17] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [128:35] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'outerLoop' @ [128:41] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [128:52] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'inputVariable' @ [128:58] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [128:73] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'indexVariable' @ [128:79] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'value' @ [128:94] ==> val value: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'MaxOrMinTransformation' @ [130:34] ==> public constructor MaxOrMinTransformation(loop: KtForExpression, initialization: VariableInitialization, isMax: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[ClassConstructorDescriptorImpl]

'state' @ [130:57] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'outerLoop' @ [130:63] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [130:74] ==> value-parameter variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'isMax' @ [130:98] ==> value-parameter isMax: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[ValueParameterDescriptorImpl]

'Result' @ [131:40] ==> public constructor Result(resultTransformation: ResultTransformation, sequenceTransformations: List<SequenceTransformation>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [131:47] ==> val transformation: MaxOrMinTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'listOfNotNull' @ [131:63] ==> public fun <T : Any> listOfNotNull(element: MapTransformation?): List<MapTransformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MapTransformation

'mapTransformation' @ [131:77] ==> val mapTransformation: MapTransformation? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.matchMathMaxOrMin[LocalVariableDescriptor]

'condition' @ [142:17] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'condition' @ [143:30] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'operationToken' @ [143:40] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'comparison' @ [144:17] ==> val comparison: IElementType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'setOf' @ [144:32] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'GT' @ [144:47] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [144:60] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [144:73] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [144:88] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'condition' @ [145:24] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'left' @ [145:34] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'condition' @ [146:25] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'right' @ [146:35] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'when {
                left.isVariableReference(inputVariable) -> right
                right.isVariableReference(inputVariable) -> left
                else -> return null
            }' @ [147:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtNameReferenceExpression, entry1: KtNameReferenceExpression, entry2: KtNameReferenceExpression): KtNameReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtNameReferenceExpression

'left' @ [148:17] ==> val left: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [148:22] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [148:42] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'right' @ [148:60] ==> val right: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'right' @ [149:17] ==> val right: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [149:23] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [149:43] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'left' @ [149:61] ==> val left: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'otherHand' @ [153:42] ==> val otherHand: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'findVariableInitializationBeforeLoop' @ [153:52] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [153:89] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'!' @ [156:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'assignmentTarget' @ [156:18] ==> value-parameter assignmentTarget: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'isVariableReference' @ [156:35] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [156:55] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'variable' @ [156:78] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'when {
                valueAssignedIfTrue.isVariableReference(inputVariable) -> valueAssignedIfFalse
                valueAssignedIfFalse.isVariableReference(inputVariable) -> valueAssignedIfTrue
                else -> return null
            }' @ [158:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'valueAssignedIfTrue' @ [159:17] ==> value-parameter valueAssignedIfTrue: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'isVariableReference' @ [159:37] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [159:57] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'valueAssignedIfFalse' @ [159:75] ==> value-parameter valueAssignedIfFalse: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'valueAssignedIfFalse' @ [160:17] ==> value-parameter valueAssignedIfFalse: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'isVariableReference' @ [160:38] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [160:58] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'valueAssignedIfTrue' @ [160:76] ==> value-parameter valueAssignedIfTrue: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'valueToBeVariable' @ [163:17] ==> val valueToBeVariable: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'!' @ [163:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueToBeVariable' @ [163:47] ==> val valueToBeVariable: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [163:65] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variableInitialization' @ [163:85] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'variable' @ [163:108] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'xor' @ [165:25] ==> public final infix fun xor(other: Boolean): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'comparison' @ [165:26] ==> val comparison: IElementType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'GT' @ [165:49] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'comparison' @ [165:55] ==> val comparison: IElementType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'GTEQ' @ [165:78] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'otherHand' @ [165:89] ==> val otherHand: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'left' @ [165:102] ==> val left: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'MaxOrMinTransformation' @ [166:34] ==> public constructor MaxOrMinTransformation(loop: KtForExpression, initialization: VariableInitialization, isMax: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[ClassConstructorDescriptorImpl]

'loop' @ [166:57] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[ValueParameterDescriptorImpl]

'variableInitialization' @ [166:63] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'isMax' @ [166:87] ==> val isMax: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

'Result' @ [167:40] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [167:47] ==> val transformation: MaxOrMinTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation.Matcher.match[LocalVariableDescriptor]

