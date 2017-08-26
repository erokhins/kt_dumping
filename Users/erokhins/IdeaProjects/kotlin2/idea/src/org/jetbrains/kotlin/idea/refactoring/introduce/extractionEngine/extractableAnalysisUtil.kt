'unitType' @ [75:67] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'nullableAnyType' @ [76:70] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [79:9] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [79:32] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'render' @ [79:65] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [79:72] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.renderForMessage[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [81:29] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [81:48] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [81:66] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'typeNormalizer' @ [82:5] ==> public abstract var typeNormalizer: (KotlinType) -> KotlinType defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [82:22] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'APPROXIMATE_FLEXIBLE_TYPES' @ [82:45] ==> @field:JvmField public final val APPROXIMATE_FLEXIBLE_TYPES: (KotlinType) -> KotlinType defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'TYPE_RENDERER' @ [85:53] ==> private val TYPE_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

'renderType' @ [85:67] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [85:78] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.renderForMessage[ReceiverParameterDescriptorImpl]

'bindingContext' @ [88:5] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.renderForMessage[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [88:35] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [88:62] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.renderForMessage[ReceiverParameterDescriptorImpl]

'renderForMessage' @ [88:69] ==> private fun DeclarationDescriptor.renderForMessage(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'isUnit' @ [90:63] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [90:70] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isDefault[ReceiverParameterDescriptorImpl]

'HashMap' @ [93:18] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VariableDescriptor
    <V : (Any..Any?)> -> MutableList<KtExpression>

'filterIsInstance' @ [94:25] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<WriteValueInstruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> WriteValueInstruction

'instruction' @ [95:26] ==> val instruction: WriteValueInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'element' @ [95:38] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[DeserializedPropertyDescriptor]

'extractVariableDescriptorIfAny' @ [96:41] ==> @Nullable public open fun extractVariableDescriptorIfAny(@NotNull p0: Instruction, @NotNull p1: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [96:72] ==> val instruction: WriteValueInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'bindingContext' @ [96:85] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[ValueParameterDescriptorImpl]

'expression' @ [97:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'descriptor' @ [97:35] ==> val descriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'result' @ [98:13] ==> val result: HashMap<VariableDescriptor, MutableList<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'getOrPut' @ [98:20] ==> public inline fun <K, V> MutableMap<VariableDescriptor, MutableList<KtExpression>>.getOrPut(key: VariableDescriptor, defaultValue: () -> MutableList<KtExpression>): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> MutableList<KtExpression>

'descriptor' @ [98:29] ==> val descriptor: VariableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'ArrayList' @ [98:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'add' @ [98:57] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'expression' @ [98:61] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'result' @ [102:12] ==> val result: HashMap<VariableDescriptor, MutableList<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getModifiedVarDescriptors[LocalVariableDescriptor]

'HashSet' @ [106:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VariableDescriptor

'HashSet' @ [107:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'traverseFollowingInstructions' @ [110:9] ==> public fun traverseFollowingInstructions(rootInstruction: Instruction, visited: MutableSet<Instruction> = ..., order: TraversalOrder = ..., handler: ((Instruction) -> TraverseInstructionResult)?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'instruction' @ [110:39] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal[ValueParameterDescriptorImpl]

'visitedInstructions' @ [110:52] ==> val visitedInstructions: HashSet<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[LocalVariableDescriptor]

'when {
                it is AccessValueInstruction && it !in this ->
                    PseudocodeUtil.extractVariableDescriptorIfAny(it, bindingContext)?.let { accessedAfterwards.add(it) }

                it is LocalFunctionDeclarationInstruction ->
                    doTraversal(it.body.enterInstruction)
            }' @ [111:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'it' @ [112:17] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [112:49] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [112:56] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[ReceiverParameterDescriptorImpl]

'extractVariableDescriptorIfAny' @ [113:36] ==> @Nullable public open fun extractVariableDescriptorIfAny(@NotNull p0: Instruction, @NotNull p1: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'it' @ [113:67] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [113:71] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[ValueParameterDescriptorImpl]

'let' @ [113:88] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Boolean

'accessedAfterwards' @ [113:94] ==> val accessedAfterwards: HashSet<VariableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[LocalVariableDescriptor]

'add' @ [113:113] ==> public open fun add(element: VariableDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [113:117] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [115:17] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>[ValueParameterDescriptorImpl]

'doTraversal' @ [116:21] ==> local final fun doTraversal(instruction: Instruction): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[SimpleFunctionDescriptorImpl]

'it' @ [116:33] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards.doTraversal.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [116:36] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[DeserializedPropertyDescriptor]

'enterInstruction' @ [116:41] ==> public abstract val enterInstruction: SubroutineEnterInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedPropertyDescriptor]

'CONTINUE' @ [119:39] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'forEach' @ [123:5] ==> @HidesMembers public inline fun <T> Iterable<Instruction>.forEach(action: (Instruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'doTraversal' @ [123:15] ==> local final fun doTraversal(instruction: Instruction): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[SimpleFunctionDescriptorImpl]

'accessedAfterwards' @ [124:12] ==> val accessedAfterwards: HashSet<VariableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getVarDescriptorsAccessedAfterwards[LocalVariableDescriptor]

'filter' @ [128:9] ==> public inline fun <T> Iterable<Instruction>.filter(predicate: (Instruction) -> Boolean): List<Instruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'localInstruction' @ [128:38] ==> value-parameter localInstruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getExitPoints.<anonymous>[ValueParameterDescriptorImpl]

'nextInstructions' @ [128:55] ==> public abstract val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'any' @ [128:72] ==> public inline fun <T> Iterable<Instruction>.any(predicate: (Instruction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'it' @ [128:78] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getExitPoints.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [128:85] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getExitPoints[ReceiverParameterDescriptorImpl]

'when (instruction) {
            is ReturnValueInstruction ->
                (if (unwrapReturn) null else instruction.returnExpressionIfAny) ?: instruction.returnedValue.element as? KtExpression
            is InstructionWithValue ->
                instruction.outputValue?.element as? KtExpression
            else -> null
        }' @ [137:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'instruction' @ [137:22] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToExpression[ValueParameterDescriptorImpl]

'?:' @ [139:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression?

'if (unwrapReturn) null else instruction.returnExpressionIfAny' @ [139:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtReturnExpression?, elseBranch: KtReturnExpression?): KtReturnExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtReturnExpression?

'unwrapReturn' @ [139:22] ==> value-parameter unwrapReturn: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToExpression[ValueParameterDescriptorImpl]

'instruction' @ [139:46] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToExpression[ValueParameterDescriptorImpl]

'returnExpressionIfAny' @ [139:58] ==> public final val returnExpressionIfAny: KtReturnExpression? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'instruction' @ [139:84] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToExpression[ValueParameterDescriptorImpl]

'returnedValue' @ [139:96] ==> public final val returnedValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'element' @ [139:110] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'instruction' @ [141:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToExpression[ValueParameterDescriptorImpl]

'outputValue' @ [141:29] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[DeserializedPropertyDescriptor]

'element' @ [141:42] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[DeserializedPropertyDescriptor]

'instructionToExpression' @ [147:26] ==> local final fun instructionToExpression(instruction: Instruction, unwrapReturn: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[SimpleFunctionDescriptorImpl]

'instruction' @ [147:50] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType[ValueParameterDescriptorImpl]

'substringInfo' @ [149:9] ==> public final val substringInfo: ExtractableSubstringInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'let' @ [149:24] ==> @InlineOnly public inline fun <T, R> ExtractableSubstringInfo.let(block: (ExtractableSubstringInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractableSubstringInfo
    <R> -> Unit

'it' @ [150:17] ==> value-parameter it: ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [150:20] ==> public final val template: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'expression' @ [150:32] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType[LocalVariableDescriptor]

'it' @ [150:51] ==> value-parameter it: ExtractableSubstringInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [150:54] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.ExtractableSubstringInfo[DeserializedPropertyDescriptor]

'options' @ [153:13] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'inferUnitTypeForUnusedValues' @ [153:21] ==> public final val inferUnitTypeForUnusedValues: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'expression' @ [153:53] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType[LocalVariableDescriptor]

'isUsedAsStatement' @ [153:64] ==> public fun KtExpression.isUsedAsStatement(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [153:82] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'bindingContext' @ [155:16] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'getType' @ [155:31] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [155:39] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType[LocalVariableDescriptor]

'expression' @ [156:20] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType[LocalVariableDescriptor]

'let' @ [156:59] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> KotlinType?

'bindingContext' @ [157:21] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [157:51] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [157:69] ==> value-parameter it: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.instructionToType.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [157:98] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'instructions' @ [161:23] ==> value-parameter instructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'mapNotNull' @ [161:36] ==> public inline fun <T, R : Any> Iterable<Instruction>.mapNotNull(transform: (Instruction) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction
    <R : Any> -> KotlinType

'instructionToType' @ [161:49] ==> local final fun instructionToType(instruction: Instruction): KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[SimpleFunctionDescriptorImpl]

'if (resultTypes.isNotEmpty()) CommonSupertypes.commonSupertype(resultTypes) else module.builtIns.defaultReturnType' @ [162:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'resultTypes' @ [162:31] ==> val resultTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'isNotEmpty' @ [162:43] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'commonSupertype' @ [162:74] ==> @NotNull public open fun commonSupertype(@NotNull p0: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType defined in org.jetbrains.kotlin.types.CommonSupertypes[JavaMethodDescriptor]

'resultTypes' @ [162:90] ==> val resultTypes: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'module' @ [162:108] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'builtIns' @ [162:115] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'defaultReturnType' @ [162:124] ==> internal val KotlinBuiltIns.defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

'if (options.allowSpecialClassNames) commonSupertype else commonSupertype.approximateWithResolvableType(targetScope, false)' @ [163:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'options' @ [163:26] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'allowSpecialClassNames' @ [163:34] ==> public final val allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'commonSupertype' @ [163:58] ==> val commonSupertype: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'commonSupertype' @ [163:79] ==> val commonSupertype: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'approximateWithResolvableType' @ [163:95] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'targetScope' @ [163:125] ==> value-parameter targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'instructions' @ [165:23] ==> value-parameter instructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[ValueParameterDescriptorImpl]

'mapNotNull' @ [165:36] ==> public inline fun <T, R : Any> Iterable<Instruction>.mapNotNull(transform: (Instruction) -> KtExpression?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction
    <R : Any> -> KtExpression

'instructionToExpression' @ [165:49] ==> local final fun instructionToExpression(instruction: Instruction, unwrapReturn: Boolean): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[SimpleFunctionDescriptorImpl]

'it' @ [165:73] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions.<anonymous>[ValueParameterDescriptorImpl]

'resultType' @ [167:12] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'expressions' @ [167:26] ==> val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getResultTypeAndExpressions[LocalVariableDescriptor]

'InstructionVisitorWithResult<Boolean>' @ [171:50] ==> public constructor InstructionVisitorWithResult<out R>() defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitorWithResult[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Boolean

'when (instruction) {
                is LoadUnitValueInstruction,
                is MergeInstruction,
                is MarkInstruction -> {
                    instruction.next?.accept(this) ?: true
                }
                else -> visitInstruction(instruction)
            }' @ [175:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'instruction' @ [175:26] ==> value-parameter instruction: InstructionWithNext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitInstructionWithNext[ValueParameterDescriptorImpl]

'instruction' @ [179:21] ==> value-parameter instruction: InstructionWithNext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitInstructionWithNext[ValueParameterDescriptorImpl]

'next' @ [179:33] ==> public final var next: Instruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionWithNext[DeserializedPropertyDescriptor]

'accept' @ [179:39] ==> public abstract fun <R> accept(visitor: InstructionVisitorWithResult<Boolean>): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'this' @ [179:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitInstruction' @ [181:25] ==> public open fun visitInstruction(instruction: Instruction): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [181:42] ==> value-parameter instruction: InstructionWithNext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitInstructionWithNext[ValueParameterDescriptorImpl]

'when (instruction) {
                is ConditionalJumpInstruction -> visitInstruction(instruction)
                else -> instruction.resolvedTarget?.accept(this) ?: true
            }' @ [186:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'instruction' @ [186:26] ==> value-parameter instruction: AbstractJumpInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitJump[ValueParameterDescriptorImpl]

'visitInstruction' @ [187:50] ==> public open fun visitInstruction(instruction: Instruction): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [187:67] ==> value-parameter instruction: AbstractJumpInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitJump[ValueParameterDescriptorImpl]

'instruction' @ [188:25] ==> value-parameter instruction: AbstractJumpInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitJump[ValueParameterDescriptorImpl]

'resolvedTarget' @ [188:37] ==> public final var resolvedTarget: Instruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.AbstractJumpInstruction[DeserializedPropertyDescriptor]

'accept' @ [188:53] ==> public abstract fun <R> accept(visitor: InstructionVisitorWithResult<Boolean>): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'this' @ [188:60] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[LazyClassReceiverParameterDescriptor]

'target' @ [193:17] ==> public final var target: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[PropertyDescriptorImpl]

'target' @ [193:35] ==> public final var target: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[PropertyDescriptorImpl]

'instruction' @ [193:45] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitInstruction[ValueParameterDescriptorImpl]

'target' @ [194:13] ==> public final var target: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[PropertyDescriptorImpl]

'instruction' @ [194:22] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>.visitInstruction[ValueParameterDescriptorImpl]

'instructions' @ [199:9] ==> value-parameter instructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny[ValueParameterDescriptorImpl]

'flatMap' @ [199:22] ==> public inline fun <T, R> Iterable<Instruction>.flatMap(transform: (Instruction) -> Iterable<Instruction>): List<Instruction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction
    <R> -> Instruction

'it' @ [199:32] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<anonymous>[ValueParameterDescriptorImpl]

'nextInstructions' @ [199:35] ==> public abstract val nextInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'any' @ [199:54] ==> public inline fun <T> Iterable<Instruction>.any(predicate: (Instruction) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'!' @ [199:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [199:61] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [199:64] ==> public abstract fun <R> accept(visitor: InstructionVisitorWithResult<Boolean>): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'singleSuccessorCheckingVisitor' @ [199:71] ==> val singleSuccessorCheckingVisitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny[LocalVariableDescriptor]

'singleSuccessorCheckingVisitor' @ [200:12] ==> val singleSuccessorCheckingVisitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny[LocalVariableDescriptor]

'target' @ [200:43] ==> public final var target: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny.<no name provided>[PropertyDescriptorImpl]

'instructions' @ [200:53] ==> value-parameter instructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getCommonNonTrivialSuccessorIfAny[ValueParameterDescriptorImpl]

'firstOrNull' @ [200:66] ==> public fun <T> List<Instruction>.firstOrNull(): Instruction? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'owner' @ [200:81] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'sinkInstruction' @ [200:88] ==> public abstract val sinkInstruction: SubroutineSinkInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[DeserializedPropertyDescriptor]

'!' @ [204:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [204:28] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [204:35] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isMeaningful[ReceiverParameterDescriptorImpl]

'!' @ [204:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNothing' @ [204:60] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [204:70] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isMeaningful[ReceiverParameterDescriptorImpl]

'HashSet' @ [212:24] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'pseudocode' @ [213:5] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages[ValueParameterDescriptorImpl]

'traverse' @ [213:16] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'FORWARD' @ [213:40] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [214:13] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>[ValueParameterDescriptorImpl]

'localInstructions' @ [214:29] ==> value-parameter localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages[ValueParameterDescriptorImpl]

'instruction' @ [215:13] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>[ValueParameterDescriptorImpl]

'getPrimaryDeclarationDescriptorIfAny' @ [215:25] ==> public fun Instruction.getPrimaryDeclarationDescriptorIfAny(bindingContext: BindingContext): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [215:62] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages[ValueParameterDescriptorImpl]

'let' @ [215:79] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Unit

'DescriptorToSourceUtilsIde' @ [216:35] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [216:62] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [216:80] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'descriptor' @ [216:89] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [217:21] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'declaration' @ [217:58] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isInsideOf' @ [217:70] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [217:81] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'declarations' @ [218:21] ==> val declarations: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages[LocalVariableDescriptor]

'add' @ [218:34] ==> public open fun add(element: KtNamedDeclaration): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'declaration' @ [218:38] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>.<anonymous>[LocalVariableDescriptor]

'declarations' @ [223:12] ==> val declarations: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages[LocalVariableDescriptor]

'sortedBy' @ [223:25] ==> public inline fun <T, R : Comparable<Int>> Iterable<KtNamedDeclaration>.sortedBy(crossinline selector: (KtNamedDeclaration) -> Int?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R : Comparable<R>> -> Int

'it' @ [223:36] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalDeclarationsWithNonLocalUsages.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [223:39] ==> public final val KtNamedDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [223:51] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'localInstructions' @ [236:22] ==> value-parameter localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'getExitPoints' @ [236:40] ==> private fun List<Instruction>.getExitPoints(): List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'ArrayList' @ [238:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ReturnValueInstruction

'ArrayList' @ [239:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'ArrayList' @ [240:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractJumpInstruction

'exitPoints' @ [241:5] ==> val exitPoints: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'forEach' @ [241:16] ==> @HidesMembers public inline fun <T> Iterable<Instruction>.forEach(action: (Instruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'it' @ [242:18] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [242:56] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.UnconditionalJumpInstruction[DeserializedPropertyDescriptor]

'when {
                    it !is ReturnValueInstruction && it !is ReturnNoValueInstruction && it.owner != pseudocode ->
                        null
                    it is UnconditionalJumpInstruction && it.targetLabel.isJumpToError ->
                        it
                    e != null && e !is KtBreakExpression && e !is KtContinueExpression ->
                        it.previousInstructions.firstOrNull()
                    else ->
                        it
                }' @ [244:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Instruction?, entry1: Instruction?, entry2: Instruction?, entry3: Instruction?): Instruction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Instruction?

'it' @ [245:21] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [245:54] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [245:89] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [245:92] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'pseudocode' @ [245:101] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'it' @ [247:21] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [247:59] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'targetLabel' @ [247:62] ==> public final val targetLabel: Label defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.UnconditionalJumpInstruction[DeserializedPropertyDescriptor]

'isJumpToError' @ [247:74] ==> public val Label.isJumpToError: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'it' @ [248:25] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [249:21] ==> val e: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'e' @ [249:34] ==> val e: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'e' @ [249:61] ==> val e: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'it' @ [250:25] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'previousInstructions' @ [250:28] ==> public abstract val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'firstOrNull' @ [250:49] ==> public fun <T> Iterable<Instruction>.firstOrNull(): Instruction? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'it' @ [252:25] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'when (inst) {
            is ReturnValueInstruction -> {
                if (inst.owner == pseudocode) {
                    if (inst.returnExpressionIfAny == null) {
                        defaultExits.add(inst)
                    }
                    else {
                        valuedReturnExits.add(inst)
                    }
                }
            }

            is AbstractJumpInstruction -> {
                val element = inst.element
                if ((element is KtReturnExpression && inst.owner == pseudocode)
                        || element is KtBreakExpression
                        || element is KtContinueExpression) {
                    jumpExits.add(inst)
                }
                else if (element !is KtThrowExpression && !inst.targetLabel.isJumpToError) {
                    defaultExits.add(inst)
                }
            }

            else -> if (inst != null && inst !is LocalFunctionDeclarationInstruction) {
                defaultExits.add(inst)
            }
        }' @ [255:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'inst' @ [255:15] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'inst' @ [257:21] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'owner' @ [257:26] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'pseudocode' @ [257:35] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'if (inst.returnExpressionIfAny == null) {
                        defaultExits.add(inst)
                    }
                    else {
                        valuedReturnExits.add(inst)
                    }' @ [258:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'inst' @ [258:25] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'returnExpressionIfAny' @ [258:30] ==> public final val returnExpressionIfAny: KtReturnExpression? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'defaultExits' @ [259:25] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [259:38] ==> public open fun add(element: Instruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'inst' @ [259:42] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'valuedReturnExits' @ [262:25] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [262:43] ==> public open fun add(element: ReturnValueInstruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'inst' @ [262:47] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'inst' @ [268:31] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'element' @ [268:36] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.AbstractJumpInstruction[DeserializedPropertyDescriptor]

'if ((element is KtReturnExpression && inst.owner == pseudocode)
                        || element is KtBreakExpression
                        || element is KtContinueExpression) {
                    jumpExits.add(inst)
                }
                else if (element !is KtThrowExpression && !inst.targetLabel.isJumpToError) {
                    defaultExits.add(inst)
                }' @ [269:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'element' @ [269:22] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'inst' @ [269:55] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'owner' @ [269:60] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[DeserializedPropertyDescriptor]

'pseudocode' @ [269:69] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'element' @ [270:28] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'element' @ [271:28] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'jumpExits' @ [272:21] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [272:31] ==> public open fun add(element: AbstractJumpInstruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'inst' @ [272:35] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'element' @ [274:26] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'!' @ [274:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inst' @ [274:60] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'targetLabel' @ [274:65] ==> public final val targetLabel: Label defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.AbstractJumpInstruction[DeserializedPropertyDescriptor]

'isJumpToError' @ [274:77] ==> public val Label.isJumpToError: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'defaultExits' @ [275:21] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [275:34] ==> public open fun add(element: Instruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'inst' @ [275:38] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'inst' @ [279:25] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'inst' @ [279:41] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'defaultExits' @ [280:17] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [280:30] ==> public open fun add(element: Instruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'inst' @ [280:34] ==> val inst: Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'getLocalDeclarationsWithNonLocalUsages' @ [285:38] ==> private fun ExtractionData.getLocalDeclarationsWithNonLocalUsages(pseudocode: Pseudocode, localInstructions: List<Instruction>, bindingContext: BindingContext): List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'pseudocode' @ [285:77] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'localInstructions' @ [285:89] ==> value-parameter localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'bindingContext' @ [285:108] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'component1' @ [286:10] ==> public final operator fun component1(): List<KtNamedDeclaration> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [286:30] ==> public final operator fun component2(): List<KtNamedDeclaration> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'nonLocallyUsedDeclarations' @ [286:54] ==> val nonLocallyUsedDeclarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'partition' @ [286:81] ==> public inline fun <T> Iterable<KtNamedDeclaration>.partition(predicate: (KtNamedDeclaration) -> Boolean): Pair<List<KtNamedDeclaration>, List<KtNamedDeclaration>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [286:93] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [286:113] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'isLocal' @ [286:116] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'component1' @ [288:10] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [288:29] ==> public final operator fun component2(): List<KtExpression> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getResultTypeAndExpressions' @ [288:57] ==> private fun ExtractionData.getResultTypeAndExpressions(instructions: List<Instruction>, bindingContext: BindingContext, targetScope: LexicalScope?, options: ExtractionOptions, module: ModuleDescriptor): Pair<KotlinType, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'defaultExits' @ [288:85] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'bindingContext' @ [288:99] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'targetScope' @ [288:115] ==> value-parameter targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'options' @ [288:128] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'module' @ [288:137] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'component1' @ [289:10] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [289:27] ==> public final operator fun component2(): List<KtExpression> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getResultTypeAndExpressions' @ [289:54] ==> private fun ExtractionData.getResultTypeAndExpressions(instructions: List<Instruction>, bindingContext: BindingContext, targetScope: LexicalScope?, options: ExtractionOptions, module: ModuleDescriptor): Pair<KotlinType, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'valuedReturnExits' @ [289:82] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'bindingContext' @ [289:101] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'targetScope' @ [289:117] ==> value-parameter targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'options' @ [289:130] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'module' @ [289:139] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'ControlFlow' @ [292:13] ==> public constructor ControlFlow(outputValues: List<OutputValue>, boxerFactory: (List<OutputValue>) -> OutputValueBoxer, declarationsToCopy: List<KtDeclaration>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[ClassConstructorDescriptorImpl]

'emptyList' @ [292:37] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(OutputValue..OutputValue?)>..List<(OutputValue..OutputValue?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue?)

'AsTuple' @ [292:69] ==> public constructor AsTuple(outputValues: List<OutputValue>, module: ModuleDescriptor) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsTuple[ClassConstructorDescriptorImpl]

'it' @ [292:77] ==> value-parameter it: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [292:81] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'declarationsToCopy' @ [292:92] ==> val declarationsToCopy: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'if (returnValueType.isMeaningful()) returnValueType else typeOfDefaultFlow' @ [294:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'returnValueType' @ [294:33] ==> val returnValueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isMeaningful' @ [294:49] ==> private fun KotlinType.isMeaningful(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'returnValueType' @ [294:65] ==> val returnValueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'typeOfDefaultFlow' @ [294:86] ==> val typeOfDefaultFlow: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'defaultReturnType' @ [295:9] ==> val defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isError' @ [295:27] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'emptyControlFlow' @ [295:43] ==> val emptyControlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'ERROR_TYPES' @ [295:76] ==> enum entry ERROR_TYPES defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'if (defaultReturnType.isMeaningful()) {
        emptyControlFlow.copy(outputValues = Collections.singletonList(ExpressionValue(false, defaultResultExpressions, defaultReturnType)))
    }
    else {
        emptyControlFlow
    }' @ [297:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ControlFlow, elseBranch: ControlFlow): ControlFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ControlFlow

'defaultReturnType' @ [297:27] ==> val defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isMeaningful' @ [297:45] ==> private fun KotlinType.isMeaningful(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'emptyControlFlow' @ [298:9] ==> val emptyControlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'copy' @ [298:26] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'singletonList' @ [298:58] ==> public open fun <T : (Any..Any?)> singletonList(p0: (OutputValue.ExpressionValue..OutputValue.ExpressionValue?)): (MutableList<(OutputValue.ExpressionValue..OutputValue.ExpressionValue?)>..List<(OutputValue.ExpressionValue..OutputValue.ExpressionValue?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue?)

'ExpressionValue' @ [298:72] ==> public constructor ExpressionValue(callSiteReturn: Boolean, originalExpressions: List<KtExpression>, valueType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue[ClassConstructorDescriptorImpl]

'defaultResultExpressions' @ [298:95] ==> val defaultResultExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'defaultReturnType' @ [298:121] ==> val defaultReturnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'emptyControlFlow' @ [301:9] ==> val emptyControlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'declarationsToReport' @ [304:9] ==> val declarationsToReport: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [304:30] ==> @InlineOnly public inline fun <T> Collection<KtNamedDeclaration>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declarationsToReport' @ [305:27] ==> val declarationsToReport: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'map' @ [305:48] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> String

'it' @ [305:54] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'renderForMessage' @ [305:57] ==> private fun KtDeclaration.renderForMessage(bindingContext: BindingContext): String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [305:74] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'distinct' @ [305:94] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sorted' @ [305:105] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'controlFlow' @ [306:16] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'addAdditionalInfo' @ [306:74] ==> public final fun addAdditionalInfo(info: List<String>): AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'localVarStr' @ [306:92] ==> val localVarStr: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'parameters' @ [310:13] ==> value-parameter parameters: Set<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'filter' @ [310:24] ==> public inline fun <T> Iterable<Parameter>.filter(predicate: (Parameter) -> Boolean): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'it' @ [310:33] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'mirrorVarName' @ [310:36] ==> public abstract val mirrorVarName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'modifiedVarDescriptors' @ [310:61] ==> value-parameter modifiedVarDescriptors: Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'it' @ [310:84] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [310:87] ==> public abstract val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'sortedBy' @ [310:117] ==> public inline fun <T, R : Comparable<String>> Iterable<Parameter>.sortedBy(crossinline selector: (Parameter) -> String?): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R : Comparable<R>> -> String

'it' @ [310:128] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'nameForRef' @ [310:131] ==> public val Parameter.nameForRef: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[PropertyDescriptorImpl]

'declarationsToCopy' @ [312:13] ==> val declarationsToCopy: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'filter' @ [312:32] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'modifiedVarDescriptors' @ [312:41] ==> value-parameter modifiedVarDescriptors: Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'bindingContext' @ [312:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [312:94] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [312:121] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'outParameters' @ [313:30] ==> val outParameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'size' @ [313:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'outDeclarations' @ [313:51] ==> val outDeclarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'size' @ [313:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ArrayList' @ [315:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> OutputValue

'controlFlow' @ [317:30] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'MULTIPLE_EXIT_POINTS' @ [317:58] ==> enum entry MULTIPLE_EXIT_POINTS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'controlFlow' @ [318:31] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'OUTPUT_AND_EXIT_POINT' @ [318:59] ==> enum entry OUTPUT_AND_EXIT_POINT defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'if (typeOfDefaultFlow.isMeaningful()) {
        if (valuedReturnExits.isNotEmpty() || jumpExits.isNotEmpty()) return multipleExitsError

        outputValues.add(ExpressionValue(false, defaultResultExpressions, typeOfDefaultFlow))
    }
    else if (valuedReturnExits.isNotEmpty()) {
        if (jumpExits.isNotEmpty()) return multipleExitsError

        if (defaultExits.isNotEmpty()) {
            if (modifiedValueCount != 0) return outputAndExitsError
            if (valuedReturnExits.size != 1) return multipleExitsError

            val element = valuedReturnExits.first().element as KtExpression
            return controlFlow.copy(outputValues = Collections.singletonList(Jump(listOf(element), element, true, module.builtIns))) to null
        }

        if (getCommonNonTrivialSuccessorIfAny(valuedReturnExits) == null) return multipleExitsError
        outputValues.add(ExpressionValue(true, valuedReturnExpressions, returnValueType))
    }' @ [320:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'typeOfDefaultFlow' @ [320:9] ==> val typeOfDefaultFlow: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isMeaningful' @ [320:27] ==> private fun KotlinType.isMeaningful(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'valuedReturnExits' @ [321:13] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [321:31] ==> @InlineOnly public inline fun <T> Collection<ReturnValueInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReturnValueInstruction

'jumpExits' @ [321:47] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [321:57] ==> @InlineOnly public inline fun <T> Collection<AbstractJumpInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractJumpInstruction

'multipleExitsError' @ [321:78] ==> val multipleExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'outputValues' @ [323:9] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [323:22] ==> public open fun add(element: OutputValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ExpressionValue' @ [323:26] ==> public constructor ExpressionValue(callSiteReturn: Boolean, originalExpressions: List<KtExpression>, valueType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue[ClassConstructorDescriptorImpl]

'defaultResultExpressions' @ [323:49] ==> val defaultResultExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'typeOfDefaultFlow' @ [323:75] ==> val typeOfDefaultFlow: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'valuedReturnExits' @ [325:14] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [325:32] ==> @InlineOnly public inline fun <T> Collection<ReturnValueInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReturnValueInstruction

'jumpExits' @ [326:13] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [326:23] ==> @InlineOnly public inline fun <T> Collection<AbstractJumpInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractJumpInstruction

'multipleExitsError' @ [326:44] ==> val multipleExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'defaultExits' @ [328:13] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [328:26] ==> @InlineOnly public inline fun <T> Collection<Instruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'modifiedValueCount' @ [329:17] ==> val modifiedValueCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'outputAndExitsError' @ [329:49] ==> val outputAndExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'valuedReturnExits' @ [330:17] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'size' @ [330:35] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'multipleExitsError' @ [330:53] ==> val multipleExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'valuedReturnExits' @ [332:27] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'first' @ [332:45] ==> public fun <T> List<ReturnValueInstruction>.first(): ReturnValueInstruction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReturnValueInstruction

'element' @ [332:53] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[DeserializedPropertyDescriptor]

'controlFlow' @ [333:20] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'copy' @ [333:32] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'singletonList' @ [333:64] ==> public open fun <T : (Any..Any?)> singletonList(p0: (OutputValue.Jump..OutputValue.Jump?)): (MutableList<(OutputValue.Jump..OutputValue.Jump?)>..List<(OutputValue.Jump..OutputValue.Jump?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump?)

'Jump' @ [333:78] ==> public constructor Jump(elementsToReplace: List<KtExpression>, elementToInsertAfterCall: KtElement?, conditional: Boolean, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[ClassConstructorDescriptorImpl]

'listOf' @ [333:83] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'element' @ [333:90] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'element' @ [333:100] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'module' @ [333:115] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'builtIns' @ [333:122] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'getCommonNonTrivialSuccessorIfAny' @ [336:13] ==> private fun getCommonNonTrivialSuccessorIfAny(instructions: List<Instruction>): Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'valuedReturnExits' @ [336:47] ==> val valuedReturnExits: ArrayList<ReturnValueInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'multipleExitsError' @ [336:82] ==> val multipleExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'outputValues' @ [337:9] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'add' @ [337:22] ==> public open fun add(element: OutputValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ExpressionValue' @ [337:26] ==> public constructor ExpressionValue(callSiteReturn: Boolean, originalExpressions: List<KtExpression>, valueType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ExpressionValue[ClassConstructorDescriptorImpl]

'valuedReturnExpressions' @ [337:48] ==> val valuedReturnExpressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'returnValueType' @ [337:73] ==> val returnValueType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'outDeclarations' @ [340:5] ==> val outDeclarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'mapTo' @ [340:21] ==> public inline fun <T, R, C : MutableCollection<in OutputValue.Initializer>> Iterable<KtNamedDeclaration>.mapTo(destination: ArrayList<OutputValue>, transform: (KtNamedDeclaration) -> OutputValue.Initializer): ArrayList<OutputValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Initializer
    <C : MutableCollection<in R>> -> ArrayList<OutputValue>

'outputValues' @ [340:27] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'bindingContext' @ [341:26] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [341:56] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [341:83] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'Initializer' @ [342:9] ==> public constructor Initializer(initializedDeclaration: KtProperty, valueType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Initializer[ClassConstructorDescriptorImpl]

'it' @ [342:21] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [342:39] ==> val descriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[LocalVariableDescriptor]

'returnType' @ [342:51] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'module' @ [342:65] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'builtIns' @ [342:72] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'defaultParameterType' @ [342:81] ==> internal val KotlinBuiltIns.defaultParameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[PropertyDescriptorImpl]

'outParameters' @ [344:5] ==> val outParameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'mapTo' @ [344:19] ==> public inline fun <T, R, C : MutableCollection<in OutputValue.ParameterUpdate>> Iterable<Parameter>.mapTo(destination: ArrayList<OutputValue>, transform: (Parameter) -> OutputValue.ParameterUpdate): ArrayList<OutputValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> ParameterUpdate
    <C : MutableCollection<in R>> -> ArrayList<OutputValue>

'outputValues' @ [344:25] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'ParameterUpdate' @ [344:41] ==> public constructor ParameterUpdate(parameter: Parameter, originalExpressions: List<KtExpression>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.ParameterUpdate[ClassConstructorDescriptorImpl]

'it' @ [344:57] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'modifiedVarDescriptors' @ [344:61] ==> value-parameter modifiedVarDescriptors: Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'it' @ [344:84] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [344:87] ==> public abstract val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'outputValues' @ [346:9] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [346:22] ==> @InlineOnly public inline fun <T> Collection<OutputValue>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputValue

'jumpExits' @ [347:13] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [347:23] ==> @InlineOnly public inline fun <T> Collection<AbstractJumpInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractJumpInstruction

'outputAndExitsError' @ [347:44] ==> val outputAndExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'when {
            outputValues.size > 3 -> {
                if (!options.enableListBoxing) {
                    val outValuesStr =
                            (outParameters.map { it.originalDescriptor.renderForMessage() }
                             + outDeclarations.map { it.renderForMessage(bindingContext)!! }).sorted()
                    return controlFlow to ErrorMessage.MULTIPLE_OUTPUT.addAdditionalInfo(outValuesStr)
                }
                { outputValues -> OutputValueBoxer.AsList(outputValues) } // KT-8596
            }

            else -> controlFlow.boxerFactory
        }' @ [349:69] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<OutputValue>) -> OutputValueBoxer, entry1: (List<OutputValue>) -> OutputValueBoxer): (List<OutputValue>) -> OutputValueBoxer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Function1<List<OutputValue>, OutputValueBoxer>

'outputValues' @ [350:13] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'size' @ [350:26] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'!' @ [351:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [351:22] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'enableListBoxing' @ [351:30] ==> public final val enableListBoxing: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'outParameters' @ [353:30] ==> val outParameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'map' @ [353:44] ==> public inline fun <T, R> Iterable<Parameter>.map(transform: (Parameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> String

'it' @ [353:50] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'originalDescriptor' @ [353:53] ==> public abstract val originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'renderForMessage' @ [353:72] ==> private fun DeclarationDescriptor.renderForMessage(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'outDeclarations' @ [354:32] ==> val outDeclarations: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'map' @ [354:48] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> String

'it' @ [354:54] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'renderForMessage' @ [354:57] ==> private fun KtDeclaration.renderForMessage(bindingContext: BindingContext): String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [354:74] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'sorted' @ [354:95] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'controlFlow' @ [355:28] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'addAdditionalInfo' @ [355:72] ==> public final fun addAdditionalInfo(info: List<String>): AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'outValuesStr' @ [355:90] ==> val outValuesStr: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'AsList' @ [357:52] ==> public constructor AsList(outputValues: List<OutputValue>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer.AsList[ClassConstructorDescriptorImpl]

'outputValues' @ [357:59] ==> value-parameter outputValues: List<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'controlFlow' @ [360:21] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'boxerFactory' @ [360:33] ==> public final val boxerFactory: (List<OutputValue>) -> OutputValueBoxer defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'controlFlow' @ [363:16] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'copy' @ [363:28] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'outputValues' @ [363:48] ==> val outputValues: ArrayList<OutputValue> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'boxerFactory' @ [363:77] ==> val boxerFactory: (List<OutputValue>) -> OutputValueBoxer defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'jumpExits' @ [366:9] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [366:19] ==> @InlineOnly public inline fun <T> Collection<AbstractJumpInstruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractJumpInstruction

'getCommonNonTrivialSuccessorIfAny' @ [367:26] ==> private fun getCommonNonTrivialSuccessorIfAny(instructions: List<Instruction>): Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'jumpExits' @ [367:60] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'multipleExitsError' @ [367:81] ==> val multipleExitsError: Pair<ControlFlow, AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'getCommonNonTrivialSuccessorIfAny' @ [369:26] ==> private fun getCommonNonTrivialSuccessorIfAny(instructions: List<Instruction>): Instruction? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'defaultExits' @ [369:60] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'jumpTarget' @ [369:77] ==> val jumpTarget: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'!' @ [370:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'singleExit' @ [370:28] ==> val singleExit: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'defaultExits' @ [370:42] ==> val defaultExits: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'isNotEmpty' @ [370:55] ==> @InlineOnly public inline fun <T> Collection<Instruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'jumpExits' @ [371:24] ==> val jumpExits: ArrayList<AbstractJumpInstruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'map' @ [371:34] ==> public inline fun <T, R> Iterable<AbstractJumpInstruction>.map(transform: (AbstractJumpInstruction) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractJumpInstruction
    <R> -> KtExpression

'it' @ [371:40] ==> value-parameter it: AbstractJumpInstruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [371:43] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.AbstractJumpInstruction[DeserializedPropertyDescriptor]

'if (singleExit) null else elements.first()' @ [372:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'singleExit' @ [372:44] ==> val singleExit: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'elements' @ [372:66] ==> val elements: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'first' @ [372:75] ==> public fun <T> List<KtExpression>.first(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'controlFlow' @ [373:16] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'copy' @ [373:28] ==> public final fun copy(outputValues: List<OutputValue> = ..., boxerFactory: (List<OutputValue>) -> OutputValueBoxer = ..., declarationsToCopy: List<KtDeclaration> = ...): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[SimpleFunctionDescriptorImpl]

'singletonList' @ [373:60] ==> public open fun <T : (Any..Any?)> singletonList(p0: (OutputValue.Jump..OutputValue.Jump?)): (MutableList<(OutputValue.Jump..OutputValue.Jump?)>..List<(OutputValue.Jump..OutputValue.Jump?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump?)

'Jump' @ [373:74] ==> public constructor Jump(elementsToReplace: List<KtExpression>, elementToInsertAfterCall: KtElement?, conditional: Boolean, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[ClassConstructorDescriptorImpl]

'elements' @ [373:79] ==> val elements: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'elementToInsertAfterCall' @ [373:89] ==> val elementToInsertAfterCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'conditional' @ [373:115] ==> val conditional: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'module' @ [373:128] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[ValueParameterDescriptorImpl]

'builtIns' @ [373:135] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'controlFlow' @ [376:12] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.analyzeControlFlow[LocalVariableDescriptor]

'Any' @ [380:31] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'mark' @ [381:17] ==> public open fun mark(@NotNull p0: PsiElement, @NotNull p1: Any): Unit defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'targetSibling' @ [381:22] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetSiblingMarker' @ [381:37] ==> val targetSiblingMarker: Any defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'originalFile' @ [382:19] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'createTempCopy' @ [382:32] ==> public fun KtFile.createTempCopy(text: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'tmpFile' @ [383:5] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'deleteChildRange' @ [383:13] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'tmpFile' @ [383:30] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'firstChild' @ [383:38] ==> public final val KtFile.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'tmpFile' @ [383:50] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'lastChild' @ [383:58] ==> public final val KtFile.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'tmpFile' @ [384:5] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'addRange' @ [384:13] ==> public open fun addRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'originalFile' @ [384:22] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'firstChild' @ [384:35] ==> public final val KtFile.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'originalFile' @ [384:47] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'lastChild' @ [384:60] ==> public final val KtFile.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!!' @ [385:28] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiElement?): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiElement

'releaseMark' @ [385:40] ==> @Nullable public open fun releaseMark(@NotNull p0: PsiElement, @NotNull p1: Any): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]

'tmpFile' @ [385:52] ==> val tmpFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'targetSiblingMarker' @ [385:61] ==> val targetSiblingMarker: Any defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'newTargetSibling' @ [386:27] ==> val newTargetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'parent' @ [386:44] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KtPsiFactory' @ [388:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'originalFile' @ [388:36] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'createDeclarationByPattern' @ [388:50] ==> public fun <TDeclaration : KtDeclaration> KtPsiFactory.createDeclarationByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtNamedDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtNamedDeclaration

'pattern' @ [389:13] ==> value-parameter pattern: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[ValueParameterDescriptorImpl]

'PsiChildRange' @ [390:13] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'originalElements' @ [390:27] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'firstOrNull' @ [390:44] ==> public fun <T> List<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'originalElements' @ [390:59] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'lastOrNull' @ [390:76] ==> public fun <T> List<PsiElement>.lastOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'if (insertBefore) {
        newTargetParent.addBefore(declaration, newTargetSibling) as KtNamedDeclaration
    }
    else {
        newTargetParent.addAfter(declaration, newTargetSibling) as KtNamedDeclaration
    }' @ [392:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtNamedDeclaration, elseBranch: KtNamedDeclaration): KtNamedDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtNamedDeclaration

'insertBefore' @ [392:16] ==> public final val insertBefore: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'newTargetParent' @ [393:9] ==> val newTargetParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'addBefore' @ [393:25] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [393:35] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'newTargetSibling' @ [393:48] ==> val newTargetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'newTargetParent' @ [396:9] ==> val newTargetParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'addAfter' @ [396:25] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'declaration' @ [396:34] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'newTargetSibling' @ [396:47] ==> val newTargetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.createTemporaryDeclaration[LocalVariableDescriptor]

'options' @ [401:9] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'extractAsProperty' @ [401:17] ==> public final val extractAsProperty: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'!!' @ [402:16] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtBlockExpression?): KtBlockExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtBlockExpression

'createTemporaryDeclaration' @ [402:18] ==> public fun ExtractionData.createTemporaryDeclaration(pattern: String): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'initializer' @ [402:80] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'bodyExpression' @ [402:115] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'createTemporaryDeclaration' @ [404:13] ==> public fun ExtractionData.createTemporaryDeclaration(pattern: String): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bodyExpression' @ [404:80] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [408:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processTypeArguments' @ [408:10] ==> value-parameter processTypeArguments: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[ValueParameterDescriptorImpl]

'singletonList' @ [408:51] ==> public open fun <T : (Any..Any?)> singletonList(p0: (KotlinType..KotlinType?)): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'this' @ [408:65] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[ReceiverParameterDescriptorImpl]

'!!' @ [409:12] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: List<KotlinType>?): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> List<KotlinType>

'dfsFromNode' @ [409:16] ==> public open fun <N : (Any..Any?), R : (Any..Any?)> dfsFromNode(@NotNull p0: KotlinType, @NotNull p1: DFS.Neighbors<(KotlinType..KotlinType?)>, @NotNull p2: DFS.Visited<(KotlinType..KotlinType?)>, @NotNull p3: DFS.NodeHandler<(KotlinType..KotlinType?), (ArrayList<KotlinType>..ArrayList<KotlinType>?)>): (ArrayList<KotlinType>..ArrayList<KotlinType>?) defined in org.jetbrains.kotlin.utils.DFS[JavaMethodDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : (Any..Any?)> -> (java.util.ArrayList<org.jetbrains.kotlin.types.KotlinType>..java.util.ArrayList<org.jetbrains.kotlin.types.KotlinType>?)

'this' @ [410:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[ReceiverParameterDescriptorImpl]

'Neighbors' @ [411:13] ==> public final fun <N : (Any..Any?)> Neighbors(function: ((KotlinType..KotlinType?)) -> (MutableIterable<(KotlinType..KotlinType?)>..Iterable<(KotlinType..KotlinType?)>)): DFS.Neighbors<KotlinType> defined in org.jetbrains.kotlin.utils.DFS[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : (Any..Any?)> -> KotlinType

'current' @ [411:48] ==> value-parameter current: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [411:56] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'map' @ [411:66] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> KotlinType

'it' @ [411:72] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [411:75] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'VisitedWithSet' @ [412:13] ==> public constructor VisitedWithSet<N : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.VisitedWithSet[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'CollectingNodeHandler<KotlinType, KotlinType, ArrayList<KotlinType>>' @ [413:21] ==> protected/*protected and package*/ constructor CollectingNodeHandler<N : (Any..Any?), R : (Any..Any?), C : (MutableIterable<(KotlinType..KotlinType?)>..Iterable<(KotlinType..KotlinType?)>?)>(@NotNull p0: ArrayList<KotlinType>) defined in org.jetbrains.kotlin.utils.DFS.CollectingNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> KotlinType
    <R : (Any..Any?)> -> KotlinType
    <C : (MutableIterable<(R..R?)>..Iterable<(R..R?)>?)> -> ArrayList<KotlinType>

'ArrayList' @ [413:90] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'result' @ [415:21] ==> @NotNull protected/*protected and package*/ final val result: ArrayList<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<no name provided>[JavaPropertyDescriptor]

'add' @ [415:28] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'current' @ [415:32] ==> value-parameter current: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [422:27] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'typeConstraints' @ [422:81] ==> public final val KtTypeParameterListOwner.typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'emptyList' @ [422:119] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtTypeConstraint..org.jetbrains.kotlin.psi.KtTypeConstraint?)

'typeConstraints' @ [423:12] ==> val typeConstraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectRelevantConstraints[LocalVariableDescriptor]

'filter' @ [423:28] ==> public inline fun <T> Iterable<(KtTypeConstraint..KtTypeConstraint?)>.filter(predicate: ((KtTypeConstraint..KtTypeConstraint?)) -> Boolean): List<(KtTypeConstraint..KtTypeConstraint?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeConstraint..org.jetbrains.kotlin.psi.KtTypeConstraint?)

'it' @ [423:37] ==> value-parameter it: (KtTypeConstraint..KtTypeConstraint?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectRelevantConstraints.<anonymous>[ValueParameterDescriptorImpl]

'subjectTypeParameterName' @ [423:40] ==> public final val KtTypeConstraint.subjectTypeParameterName: KtSimpleNameExpression?[MyPropertyDescriptor]

'mainReference' @ [423:66] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [423:81] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'this' @ [423:94] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectRelevantConstraints[ReceiverParameterDescriptorImpl]

'ArrayList' @ [427:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtTypeReference

'originalDeclaration' @ [428:5] ==> public final val originalDeclaration: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.TypeParameter[PropertyDescriptorImpl]

'extendsBound' @ [428:25] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'let' @ [428:39] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Boolean

'typeRefs' @ [428:45] ==> val typeRefs: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[LocalVariableDescriptor]

'add' @ [428:54] ==> public open fun add(element: KtTypeReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [428:58] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<anonymous>[ValueParameterDescriptorImpl]

'originalConstraints' @ [429:5] ==> public final val originalConstraints: List<KtTypeConstraint> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.TypeParameter[PropertyDescriptorImpl]

'mapNotNullTo' @ [429:25] ==> public inline fun <T, R : Any, C : MutableCollection<in KtTypeReference>> Iterable<KtTypeConstraint>.mapNotNullTo(destination: ArrayList<KtTypeReference>, transform: (KtTypeConstraint) -> KtTypeReference?): ArrayList<KtTypeReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeConstraint
    <R : Any> -> KtTypeReference
    <C : MutableCollection<in R>> -> ArrayList<KtTypeReference>

'typeRefs' @ [429:38] ==> val typeRefs: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[LocalVariableDescriptor]

'it' @ [429:50] ==> value-parameter it: KtTypeConstraint defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<anonymous>[ValueParameterDescriptorImpl]

'boundTypeReference' @ [429:53] ==> public final val KtTypeConstraint.boundTypeReference: KtTypeReference?[MyPropertyDescriptor]

'typeRefs' @ [431:12] ==> val typeRefs: ArrayList<KtTypeReference> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[LocalVariableDescriptor]

'mapNotNull' @ [431:21] ==> public inline fun <T, R : Any> Iterable<KtTypeReference>.mapNotNull(transform: (KtTypeReference) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R : Any> -> KotlinType

'bindingContext' @ [431:34] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes[ValueParameterDescriptorImpl]

'TYPE' @ [431:64] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [431:70] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.collectReferencedTypes.<anonymous>[ValueParameterDescriptorImpl]

'collectReferencedTypes' @ [435:12] ==> private fun KotlinType.collectReferencedTypes(processTypeArguments: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'fold' @ [435:41] ==> public inline fun <T, R> Iterable<KotlinType>.fold(initial: Boolean, operation: (acc: Boolean, KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'typeToCheck' @ [436:39] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [436:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [436:63] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'parameterTypeDescriptor' @ [437:29] ==> val parameterTypeDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>[LocalVariableDescriptor]

'let' @ [437:54] ==> @InlineOnly public inline fun <T, R> TypeParameterDescriptor.let(block: (TypeParameterDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [438:13] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [438:37] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [438:61] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'extractable' @ [441:9] ==> value-parameter extractable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>[ValueParameterDescriptorImpl]

'typeParameter' @ [441:25] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>[LocalVariableDescriptor]

'typeToCheck' @ [441:50] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable.<anonymous>[ValueParameterDescriptorImpl]

'isResolvableInScope' @ [441:62] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'targetScope' @ [441:82] ==> value-parameter targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isExtractable[ValueParameterDescriptorImpl]

'collectReferencedTypes' @ [452:12] ==> private fun KotlinType.collectReferencedTypes(processTypeArguments: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'processTypeArguments' @ [452:35] ==> value-parameter processTypeArguments: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable[ValueParameterDescriptorImpl]

'fold' @ [452:57] ==> public inline fun <T, R> Iterable<KotlinType>.fold(initial: Boolean, operation: (acc: Boolean, KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'typeToCheck' @ [453:39] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [453:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [453:63] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'parameterTypeDescriptor' @ [454:29] ==> val parameterTypeDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[LocalVariableDescriptor]

'let' @ [454:54] ==> @InlineOnly public inline fun <T, R> TypeParameterDescriptor.let(block: (TypeParameterDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [455:13] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [455:37] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [455:61] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when {
            typeToCheck.isResolvableInScope(targetScope, true) ->
                extractable

            typeParameter != null -> {
                typeParameters.add(TypeParameter(typeParameter, typeParameter.collectRelevantConstraints()))
                extractable
            }

            options.allowSpecialClassNames && typeToCheck.isSpecial() ->
                extractable

            typeToCheck.isError ->
                false

            else -> {
                nonDenotableTypes.add(typeToCheck)
                false
            }
        }' @ [458:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'typeToCheck' @ [459:13] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'isResolvableInScope' @ [459:25] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'targetScope' @ [459:45] ==> value-parameter targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable[ValueParameterDescriptorImpl]

'extractable' @ [460:17] ==> value-parameter extractable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'typeParameter' @ [462:13] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[LocalVariableDescriptor]

'typeParameters' @ [463:17] ==> value-parameter typeParameters: MutableSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable[ValueParameterDescriptorImpl]

'add' @ [463:32] ==> public abstract fun add(element: TypeParameter): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'TypeParameter' @ [463:36] ==> public constructor TypeParameter(originalDeclaration: KtTypeParameter, originalConstraints: List<KtTypeConstraint>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.TypeParameter[ClassConstructorDescriptorImpl]

'typeParameter' @ [463:50] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[LocalVariableDescriptor]

'typeParameter' @ [463:65] ==> val typeParameter: KtTypeParameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[LocalVariableDescriptor]

'collectRelevantConstraints' @ [463:79] ==> public fun KtTypeParameter.collectRelevantConstraints(): List<KtTypeConstraint> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'extractable' @ [464:17] ==> value-parameter extractable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'options' @ [467:13] ==> value-parameter options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable[ValueParameterDescriptorImpl]

'allowSpecialClassNames' @ [467:21] ==> public final val allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'typeToCheck' @ [467:47] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [467:59] ==> public fun KotlinType.isSpecial(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'extractable' @ [468:17] ==> value-parameter extractable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'typeToCheck' @ [470:13] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [470:25] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'nonDenotableTypes' @ [474:17] ==> value-parameter nonDenotableTypes: MutableSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable[ValueParameterDescriptorImpl]

'add' @ [474:35] ==> public abstract fun add(element: KotlinType): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'typeToCheck' @ [474:39] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processTypeIfExtractable.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [491:32] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'HashSet' @ [492:34] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypePredicate

'assert' @ [497:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'writable' @ [497:16] ==> private final var writable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'currentName' @ [497:71] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'jetType' @ [499:13] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.addDefaultType[ValueParameterDescriptorImpl]

'possibleTypes' @ [499:24] ==> private final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'defaultTypes' @ [500:13] ==> private final val defaultTypes: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'add' @ [500:26] ==> public open fun add(element: KotlinType): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'jetType' @ [500:30] ==> value-parameter jetType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.addDefaultType[ValueParameterDescriptorImpl]

'assert' @ [505:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'writable' @ [505:16] ==> private final var writable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'currentName' @ [505:81] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'typePredicates' @ [506:9] ==> private final val typePredicates: HashSet<TypePredicate> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'add' @ [506:24] ==> public open fun add(element: TypePredicate): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'predicate' @ [506:28] ==> value-parameter predicate: TypePredicate defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.addTypePredicate[ValueParameterDescriptorImpl]

'currentName' @ [510:39] ==> public final var currentName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'getValue' @ [514:44] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'writable' @ [515:9] ==> private final var writable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'if (defaultTypes.isNotEmpty()) {
            TypeIntersector.intersectTypes(KotlinTypeChecker.DEFAULT, defaultTypes)!!
        }
        else originalType' @ [516:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'defaultTypes' @ [516:13] ==> private final val defaultTypes: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'isNotEmpty' @ [516:26] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'!!' @ [517:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinType?): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinType

'intersectTypes' @ [517:29] ==> @Nullable public open fun intersectTypes(@NotNull p0: KotlinTypeChecker, @NotNull p1: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>)): KotlinType? defined in org.jetbrains.kotlin.types.TypeIntersector[JavaMethodDescriptor]

'DEFAULT' @ [517:62] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'defaultTypes' @ [517:71] ==> private final val defaultTypes: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'originalType' @ [519:14] ==> private final val originalType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'getValue' @ [522:62] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'writable' @ [523:9] ==> private final var writable: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'and' @ [525:29] ==> public fun and(predicates: Collection<TypePredicate>): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'typePredicates' @ [525:33] ==> private final val typePredicates: HashSet<TypePredicate> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'if (defaultType.isFlexible()) {
            val bounds = defaultType.asFlexibleType()
            LinkedHashSet<KotlinType>().apply {
                if (typePredicate(bounds.upperBound)) add(bounds.upperBound)
                if (typePredicate(bounds.lowerBound)) add(bounds.lowerBound)
            }
        }
        else linkedSetOf(defaultType)' @ [527:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LinkedHashSet<KotlinType>, elseBranch: LinkedHashSet<KotlinType>): LinkedHashSet<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LinkedHashSet<KotlinType>

'defaultType' @ [527:27] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'isFlexible' @ [527:39] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'defaultType' @ [528:26] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'asFlexibleType' @ [528:38] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'LinkedHashSet' @ [529:13] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'apply' @ [529:41] ==> @InlineOnly public inline fun <T> LinkedHashSet<KotlinType>.apply(block: LinkedHashSet<KotlinType>.() -> Unit): LinkedHashSet<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<KotlinType>

'invoke' @ [530:21] ==> public abstract fun invoke(typeToCheck: KotlinType): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.TypePredicate[DeserializedSimpleFunctionDescriptor]

'bounds' @ [530:35] ==> val bounds: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'upperBound' @ [530:42] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'add' @ [530:55] ==> public open fun add(element: KotlinType): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'bounds' @ [530:59] ==> val bounds: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'upperBound' @ [530:66] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'invoke' @ [531:21] ==> public abstract fun invoke(typeToCheck: KotlinType): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.TypePredicate[DeserializedSimpleFunctionDescriptor]

'bounds' @ [531:35] ==> val bounds: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'lowerBound' @ [531:42] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'add' @ [531:55] ==> public open fun add(element: KotlinType): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'bounds' @ [531:59] ==> val bounds: FlexibleType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'lowerBound' @ [531:66] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'linkedSetOf' @ [534:14] ==> public fun <T> linkedSetOf(vararg elements: KotlinType): LinkedHashSet<KotlinType> /* = LinkedHashSet<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'defaultType' @ [534:26] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'defaultType' @ [536:32] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'isNullabilityFlexible' @ [536:44] ==> public fun KotlinType.isNullabilityFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'typeSet' @ [536:71] ==> val typeSet: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'size' @ [536:79] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'getAllSupertypes' @ [537:36] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'defaultType' @ [537:53] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'filter' @ [537:66] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'typePredicate' @ [537:73] ==> val typePredicate: TypePredicate defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'superTypes' @ [539:27] ==> val superTypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'addNullableTypes' @ [540:17] ==> val addNullableTypes: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'typeSet' @ [541:17] ==> val typeSet: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'add' @ [541:25] ==> public open fun add(element: KotlinType): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'superType' @ [541:29] ==> val superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'makeNullable' @ [541:39] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'typeSet' @ [543:13] ==> val typeSet: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'add' @ [543:21] ==> public open fun add(element: KotlinType): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'superType' @ [543:25] ==> val superType: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'typeSet' @ [546:9] ==> val typeSet: LinkedHashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.parameterTypeCandidates.<anonymous>[LocalVariableDescriptor]

'toList' @ [546:17] ==> public fun <T> Iterable<KotlinType>.toList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'if (!allowSpecialClassNames) {
                parameterTypeCandidates.filter { it.isExtractable(targetScope) }
            } else {
                parameterTypeCandidates
            }' @ [550:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KotlinType>, elseBranch: List<KotlinType>): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KotlinType>

'!' @ [550:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowSpecialClassNames' @ [550:25] ==> value-parameter allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.getParameterTypeCandidates[ValueParameterDescriptorImpl]

'parameterTypeCandidates' @ [551:17] ==> private final val parameterTypeCandidates: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'filter' @ [551:41] ==> public inline fun <T> Iterable<KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [551:50] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.getParameterTypeCandidates.<anonymous>[ValueParameterDescriptorImpl]

'isExtractable' @ [551:53] ==> private fun KotlinType.isExtractable(targetScope: LexicalScope?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'targetScope' @ [551:67] ==> private final val targetScope: LexicalScope? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'parameterTypeCandidates' @ [553:17] ==> private final val parameterTypeCandidates: List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'getParameterTypeCandidates' @ [558:16] ==> public open fun getParameterTypeCandidates(allowSpecialClassNames: Boolean): List<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[SimpleFunctionDescriptorImpl]

'allowSpecialClassNames' @ [558:43] ==> value-parameter allowSpecialClassNames: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.getParameterType[ValueParameterDescriptorImpl]

'firstOrNull' @ [558:67] ==> public fun <T> List<KotlinType>.firstOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'defaultType' @ [558:84] ==> private final val defaultType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'DelegatingParameter' @ [561:77] ==> public constructor DelegatingParameter(original: Parameter, name: String, parameterType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter[ClassConstructorDescriptorImpl]

'this' @ [561:97] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[LazyClassReceiverParameterDescriptor]

'name' @ [561:103] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.copy[ValueParameterDescriptorImpl]

'parameterType' @ [561:109] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter.copy[ValueParameterDescriptorImpl]

'original' @ [568:17] ==> value-parameter original: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter.<init>[ValueParameterDescriptorImpl]

'DelegatingParameter' @ [569:77] ==> public constructor DelegatingParameter(original: Parameter, name: String, parameterType: KotlinType) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter[ClassConstructorDescriptorImpl]

'original' @ [569:97] ==> public final val original: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter[PropertyDescriptorImpl]

'name' @ [569:107] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter.copy[ValueParameterDescriptorImpl]

'parameterType' @ [569:113] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter.copy[ValueParameterDescriptorImpl]

'parameterType' @ [570:70] ==> public final val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.DelegatingParameter[PropertyDescriptorImpl]

'HashSet' @ [578:34] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'controlFlow' @ [579:5] ==> value-parameter controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[ValueParameterDescriptorImpl]

'jumpOutputValue' @ [579:17] ==> public final val jumpOutputValue: OutputValue.Jump? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'elementToInsertAfterCall' @ [579:34] ==> public final val elementToInsertAfterCall: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[PropertyDescriptorImpl]

'accept' @ [579:60] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [580:22] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [582:34] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mainReference' @ [582:45] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [582:59] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'target' @ [583:25] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'target' @ [584:28] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'isInsideOf' @ [584:35] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [584:46] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'target' @ [585:28] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getStrictParentOfType' @ [585:35] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'enclosingDeclaration' @ [585:77] ==> value-parameter enclosingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[ValueParameterDescriptorImpl]

'declarationsOutOfScope' @ [586:25] ==> val declarationsOutOfScope: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[LocalVariableDescriptor]

'add' @ [586:48] ==> public open fun add(element: KtNamedDeclaration): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'target' @ [586:52] ==> val target: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'declarationsOutOfScope' @ [592:9] ==> val declarationsOutOfScope: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[LocalVariableDescriptor]

'isNotEmpty' @ [592:32] ==> @InlineOnly public inline fun <T> Collection<KtNamedDeclaration>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declarationsOutOfScope' @ [593:23] ==> val declarationsOutOfScope: HashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[LocalVariableDescriptor]

'map' @ [593:46] ==> public inline fun <T, R> Iterable<KtNamedDeclaration>.map(transform: (KtNamedDeclaration) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> String

'it' @ [593:52] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope.<anonymous>[ValueParameterDescriptorImpl]

'renderForMessage' @ [593:55] ==> private fun KtDeclaration.renderForMessage(bindingContext: BindingContext): String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [593:72] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[ValueParameterDescriptorImpl]

'sorted' @ [593:92] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'addAdditionalInfo' @ [594:55] ==> public final fun addAdditionalInfo(info: List<String>): AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'declStr' @ [594:73] ==> val declStr: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.checkDeclarationsMovingOutOfScope[LocalVariableDescriptor]

'ArrayList' @ [601:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Instruction

'pseudocode' @ [602:5] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions[ValueParameterDescriptorImpl]

'traverse' @ [602:16] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[DeserializedSimpleFunctionDescriptor]

'FORWARD' @ [602:40] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'it' @ [603:13] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [603:43] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [603:46] ==> public abstract val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.KtElementInstruction[DeserializedPropertyDescriptor]

'isInsideOf' @ [603:54] ==> public fun PsiElement.isInsideOf(elements: Iterable<PsiElement>): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'physicalElements' @ [603:65] ==> public final val physicalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'instructions' @ [604:13] ==> val instructions: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions[LocalVariableDescriptor]

'add' @ [604:26] ==> public open fun add(element: Instruction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [604:30] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions.<anonymous>[ValueParameterDescriptorImpl]

'instructions' @ [607:12] ==> val instructions: ArrayList<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getLocalInstructions[LocalVariableDescriptor]

'targetSibling' @ [611:18] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'parent' @ [611:32] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [612:12] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isVisibilityApplicable[LocalVariableDescriptor]

'parent' @ [612:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isVisibilityApplicable[LocalVariableDescriptor]

'!' @ [612:58] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [612:59] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.isVisibilityApplicable[LocalVariableDescriptor]

'isScript' @ [612:66] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'!' @ [616:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisibilityApplicable' @ [616:10] ==> public fun ExtractionData.isVisibilityApplicable(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'targetSibling' @ [618:18] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getStrictParentOfType' @ [618:32] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'parent' @ [619:9] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getDefaultVisibility[LocalVariableDescriptor]

'parent' @ [620:13] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getDefaultVisibility[LocalVariableDescriptor]

'isInterface' @ [620:20] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'parent' @ [621:13] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getDefaultVisibility[LocalVariableDescriptor]

'isEnum' @ [621:20] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'commonParent' @ [621:32] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getNonStrictParentOfType' @ [621:45] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtEnumEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtEnumEntry

'getStrictParentOfType' @ [621:86] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'parent' @ [621:122] ==> val parent: KtDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getDefaultVisibility[LocalVariableDescriptor]

'originalElements' @ [628:9] ==> public final val originalElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'isEmpty' @ [628:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'AnalysisResult' @ [628:44] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'CRITICAL_ERROR' @ [628:72] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'listOf' @ [628:88] ==> public fun <T> listOf(element: AnalysisResult.ErrorMessage): List<AnalysisResult.ErrorMessage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'NO_EXPRESSION' @ [628:108] ==> enum entry NO_EXPRESSION defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'AnalysisResult' @ [630:28] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'CRITICAL_ERROR' @ [630:56] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'listOf' @ [630:72] ==> public fun <T> listOf(element: AnalysisResult.ErrorMessage): List<AnalysisResult.ErrorMessage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'NO_CONTAINER' @ [630:92] ==> enum entry NO_CONTAINER defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'bindingContext' @ [632:26] ==> public final val bindingContext: BindingContext? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'noContainerError' @ [632:51] ==> val noContainerError: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'commonParent' @ [634:23] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'containingDeclarationForPseudocode' @ [634:36] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedPropertyDescriptor]

'noContainerError' @ [634:81] ==> val noContainerError: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'declaration' @ [635:22] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'getContainingPseudocode' @ [635:34] ==> public fun KtDeclaration.getContainingPseudocode(context: BindingContext): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [635:58] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'AnalysisResult' @ [636:32] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'CRITICAL_ERROR' @ [636:60] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'listOf' @ [636:76] ==> public fun <T> listOf(element: AnalysisResult.ErrorMessage): List<AnalysisResult.ErrorMessage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'SYNTAX_ERRORS' @ [636:96] ==> enum entry SYNTAX_ERRORS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[FakeCallableDescriptorForObject]

'getLocalInstructions' @ [637:29] ==> private fun ExtractionData.getLocalInstructions(pseudocode: Pseudocode): List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'pseudocode' @ [637:50] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'localInstructions' @ [639:49] ==> val localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'getModifiedVarDescriptors' @ [639:67] ==> private fun List<Instruction>.getModifiedVarDescriptors(bindingContext: BindingContext): Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [639:93] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'createTemporaryCodeBlock' @ [641:24] ==> internal fun ExtractionData.createTemporaryCodeBlock(): KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'targetSibling' @ [643:23] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getResolutionScope' @ [643:37] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [643:56] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'commonParent' @ [643:72] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getResolutionFacade' @ [643:85] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'inferParametersInfo' @ [644:22] ==> internal fun ExtractionData.inferParametersInfo(virtualBlock: KtBlockExpression, commonParent: PsiElement, pseudocode: Pseudocode, bindingContext: BindingContext, targetScope: LexicalScope, modifiedVarDescriptors: Set<VariableDescriptor>): ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file inferParameterInfo.kt[SimpleFunctionDescriptorImpl]

'virtualBlock' @ [645:13] ==> val virtualBlock: KtBlockExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'commonParent' @ [646:13] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'pseudocode' @ [647:13] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'bindingContext' @ [648:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'targetScope' @ [649:13] ==> val targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'modifiedVarDescriptorsWithExpressions' @ [650:13] ==> val modifiedVarDescriptorsWithExpressions: Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'keys' @ [650:51] ==> public abstract val keys: Set<VariableDescriptor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'paramsInfo' @ [652:9] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'errorMessage' @ [652:20] ==> public final var errorMessage: AnalysisResult.ErrorMessage? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'AnalysisResult' @ [653:16] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'CRITICAL_ERROR' @ [653:44] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'listOf' @ [653:60] ==> public fun <T> listOf(element: AnalysisResult.ErrorMessage): List<AnalysisResult.ErrorMessage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'paramsInfo' @ [653:67] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'errorMessage' @ [653:78] ==> public final var errorMessage: AnalysisResult.ErrorMessage? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'ArrayList' @ [656:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ErrorMessage

'HashMap' @ [658:48] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (VariableDescriptor..VariableDescriptor?), out (List<KtExpression>..List<KtExpression>?)>..Map<out (VariableDescriptor..VariableDescriptor?), (List<KtExpression>..List<KtExpression>?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)
    <V : (Any..Any?)> -> (kotlin.collections.List<org.jetbrains.kotlin.psi.KtExpression>..kotlin.collections.List<org.jetbrains.kotlin.psi.KtExpression>?)

'modifiedVarDescriptorsWithExpressions' @ [658:56] ==> val modifiedVarDescriptorsWithExpressions: Map<VariableDescriptor, List<KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'modifiedVarDescriptorsForControlFlow' @ [659:5] ==> val modifiedVarDescriptorsForControlFlow: HashMap<(VariableDescriptor..VariableDescriptor?), (List<KtExpression>..List<KtExpression>?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'keys' @ [659:42] ==> public open val keys: MutableSet<(VariableDescriptor..VariableDescriptor?)> defined in java.util.HashMap[JavaPropertyDescriptor]

'retainAll' @ [659:47] ==> public abstract fun retainAll(elements: Collection<(VariableDescriptor..VariableDescriptor?)>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'localInstructions' @ [659:57] ==> val localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'getVarDescriptorsAccessedAfterwards' @ [659:75] ==> private fun List<Instruction>.getVarDescriptorsAccessedAfterwards(bindingContext: BindingContext): Set<VariableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [659:111] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'component1' @ [660:10] ==> public final operator fun component1(): ControlFlow defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [660:23] ==> public final operator fun component2(): AnalysisResult.ErrorMessage? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'analyzeControlFlow' @ [661:13] ==> private fun ExtractionData.analyzeControlFlow(localInstructions: List<Instruction>, pseudocode: Pseudocode, module: ModuleDescriptor, bindingContext: BindingContext, modifiedVarDescriptors: Map<VariableDescriptor, List<KtExpression>>, options: ExtractionOptions, targetScope: LexicalScope?, parameters: Set<Parameter>): Pair<ControlFlow, AnalysisResult.ErrorMessage?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'localInstructions' @ [662:21] ==> val localInstructions: List<Instruction> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'pseudocode' @ [663:21] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'originalFile' @ [664:21] ==> public final val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'findModuleDescriptor' @ [664:34] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [665:21] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'modifiedVarDescriptorsForControlFlow' @ [666:21] ==> val modifiedVarDescriptorsForControlFlow: HashMap<(VariableDescriptor..VariableDescriptor?), (List<KtExpression>..List<KtExpression>?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'options' @ [667:21] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetScope' @ [668:21] ==> val targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'paramsInfo' @ [669:21] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'parameters' @ [669:32] ==> public final val parameters: LinkedHashSet<MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'controlFlowMessage' @ [671:5] ==> val controlFlowMessage: AnalysisResult.ErrorMessage? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'let' @ [671:25] ==> @InlineOnly public inline fun <T, R> AnalysisResult.ErrorMessage.let(block: (AnalysisResult.ErrorMessage) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage
    <R> -> Boolean

'messages' @ [671:31] ==> val messages: ArrayList<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'add' @ [671:40] ==> public open fun add(element: AnalysisResult.ErrorMessage): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [671:44] ==> value-parameter it: AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'controlFlow' @ [673:22] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'outputValueBoxer' @ [673:34] ==> public final val outputValueBoxer: OutputValueBoxer defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'returnType' @ [673:51] ==> public abstract val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValueBoxer[PropertyDescriptorImpl]

'returnType' @ [674:5] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'processTypeIfExtractable' @ [674:16] ==> internal fun KotlinType.processTypeIfExtractable(typeParameters: MutableSet<TypeParameter>, nonDenotableTypes: MutableSet<KotlinType>, options: ExtractionOptions, targetScope: LexicalScope?, processTypeArguments: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'paramsInfo' @ [674:41] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'typeParameters' @ [674:52] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'paramsInfo' @ [674:68] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'nonDenotableTypes' @ [674:79] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'options' @ [674:98] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetScope' @ [674:107] ==> val targetScope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'paramsInfo' @ [676:9] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'nonDenotableTypes' @ [676:20] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'isNotEmpty' @ [676:38] ==> @InlineOnly public inline fun <T> Collection<KotlinType>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'paramsInfo' @ [677:23] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'nonDenotableTypes' @ [677:34] ==> public final val nonDenotableTypes: HashSet<KotlinType> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'map' @ [677:52] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'it' @ [677:57] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'renderForMessage' @ [677:60] ==> private fun KotlinType.renderForMessage(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'sorted' @ [677:80] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'AnalysisResult' @ [678:16] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'CRITICAL_ERROR' @ [680:24] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'listOf' @ [681:17] ==> public fun <T> listOf(element: AnalysisResult.ErrorMessage): List<AnalysisResult.ErrorMessage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'addAdditionalInfo' @ [681:53] ==> public final fun addAdditionalInfo(info: List<String>): AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'typeStr' @ [681:71] ==> val typeStr: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'commonParent' @ [685:32] ==> public final val commonParent: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'getStrictParentOfType' @ [685:45] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'checkDeclarationsMovingOutOfScope' @ [686:5] ==> private fun ExtractionData.checkDeclarationsMovingOutOfScope(enclosingDeclaration: KtDeclaration, controlFlow: ControlFlow, bindingContext: BindingContext): AnalysisResult.ErrorMessage? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'enclosingDeclaration' @ [686:39] ==> val enclosingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'controlFlow' @ [686:61] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'bindingContext' @ [686:74] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'let' @ [686:91] ==> @InlineOnly public inline fun <T, R> AnalysisResult.ErrorMessage.let(block: (AnalysisResult.ErrorMessage) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage
    <R> -> Boolean

'messages' @ [686:97] ==> val messages: ArrayList<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'add' @ [686:106] ==> public open fun add(element: AnalysisResult.ErrorMessage): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [686:110] ==> value-parameter it: AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'controlFlow' @ [688:5] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'jumpOutputValue' @ [688:17] ==> public final val jumpOutputValue: OutputValue.Jump? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ControlFlow[PropertyDescriptorImpl]

'elementToInsertAfterCall' @ [688:34] ==> public final val elementToInsertAfterCall: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.OutputValue.Jump[PropertyDescriptorImpl]

'accept' @ [688:60] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [689:22] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'paramsInfo' @ [691:21] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'originalRefToParameter' @ [691:32] ==> public final val originalRefToParameter: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (MutableParameter..MutableParameter?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'expression' @ [691:55] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'firstOrNull' @ [691:67] ==> public fun <T> Iterable<(MutableParameter..MutableParameter?)>.firstOrNull(): MutableParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter..org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter?)

'let' @ [691:82] ==> @InlineOnly public inline fun <T, R> MutableParameter.let(block: (MutableParameter) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableParameter
    <R> -> Int

'it' @ [691:88] ==> value-parameter it: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'refCount' @ [691:91] ==> public final var refCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'paramsInfo' @ [695:30] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'parameters' @ [695:41] ==> public final val parameters: LinkedHashSet<MutableParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'filterTo' @ [695:52] ==> public inline fun <T, C : MutableCollection<in MutableParameter>> Iterable<MutableParameter>.filterTo(destination: LinkedHashSet<Parameter>, predicate: (MutableParameter) -> Boolean): LinkedHashSet<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableParameter
    <C : MutableCollection<in T>> -> LinkedHashSet<Parameter>

'LinkedHashSet' @ [695:61] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Parameter

'it' @ [695:91] ==> value-parameter it: MutableParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'refCount' @ [695:94] ==> public final var refCount: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.MutableParameter[PropertyDescriptorImpl]

'adjustedParameters' @ [697:30] ==> val adjustedParameters: LinkedHashSet<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'filterTo' @ [697:49] ==> public inline fun <T, C : MutableCollection<in Parameter>> Iterable<Parameter>.filterTo(destination: HashSet<Parameter>, predicate: (Parameter) -> Boolean): HashSet<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <C : MutableCollection<in T>> -> HashSet<Parameter>

'HashSet' @ [697:58] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Parameter

'it' @ [697:82] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'receiverCandidate' @ [697:85] ==> public abstract val receiverCandidate: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'if (receiverCandidates.size == 1 && !options.canWrapInWith) receiverCandidates.first() else null' @ [698:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Parameter?, elseBranch: Parameter?): Parameter?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Parameter?

'receiverCandidates' @ [698:33] ==> val receiverCandidates: HashSet<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'size' @ [698:52] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'!' @ [698:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [698:66] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'canWrapInWith' @ [698:74] ==> public final val canWrapInWith: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'receiverCandidates' @ [698:89] ==> val receiverCandidates: HashSet<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'first' @ [698:108] ==> public fun <T> Iterable<Parameter>.first(): Parameter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'receiverParameter' @ [699:5] ==> val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'let' @ [699:24] ==> @InlineOnly public inline fun <T, R> Parameter.let(block: (Parameter) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter
    <R> -> Boolean

'adjustedParameters' @ [699:30] ==> val adjustedParameters: LinkedHashSet<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'remove' @ [699:49] ==> public open fun remove(element: Parameter): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'it' @ [699:56] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'ExtractableCodeDescriptor' @ [701:22] ==> public constructor ExtractableCodeDescriptor(extractionData: ExtractionData, originalContext: BindingContext, suggestedNames: List<String>, visibility: String, parameters: List<Parameter>, receiverParameter: Parameter?, typeParameters: List<TypeParameter>, replacementMap: MultiMap<KtSimpleNameExpression, Replacement>, controlFlow: ControlFlow, returnType: KotlinType, modifiers: List<KtKeywordToken> = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[ClassConstructorDescriptorImpl]

'this' @ [702:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[ReceiverParameterDescriptorImpl]

'bindingContext' @ [703:13] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'suggestFunctionNames' @ [704:13] ==> private fun ExtractionData.suggestFunctionNames(returnType: KotlinType): List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'returnType' @ [704:34] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'getDefaultVisibility' @ [705:13] ==> public fun ExtractionData.getDefaultVisibility(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'adjustedParameters' @ [706:13] ==> val adjustedParameters: LinkedHashSet<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'toList' @ [706:32] ==> public fun <T> Iterable<Parameter>.toList(): List<Parameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'receiverParameter' @ [707:13] ==> val receiverParameter: Parameter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'paramsInfo' @ [708:13] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'typeParameters' @ [708:24] ==> public final val typeParameters: HashSet<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'sortedBy' @ [708:39] ==> public inline fun <T, R : Comparable<String>> Iterable<TypeParameter>.sortedBy(crossinline selector: (TypeParameter) -> String?): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R : Comparable<R>> -> String

'it' @ [708:50] ==> value-parameter it: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'originalDeclaration' @ [708:53] ==> public final val originalDeclaration: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.TypeParameter[PropertyDescriptorImpl]

'name' @ [708:73] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'paramsInfo' @ [709:13] ==> val paramsInfo: ParametersInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'replacementMap' @ [709:24] ==> public final val replacementMap: MultiMap<(KtSimpleNameExpression..KtSimpleNameExpression?), (Replacement..Replacement?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ParametersInfo[PropertyDescriptorImpl]

'if (messages.isEmpty()) controlFlow else controlFlow.toDefault()' @ [710:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ControlFlow, elseBranch: ControlFlow): ControlFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ControlFlow

'messages' @ [710:17] ==> val messages: ArrayList<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'isEmpty' @ [710:26] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'controlFlow' @ [710:37] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'controlFlow' @ [710:54] ==> val controlFlow: ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'toDefault' @ [710:66] ==> public fun ControlFlow.toDefault(): ControlFlow defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[SimpleFunctionDescriptorImpl]

'returnType' @ [711:13] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'emptyList' @ [712:13] ==> public fun <T> emptyList(): List<KtKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtKeywordToken

'ExtractionGeneratorConfiguration' @ [715:16] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[ClassConstructorDescriptorImpl]

'descriptor' @ [716:13] ==> var descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'ExtractionGeneratorOptions' @ [717:13] ==> public constructor ExtractionGeneratorOptions(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[ClassConstructorDescriptorImpl]

'generateDeclaration' @ [718:7] ==> public fun ExtractionGeneratorConfiguration.generateDeclaration(declarationToReplace: KtNamedDeclaration? = ...): ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [718:29] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'getGeneratedBody' @ [718:41] ==> internal fun KtNamedDeclaration.getGeneratedBody(): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'body' @ [719:26] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'analyzeFully' @ [719:31] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'virtualContext' @ [720:9] ==> val virtualContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'diagnostics' @ [720:24] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'all' @ [720:36] ==> public abstract fun all(): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'any' @ [720:42] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [720:48] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [720:51] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'ILLEGAL_SUSPEND_FUNCTION_CALL' @ [720:69] ==> public final val ILLEGAL_SUSPEND_FUNCTION_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'descriptor' @ [721:9] ==> var descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'descriptor' @ [721:22] ==> var descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'copy' @ [721:33] ==> public final fun copy(extractionData: ExtractionData = ..., originalContext: BindingContext = ..., suggestedNames: List<String> = ..., visibility: String = ..., parameters: List<Parameter> = ..., receiverParameter: Parameter? = ..., typeParameters: List<TypeParameter> = ..., replacementMap: MultiMap<KtSimpleNameExpression, Replacement> = ..., controlFlow: ControlFlow = ..., returnType: KotlinType = ..., modifiers: List<KtKeywordToken> = ...): ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[SimpleFunctionDescriptorImpl]

'listOf' @ [721:50] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'SUSPEND_KEYWORD' @ [721:66] ==> public final val SUSPEND_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'AnalysisResult' @ [725:12] ==> public constructor AnalysisResult(descriptor: ExtractableCodeDescriptor?, status: AnalysisResult.Status, messages: List<AnalysisResult.ErrorMessage>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[ClassConstructorDescriptorImpl]

'descriptor' @ [726:13] ==> var descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'if (messages.isEmpty()) Status.SUCCESS else Status.NON_CRITICAL_ERROR' @ [727:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisResult.Status, elseBranch: AnalysisResult.Status): AnalysisResult.Status[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Status

'messages' @ [727:17] ==> val messages: ArrayList<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'isEmpty' @ [727:26] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SUCCESS' @ [727:44] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'NON_CRITICAL_ERROR' @ [727:64] ==> enum entry NON_CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'messages' @ [728:13] ==> val messages: ArrayList<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.performAnalysis[LocalVariableDescriptor]

'LinkedHashSet' @ [733:25] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'NewDeclarationNameValidator' @ [736:13] ==> public constructor NewDeclarationNameValidator(container: PsiElement, anchor: PsiElement?, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'targetSibling' @ [737:21] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'parent' @ [737:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (targetSibling is KtAnonymousInitializer) targetSibling.parent else targetSibling' @ [738:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'targetSibling' @ [738:25] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'targetSibling' @ [738:66] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'parent' @ [738:80] ==> public final val KtAnonymousInitializer.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetSibling' @ [738:92] ==> public final val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'if (options.extractAsProperty) NewDeclarationNameValidator.Target.VARIABLES else NewDeclarationNameValidator.Target.FUNCTIONS_AND_CLASSES' @ [739:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NewDeclarationNameValidator.Target, elseBranch: NewDeclarationNameValidator.Target): NewDeclarationNameValidator.Target[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Target

'options' @ [739:25] ==> public final val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'extractAsProperty' @ [739:33] ==> public final val extractAsProperty: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[PropertyDescriptorImpl]

'VARIABLES' @ [739:87] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'FUNCTIONS_AND_CLASSES' @ [739:137] ==> enum entry FUNCTIONS_AND_CLASSES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'!' @ [741:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [741:10] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[ValueParameterDescriptorImpl]

'isDefault' @ [741:21] ==> internal fun KotlinType.isDefault(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'functionNames' @ [742:9] ==> val functionNames: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[LocalVariableDescriptor]

'addAll' @ [742:23] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'suggestNamesByType' @ [742:50] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'returnType' @ [742:69] ==> value-parameter returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[ValueParameterDescriptorImpl]

'validator' @ [742:81] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[LocalVariableDescriptor]

'expressions' @ [745:5] ==> public final val expressions: List<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'singleOrNull' @ [745:17] ==> public fun <T> List<KtExpression>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'let' @ [745:33] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'expr' @ [746:24] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [746:29] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [747:13] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames.<anonymous>[LocalVariableDescriptor]

'initializer' @ [747:23] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'expr' @ [747:38] ==> value-parameter expr: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [748:13] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames.<anonymous>[LocalVariableDescriptor]

'name' @ [748:22] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'let' @ [748:28] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'functionNames' @ [748:34] ==> val functionNames: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[LocalVariableDescriptor]

'add' @ [748:48] ==> public open fun add(element: String): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'suggestNameByName' @ [748:72] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'+' @ [748:90] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [748:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'capitalize' @ [748:101] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'validator' @ [748:115] ==> val validator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[LocalVariableDescriptor]

'functionNames' @ [752:12] ==> val functionNames: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.suggestFunctionNames[LocalVariableDescriptor]

'toList' @ [752:26] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'when (this) {
            is KtNamedFunction -> bodyExpression
            else -> {
                val property = this as KtProperty

                property.getter?.bodyExpression?.let { return it }
                property.initializer?.let { return it }
                // We assume lazy property here with delegate expression 'by Delegates.lazy { body }'
                property.delegateExpression?.let {
                    val call = it.getCalleeExpressionIfAny()?.parent as? KtCallExpression
                    call?.lambdaArguments?.singleOrNull()?.getLambdaExpression()?.bodyExpression
                }
            }
        }' @ [756:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'this' @ [756:15] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody[ReceiverParameterDescriptorImpl]

'bodyExpression' @ [757:35] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [759:32] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody[ReceiverParameterDescriptorImpl]

'property' @ [761:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody[LocalVariableDescriptor]

'getter' @ [761:26] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'bodyExpression' @ [761:34] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [761:50] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'it' @ [761:63] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [762:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody[LocalVariableDescriptor]

'initializer' @ [762:26] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'let' @ [762:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'it' @ [762:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody.<anonymous>[ValueParameterDescriptorImpl]

'property' @ [764:17] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody[LocalVariableDescriptor]

'delegateExpression' @ [764:26] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [764:46] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtBlockExpression?): KtBlockExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtBlockExpression?

'it' @ [765:32] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody.<anonymous>[ValueParameterDescriptorImpl]

'getCalleeExpressionIfAny' @ [765:35] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'parent' @ [765:63] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'call' @ [766:21] ==> val call: KtCallExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.getGeneratedBody.<anonymous>[LocalVariableDescriptor]

'lambdaArguments' @ [766:27] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [766:44] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.singleOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [766:60] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [766:83] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'AssertionError' @ [769:20] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'getElementTextWithContext' @ [769:84] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'JvmOverloads' @ [771:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'ExtractionTarget' @ [772:67] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'FUNCTION' @ [772:84] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'getDescription' @ [774:48] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'declaration' @ [774:63] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[ValueParameterDescriptorImpl]

'message' @ [775:47] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'messageKey' @ [775:55] ==> value-parameter messageKey: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[ValueParameterDescriptorImpl]

'declarationStr' @ [775:67] ==> val declarationStr: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[LocalVariableDescriptor]

'if (capitalize) message.capitalize() else message' @ [776:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'capitalize' @ [776:20] ==> value-parameter capitalize: Boolean = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[ValueParameterDescriptorImpl]

'message' @ [776:32] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[LocalVariableDescriptor]

'capitalize' @ [776:40] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'message' @ [776:58] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.getDeclarationMessage[LocalVariableDescriptor]

'MultiMap' @ [779:21] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'ExtractionGeneratorConfiguration' @ [781:18] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[ClassConstructorDescriptorImpl]

'this' @ [782:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[ReceiverParameterDescriptorImpl]

'ExtractionGeneratorOptions' @ [783:13] ==> public constructor ExtractionGeneratorOptions(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[ClassConstructorDescriptorImpl]

'target' @ [783:97] ==> value-parameter target: ExtractionTarget = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[ValueParameterDescriptorImpl]

'generateDeclaration' @ [784:7] ==> public fun ExtractionGeneratorConfiguration.generateDeclaration(declarationToReplace: KtNamedDeclaration? = ...): ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'result' @ [786:31] ==> val result: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'declaration' @ [786:38] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'valueParameterList' @ [786:72] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'result' @ [787:30] ==> val result: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'declaration' @ [787:37] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'typeParameterList' @ [787:71] ==> public final val KtNamedFunction.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'result' @ [788:16] ==> val result: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'declaration' @ [788:23] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'getGeneratedBody' @ [788:35] ==> internal fun KtNamedDeclaration.getGeneratedBody(): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'body' @ [789:26] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'analyzeFully' @ [789:31] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'currentRefExpr' @ [792:29] ==> value-parameter currentRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[ValueParameterDescriptorImpl]

'resolveResult' @ [792:44] ==> internal var KtSimpleNameExpression.resolveResult: ResolveResult? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractionData.kt[PropertyDescriptorImpl]

'currentRefExpr' @ [793:13] ==> value-parameter currentRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[ValueParameterDescriptorImpl]

'parent' @ [793:28] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'bindingContext' @ [795:27] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'diagnostics' @ [795:42] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [795:54] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'currentRefExpr' @ [795:65] ==> value-parameter currentRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[ValueParameterDescriptorImpl]

'bindingContext' @ [797:33] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [797:63] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'currentRefExpr' @ [797:81] ==> value-parameter currentRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[ValueParameterDescriptorImpl]

'currentDescriptor' @ [799:17] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'let' @ [799:36] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtilsIde' @ [799:42] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [799:69] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'extractionData' @ [799:87] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'project' @ [799:102] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'it' @ [799:111] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[ValueParameterDescriptorImpl]

'currentTarget' @ [800:13] ==> val currentTarget: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'currentTarget' @ [800:45] ==> val currentTarget: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'parent' @ [800:59] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'valueParameterList' @ [800:69] ==> val valueParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'currentTarget' @ [801:13] ==> val currentTarget: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'currentTarget' @ [801:49] ==> val currentTarget: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'parent' @ [801:63] ==> public final val KtTypeParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'typeParameterList' @ [801:73] ==> val typeParameterList: KtTypeParameterList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'currentDescriptor' @ [802:13] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'parameters' @ [803:16] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'any' @ [803:27] ==> public inline fun <T> Iterable<Parameter>.any(predicate: (Parameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Parameter

'it' @ [803:33] ==> value-parameter it: Parameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[ValueParameterDescriptorImpl]

'mirrorVarName' @ [803:36] ==> public abstract val mirrorVarName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.Parameter[PropertyDescriptorImpl]

'currentDescriptor' @ [803:53] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'name' @ [803:71] ==> public final val LocalVariableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [803:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'diagnostics' @ [805:13] ==> val diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'any' @ [805:25] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [805:31] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [805:34] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'UNRESOLVED_REFERENCE_DIAGNOSTICS' @ [805:52] ==> public final val UNRESOLVED_REFERENCE_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'currentDescriptor' @ [806:17] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'!' @ [807:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [807:32] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'currentDescriptor' @ [807:40] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'!' @ [808:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'compareDescriptors' @ [808:21] ==> public fun compareDescriptors(project: Project, currentDescriptor: DeclarationDescriptor?, originalDescriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'extractionData' @ [808:40] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'project' @ [808:55] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'currentDescriptor' @ [808:64] ==> val currentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'resolveResult' @ [808:83] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'descriptor' @ [808:97] ==> public final val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'conflicts' @ [809:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'putValue' @ [809:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'resolveResult' @ [810:21] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'originalRefExpr' @ [810:35] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'getDeclarationMessage' @ [811:21] ==> local final fun getDeclarationMessage(declaration: PsiElement, messageKey: String, capitalize: Boolean = ...): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[SimpleFunctionDescriptorImpl]

'resolveResult' @ [811:43] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'declaration' @ [811:57] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'diagnostics' @ [816:9] ==> val diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'firstOrNull' @ [816:21] ==> public inline fun <T> Iterable<Diagnostic>.firstOrNull(predicate: (Diagnostic) -> Boolean): Diagnostic? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [816:35] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [816:38] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'INVISIBLE_REFERENCE_DIAGNOSTICS' @ [816:56] ==> public final val INVISIBLE_REFERENCE_DIAGNOSTICS: (ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>..ImmutableSet<out (DiagnosticFactory<*>..DiagnosticFactory<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'let' @ [816:91] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'when (it.factory) {
                Errors.INVISIBLE_SETTER ->
                    getDeclarationMessage(resolveResult.declaration, "setter.of.0.will.become.invisible.after.extraction", false)
                else ->
                    getDeclarationMessage(resolveResult.declaration, "0.will.become.invisible.after.extraction")
            }' @ [817:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [817:33] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [817:36] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'INVISIBLE_SETTER' @ [818:24] ==> public final val INVISIBLE_SETTER: (DiagnosticFactory3<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'getDeclarationMessage' @ [819:21] ==> local final fun getDeclarationMessage(declaration: PsiElement, messageKey: String, capitalize: Boolean = ...): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[SimpleFunctionDescriptorImpl]

'resolveResult' @ [819:43] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'declaration' @ [819:57] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'getDeclarationMessage' @ [821:21] ==> local final fun getDeclarationMessage(declaration: PsiElement, messageKey: String, capitalize: Boolean = ...): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[SimpleFunctionDescriptorImpl]

'resolveResult' @ [821:43] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'declaration' @ [821:57] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'conflicts' @ [823:13] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'putValue' @ [823:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'resolveResult' @ [823:32] ==> val resolveResult: ResolveResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference[LocalVariableDescriptor]

'originalRefExpr' @ [823:46] ==> public final val originalRefExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ResolveResult[PropertyDescriptorImpl]

'message' @ [823:63] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.processReference.<anonymous>[LocalVariableDescriptor]

'result' @ [827:5] ==> val result: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'declaration' @ [827:12] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'accept' @ [827:24] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [828:22] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'userType' @ [830:35] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'referenceExpression' @ [830:44] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'bindingContext' @ [831:39] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'diagnostics' @ [831:54] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [831:66] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'refExpr' @ [831:77] ==> val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType[LocalVariableDescriptor]

'diagnostics' @ [832:21] ==> val diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType[LocalVariableDescriptor]

'firstOrNull' @ [832:33] ==> public inline fun <T> Iterable<Diagnostic>.firstOrNull(predicate: (Diagnostic) -> Boolean): Diagnostic? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [832:47] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [832:50] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'INVISIBLE_REFERENCE' @ [832:68] ==> public final val INVISIBLE_REFERENCE: (DiagnosticFactory3<(KtSimpleNameExpression..KtSimpleNameExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtSimpleNameExpression..KtSimpleNameExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'let' @ [832:91] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'refExpr' @ [833:43] ==> val refExpr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType[LocalVariableDescriptor]

'mainReference' @ [833:51] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [833:65] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'conflicts' @ [834:25] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'putValue' @ [834:35] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'declaration' @ [834:44] ==> val declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType.<anonymous>[LocalVariableDescriptor]

'getDeclarationMessage' @ [834:57] ==> local final fun getDeclarationMessage(declaration: PsiElement, messageKey: String, capitalize: Boolean = ...): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[SimpleFunctionDescriptorImpl]

'declaration' @ [834:79] ==> val declaration: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitUserType.<anonymous>[LocalVariableDescriptor]

'processReference' @ [839:21] ==> local final fun processReference(currentRefExpr: KtSimpleNameExpression): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[SimpleFunctionDescriptorImpl]

'expression' @ [839:38] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'ExtractableCodeDescriptorWithConflicts' @ [844:12] ==> public constructor ExtractableCodeDescriptorWithConflicts(descriptor: ExtractableCodeDescriptor, conflicts: MultiMap<PsiElement, String>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[ClassConstructorDescriptorImpl]

'this' @ [844:51] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[ReceiverParameterDescriptorImpl]

'conflicts' @ [844:57] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.validate[LocalVariableDescriptor]

'getInstance' @ [847:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ExtractionEngine' @ [847:38] ==> public constructor ExtractionEngine(helper: ExtractionEngineHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[ClassConstructorDescriptorImpl]

'java' @ [847:62] ==> public val <T> KClass<ExtractionEngine>.java: Class<ExtractionEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExtractionEngine

