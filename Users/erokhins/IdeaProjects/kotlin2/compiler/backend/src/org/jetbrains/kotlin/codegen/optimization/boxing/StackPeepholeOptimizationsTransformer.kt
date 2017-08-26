'MethodTransformer' @ [27:47] ==> public constructor MethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer[JavaClassConstructorDescriptor]

'transformOnce' @ [29:16] ==> private final fun transformOnce(methodNode: MethodNode): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'methodNode' @ [29:30] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transform[ValueParameterDescriptorImpl]

'ArrayList' @ [34:23] ==> public final fun <E> <init>(): ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Function1<InsnList, Unit>

'methodNode' @ [36:21] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[ValueParameterDescriptorImpl]

'instructions' @ [36:32] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [36:45] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'until' @ [38:28] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'insns' @ [38:36] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'size' @ [38:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'insns' @ [39:24] ==> val insns: (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'i' @ [39:30] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'insn' @ [40:24] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'previous' @ [40:29] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insn' @ [41:30] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'findPreviousOrNull' @ [41:35] ==> public inline fun AbstractInsnNode.findPreviousOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [41:56] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [41:59] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [41:77] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when (insn.opcode) {
                Opcodes.POP -> {
                    when {
                        prevNonNop.isEliminatedByPop() -> actions.add {
                            it.set(insn, InsnNode(Opcodes.NOP))
                            it.remove(prevNonNop)
                        }
                        prevNonNop.opcode == Opcodes.DUP_X1 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.SWAP))
                        }
                    }
                }

                Opcodes.SWAP -> {
                    val prevNonNop2 = prevNonNop.findPreviousOrNull { it.opcode != Opcodes.NOP } ?: continue@forInsn
                    if (prevNonNop.isPurePushOfSize1() && prevNonNop2.isPurePushOfSize1()) {
                        actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, prevNonNop2.clone(emptyMap()))
                            it.set(prevNonNop2, prevNonNop.clone(emptyMap()))
                        }
                    }
                }

                Opcodes.I2L -> {
                    when (prevNonNop.opcode) {
                        Opcodes.ICONST_0 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.LCONST_0))
                        }
                        Opcodes.ICONST_1 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.LCONST_1))
                        }
                    }
                }

                Opcodes.POP2 -> {
                    if (prevNonNop.isEliminatedByPop2()) {
                        actions.add {
                            it.set(insn, InsnNode(Opcodes.NOP))
                            it.remove(prevNonNop)
                        }
                    }
                    else if (i > 1) {
                        val prevNonNop2 = prevNonNop.findPreviousOrNull { it.opcode != Opcodes.NOP } ?: continue@forInsn
                        if (prevNonNop.isEliminatedByPop() && prevNonNop2.isEliminatedByPop()) {
                            actions.add {
                                it.set(insn, InsnNode(Opcodes.NOP))
                                it.remove(prevNonNop)
                                it.remove(prevNonNop2)
                            }
                        }
                    }
                }

                Opcodes.NOP ->
                    if (prev.opcode == Opcodes.NOP) {
                        actions.add {
                            it.remove(prev)
                        }
                    }
            }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'insn' @ [43:19] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'opcode' @ [43:24] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP' @ [44:25] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when {
                        prevNonNop.isEliminatedByPop() -> actions.add {
                            it.set(insn, InsnNode(Opcodes.NOP))
                            it.remove(prevNonNop)
                        }
                        prevNonNop.opcode == Opcodes.DUP_X1 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.SWAP))
                        }
                    }' @ [45:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'prevNonNop' @ [46:25] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isEliminatedByPop' @ [46:36] ==> private final fun AbstractInsnNode.isEliminatedByPop(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'actions' @ [46:59] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [46:67] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [47:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [47:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [47:36] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [47:42] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'NOP' @ [47:59] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [48:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [48:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [48:39] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'prevNonNop' @ [50:25] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'opcode' @ [50:36] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP_X1' @ [50:54] ==> public const final val DUP_X1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'actions' @ [50:64] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [50:72] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [51:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [51:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [51:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'it' @ [52:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [52:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [52:36] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [52:48] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'SWAP' @ [52:65] ==> public const final val SWAP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'SWAP' @ [57:25] ==> public const final val SWAP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prevNonNop' @ [58:39] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'findPreviousOrNull' @ [58:50] ==> public inline fun AbstractInsnNode.findPreviousOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [58:71] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [58:74] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [58:92] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prevNonNop' @ [59:25] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isPurePushOfSize1' @ [59:36] ==> private final fun AbstractInsnNode.isPurePushOfSize1(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'prevNonNop2' @ [59:59] ==> val prevNonNop2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isPurePushOfSize1' @ [59:71] ==> private final fun AbstractInsnNode.isPurePushOfSize1(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'actions' @ [60:25] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [60:33] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [61:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [61:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [61:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'it' @ [62:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [62:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [62:36] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'prevNonNop2' @ [62:48] ==> val prevNonNop2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'clone' @ [62:60] ==> public abstract fun clone(p0: (MutableMap<(LabelNode..LabelNode?), (LabelNode..LabelNode?)>..Map<(LabelNode..LabelNode?), (LabelNode..LabelNode?)>?)): (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'emptyMap' @ [62:66] ==> public fun <K, V> emptyMap(): Map<(LabelNode..LabelNode?), (LabelNode..LabelNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)
    <V> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)

'it' @ [63:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [63:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop2' @ [63:36] ==> val prevNonNop2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'prevNonNop' @ [63:49] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'clone' @ [63:60] ==> public abstract fun clone(p0: (MutableMap<(LabelNode..LabelNode?), (LabelNode..LabelNode?)>..Map<(LabelNode..LabelNode?), (LabelNode..LabelNode?)>?)): (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaMethodDescriptor]

'emptyMap' @ [63:66] ==> public fun <K, V> emptyMap(): Map<(LabelNode..LabelNode?), (LabelNode..LabelNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)
    <V> -> (org.jetbrains.org.objectweb.asm.tree.LabelNode..org.jetbrains.org.objectweb.asm.tree.LabelNode?)

'I2L' @ [68:25] ==> public const final val I2L: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when (prevNonNop.opcode) {
                        Opcodes.ICONST_0 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.LCONST_0))
                        }
                        Opcodes.ICONST_1 -> actions.add {
                            it.remove(insn)
                            it.set(prevNonNop, InsnNode(Opcodes.LCONST_1))
                        }
                    }' @ [69:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'prevNonNop' @ [69:27] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'opcode' @ [69:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ICONST_0' @ [70:33] ==> public const final val ICONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'actions' @ [70:45] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [70:53] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [71:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [71:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [71:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'it' @ [72:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [72:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [72:36] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [72:48] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'LCONST_0' @ [72:65] ==> public const final val LCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ICONST_1' @ [74:33] ==> public const final val ICONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'actions' @ [74:45] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [74:53] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [75:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [75:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [75:39] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'it' @ [76:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [76:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [76:36] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [76:48] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'LCONST_1' @ [76:65] ==> public const final val LCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'POP2' @ [81:25] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (prevNonNop.isEliminatedByPop2()) {
                        actions.add {
                            it.set(insn, InsnNode(Opcodes.NOP))
                            it.remove(prevNonNop)
                        }
                    }
                    else if (i > 1) {
                        val prevNonNop2 = prevNonNop.findPreviousOrNull { it.opcode != Opcodes.NOP } ?: continue@forInsn
                        if (prevNonNop.isEliminatedByPop() && prevNonNop2.isEliminatedByPop()) {
                            actions.add {
                                it.set(insn, InsnNode(Opcodes.NOP))
                                it.remove(prevNonNop)
                                it.remove(prevNonNop2)
                            }
                        }
                    }' @ [82:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'prevNonNop' @ [82:25] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isEliminatedByPop2' @ [82:36] ==> private final fun AbstractInsnNode.isEliminatedByPop2(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'actions' @ [83:25] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [83:33] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [84:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [84:32] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [84:36] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [84:42] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'NOP' @ [84:59] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [85:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [85:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [85:39] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'i' @ [88:30] ==> val i: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'prevNonNop' @ [89:43] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'findPreviousOrNull' @ [89:54] ==> public inline fun AbstractInsnNode.findPreviousOrNull(predicate: (AbstractInsnNode) -> Boolean): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'it' @ [89:75] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [89:78] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [89:96] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prevNonNop' @ [90:29] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isEliminatedByPop' @ [90:40] ==> private final fun AbstractInsnNode.isEliminatedByPop(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'prevNonNop2' @ [90:63] ==> val prevNonNop2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isEliminatedByPop' @ [90:75] ==> private final fun AbstractInsnNode.isEliminatedByPop(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'actions' @ [91:29] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [91:37] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [92:33] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [92:36] ==> public open operator fun set(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [92:40] ==> val insn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'InsnNode' @ [92:46] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'NOP' @ [92:63] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [93:33] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [93:36] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop' @ [93:43] ==> val prevNonNop: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'it' @ [94:33] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [94:36] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prevNonNop2' @ [94:43] ==> val prevNonNop2: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'NOP' @ [100:25] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prev' @ [101:25] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'opcode' @ [101:30] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NOP' @ [101:48] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'actions' @ [102:25] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'add' @ [102:33] ==> public open fun add(element: (InsnList) -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [103:29] ==> value-parameter it: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce.<anonymous>[ValueParameterDescriptorImpl]

'remove' @ [103:32] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'prev' @ [103:39] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'actions' @ [109:9] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'forEach' @ [109:17] ==> @HidesMembers public inline fun <T> Iterable<(InsnList) -> Unit>.forEach(action: ((InsnList) -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<InsnList, Unit>

'invoke' @ [109:27] ==> public abstract operator fun invoke(p1: InsnList): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'methodNode' @ [109:30] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[ValueParameterDescriptorImpl]

'instructions' @ [109:41] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'actions' @ [111:16] ==> val actions: ArrayList<(InsnList) -> Unit> /* = ArrayList<(InsnList) -> Unit> */ defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer.transformOnce[LocalVariableDescriptor]

'isNotEmpty' @ [111:24] ==> @InlineOnly public inline fun <T> Collection<(InsnList) -> Unit>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<InsnList, Unit>

'isPurePushOfSize1' @ [115:13] ==> private final fun AbstractInsnNode.isPurePushOfSize1(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'opcode' @ [116:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP' @ [116:31] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [119:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'..' @ [119:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ACONST_NULL' @ [119:31] ==> public const final val ACONST_NULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'FCONST_2' @ [119:52] ==> public const final val FCONST_2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [120:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'..' @ [120:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'BIPUSH' @ [120:31] ==> public const final val BIPUSH: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ILOAD' @ [120:47] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [121:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'FLOAD' @ [121:31] ==> public const final val FLOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [122:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [122:31] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isUnitInstance' @ [123:13] ==> public fun AbstractInsnNode.isUnitInstance(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file PopBackwardPropagationTransformer.kt[SimpleFunctionDescriptorImpl]

'isPurePushOfSize2' @ [126:13] ==> private final fun AbstractInsnNode.isPurePushOfSize2(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.StackPeepholeOptimizationsTransformer[SimpleFunctionDescriptorImpl]

'opcode' @ [127:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP2' @ [127:31] ==> public const final val DUP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [130:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LCONST_0' @ [130:31] ==> public const final val LCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [130:43] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LCONST_1' @ [130:61] ==> public const final val LCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [131:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DCONST_0' @ [131:31] ==> public const final val DCONST_0: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [131:43] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DCONST_1' @ [131:61] ==> public const final val DCONST_1: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [132:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LLOAD' @ [132:31] ==> public const final val LLOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [133:13] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DLOAD' @ [133:31] ==> public const final val DLOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

