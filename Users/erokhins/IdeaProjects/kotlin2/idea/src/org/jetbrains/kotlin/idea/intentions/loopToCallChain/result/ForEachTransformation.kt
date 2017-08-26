'ReplaceLoopResultTransformation' @ [35:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [35:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.<init>[ValueParameterDescriptorImpl]

'if (indexVariable != null) "forEachIndexed" else "forEach"' @ [37:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'indexVariable' @ [37:36] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'functionName' @ [40:17] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'generateLambda' @ [43:22] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [43:37] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'indexVariable' @ [43:52] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'statement' @ [43:67] ==> private final val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [44:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [44:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'functionName' @ [44:48] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[PropertyDescriptorImpl]

'lambda' @ [44:71] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.generateCode[LocalVariableDescriptor]

'state' @ [62:17] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'previousTransformations' @ [62:23] ==> public final val previousTransformations: MutableList<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'isEmpty' @ [62:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'state' @ [64:29] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [64:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [64:46] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'!' @ [66:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [66:18] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'lazySequence' @ [66:24] ==> public final val lazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'statement' @ [68:36] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[LocalVariableDescriptor]

'anyDescendantOfType' @ [68:46] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtNameReferenceExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNameReferenceExpression

'nameExpr' @ [69:25] ==> value-parameter nameExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [69:34] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nameExpr' @ [71:39] ==> value-parameter nameExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[ValueParameterDescriptorImpl]

'readWriteAccess' @ [71:48] ==> public fun KtExpression.readWriteAccess(useResolveForReadWrite: Boolean): ReferenceAccess defined in org.jetbrains.kotlin.idea.references[DeserializedSimpleFunctionDescriptor]

'READ' @ [71:115] ==> enum entry READ defined in org.jetbrains.kotlin.idea.references.ReferenceAccess[FakeCallableDescriptorForObject]

'isWrite' @ [72:29] ==> val isWrite: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[LocalVariableDescriptor]

'nameExpr' @ [73:44] ==> value-parameter nameExpr: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[ValueParameterDescriptorImpl]

'mainReference' @ [73:53] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [73:67] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'variable' @ [74:33] ==> val variable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[LocalVariableDescriptor]

'variable' @ [74:53] ==> val variable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match.<anonymous>[LocalVariableDescriptor]

'countUsages' @ [74:62] ==> public fun KtCallableDeclaration.countUsages(inElement: KtElement): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [74:74] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [74:80] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'onlySequence' @ [79:21] ==> val onlySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[LocalVariableDescriptor]

'ForEachTransformation' @ [83:34] ==> public constructor ForEachTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, statement: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[ClassConstructorDescriptorImpl]

'state' @ [83:56] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [83:62] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [83:73] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [83:79] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [83:94] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [83:100] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'statement' @ [83:115] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[LocalVariableDescriptor]

'Result' @ [84:40] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [84:47] ==> val transformation: ForEachTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation.Matcher.match[LocalVariableDescriptor]

