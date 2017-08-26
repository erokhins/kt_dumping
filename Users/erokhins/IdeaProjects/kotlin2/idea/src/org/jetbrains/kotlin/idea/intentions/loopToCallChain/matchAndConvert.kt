'listOf' @ [40:55] ==> public fun <T> listOf(vararg elements: TransformationMatcher): List<TransformationMatcher> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransformationMatcher

'FindTransformationMatcher' @ [41:13] ==> public object FindTransformationMatcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result in file FindTransformationMatcher.kt[FakeCallableDescriptorForObject]

'Matcher' @ [42:43] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[FakeCallableDescriptorForObject]

'Matcher' @ [43:33] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.CountTransformation[FakeCallableDescriptorForObject]

'Matcher' @ [44:35] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.SumTransformationBase[FakeCallableDescriptorForObject]

'Matcher' @ [45:36] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MaxOrMinTransformation[FakeCallableDescriptorForObject]

'IntroduceIndexMatcher' @ [46:13] ==> public object IntroduceIndexMatcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence in file IntroduceIndexMatcher.kt[FakeCallableDescriptorForObject]

'Matcher' @ [47:38] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformationBase[FakeCallableDescriptorForObject]

'Matcher' @ [48:31] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[FakeCallableDescriptorForObject]

'Matcher' @ [49:35] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FlatMapTransformation[FakeCallableDescriptorForObject]

'Matcher' @ [50:35] ==> public object Matcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.ForEachTransformation[FakeCallableDescriptorForObject]

'component1' @ [62:10] ==> public final operator fun component1(): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[SimpleFunctionDescriptorImpl]

'component2' @ [62:25] ==> public final operator fun component2(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[SimpleFunctionDescriptorImpl]

'component3' @ [62:40] ==> public final operator fun component3(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[SimpleFunctionDescriptorImpl]

'extractLoopData' @ [62:62] ==> private fun extractLoopData(loop: KtForExpression): LoopData? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [62:78] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'createInitialMatchingState' @ [64:17] ==> private fun createInitialMatchingState(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, useLazySequence: Boolean): MatchingState? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [64:44] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'inputVariable' @ [64:50] ==> val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [64:65] ==> val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'useLazySequence' @ [64:80] ==> value-parameter useLazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'loop' @ [67:47] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'containsEmbeddedBreakOrContinue' @ [67:52] ==> public fun KtExpression.containsEmbeddedBreakOrContinue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [71:9] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [71:17] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'unwrapBlock' @ [71:23] ==> public fun MatchingState.unwrapBlock(): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [73:33] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'inputVariable' @ [73:39] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [73:53] ==> public fun KtCallableDeclaration.hasUsages(inElements: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'state' @ [73:63] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [73:69] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [76:13] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [76:19] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'!' @ [76:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [76:45] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [76:51] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [76:67] ==> public fun KtCallableDeclaration.hasUsages(inElements: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'state' @ [76:77] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [76:83] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [77:13] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [77:21] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'copy' @ [77:27] ==> public final fun copy(outerLoop: KtForExpression = ..., innerLoop: KtForExpression = ..., statements: List<KtExpression> = ..., inputVariable: KtCallableDeclaration = ..., indexVariable: KtCallableDeclaration? = ..., lazySequence: Boolean = ..., pseudocodeProvider: () -> Pseudocode = ..., initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[SimpleFunctionDescriptorImpl]

'loopContainsEmbeddedBreakOrContinue' @ [80:51] ==> val loopContainsEmbeddedBreakOrContinue: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [80:90] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [80:96] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'any' @ [80:107] ==> public inline fun <T> Iterable<KtExpression>.any(predicate: (KtExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [80:113] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match.<anonymous>[ValueParameterDescriptorImpl]

'containsEmbeddedBreakOrContinue' @ [80:116] ==> public fun KtExpression.containsEmbeddedBreakOrContinue(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'MatcherRegistrar' @ [83:25] ==> public object MatcherRegistrar defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[FakeCallableDescriptorForObject]

'matchers' @ [83:42] ==> public final val matchers: Collection<TransformationMatcher> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatcherRegistrar[PropertyDescriptorImpl]

'state' @ [84:17] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [84:23] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'!' @ [84:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matcher' @ [84:49] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariableAllowed' @ [84:57] ==> public abstract val indexVariableAllowed: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[PropertyDescriptorImpl]

'matcher' @ [85:17] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'shouldUseInputVariables' @ [85:25] ==> public open val shouldUseInputVariables: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[PropertyDescriptorImpl]

'!' @ [85:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inputVariableUsed' @ [85:53] ==> val inputVariableUsed: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [85:74] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [85:80] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'matcher' @ [87:25] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'match' @ [87:33] ==> public abstract fun match(state: MatchingState): TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[SimpleFunctionDescriptorImpl]

'state' @ [87:39] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'match' @ [88:17] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'when (match) {
                    is TransformationMatch.Sequence -> {
                        // check that old input variable is not needed anymore
                        var newState = match.newState
                        if (state.inputVariable != newState.inputVariable && state.inputVariable.hasUsages(newState.statements)) return null

                        if (matcher.shouldUseInputVariables
                            && !state.inputVariable.hasDifferentSetsOfUsages(state.statements, newState.statements)
                            && !(state.indexVariable?.hasDifferentSetsOfUsages(state.statements, newState.statements) ?: false)) {
                            // matched part of the loop uses neither input variable nor index variable
                            continue@MatchersLoop
                        }

                        if (state.indexVariable != null && match.sequenceTransformations.any { it.affectsIndex }) {
                            // index variable is still needed but index in the new sequence is different
                            if (state.indexVariable!!.hasUsages(newState.statements)) return null
                            newState = newState.copy(indexVariable = null)
                        }

                        if (restContainsEmbeddedBreakOrContinue && !matcher.embeddedBreakOrContinuePossible) {
                            val countBefore = state.statements.sumBy { it.countEmbeddedBreaksAndContinues() }
                            val countAfter = newState.statements.sumBy { it.countEmbeddedBreaksAndContinues() }
                            if (countAfter != countBefore) continue@MatchersLoop // some embedded break or continue in the matched part
                        }

                        state.previousTransformations += match.sequenceTransformations
                        state = newState
                        continue@MatchLoop
                    }

                    is TransformationMatch.Result -> {
                        if (restContainsEmbeddedBreakOrContinue && !matcher.embeddedBreakOrContinuePossible) continue@MatchersLoop

                        state.previousTransformations += match.sequenceTransformations

                        var result = TransformationMatch.Result(match.resultTransformation, state.previousTransformations)
                        result = mergeTransformations(result)

                        if (useLazySequence) {
                            val sequenceTransformations = result.sequenceTransformations
                            val resultTransformation = result.resultTransformation
                            if (sequenceTransformations.isEmpty() && !resultTransformation.lazyMakesSense
                                || sequenceTransformations.size == 1 && resultTransformation is AssignToListTransformation) {
                                return null // it makes no sense to use lazy sequence if no intermediate sequences produced
                            }
                            val asSequence = AsSequenceTransformation(loop)
                            result = TransformationMatch.Result(resultTransformation, listOf(asSequence) + sequenceTransformations)
                        }


                        return MatchResult(sequenceExpression, result, state.initializationStatementsToDelete)
                                .takeIf { checkSmartCastsPreserved(loop, it) }
                    }
                }' @ [89:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'match' @ [89:23] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'match' @ [92:40] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'newState' @ [92:46] ==> public final val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[PropertyDescriptorImpl]

'state' @ [93:29] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'inputVariable' @ [93:35] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'newState' @ [93:52] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'inputVariable' @ [93:61] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [93:78] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'inputVariable' @ [93:84] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [93:98] ==> public fun KtCallableDeclaration.hasUsages(inElements: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'newState' @ [93:108] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [93:117] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'matcher' @ [95:29] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'shouldUseInputVariables' @ [95:37] ==> public open val shouldUseInputVariables: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[PropertyDescriptorImpl]

'!' @ [96:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [96:33] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'inputVariable' @ [96:39] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasDifferentSetsOfUsages' @ [96:53] ==> public fun KtCallableDeclaration.hasDifferentSetsOfUsages(elements1: Collection<KtElement>, elements2: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'state' @ [96:78] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [96:84] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'newState' @ [96:96] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [96:105] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'!' @ [97:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [97:34] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [97:40] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasDifferentSetsOfUsages' @ [97:55] ==> public fun KtCallableDeclaration.hasDifferentSetsOfUsages(elements1: Collection<KtElement>, elements2: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'state' @ [97:80] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [97:86] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'newState' @ [97:98] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [97:107] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [102:29] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [102:35] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'match' @ [102:60] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'sequenceTransformations' @ [102:66] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch[PropertyDescriptorImpl]

'any' @ [102:90] ==> public inline fun <T> Iterable<SequenceTransformation>.any(predicate: (SequenceTransformation) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SequenceTransformation

'it' @ [102:96] ==> value-parameter it: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match.<anonymous>[ValueParameterDescriptorImpl]

'affectsIndex' @ [102:99] ==> public abstract val affectsIndex: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[PropertyDescriptorImpl]

'state' @ [104:33] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'indexVariable' @ [104:39] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'hasUsages' @ [104:55] ==> public fun KtCallableDeclaration.hasUsages(inElements: Collection<KtElement>): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]

'newState' @ [104:65] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [104:74] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'newState' @ [105:29] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'newState' @ [105:40] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'copy' @ [105:49] ==> public final fun copy(outerLoop: KtForExpression = ..., innerLoop: KtForExpression = ..., statements: List<KtExpression> = ..., inputVariable: KtCallableDeclaration = ..., indexVariable: KtCallableDeclaration? = ..., lazySequence: Boolean = ..., pseudocodeProvider: () -> Pseudocode = ..., initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[SimpleFunctionDescriptorImpl]

'restContainsEmbeddedBreakOrContinue' @ [108:29] ==> val restContainsEmbeddedBreakOrContinue: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'!' @ [108:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matcher' @ [108:69] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'embeddedBreakOrContinuePossible' @ [108:77] ==> public open val embeddedBreakOrContinuePossible: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[PropertyDescriptorImpl]

'state' @ [109:47] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [109:53] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'sumBy' @ [109:64] ==> public inline fun <T> Iterable<KtExpression>.sumBy(selector: (KtExpression) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [109:72] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match.<anonymous>[ValueParameterDescriptorImpl]

'countEmbeddedBreaksAndContinues' @ [109:75] ==> public fun KtExpression.countEmbeddedBreaksAndContinues(): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'newState' @ [110:46] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'statements' @ [110:55] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'sumBy' @ [110:66] ==> public inline fun <T> Iterable<KtExpression>.sumBy(selector: (KtExpression) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [110:74] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match.<anonymous>[ValueParameterDescriptorImpl]

'countEmbeddedBreaksAndContinues' @ [110:77] ==> public fun KtExpression.countEmbeddedBreaksAndContinues(): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'countAfter' @ [111:33] ==> val countAfter: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'countBefore' @ [111:47] ==> val countBefore: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [114:25] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'previousTransformations' @ [114:31] ==> public final val previousTransformations: MutableList<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'match' @ [114:58] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'sequenceTransformations' @ [114:64] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch[PropertyDescriptorImpl]

'state' @ [115:25] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'newState' @ [115:33] ==> var newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'restContainsEmbeddedBreakOrContinue' @ [120:29] ==> val restContainsEmbeddedBreakOrContinue: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'!' @ [120:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matcher' @ [120:69] ==> val matcher: TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'embeddedBreakOrContinuePossible' @ [120:77] ==> public open val embeddedBreakOrContinuePossible: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatcher[PropertyDescriptorImpl]

'state' @ [122:25] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'previousTransformations' @ [122:31] ==> public final val previousTransformations: MutableList<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'match' @ [122:58] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'sequenceTransformations' @ [122:64] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch[PropertyDescriptorImpl]

'Result' @ [124:58] ==> public constructor Result(resultTransformation: ResultTransformation, sequenceTransformations: List<SequenceTransformation>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'match' @ [124:65] ==> val match: TransformationMatch? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'resultTransformation' @ [124:71] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'state' @ [124:93] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'previousTransformations' @ [124:99] ==> public final val previousTransformations: MutableList<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'result' @ [125:25] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'mergeTransformations' @ [125:34] ==> private fun mergeTransformations(match: TransformationMatch.Result): TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'result' @ [125:55] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'useLazySequence' @ [127:29] ==> value-parameter useLazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'result' @ [128:59] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'sequenceTransformations' @ [128:66] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'result' @ [129:56] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'resultTransformation' @ [129:63] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'sequenceTransformations' @ [130:33] ==> val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'isEmpty' @ [130:57] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [130:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resultTransformation' @ [130:71] ==> val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'lazyMakesSense' @ [130:92] ==> public open val lazyMakesSense: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'sequenceTransformations' @ [131:36] ==> val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'size' @ [131:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'resultTransformation' @ [131:73] ==> val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'AsSequenceTransformation' @ [134:46] ==> public constructor AsSequenceTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.AsSequenceTransformation[ClassConstructorDescriptorImpl]

'loop' @ [134:71] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'result' @ [135:29] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'Result' @ [135:58] ==> public constructor Result(resultTransformation: ResultTransformation, sequenceTransformations: List<SequenceTransformation>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'resultTransformation' @ [135:65] ==> val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'listOf' @ [135:87] ==> public fun <T> listOf(element: AsSequenceTransformation): List<AsSequenceTransformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AsSequenceTransformation

'asSequence' @ [135:94] ==> val asSequence: AsSequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'sequenceTransformations' @ [135:108] ==> val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'MatchResult' @ [139:32] ==> public constructor MatchResult(sequenceExpression: KtExpression, transformationMatch: TransformationMatch.Result, initializationStatementsToDelete: Collection<KtExpression>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[ClassConstructorDescriptorImpl]

'sequenceExpression' @ [139:44] ==> val sequenceExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'result' @ [139:64] ==> var result: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'state' @ [139:72] ==> var state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[LocalVariableDescriptor]

'initializationStatementsToDelete' @ [139:78] ==> public final val initializationStatementsToDelete: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'takeIf' @ [140:34] ==> @InlineOnly @SinceKotlin public inline fun <T> MatchResult.takeIf(predicate: (MatchResult) -> Boolean): MatchResult? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult

'checkSmartCastsPreserved' @ [140:43] ==> private fun checkSmartCastsPreserved(loop: KtForExpression, matchResult: MatchResult): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [140:68] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match[ValueParameterDescriptorImpl]

'it' @ [140:74] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.match.<anonymous>[ValueParameterDescriptorImpl]

'matchResult' @ [151:32] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'transformationMatch' @ [151:44] ==> public final val transformationMatch: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'resultTransformation' @ [151:64] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'resultTransformation' @ [153:30] ==> val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'commentSavingRange' @ [153:51] ==> public abstract val commentSavingRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'CommentSaver' @ [154:24] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'commentSavingRange' @ [154:37] ==> val commentSavingRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'CommentSavingRangeHolder' @ [155:36] ==> public constructor CommentSavingRangeHolder(range: PsiChildRange) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[ClassConstructorDescriptorImpl]

'commentSavingRange' @ [155:61] ==> val commentSavingRange: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'matchResult' @ [157:5] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'initializationStatementsToDelete' @ [157:17] ==> public final val initializationStatementsToDelete: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'forEach' @ [157:50] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'commentSavingRangeHolder' @ [157:60] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'add' @ [157:85] ==> public final fun add(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[SimpleFunctionDescriptorImpl]

'it' @ [157:89] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop.<anonymous>[ValueParameterDescriptorImpl]

'matchResult' @ [159:21] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'generateCallChain' @ [159:33] ==> private fun MatchResult.generateCallChain(loop: KtForExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [159:51] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'commentSavingRangeHolder' @ [161:5] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'remove' @ [161:30] ==> public final fun remove(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[SimpleFunctionDescriptorImpl]

'loop' @ [161:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'unwrapIfLabeled' @ [161:42] ==> public fun KtExpression.unwrapIfLabeled(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'resultTransformation' @ [162:18] ==> val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'convertLoop' @ [162:39] ==> public abstract fun convertLoop(resultCallChain: KtExpression, commentSavingRangeHolder: CommentSavingRangeHolder): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[SimpleFunctionDescriptorImpl]

'callChain' @ [162:51] ==> val callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'commentSavingRangeHolder' @ [162:62] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'commentSavingRangeHolder' @ [163:5] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'add' @ [163:30] ==> public final fun add(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[SimpleFunctionDescriptorImpl]

'result' @ [163:34] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'matchResult' @ [165:23] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[ValueParameterDescriptorImpl]

'initializationStatementsToDelete' @ [165:35] ==> public final val initializationStatementsToDelete: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'commentSavingRangeHolder' @ [166:9] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'remove' @ [166:34] ==> public final fun remove(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[SimpleFunctionDescriptorImpl]

'statement' @ [166:41] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'statement' @ [167:9] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'delete' @ [167:19] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'commentSaver' @ [171:5] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'restore' @ [171:18] ==> public final fun restore(resultElements: PsiChildRange, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'commentSavingRangeHolder' @ [171:26] ==> val commentSavingRangeHolder: CommentSavingRangeHolder defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'range' @ [171:51] ==> public final var range: PsiChildRange defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CommentSavingRangeHolder[PropertyDescriptorImpl]

'result' @ [173:12] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.convertLoop[LocalVariableDescriptor]

'loop' @ [182:21] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[ValueParameterDescriptorImpl]

'loopRange' @ [182:26] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'loop' @ [184:34] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [184:39] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'destructuringParameter' @ [185:9] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'destructuringParameter' @ [185:43] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'entries' @ [185:66] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'size' @ [185:74] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'loopRange' @ [186:35] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'qualifiedExpression' @ [187:13] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'qualifiedExpression' @ [188:24] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'selectorExpression' @ [188:44] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'call' @ [189:17] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'call' @ [189:33] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'calleeExpression' @ [189:38] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'isSimpleName' @ [189:55] ==> public fun KtExpression?.isSimpleName(name: Name): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'identifier' @ [189:73] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'call' @ [189:101] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'valueArguments' @ [189:106] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [189:121] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'qualifiedExpression' @ [190:32] ==> val qualifiedExpression: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'receiverExpression' @ [190:52] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'!' @ [191:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExpressionTypeSupported' @ [191:22] ==> private fun isExpressionTypeSupported(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [191:48] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'LoopData' @ [192:24] ==> public constructor LoopData(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, sequenceExpression: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[ClassConstructorDescriptorImpl]

'destructuringParameter' @ [192:33] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'entries' @ [192:56] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'destructuringParameter' @ [192:68] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'entries' @ [192:91] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'receiver' @ [192:103] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'!' @ [197:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExpressionTypeSupported' @ [197:10] ==> private fun isExpressionTypeSupported(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loopRange' @ [197:36] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'LoopData' @ [199:12] ==> public constructor LoopData(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, sequenceExpression: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[ClassConstructorDescriptorImpl]

'loop' @ [199:21] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[ValueParameterDescriptorImpl]

'loopParameter' @ [199:26] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'loopRange' @ [199:62] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.extractLoopData[LocalVariableDescriptor]

'lazy' @ [210:39] ==> public fun <T> lazy(initializer: () -> Pseudocode): Lazy<Pseudocode> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pseudocode

'loop' @ [211:31] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'containingDeclarationForPseudocode' @ [211:36] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'loop' @ [212:34] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'analyze' @ [212:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [212:63] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'generatePseudocode' @ [213:28] ==> @NotNull public open fun generatePseudocode(@NotNull p0: KtDeclaration, @NotNull p1: BindingContext): Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'declaration' @ [213:47] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState.<no name provided>.pseudocode.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [213:60] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState.<no name provided>.pseudocode.<anonymous>[LocalVariableDescriptor]

'pseudocode' @ [216:33] ==> public final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState.<no name provided>[PropertyDescriptorImpl]

'MatchingState' @ [219:12] ==> public constructor MatchingState(outerLoop: KtForExpression, innerLoop: KtForExpression, statements: List<KtExpression>, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, lazySequence: Boolean, pseudocodeProvider: () -> Pseudocode, initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[ClassConstructorDescriptorImpl]

'loop' @ [220:25] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'loop' @ [221:25] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'listOf' @ [222:26] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'loop' @ [222:33] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'body' @ [222:38] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'inputVariable' @ [223:29] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'indexVariable' @ [224:29] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'useLazySequence' @ [225:28] ==> value-parameter useLazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[ValueParameterDescriptorImpl]

'pseudocodeProvider' @ [226:34] ==> val pseudocodeProvider: () -> Pseudocode defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.createInitialMatchingState[LocalVariableDescriptor]

'expression' @ [231:16] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[ValueParameterDescriptorImpl]

'analyze' @ [231:27] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [231:51] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [231:60] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [231:68] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[ValueParameterDescriptorImpl]

'expression' @ [233:20] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[ValueParameterDescriptorImpl]

'builtIns' @ [233:31] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'when {
        isSubtypeOfClass(type, builtIns.iterable) -> true
        isSubtypeOfClass(type, builtIns.array) -> true
        KotlinBuiltIns.isPrimitiveArray(type) -> true
        // TODO: support Sequence<T>
        else -> false
    }' @ [234:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'isSubtypeOfClass' @ [235:9] ==> public open fun isSubtypeOfClass(@NotNull p0: KotlinType, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'type' @ [235:26] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[LocalVariableDescriptor]

'builtIns' @ [235:32] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[LocalVariableDescriptor]

'iterable' @ [235:41] ==> public final val KotlinBuiltIns.iterable: ClassDescriptor[MyPropertyDescriptor]

'isSubtypeOfClass' @ [236:9] ==> public open fun isSubtypeOfClass(@NotNull p0: KotlinType, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'type' @ [236:26] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[LocalVariableDescriptor]

'builtIns' @ [236:32] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[LocalVariableDescriptor]

'array' @ [236:41] ==> public final val KotlinBuiltIns.array: ClassDescriptor[MyPropertyDescriptor]

'isPrimitiveArray' @ [237:24] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [237:41] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.isExpressionTypeSupported[LocalVariableDescriptor]

'loop' @ [244:26] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'analyze' @ [244:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [244:55] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'Key' @ [247:25] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExplicitSmartCasts

'Key' @ [248:43] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ImplicitSmartCasts

'loop' @ [252:9] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [252:14] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'bindingContext' @ [253:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'SMARTCAST' @ [253:43] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [253:54] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [253:67] ==> @InlineOnly public inline fun <T, R> ExplicitSmartCasts.let(block: (ExplicitSmartCasts) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitSmartCasts
    <R> -> Int

'expression' @ [254:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [254:28] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>..Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>?), @Nullable p1: ExplicitSmartCasts?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExplicitSmartCasts

'SMARTCAST_KEY' @ [254:48] ==> val SMARTCAST_KEY: Key<ExplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'it' @ [254:63] ==> value-parameter it: ExplicitSmartCasts defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'smartCastCount' @ [255:17] ==> var smartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'bindingContext' @ [258:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'IMPLICIT_RECEIVER_SMARTCAST' @ [258:43] ==> public final val IMPLICIT_RECEIVER_SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ImplicitSmartCasts..ImplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ImplicitSmartCasts..ImplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [258:72] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [258:85] ==> @InlineOnly public inline fun <T, R> ImplicitSmartCasts.let(block: (ImplicitSmartCasts) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImplicitSmartCasts
    <R> -> Int

'expression' @ [259:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [259:28] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>..Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>?), @Nullable p1: ImplicitSmartCasts?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ImplicitSmartCasts

'IMPLICIT_RECEIVER_SMARTCAST_KEY' @ [259:48] ==> val IMPLICIT_RECEIVER_SMARTCAST_KEY: Key<ImplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'it' @ [259:81] ==> value-parameter it: ImplicitSmartCasts defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'smartCastCount' @ [260:17] ==> var smartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'smartCastCount' @ [264:13] ==> var smartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'matchResult' @ [266:25] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'generateCallChain' @ [266:37] ==> private fun MatchResult.generateCallChain(loop: KtForExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [266:55] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'callChain' @ [268:33] ==> val callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'analyzeAsReplacement' @ [268:43] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'loop' @ [268:64] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'bindingContext' @ [268:70] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'callChain' @ [271:9] ==> val callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'forEachDescendantOfType' @ [271:19] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [272:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [272:44] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>..Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>?)): ExplicitSmartCasts? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExplicitSmartCasts

'SMARTCAST_KEY' @ [272:64] ==> val SMARTCAST_KEY: Key<ExplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'smartCastType' @ [273:17] ==> val smartCastType: ExplicitSmartCasts? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[LocalVariableDescriptor]

'newBindingContext' @ [274:21] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'SMARTCAST' @ [274:54] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [274:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'smartCastType' @ [274:80] ==> val smartCastType: ExplicitSmartCasts? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[LocalVariableDescriptor]

'newBindingContext' @ [274:97] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'getType' @ [274:115] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [274:123] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'smartCastType' @ [274:138] ==> val smartCastType: ExplicitSmartCasts? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[LocalVariableDescriptor]

'preservedSmartCastCount' @ [275:21] ==> var preservedSmartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'expression' @ [279:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'getCopyableUserData' @ [279:60] ==> @Nullable @Contract public abstract fun <T : (Any..Any?)> getCopyableUserData(p0: (Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>..Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>?)): ImplicitSmartCasts? defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ImplicitSmartCasts

'IMPLICIT_RECEIVER_SMARTCAST_KEY' @ [279:80] ==> val IMPLICIT_RECEIVER_SMARTCAST_KEY: Key<ImplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'implicitReceiverSmartCastType' @ [280:17] ==> val implicitReceiverSmartCastType: ImplicitSmartCasts? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[LocalVariableDescriptor]

'newBindingContext' @ [281:21] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'IMPLICIT_RECEIVER_SMARTCAST' @ [281:54] ==> public final val IMPLICIT_RECEIVER_SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ImplicitSmartCasts..ImplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ImplicitSmartCasts..ImplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [281:83] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'implicitReceiverSmartCastType' @ [281:98] ==> val implicitReceiverSmartCastType: ImplicitSmartCasts? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[LocalVariableDescriptor]

'preservedSmartCastCount' @ [282:21] ==> var preservedSmartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'preservedSmartCastCount' @ [287:13] ==> var preservedSmartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'smartCastCount' @ [287:40] ==> var smartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'matchResult' @ [290:26] ==> value-parameter matchResult: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'transformationMatch' @ [290:38] ==> public final val transformationMatch: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'resultTransformation' @ [290:58] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'generateExpressionToReplaceLoopAndCheckErrors' @ [290:79] ==> public abstract fun generateExpressionToReplaceLoopAndCheckErrors(resultCallChain: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[SimpleFunctionDescriptorImpl]

'callChain' @ [290:125] ==> val callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'!' @ [291:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'tryChangeAndCheckErrors' @ [291:14] ==> public fun <TExpression : KtExpression> tryChangeAndCheckErrors(expressionToChange: KtForExpression, scopeToExclude: KtElement? = ..., performChange: (KtForExpression) -> Unit): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain[SimpleFunctionDescriptorImpl]
Inferred types:
    <TExpression : KtExpression> -> KtForExpression

'loop' @ [291:38] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'it' @ [291:46] ==> value-parameter it: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [291:49] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtForExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [291:57] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'smartCastCount' @ [296:13] ==> var smartCastCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'loop' @ [297:13] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [297:18] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'it' @ [298:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [298:20] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>..Key<(ExplicitSmartCasts..ExplicitSmartCasts?)>?), @Nullable p1: ExplicitSmartCasts?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExplicitSmartCasts

'SMARTCAST_KEY' @ [298:40] ==> val SMARTCAST_KEY: Key<ExplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'it' @ [299:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved.<anonymous>[ValueParameterDescriptorImpl]

'putCopyableUserData' @ [299:20] ==> public abstract fun <T : (Any..Any?)> putCopyableUserData(p0: (Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>..Key<(ImplicitSmartCasts..ImplicitSmartCasts?)>?), @Nullable p1: ImplicitSmartCasts?): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ImplicitSmartCasts

'IMPLICIT_RECEIVER_SMARTCAST_KEY' @ [299:40] ==> val IMPLICIT_RECEIVER_SMARTCAST_KEY: Key<ImplicitSmartCasts> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.checkSmartCastsPreserved[LocalVariableDescriptor]

'transformationMatch' @ [306:35] ==> public final val transformationMatch: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'sequenceTransformations' @ [306:55] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'transformationMatch' @ [307:32] ==> public final val transformationMatch: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'resultTransformation' @ [307:52] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'sequenceTransformations' @ [309:20] ==> var sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'lastOrNull' @ [309:44] ==> public fun <T> List<SequenceTransformation>.lastOrNull(): SequenceTransformation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SequenceTransformation

'resultTransformation' @ [310:9] ==> var resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'resultTransformation' @ [310:32] ==> var resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'mergeWithPrevious' @ [310:53] ==> public open fun mergeWithPrevious(previousTransformation: SequenceTransformation): ResultTransformation? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[SimpleFunctionDescriptorImpl]

'last' @ [310:71] ==> val last: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'sequenceTransformations' @ [311:9] ==> var sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'sequenceTransformations' @ [311:35] ==> var sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'dropLast' @ [311:59] ==> public fun <T> List<SequenceTransformation>.dropLast(n: Int): List<SequenceTransformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SequenceTransformation

'sequenceTransformations' @ [314:26] ==> var sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'sumBy' @ [314:50] ==> public inline fun <T> Iterable<SequenceTransformation>.sumBy(selector: (SequenceTransformation) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SequenceTransformation

'it' @ [314:58] ==> value-parameter it: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<anonymous>[ValueParameterDescriptorImpl]

'chainCallCount' @ [314:61] ==> public open val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[PropertyDescriptorImpl]

'resultTransformation' @ [314:80] ==> var resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'chainCallCount' @ [314:101] ==> public open val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[PropertyDescriptorImpl]

'if (chainCallCount > 1) "\n" else ""' @ [315:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'chainCallCount' @ [315:25] ==> val chainCallCount: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'sequenceExpression' @ [317:21] ==> public final val sequenceExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'KtPsiFactory' @ [319:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'loop' @ [319:35] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[ValueParameterDescriptorImpl]

'callChain' @ [322:21] ==> var callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'if (safeCall) "?." else "."' @ [325:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'safeCall' @ [325:27] ==> value-parameter safeCall: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[ValueParameterDescriptorImpl]

'+' @ [326:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'args' @ [326:36] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[ValueParameterDescriptorImpl]

'size' @ [326:41] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lineBreak' @ [326:48] ==> val lineBreak: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'dot' @ [326:60] ==> val dot: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[LocalVariableDescriptor]

'pattern' @ [326:66] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[ValueParameterDescriptorImpl]

'psiFactory' @ [327:20] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'createExpressionByPattern' @ [327:31] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'newPattern' @ [327:57] ==> val newPattern: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[LocalVariableDescriptor]

'args' @ [327:70] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[ValueParameterDescriptorImpl]

'receiver' @ [327:76] ==> value-parameter receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain.<no name provided>.generate[ValueParameterDescriptorImpl]

'sequenceTransformations' @ [331:28] ==> var sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'callChain' @ [332:9] ==> var callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'transformation' @ [332:21] ==> val transformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'generateCode' @ [332:36] ==> public abstract fun generateCode(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.SequenceTransformation[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [332:49] ==> val chainedCallGenerator: <no name provided> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'callChain' @ [335:5] ==> var callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'resultTransformation' @ [335:17] ==> var resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'generateCode' @ [335:38] ==> public abstract fun generateCode(chainedCallGenerator: ChainedCallGenerator): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ResultTransformation[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [335:51] ==> val chainedCallGenerator: <no name provided> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'callChain' @ [336:12] ==> var callChain: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.generateCallChain[LocalVariableDescriptor]

'match' @ [340:28] ==> value-parameter match: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[ValueParameterDescriptorImpl]

'sequenceTransformations' @ [340:34] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'match' @ [340:60] ==> value-parameter match: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[ValueParameterDescriptorImpl]

'resultTransformation' @ [340:66] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'toMutableList' @ [340:88] ==> public fun <T> Collection<Transformation>.toMutableList(): MutableList<Transformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Transformation

'anyChange' @ [344:9] ==> var anyChange: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'..' @ [345:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'transformations' @ [345:26] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'lastIndex' @ [345:42] ==> public val <T> List<Transformation>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Transformation

'transformations' @ [346:34] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'index' @ [346:50] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'transformations' @ [347:24] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'index' @ [347:40] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'next' @ [348:26] ==> val next: Transformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'mergeWithPrevious' @ [348:31] ==> public abstract fun mergeWithPrevious(previousTransformation: SequenceTransformation): Transformation? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.Transformation[SimpleFunctionDescriptorImpl]

'transformation' @ [348:49] ==> val transformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'transformations' @ [349:13] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'index' @ [349:29] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'merged' @ [349:38] ==> val merged: Transformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'transformations' @ [350:13] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'removeAt' @ [350:29] ==> public abstract fun removeAt(index: Int): Transformation defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [350:38] ==> val index: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'anyChange' @ [351:13] ==> var anyChange: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'anyChange' @ [354:13] ==> var anyChange: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'Suppress' @ [356:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Result' @ [357:32] ==> public constructor Result(resultTransformation: ResultTransformation, sequenceTransformations: List<SequenceTransformation>) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformations' @ [357:39] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'last' @ [357:55] ==> public fun <T> List<Transformation>.last(): Transformation defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Transformation

'transformations' @ [357:87] ==> val transformations: MutableList<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.mergeTransformations[LocalVariableDescriptor]

'dropLast' @ [357:103] ==> public fun <T> List<Transformation>.dropLast(n: Int): List<Transformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Transformation

'component1' @ [367:10] ==> public final operator fun component1(): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[SimpleFunctionDescriptorImpl]

'component2' @ [367:25] ==> public final operator fun component2(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopData[SimpleFunctionDescriptorImpl]

'extractLoopData' @ [367:42] ==> private fun extractLoopData(loop: KtForExpression): LoopData? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [367:58] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[ValueParameterDescriptorImpl]

'indexVariable' @ [368:9] ==> val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'createInitialMatchingState' @ [370:17] ==> private fun createInitialMatchingState(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, useLazySequence: Boolean): MatchingState? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'loop' @ [370:44] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[ValueParameterDescriptorImpl]

'inputVariable' @ [370:50] ==> val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'indexVariable' @ [370:65] ==> val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'unwrapBlock' @ [370:106] ==> public fun MatchingState.unwrapBlock(): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'IntroduceIndexMatcher' @ [372:17] ==> public object IntroduceIndexMatcher : TransformationMatcher defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence in file IntroduceIndexMatcher.kt[FakeCallableDescriptorForObject]

'match' @ [372:39] ==> public open fun match(state: MatchingState): TransformationMatch.Sequence? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher[SimpleFunctionDescriptorImpl]

'state' @ [372:45] ==> val state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'assert' @ [373:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'match' @ [373:12] ==> val match: TransformationMatch.Sequence defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'sequenceTransformations' @ [373:18] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[PropertyDescriptorImpl]

'isEmpty' @ [373:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'match' @ [374:20] ==> val match: TransformationMatch.Sequence defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'newState' @ [374:26] ==> public final val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[PropertyDescriptorImpl]

'newState' @ [376:35] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'initializationStatementsToDelete' @ [376:44] ==> public final val initializationStatementsToDelete: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'single' @ [376:77] ==> public fun <T> Iterable<KtExpression>.single(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'newState' @ [377:31] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'incrementExpressions' @ [377:40] ==> public final val incrementExpressions: Collection<KtUnaryExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'single' @ [377:61] ==> public fun <T> Iterable<KtUnaryExpression>.single(): KtUnaryExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtUnaryExpression

'IntroduceIndexData' @ [378:12] ==> public constructor IntroduceIndexData(indexVariable: KtCallableDeclaration, initializationStatement: KtExpression, incrementExpression: KtUnaryExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.IntroduceIndexData[ClassConstructorDescriptorImpl]

'newState' @ [378:31] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'indexVariable' @ [378:40] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'initializationStatement' @ [378:57] ==> val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

'incrementExpression' @ [378:82] ==> val incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.matchIndexToIntroduce[LocalVariableDescriptor]

