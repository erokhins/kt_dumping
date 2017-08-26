'ControlFlowBuilderAdapter' @ [35:42] ==> public constructor ControlFlowBuilderAdapter() defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[ClassConstructorDescriptorImpl]

'builder' @ [39:17] ==> private final var builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'AssertionError' @ [39:34] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'Stack' @ [41:28] ==> public constructor Stack<T : (Any..Any?)>() defined in com.intellij.util.containers.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LoopInfo

'Stack' @ [42:31] ==> public constructor Stack<T : (Any..Any?)>() defined in com.intellij.util.containers.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BlockScope

'HashMap' @ [43:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtLoopExpression
    <V : (Any..Any?)> -> LoopInfo

'HashMap' @ [44:43] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> SubroutineInfo

'Stack' @ [47:28] ==> public constructor Stack<T : (Any..Any?)>() defined in com.intellij.util.containers.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ControlFlowInstructionsGeneratorWorker

'Stack' @ [49:29] ==> public constructor Stack<T : (Any..Any?)>() defined in com.intellij.util.containers.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BlockInfo

'ControlFlowInstructionsGeneratorWorker' @ [52:22] ==> public constructor ControlFlowInstructionsGeneratorWorker(scopingElement: KtElement, returnSubroutine: KtElement) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[ClassConstructorDescriptorImpl]

'scopingElement' @ [52:61] ==> value-parameter scopingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.pushBuilder[ValueParameterDescriptorImpl]

'subroutine' @ [52:77] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.pushBuilder[ValueParameterDescriptorImpl]

'builders' @ [53:9] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [53:18] ==> public open fun push(p0: (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'worker' @ [53:23] ==> val worker: ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.pushBuilder[LocalVariableDescriptor]

'builder' @ [54:9] ==> private final var builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'worker' @ [54:19] ==> val worker: ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.pushBuilder[LocalVariableDescriptor]

'builders' @ [58:22] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [58:31] ==> public open fun pop(): (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'builder' @ [59:9] ==> private final var builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'if (!builders.isEmpty()) {
            builders.peek()
        }
        else {
            null
        }' @ [59:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ControlFlowBuilder?, elseBranch: ControlFlowBuilder?): ControlFlowBuilder?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ControlFlowBuilder?

'!' @ [59:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builders' @ [59:24] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'isEmpty' @ [59:33] ==> public open fun isEmpty(): Boolean defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'builders' @ [60:13] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'peek' @ [60:22] ==> public open fun peek(): (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'worker' @ [65:16] ==> val worker: (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.popBuilder[LocalVariableDescriptor]

'builder' @ [69:23] ==> private final var builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'if (builder != null && subroutine is KtFunctionLiteral) {
            pushBuilder(subroutine, builder.returnSubroutine)
        }
        else {
            pushBuilder(subroutine, subroutine)
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'builder' @ [70:13] ==> val builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[LocalVariableDescriptor]

'subroutine' @ [70:32] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'pushBuilder' @ [71:13] ==> private final fun pushBuilder(scopingElement: KtElement, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[SimpleFunctionDescriptorImpl]

'subroutine' @ [71:25] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'builder' @ [71:37] ==> val builder: ControlFlowBuilder? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[LocalVariableDescriptor]

'returnSubroutine' @ [71:45] ==> public abstract val returnSubroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[PropertyDescriptorImpl]

'pushBuilder' @ [74:13] ==> private final fun pushBuilder(scopingElement: KtElement, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[SimpleFunctionDescriptorImpl]

'subroutine' @ [74:25] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'subroutine' @ [74:37] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'delegateBuilder' @ [76:9] ==> protected open val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'enterBlockScope' @ [76:25] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [76:41] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'delegateBuilder' @ [77:9] ==> protected open val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'enterSubroutine' @ [77:25] ==> public abstract fun enterSubroutine(subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [77:41] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.enterSubroutine[ValueParameterDescriptorImpl]

'super' @ [81:9] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[LazyClassReceiverParameterDescriptor]

'exitSubroutine' @ [81:15] ==> public open fun exitSubroutine(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[SimpleFunctionDescriptorImpl]

'subroutine' @ [81:30] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[ValueParameterDescriptorImpl]

'delegateBuilder' @ [82:9] ==> protected open val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'exitBlockScope' @ [82:25] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [82:40] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[ValueParameterDescriptorImpl]

'popBuilder' @ [83:22] ==> private final fun popBuilder(): ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[SimpleFunctionDescriptorImpl]

'!' @ [84:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'builders' @ [84:14] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'empty' @ [84:23] ==> public open fun empty(): Boolean defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'builders' @ [85:27] ==> private final val builders: Stack<ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'peek' @ [85:36] ==> public open fun peek(): (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'builder' @ [86:13] ==> val builder: (ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker..ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[LocalVariableDescriptor]

'declareFunction' @ [86:21] ==> public open fun declareFunction(subroutine: KtElement, pseudocode: Pseudocode): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'subroutine' @ [86:37] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[ValueParameterDescriptorImpl]

'worker' @ [86:49] ==> val worker: ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[LocalVariableDescriptor]

'pseudocode' @ [86:56] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'worker' @ [88:16] ==> val worker: ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.exitSubroutine[LocalVariableDescriptor]

'pseudocode' @ [88:23] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'PseudocodeImpl' @ [93:42] ==> public constructor PseudocodeImpl(correspondingElement: KtElement) defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[ClassConstructorDescriptorImpl]

'scopingElement' @ [93:57] ==> value-parameter scopingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.<init>[ValueParameterDescriptorImpl]

'pseudocode' @ [94:36] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'createLabel' @ [94:47] ==> public final fun createLabel(name: String, comment: String?): PseudocodeLabel defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'pseudocode' @ [95:35] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'createLabel' @ [95:46] ==> public final fun createLabel(name: String, comment: String?): PseudocodeLabel defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'PseudoValueFactoryImpl' @ [97:45] ==> public constructor PseudoValueFactoryImpl() defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValueFactoryImpl[ClassConstructorDescriptorImpl]

'super' @ [99:29] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>[LazyClassReceiverParameterDescriptor]

'newValue' @ [99:35] ==> public open fun newValue(element: KtElement?, instruction: InstructionWithValue?): PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValueFactoryImpl[SimpleFunctionDescriptorImpl]

'element' @ [99:44] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[ValueParameterDescriptorImpl]

'instruction' @ [99:53] ==> value-parameter instruction: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[ValueParameterDescriptorImpl]

'element' @ [100:21] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[ValueParameterDescriptorImpl]

'bindValue' @ [101:21] ==> public open fun bindValue(value: PseudoValue, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'value' @ [101:31] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[LocalVariableDescriptor]

'element' @ [101:38] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[ValueParameterDescriptorImpl]

'value' @ [103:24] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>.newValue[LocalVariableDescriptor]

'pseudocode' @ [108:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'addInstruction' @ [108:24] ==> public final fun addInstruction(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'instruction' @ [108:39] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.add[ValueParameterDescriptorImpl]

'pseudocode' @ [111:52] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'createLabel' @ [111:63] ==> public final fun createLabel(name: String, comment: String?): PseudocodeLabel defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'+' @ [111:75] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'labelCount' @ [111:81] ==> private final var labelCount: Int defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pseudocode' @ [113:64] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'createLabel' @ [113:75] ==> public final fun createLabel(name: String, comment: String?): PseudocodeLabel defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'+' @ [113:87] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'labelCount' @ [113:93] ==> private final var labelCount: Int defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'name' @ [113:107] ==> value-parameter name: String defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.createUnboundLabel[ValueParameterDescriptorImpl]

'LoopInfo' @ [116:24] ==> public constructor LoopInfo(element: KtLoopExpression, entryPoint: Label, exitPoint: Label, bodyEntryPoint: Label, bodyExitPoint: Label, conditionEntryPoint: Label) defined in org.jetbrains.kotlin.cfg.LoopInfo[ClassConstructorDescriptorImpl]

'expression' @ [117:21] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoop[ValueParameterDescriptorImpl]

'createUnboundLabel' @ [118:21] ==> public open fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'createUnboundLabel' @ [119:21] ==> public open fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'createUnboundLabel' @ [120:21] ==> public open fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'createUnboundLabel' @ [121:21] ==> public open fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'createUnboundLabel' @ [122:21] ==> public open fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'bindLabel' @ [123:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'info' @ [123:23] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoop[LocalVariableDescriptor]

'entryPoint' @ [123:28] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'elementToLoopInfo' @ [124:13] ==> private final val elementToLoopInfo: HashMap<KtLoopExpression, LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'put' @ [124:31] ==> public open fun put(key: KtLoopExpression, value: LoopInfo): LoopInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'expression' @ [124:35] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoop[ValueParameterDescriptorImpl]

'info' @ [124:47] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoop[LocalVariableDescriptor]

'info' @ [125:20] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoop[LocalVariableDescriptor]

'elementToLoopInfo' @ [129:24] ==> private final val elementToLoopInfo: HashMap<KtLoopExpression, LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'expression' @ [129:42] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoopBody[ValueParameterDescriptorImpl]

'bindLabel' @ [130:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'info' @ [130:23] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoopBody[LocalVariableDescriptor]

'bodyEntryPoint' @ [130:28] ==> public final val bodyEntryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'loopInfo' @ [131:13] ==> private final val loopInfo: Stack<LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [131:22] ==> public open fun push(p0: (LoopInfo..LoopInfo?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'info' @ [131:27] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoopBody[LocalVariableDescriptor]

'allBlocks' @ [132:13] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [132:23] ==> public open fun push(p0: (BlockInfo..BlockInfo?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'info' @ [132:28] ==> val info: LoopInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterLoopBody[LocalVariableDescriptor]

'loopInfo' @ [136:24] ==> private final val loopInfo: Stack<LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [136:33] ==> public open fun pop(): (LoopInfo..LoopInfo?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'elementToLoopInfo' @ [137:13] ==> private final val elementToLoopInfo: HashMap<KtLoopExpression, LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'remove' @ [137:31] ==> public open fun remove(key: KtLoopExpression): LoopInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'expression' @ [137:38] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitLoopBody[ValueParameterDescriptorImpl]

'allBlocks' @ [138:13] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [138:23] ==> public open fun pop(): (BlockInfo..BlockInfo?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'bindLabel' @ [139:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'info' @ [139:23] ==> val info: (LoopInfo..LoopInfo?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitLoopBody[LocalVariableDescriptor]

'bodyExitPoint' @ [139:28] ==> public final val bodyExitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'if (loopInfo.empty()) null else loopInfo.peek().element' @ [143:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLoopExpression?, elseBranch: KtLoopExpression?): KtLoopExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLoopExpression?

'loopInfo' @ [143:25] ==> private final val loopInfo: Stack<LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'empty' @ [143:34] ==> public open fun empty(): Boolean defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'loopInfo' @ [143:53] ==> private final val loopInfo: Stack<LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'peek' @ [143:62] ==> public open fun peek(): (LoopInfo..LoopInfo?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'element' @ [143:69] ==> public open val element: KtLoopExpression defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'SubroutineInfo' @ [146:29] ==> public constructor SubroutineInfo(subroutine: KtElement, entryPoint: Label, exitPoint: Label) defined in org.jetbrains.kotlin.cfg.SubroutineInfo[ClassConstructorDescriptorImpl]

'subroutine' @ [147:21] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[ValueParameterDescriptorImpl]

'createUnboundLabel' @ [148:39] ==> public open fun createUnboundLabel(): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'createUnboundLabel' @ [149:39] ==> public open fun createUnboundLabel(): Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'elementToSubroutineInfo' @ [150:13] ==> private final val elementToSubroutineInfo: HashMap<KtElement, SubroutineInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'put' @ [150:37] ==> public open fun put(key: KtElement, value: SubroutineInfo): SubroutineInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'subroutine' @ [150:41] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[ValueParameterDescriptorImpl]

'blockInfo' @ [150:53] ==> val blockInfo: SubroutineInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[LocalVariableDescriptor]

'allBlocks' @ [151:13] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [151:23] ==> public open fun push(p0: (BlockInfo..BlockInfo?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'blockInfo' @ [151:28] ==> val blockInfo: SubroutineInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[LocalVariableDescriptor]

'bindLabel' @ [152:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'blockInfo' @ [152:23] ==> val blockInfo: SubroutineInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[LocalVariableDescriptor]

'entryPoint' @ [152:33] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.SubroutineInfo[PropertyDescriptorImpl]

'add' @ [153:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'SubroutineEnterInstruction' @ [153:17] ==> public constructor SubroutineEnterInstruction(subroutine: KtElement, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.SubroutineEnterInstruction[ClassConstructorDescriptorImpl]

'subroutine' @ [153:44] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterSubroutine[ValueParameterDescriptorImpl]

'currentScope' @ [153:56] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'pseudocode' @ [157:21] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'correspondingElement' @ [157:32] ==> public open val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[PropertyDescriptorImpl]

'elementToLoopInfo' @ [159:83] ==> private final val elementToLoopInfo: HashMap<KtLoopExpression, LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'loop' @ [159:101] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.getLoopConditionEntryPoint[ValueParameterDescriptorImpl]

'conditionEntryPoint' @ [159:108] ==> public final val conditionEntryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'elementToLoopInfo' @ [162:17] ==> private final val elementToLoopInfo: HashMap<KtLoopExpression, LoopInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'loop' @ [162:35] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.getLoopExitPoint[ValueParameterDescriptorImpl]

'exitPoint' @ [162:42] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'elementToSubroutineInfo' @ [165:17] ==> private final val elementToSubroutineInfo: HashMap<KtElement, SubroutineInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'labelElement' @ [165:41] ==> value-parameter labelElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.getSubroutineExitPoint[ValueParameterDescriptorImpl]

'exitPoint' @ [165:56] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.SubroutineInfo[PropertyDescriptorImpl]

'blockScopes' @ [168:21] ==> private final val blockScopes: Stack<BlockScope> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'peek' @ [168:33] ==> public open fun peek(): (BlockScope..BlockScope?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'if (blockScopes.isEmpty()) null else currentScope' @ [171:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BlockScope?, elseBranch: BlockScope?): BlockScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BlockScope?

'blockScopes' @ [171:31] ==> private final val blockScopes: Stack<BlockScope> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'isEmpty' @ [171:43] ==> public open fun isEmpty(): Boolean defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'currentScope' @ [171:64] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'BlockScope' @ [172:25] ==> public constructor BlockScope(parentScope: BlockScope?, block: KtElement) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[ClassConstructorDescriptorImpl]

'current' @ [172:36] ==> val current: BlockScope? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterBlockScope[LocalVariableDescriptor]

'block' @ [172:45] ==> value-parameter block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterBlockScope[ValueParameterDescriptorImpl]

'blockScopes' @ [173:13] ==> private final val blockScopes: Stack<BlockScope> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [173:25] ==> public open fun push(p0: (BlockScope..BlockScope?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'scope' @ [173:30] ==> val scope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterBlockScope[LocalVariableDescriptor]

'currentScope' @ [177:32] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'assert' @ [178:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [178:20] ==> val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitBlockScope[LocalVariableDescriptor]

'block' @ [178:33] ==> public final val block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'block' @ [178:43] ==> value-parameter block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitBlockScope[ValueParameterDescriptorImpl]

'+' @ [179:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [180:52] ==> val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitBlockScope[LocalVariableDescriptor]

'block' @ [180:65] ==> public final val block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.BlockScope[PropertyDescriptorImpl]

'text' @ [180:71] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'block' @ [181:47] ==> value-parameter block: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitBlockScope[ValueParameterDescriptorImpl]

'text' @ [181:53] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'blockScopes' @ [183:13] ==> private final val blockScopes: Stack<BlockScope> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [183:25] ==> public open fun pop(): (BlockScope..BlockScope?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'ArrayList' @ [189:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TryFinallyBlockInfo

'allBlocks' @ [191:31] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'asReversed' @ [191:41] ==> @JvmName public fun <T> MutableList<(BlockInfo..BlockInfo?)>.asReversed(): MutableList<(BlockInfo..BlockInfo?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.BlockInfo..org.jetbrains.kotlin.cfg.BlockInfo?)

'when (blockInfo) {
                    is BreakableBlockInfo -> if (blockInfo.referablePoints.contains(jumpTarget) || jumpTarget === error) {
                        for (finallyBlockInfo in finallyBlocks) {
                            finallyBlockInfo.generateFinallyBlock()
                        }
                        return
                    }
                    is TryFinallyBlockInfo -> finallyBlocks.add(blockInfo)
                }' @ [192:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'blockInfo' @ [192:23] ==> val blockInfo: (BlockInfo..BlockInfo?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'blockInfo' @ [193:50] ==> val blockInfo: (BlockInfo..BlockInfo?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'referablePoints' @ [193:60] ==> public final val referablePoints: MutableSet<Label> defined in org.jetbrains.kotlin.cfg.BreakableBlockInfo[PropertyDescriptorImpl]

'contains' @ [193:76] ==> public abstract fun contains(element: Label): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'jumpTarget' @ [193:85] ==> value-parameter jumpTarget: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[ValueParameterDescriptorImpl]

'jumpTarget' @ [193:100] ==> value-parameter jumpTarget: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[ValueParameterDescriptorImpl]

'error' @ [193:115] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'finallyBlocks' @ [194:50] ==> val finallyBlocks: ArrayList<ControlFlowInstructionsGenerator.TryFinallyBlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'finallyBlockInfo' @ [195:29] ==> val finallyBlockInfo: ControlFlowInstructionsGenerator.TryFinallyBlockInfo defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'generateFinallyBlock' @ [195:46] ==> public final fun generateFinallyBlock(): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.TryFinallyBlockInfo[SimpleFunctionDescriptorImpl]

'finallyBlocks' @ [199:47] ==> val finallyBlocks: ArrayList<ControlFlowInstructionsGenerator.TryFinallyBlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'add' @ [199:61] ==> public open fun add(element: ControlFlowInstructionsGenerator.TryFinallyBlockInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'blockInfo' @ [199:65] ==> val blockInfo: (BlockInfo..BlockInfo?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.handleJumpInsideTryFinally[LocalVariableDescriptor]

'getSubroutineExitPoint' @ [205:13] ==> public open fun getSubroutineExitPoint(labelElement: KtElement): Label? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'subroutine' @ [205:36] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine[ValueParameterDescriptorImpl]

'let' @ [205:49] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'bindLabel' @ [205:55] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'it' @ [205:65] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine.<anonymous>[ValueParameterDescriptorImpl]

'pseudocode' @ [206:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'addExitInstruction' @ [206:24] ==> public final fun addExitInstruction(exitInstruction: SubroutineExitInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'SubroutineExitInstruction' @ [206:43] ==> public constructor SubroutineExitInstruction(subroutine: KtElement, blockScope: BlockScope, isError: Boolean) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.SubroutineExitInstruction[ClassConstructorDescriptorImpl]

'subroutine' @ [206:69] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine[ValueParameterDescriptorImpl]

'currentScope' @ [206:81] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'bindLabel' @ [207:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'error' @ [207:23] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'pseudocode' @ [208:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'addErrorInstruction' @ [208:24] ==> public final fun addErrorInstruction(errorInstruction: SubroutineExitInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'SubroutineExitInstruction' @ [208:44] ==> public constructor SubroutineExitInstruction(subroutine: KtElement, blockScope: BlockScope, isError: Boolean) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.SubroutineExitInstruction[ClassConstructorDescriptorImpl]

'subroutine' @ [208:70] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine[ValueParameterDescriptorImpl]

'currentScope' @ [208:82] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'bindLabel' @ [209:13] ==> public open fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'sink' @ [209:23] ==> private final val sink: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'pseudocode' @ [210:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'addSinkInstruction' @ [210:24] ==> public final fun addSinkInstruction(sinkInstruction: SubroutineSinkInstruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'SubroutineSinkInstruction' @ [210:43] ==> public constructor SubroutineSinkInstruction(subroutine: KtElement, blockScope: BlockScope, debugLabel: String) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.SubroutineSinkInstruction[ClassConstructorDescriptorImpl]

'subroutine' @ [210:69] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine[ValueParameterDescriptorImpl]

'currentScope' @ [210:81] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'elementToSubroutineInfo' @ [211:13] ==> private final val elementToSubroutineInfo: HashMap<KtElement, SubroutineInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'remove' @ [211:37] ==> public open fun remove(key: KtElement): SubroutineInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'subroutine' @ [211:44] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitSubroutine[ValueParameterDescriptorImpl]

'allBlocks' @ [212:13] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [212:23] ==> public open fun pop(): (BlockInfo..BlockInfo?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'pseudocode' @ [213:20] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [217:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'MarkInstruction' @ [217:17] ==> public constructor MarkInstruction(element: KtElement, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.MarkInstruction[ClassConstructorDescriptorImpl]

'element' @ [217:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.mark[ValueParameterDescriptorImpl]

'currentScope' @ [217:42] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'pseudocode' @ [220:73] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'getElementValue' @ [220:84] ==> public open fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'element' @ [220:100] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.getBoundValue[ValueParameterDescriptorImpl]

'pseudocode' @ [223:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'bindElementToValue' @ [223:24] ==> public final fun bindElementToValue(element: KtElement, value: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'element' @ [223:43] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.bindValue[ValueParameterDescriptorImpl]

'value' @ [223:52] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.bindValue[ValueParameterDescriptorImpl]

'valueFactory' @ [226:67] ==> private final val valueFactory: <no name provided> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'newValue' @ [226:80] ==> public open fun newValue(element: KtElement?, instruction: InstructionWithValue?): PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.valueFactory.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [226:89] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.newValue[ValueParameterDescriptorImpl]

'getSubroutineExitPoint' @ [229:29] ==> public open fun getSubroutineExitPoint(labelElement: KtElement): Label? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'subroutine' @ [229:52] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[ValueParameterDescriptorImpl]

'handleJumpInsideTryFinally' @ [230:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'exitPoint' @ [230:40] ==> val exitPoint: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[LocalVariableDescriptor]

'add' @ [231:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'ReturnValueInstruction' @ [231:17] ==> public constructor ReturnValueInstruction(returnExpression: KtExpression, blockScope: BlockScope, targetLabel: Label, returnedValue: PseudoValue, subroutine: KtElement) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[ClassConstructorDescriptorImpl]

'returnExpression' @ [231:40] ==> value-parameter returnExpression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[ValueParameterDescriptorImpl]

'currentScope' @ [231:58] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'exitPoint' @ [231:72] ==> val exitPoint: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[LocalVariableDescriptor]

'returnValue' @ [231:83] ==> value-parameter returnValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[ValueParameterDescriptorImpl]

'subroutine' @ [231:96] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnValue[ValueParameterDescriptorImpl]

'getSubroutineExitPoint' @ [235:29] ==> public open fun getSubroutineExitPoint(labelElement: KtElement): Label? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'subroutine' @ [235:52] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnNoValue[ValueParameterDescriptorImpl]

'handleJumpInsideTryFinally' @ [236:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'exitPoint' @ [236:40] ==> val exitPoint: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnNoValue[LocalVariableDescriptor]

'add' @ [237:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'ReturnNoValueInstruction' @ [237:17] ==> public constructor ReturnNoValueInstruction(element: KtElement, blockScope: BlockScope, targetLabel: Label, subroutine: KtElement) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnNoValueInstruction[ClassConstructorDescriptorImpl]

'returnExpression' @ [237:42] ==> value-parameter returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnNoValue[ValueParameterDescriptorImpl]

'currentScope' @ [237:60] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'exitPoint' @ [237:74] ==> val exitPoint: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnNoValue[LocalVariableDescriptor]

'subroutine' @ [237:85] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.returnNoValue[ValueParameterDescriptorImpl]

'add' @ [246:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'WriteValueInstruction' @ [246:17] ==> public constructor WriteValueInstruction(assignment: KtElement, blockScope: BlockScope, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>, lValue: KtElement, rValue: PseudoValue) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[ClassConstructorDescriptorImpl]

'assignment' @ [246:39] ==> value-parameter assignment: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.write[ValueParameterDescriptorImpl]

'currentScope' @ [246:51] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'target' @ [246:65] ==> value-parameter target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.write[ValueParameterDescriptorImpl]

'receiverValues' @ [246:73] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.write[ValueParameterDescriptorImpl]

'lValue' @ [246:89] ==> value-parameter lValue: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.write[ValueParameterDescriptorImpl]

'rValue' @ [246:97] ==> value-parameter rValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.write[ValueParameterDescriptorImpl]

'add' @ [250:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'VariableDeclarationInstruction' @ [250:17] ==> public constructor VariableDeclarationInstruction(element: KtDeclaration, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[ClassConstructorDescriptorImpl]

'parameter' @ [250:48] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.declareParameter[ValueParameterDescriptorImpl]

'currentScope' @ [250:59] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [254:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'VariableDeclarationInstruction' @ [254:17] ==> public constructor VariableDeclarationInstruction(element: KtDeclaration, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[ClassConstructorDescriptorImpl]

'property' @ [254:48] ==> value-parameter property: KtVariableDeclaration defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.declareVariable[ValueParameterDescriptorImpl]

'currentScope' @ [254:58] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [258:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'LocalFunctionDeclarationInstruction' @ [258:17] ==> public constructor LocalFunctionDeclarationInstruction(element: KtElement, body: Pseudocode, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[ClassConstructorDescriptorImpl]

'subroutine' @ [258:53] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.declareFunction[ValueParameterDescriptorImpl]

'pseudocode' @ [258:65] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.declareFunction[ValueParameterDescriptorImpl]

'currentScope' @ [258:77] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [262:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'VariableDeclarationInstruction' @ [262:17] ==> public constructor VariableDeclarationInstruction(element: KtDeclaration, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[ClassConstructorDescriptorImpl]

'entryOrObject' @ [262:48] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.declareEntryOrObject[ValueParameterDescriptorImpl]

'currentScope' @ [262:63] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [266:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'LoadUnitValueInstruction' @ [266:17] ==> public constructor LoadUnitValueInstruction(expression: KtExpression, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.LoadUnitValueInstruction[ClassConstructorDescriptorImpl]

'expression' @ [266:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadUnit[ValueParameterDescriptorImpl]

'currentScope' @ [266:54] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'handleJumpInsideTryFinally' @ [270:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'label' @ [270:40] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jump[ValueParameterDescriptorImpl]

'add' @ [271:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'UnconditionalJumpInstruction' @ [271:17] ==> public constructor UnconditionalJumpInstruction(element: KtElement, targetLabel: Label, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.UnconditionalJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [271:46] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jump[ValueParameterDescriptorImpl]

'label' @ [271:55] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jump[ValueParameterDescriptorImpl]

'currentScope' @ [271:62] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'handleJumpInsideTryFinally' @ [275:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'label' @ [275:40] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnFalse[ValueParameterDescriptorImpl]

'add' @ [276:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'ConditionalJumpInstruction' @ [276:17] ==> public constructor ConditionalJumpInstruction(element: KtElement, onTrue: Boolean, blockScope: BlockScope, targetLabel: Label, conditionValue: PseudoValue?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ConditionalJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [276:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnFalse[ValueParameterDescriptorImpl]

'currentScope' @ [276:60] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'label' @ [276:74] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnFalse[ValueParameterDescriptorImpl]

'conditionValue' @ [276:81] ==> value-parameter conditionValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnFalse[ValueParameterDescriptorImpl]

'handleJumpInsideTryFinally' @ [280:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'label' @ [280:40] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnTrue[ValueParameterDescriptorImpl]

'add' @ [281:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'ConditionalJumpInstruction' @ [281:17] ==> public constructor ConditionalJumpInstruction(element: KtElement, onTrue: Boolean, blockScope: BlockScope, targetLabel: Label, conditionValue: PseudoValue?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ConditionalJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [281:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnTrue[ValueParameterDescriptorImpl]

'currentScope' @ [281:59] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'label' @ [281:73] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnTrue[ValueParameterDescriptorImpl]

'conditionValue' @ [281:80] ==> value-parameter conditionValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpOnTrue[ValueParameterDescriptorImpl]

'pseudocode' @ [285:13] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'bindLabel' @ [285:24] ==> public final fun bindLabel(label: PseudocodeLabel): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'label' @ [285:34] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.bindLabel[ValueParameterDescriptorImpl]

'handleJumpInsideTryFinally' @ [289:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'label' @ [289:40] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'add' @ [290:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'NondeterministicJumpInstruction' @ [290:17] ==> public constructor NondeterministicJumpInstruction(element: KtElement, targetLabels: List<Label>, blockScope: BlockScope, inputValue: PseudoValue?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.NondeterministicJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [290:49] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'listOf' @ [290:58] ==> public fun <T> listOf(element: Label): List<Label> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'label' @ [290:65] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'currentScope' @ [290:73] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'inputValue' @ [290:87] ==> value-parameter inputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'add' @ [296:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'NondeterministicJumpInstruction' @ [296:17] ==> public constructor NondeterministicJumpInstruction(element: KtElement, targetLabels: List<Label>, blockScope: BlockScope, inputValue: PseudoValue?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.NondeterministicJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [296:49] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'label' @ [296:58] ==> value-parameter label: List<Label> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.nondeterministicJump[ValueParameterDescriptorImpl]

'currentScope' @ [296:65] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'handleJumpInsideTryFinally' @ [300:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'error' @ [300:40] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [301:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'UnconditionalJumpInstruction' @ [301:17] ==> public constructor UnconditionalJumpInstruction(element: KtElement, targetLabel: Label, blockScope: BlockScope) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.UnconditionalJumpInstruction[ClassConstructorDescriptorImpl]

'element' @ [301:46] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.jumpToError[ValueParameterDescriptorImpl]

'error' @ [301:55] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'currentScope' @ [301:62] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'allBlocks' @ [305:13] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'push' @ [305:23] ==> public open fun push(p0: (BlockInfo..BlockInfo?)): Unit defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'TryFinallyBlockInfo' @ [305:28] ==> public constructor TryFinallyBlockInfo(finallyBlock: GenerationTrigger) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.TryFinallyBlockInfo[ClassConstructorDescriptorImpl]

'trigger' @ [305:48] ==> value-parameter trigger: GenerationTrigger defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.enterTryFinally[ValueParameterDescriptorImpl]

'handleJumpInsideTryFinally' @ [309:13] ==> private final fun handleJumpInsideTryFinally(jumpTarget: Label): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'error' @ [309:40] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [310:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'ThrowExceptionInstruction' @ [310:17] ==> public constructor ThrowExceptionInstruction(expression: KtThrowExpression, blockScope: BlockScope, errorLabel: Label, thrownValue: PseudoValue) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ThrowExceptionInstruction[ClassConstructorDescriptorImpl]

'throwExpression' @ [310:43] ==> value-parameter throwExpression: KtThrowExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.throwException[ValueParameterDescriptorImpl]

'currentScope' @ [310:60] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'error' @ [310:74] ==> private final val error: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'thrownValue' @ [310:81] ==> value-parameter thrownValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.throwException[ValueParameterDescriptorImpl]

'allBlocks' @ [314:23] ==> private final val allBlocks: Stack<BlockInfo> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pop' @ [314:33] ==> public open fun pop(): (BlockInfo..BlockInfo?) defined in com.intellij.util.containers.Stack[JavaMethodDescriptor]

'assert' @ [315:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'pop' @ [315:20] ==> val pop: (BlockInfo..BlockInfo?) defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.exitTryFinally[LocalVariableDescriptor]

'labelCount' @ [319:13] ==> private final var labelCount: Int defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'pseudocode' @ [319:26] ==> public final val pseudocode: PseudocodeImpl defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'repeatPart' @ [319:37] ==> public final fun repeatPart(startLabel: Label, finishLabel: Label, labelCount: Int): Int defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'startLabel' @ [319:48] ==> value-parameter startLabel: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.repeatPseudocode[ValueParameterDescriptorImpl]

'finishLabel' @ [319:60] ==> value-parameter finishLabel: Label defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.repeatPseudocode[ValueParameterDescriptorImpl]

'labelCount' @ [319:73] ==> private final var labelCount: Int defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[PropertyDescriptorImpl]

'read' @ [322:98] ==> private final fun read(expression: KtExpression, resolvedCall: ResolvedCall<*>? = ..., receiverValues: Map<PseudoValue, ReceiverValue> = ...): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [322:103] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadConstant[ValueParameterDescriptorImpl]

'read' @ [324:85] ==> private final fun read(expression: KtExpression, resolvedCall: ResolvedCall<*>? = ..., receiverValues: Map<PseudoValue, ReceiverValue> = ...): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [324:90] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.createAnonymousObject[ValueParameterDescriptorImpl]

'read' @ [327:17] ==> private final fun read(expression: KtExpression, resolvedCall: ResolvedCall<*>? = ..., receiverValues: Map<PseudoValue, ReceiverValue> = ...): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'if (expression is KtFunctionLiteral) expression.getParent() as KtLambdaExpression else expression' @ [327:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'expression' @ [327:26] ==> value-parameter expression: KtFunction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.createLambda[ValueParameterDescriptorImpl]

'expression' @ [327:59] ==> value-parameter expression: KtFunction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.createLambda[ValueParameterDescriptorImpl]

'getParent' @ [327:70] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'expression' @ [327:109] ==> value-parameter expression: KtFunction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.createLambda[ValueParameterDescriptorImpl]

'if (inputValues.isEmpty()) read(expression)
                else magic(expression, expression, inputValues, MagicKind.STRING_TEMPLATE)' @ [333:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InstructionWithValue, elseBranch: InstructionWithValue): InstructionWithValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InstructionWithValue

'inputValues' @ [333:21] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadStringTemplate[ValueParameterDescriptorImpl]

'isEmpty' @ [333:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'read' @ [333:44] ==> private final fun read(expression: KtExpression, resolvedCall: ResolvedCall<*>? = ..., receiverValues: Map<PseudoValue, ReceiverValue> = ...): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [333:49] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadStringTemplate[ValueParameterDescriptorImpl]

'magic' @ [334:22] ==> public open fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [334:28] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadStringTemplate[ValueParameterDescriptorImpl]

'expression' @ [334:40] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadStringTemplate[ValueParameterDescriptorImpl]

'inputValues' @ [334:52] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.loadStringTemplate[ValueParameterDescriptorImpl]

'STRING_TEMPLATE' @ [334:75] ==> enum entry STRING_TEMPLATE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'MagicInstruction' @ [341:31] ==> public constructor MagicInstruction(element: KtElement, valueElement: KtElement?, blockScope: BlockScope, inputValues: List<PseudoValue>, kind: MagicKind, factory: PseudoValueFactory) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[ClassConstructorDescriptorImpl]

'instructionElement' @ [342:21] ==> value-parameter instructionElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[ValueParameterDescriptorImpl]

'valueElement' @ [342:41] ==> value-parameter valueElement: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[ValueParameterDescriptorImpl]

'currentScope' @ [342:55] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'inputValues' @ [342:69] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[ValueParameterDescriptorImpl]

'kind' @ [342:82] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[ValueParameterDescriptorImpl]

'valueFactory' @ [342:88] ==> private final val valueFactory: <no name provided> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [343:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'instruction' @ [343:17] ==> val instruction: MagicInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[LocalVariableDescriptor]

'instruction' @ [344:20] ==> val instruction: MagicInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.magic[LocalVariableDescriptor]

'MergeInstruction' @ [348:31] ==> public constructor MergeInstruction(element: KtElement, blockScope: BlockScope, inputValues: List<PseudoValue>, factory: PseudoValueFactory) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[ClassConstructorDescriptorImpl]

'expression' @ [348:48] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.merge[ValueParameterDescriptorImpl]

'currentScope' @ [348:60] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'inputValues' @ [348:74] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.merge[ValueParameterDescriptorImpl]

'valueFactory' @ [348:87] ==> private final val valueFactory: <no name provided> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [349:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'instruction' @ [349:17] ==> val instruction: MergeInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.merge[LocalVariableDescriptor]

'instruction' @ [350:20] ==> val instruction: MergeInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.merge[LocalVariableDescriptor]

'read' @ [357:13] ==> private final fun read(expression: KtExpression, resolvedCall: ResolvedCall<*>? = ..., receiverValues: Map<PseudoValue, ReceiverValue> = ...): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [357:18] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.readVariable[ValueParameterDescriptorImpl]

'resolvedCall' @ [357:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.readVariable[ValueParameterDescriptorImpl]

'receiverValues' @ [357:44] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.readVariable[ValueParameterDescriptorImpl]

'resolvedCall' @ [364:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [364:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'returnType' @ [364:63] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'CallInstruction' @ [365:31] ==> public constructor CallInstruction(element: KtElement, blockScope: BlockScope, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>, factory: PseudoValueFactory?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[ClassConstructorDescriptorImpl]

'valueElement' @ [366:21] ==> value-parameter valueElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[ValueParameterDescriptorImpl]

'currentScope' @ [367:21] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'resolvedCall' @ [368:21] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[ValueParameterDescriptorImpl]

'receiverValues' @ [369:21] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[ValueParameterDescriptorImpl]

'arguments' @ [370:21] ==> value-parameter arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[ValueParameterDescriptorImpl]

'if (returnType != null && KotlinBuiltIns.isNothing(returnType)) null else valueFactory' @ [371:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: <no name provided>?, elseBranch: <no name provided>?): <no name provided>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> <no name provided>?

'returnType' @ [371:25] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[LocalVariableDescriptor]

'isNothing' @ [371:62] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [371:72] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[LocalVariableDescriptor]

'valueFactory' @ [371:95] ==> private final val valueFactory: <no name provided> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'add' @ [372:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'instruction' @ [372:17] ==> val instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[LocalVariableDescriptor]

'instruction' @ [373:20] ==> val instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.call[LocalVariableDescriptor]

'magic' @ [379:73] ==> public open fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [379:79] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.predefinedOperation[ValueParameterDescriptorImpl]

'expression' @ [379:91] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.predefinedOperation[ValueParameterDescriptorImpl]

'inputValues' @ [379:103] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.predefinedOperation[ValueParameterDescriptorImpl]

'getMagicKind' @ [379:116] ==> private final fun getMagicKind(operation: ControlFlowBuilder.PredefinedOperation): MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'operation' @ [379:129] ==> value-parameter operation: ControlFlowBuilder.PredefinedOperation defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.predefinedOperation[ValueParameterDescriptorImpl]

'when (operation) {
            ControlFlowBuilder.PredefinedOperation.AND -> MagicKind.AND
            ControlFlowBuilder.PredefinedOperation.OR -> MagicKind.OR
            ControlFlowBuilder.PredefinedOperation.NOT_NULL_ASSERTION -> MagicKind.NOT_NULL_ASSERTION
        }' @ [381:87] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MagicKind, entry1: MagicKind, entry2: MagicKind): MagicKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MagicKind

'operation' @ [381:93] ==> value-parameter operation: ControlFlowBuilder.PredefinedOperation defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.getMagicKind[ValueParameterDescriptorImpl]

'AND' @ [382:52] ==> enum entry AND defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'AND' @ [382:69] ==> enum entry AND defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'OR' @ [383:52] ==> enum entry OR defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'OR' @ [383:68] ==> enum entry OR defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'NOT_NULL_ASSERTION' @ [384:52] ==> enum entry NOT_NULL_ASSERTION defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'NOT_NULL_ASSERTION' @ [384:84] ==> enum entry NOT_NULL_ASSERTION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'ReadValueInstruction' @ [391:13] ==> public constructor ReadValueInstruction(element: KtElement, blockScope: BlockScope, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>, factory: PseudoValueFactory) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[ClassConstructorDescriptorImpl]

'element' @ [391:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'currentScope' @ [391:43] ==> private final val currentScope: BlockScope defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'target' @ [391:57] ==> value-parameter target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'receiverValues' @ [391:65] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'valueFactory' @ [391:81] ==> private final val valueFactory: <no name provided> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[PropertyDescriptorImpl]

'apply' @ [391:95] ==> @InlineOnly public inline fun <T> ReadValueInstruction.apply(block: ReadValueInstruction.() -> Unit): ReadValueInstruction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReadValueInstruction

'add' @ [392:13] ==> private final fun add(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'this' @ [392:17] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read.<anonymous>[ReceiverParameterDescriptorImpl]

'emptyMap' @ [398:67] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ReceiverValue

'read' @ [399:13] ==> public open fun read(element: KtElement, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker[SimpleFunctionDescriptorImpl]

'expression' @ [399:18] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'if (resolvedCall != null) AccessTarget.Call(resolvedCall) else AccessTarget.BlackBox' @ [399:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AccessTarget, elseBranch: AccessTarget): AccessTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AccessTarget

'resolvedCall' @ [399:34] ==> value-parameter resolvedCall: ResolvedCall<*>? = ... defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'Call' @ [399:69] ==> public constructor Call(resolvedCall: ResolvedCall<*>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[ClassConstructorDescriptorImpl]

'resolvedCall' @ [399:74] ==> value-parameter resolvedCall: ResolvedCall<*>? = ... defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'BlackBox' @ [399:106] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'receiverValues' @ [399:116] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> = ... defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.ControlFlowInstructionsGeneratorWorker.read[ValueParameterDescriptorImpl]

'BlockInfo' @ [402:86] ==> public constructor BlockInfo() defined in org.jetbrains.kotlin.cfg.BlockInfo[JavaClassConstructorDescriptor]

'finallyBlock' @ [405:13] ==> private final val finallyBlock: GenerationTrigger defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator.TryFinallyBlockInfo[PropertyDescriptorImpl]

'generate' @ [405:26] ==> public abstract fun generate(): Unit defined in org.jetbrains.kotlin.cfg.GenerationTrigger[JavaMethodDescriptor]

