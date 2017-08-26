'computeBlockScopeVariableInfo' @ [35:34] ==> private final fun computeBlockScopeVariableInfo(pseudocode: Pseudocode): BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[SimpleFunctionDescriptorImpl]

'pseudocode' @ [35:64] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'pseudocode' @ [42:16] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'collectData' @ [42:27] ==> public fun <I : ControlFlowInfo<*, *>> Pseudocode.collectData(traversalOrder: TraversalOrder, mergeEdges: (Instruction, Collection<I>) -> Edges<I>, updateEdge: (Instruction, Instruction, I) -> I, initialInfo: I): Map<Instruction, Edges<I>> defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'traversalOrder' @ [43:17] ==> value-parameter traversalOrder: TraversalOrder defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData[ValueParameterDescriptorImpl]

'instructionDataMergeStrategy' @ [44:17] ==> value-parameter instructionDataMergeStrategy: (Instruction, Collection<I>) -> Edges<I> defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData[ValueParameterDescriptorImpl]

'filterOutVariablesOutOfScope' @ [45:37] ==> private final fun <I : ControlFlowInfo<*, *>> filterOutVariablesOutOfScope(from: Instruction, to: Instruction, info: I): I defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <I : ControlFlowInfo<*, *>> -> I

'from' @ [45:66] ==> value-parameter from: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [45:72] ==> value-parameter to: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [45:76] ==> value-parameter info: I defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData.<anonymous>[ValueParameterDescriptorImpl]

'initialInfo' @ [46:17] ==> value-parameter initialInfo: I defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.collectData[ValueParameterDescriptorImpl]

'to' @ [56:23] ==> value-parameter to: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[ValueParameterDescriptorImpl]

'blockScope' @ [56:26] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'depth' @ [56:37] ==> public final val depth: Int defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'toDepth' @ [57:13] ==> val toDepth: Int defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[LocalVariableDescriptor]

'from' @ [57:24] ==> value-parameter from: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[ValueParameterDescriptorImpl]

'blockScope' @ [57:29] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'depth' @ [57:40] ==> public final val depth: Int defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'info' @ [57:54] ==> value-parameter info: I defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[ValueParameterDescriptorImpl]

'Suppress' @ [61:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'info' @ [62:16] ==> value-parameter info: I defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[ValueParameterDescriptorImpl]

'retainAll' @ [62:21] ==> public final fun retainAll(predicate: (VariableDescriptor) -> Boolean): ControlFlowInfo<*, *> defined in org.jetbrains.kotlin.cfg.ControlFlowInfo[SimpleFunctionDescriptorImpl]

'blockScopeVariableInfo' @ [63:30] ==> public final val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'declaredIn' @ [63:53] ==> public abstract val declaredIn: Map<VariableDescriptor, BlockScope> defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfo[PropertyDescriptorImpl]

'variable' @ [63:64] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope.<anonymous>[ValueParameterDescriptorImpl]

'blockScope' @ [65:25] ==> val blockScope: BlockScope? defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope.<anonymous>[LocalVariableDescriptor]

'depth' @ [65:37] ==> public final val depth: Int defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'-' @ [65:46] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'depth' @ [66:13] ==> val depth: Int defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope.<anonymous>[LocalVariableDescriptor]

'toDepth' @ [66:22] ==> val toDepth: Int defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.filterOutVariablesOutOfScope[LocalVariableDescriptor]

'BlockScopeVariableInfoImpl' @ [71:38] ==> public constructor BlockScopeVariableInfoImpl() defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl[ClassConstructorDescriptorImpl]

'pseudocode' @ [72:9] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo[ValueParameterDescriptorImpl]

'traverse' @ [72:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [72:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [73:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [74:50] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[ValueParameterDescriptorImpl]

'variableDeclarationElement' @ [74:62] ==> public final val variableDeclarationElement: KtDeclaration defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'bindingContext' @ [75:34] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector[PropertyDescriptorImpl]

'get' @ [75:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [75:68] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDeclarationElement' @ [75:95] ==> val variableDeclarationElement: KtDeclaration defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[LocalVariableDescriptor]

'?:' @ [76:42] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VariableDescriptor?, right: VariableDescriptor): VariableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VariableDescriptor

'variableDescriptorForDeclaration' @ [76:62] ==> @Nullable public open fun variableDescriptorForDeclaration(@Nullable descriptor: DeclarationDescriptor?): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'descriptor' @ [76:95] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[LocalVariableDescriptor]

'AssertionError' @ [77:51] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [77:66] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'instruction' @ [78:89] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [78:101] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'text' @ [78:109] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'descriptor' @ [79:80] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[LocalVariableDescriptor]

'blockScopeVariableInfo' @ [80:17] ==> val blockScopeVariableInfo: BlockScopeVariableInfoImpl defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo[LocalVariableDescriptor]

'registerVariableDeclaredInScope' @ [80:40] ==> public final fun registerVariableDeclaredInScope(variable: VariableDescriptor, blockScope: BlockScope): Unit defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [80:72] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[LocalVariableDescriptor]

'instruction' @ [80:92] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo.<anonymous>[ValueParameterDescriptorImpl]

'blockScope' @ [80:104] ==> public abstract val blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [83:16] ==> val blockScopeVariableInfo: BlockScopeVariableInfoImpl defined in org.jetbrains.kotlin.cfg.PseudocodeVariableDataCollector.computeBlockScopeVariableInfo[LocalVariableDescriptor]

'HashMap' @ [93:31] ==> public final fun <K, V> <init>(): HashMap<VariableDescriptor, BlockScope> /* = HashMap<VariableDescriptor, BlockScope> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> BlockScope

'HashMap' @ [94:35] ==> public final fun <K, V> <init>(): HashMap<BlockScope, MutableCollection<VariableDescriptor>> /* = HashMap<BlockScope, MutableCollection<VariableDescriptor>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> BlockScope
    <V> -> MutableCollection<VariableDescriptor>

'declaredIn' @ [97:9] ==> public open val declaredIn: HashMap<VariableDescriptor, BlockScope> /* = HashMap<VariableDescriptor, BlockScope> */ defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl[PropertyDescriptorImpl]

'variable' @ [97:20] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl.registerVariableDeclaredInScope[ValueParameterDescriptorImpl]

'blockScope' @ [97:32] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl.registerVariableDeclaredInScope[ValueParameterDescriptorImpl]

'scopeVariables' @ [98:32] ==> public open val scopeVariables: HashMap<BlockScope, MutableCollection<VariableDescriptor>> /* = HashMap<BlockScope, MutableCollection<VariableDescriptor>> */ defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl[PropertyDescriptorImpl]

'getOrPut' @ [98:47] ==> public inline fun <K, V> MutableMap<BlockScope, MutableCollection<VariableDescriptor>>.getOrPut(key: BlockScope, defaultValue: () -> MutableCollection<VariableDescriptor>): MutableCollection<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> BlockScope
    <V> -> MutableCollection<VariableDescriptor>

'blockScope' @ [98:56] ==> value-parameter blockScope: BlockScope defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl.registerVariableDeclaredInScope[ValueParameterDescriptorImpl]

'arrayListOf' @ [98:70] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<VariableDescriptor> /* = ArrayList<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'variablesInScope' @ [99:9] ==> val variablesInScope: MutableCollection<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl.registerVariableDeclaredInScope[LocalVariableDescriptor]

'add' @ [99:26] ==> public abstract fun add(element: VariableDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'variable' @ [99:30] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.BlockScopeVariableInfoImpl.registerVariableDeclaredInScope[ValueParameterDescriptorImpl]

