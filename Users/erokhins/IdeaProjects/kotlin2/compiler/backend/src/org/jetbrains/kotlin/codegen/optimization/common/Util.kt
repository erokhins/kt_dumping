'when (this.type) {
        AbstractInsnNode.LABEL, AbstractInsnNode.LINE, AbstractInsnNode.FRAME -> false
        else -> true
    }' @ [27:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [27:11] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.isMeaningful[ReceiverParameterDescriptorImpl]

'type' @ [27:16] ==> public final val AbstractInsnNode.type: Int[MyPropertyDescriptor]

'LABEL' @ [28:26] ==> public const final val LABEL: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'LINE' @ [28:50] ==> public const final val LINE: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'FRAME' @ [28:73] ==> public const final val FRAME: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'this' @ [33:39] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'insnList' @ [33:44] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.<init>[ValueParameterDescriptorImpl]

'first' @ [33:53] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'from' @ [37:46] ==> public final val from: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[PropertyDescriptorImpl]

'current' @ [39:30] ==> public final var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'current' @ [40:17] ==> public final var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'current' @ [40:27] ==> public final var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [40:37] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'result' @ [41:24] ==> val result: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'current' @ [43:38] ==> public final var current: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'to' @ [43:49] ==> public final val to: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[PropertyDescriptorImpl]

'InsnSequence' @ [48:29] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'this' @ [48:42] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.asSequence[ReceiverParameterDescriptorImpl]

'removeEmptyCatchBlocks' @ [51:5] ==> public fun MethodNode.removeEmptyCatchBlocks(): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'localVariables' @ [54:5] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'localVariables' @ [54:22] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filter' @ [54:37] ==> public inline fun <T> Iterable<(LocalVariableNode..LocalVariableNode?)>.filter(predicate: ((LocalVariableNode..LocalVariableNode?)) -> Boolean): List<(LocalVariableNode..LocalVariableNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'InsnSequence' @ [55:9] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'lv' @ [55:22] ==> value-parameter lv: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [55:25] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'lv' @ [55:32] ==> value-parameter lv: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [55:35] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'any' @ [55:40] ==> public inline fun <T> Sequence<AbstractInsnNode>.any(predicate: (AbstractInsnNode) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'AbstractInsnNode' @ [55:44] ==> protected/*protected and package*/ constructor AbstractInsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaClassConstructorDescriptor]

'instructions' @ [60:19] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'last' @ [60:32] ==> public final val InsnList.last: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'!' @ [61:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'current' @ [61:13] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'isMeaningful' @ [61:21] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'current' @ [62:20] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'previous' @ [62:28] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'current' @ [64:13] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'type' @ [64:21] ==> public final val AbstractInsnNode.type: Int[MyPropertyDescriptor]

'LINE' @ [64:46] ==> public const final val LINE: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'instructions' @ [65:13] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [65:26] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'current' @ [65:33] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'current' @ [68:9] ==> var current: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'prev' @ [68:19] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.prepareForEmitting[LocalVariableDescriptor]

'tryCatchBlocks' @ [73:5] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'tryCatchBlocks' @ [73:22] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filter' @ [73:37] ==> public inline fun <T> Iterable<(TryCatchBlockNode..TryCatchBlockNode?)>.filter(predicate: ((TryCatchBlockNode..TryCatchBlockNode?)) -> Boolean): List<(TryCatchBlockNode..TryCatchBlockNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode..org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode?)

'InsnSequence' @ [74:9] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'tcb' @ [74:22] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeEmptyCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [74:26] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'tcb' @ [74:33] ==> value-parameter tcb: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeEmptyCatchBlocks.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [74:37] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'any' @ [74:42] ==> public inline fun <T> Sequence<AbstractInsnNode>.any(predicate: (AbstractInsnNode) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'AbstractInsnNode' @ [74:46] ==> protected/*protected and package*/ constructor AbstractInsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaClassConstructorDescriptor]

'BooleanArray' @ [79:16] ==> public constructor BooleanArray(size: Int, init: (Int) -> Boolean) defined in kotlin.BooleanArray[DeserializedClassConstructorDescriptor]

'maxLocals' @ [79:29] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'instructions' @ [80:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'when (insn) {
            is VarInsnNode -> {
                val varIndex = insn.`var`
                used[varIndex] = true
                if (insn.isSize2LoadStoreOperation()) {
                    used[varIndex + 1] = true
                }
            }
            is IincInsnNode ->
                used[insn.`var`] = true
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [81:15] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'insn' @ [83:32] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'`var`' @ [83:37] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'used' @ [84:17] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'varIndex' @ [84:22] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'insn' @ [85:21] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'isSize2LoadStoreOperation' @ [85:26] ==> private fun VarInsnNode.isSize2LoadStoreOperation(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]

'used' @ [86:21] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'varIndex' @ [86:26] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'used' @ [90:17] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'insn' @ [90:22] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'`var`' @ [90:27] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

'localVariables' @ [93:22] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'localVar' @ [94:24] ==> val localVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'index' @ [94:33] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'used' @ [95:9] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'varIndex' @ [95:14] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'getType' @ [96:25] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'localVar' @ [96:33] ==> val localVar: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'desc' @ [96:42] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'type' @ [97:13] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'size' @ [97:18] ==> public final val Type.size: Int[MyPropertyDescriptor]

'used' @ [98:13] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'varIndex' @ [98:18] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'used' @ [102:9] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'all' @ [102:14] ==> public inline fun BooleanArray.all(predicate: (Boolean) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'it' @ [102:20] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables.<anonymous>[ValueParameterDescriptorImpl]

'IntArray' @ [104:21] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'maxLocals' @ [104:30] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remapping' @ [106:15] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'indices' @ [106:25] ==> public val IntArray.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'remapping' @ [107:9] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'i' @ [107:19] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'lastUnused' @ [107:24] ==> var lastUnused: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'used' @ [108:13] ==> val used: BooleanArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'i' @ [108:18] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'lastUnused' @ [109:13] ==> var lastUnused: Int defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'remapLocalVariables' @ [113:5] ==> public fun MethodNode.remapLocalVariables(remapping: IntArray): Unit defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'remapping' @ [113:25] ==> val remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.removeUnusedLocalVariables[LocalVariableDescriptor]

'opcode' @ [117:9] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'LLOAD' @ [117:19] ==> public const final val LLOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [117:28] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'DLOAD' @ [117:38] ==> public const final val DLOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [117:47] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'LSTORE' @ [117:57] ==> public const final val LSTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [117:67] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'DSTORE' @ [117:77] ==> public const final val DSTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'instructions' @ [120:18] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [120:31] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'when (insn) {
            is VarInsnNode ->
                insn.`var` = remapping[insn.`var`]
            is IincInsnNode ->
                insn.`var` = remapping[insn.`var`]
        }' @ [121:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'insn' @ [121:15] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'insn' @ [123:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'`var`' @ [123:22] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'remapping' @ [123:30] ==> value-parameter remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[ValueParameterDescriptorImpl]

'insn' @ [123:40] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'`var`' @ [123:45] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'insn' @ [125:17] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'`var`' @ [125:22] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

'remapping' @ [125:30] ==> value-parameter remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[ValueParameterDescriptorImpl]

'insn' @ [125:40] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'`var`' @ [125:45] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.IincInsnNode[JavaPropertyDescriptor]

'localVariables' @ [129:31] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'localVariableNode' @ [130:9] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'index' @ [130:27] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'remapping' @ [130:35] ==> value-parameter remapping: IntArray defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[ValueParameterDescriptorImpl]

'localVariableNode' @ [130:45] ==> val localVariableNode: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.remapLocalVariables[LocalVariableDescriptor]

'index' @ [130:63] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'this' @ [135:18] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[ReceiverParameterDescriptorImpl]

'next' @ [135:23] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'finger' @ [136:12] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[LocalVariableDescriptor]

'!' @ [136:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [136:31] ==> public abstract operator fun invoke(p1: AbstractInsnNode): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'finger' @ [136:41] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[LocalVariableDescriptor]

'finger' @ [137:9] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[LocalVariableDescriptor]

'finger' @ [137:18] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[LocalVariableDescriptor]

'next' @ [137:25] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'finger' @ [139:12] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findNextOrNull[LocalVariableDescriptor]

'this' @ [143:18] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[ReceiverParameterDescriptorImpl]

'previous' @ [143:23] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'finger' @ [144:12] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[LocalVariableDescriptor]

'!' @ [144:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [144:31] ==> public abstract operator fun invoke(p1: AbstractInsnNode): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'finger' @ [144:41] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[LocalVariableDescriptor]

'finger' @ [145:9] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[LocalVariableDescriptor]

'finger' @ [145:18] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[LocalVariableDescriptor]

'previous' @ [145:25] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'finger' @ [147:12] ==> var finger: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.findPreviousOrNull[LocalVariableDescriptor]

'opcode' @ [151:9] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'when (opcode) {
        in ICONST_M1..ICONST_5 -> opcode - ICONST_0
        BIPUSH, SIPUSH -> (this as IntInsnNode).operand
        LDC -> (this as LdcInsnNode).cst as? Int
        else -> null
    }' @ [167:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?, entry3: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'opcode' @ [167:11] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'in' @ [168:9] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'ICONST_M1' @ [168:12] ==> public const final val ICONST_M1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ICONST_5' @ [168:23] ==> public const final val ICONST_5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [168:35] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ICONST_0' @ [168:44] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'BIPUSH' @ [169:9] ==> public const final val BIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SIPUSH' @ [169:17] ==> public const final val SIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'this' @ [169:28] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.intConstant[ReceiverParameterDescriptorImpl]

'operand' @ [169:49] ==> public final var operand: Int defined in org.jetbrains.org.objectweb.asm.tree.IntInsnNode[JavaPropertyDescriptor]

'LDC' @ [170:9] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'this' @ [170:17] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.intConstant[ReceiverParameterDescriptorImpl]

'cst' @ [170:38] ==> public final var cst: (Any..Any?) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaPropertyDescriptor]

'InsnList' @ [174:50] ==> public constructor InsnList() defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaClassConstructorDescriptor]

'apply' @ [174:61] ==> @InlineOnly public inline fun <T> InsnList.apply(block: InsnList.() -> Unit): InsnList defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InsnList

'insns' @ [174:69] ==> value-parameter vararg insns: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.insnListOf[ValueParameterDescriptorImpl]

'forEach' @ [174:75] ==> public inline fun <T> Array<out AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'add' @ [174:85] ==> public open fun add(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'it' @ [174:89] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.insnListOf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [176:52] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'..' @ [176:62] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ISTORE' @ [176:70] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ASTORE' @ [176:86] ==> public const final val ASTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [177:51] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'..' @ [177:61] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ILOAD' @ [177:69] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ALOAD' @ [177:84] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (this == null) "<null>" else "${this::class.java.simpleName}: $insnText"' @ [180:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [180:13] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.debugText[ReceiverParameterDescriptorImpl]

'this' @ [180:44] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.common.debugText[ReceiverParameterDescriptorImpl]

'java' @ [180:56] ==> public val <T> KClass<out AbstractInsnNode>.java: Class<out AbstractInsnNode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'simpleName' @ [180:61] ==> public final val <T : (Any..Any?)> Class<out AbstractInsnNode>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractInsnNode

'insnText' @ [180:75] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'takeInsnIf' @ [183:9] ==> internal inline fun <reified T : AbstractInsnNode> AbstractInsnNode.takeInsnIf(opcode: Int, condition: T.() -> Boolean): T? defined in org.jetbrains.kotlin.codegen.optimization.common[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : AbstractInsnNode> -> T

'opcode' @ [183:20] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.optimization.common.isInsn[ValueParameterDescriptorImpl]

'condition' @ [183:28] ==> value-parameter condition: T.() -> Boolean defined in org.jetbrains.kotlin.codegen.optimization.common.isInsn[ValueParameterDescriptorImpl]

'takeIf' @ [186:9] ==> @InlineOnly @SinceKotlin public inline fun <T> AbstractInsnNode.takeIf(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [186:18] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.common.takeInsnIf.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [186:21] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'opcode' @ [186:31] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.optimization.common.takeInsnIf[ValueParameterDescriptorImpl]

'safeAs' @ [186:41] ==> public inline fun <reified T : Any> Any?.safeAs(): T? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> T

'takeIf' @ [186:54] ==> @InlineOnly @SinceKotlin public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [186:63] ==> value-parameter it: T defined in org.jetbrains.kotlin.codegen.optimization.common.takeInsnIf.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [186:66] ==> public abstract operator fun T.invoke(): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

