'matchWithFilterBefore' @ [61:16] ==> public final fun matchWithFilterBefore(state: MatchingState, filterTransformation: FilterTransformationBase?): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'state' @ [61:38] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.match[ValueParameterDescriptorImpl]

'matchReturn' @ [65:9] ==> private final fun matchReturn(state: MatchingState, filterTransformation: FilterTransformationBase?): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'state' @ [65:21] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'filterTransformation' @ [65:28] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'let' @ [65:51] ==> @InlineOnly public inline fun <T, R> TransformationMatch.Result.let(block: (TransformationMatch.Result) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result
    <R> -> Nothing

'it' @ [65:64] ==> value-parameter it: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore.<anonymous>[ValueParameterDescriptorImpl]

'when (state.statements.size) {
            1 -> { }

            2 -> {
                val breakExpression = state.statements.last() as? KtBreakExpression ?: return null
                if (breakExpression.targetLoop() != state.outerLoop) return null
            }

            else -> return null
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [67:15] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'statements' @ [67:21] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'size' @ [67:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'state' @ [71:39] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'statements' @ [71:45] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'last' @ [71:56] ==> public fun <T> List<KtExpression>.last(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'breakExpression' @ [72:21] ==> val breakExpression: KtBreakExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'targetLoop' @ [72:37] ==> public fun KtExpressionWithLabel.targetLoop(): KtLoopExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [72:53] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'outerLoop' @ [72:59] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [77:25] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'statements' @ [77:31] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'size' @ [77:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'state' @ [79:32] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'statements' @ [79:38] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'first' @ [79:49] ==> public fun <T> List<KtExpression>.first(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'binaryExpression' @ [80:13] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'operationToken' @ [80:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [80:57] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'binaryExpression' @ [81:20] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'left' @ [81:37] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'binaryExpression' @ [82:21] ==> val binaryExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'right' @ [82:38] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [84:30] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'findVariableInitializationBeforeLoop' @ [84:35] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [84:72] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'outerLoop' @ [84:78] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initialization' @ [86:13] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'variable' @ [86:28] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'countUsages' @ [86:37] ==> public fun KtCallableDeclaration.countUsages(inElement: KtElement): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [86:49] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'outerLoop' @ [86:55] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'!' @ [89:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initialization' @ [89:14] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'initializer' @ [89:29] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'isConstant' @ [89:41] ==> public fun KtExpression.isConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'buildFindOperationGenerator' @ [91:25] ==> private final fun buildFindOperationGenerator(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, filterTransformation: FilterTransformationBase?, valueIfFound: KtExpression, valueIfNotFound: KtExpression, findFirst: Boolean): FindTransformationMatcher.FindOperationGenerator? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'state' @ [91:53] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'outerLoop' @ [91:59] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [91:70] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'inputVariable' @ [91:76] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [91:91] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'indexVariable' @ [91:97] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'filterTransformation' @ [91:112] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'right' @ [92:68] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'initialization' @ [93:71] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'initializer' @ [93:86] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'findFirst' @ [94:65] ==> val findFirst: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'FindAndAssignTransformation' @ [97:30] ==> public constructor FindAndAssignTransformation(loop: KtForExpression, generator: FindTransformationMatcher.FindOperationGenerator, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation[ClassConstructorDescriptorImpl]

'state' @ [97:58] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[ValueParameterDescriptorImpl]

'outerLoop' @ [97:64] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'generator' @ [97:75] ==> val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'initialization' @ [97:86] ==> val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'Result' @ [98:36] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [98:43] ==> val transformation: FindTransformationMatcher.FindAndAssignTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchWithFilterBefore[LocalVariableDescriptor]

'state' @ [102:28] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'statements' @ [102:34] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [102:45] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'state' @ [103:31] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'outerLoop' @ [103:37] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'nextStatement' @ [103:47] ==> public fun KtExpression.nextStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'returnInLoop' @ [104:13] ==> val returnInLoop: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'getLabelName' @ [104:26] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'returnAfterLoop' @ [104:44] ==> val returnAfterLoop: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'getLabelName' @ [104:60] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'returnInLoop' @ [106:33] ==> val returnInLoop: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'returnedExpression' @ [106:46] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'returnAfterLoop' @ [107:36] ==> val returnAfterLoop: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'returnedExpression' @ [107:52] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'buildFindOperationGenerator' @ [109:25] ==> private final fun buildFindOperationGenerator(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, filterTransformation: FilterTransformationBase?, valueIfFound: KtExpression, valueIfNotFound: KtExpression, findFirst: Boolean): FindTransformationMatcher.FindOperationGenerator? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'state' @ [109:53] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'outerLoop' @ [109:59] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [109:70] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'inputVariable' @ [109:76] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [109:91] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'indexVariable' @ [109:97] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'filterTransformation' @ [110:53] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'returnValueInLoop' @ [111:68] ==> val returnValueInLoop: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'returnValueAfterLoop' @ [112:71] ==> val returnValueAfterLoop: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'FindAndReturnTransformation' @ [116:30] ==> public constructor FindAndReturnTransformation(loop: KtForExpression, generator: FindTransformationMatcher.FindOperationGenerator, endReturn: KtReturnExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[ClassConstructorDescriptorImpl]

'state' @ [116:58] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[ValueParameterDescriptorImpl]

'outerLoop' @ [116:64] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'generator' @ [116:75] ==> val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'returnAfterLoop' @ [116:86] ==> val returnAfterLoop: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'Result' @ [117:36] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [117:43] ==> val transformation: FindTransformationMatcher.FindAndReturnTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.matchReturn[LocalVariableDescriptor]

'PsiChildRange' @ [126:43] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'loop' @ [126:57] ==> public open val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'unwrapIfLabeled' @ [126:62] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'endReturn' @ [126:81] ==> private final val endReturn: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'generator' @ [129:21] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'presentation' @ [129:31] ==> public final val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'generator' @ [132:21] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'chainCallCount' @ [132:31] ==> public final val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'generator' @ [135:20] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'generate' @ [135:30] ==> public abstract fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [135:39] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation.generateCode[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [139:20] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'resultCallChain' @ [139:33] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [139:50] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'resultCallChain' @ [139:89] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation.generateExpressionToReplaceLoopAndCheckErrors[ValueParameterDescriptorImpl]

'endReturn' @ [143:13] ==> private final val endReturn: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'returnedExpression' @ [143:23] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'replace' @ [143:44] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'resultCallChain' @ [143:52] ==> value-parameter resultCallChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation.convertLoop[ValueParameterDescriptorImpl]

'loop' @ [144:13] ==> public open val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'deleteWithLabels' @ [144:18] ==> public fun KtLoopExpression.deleteWithLabels(): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'endReturn' @ [145:20] ==> private final val endReturn: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndReturnTransformation[PropertyDescriptorImpl]

'AssignToVariableResultTransformation' @ [153:9] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [153:46] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [153:52] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation.<init>[ValueParameterDescriptorImpl]

'generator' @ [156:21] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation[PropertyDescriptorImpl]

'presentation' @ [156:31] ==> public final val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'generator' @ [159:21] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation[PropertyDescriptorImpl]

'chainCallCount' @ [159:31] ==> public final val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'generator' @ [162:20] ==> private final val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation[PropertyDescriptorImpl]

'generate' @ [162:30] ==> public abstract fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [162:39] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindAndAssignTransformation.generateCode[ValueParameterDescriptorImpl]

'this' @ [171:54] ==> public constructor FindOperationGenerator(functionName: String, hasFilter: Boolean, chainCallCount: Int = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'other' @ [171:59] ==> value-parameter other: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator.<init>[ValueParameterDescriptorImpl]

'functionName' @ [171:65] ==> public final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'other' @ [171:79] ==> value-parameter other: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator.<init>[ValueParameterDescriptorImpl]

'hasFilter' @ [171:85] ==> public final val hasFilter: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'other' @ [171:96] ==> value-parameter other: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator.<init>[ValueParameterDescriptorImpl]

'chainCallCount' @ [171:102] ==> public final val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'functionName' @ [174:21] ==> public final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'if (hasFilter) "{}" else "()"' @ [174:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'hasFilter' @ [174:41] ==> public final val hasFilter: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[PropertyDescriptorImpl]

'FindOperationGenerator' @ [184:9] ==> public constructor FindOperationGenerator(functionName: String, hasFilter: Boolean, chainCallCount: Int = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'functionName' @ [184:32] ==> value-parameter functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator.<init>[ValueParameterDescriptorImpl]

'filter' @ [184:46] ==> value-parameter filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator.<init>[ValueParameterDescriptorImpl]

'generateChainedCall' @ [186:20] ==> private final fun generateChainedCall(stdlibFunName: String, chainedCallGenerator: ChainedCallGenerator, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'functionName' @ [186:40] ==> public final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[PropertyDescriptorImpl]

'chainedCallGenerator' @ [186:54] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator.generate[ValueParameterDescriptorImpl]

'inputVariable' @ [186:76] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[PropertyDescriptorImpl]

'filter' @ [186:91] ==> private final val filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[PropertyDescriptorImpl]

'argument' @ [186:99] ==> private final val argument: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[PropertyDescriptorImpl]

'if (filter == null) {
            if (argument != null) {
                chainedCallGenerator.generate("$stdlibFunName($0)", argument)
            }
            else {
                chainedCallGenerator.generate("$stdlibFunName()")
            }
        }
        else {
            val lambda = generateLambda(inputVariable, filter)
            if (argument != null) {
                chainedCallGenerator.generate("$stdlibFunName($0) $1:'{}'", argument, lambda)
            }
            else {
                chainedCallGenerator.generate("$stdlibFunName $0:'{}'", lambda)
            }
        }' @ [197:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'filter' @ [197:20] ==> value-parameter filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'if (argument != null) {
                chainedCallGenerator.generate("$stdlibFunName($0)", argument)
            }
            else {
                chainedCallGenerator.generate("$stdlibFunName()")
            }' @ [198:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'argument' @ [198:17] ==> value-parameter argument: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [199:17] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'generate' @ [199:38] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'stdlibFunName' @ [199:49] ==> value-parameter stdlibFunName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'argument' @ [199:69] ==> value-parameter argument: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [202:17] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'generate' @ [202:38] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'stdlibFunName' @ [202:49] ==> value-parameter stdlibFunName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'generateLambda' @ [206:26] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [206:41] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'filter' @ [206:56] ==> value-parameter filter: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'if (argument != null) {
                chainedCallGenerator.generate("$stdlibFunName($0) $1:'{}'", argument, lambda)
            }
            else {
                chainedCallGenerator.generate("$stdlibFunName $0:'{}'", lambda)
            }' @ [207:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'argument' @ [207:17] ==> value-parameter argument: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [208:17] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'generate' @ [208:38] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'stdlibFunName' @ [208:49] ==> value-parameter stdlibFunName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'argument' @ [208:77] ==> value-parameter argument: KtExpression? = ... defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'lambda' @ [208:87] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[LocalVariableDescriptor]

'chainedCallGenerator' @ [211:17] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'generate' @ [211:38] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'stdlibFunName' @ [211:49] ==> value-parameter stdlibFunName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[ValueParameterDescriptorImpl]

'lambda' @ [211:73] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.generateChainedCall[LocalVariableDescriptor]

'assert' @ [225:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueIfFound' @ [225:16] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isPhysical' @ [225:29] ==> public final val KtExpression.isPhysical: Boolean[MyPropertyDescriptor]

'assert' @ [226:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueIfNotFound' @ [226:16] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isPhysical' @ [226:32] ==> public final val KtExpression.isPhysical: Boolean[MyPropertyDescriptor]

'filterTransformation' @ [228:31] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'effectiveCondition' @ [228:53] ==> public abstract val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'if (indexVariable != null) {
            if (filterTransformation == null) return null // makes no sense, indexVariable must be always null
            if (filterTransformation.indexVariable != null) return null // cannot use index in condition for indexOfFirst/indexOfLast

            //TODO: what if value when not found is not "-1"?
            if (valueIfFound.isVariableReference(indexVariable) && valueIfNotFound.text == "-1") {
                val filterExpression = filterCondition!!.asExpression()
                val containsArgument = filterExpression.isFilterForContainsOperation(inputVariable, loop)
                return if (containsArgument != null) {
                    val functionName = if (findFirst) "indexOf" else "lastIndexOf"
                    SimpleGenerator(functionName, inputVariable, null, containsArgument)
                }
                else {
                    val functionName = if (findFirst) "indexOfFirst" else "indexOfLast"
                    SimpleGenerator(functionName, inputVariable, filterExpression)
                }
            }

            return null

        }
        else {
            val inputVariableCanHoldNull = (inputVariable.resolveToDescriptor() as VariableDescriptor).type.nullability() != TypeNullability.NOT_NULL

            fun FindOperationGenerator.useElvisOperatorIfNeeded(): FindOperationGenerator? {
                if (valueIfNotFound.isNullExpression()) return this

                // we cannot use ?: if found value can be null
                if (inputVariableCanHoldNull) return null

                return object : FindOperationGenerator(this) {
                    override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                        val generated = this@useElvisOperatorIfNeeded.generate(chainedCallGenerator)
                        return KtPsiFactory(generated).createExpressionByPattern("$0\n ?: $1", generated, valueIfNotFound)
                    }
                }
            }

            when {
                valueIfFound.isVariableReference(inputVariable) -> {
                    val functionName = if (findFirst) "firstOrNull" else "lastOrNull"
                    val generator = SimpleGenerator(functionName, inputVariable, filterCondition?.asExpression())
                    return generator.useElvisOperatorIfNeeded()
                }

                valueIfFound.isTrueConstant() && valueIfNotFound.isFalseConstant() -> {
                    return buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = false)
                }

                valueIfFound.isFalseConstant() && valueIfNotFound.isTrueConstant() -> {
                    return buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = true)
                }

                inputVariable.hasUsages(valueIfFound) -> {
                    if (!findFirst) return null // too dangerous because of side effects

                    // specially handle the case when the result expression is "<input variable>.<some call>" or "<input variable>?.<some call>"
                    val qualifiedExpression = valueIfFound as? KtQualifiedExpression
                    if (qualifiedExpression != null) {
                        val receiver = qualifiedExpression.receiverExpression
                        val selector = qualifiedExpression.selectorExpression
                        if (receiver.isVariableReference(inputVariable) && selector != null && !inputVariable.hasUsages(selector)) {
                            return object: FindOperationGenerator("firstOrNull", filterCondition != null, chainCallCount = 2) {
                                override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                                    val findFirstCall = generateChainedCall(functionName, chainedCallGenerator, inputVariable, filterCondition?.asExpression())
                                    return chainedCallGenerator.generate("$0", selector, receiver = findFirstCall, safeCall = true)
                                }
                            }.useElvisOperatorIfNeeded()
                        }
                    }

                    // in case of nullable input variable we cannot distinguish by the result of "firstOrNull" whether nothing was found or 'null' was found
                    if (inputVariableCanHoldNull) return null

                    return object : FindOperationGenerator("firstOrNull", filterCondition != null, chainCallCount = 2 /* also includes "let" */) {
                        override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                            val findFirstCall = generateChainedCall(functionName, chainedCallGenerator, inputVariable, filterCondition?.asExpression())
                            val letBody = generateLambda(inputVariable, valueIfFound)
                            return chainedCallGenerator.generate("let $0:'{}'", letBody, receiver = findFirstCall, safeCall = true)
                        }
                    }.useElvisOperatorIfNeeded()
                }

                else -> {
                    val generator = buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = false)
                    return object : FindOperationGenerator(generator) {
                        override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                            val chainedCall = generator.generate(chainedCallGenerator)
                            return KtPsiFactory(chainedCall).createExpressionByPattern("if ($0) $1 else $2", chainedCall, valueIfFound, valueIfNotFound)
                        }
                    }
                }
            }
        }' @ [230:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'indexVariable' @ [230:13] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterTransformation' @ [231:17] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterTransformation' @ [232:17] ==> value-parameter filterTransformation: FilterTransformationBase? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'indexVariable' @ [232:38] ==> public abstract val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[PropertyDescriptorImpl]

'valueIfFound' @ [235:17] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isVariableReference' @ [235:30] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'indexVariable' @ [235:50] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'valueIfNotFound' @ [235:68] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'text' @ [235:84] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'filterCondition' @ [236:40] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'asExpression' @ [236:58] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'filterExpression' @ [237:40] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'isFilterForContainsOperation' @ [237:57] ==> private final fun KtExpression.isFilterForContainsOperation(inputVariable: KtCallableDeclaration, loop: KtForExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'inputVariable' @ [237:86] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'loop' @ [237:101] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'if (containsArgument != null) {
                    val functionName = if (findFirst) "indexOf" else "lastIndexOf"
                    SimpleGenerator(functionName, inputVariable, null, containsArgument)
                }
                else {
                    val functionName = if (findFirst) "indexOfFirst" else "indexOfLast"
                    SimpleGenerator(functionName, inputVariable, filterExpression)
                }' @ [238:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FindTransformationMatcher.FindOperationGenerator?, elseBranch: FindTransformationMatcher.FindOperationGenerator?): FindTransformationMatcher.FindOperationGenerator?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FindOperationGenerator?

'containsArgument' @ [238:28] ==> val containsArgument: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'if (findFirst) "indexOf" else "lastIndexOf"' @ [239:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'findFirst' @ [239:44] ==> value-parameter findFirst: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'SimpleGenerator' @ [240:21] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'functionName' @ [240:37] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'inputVariable' @ [240:51] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'containsArgument' @ [240:72] ==> val containsArgument: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'if (findFirst) "indexOfFirst" else "indexOfLast"' @ [243:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'findFirst' @ [243:44] ==> value-parameter findFirst: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'SimpleGenerator' @ [244:21] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'functionName' @ [244:37] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'inputVariable' @ [244:51] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterExpression' @ [244:66] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'!=' @ [252:44] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[DeserializedSimpleFunctionDescriptor]

'inputVariable' @ [252:45] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [252:59] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'type' @ [252:104] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'nullability' @ [252:109] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'NOT_NULL' @ [252:142] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'valueIfNotFound' @ [255:21] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isNullExpression' @ [255:37] ==> public fun KtExpression?.isNullExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [255:64] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded[ReceiverParameterDescriptorImpl]

'inputVariableCanHoldNull' @ [258:21] ==> val inputVariableCanHoldNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'FindOperationGenerator' @ [260:33] ==> public constructor FindOperationGenerator(other: FindTransformationMatcher.FindOperationGenerator) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'this' @ [260:56] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded[ReceiverParameterDescriptorImpl]

'this@useElvisOperatorIfNeeded' @ [262:41] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded[ReceiverParameterDescriptorImpl]

'generate' @ [262:71] ==> public abstract fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [262:80] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded.<no name provided>.generate[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [263:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'generated' @ [263:45] ==> val generated: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded.<no name provided>.generate[LocalVariableDescriptor]

'createExpressionByPattern' @ [263:56] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'generated' @ [263:96] ==> val generated: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.useElvisOperatorIfNeeded.<no name provided>.generate[LocalVariableDescriptor]

'valueIfNotFound' @ [263:107] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'when {
                valueIfFound.isVariableReference(inputVariable) -> {
                    val functionName = if (findFirst) "firstOrNull" else "lastOrNull"
                    val generator = SimpleGenerator(functionName, inputVariable, filterCondition?.asExpression())
                    return generator.useElvisOperatorIfNeeded()
                }

                valueIfFound.isTrueConstant() && valueIfNotFound.isFalseConstant() -> {
                    return buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = false)
                }

                valueIfFound.isFalseConstant() && valueIfNotFound.isTrueConstant() -> {
                    return buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = true)
                }

                inputVariable.hasUsages(valueIfFound) -> {
                    if (!findFirst) return null // too dangerous because of side effects

                    // specially handle the case when the result expression is "<input variable>.<some call>" or "<input variable>?.<some call>"
                    val qualifiedExpression = valueIfFound as? KtQualifiedExpression
                    if (qualifiedExpression != null) {
                        val receiver = qualifiedExpression.receiverExpression
                        val selector = qualifiedExpression.selectorExpression
                        if (receiver.isVariableReference(inputVariable) && selector != null && !inputVariable.hasUsages(selector)) {
                            return object: FindOperationGenerator("firstOrNull", filterCondition != null, chainCallCount = 2) {
                                override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                                    val findFirstCall = generateChainedCall(functionName, chainedCallGenerator, inputVariable, filterCondition?.asExpression())
                                    return chainedCallGenerator.generate("$0", selector, receiver = findFirstCall, safeCall = true)
                                }
                            }.useElvisOperatorIfNeeded()
                        }
                    }

                    // in case of nullable input variable we cannot distinguish by the result of "firstOrNull" whether nothing was found or 'null' was found
                    if (inputVariableCanHoldNull) return null

                    return object : FindOperationGenerator("firstOrNull", filterCondition != null, chainCallCount = 2 /* also includes "let" */) {
                        override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                            val findFirstCall = generateChainedCall(functionName, chainedCallGenerator, inputVariable, filterCondition?.asExpression())
                            val letBody = generateLambda(inputVariable, valueIfFound)
                            return chainedCallGenerator.generate("let $0:'{}'", letBody, receiver = findFirstCall, safeCall = true)
                        }
                    }.useElvisOperatorIfNeeded()
                }

                else -> {
                    val generator = buildFoundFlagGenerator(loop, inputVariable, filterCondition, negated = false)
                    return object : FindOperationGenerator(generator) {
                        override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression {
                            val chainedCall = generator.generate(chainedCallGenerator)
                            return KtPsiFactory(chainedCall).createExpressionByPattern("if ($0) $1 else $2", chainedCall, valueIfFound, valueIfNotFound)
                        }
                    }
                }
            }' @ [268:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'valueIfFound' @ [269:17] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isVariableReference' @ [269:30] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [269:50] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'if (findFirst) "firstOrNull" else "lastOrNull"' @ [270:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'findFirst' @ [270:44] ==> value-parameter findFirst: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'SimpleGenerator' @ [271:37] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'functionName' @ [271:53] ==> val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'inputVariable' @ [271:67] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [271:82] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'asExpression' @ [271:99] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'generator' @ [272:28] ==> val generator: FindTransformationMatcher.SimpleGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'useElvisOperatorIfNeeded' @ [272:38] ==> local final fun FindTransformationMatcher.FindOperationGenerator.useElvisOperatorIfNeeded(): FindTransformationMatcher.FindOperationGenerator? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[SimpleFunctionDescriptorImpl]

'valueIfFound' @ [275:17] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isTrueConstant' @ [275:30] ==> public fun KtExpression?.isTrueConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'valueIfNotFound' @ [275:50] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isFalseConstant' @ [275:66] ==> public fun KtExpression?.isFalseConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'buildFoundFlagGenerator' @ [276:28] ==> private final fun buildFoundFlagGenerator(loop: KtForExpression, inputVariable: KtCallableDeclaration, filter: Condition?, negated: Boolean): FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'loop' @ [276:52] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [276:58] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [276:73] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'valueIfFound' @ [279:17] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isFalseConstant' @ [279:30] ==> public fun KtExpression?.isFalseConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'valueIfNotFound' @ [279:51] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'isTrueConstant' @ [279:67] ==> public fun KtExpression?.isTrueConstant(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'buildFoundFlagGenerator' @ [280:28] ==> private final fun buildFoundFlagGenerator(loop: KtForExpression, inputVariable: KtCallableDeclaration, filter: Condition?, negated: Boolean): FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'loop' @ [280:52] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [280:58] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [280:73] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'inputVariable' @ [283:17] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'hasUsages' @ [283:31] ==> public fun KtCallableDeclaration.hasUsages(inElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'valueIfFound' @ [283:41] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'!' @ [284:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'findFirst' @ [284:26] ==> value-parameter findFirst: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'valueIfFound' @ [287:47] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'qualifiedExpression' @ [288:25] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'qualifiedExpression' @ [289:40] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'receiverExpression' @ [289:60] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'qualifiedExpression' @ [290:40] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'selectorExpression' @ [290:60] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [291:29] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'isVariableReference' @ [291:38] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [291:58] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'selector' @ [291:76] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'!' @ [291:96] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inputVariable' @ [291:97] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'hasUsages' @ [291:111] ==> public fun KtCallableDeclaration.hasUsages(inElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'selector' @ [291:121] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'FindOperationGenerator' @ [292:44] ==> public constructor FindOperationGenerator(functionName: String, hasFilter: Boolean, chainCallCount: Int = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'filterCondition' @ [292:82] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'generateChainedCall' @ [294:57] ==> private final fun generateChainedCall(stdlibFunName: String, chainedCallGenerator: ChainedCallGenerator, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'functionName' @ [294:77] ==> public final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>[PropertyDescriptorImpl]

'chainedCallGenerator' @ [294:91] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'inputVariable' @ [294:113] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [294:128] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'asExpression' @ [294:145] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [295:44] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'generate' @ [295:65] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'selector' @ [295:80] ==> val selector: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'findFirstCall' @ [295:101] ==> val findFirstCall: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[LocalVariableDescriptor]

'useElvisOperatorIfNeeded' @ [297:31] ==> local final fun FindTransformationMatcher.FindOperationGenerator.useElvisOperatorIfNeeded(): FindTransformationMatcher.FindOperationGenerator? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[SimpleFunctionDescriptorImpl]

'inputVariableCanHoldNull' @ [302:25] ==> val inputVariableCanHoldNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'FindOperationGenerator' @ [304:37] ==> public constructor FindOperationGenerator(functionName: String, hasFilter: Boolean, chainCallCount: Int = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'filterCondition' @ [304:75] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'generateChainedCall' @ [306:49] ==> private final fun generateChainedCall(stdlibFunName: String, chainedCallGenerator: ChainedCallGenerator, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'functionName' @ [306:69] ==> public final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>[PropertyDescriptorImpl]

'chainedCallGenerator' @ [306:83] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'inputVariable' @ [306:105] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [306:120] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'asExpression' @ [306:137] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'generateLambda' @ [307:43] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [307:58] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'valueIfFound' @ [307:73] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [308:36] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'generate' @ [308:57] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'letBody' @ [308:81] ==> val letBody: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[LocalVariableDescriptor]

'findFirstCall' @ [308:101] ==> val findFirstCall: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[LocalVariableDescriptor]

'useElvisOperatorIfNeeded' @ [310:23] ==> local final fun FindTransformationMatcher.FindOperationGenerator.useElvisOperatorIfNeeded(): FindTransformationMatcher.FindOperationGenerator? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[SimpleFunctionDescriptorImpl]

'buildFoundFlagGenerator' @ [314:37] ==> private final fun buildFoundFlagGenerator(loop: KtForExpression, inputVariable: KtCallableDeclaration, filter: Condition?, negated: Boolean): FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'loop' @ [314:61] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [314:67] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filterCondition' @ [314:82] ==> val filterCondition: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'FindOperationGenerator' @ [315:37] ==> public constructor FindOperationGenerator(other: FindTransformationMatcher.FindOperationGenerator) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'generator' @ [315:60] ==> val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'generator' @ [317:47] ==> val generator: FindTransformationMatcher.FindOperationGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[LocalVariableDescriptor]

'generate' @ [317:57] ==> public abstract fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [317:66] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [318:36] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'chainedCall' @ [318:49] ==> val chainedCall: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[LocalVariableDescriptor]

'createExpressionByPattern' @ [318:62] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'chainedCall' @ [318:110] ==> val chainedCall: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator.<no name provided>.generate[LocalVariableDescriptor]

'valueIfFound' @ [318:123] ==> value-parameter valueIfFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'valueIfNotFound' @ [318:137] ==> value-parameter valueIfNotFound: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFindOperationGenerator[ValueParameterDescriptorImpl]

'filter' @ [332:13] ==> value-parameter filter: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'SimpleGenerator' @ [333:20] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'if (negated) "none" else "any"' @ [333:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'negated' @ [333:40] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [333:68] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'filter' @ [336:32] ==> value-parameter filter: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'asExpression' @ [336:39] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'filterExpression' @ [337:32] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'isFilterForContainsOperation' @ [337:49] ==> private final fun KtExpression.isFilterForContainsOperation(inputVariable: KtCallableDeclaration, loop: KtForExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher[SimpleFunctionDescriptorImpl]

'inputVariable' @ [337:78] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'loop' @ [337:93] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'containsArgument' @ [338:13] ==> val containsArgument: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'SimpleGenerator' @ [339:29] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'inputVariable' @ [339:57] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'containsArgument' @ [339:78] ==> val containsArgument: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'if (negated) {
                object : FindOperationGenerator(generator) {
                    override fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression =
                            generator.generate(chainedCallGenerator).negate()
                }
            }
            else {
                generator
            }' @ [340:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FindTransformationMatcher.FindOperationGenerator, elseBranch: FindTransformationMatcher.FindOperationGenerator): FindTransformationMatcher.FindOperationGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FindOperationGenerator

'negated' @ [340:24] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'FindOperationGenerator' @ [341:26] ==> public constructor FindOperationGenerator(other: FindTransformationMatcher.FindOperationGenerator) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.FindOperationGenerator[ClassConstructorDescriptorImpl]

'generator' @ [341:49] ==> val generator: FindTransformationMatcher.SimpleGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'generator' @ [343:29] ==> val generator: FindTransformationMatcher.SimpleGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'generate' @ [343:39] ==> public open fun generate(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [343:48] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator.<no name provided>.generate[ValueParameterDescriptorImpl]

'negate' @ [343:70] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'generator' @ [347:17] ==> val generator: FindTransformationMatcher.SimpleGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'filterExpression' @ [351:13] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'filterExpression' @ [351:55] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'operationToken' @ [351:72] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCL' @ [351:99] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SimpleGenerator' @ [352:20] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'if (negated) "any" else "none"' @ [352:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'negated' @ [352:40] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [352:68] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'filter' @ [352:83] ==> value-parameter filter: Condition? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'asNegatedExpression' @ [352:90] ==> public abstract fun asNegatedExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'SimpleGenerator' @ [355:16] ==> public constructor SimpleGenerator(functionName: String, inputVariable: KtCallableDeclaration, filter: KtExpression?, argument: KtExpression? = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.SimpleGenerator[ClassConstructorDescriptorImpl]

'if (negated) "none" else "any"' @ [355:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'negated' @ [355:36] ==> value-parameter negated: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'inputVariable' @ [355:64] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[ValueParameterDescriptorImpl]

'filterExpression' @ [355:79] ==> val filterExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.buildFoundFlagGenerator[LocalVariableDescriptor]

'this' @ [359:13] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation[ReceiverParameterDescriptorImpl]

'operationToken' @ [360:13] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [360:40] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when {
            left.isVariableReference(inputVariable) -> right?.takeIf { it.isStableInLoop(loop, false) }
            right.isVariableReference(inputVariable) -> left?.takeIf { it.isStableInLoop(loop, false) }
            else -> null
        }' @ [361:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'left' @ [362:13] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isVariableReference' @ [362:18] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [362:38] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation[ValueParameterDescriptorImpl]

'right' @ [362:56] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'takeIf' @ [362:63] ==> @InlineOnly @SinceKotlin public inline fun <T> KtExpression.takeIf(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [362:72] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation.<anonymous>[ValueParameterDescriptorImpl]

'isStableInLoop' @ [362:75] ==> public fun KtExpression.isStableInLoop(loop: KtLoopExpression, checkNoOtherUsagesInLoop: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [362:90] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation[ValueParameterDescriptorImpl]

'right' @ [363:13] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isVariableReference' @ [363:19] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [363:39] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation[ValueParameterDescriptorImpl]

'left' @ [363:57] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'takeIf' @ [363:63] ==> @InlineOnly @SinceKotlin public inline fun <T> KtExpression.takeIf(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [363:72] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation.<anonymous>[ValueParameterDescriptorImpl]

'isStableInLoop' @ [363:75] ==> public fun KtExpression.isStableInLoop(loop: KtLoopExpression, checkNoOtherUsagesInLoop: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [363:90] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FindTransformationMatcher.isFilterForContainsOperation[ValueParameterDescriptorImpl]

