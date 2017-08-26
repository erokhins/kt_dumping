'PseudocodeVariableDataCollector' @ [36:51] ==> public constructor PseudocodeVariableDataCollector(bindingContext: BindingContext, pseudocode: Pseudocode) defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[ClassConstructorDescriptorImpl]

'bindingContext' @ [36:83] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'pseudocode' @ [36:99] ==> public final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'hashMapOf' @ [38:51] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Pseudocode, Set<VariableDescriptor>> /* = HashMap<Pseudocode, Set<VariableDescriptor>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pseudocode
    <V> -> Set<VariableDescriptor>

'getValue' @ [40:79] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'computeVariableInitializers' @ [41:9] ==> private final fun computeVariableInitializers(): Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocodeVariableDataCollector' @ [45:17] ==> private final val pseudocodeVariableDataCollector: PseudocodeVariableDataCollector defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [45:49] ==> public final val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'includeInsideLocalDeclarations' @ [48:14] ==> value-parameter includeInsideLocalDeclarations: Boolean defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[ValueParameterDescriptorImpl]

'getUpperLevelDeclaredVariables' @ [49:20] ==> private final fun getUpperLevelDeclaredVariables(pseudocode: Pseudocode): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocode' @ [49:51] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[ValueParameterDescriptorImpl]

'linkedSetOf' @ [51:33] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'declaredVariables' @ [52:9] ==> val declaredVariables: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[LocalVariableDescriptor]

'addAll' @ [52:27] ==> public open fun addAll(elements: Collection<VariableDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getUpperLevelDeclaredVariables' @ [52:34] ==> private final fun getUpperLevelDeclaredVariables(pseudocode: Pseudocode): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocode' @ [52:65] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[ValueParameterDescriptorImpl]

'pseudocode' @ [54:53] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[ValueParameterDescriptorImpl]

'localDeclarations' @ [54:64] ==> public abstract val localDeclarations: Set<LocalFunctionDeclarationInstruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'localFunctionDeclarationInstruction' @ [55:35] ==> val localFunctionDeclarationInstruction: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[LocalVariableDescriptor]

'body' @ [55:71] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'declaredVariables' @ [56:13] ==> val declaredVariables: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[LocalVariableDescriptor]

'addAll' @ [56:31] ==> public open fun addAll(elements: Collection<VariableDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getUpperLevelDeclaredVariables' @ [56:38] ==> private final fun getUpperLevelDeclaredVariables(pseudocode: Pseudocode): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'localPseudocode' @ [56:69] ==> val localPseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[LocalVariableDescriptor]

'declaredVariables' @ [58:16] ==> val declaredVariables: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getDeclaredVariables[LocalVariableDescriptor]

'declaredVariablesForDeclaration' @ [62:33] ==> private final val declaredVariablesForDeclaration: HashMap<Pseudocode, Set<VariableDescriptor>> /* = HashMap<Pseudocode, Set<VariableDescriptor>> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'pseudocode' @ [62:65] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[ValueParameterDescriptorImpl]

'declaredVariables' @ [63:13] ==> var declaredVariables: Set<VariableDescriptor>? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[LocalVariableDescriptor]

'declaredVariables' @ [64:13] ==> var declaredVariables: Set<VariableDescriptor>? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[LocalVariableDescriptor]

'computeDeclaredVariablesForPseudocode' @ [64:33] ==> private final fun computeDeclaredVariablesForPseudocode(pseudocode: Pseudocode): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocode' @ [64:71] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[ValueParameterDescriptorImpl]

'declaredVariablesForDeclaration' @ [65:13] ==> private final val declaredVariablesForDeclaration: HashMap<Pseudocode, Set<VariableDescriptor>> /* = HashMap<Pseudocode, Set<VariableDescriptor>> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'put' @ [65:45] ==> public open fun put(key: Pseudocode, value: Set<VariableDescriptor>): Set<VariableDescriptor>? defined in java.util.HashMap[JavaMethodDescriptor]

'pseudocode' @ [65:49] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[ValueParameterDescriptorImpl]

'declaredVariables' @ [65:61] ==> var declaredVariables: Set<VariableDescriptor>? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[LocalVariableDescriptor]

'declaredVariables' @ [67:16] ==> var declaredVariables: Set<VariableDescriptor>? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.getUpperLevelDeclaredVariables[LocalVariableDescriptor]

'linkedSetOf' @ [71:33] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'pseudocode' @ [72:29] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[ValueParameterDescriptorImpl]

'instructions' @ [72:40] ==> public abstract val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'instruction' @ [73:17] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'instruction' @ [74:50] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'variableDeclarationElement' @ [74:62] ==> public final val variableDeclarationElement: KtDeclaration defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'bindingContext' @ [75:34] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'get' @ [75:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [75:68] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDeclarationElement' @ [75:95] ==> val variableDeclarationElement: KtDeclaration defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'variableDescriptorForDeclaration' @ [76:17] ==> @Nullable public open fun variableDescriptorForDeclaration(@Nullable descriptor: DeclarationDescriptor?): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'descriptor' @ [76:50] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'let' @ [76:63] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Boolean

'declaredVariables' @ [77:21] ==> val declaredVariables: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'add' @ [77:39] ==> public open fun add(element: VariableDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'it' @ [77:43] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode.<anonymous>[ValueParameterDescriptorImpl]

'unmodifiableSet' @ [81:28] ==> public open fun <T : (Any..Any?)> unmodifiableSet(p0: (MutableSet<out (VariableDescriptor..VariableDescriptor?)>..Set<(VariableDescriptor..VariableDescriptor?)>?)): (MutableSet<(VariableDescriptor..VariableDescriptor?)>..Set<(VariableDescriptor..VariableDescriptor?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'declaredVariables' @ [81:44] ==> val declaredVariables: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeDeclaredVariablesForPseudocode[LocalVariableDescriptor]

'pseudocodeVariableDataCollector' @ [88:38] ==> private final val pseudocodeVariableDataCollector: PseudocodeVariableDataCollector defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [88:70] ==> public final val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'pseudocodeVariableDataCollector' @ [90:16] ==> private final val pseudocodeVariableDataCollector: PseudocodeVariableDataCollector defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'collectData' @ [90:48] ==> public final fun <I : ControlFlowInfo<*, *>> collectData(traversalOrder: TraversalOrder, initialInfo: InitControlFlowInfo, instructionDataMergeStrategy: (Instruction, Collection<InitControlFlowInfo>) -> Edges<InitControlFlowInfo>): Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> InitControlFlowInfo

'FORWARD' @ [90:75] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'InitControlFlowInfo' @ [90:84] ==> public constructor InitControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ = ...) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[ClassConstructorDescriptorImpl]

'mergeIncomingEdgesDataForInitializers' @ [93:40] ==> private final fun mergeIncomingEdgesDataForInitializers(instruction: Instruction, incomingEdgesData: Collection<InitControlFlowInfo>, blockScopeVariableInfo: BlockScopeVariableInfo): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[SimpleFunctionDescriptorImpl]

'instruction' @ [93:78] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[ValueParameterDescriptorImpl]

'incomingEdgesData' @ [93:91] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[ValueParameterDescriptorImpl]

'blockScopeVariableInfo' @ [93:110] ==> val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers[LocalVariableDescriptor]

'addVariableInitStateFromCurrentInstructionIfAny' @ [94:39] ==> private final fun addVariableInitStateFromCurrentInstructionIfAny(instruction: Instruction, enterInstructionData: InitControlFlowInfo, blockScopeVariableInfo: BlockScopeVariableInfo): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'instruction' @ [95:21] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[ValueParameterDescriptorImpl]

'enterInstructionData' @ [95:34] ==> val enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[LocalVariableDescriptor]

'blockScopeVariableInfo' @ [95:56] ==> val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers[LocalVariableDescriptor]

'Edges' @ [96:13] ==> public constructor Edges<out T>(incoming: InitControlFlowInfo, outgoing: InitControlFlowInfo) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> InitControlFlowInfo

'enterInstructionData' @ [96:19] ==> val enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[LocalVariableDescriptor]

'exitInstructionData' @ [96:41] ==> val exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.computeVariableInitializers.<anonymous>[LocalVariableDescriptor]

'instruction' @ [104:13] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'instruction' @ [105:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'kind' @ [105:29] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'EXHAUSTIVE_WHEN_ELSE' @ [105:48] ==> enum entry EXHAUSTIVE_WHEN_ELSE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'enterInstructionData' @ [106:24] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'iterator' @ [106:45] ==> public open fun iterator(): Iterator<(Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>?)> defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[JavaMethodDescriptor]

'fold' @ [106:56] ==> public inline fun <T, R> Iterable<(Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>?)>.fold(initial: InitControlFlowInfo, operation: (acc: InitControlFlowInfo, (Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableControlFlowState..VariableControlFlowState?)>?)) -> InitControlFlowInfo): InitControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javaslang.Tuple2<(org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?), (org.jetbrains.kotlin.cfg.VariableControlFlowState..org.jetbrains.kotlin.cfg.VariableControlFlowState?)>..javaslang.Tuple2<(org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?), (org.jetbrains.kotlin.cfg.VariableControlFlowState..org.jetbrains.kotlin.cfg.VariableControlFlowState?)>?)
    <R> -> InitControlFlowInfo

'enterInstructionData' @ [106:61] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'component1' @ [107:30] ==> public operator fun <T> Tuple2<(VariableDescriptor..VariableDescriptor?), *>.component1(): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'component2' @ [107:35] ==> public operator fun <T> Tuple2<*, (VariableControlFlowState..VariableControlFlowState?)>.component2(): (VariableControlFlowState..VariableControlFlowState?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.VariableControlFlowState..org.jetbrains.kotlin.cfg.VariableControlFlowState?)

'if (!value.definitelyInitialized()) {
                        result.put(key, VariableControlFlowState.createInitializedExhaustively(value.isDeclared))
                    }
                    else result' @ [108:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InitControlFlowInfo, elseBranch: InitControlFlowInfo): InitControlFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InitControlFlowInfo

'!' @ [108:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'value' @ [108:26] ==> val value: (VariableControlFlowState..VariableControlFlowState?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny.<anonymous>[LocalVariableDescriptor]

'definitelyInitialized' @ [108:32] ==> public final fun definitelyInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'result' @ [109:25] ==> value-parameter result: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny.<anonymous>[ValueParameterDescriptorImpl]

'put' @ [109:32] ==> public open fun put(key: VariableDescriptor, value: VariableControlFlowState): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[SimpleFunctionDescriptorImpl]

'key' @ [109:36] ==> val key: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny.<anonymous>[LocalVariableDescriptor]

'createInitializedExhaustively' @ [109:66] ==> public final fun createInitializedExhaustively(isDeclared: Boolean): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'value' @ [109:96] ==> val value: (VariableControlFlowState..VariableControlFlowState?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny.<anonymous>[LocalVariableDescriptor]

'isDeclared' @ [109:102] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'result' @ [111:26] ==> value-parameter result: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [115:13] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'instruction' @ [115:54] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'enterInstructionData' @ [116:20] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'?:' @ [118:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VariableDescriptor?, right: VariableDescriptor): VariableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VariableDescriptor

'extractVariableDescriptorIfAny' @ [118:39] ==> @Nullable public open fun extractVariableDescriptorIfAny(@NotNull instruction: Instruction, @NotNull bindingContext: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [118:70] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'bindingContext' @ [118:83] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'enterInstructionData' @ [118:109] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'enterInstructionData' @ [119:35] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'if (instruction is WriteValueInstruction) {
            // if writing to already initialized object
            if (!PseudocodeUtil.isThisOrNoDispatchReceiver(instruction, bindingContext)) {
                return enterInstructionData
            }

            val enterInitState = enterInstructionData.getOrNull(variable)
            val initializationAtThisElement = VariableControlFlowState.create(instruction.element is KtProperty, enterInitState)
            exitInstructionData = exitInstructionData.put(variable, initializationAtThisElement, enterInitState)
        }
        else {
            // instruction instanceof VariableDeclarationInstruction
            var enterInitState: VariableControlFlowState? = enterInstructionData.getOrNull(variable)
            if (enterInitState == null) {
                enterInitState = getDefaultValueForInitializers(variable, instruction, blockScopeVariableInfo)
            }
            if (!enterInitState.mayBeInitialized() || !enterInitState.isDeclared) {
                val variableDeclarationInfo = VariableControlFlowState.create(enterInitState.initState, isDeclared = true)
                exitInstructionData = exitInstructionData.put(variable, variableDeclarationInfo, enterInitState)
            }
        }' @ [120:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'instruction' @ [120:13] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'!' @ [122:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isThisOrNoDispatchReceiver' @ [122:33] ==> public open fun isThisOrNoDispatchReceiver(@NotNull instruction: AccessValueInstruction, @NotNull bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [122:60] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'bindingContext' @ [122:73] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'enterInstructionData' @ [123:24] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'enterInstructionData' @ [126:34] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'getOrNull' @ [126:55] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'variable' @ [126:65] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'VariableControlFlowState' @ [127:47] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[FakeCallableDescriptorForObject]

'create' @ [127:72] ==> public final fun create(isDeclaredHere: Boolean, mergedEdgesData: VariableControlFlowState?): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'instruction' @ [127:79] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'element' @ [127:91] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[PropertyDescriptorImpl]

'enterInitState' @ [127:114] ==> val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'exitInstructionData' @ [128:13] ==> var exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'exitInstructionData' @ [128:35] ==> var exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'put' @ [128:55] ==> public final fun put(key: VariableDescriptor, value: VariableControlFlowState, oldValue: VariableControlFlowState?): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[SimpleFunctionDescriptorImpl]

'variable' @ [128:59] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'initializationAtThisElement' @ [128:69] ==> val initializationAtThisElement: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'enterInitState' @ [128:98] ==> val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'enterInstructionData' @ [132:61] ==> value-parameter enterInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'getOrNull' @ [132:82] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'variable' @ [132:92] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'enterInitState' @ [133:17] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'enterInitState' @ [134:17] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'getDefaultValueForInitializers' @ [134:34] ==> @JvmStatic public final fun getDefaultValueForInitializers(variable: VariableDescriptor, instruction: Instruction, blockScopeVariableInfo: BlockScopeVariableInfo): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[SimpleFunctionDescriptorImpl]

'variable' @ [134:65] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'instruction' @ [134:75] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'blockScopeVariableInfo' @ [134:88] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[ValueParameterDescriptorImpl]

'!' @ [136:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enterInitState' @ [136:18] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'mayBeInitialized' @ [136:33] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'!' @ [136:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enterInitState' @ [136:56] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'isDeclared' @ [136:71] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'VariableControlFlowState' @ [137:47] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[FakeCallableDescriptorForObject]

'create' @ [137:72] ==> public final fun create(initState: InitState, isDeclared: Boolean): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'enterInitState' @ [137:79] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'initState' @ [137:94] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'exitInstructionData' @ [138:17] ==> var exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'exitInstructionData' @ [138:39] ==> var exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'put' @ [138:59] ==> public final fun put(key: VariableDescriptor, value: VariableControlFlowState, oldValue: VariableControlFlowState?): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[SimpleFunctionDescriptorImpl]

'variable' @ [138:63] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'variableDeclarationInfo' @ [138:73] ==> val variableDeclarationInfo: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'enterInitState' @ [138:98] ==> var enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'exitInstructionData' @ [141:16] ==> var exitInstructionData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.addVariableInitStateFromCurrentInstructionIfAny[LocalVariableDescriptor]

'pseudocodeVariableDataCollector' @ [147:17] ==> private final val pseudocodeVariableDataCollector: PseudocodeVariableDataCollector defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'collectData' @ [147:49] ==> public final fun <I : ControlFlowInfo<*, *>> collectData(traversalOrder: TraversalOrder, initialInfo: UseControlFlowInfo, instructionDataMergeStrategy: (Instruction, Collection<UseControlFlowInfo>) -> Edges<UseControlFlowInfo>): Map<Instruction, Edges<UseControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> UseControlFlowInfo

'BACKWARD' @ [147:76] ==> enum entry BACKWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'UseControlFlowInfo' @ [147:86] ==> public constructor UseControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ = ...) defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[ClassConstructorDescriptorImpl]

'if (incomingEdgesData.size == 1) {
                incomingEdgesData.single()
            }
            else {
                incomingEdgesData.fold(UseControlFlowInfo()) { result, edgeData ->
                    edgeData.iterator().fold(result) { subResult, (variableDescriptor, variableUseState) ->
                        subResult.put(variableDescriptor, variableUseState.merge(subResult.getOrNull(variableDescriptor)))
                    }
                }
            }' @ [150:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UseControlFlowInfo, elseBranch: UseControlFlowInfo): UseControlFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UseControlFlowInfo

'incomingEdgesData' @ [150:55] ==> value-parameter incomingEdgesData: Collection<UseControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [150:73] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'incomingEdgesData' @ [151:17] ==> value-parameter incomingEdgesData: Collection<UseControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [151:35] ==> public fun <T> Iterable<UseControlFlowInfo>.single(): UseControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UseControlFlowInfo

'incomingEdgesData' @ [154:17] ==> value-parameter incomingEdgesData: Collection<UseControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'fold' @ [154:35] ==> public inline fun <T, R> Iterable<UseControlFlowInfo>.fold(initial: UseControlFlowInfo, operation: (acc: UseControlFlowInfo, UseControlFlowInfo) -> UseControlFlowInfo): UseControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UseControlFlowInfo
    <R> -> UseControlFlowInfo

'UseControlFlowInfo' @ [154:40] ==> public constructor UseControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ = ...) defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[ClassConstructorDescriptorImpl]

'edgeData' @ [155:21] ==> value-parameter edgeData: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [155:30] ==> public open fun iterator(): Iterator<(Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>?)> defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[JavaMethodDescriptor]

'fold' @ [155:41] ==> public inline fun <T, R> Iterable<(Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>?)>.fold(initial: UseControlFlowInfo, operation: (acc: UseControlFlowInfo, (Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>..Tuple2<(VariableDescriptor..VariableDescriptor?), (VariableUseState..VariableUseState?)>?)) -> UseControlFlowInfo): UseControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javaslang.Tuple2<(org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?), (org.jetbrains.kotlin.cfg.VariableUseState..org.jetbrains.kotlin.cfg.VariableUseState?)>..javaslang.Tuple2<(org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?), (org.jetbrains.kotlin.cfg.VariableUseState..org.jetbrains.kotlin.cfg.VariableUseState?)>?)
    <R> -> UseControlFlowInfo

'result' @ [155:46] ==> value-parameter result: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [155:68] ==> public operator fun <T> Tuple2<(VariableDescriptor..VariableDescriptor?), *>.component1(): (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'component2' @ [155:88] ==> public operator fun <T> Tuple2<*, (VariableUseState..VariableUseState?)>.component2(): (VariableUseState..VariableUseState?) defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.VariableUseState..org.jetbrains.kotlin.cfg.VariableUseState?)

'subResult' @ [156:25] ==> value-parameter subResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'put' @ [156:35] ==> public open fun put(key: VariableDescriptor, value: VariableUseState): UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [156:39] ==> val variableDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'variableUseState' @ [156:59] ==> val variableUseState: (VariableUseState..VariableUseState?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'merge' @ [156:76] ==> public final fun merge(variableUseState: VariableUseState?): VariableUseState defined in org.jetbrains.kotlin.cfg.VariableUseState[SimpleFunctionDescriptorImpl]

'subResult' @ [156:82] ==> value-parameter subResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getOrNull' @ [156:92] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */.getOrNull(k: VariableDescriptor): VariableUseState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableUseState

'variableDescriptor' @ [156:102] ==> val variableDescriptor: (VariableDescriptor..VariableDescriptor?) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'extractVariableDescriptorFromReference' @ [161:53] ==> @Nullable public open fun extractVariableDescriptorFromReference(@NotNull instruction: Instruction, @NotNull bindingContext: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [161:92] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [161:105] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'if (variableDescriptor == null || instruction !is ReadValueInstruction && instruction !is WriteValueInstruction) {
                Edges(enterResult, enterResult)
            }
            else {
                val exitResult =
                    if (instruction is ReadValueInstruction) {
                        enterResult.put(variableDescriptor, VariableUseState.READ)
                    }
                    else {
                        var variableUseState: VariableUseState? = enterResult.getOrNull(variableDescriptor)
                        if (variableUseState == null) {
                            variableUseState = VariableUseState.UNUSED
                        }
                        when (variableUseState) {
                            VariableUseState.UNUSED, VariableUseState.ONLY_WRITTEN_NEVER_READ ->
                                enterResult.put(variableDescriptor, VariableUseState.ONLY_WRITTEN_NEVER_READ)
                            VariableUseState.WRITTEN_AFTER_READ, VariableUseState.READ ->
                                enterResult.put(variableDescriptor, VariableUseState.WRITTEN_AFTER_READ)
                        }
                    }
                Edges(enterResult, exitResult)
            }' @ [162:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Edges<UseControlFlowInfo>, elseBranch: Edges<UseControlFlowInfo>): Edges<UseControlFlowInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Edges<UseControlFlowInfo>

'variableDescriptor' @ [162:17] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'instruction' @ [162:47] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [162:87] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'Edges' @ [163:17] ==> public constructor Edges<out T>(incoming: UseControlFlowInfo, outgoing: UseControlFlowInfo) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> UseControlFlowInfo

'enterResult' @ [163:23] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'enterResult' @ [163:36] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'if (instruction is ReadValueInstruction) {
                        enterResult.put(variableDescriptor, VariableUseState.READ)
                    }
                    else {
                        var variableUseState: VariableUseState? = enterResult.getOrNull(variableDescriptor)
                        if (variableUseState == null) {
                            variableUseState = VariableUseState.UNUSED
                        }
                        when (variableUseState) {
                            VariableUseState.UNUSED, VariableUseState.ONLY_WRITTEN_NEVER_READ ->
                                enterResult.put(variableDescriptor, VariableUseState.ONLY_WRITTEN_NEVER_READ)
                            VariableUseState.WRITTEN_AFTER_READ, VariableUseState.READ ->
                                enterResult.put(variableDescriptor, VariableUseState.WRITTEN_AFTER_READ)
                        }
                    }' @ [167:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UseControlFlowInfo, elseBranch: UseControlFlowInfo): UseControlFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UseControlFlowInfo

'instruction' @ [167:25] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[ValueParameterDescriptorImpl]

'enterResult' @ [168:25] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'put' @ [168:37] ==> public open fun put(key: VariableDescriptor, value: VariableUseState): UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [168:41] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'READ' @ [168:78] ==> enum entry READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'enterResult' @ [171:67] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'getOrNull' @ [171:79] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */.getOrNull(k: VariableDescriptor): VariableUseState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableUseState

'variableDescriptor' @ [171:89] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'variableUseState' @ [172:29] ==> var variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'variableUseState' @ [173:29] ==> var variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'VariableUseState' @ [173:48] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'UNUSED' @ [173:65] ==> enum entry UNUSED defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'when (variableUseState) {
                            VariableUseState.UNUSED, VariableUseState.ONLY_WRITTEN_NEVER_READ ->
                                enterResult.put(variableDescriptor, VariableUseState.ONLY_WRITTEN_NEVER_READ)
                            VariableUseState.WRITTEN_AFTER_READ, VariableUseState.READ ->
                                enterResult.put(variableDescriptor, VariableUseState.WRITTEN_AFTER_READ)
                        }' @ [175:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UseControlFlowInfo, entry1: UseControlFlowInfo): UseControlFlowInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UseControlFlowInfo

'variableUseState' @ [175:31] ==> var variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'VariableUseState' @ [176:29] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'UNUSED' @ [176:46] ==> enum entry UNUSED defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'VariableUseState' @ [176:54] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'ONLY_WRITTEN_NEVER_READ' @ [176:71] ==> enum entry ONLY_WRITTEN_NEVER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'enterResult' @ [177:33] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'put' @ [177:45] ==> public open fun put(key: VariableDescriptor, value: VariableUseState): UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [177:49] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'ONLY_WRITTEN_NEVER_READ' @ [177:86] ==> enum entry ONLY_WRITTEN_NEVER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'VariableUseState' @ [178:29] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'WRITTEN_AFTER_READ' @ [178:46] ==> enum entry WRITTEN_AFTER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'VariableUseState' @ [178:66] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'READ' @ [178:83] ==> enum entry READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'enterResult' @ [179:33] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'put' @ [179:45] ==> public open fun put(key: VariableDescriptor, value: VariableUseState): UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.UseControlFlowInfo[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [179:49] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'WRITTEN_AFTER_READ' @ [179:86] ==> enum entry WRITTEN_AFTER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'Edges' @ [182:17] ==> public constructor Edges<out T>(incoming: UseControlFlowInfo, outgoing: UseControlFlowInfo) defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> UseControlFlowInfo

'enterResult' @ [182:23] ==> val enterResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'exitResult' @ [182:36] ==> val exitResult: UseControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.<get-variableUseStatusData>.<anonymous>[LocalVariableDescriptor]

'JvmStatic' @ [188:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'blockScopeVariableInfo' @ [195:30] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[ValueParameterDescriptorImpl]

'declaredIn' @ [195:53] ==> public abstract val declaredIn: Map<VariableDescriptor, BlockScope> defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfo[PropertyDescriptorImpl]

'variable' @ [195:64] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[ValueParameterDescriptorImpl]

'declaredIn' @ [197:21] ==> val declaredIn: BlockScope? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[LocalVariableDescriptor]

'declaredIn' @ [198:24] ==> val declaredIn: BlockScope? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[LocalVariableDescriptor]

'blockScopeForContainingDeclaration' @ [198:35] ==> public final val blockScopeForContainingDeclaration: BlockScope? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'instruction' @ [198:73] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[ValueParameterDescriptorImpl]

'blockScope' @ [198:85] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'blockScopeForContainingDeclaration' @ [198:96] ==> public final val blockScopeForContainingDeclaration: BlockScope? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'VariableControlFlowState' @ [199:20] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[FakeCallableDescriptorForObject]

'create' @ [199:45] ==> public final fun create(isInitialized: Boolean, isDeclared: Boolean = ...): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'declaredOutsideThisDeclaration' @ [199:68] ==> val declaredOutsideThisDeclaration: Boolean defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.getDefaultValueForInitializers[LocalVariableDescriptor]

'InitControlFlowInfo' @ [202:52] ==> public constructor InitControlFlowInfo(map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ = ...) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[ClassConstructorDescriptorImpl]

'incomingEdgesData' @ [209:17] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'size' @ [209:35] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'incomingEdgesData' @ [209:53] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'single' @ [209:71] ==> public fun <T> Iterable<InitControlFlowInfo>.single(): InitControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InitControlFlowInfo

'incomingEdgesData' @ [210:17] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'isEmpty' @ [210:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'EMPTY_INIT_CONTROL_FLOW_INFO' @ [210:53] ==> private final val EMPTY_INIT_CONTROL_FLOW_INFO: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[PropertyDescriptorImpl]

'linkedSetOf' @ [211:36] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'incomingEdgesData' @ [212:30] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'variablesInScope' @ [213:17] ==> val variablesInScope: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[LocalVariableDescriptor]

'addAll' @ [213:34] ==> public fun <T> MutableCollection<in (VariableDescriptor..VariableDescriptor?)>.addAll(elements: Iterable<(VariableDescriptor..VariableDescriptor?)>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'edgeData' @ [213:41] ==> val edgeData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[LocalVariableDescriptor]

'keySet' @ [213:50] ==> public open fun keySet(): (Set<(VariableDescriptor..VariableDescriptor?)>..Set<(VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[JavaMethodDescriptor]

'variablesInScope' @ [216:20] ==> val variablesInScope: LinkedHashSet<VariableDescriptor> /* = LinkedHashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[LocalVariableDescriptor]

'fold' @ [216:37] ==> public inline fun <T, R> Iterable<VariableDescriptor>.fold(initial: InitControlFlowInfo, operation: (acc: InitControlFlowInfo, VariableDescriptor) -> InitControlFlowInfo): InitControlFlowInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> InitControlFlowInfo

'EMPTY_INIT_CONTROL_FLOW_INFO' @ [216:42] ==> private final val EMPTY_INIT_CONTROL_FLOW_INFO: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[PropertyDescriptorImpl]

'incomingEdgesData' @ [219:34] ==> value-parameter incomingEdgesData: Collection<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'edgeData' @ [220:47] ==> val edgeData: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'getOrNull' @ [220:56] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'variable' @ [220:66] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[ValueParameterDescriptorImpl]

'getDefaultValueForInitializers' @ [221:50] ==> @JvmStatic public final fun getDefaultValueForInitializers(variable: VariableDescriptor, instruction: Instruction, blockScopeVariableInfo: BlockScopeVariableInfo): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[SimpleFunctionDescriptorImpl]

'variable' @ [221:81] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [221:91] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'blockScopeVariableInfo' @ [221:104] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers[ValueParameterDescriptorImpl]

'initState' @ [222:21] ==> var initState: InitState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'initState' @ [222:33] ==> var initState: InitState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'merge' @ [222:44] ==> public final fun merge(other: InitState): InitState defined in org.jetbrains.kotlin.cfg.InitState[SimpleFunctionDescriptorImpl]

'varControlFlowState' @ [222:50] ==> val varControlFlowState: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'initState' @ [222:70] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'varControlFlowState' @ [222:84] ==> val varControlFlowState: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'initState' @ [222:104] ==> public final val initState: InitState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'!' @ [223:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'varControlFlowState' @ [223:26] ==> val varControlFlowState: VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'isDeclared' @ [223:46] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'isDeclared' @ [224:25] ==> var isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'initState' @ [227:21] ==> var initState: InitState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [228:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'result' @ [230:17] ==> value-parameter result: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[ValueParameterDescriptorImpl]

'put' @ [230:24] ==> public open fun put(key: VariableDescriptor, value: VariableControlFlowState): InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[SimpleFunctionDescriptorImpl]

'variable' @ [230:28] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [230:63] ==> public final fun create(initState: InitState, isDeclared: Boolean): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.VariableControlFlowState.Companion[SimpleFunctionDescriptorImpl]

'initState' @ [230:70] ==> var initState: InitState? defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

'isDeclared' @ [230:81] ==> var isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion.mergeIncomingEdgesDataForInitializers.<anonymous>[LocalVariableDescriptor]

