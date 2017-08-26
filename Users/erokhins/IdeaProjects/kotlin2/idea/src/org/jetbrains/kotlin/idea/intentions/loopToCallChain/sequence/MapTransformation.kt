'if (indexVariable != null)
        if (mapNotNull) "mapIndexedNotNull" else "mapIndexed"
    else
        if (mapNotNull) "mapNotNull" else "map"' @ [31:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'indexVariable' @ [31:36] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'if (mapNotNull) "mapIndexedNotNull" else "mapIndexed"' @ [32:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'mapNotNull' @ [32:13] ==> public final val mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'if (mapNotNull) "mapNotNull" else "map"' @ [34:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'mapNotNull' @ [34:13] ==> public final val mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'mapNotNull' @ [37:17] ==> public final val mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'functionName' @ [40:19] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'generateLambda' @ [43:22] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [43:37] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'indexVariable' @ [43:52] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'mapping' @ [43:67] ==> public final val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [44:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [44:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'functionName' @ [44:48] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'lambda' @ [44:70] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.generateCode[LocalVariableDescriptor]

'state' @ [62:31] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [62:37] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'firstOrNull' @ [62:48] ==> public fun <T> List<KtExpression>.firstOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'declaration' @ [63:31] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'initializer' @ [63:43] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'declaration' @ [64:17] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'hasWriteUsages' @ [64:29] ==> public fun KtVariableDeclaration.hasWriteUsages(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [65:34] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [65:40] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'drop' @ [65:51] ==> public fun <T> Iterable<KtExpression>.drop(n: Int): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'initializer' @ [67:17] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'initializer' @ [67:54] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'operationToken' @ [67:66] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [67:93] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'initializer' @ [68:42] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'right' @ [68:54] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'continueExpression' @ [69:21] ==> val continueExpression: KtContinueExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'targetLoop' @ [69:40] ==> public fun KtExpressionWithLabel.targetLoop(): KtLoopExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [69:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'innerLoop' @ [69:62] ==> public final val innerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initializer' @ [71:31] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'left' @ [71:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'mapping' @ [72:21] ==> val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'containsEmbeddedBreakOrContinue' @ [72:29] ==> public fun KtExpression.containsEmbeddedBreakOrContinue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'if (state.indexVariable != null && state.indexVariable.hasUsages(mapping))
                    MapTransformation(state.outerLoop, state.inputVariable, state.indexVariable, mapping, mapNotNull = true)
                else
                    MapTransformation(state.outerLoop, state.inputVariable, null, mapping, mapNotNull = true)' @ [74:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MapTransformation, elseBranch: MapTransformation): MapTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MapTransformation

'state' @ [74:42] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [74:48] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [74:73] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [74:79] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [74:93] ==> public fun KtCallableDeclaration.hasUsages(inElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'mapping' @ [74:103] ==> val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'MapTransformation' @ [75:21] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [75:39] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [75:45] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [75:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [75:62] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [75:77] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [75:83] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'mapping' @ [75:98] ==> val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'MapTransformation' @ [77:21] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [77:39] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [77:45] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [77:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [77:62] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'mapping' @ [77:83] ==> val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'state' @ [78:32] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'copy' @ [78:38] ==> public final fun copy(outerLoop: KtForExpression = ..., innerLoop: KtForExpression = ..., statements: List<KtExpression> = ..., inputVariable: KtCallableDeclaration = ..., indexVariable: KtCallableDeclaration? = ..., lazySequence: Boolean = ..., pseudocodeProvider: () -> Pseudocode = ..., initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[SimpleFunctionDescriptorImpl]

'restStatements' @ [78:56] ==> val restStatements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'declaration' @ [78:88] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'Sequence' @ [79:44] ==> public constructor Sequence(transformation: SequenceTransformation, newState: MatchingState) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[ClassConstructorDescriptorImpl]

'transformation' @ [79:53] ==> val transformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'newState' @ [79:69] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'initializer' @ [82:17] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'containsEmbeddedBreakOrContinue' @ [82:29] ==> public fun KtExpression.containsEmbeddedBreakOrContinue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'if (state.indexVariable != null && state.indexVariable.hasUsages(initializer))
                MapTransformation(state.outerLoop, state.inputVariable, state.indexVariable, initializer, mapNotNull = false)
            else
                MapTransformation(state.outerLoop, state.inputVariable, null, initializer, mapNotNull = false)' @ [84:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MapTransformation, elseBranch: MapTransformation): MapTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MapTransformation

'state' @ [84:38] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [84:44] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [84:69] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [84:75] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [84:89] ==> public fun KtCallableDeclaration.hasUsages(inElement: KtElement): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'initializer' @ [84:99] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'MapTransformation' @ [85:17] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [85:35] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [85:41] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [85:52] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [85:58] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [85:73] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [85:79] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initializer' @ [85:94] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'MapTransformation' @ [87:17] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [87:35] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [87:41] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [87:52] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [87:58] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initializer' @ [87:79] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'state' @ [88:28] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[ValueParameterDescriptorImpl]

'copy' @ [88:34] ==> public final fun copy(outerLoop: KtForExpression = ..., innerLoop: KtForExpression = ..., statements: List<KtExpression> = ..., inputVariable: KtCallableDeclaration = ..., indexVariable: KtCallableDeclaration? = ..., lazySequence: Boolean = ..., pseudocodeProvider: () -> Pseudocode = ..., initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[SimpleFunctionDescriptorImpl]

'restStatements' @ [88:52] ==> val restStatements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'declaration' @ [88:84] ==> val declaration: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'Sequence' @ [89:40] ==> public constructor Sequence(transformation: SequenceTransformation, newState: MatchingState) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[ClassConstructorDescriptorImpl]

'transformation' @ [89:49] ==> val transformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

'newState' @ [89:65] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation.Matcher.match[LocalVariableDescriptor]

