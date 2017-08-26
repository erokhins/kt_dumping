'state' @ [44:27] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match[ValueParameterDescriptorImpl]

'statements' @ [44:33] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'statement' @ [45:36] ==> val statement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match[LocalVariableDescriptor]

'collectDescendantsOfType' @ [45:46] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline predicate: (KtUnaryExpression) -> Boolean = ...): List<KtUnaryExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUnaryExpression

'it' @ [46:37] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [46:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match.<anonymous>[ValueParameterDescriptorImpl]

'unaryExpressions' @ [48:37] ==> val unaryExpressions: List<KtUnaryExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match[LocalVariableDescriptor]

'checkIndexCandidate' @ [49:17] ==> private final fun checkIndexCandidate(incrementExpression: KtUnaryExpression, state: MatchingState): TransformationMatch.Sequence? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher[SimpleFunctionDescriptorImpl]

'unaryExpression' @ [49:37] ==> val unaryExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match[LocalVariableDescriptor]

'state' @ [49:54] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match[ValueParameterDescriptorImpl]

'let' @ [49:62] ==> @InlineOnly public inline fun <T, R> TransformationMatch.Sequence.let(block: (TransformationMatch.Sequence) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence
    <R> -> Nothing

'it' @ [49:75] ==> value-parameter it: TransformationMatch.Sequence defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.match.<anonymous>[ValueParameterDescriptorImpl]

'incrementExpression' @ [56:23] ==> value-parameter incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'isPlusPlusOf' @ [56:43] ==> public fun KtExpression.isPlusPlusOf(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'operand' @ [58:38] ==> val operand: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'findVariableInitializationBeforeLoop' @ [58:46] ==> public fun KtExpression?.findVariableInitializationBeforeLoop(loop: KtForExpression, checkNoOtherUsagesInLoop: Boolean): VariableInitialization? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file utils.kt[SimpleFunctionDescriptorImpl]

'state' @ [58:83] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'outerLoop' @ [58:89] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'!=' @ [60:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'variableInitialization' @ [60:14] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'initializer' @ [60:37] ==> public final val initializer: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'text' @ [60:76] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'variableInitialization' @ [62:24] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'variable' @ [62:47] ==> public final val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'variable' @ [64:13] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'countWriteUsages' @ [64:22] ==> public fun KtVariableDeclaration.countWriteUsages(inElement: KtElement): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [64:39] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'outerLoop' @ [64:45] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variable' @ [68:13] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'countUsages' @ [68:22] ==> public fun KtCallableDeclaration.countUsages(): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'variable' @ [68:39] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'countUsages' @ [68:48] ==> public fun KtCallableDeclaration.countUsages(inElements: Collection<KtElement>): Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file commonUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [68:60] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'statements' @ [68:66] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [68:79] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'initializationStatement' @ [68:102] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'state' @ [70:26] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'invoke' @ [70:32] ==> public abstract operator fun invoke(): Pseudocode defined in kotlin.Function0[FunctionInvokeDescriptor]

'state' @ [71:30] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'statements' @ [71:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'first' @ [71:47] ==> public fun <T> List<KtExpression>.first(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'pseudocode' @ [72:32] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'instructionForElement' @ [72:43] ==> public abstract fun instructionForElement(element: KtElement): KtElementInstruction? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'firstStatement' @ [72:65] ==> val firstStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'pseudocode' @ [73:36] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'instructionForElement' @ [73:47] ==> public abstract fun instructionForElement(element: KtElement): KtElementInstruction? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedSimpleFunctionDescriptor]

'incrementExpression' @ [73:69] ==> value-parameter incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAlwaysReachedOrExitedLoop' @ [74:14] ==> private final fun isAlwaysReachedOrExitedLoop(from: Instruction, to: Instruction, outerLoop: KtForExpression, innerLoop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher[SimpleFunctionDescriptorImpl]

'firstInstruction' @ [74:42] ==> val firstInstruction: KtElementInstruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'incrementInstruction' @ [74:60] ==> val incrementInstruction: KtElementInstruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'state' @ [74:82] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'outerLoop' @ [74:88] ==> public final val outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [74:99] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'innerLoop' @ [74:105] ==> public final val innerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variable' @ [76:34] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'resolveToDescriptor' @ [76:43] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'isAccessedAfter' @ [77:13] ==> private final fun isAccessedAfter(variableDescriptor: VariableDescriptor, instruction: Instruction, loop: KtForExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [77:29] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'incrementInstruction' @ [77:49] ==> val incrementInstruction: KtElementInstruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'state' @ [77:71] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'innerLoop' @ [77:77] ==> public final val innerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'state' @ [79:30] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'statements' @ [79:36] ==> public final val statements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'incrementExpression' @ [79:49] ==> value-parameter incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'state' @ [80:24] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'copy' @ [80:30] ==> public final fun copy(outerLoop: KtForExpression = ..., innerLoop: KtForExpression = ..., statements: List<KtExpression> = ..., inputVariable: KtCallableDeclaration = ..., indexVariable: KtCallableDeclaration? = ..., lazySequence: Boolean = ..., pseudocodeProvider: () -> Pseudocode = ..., initializationStatementsToDelete: Collection<KtExpression> = ..., previousTransformations: MutableList<SequenceTransformation> = ..., incrementExpressions: Collection<KtUnaryExpression> = ...): MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[SimpleFunctionDescriptorImpl]

'restStatements' @ [80:48] ==> val restStatements: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'variable' @ [81:51] ==> val variable: KtProperty defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'state' @ [82:70] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'initializationStatementsToDelete' @ [82:76] ==> public final val initializationStatementsToDelete: Collection<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'variableInitialization' @ [82:111] ==> val variableInitialization: VariableInitialization defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'initializationStatement' @ [82:134] ==> public final val initializationStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.VariableInitialization[PropertyDescriptorImpl]

'state' @ [83:58] ==> value-parameter state: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'incrementExpressions' @ [83:64] ==> public final val incrementExpressions: Collection<KtUnaryExpression> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchingState[PropertyDescriptorImpl]

'incrementExpression' @ [83:87] ==> value-parameter incrementExpression: KtUnaryExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[ValueParameterDescriptorImpl]

'Sequence' @ [84:36] ==> public constructor Sequence(transformations: List<SequenceTransformation>, newState: MatchingState) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Sequence[ClassConstructorDescriptorImpl]

'emptyList' @ [84:45] ==> public fun <T> emptyList(): List<SequenceTransformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SequenceTransformation

'newState' @ [84:58] ==> val newState: MatchingState defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.checkIndexCandidate[LocalVariableDescriptor]

'HashSet' @ [93:23] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'traverseFollowingInstructions' @ [94:16] ==> public fun traverseFollowingInstructions(rootInstruction: Instruction, visited: MutableSet<Instruction> = ..., order: TraversalOrder = ..., handler: ((Instruction) -> TraverseInstructionResult)?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'from' @ [94:46] ==> value-parameter from: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[ValueParameterDescriptorImpl]

'visited' @ [94:52] ==> val visited: HashSet<Instruction> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[LocalVariableDescriptor]

'instruction' @ [95:40] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop.<anonymous>[ValueParameterDescriptorImpl]

'blockScope' @ [95:52] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'block' @ [95:63] ==> public final val block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[DeserializedPropertyDescriptor]

'when {
                instruction == to -> TraverseInstructionResult.SKIP
                !outerLoop.isAncestor(nextInstructionScope, strict = false) -> TraverseInstructionResult.SKIP // we are out of the outer loop - it's ok
                !innerLoop.isAncestor(nextInstructionScope, strict = true) -> TraverseInstructionResult.HALT // we exited or continued inner loop
                else -> TraverseInstructionResult.CONTINUE
            }' @ [98:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TraverseInstructionResult, entry1: TraverseInstructionResult, entry2: TraverseInstructionResult, entry3: TraverseInstructionResult): TraverseInstructionResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TraverseInstructionResult

'instruction' @ [99:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [99:32] ==> value-parameter to: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[ValueParameterDescriptorImpl]

'SKIP' @ [99:64] ==> enum entry SKIP defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'!' @ [100:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outerLoop' @ [100:18] ==> value-parameter outerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[ValueParameterDescriptorImpl]

'isAncestor' @ [100:28] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nextInstructionScope' @ [100:39] ==> val nextInstructionScope: KtElement defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop.<anonymous>[LocalVariableDescriptor]

'SKIP' @ [100:106] ==> enum entry SKIP defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'!' @ [101:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'innerLoop' @ [101:18] ==> value-parameter innerLoop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[ValueParameterDescriptorImpl]

'isAncestor' @ [101:28] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nextInstructionScope' @ [101:39] ==> val nextInstructionScope: KtElement defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop.<anonymous>[LocalVariableDescriptor]

'HALT' @ [101:105] ==> enum entry HALT defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'CONTINUE' @ [102:51] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'visited' @ [104:14] ==> val visited: HashSet<Instruction> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[LocalVariableDescriptor]

'contains' @ [104:22] ==> public open fun contains(element: Instruction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'to' @ [104:31] ==> value-parameter to: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAlwaysReachedOrExitedLoop[ValueParameterDescriptorImpl]

'!' @ [108:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'traverseFollowingInstructions' @ [108:17] ==> public fun traverseFollowingInstructions(rootInstruction: Instruction, visited: MutableSet<Instruction> = ..., order: TraversalOrder = ..., handler: ((Instruction) -> TraverseInstructionResult)?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'instruction' @ [108:47] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAccessedAfter[ValueParameterDescriptorImpl]

'when {
                !loop.isAncestor(instruction.blockScope.block, strict = true) -> TraverseInstructionResult.SKIP // we are outside the loop or going to the next iteration
                instruction.isReadOfVariable(variableDescriptor) -> TraverseInstructionResult.HALT
                else -> TraverseInstructionResult.CONTINUE
            }' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TraverseInstructionResult, entry1: TraverseInstructionResult, entry2: TraverseInstructionResult): TraverseInstructionResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TraverseInstructionResult

'!' @ [110:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'loop' @ [110:18] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAccessedAfter[ValueParameterDescriptorImpl]

'isAncestor' @ [110:23] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'instruction' @ [110:34] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAccessedAfter.<anonymous>[ValueParameterDescriptorImpl]

'blockScope' @ [110:46] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'block' @ [110:57] ==> public final val block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[DeserializedPropertyDescriptor]

'SKIP' @ [110:108] ==> enum entry SKIP defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'instruction' @ [111:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAccessedAfter.<anonymous>[ValueParameterDescriptorImpl]

'isReadOfVariable' @ [111:29] ==> private final fun Instruction.isReadOfVariable(descriptor: VariableDescriptor): Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [111:46] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isAccessedAfter[ValueParameterDescriptorImpl]

'HALT' @ [111:95] ==> enum entry HALT defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'CONTINUE' @ [112:51] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'==' @ [118:16] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'this' @ [118:18] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isReadOfVariable[ReceiverParameterDescriptorImpl]

'target' @ [118:50] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[DeserializedPropertyDescriptor]

'resolvedCall' @ [118:81] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [118:95] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'descriptor' @ [118:118] ==> value-parameter descriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.sequence.IntroduceIndexMatcher.isReadOfVariable[ValueParameterDescriptorImpl]

