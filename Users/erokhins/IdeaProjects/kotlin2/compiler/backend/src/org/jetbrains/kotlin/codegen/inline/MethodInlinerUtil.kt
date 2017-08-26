'SmartSet' @ [36:25] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [36:34] ==> @JvmStatic public final fun <T> create(): SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'SmartSet' @ [38:21] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [38:30] ==> @JvmStatic public final fun <T> create(): SmartSet<LambdaInfo?> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo?

'sourceValue' @ [39:5] ==> value-parameter sourceValue: SourceValue defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insns' @ [39:17] ==> public final val insns: (MutableSet<(AbstractInsnNode..AbstractInsnNode?)>..Set<(AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.SourceValue[JavaPropertyDescriptor]

'mapTo' @ [39:23] ==> public inline fun <T, R, C : MutableCollection<in LambdaInfo?>> Iterable<(AbstractInsnNode..AbstractInsnNode?)>.mapTo(destination: SmartSet<LambdaInfo?>, transform: ((AbstractInsnNode..AbstractInsnNode?)) -> LambdaInfo?): SmartSet<LambdaInfo?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)
    <R> -> LambdaInfo?
    <C : MutableCollection<in R>> -> SmartSet<LambdaInfo?>

'lambdaSet' @ [39:29] ==> val lambdaSet: SmartSet<LambdaInfo?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'getLambdaIfExistsAndMarkInstructions' @ [40:9] ==> private fun MethodInliner.getLambdaIfExistsAndMarkInstructions(insnNode: AbstractInsnNode?, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'it' @ [40:46] ==> value-parameter it: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions.<anonymous>[ValueParameterDescriptorImpl]

'processSwap' @ [40:50] ==> value-parameter processSwap: Boolean defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnList' @ [40:63] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'frames' @ [40:73] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'toDeleteInner' @ [40:81] ==> val toDeleteInner: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'lambdaSet' @ [43:12] ==> val lambdaSet: SmartSet<LambdaInfo?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'singleOrNull' @ [43:22] ==> public fun <T> Iterable<LambdaInfo?>.singleOrNull(): LambdaInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo?

'also' @ [43:38] ==> @InlineOnly @SinceKotlin public inline fun <T> LambdaInfo.also(block: (LambdaInfo) -> Unit): LambdaInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo

'toDelete' @ [44:9] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'addAll' @ [44:18] ==> public abstract fun addAll(elements: Collection<AbstractInsnNode>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'toDeleteInner' @ [44:25] ==> val toDeleteInner: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'insns' @ [48:46] ==> public final val insns: (MutableSet<(AbstractInsnNode..AbstractInsnNode?)>..Set<(AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.SourceValue[JavaPropertyDescriptor]

'singleOrNull' @ [48:52] ==> public fun <T> Iterable<(AbstractInsnNode..AbstractInsnNode?)>.singleOrNull(): AbstractInsnNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'insnNode' @ [57:9] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'getLambdaIfExists' @ [59:5] ==> internal final fun getLambdaIfExists(insnNode: AbstractInsnNode): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'insnNode' @ [59:23] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'let' @ [59:34] ==> @InlineOnly public inline fun <T, R> LambdaInfo.let(block: (LambdaInfo) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo
    <R> -> Nothing

'toDelete' @ [61:9] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'add' @ [61:18] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [61:22] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'it' @ [62:16] ==> value-parameter it: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions.<anonymous>[ValueParameterDescriptorImpl]

'if (insnNode is VarInsnNode && insnNode.opcode == Opcodes.ALOAD) {
        val varIndex = insnNode.`var`
        val localFrame = frames[insnList.indexOf(insnNode)] ?: return null
        val storeIns = localFrame.getLocal(varIndex).singleOrNullInsn()
        if (storeIns is VarInsnNode && storeIns.getOpcode() == Opcodes.ASTORE) {
            val frame = frames[insnList.indexOf(storeIns)] ?: return null
            val topOfStack = frame.top()!!
            getLambdaIfExistsAndMarkInstructions(topOfStack, processSwap, insnList, frames, toDelete)?.let {
                //remove intermediate lambda astore, aload instruction: see 'complexStack/simple.1.kt' test
                toDelete.add(storeIns)
                toDelete.add(insnNode)
                return it
            }
        }
    }
    else if (processSwap && insnNode.opcode == Opcodes.SWAP) {
        val swapFrame = frames[insnList.indexOf(insnNode)] ?: return null
        val dispatchReceiver = swapFrame.top()!!
        getLambdaIfExistsAndMarkInstructions(dispatchReceiver, false, insnList, frames, toDelete)?.let {
            //remove swap instruction (dispatch receiver would be deleted on recursion call): see 'complexStack/simpleExtension.1.kt' test
            toDelete.add(insnNode)
            return it
        }
    }' @ [65:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'insnNode' @ [65:9] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnNode' @ [65:36] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'opcode' @ [65:45] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [65:63] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insnNode' @ [66:24] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'`var`' @ [66:33] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'frames' @ [67:26] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnList' @ [67:33] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'indexOf' @ [67:42] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [67:50] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'localFrame' @ [68:24] ==> val localFrame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'getLocal' @ [68:35] ==> public open fun getLocal(p0: Int): (SourceValue..SourceValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'varIndex' @ [68:44] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'singleOrNullInsn' @ [68:54] ==> private fun SourceValue.singleOrNullInsn(): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'storeIns' @ [69:13] ==> val storeIns: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'storeIns' @ [69:40] ==> val storeIns: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'getOpcode' @ [69:49] ==> public open fun getOpcode(): Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'ASTORE' @ [69:72] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'frames' @ [70:25] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnList' @ [70:32] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'indexOf' @ [70:41] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'storeIns' @ [70:49] ==> val storeIns: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'frame' @ [71:30] ==> val frame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'top' @ [71:36] ==> public fun <V : Value> Frame<SourceValue>.top(): SourceValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> SourceValue

'getLambdaIfExistsAndMarkInstructions' @ [72:13] ==> public fun MethodInliner.getLambdaIfExistsAndMarkInstructions(sourceValue: SourceValue, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'topOfStack' @ [72:50] ==> val topOfStack: SourceValue defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'processSwap' @ [72:62] ==> value-parameter processSwap: Boolean defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnList' @ [72:75] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'frames' @ [72:85] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'toDelete' @ [72:93] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'let' @ [72:104] ==> @InlineOnly public inline fun <T, R> LambdaInfo.let(block: (LambdaInfo) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo
    <R> -> Nothing

'toDelete' @ [74:17] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'add' @ [74:26] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'storeIns' @ [74:30] ==> val storeIns: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'toDelete' @ [75:17] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'add' @ [75:26] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [75:30] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'it' @ [76:24] ==> value-parameter it: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions.<anonymous>[ValueParameterDescriptorImpl]

'processSwap' @ [80:14] ==> value-parameter processSwap: Boolean defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnNode' @ [80:29] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'opcode' @ [80:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'SWAP' @ [80:56] ==> public const final val SWAP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'frames' @ [81:25] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'insnList' @ [81:32] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'indexOf' @ [81:41] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [81:49] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'swapFrame' @ [82:32] ==> val swapFrame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'top' @ [82:42] ==> public fun <V : Value> Frame<SourceValue>.top(): SourceValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> SourceValue

'getLambdaIfExistsAndMarkInstructions' @ [83:9] ==> public fun MethodInliner.getLambdaIfExistsAndMarkInstructions(sourceValue: SourceValue, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [83:46] ==> val dispatchReceiver: SourceValue defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[LocalVariableDescriptor]

'insnList' @ [83:71] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'frames' @ [83:81] ==> value-parameter frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'toDelete' @ [83:89] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'let' @ [83:100] ==> @InlineOnly public inline fun <T, R> LambdaInfo.let(block: (LambdaInfo) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo
    <R> -> Nothing

'toDelete' @ [85:13] ==> value-parameter toDelete: MutableSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'add' @ [85:22] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [85:26] ==> value-parameter insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions[ValueParameterDescriptorImpl]

'it' @ [86:20] ==> value-parameter it: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.getLambdaIfExistsAndMarkInstructions.<anonymous>[ValueParameterDescriptorImpl]

'if (isStatic) 0 else 1' @ [94:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isStatic' @ [94:26] ==> value-parameter isStatic: Boolean defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets[ValueParameterDescriptorImpl]

'Array' @ [95:12] ==> public constructor Array<T>(size: Int, init: (Int) -> Int) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Int

'valueParameters' @ [95:18] ==> value-parameter valueParameters: List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets[ValueParameterDescriptorImpl]

'size' @ [95:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'nextOffset' @ [96:9] ==> var nextOffset: Int defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets[LocalVariableDescriptor]

'also' @ [96:20] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.also(block: (Int) -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'nextOffset' @ [97:13] ==> var nextOffset: Int defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets[LocalVariableDescriptor]

'valueParameters' @ [97:27] ==> value-parameter valueParameters: List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets[ValueParameterDescriptorImpl]

'index' @ [97:43] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.parameterOffsets.<anonymous>[ValueParameterDescriptorImpl]

'asmType' @ [97:50] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'size' @ [97:58] ==> public final val Type.size: Int[MyPropertyDescriptor]

'instructions' @ [103:9] ==> value-parameter instructions: Sequence<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.remove[ValueParameterDescriptorImpl]

'forEach' @ [103:22] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'this@remove' @ [104:13] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.remove[ReceiverParameterDescriptorImpl]

'instructions' @ [104:25] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [104:38] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [104:45] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.remove.<anonymous>[ValueParameterDescriptorImpl]

'instructions' @ [108:5] ==> value-parameter instructions: Collection<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.remove[ValueParameterDescriptorImpl]

'forEach' @ [108:18] ==> @HidesMembers public inline fun <T> Iterable<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'this@remove' @ [109:9] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.remove[ReceiverParameterDescriptorImpl]

'instructions' @ [109:21] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [109:34] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [109:41] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.remove.<anonymous>[ValueParameterDescriptorImpl]

'InsnSequence' @ [114:12] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'instructions' @ [114:25] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filterIsInstance' @ [114:39] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<FieldInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FieldInsnNode

'filter' @ [115:13] ==> public fun <T> Sequence<FieldInsnNode>.filter(predicate: (FieldInsnNode) -> Boolean): Sequence<FieldInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FieldInsnNode

'fieldNode' @ [121:32] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [121:42] ==> public final val FieldInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'previous' @ [121:52] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'fieldNode' @ [123:17] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [123:27] ==> public final var FieldInsnNode.opcode: Int[MyPropertyDescriptor]

'PUTFIELD' @ [123:45] ==> public const final val PUTFIELD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isCapturedFieldName' @ [124:17] ==> internal fun isCapturedFieldName(fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'fieldNode' @ [124:37] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [124:47] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'fieldNode' @ [125:17] ==> value-parameter fieldNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [125:27] ==> public final val FieldInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'prevPrev' @ [125:54] ==> val prevPrev: VarInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[LocalVariableDescriptor]

'prevPrev' @ [125:74] ==> val prevPrev: VarInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findCapturedFieldAssignmentInstructions.<anonymous>[LocalVariableDescriptor]

'`var`' @ [125:83] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'next' @ [130:37] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'result' @ [131:12] ==> var result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getNextMeaningful[LocalVariableDescriptor]

'!' @ [131:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [131:31] ==> var result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getNextMeaningful[LocalVariableDescriptor]

'isMeaningful' @ [131:38] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'result' @ [132:9] ==> var result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getNextMeaningful[LocalVariableDescriptor]

'result' @ [132:18] ==> var result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getNextMeaningful[LocalVariableDescriptor]

'next' @ [132:25] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'result' @ [134:12] ==> var result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.getNextMeaningful[LocalVariableDescriptor]

