'MethodTransformer' @ [33:55] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'DeadCodeEliminationMethodTransformer' @ [34:39] ==> public constructor DeadCodeEliminationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[ClassConstructorDescriptorImpl]

'ConstantConditionsOptimization' @ [38:27] ==> public constructor ConstantConditionsOptimization(internalClassName: String, methodNode: MethodNode) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[ClassConstructorDescriptorImpl]

'internalClassName' @ [38:58] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [38:77] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'run' @ [38:89] ==> public final fun run(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'changes' @ [39:17] ==> val changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[LocalVariableDescriptor]

'deadCodeElimination' @ [39:26] ==> private final val deadCodeElimination: DeadCodeEliminationMethodTransformer defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer[PropertyDescriptorImpl]

'transform' @ [39:46] ==> public open fun transform(internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.DeadCodeEliminationMethodTransformer[SimpleFunctionDescriptorImpl]

'internalClassName' @ [39:56] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'methodNode' @ [39:75] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[ValueParameterDescriptorImpl]

'changes' @ [40:18] ==> val changes: Boolean defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.transform[LocalVariableDescriptor]

'collectRewriteActions' @ [45:27] ==> private final fun collectRewriteActions(): List<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'actions' @ [46:13] ==> val actions: List<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.run[LocalVariableDescriptor]

'forEach' @ [46:21] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [46:31] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'actions' @ [47:20] ==> val actions: List<() -> Unit> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.run[LocalVariableDescriptor]

'isNotEmpty' @ [47:28] ==> @InlineOnly public inline fun <T> Collection<() -> Unit>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'arrayListOf' @ [51:17] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'also' @ [51:43] ==> @InlineOnly @SinceKotlin public inline fun <T> ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */.also(block: (ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */) -> Unit): ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<Function0<Unit>>

'analyze' @ [52:34] ==> @NotNull public open fun <V : (Value..Value?)> analyze(@NotNull internalClassName: String, @NotNull node: MethodNode, @NotNull interpreter: Interpreter<(BasicValue..BasicValue?)>): (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaMethodDescriptor]
Inferred types:
    <V : (Value..Value?)> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'internalClassName' @ [52:42] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'methodNode' @ [52:61] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'ConstantPropagationInterpreter' @ [52:73] ==> public constructor ConstantPropagationInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter[ClassConstructorDescriptorImpl]

'methodNode' @ [53:33] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'instructions' @ [53:44] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [53:57] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'frames' @ [54:31] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'indices' @ [54:38] ==> public val <T> Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.analysis.Frame<(org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)>..org.jetbrains.org.objectweb.asm.tree.analysis.Frame<(org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)>?)

'frames' @ [55:37] ==> val frames: (Array<(Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>..Array<out (Frame<(BasicValue..BasicValue?)>..Frame<(BasicValue..BasicValue?)>?)>) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'i' @ [55:44] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'insns' @ [56:36] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'i' @ [56:42] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'when (insn.opcode) {
                            in Opcodes.IFEQ .. Opcodes.IFLE ->
                                tryRewriteComparisonWithZero(insn, frame, actions)
                            in Opcodes.IF_ICMPEQ .. Opcodes.IF_ICMPLE ->
                                tryRewriteBinaryComparison(insn, frame, actions)
                        }' @ [57:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [57:31] ==> val insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'opcode' @ [57:36] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'in' @ [58:29] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'..' @ [58:32] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IFEQ' @ [58:40] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLE' @ [58:56] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'tryRewriteComparisonWithZero' @ [59:33] ==> private final fun tryRewriteComparisonWithZero(insn: JumpInsnNode, frame: Frame<BasicValue>, actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */): Unit defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'insn' @ [59:62] ==> val insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'frame' @ [59:68] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'actions' @ [59:75] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[ValueParameterDescriptorImpl]

'in' @ [60:29] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'..' @ [60:32] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IF_ICMPEQ' @ [60:40] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLE' @ [60:61] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'tryRewriteBinaryComparison' @ [61:33] ==> private final fun tryRewriteBinaryComparison(insn: JumpInsnNode, frame: Frame<BasicValue>, actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */): Unit defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'insn' @ [61:60] ==> val insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'frame' @ [61:66] ==> val frame: Frame<(BasicValue..BasicValue?)> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[LocalVariableDescriptor]

'actions' @ [61:73] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.collectRewriteActions.<anonymous>[ValueParameterDescriptorImpl]

'frame' @ [67:23] ==> value-parameter frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'top' @ [67:29] ==> public fun <V : Value> Frame<BasicValue>.top(): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'safeAs' @ [67:37] ==> public inline fun <reified T : Any> Any?.safeAs(): ConstantConditionEliminationMethodTransformer.IConstValue? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IConstValue

'when (insn.opcode) {
                Opcodes.IFEQ -> top.value == 0
                Opcodes.IFNE -> top.value != 0
                Opcodes.IFGE -> top.value >= 0
                Opcodes.IFGT -> top.value > 0
                Opcodes.IFLE -> top.value <= 0
                Opcodes.IFLT -> top.value < 0
                else -> throw AssertionError("Unexpected instruction: ${insn.insnText}")
            }' @ [69:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'insn' @ [69:40] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'opcode' @ [69:45] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [70:25] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [70:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [70:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'IFNE' @ [71:25] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [71:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [71:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'IFGE' @ [72:25] ==> public const final val IFGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [72:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [72:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'IFGT' @ [73:25] ==> public const final val IFGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [73:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [73:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'IFLE' @ [74:25] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [74:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [74:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'IFLT' @ [75:25] ==> public const final val IFLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'top' @ [75:33] ==> val top: ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'value' @ [75:37] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'AssertionError' @ [76:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'insn' @ [76:73] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'insnText' @ [76:78] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'actions' @ [79:13] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'add' @ [79:21] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'methodNode' @ [80:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'instructions' @ [80:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [80:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insertBefore' @ [81:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [81:34] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'InsnNode' @ [81:40] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP' @ [81:57] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (constCondition)
                        set(insn, JumpInsnNode(Opcodes.GOTO, insn.label))
                    else
                        remove(insn)' @ [82:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'constCondition' @ [82:25] ==> val constCondition: Boolean defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[LocalVariableDescriptor]

'set' @ [83:25] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [83:29] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [83:35] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [83:56] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [83:62] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'label' @ [83:67] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'remove' @ [85:25] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [85:32] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteComparisonWithZero[ValueParameterDescriptorImpl]

'frame' @ [91:24] ==> value-parameter frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'peek' @ [91:30] ==> public fun <V : Value> Frame<BasicValue>.peek(offset: Int): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'frame' @ [92:24] ==> value-parameter frame: Frame<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'peek' @ [92:30] ==> public fun <V : Value> Frame<BasicValue>.peek(offset: Int): BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> BasicValue

'if (arg1 is IConstValue && arg2 is IConstValue) {
                rewriteBinaryComparisonOfConsts(insn, arg1.value, arg2.value, actions)
            }
            else if (arg2 is IConstValue && arg2.value == 0) {
                rewriteBinaryComparisonWith0(insn, actions)
            }' @ [94:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arg1' @ [94:17] ==> val arg1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'arg2' @ [94:40] ==> val arg2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'rewriteBinaryComparisonOfConsts' @ [95:17] ==> private final fun rewriteBinaryComparisonOfConsts(insn: JumpInsnNode, value1: Int, value2: Int, actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */): Unit defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'insn' @ [95:49] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'arg1' @ [95:55] ==> val arg1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'value' @ [95:60] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'arg2' @ [95:67] ==> val arg2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'value' @ [95:72] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'actions' @ [95:79] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'arg2' @ [97:22] ==> val arg2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'arg2' @ [97:45] ==> val arg2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[LocalVariableDescriptor]

'value' @ [97:50] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'rewriteBinaryComparisonWith0' @ [98:17] ==> private final fun rewriteBinaryComparisonWith0(insn: JumpInsnNode, actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */): Unit defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[SimpleFunctionDescriptorImpl]

'insn' @ [98:46] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'actions' @ [98:52] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.tryRewriteBinaryComparison[ValueParameterDescriptorImpl]

'when (insn.opcode) {
                Opcodes.IF_ICMPEQ -> value1 == value2
                Opcodes.IF_ICMPNE -> value1 != value2
                Opcodes.IF_ICMPLE -> value1 <= value2
                Opcodes.IF_ICMPLT -> value1 < value2
                Opcodes.IF_ICMPGE -> value1 >= value2
                Opcodes.IF_ICMPGT -> value1 > value2
                else -> throw AssertionError("Unexpected instruction: ${insn.insnText}")
            }' @ [103:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean, entry5: Boolean, entry6: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'insn' @ [103:40] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'opcode' @ [103:45] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IF_ICMPEQ' @ [104:25] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [104:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [104:48] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'IF_ICMPNE' @ [105:25] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [105:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [105:48] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'IF_ICMPLE' @ [106:25] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [106:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [106:48] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'IF_ICMPLT' @ [107:25] ==> public const final val IF_ICMPLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [107:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [107:47] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'IF_ICMPGE' @ [108:25] ==> public const final val IF_ICMPGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [108:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [108:48] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'IF_ICMPGT' @ [109:25] ==> public const final val IF_ICMPGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value1' @ [109:38] ==> value-parameter value1: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'value2' @ [109:47] ==> value-parameter value2: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'AssertionError' @ [110:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'insn' @ [110:73] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'insnText' @ [110:78] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'actions' @ [113:13] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'add' @ [113:21] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'methodNode' @ [114:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'instructions' @ [114:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [114:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insertBefore' @ [115:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [115:34] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'InsnNode' @ [115:40] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP' @ [115:57] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insertBefore' @ [117:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [117:34] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'InsnNode' @ [117:40] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP' @ [117:57] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (constCondition)
                        set(insn, JumpInsnNode(Opcodes.GOTO, insn.label))
                    else
                        remove(insn)' @ [118:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'constCondition' @ [118:25] ==> val constCondition: Boolean defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[LocalVariableDescriptor]

'set' @ [119:25] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [119:29] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [119:35] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [119:56] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [119:62] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'label' @ [119:67] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'remove' @ [121:25] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [121:32] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonOfConsts[ValueParameterDescriptorImpl]

'actions' @ [127:13] ==> value-parameter actions: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'add' @ [127:21] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'methodNode' @ [128:17] ==> public final val methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization[PropertyDescriptorImpl]

'instructions' @ [128:28] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'run' @ [128:41] ==> @InlineOnly public inline fun <T, R> (InsnList..InsnList?).run(block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'insertBefore' @ [129:21] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [129:34] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'InsnNode' @ [129:40] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'POP' @ [129:57] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when (insn.opcode) {
                        Opcodes.IF_ICMPEQ -> Opcodes.IFEQ
                        Opcodes.IF_ICMPNE -> Opcodes.IFNE
                        Opcodes.IF_ICMPLE -> Opcodes.IFLE
                        Opcodes.IF_ICMPLT -> Opcodes.IFLT
                        Opcodes.IF_ICMPGE -> Opcodes.IFGE
                        Opcodes.IF_ICMPGT -> Opcodes.IFGT
                        else -> throw AssertionError("Unexpected instruction: ${insn.insnText}")
                    }' @ [130:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int, entry5: Int, entry6: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'insn' @ [130:48] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'opcode' @ [130:53] ==> public final var JumpInsnNode.opcode: Int[MyPropertyDescriptor]

'IF_ICMPEQ' @ [131:33] ==> public const final val IF_ICMPEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFEQ' @ [131:54] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPNE' @ [132:33] ==> public const final val IF_ICMPNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNE' @ [132:54] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLE' @ [133:33] ==> public const final val IF_ICMPLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLE' @ [133:54] ==> public const final val IFLE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPLT' @ [134:33] ==> public const final val IF_ICMPLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFLT' @ [134:54] ==> public const final val IFLT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGE' @ [135:33] ==> public const final val IF_ICMPGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGE' @ [135:54] ==> public const final val IFGE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IF_ICMPGT' @ [136:33] ==> public const final val IF_ICMPGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFGT' @ [136:54] ==> public const final val IFGT: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'AssertionError' @ [137:39] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'insn' @ [137:81] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'insnText' @ [137:86] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'set' @ [139:21] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [139:25] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'JumpInsnNode' @ [139:31] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'cmpWith0Opcode' @ [139:44] ==> val cmpWith0Opcode: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0.<anonymous>.<anonymous>[LocalVariableDescriptor]

'insn' @ [139:60] ==> value-parameter insn: JumpInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantConditionsOptimization.rewriteBinaryComparisonWith0[ValueParameterDescriptorImpl]

'label' @ [139:65] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'StrictBasicValue' @ [145:69] ==> public constructor StrictBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[ClassConstructorDescriptorImpl]

'INT_TYPE' @ [145:91] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'other' @ [147:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.equals[ValueParameterDescriptorImpl]

'this' @ [147:27] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[LazyClassReceiverParameterDescriptor]

'other' @ [148:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.equals[ValueParameterDescriptorImpl]

'other' @ [148:41] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.equals[ValueParameterDescriptorImpl]

'value' @ [148:47] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'this' @ [148:56] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[LazyClassReceiverParameterDescriptor]

'value' @ [148:61] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'value' @ [150:40] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'value' @ [152:52] ==> public final val value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[PropertyDescriptorImpl]

'Array' @ [155:40] ==> public constructor Array<T>(size: Int, init: (Int) -> ConstantConditionEliminationMethodTransformer.IConstValue) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> IConstValue

'IConstValue' @ [155:51] ==> private constructor IConstValue(value: Int) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[ClassConstructorDescriptorImpl]

'it' @ [155:63] ==> value-parameter it: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion.ICONST_CACHE.<anonymous>[ValueParameterDescriptorImpl]

'if (value in -1 .. 5)
                        ICONST_CACHE[value + 1]
                    else
                        IConstValue(value)' @ [158:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstantConditionEliminationMethodTransformer.IConstValue, elseBranch: ConstantConditionEliminationMethodTransformer.IConstValue): ConstantConditionEliminationMethodTransformer.IConstValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IConstValue

'value' @ [158:25] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion.of[ValueParameterDescriptorImpl]

'-' @ [158:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ICONST_CACHE' @ [159:25] ==> private final val ICONST_CACHE: Array<ConstantConditionEliminationMethodTransformer.IConstValue> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion[PropertyDescriptorImpl]

'value' @ [159:38] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion.of[ValueParameterDescriptorImpl]

'IConstValue' @ [161:25] ==> private constructor IConstValue(value: Int) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue[ClassConstructorDescriptorImpl]

'value' @ [161:37] ==> value-parameter value: Int defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion.of[ValueParameterDescriptorImpl]

'OptimizationBasicInterpreter' @ [165:52] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'when (insn.opcode) {
                    in Opcodes.ICONST_M1 .. Opcodes.ICONST_5 ->
                        IConstValue.of(insn.opcode - Opcodes.ICONST_0)
                    Opcodes.BIPUSH, Opcodes.SIPUSH ->
                        IConstValue.of(insn.cast<IntInsnNode>().operand)
                    Opcodes.LDC -> {
                        val operand = insn.cast<LdcInsnNode>().cst
                        if (operand is Int)
                            IConstValue.of(operand)
                        else
                            super.newOperation(insn)
                    }
                    else -> super.newOperation(insn)
                }' @ [167:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue, entry1: BasicValue, entry2: BasicValue, entry3: BasicValue): BasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue

'insn' @ [167:23] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [167:28] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'in' @ [168:21] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'..' @ [168:24] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ICONST_M1' @ [168:32] ==> public const final val ICONST_M1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ICONST_5' @ [168:53] ==> public const final val ICONST_5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'of' @ [169:37] ==> public final fun of(value: Int): ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion[SimpleFunctionDescriptorImpl]

'insn' @ [169:40] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [169:45] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ICONST_0' @ [169:62] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'BIPUSH' @ [170:29] ==> public const final val BIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SIPUSH' @ [170:45] ==> public const final val SIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'of' @ [171:37] ==> public final fun of(value: Int): ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion[SimpleFunctionDescriptorImpl]

'insn' @ [171:40] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'cast' @ [171:45] ==> public inline fun <reified T : Any> Any?.cast(): IntInsnNode defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IntInsnNode

'operand' @ [171:65] ==> public final var operand: Int defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaPropertyDescriptor]

'LDC' @ [172:29] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [173:39] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'cast' @ [173:44] ==> public inline fun <reified T : Any> Any?.cast(): LdcInsnNode defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LdcInsnNode

'cst' @ [173:64] ==> public final var cst: (Any..Any?) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaPropertyDescriptor]

'if (operand is Int)
                            IConstValue.of(operand)
                        else
                            super.newOperation(insn)' @ [174:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (BasicValue..BasicValue?), elseBranch: (BasicValue..BasicValue?)): (BasicValue..BasicValue?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue..org.jetbrains.org.objectweb.asm.tree.analysis.BasicValue?)

'operand' @ [174:29] ==> val operand: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[LocalVariableDescriptor]

'of' @ [175:41] ==> public final fun of(value: Int): ConstantConditionEliminationMethodTransformer.IConstValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.IConstValue.Companion[SimpleFunctionDescriptorImpl]

'operand' @ [175:44] ==> val operand: (Any..Any?) defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[LocalVariableDescriptor]

'super' @ [177:29] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter[LazyClassReceiverParameterDescriptor]

'newOperation' @ [177:35] ==> @Override public open fun newOperation(@NotNull insn: AbstractInsnNode): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [177:48] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'super' @ [179:29] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter[LazyClassReceiverParameterDescriptor]

'newOperation' @ [179:35] ==> @Override public open fun newOperation(@NotNull insn: AbstractInsnNode): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [179:48] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.newOperation[ValueParameterDescriptorImpl]

'if (v is IConstValue && w is IConstValue && v == w)
                    v
                else
                    super.merge(v, w)' @ [183:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BasicValue, elseBranch: BasicValue): BasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BasicValue

'v' @ [183:21] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [183:41] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [183:61] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [183:66] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [184:21] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'super' @ [186:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter[LazyClassReceiverParameterDescriptor]

'merge' @ [186:27] ==> @NotNull @Override public open fun merge(@NotNull v: BasicValue, @NotNull w: BasicValue): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'v' @ [186:33] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [186:36] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.ConstantConditionEliminationMethodTransformer.ConstantPropagationInterpreter.merge[ValueParameterDescriptorImpl]

