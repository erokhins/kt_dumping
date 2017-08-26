'ReplaceLoopResultTransformation' @ [35:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [35:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.<init>[ValueParameterDescriptorImpl]

'when (previousTransformation) {
            is FilterTransformation -> {
                FilterToTransformation.create(
                        loop, previousTransformation.inputVariable, previousTransformation.indexVariable,
                        targetCollection, previousTransformation.effectiveCondition, previousTransformation.isFilterNot)
            }

            is FilterNotNullTransformation -> {
                FilterNotNullToTransformation.create(loop, targetCollection)
            }

            is MapTransformation -> {
                MapToTransformation.create(loop, previousTransformation.inputVariable, previousTransformation.indexVariable, targetCollection, previousTransformation.mapping, previousTransformation.mapNotNull)
            }

            is FlatMapTransformation -> {
                FlatMapToTransformation.create(loop, previousTransformation.inputVariable, targetCollection, previousTransformation.transform)
            }

            else -> null
        }' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResultTransformation?, entry1: ResultTransformation?, entry2: ResultTransformation?, entry3: ResultTransformation?, entry4: ResultTransformation?): ResultTransformation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResultTransformation?

'previousTransformation' @ [38:22] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'FilterToTransformation' @ [40:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[FakeCallableDescriptorForObject]

'create' @ [40:40] ==> public final fun create(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, condition: Condition, isFilterNot: Boolean): ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion[SimpleFunctionDescriptorImpl]

'loop' @ [41:25] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [41:31] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'inputVariable' @ [41:54] ==> public open val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [41:69] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'indexVariable' @ [41:92] ==> public open val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformation[PropertyDescriptorImpl]

'targetCollection' @ [42:25] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [42:43] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'effectiveCondition' @ [42:66] ==> public open val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [42:86] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'isFilterNot' @ [42:109] ==> public final val isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FilterTransformation[PropertyDescriptorImpl]

'FilterNotNullToTransformation' @ [46:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation[FakeCallableDescriptorForObject]

'create' @ [46:47] ==> public final fun create(loop: KtForExpression, targetCollection: KtExpression): ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion[SimpleFunctionDescriptorImpl]

'loop' @ [46:54] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'targetCollection' @ [46:60] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'MapToTransformation' @ [50:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[FakeCallableDescriptorForObject]

'create' @ [50:37] ==> public final fun create(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, mapping: KtExpression, mapNotNull: Boolean): ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion[SimpleFunctionDescriptorImpl]

'loop' @ [50:44] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [50:50] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'inputVariable' @ [50:73] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [50:88] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'indexVariable' @ [50:111] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'targetCollection' @ [50:126] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [50:144] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'mapping' @ [50:167] ==> public final val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [50:176] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'mapNotNull' @ [50:199] ==> public final val mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[PropertyDescriptorImpl]

'FlatMapToTransformation' @ [54:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[FakeCallableDescriptorForObject]

'create' @ [54:41] ==> public final fun create(loop: KtForExpression, inputVariable: KtCallableDeclaration, targetCollection: KtExpression, transform: KtExpression): ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion[SimpleFunctionDescriptorImpl]

'loop' @ [54:48] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [54:54] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'inputVariable' @ [54:77] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FlatMapTransformation[PropertyDescriptorImpl]

'targetCollection' @ [54:92] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'previousTransformation' @ [54:110] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'transform' @ [54:133] ==> public final val transform: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.FlatMapTransformation[PropertyDescriptorImpl]

'if (prevTransformationsPresentation != null)
            "+= $prevTransformationsPresentation"
        else
            "+="' @ [65:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'prevTransformationsPresentation' @ [65:20] ==> value-parameter prevTransformationsPresentation: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.buildPresentation[ValueParameterDescriptorImpl]

'prevTransformationsPresentation' @ [66:18] ==> value-parameter prevTransformationsPresentation: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.buildPresentation[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [75:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'loop' @ [75:29] ==> public final val loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'createExpressionByPattern' @ [75:35] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'targetCollection' @ [75:73] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [75:91] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.generateCode[ValueParameterDescriptorImpl]

'receiver' @ [75:112] ==> public abstract val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[PropertyDescriptorImpl]

'state' @ [90:29] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'statements' @ [90:35] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'singleOrNull' @ [90:46] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'statement' @ [92:39] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'qualifiedExpression' @ [93:36] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'receiverExpression' @ [93:56] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'qualifiedExpression' @ [94:34] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'selectorExpression' @ [94:54] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'callExpression' @ [95:17] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'getCallNameExpression' @ [95:32] ==> public fun KtCallElement.getCallNameExpression(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getReferencedName' @ [95:57] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [97:28] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'valueArguments' @ [97:43] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [97:58] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'argument' @ [98:33] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'getArgumentExpression' @ [98:42] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'!' @ [101:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetCollection' @ [101:18] ==> val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'isStableInLoop' @ [101:35] ==> public fun KtExpression.isStableInLoop(loop: KtLoopExpression, checkNoOtherUsagesInLoop: Boolean): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [101:50] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [101:56] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [103:17] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [103:23] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'matchWithCollectionInitializationReplacement' @ [104:17] ==> private final fun matchWithCollectionInitializationReplacement(state: MatchingState, targetCollection: KtExpression, addOperationArgument: KtExpression): TransformationMatch.Result? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher[SimpleFunctionDescriptorImpl]

'state' @ [104:62] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'targetCollection' @ [104:69] ==> val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'argumentValue' @ [104:87] ==> val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'let' @ [105:27] ==> @InlineOnly public inline fun <T, R> TransformationMatch.Result.let(block: (TransformationMatch.Result) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result
    <R> -> Nothing

'it' @ [105:40] ==> value-parameter it: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match.<anonymous>[ValueParameterDescriptorImpl]

'if (state.indexVariable == null && argumentValue.isVariableReference(state.inputVariable)) {
                TransformationMatch.Result(AddToCollectionTransformation(state.outerLoop, targetCollection))
            }
            else {
                //TODO: recognize "?: continue" in the argument
                TransformationMatch.Result(MapToTransformation.create(
                        state.outerLoop, state.inputVariable, state.indexVariable, targetCollection, argumentValue, mapNotNull = false))
            }' @ [108:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransformationMatch.Result?, elseBranch: TransformationMatch.Result?): TransformationMatch.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result?

'state' @ [108:24] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [108:30] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'argumentValue' @ [108:55] ==> val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'isVariableReference' @ [108:69] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [108:89] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [108:95] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'Result' @ [109:37] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'AddToCollectionTransformation' @ [109:44] ==> public constructor AddToCollectionTransformation(loop: KtForExpression, targetCollection: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation[ClassConstructorDescriptorImpl]

'state' @ [109:74] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [109:80] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'targetCollection' @ [109:91] ==> val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'Result' @ [113:37] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'MapToTransformation' @ [113:44] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[FakeCallableDescriptorForObject]

'create' @ [113:64] ==> public final fun create(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, mapping: KtExpression, mapNotNull: Boolean): ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion[SimpleFunctionDescriptorImpl]

'state' @ [114:25] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'outerLoop' @ [114:31] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [114:42] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'inputVariable' @ [114:48] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [114:63] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[ValueParameterDescriptorImpl]

'indexVariable' @ [114:69] ==> public final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'targetCollection' @ [114:84] ==> val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'argumentValue' @ [114:102] ==> val argumentValue: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.match[LocalVariableDescriptor]

'targetCollection' @ [123:44] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'findVariableInitializationBeforeLoop' @ [123:61] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [123:98] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [123:104] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [124:34] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'initializer' @ [124:59] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'isSimpleCollectionInstantiation' @ [124:71] ==> public fun KtExpression.isSimpleCollectionInstantiation(): CollectionKind? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'addOperationArgument' @ [125:43] ==> value-parameter addOperationArgument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'isVariableReference' @ [125:64] ==> public fun KtExpression?.isVariableReference(variable: KtCallableDeclaration): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [125:84] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'inputVariable' @ [125:90] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'when (collectionKind) {
                CollectionKind.LIST -> {
                    when {
                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.list, state.outerLoop) -> {
                            return if (argumentIsInputVariable) {
                                val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, state.lazySequence)
                                TransformationMatch.Result(assignToList)
                            }
                            else {
                                val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, addOperationArgument, mapNotNull = false)
                                if (state.lazySequence) {
                                    val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, lazySequence = true)
                                    TransformationMatch.Result(assignToList, mapTransformation)
                                }
                                else {
                                    val assignSequence = AssignSequenceResultTransformation(mapTransformation, collectionInitialization)
                                    TransformationMatch.Result(assignSequence)
                                }
                            }
                        }

                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.mutableList, state.outerLoop) -> {
                            if (argumentIsInputVariable) {
                                val transformation = AssignToMutableListTransformation(state.outerLoop, collectionInitialization)
                                return TransformationMatch.Result(transformation)
                            }
                        }
                    }
                }

                CollectionKind.SET -> {
                    val assignToSetTransformation = when {
                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.set, state.outerLoop) -> {
                            AssignToSetTransformation(state.outerLoop, collectionInitialization)
                        }

                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.mutableSet, state.outerLoop) -> {
                            AssignToMutableSetTransformation(state.outerLoop, collectionInitialization)
                        }

                        else -> return null
                    }

                    return if (argumentIsInputVariable) {
                        TransformationMatch.Result(assignToSetTransformation)
                    }
                    else {
                        val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, addOperationArgument, mapNotNull = false)
                        TransformationMatch.Result(assignToSetTransformation, mapTransformation)
                    }
                }
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'collectionKind' @ [126:19] ==> val collectionKind: CollectionKind defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'LIST' @ [127:32] ==> enum entry LIST defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CollectionKind[FakeCallableDescriptorForObject]

'when {
                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.list, state.outerLoop) -> {
                            return if (argumentIsInputVariable) {
                                val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, state.lazySequence)
                                TransformationMatch.Result(assignToList)
                            }
                            else {
                                val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, addOperationArgument, mapNotNull = false)
                                if (state.lazySequence) {
                                    val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, lazySequence = true)
                                    TransformationMatch.Result(assignToList, mapTransformation)
                                }
                                else {
                                    val assignSequence = AssignSequenceResultTransformation(mapTransformation, collectionInitialization)
                                    TransformationMatch.Result(assignSequence)
                                }
                            }
                        }

                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.mutableList, state.outerLoop) -> {
                            if (argumentIsInputVariable) {
                                val transformation = AssignToMutableListTransformation(state.outerLoop, collectionInitialization)
                                return TransformationMatch.Result(transformation)
                            }
                        }
                    }' @ [128:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'canChangeInitializerType' @ [129:25] ==> private final fun canChangeInitializerType(initialization: VariableInitialization, newTypeFqName: FqName, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher[SimpleFunctionDescriptorImpl]

'collectionInitialization' @ [129:50] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'FQ_NAMES' @ [129:91] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'list' @ [129:100] ==> public final val list: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'state' @ [129:106] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [129:112] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'if (argumentIsInputVariable) {
                                val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, state.lazySequence)
                                TransformationMatch.Result(assignToList)
                            }
                            else {
                                val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, addOperationArgument, mapNotNull = false)
                                if (state.lazySequence) {
                                    val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, lazySequence = true)
                                    TransformationMatch.Result(assignToList, mapTransformation)
                                }
                                else {
                                    val assignSequence = AssignSequenceResultTransformation(mapTransformation, collectionInitialization)
                                    TransformationMatch.Result(assignSequence)
                                }
                            }' @ [130:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransformationMatch.Result?, elseBranch: TransformationMatch.Result?): TransformationMatch.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result?

'argumentIsInputVariable' @ [130:40] ==> val argumentIsInputVariable: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'AssignToListTransformation' @ [131:52] ==> public constructor AssignToListTransformation(loop: KtForExpression, initialization: VariableInitialization, lazySequence: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation[ClassConstructorDescriptorImpl]

'state' @ [131:79] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [131:85] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [131:96] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'state' @ [131:122] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'lazySequence' @ [131:128] ==> public final val lazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'Result' @ [132:53] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'assignToList' @ [132:60] ==> val assignToList: AssignToListTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'MapTransformation' @ [135:57] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [135:75] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [135:81] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [135:92] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'inputVariable' @ [135:98] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'addOperationArgument' @ [135:119] ==> value-parameter addOperationArgument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'if (state.lazySequence) {
                                    val assignToList = AssignToListTransformation(state.outerLoop, collectionInitialization, lazySequence = true)
                                    TransformationMatch.Result(assignToList, mapTransformation)
                                }
                                else {
                                    val assignSequence = AssignSequenceResultTransformation(mapTransformation, collectionInitialization)
                                    TransformationMatch.Result(assignSequence)
                                }' @ [136:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransformationMatch.Result, elseBranch: TransformationMatch.Result): TransformationMatch.Result[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result

'state' @ [136:37] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'lazySequence' @ [136:43] ==> public final val lazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'AssignToListTransformation' @ [137:56] ==> public constructor AssignToListTransformation(loop: KtForExpression, initialization: VariableInitialization, lazySequence: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation[ClassConstructorDescriptorImpl]

'state' @ [137:83] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [137:89] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [137:100] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'Result' @ [138:57] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'assignToList' @ [138:64] ==> val assignToList: AssignToListTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'mapTransformation' @ [138:78] ==> val mapTransformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'AssignSequenceResultTransformation' @ [141:58] ==> public constructor AssignSequenceResultTransformation(sequenceTransformation: SequenceTransformation, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation[ClassConstructorDescriptorImpl]

'mapTransformation' @ [141:93] ==> val mapTransformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'collectionInitialization' @ [141:112] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'Result' @ [142:57] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'assignSequence' @ [142:64] ==> val assignSequence: AssignSequenceResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'canChangeInitializerType' @ [147:25] ==> private final fun canChangeInitializerType(initialization: VariableInitialization, newTypeFqName: FqName, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher[SimpleFunctionDescriptorImpl]

'collectionInitialization' @ [147:50] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'FQ_NAMES' @ [147:91] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableList' @ [147:100] ==> public final val mutableList: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'state' @ [147:113] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [147:119] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'argumentIsInputVariable' @ [148:33] ==> val argumentIsInputVariable: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'AssignToMutableListTransformation' @ [149:54] ==> public constructor AssignToMutableListTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableListTransformation[ClassConstructorDescriptorImpl]

'state' @ [149:88] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [149:94] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [149:105] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'Result' @ [150:60] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'transformation' @ [150:67] ==> val transformation: AssignToMutableListTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'SET' @ [156:32] ==> enum entry SET defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.CollectionKind[FakeCallableDescriptorForObject]

'when {
                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.set, state.outerLoop) -> {
                            AssignToSetTransformation(state.outerLoop, collectionInitialization)
                        }

                        canChangeInitializerType(collectionInitialization, KotlinBuiltIns.FQ_NAMES.mutableSet, state.outerLoop) -> {
                            AssignToMutableSetTransformation(state.outerLoop, collectionInitialization)
                        }

                        else -> return null
                    }' @ [157:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AssignToVariableResultTransformation, entry1: AssignToVariableResultTransformation, entry2: AssignToVariableResultTransformation): AssignToVariableResultTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AssignToVariableResultTransformation

'canChangeInitializerType' @ [158:25] ==> private final fun canChangeInitializerType(initialization: VariableInitialization, newTypeFqName: FqName, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher[SimpleFunctionDescriptorImpl]

'collectionInitialization' @ [158:50] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'FQ_NAMES' @ [158:91] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'set' @ [158:100] ==> public final val set: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'state' @ [158:105] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [158:111] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'AssignToSetTransformation' @ [159:29] ==> public constructor AssignToSetTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToSetTransformation[ClassConstructorDescriptorImpl]

'state' @ [159:55] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [159:61] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [159:72] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'canChangeInitializerType' @ [162:25] ==> private final fun canChangeInitializerType(initialization: VariableInitialization, newTypeFqName: FqName, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher[SimpleFunctionDescriptorImpl]

'collectionInitialization' @ [162:50] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'FQ_NAMES' @ [162:91] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'mutableSet' @ [162:100] ==> public final val mutableSet: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'state' @ [162:112] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [162:118] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'AssignToMutableSetTransformation' @ [163:29] ==> public constructor AssignToMutableSetTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableSetTransformation[ClassConstructorDescriptorImpl]

'state' @ [163:62] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [163:68] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'collectionInitialization' @ [163:79] ==> val collectionInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'if (argumentIsInputVariable) {
                        TransformationMatch.Result(assignToSetTransformation)
                    }
                    else {
                        val mapTransformation = MapTransformation(state.outerLoop, state.inputVariable, null, addOperationArgument, mapNotNull = false)
                        TransformationMatch.Result(assignToSetTransformation, mapTransformation)
                    }' @ [169:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransformationMatch.Result?, elseBranch: TransformationMatch.Result?): TransformationMatch.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result?

'argumentIsInputVariable' @ [169:32] ==> val argumentIsInputVariable: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'Result' @ [170:45] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'assignToSetTransformation' @ [170:52] ==> val assignToSetTransformation: AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'MapTransformation' @ [173:49] ==> public constructor MapTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.MapTransformation[ClassConstructorDescriptorImpl]

'state' @ [173:67] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'outerLoop' @ [173:73] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [173:84] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'inputVariable' @ [173:90] ==> public final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'addOperationArgument' @ [173:111] ==> value-parameter addOperationArgument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[ValueParameterDescriptorImpl]

'Result' @ [174:45] ==> public constructor Result(resultTransformation: ResultTransformation, vararg sequenceTransformations: SequenceTransformation) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[ClassConstructorDescriptorImpl]

'assignToSetTransformation' @ [174:52] ==> val assignToSetTransformation: AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'mapTransformation' @ [174:79] ==> val mapTransformation: MapTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.matchWithCollectionInitializationReplacement[LocalVariableDescriptor]

'initialization' @ [183:32] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'variable' @ [183:47] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'resolveToDescriptor' @ [183:56] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'type' @ [183:101] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'==' @ [184:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'currentType' @ [184:18] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[LocalVariableDescriptor]

'constructor' @ [184:30] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [184:42] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'importableFqName' @ [184:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'newTypeFqName' @ [184:106] ==> value-parameter newTypeFqName: FqName defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'initialization' @ [187:17] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'variable' @ [187:32] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'typeReference' @ [187:41] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'initialization' @ [189:17] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'initializationStatement' @ [189:32] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'initialization' @ [189:59] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'variable' @ [189:74] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'newTypeFqName' @ [191:31] ==> value-parameter newTypeFqName: FqName defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'render' @ [191:45] ==> public fun FqName.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [191:56] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [191:79] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderTypeArguments' @ [191:91] ==> public abstract fun renderTypeArguments(typeArguments: List<TypeProjection>): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'currentType' @ [191:111] ==> val currentType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[LocalVariableDescriptor]

'arguments' @ [191:123] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'canChangeLocalVariableType' @ [192:20] ==> public fun canChangeLocalVariableType(variable: KtProperty, newTypeText: String, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'initialization' @ [192:47] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'variable' @ [192:62] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'newTypeText' @ [192:72] ==> val newTypeText: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[LocalVariableDescriptor]

'loop' @ [192:85] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AddToCollectionTransformation.Matcher.canChangeInitializerType[ValueParameterDescriptorImpl]

'ReplaceLoopResultTransformation' @ [204:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [204:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.<init>[ValueParameterDescriptorImpl]

'isFilterNot' @ [207:13] ==> private final val isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'assert' @ [208:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'indexVariable' @ [208:20] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'when {
        indexVariable != null -> "filterIndexedTo"
        isFilterNot -> "filterNotTo"
        else -> "filterTo"
    }' @ [212:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'indexVariable' @ [213:9] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'isFilterNot' @ [214:9] ==> private final val isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'functionName' @ [219:19] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'if (indexVariable != null)
            generateLambda(inputVariable, indexVariable, effectiveCondition.asExpression())
        else
            generateLambda(inputVariable, if (isFilterNot) effectiveCondition.asNegatedExpression() else effectiveCondition.asExpression())' @ [222:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLambdaExpression, elseBranch: KtLambdaExpression): KtLambdaExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLambdaExpression

'indexVariable' @ [222:26] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'generateLambda' @ [223:13] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [223:28] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'indexVariable' @ [223:43] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'effectiveCondition' @ [223:58] ==> private final val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'asExpression' @ [223:77] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'generateLambda' @ [225:13] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [225:28] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'if (isFilterNot) effectiveCondition.asNegatedExpression() else effectiveCondition.asExpression()' @ [225:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'isFilterNot' @ [225:47] ==> private final val isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'effectiveCondition' @ [225:60] ==> private final val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'asNegatedExpression' @ [225:79] ==> public abstract fun asNegatedExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'effectiveCondition' @ [225:106] ==> private final val effectiveCondition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'asExpression' @ [225:125] ==> public abstract fun asExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.Condition[SimpleFunctionDescriptorImpl]

'chainedCallGenerator' @ [226:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [226:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'functionName' @ [226:48] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'targetCollection' @ [226:75] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[PropertyDescriptorImpl]

'lambda' @ [226:93] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.generateCode[LocalVariableDescriptor]

'targetCollection' @ [238:34] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'findVariableInitializationBeforeLoop' @ [238:51] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [238:88] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'if (initialization != null && initialization.initializer.hasNoSideEffect()) {
                val transformation = FilterToTransformation(loop, inputVariable, indexVariable, initialization.initializer, condition, isFilterNot)
                AssignToVariableResultTransformation.createDelegated(transformation, initialization)
            }
            else {
                FilterToTransformation(loop, inputVariable, indexVariable, targetCollection, condition, isFilterNot)
            }' @ [239:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResultTransformation, elseBranch: ResultTransformation): ResultTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResultTransformation

'initialization' @ [239:24] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [239:50] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [239:65] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'hasNoSideEffect' @ [239:77] ==> public fun KtExpression.hasNoSideEffect(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'FilterToTransformation' @ [240:38] ==> private constructor FilterToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, effectiveCondition: Condition, isFilterNot: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [240:61] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [240:67] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'indexVariable' @ [240:82] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'initialization' @ [240:97] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [240:112] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'condition' @ [240:125] ==> value-parameter condition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'isFilterNot' @ [240:136] ==> value-parameter isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'AssignToVariableResultTransformation' @ [241:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[FakeCallableDescriptorForObject]

'createDelegated' @ [241:54] ==> public final fun createDelegated(delegate: ResultTransformation, initialization: VariableInitialization): AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion[SimpleFunctionDescriptorImpl]

'transformation' @ [241:70] ==> val transformation: FilterToTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [241:86] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[LocalVariableDescriptor]

'FilterToTransformation' @ [244:17] ==> private constructor FilterToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, effectiveCondition: Condition, isFilterNot: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [244:40] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [244:46] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'indexVariable' @ [244:61] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'targetCollection' @ [244:76] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'condition' @ [244:94] ==> value-parameter condition: Condition defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'isFilterNot' @ [244:105] ==> value-parameter isFilterNot: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterToTransformation.Companion.create[ValueParameterDescriptorImpl]

'ReplaceLoopResultTransformation' @ [253:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [253:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.<init>[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [259:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [259:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'targetCollection' @ [259:69] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation[PropertyDescriptorImpl]

'targetCollection' @ [267:34] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[ValueParameterDescriptorImpl]

'findVariableInitializationBeforeLoop' @ [267:51] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [267:88] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[ValueParameterDescriptorImpl]

'if (initialization != null && initialization.initializer.hasNoSideEffect()) {
                val transformation = FilterNotNullToTransformation(loop, initialization.initializer)
                AssignToVariableResultTransformation.createDelegated(transformation, initialization)
            }
            else {
                FilterNotNullToTransformation(loop, targetCollection)
            }' @ [268:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResultTransformation, elseBranch: ResultTransformation): ResultTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResultTransformation

'initialization' @ [268:24] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [268:50] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [268:65] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'hasNoSideEffect' @ [268:77] ==> public fun KtExpression.hasNoSideEffect(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'FilterNotNullToTransformation' @ [269:38] ==> private constructor FilterNotNullToTransformation(loop: KtForExpression, targetCollection: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [269:68] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[ValueParameterDescriptorImpl]

'initialization' @ [269:74] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [269:89] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'AssignToVariableResultTransformation' @ [270:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[FakeCallableDescriptorForObject]

'createDelegated' @ [270:54] ==> public final fun createDelegated(delegate: ResultTransformation, initialization: VariableInitialization): AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion[SimpleFunctionDescriptorImpl]

'transformation' @ [270:70] ==> val transformation: FilterNotNullToTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [270:86] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[LocalVariableDescriptor]

'FilterNotNullToTransformation' @ [273:17] ==> private constructor FilterNotNullToTransformation(loop: KtForExpression, targetCollection: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [273:47] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[ValueParameterDescriptorImpl]

'targetCollection' @ [273:53] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FilterNotNullToTransformation.Companion.create[ValueParameterDescriptorImpl]

'ReplaceLoopResultTransformation' @ [286:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [286:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.<init>[ValueParameterDescriptorImpl]

'if (indexVariable != null)
        if (mapNotNull) "mapIndexedNotNullTo" else "mapIndexedTo"
    else
        if (mapNotNull) "mapNotNullTo" else "mapTo"' @ [288:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'indexVariable' @ [288:36] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'if (mapNotNull) "mapIndexedNotNullTo" else "mapIndexedTo"' @ [289:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'mapNotNull' @ [289:13] ==> value-parameter mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.<init>[ValueParameterDescriptorImpl]

'if (mapNotNull) "mapNotNullTo" else "mapTo"' @ [291:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'mapNotNull' @ [291:13] ==> value-parameter mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.<init>[ValueParameterDescriptorImpl]

'functionName' @ [294:19] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'generateLambda' @ [297:22] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [297:37] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'indexVariable' @ [297:52] ==> private final val indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'mapping' @ [297:67] ==> private final val mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [298:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [298:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'functionName' @ [298:48] ==> private final val functionName: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'targetCollection' @ [298:75] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[PropertyDescriptorImpl]

'lambda' @ [298:93] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.generateCode[LocalVariableDescriptor]

'targetCollection' @ [310:34] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'findVariableInitializationBeforeLoop' @ [310:51] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [310:88] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'if (initialization != null && initialization.initializer.hasNoSideEffect()) {
                val transformation = MapToTransformation(loop, inputVariable, indexVariable, initialization.initializer, mapping, mapNotNull)
                AssignToVariableResultTransformation.createDelegated(transformation, initialization)
            }
            else {
                MapToTransformation(loop, inputVariable, indexVariable, targetCollection, mapping, mapNotNull)
            }' @ [311:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResultTransformation, elseBranch: ResultTransformation): ResultTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResultTransformation

'initialization' @ [311:24] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [311:50] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [311:65] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'hasNoSideEffect' @ [311:77] ==> public fun KtExpression.hasNoSideEffect(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'MapToTransformation' @ [312:38] ==> private constructor MapToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [312:58] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [312:64] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'indexVariable' @ [312:79] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'initialization' @ [312:94] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [312:109] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'mapping' @ [312:122] ==> value-parameter mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'mapNotNull' @ [312:131] ==> value-parameter mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'AssignToVariableResultTransformation' @ [313:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[FakeCallableDescriptorForObject]

'createDelegated' @ [313:54] ==> public final fun createDelegated(delegate: ResultTransformation, initialization: VariableInitialization): AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion[SimpleFunctionDescriptorImpl]

'transformation' @ [313:70] ==> val transformation: MapToTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [313:86] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[LocalVariableDescriptor]

'MapToTransformation' @ [316:17] ==> private constructor MapToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, indexVariable: KtCallableDeclaration?, targetCollection: KtExpression, mapping: KtExpression, mapNotNull: Boolean) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [316:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [316:43] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'indexVariable' @ [316:58] ==> value-parameter indexVariable: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'targetCollection' @ [316:73] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'mapping' @ [316:91] ==> value-parameter mapping: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'mapNotNull' @ [316:100] ==> value-parameter mapNotNull: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.MapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'ReplaceLoopResultTransformation' @ [327:5] ==> public constructor ReplaceLoopResultTransformation(loop: KtForExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ReplaceLoopResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [327:37] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.<init>[ValueParameterDescriptorImpl]

'generateLambda' @ [333:22] ==> public fun generateLambda(inputVariable: KtCallableDeclaration, expression: KtExpression): KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'inputVariable' @ [333:37] ==> private final val inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[PropertyDescriptorImpl]

'transform' @ [333:52] ==> private final val transform: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [334:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [334:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'targetCollection' @ [334:71] ==> private final val targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[PropertyDescriptorImpl]

'lambda' @ [334:89] ==> val lambda: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.generateCode[LocalVariableDescriptor]

'targetCollection' @ [349:34] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'findVariableInitializationBeforeLoop' @ [349:51] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'loop' @ [349:88] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'if (initialization != null && initialization.initializer.hasNoSideEffect()) {
                val transformation = FlatMapToTransformation(loop, inputVariable, initialization.initializer, transform)
                AssignToVariableResultTransformation.createDelegated(transformation, initialization)
            }
            else {
                FlatMapToTransformation(loop, inputVariable, targetCollection, transform)
            }' @ [350:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResultTransformation, elseBranch: ResultTransformation): ResultTransformation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResultTransformation

'initialization' @ [350:24] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [350:50] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [350:65] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'hasNoSideEffect' @ [350:77] ==> public fun KtExpression.hasNoSideEffect(): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'FlatMapToTransformation' @ [351:38] ==> private constructor FlatMapToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, targetCollection: KtExpression, transform: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [351:62] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [351:68] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'initialization' @ [351:83] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[LocalVariableDescriptor]

'initializer' @ [351:98] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'transform' @ [351:111] ==> value-parameter transform: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'AssignToVariableResultTransformation' @ [352:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[FakeCallableDescriptorForObject]

'createDelegated' @ [352:54] ==> public final fun createDelegated(delegate: ResultTransformation, initialization: VariableInitialization): AssignToVariableResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation.Companion[SimpleFunctionDescriptorImpl]

'transformation' @ [352:70] ==> val transformation: FlatMapToTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[LocalVariableDescriptor]

'initialization' @ [352:86] ==> val initialization: VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[LocalVariableDescriptor]

'FlatMapToTransformation' @ [355:17] ==> private constructor FlatMapToTransformation(loop: KtForExpression, inputVariable: KtCallableDeclaration, targetCollection: KtExpression, transform: KtExpression) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation[ClassConstructorDescriptorImpl]

'loop' @ [355:41] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'inputVariable' @ [355:47] ==> value-parameter inputVariable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'targetCollection' @ [355:62] ==> value-parameter targetCollection: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'transform' @ [355:80] ==> value-parameter transform: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.FlatMapToTransformation.Companion.create[ValueParameterDescriptorImpl]

'AssignToVariableResultTransformation' @ [365:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [365:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [365:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation.<init>[ValueParameterDescriptorImpl]

'lazySequence' @ [371:13] ==> private final val lazySequence: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation[PropertyDescriptorImpl]

'AssignSequenceResultTransformation' @ [373:16] ==> public constructor AssignSequenceResultTransformation(sequenceTransformation: SequenceTransformation, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignSequenceResultTransformation[ClassConstructorDescriptorImpl]

'previousTransformation' @ [373:51] ==> value-parameter previousTransformation: SequenceTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation.mergeWithPrevious[ValueParameterDescriptorImpl]

'initialization' @ [373:75] ==> protected final val initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation[PropertyDescriptorImpl]

'chainedCallGenerator' @ [377:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToListTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [377:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'AssignToVariableResultTransformation' @ [384:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [384:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableListTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [384:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableListTransformation.<init>[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [390:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableListTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [390:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'AssignToVariableResultTransformation' @ [397:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [397:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToSetTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [397:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToSetTransformation.<init>[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [403:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToSetTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [403:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

'AssignToVariableResultTransformation' @ [410:5] ==> public constructor AssignToVariableResultTransformation(loop: KtForExpression, initialization: VariableInitialization) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AssignToVariableResultTransformation[ClassConstructorDescriptorImpl]

'loop' @ [410:42] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableSetTransformation.<init>[ValueParameterDescriptorImpl]

'initialization' @ [410:48] ==> value-parameter initialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableSetTransformation.<init>[ValueParameterDescriptorImpl]

'chainedCallGenerator' @ [416:16] ==> value-parameter chainedCallGenerator: ChainedCallGenerator defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.result.AssignToMutableSetTransformation.generateCode[ValueParameterDescriptorImpl]

'generate' @ [416:37] ==> public abstract fun generate(pattern: String, vararg args: Any, receiver: KtExpression = ..., safeCall: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.ChainedCallGenerator[SimpleFunctionDescriptorImpl]

