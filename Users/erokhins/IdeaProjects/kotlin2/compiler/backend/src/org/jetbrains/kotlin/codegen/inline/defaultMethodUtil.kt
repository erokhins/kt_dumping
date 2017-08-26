'mask' @ [40:27] ==> public final val mask: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'constant' @ [40:36] ==> public final val constant: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'varInsNode' @ [41:20] ==> public final val varInsNode: VarInsnNode? defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'`var`' @ [41:32] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'jvmSignature' @ [45:27] ==> value-parameter jvmSignature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [45:40] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'functionDescriptor' @ [46:33] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[ValueParameterDescriptorImpl]

'containingDeclaration' @ [46:52] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (DescriptorUtils.isInterface(containingDeclaration)) OwnerKind.DEFAULT_IMPLS
            else OwnerKind.getMemberOwnerKind(containingDeclaration)' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OwnerKind, elseBranch: OwnerKind): OwnerKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> OwnerKind

'isInterface' @ [48:33] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [48:45] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'DEFAULT_IMPLS' @ [48:79] ==> enum entry DEFAULT_IMPLS defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'getMemberOwnerKind' @ [49:28] ==> public final fun getMemberOwnerKind(descriptor: DeclarationDescriptor): OwnerKind defined in org.jetbrains.kotlin.codegen.OwnerKind.Companion[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [49:47] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'parameterOffsets' @ [50:28] ==> public fun parameterOffsets(isStatic: Boolean, valueParameters: List<JvmMethodParameterSignature>): Array<Int> defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'isStaticMethod' @ [50:53] ==> public open fun isStaticMethod(kind: (OwnerKind..OwnerKind?), functionDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'kind' @ [50:68] ==> val kind: OwnerKind defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'functionDescriptor' @ [50:74] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [50:95] ==> val valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'valueParameters' @ [51:32] ==> val valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'takeWhile' @ [51:48] ==> public inline fun <T> Iterable<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.takeWhile(predicate: ((JvmMethodParameterSignature..JvmMethodParameterSignature?)) -> Boolean): List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)

'it' @ [51:60] ==> value-parameter it: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [51:63] ==> public final val JvmMethodParameterSignature.kind: JvmMethodParameterKind[MyPropertyDescriptor]

'VALUE' @ [51:94] ==> enum entry VALUE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'size' @ [51:102] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'functionDescriptor' @ [53:12] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [53:31] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'filter' @ [53:47] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.filter(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): List<(ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'isInlineParameter' @ [54:20] ==> public open fun isInlineParameter(@NotNull p0: ParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'it' @ [54:38] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [54:45] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'declaresDefaultValue' @ [54:48] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'associateBy' @ [55:7] ==> public inline fun <T, K> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.associateBy(keySelector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Int): Map<Int, (ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> Int

'parameterOffsets' @ [56:9] ==> val parameterOffsets: Array<Int> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'valueParameterOffset' @ [56:26] ==> val valueParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor[LocalVariableDescriptor]

'it' @ [56:49] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdaOffsetAndDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [56:52] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'maskStartIndex' @ [69:16] ==> value-parameter maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'varIndex' @ [69:34] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.isMaskIndex[ValueParameterDescriptorImpl]

'varIndex' @ [69:46] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.isMaskIndex[ValueParameterDescriptorImpl]

'maskStartIndex' @ [69:57] ==> value-parameter maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'masks' @ [69:74] ==> value-parameter masks: List<Int> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'size' @ [69:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'node' @ [72:32] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'instructions' @ [72:37] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'asSequence' @ [72:50] ==> public fun InsnList.asSequence(): InsnSequence defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[SimpleFunctionDescriptorImpl]

'takeWhile' @ [72:63] ==> public fun <T> Sequence<AbstractInsnNode>.takeWhile(predicate: (AbstractInsnNode) -> Boolean): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [73:13] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'if (isMaskIndex(it.`var`)) {
                /*if slot for default mask is updated than we occurred in actual function body*/
                return@takeWhile it.opcode == Opcodes.ILOAD
            }
            else if (methodHandlerIndex == it.`var`) {
                return@takeWhile it.opcode == Opcodes.ALOAD
            }' @ [74:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isMaskIndex' @ [74:17] ==> local final fun isMaskIndex(varIndex: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[SimpleFunctionDescriptorImpl]

'it' @ [74:29] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'`var`' @ [74:32] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'it' @ [76:34] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [76:37] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'ILOAD' @ [76:55] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodHandlerIndex' @ [78:22] ==> value-parameter methodHandlerIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'it' @ [78:44] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'`var`' @ [78:47] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'it' @ [79:34] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [79:37] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [79:55] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'maskProcessingHeader' @ [85:22] ==> val maskProcessingHeader: Sequence<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'filterIsInstance' @ [85:43] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<VarInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> VarInsnNode

'mapNotNull' @ [85:75] ==> public fun <T, R : Any> Sequence<VarInsnNode>.mapNotNull(transform: (VarInsnNode) -> Condition?): Sequence<Condition> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VarInsnNode
    <R : Any> -> Condition

'if (isMaskIndex(it.`var`) &&
            it.next?.next?.opcode == Opcodes.IAND &&
            it.next.next.next?.opcode == Opcodes.IFEQ) {
            val jumpInstruction = it.next?.next?.next as JumpInsnNode
            Condition(
                    masks[it.`var` - maskStartIndex],
                    getConstant(it.next),
                    it,
                    jumpInstruction,
                    jumpInstruction.label.previous as VarInsnNode
            )
        }
        else if (methodHandlerIndex == it.`var` &&
                 it.next?.opcode == Opcodes.IFNULL &&
                 it.next.next?.opcode == Opcodes.NEW) {
            //Always delete method handle for now
            //This logic should be updated when method handles would be supported
            Condition(0, 0, it, it.next as JumpInsnNode, null)
        }
        else null' @ [86:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Condition?, elseBranch: Condition?): Condition?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Condition?

'isMaskIndex' @ [86:13] ==> local final fun isMaskIndex(varIndex: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[SimpleFunctionDescriptorImpl]

'it' @ [86:25] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'`var`' @ [86:28] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'it' @ [87:13] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [87:16] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [87:22] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [87:28] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IAND' @ [87:46] ==> public const final val IAND: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [88:13] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [88:16] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [88:21] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [88:26] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [88:32] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFEQ' @ [88:50] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [89:35] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [89:38] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [89:44] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [89:50] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'Condition' @ [90:13] ==> public constructor Condition(mask: Int, constant: Int, maskInstruction: VarInsnNode, jumpInstruction: JumpInsnNode, varInsNode: VarInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.Condition[ClassConstructorDescriptorImpl]

'masks' @ [91:21] ==> value-parameter masks: List<Int> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'it' @ [91:27] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'`var`' @ [91:30] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'maskStartIndex' @ [91:38] ==> value-parameter maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'getConstant' @ [92:21] ==> internal fun getConstant(ins: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [92:33] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [92:36] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'it' @ [93:21] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'jumpInstruction' @ [94:21] ==> val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'jumpInstruction' @ [95:21] ==> val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'label' @ [95:37] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'previous' @ [95:43] ==> public final val LabelNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (methodHandlerIndex == it.`var` &&
                 it.next?.opcode == Opcodes.IFNULL &&
                 it.next.next?.opcode == Opcodes.NEW) {
            //Always delete method handle for now
            //This logic should be updated when method handles would be supported
            Condition(0, 0, it, it.next as JumpInsnNode, null)
        }
        else null' @ [98:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Condition?, elseBranch: Condition?): Condition?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Condition?

'methodHandlerIndex' @ [98:18] ==> value-parameter methodHandlerIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'it' @ [98:40] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'`var`' @ [98:43] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'it' @ [99:18] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [99:21] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [99:27] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IFNULL' @ [99:45] ==> public const final val IFNULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [100:18] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [100:21] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'next' @ [100:26] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [100:32] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NEW' @ [100:50] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Condition' @ [103:13] ==> public constructor Condition(mask: Int, constant: Int, maskInstruction: VarInsnNode, jumpInstruction: JumpInsnNode, varInsNode: VarInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.Condition[ClassConstructorDescriptorImpl]

'it' @ [103:29] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [103:33] ==> value-parameter it: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [103:36] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'toList' @ [106:7] ==> public fun <T> Sequence<Condition>.toList(): List<Condition> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Condition

'linkedSetOf' @ [108:20] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'arrayListOf' @ [109:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> /* = ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<AbstractInsnNode, AbstractInsnNode>

'extractDefaultLambdasInfo' @ [111:30] ==> private fun extractDefaultLambdasInfo(conditions: List<Condition>, defaultLambdas: Map<Int, ValueParameterDescriptor>, toDelete: MutableCollection<AbstractInsnNode>, toInsert: MutableList<Pair<AbstractInsnNode, AbstractInsnNode>>): List<DefaultLambda> defined in org.jetbrains.kotlin.codegen.inline in file defaultMethodUtil.kt[SimpleFunctionDescriptorImpl]

'conditions' @ [111:56] ==> val conditions: List<Condition> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'defaultLambdas' @ [111:68] ==> value-parameter defaultLambdas: Map<Int, ValueParameterDescriptor> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'toDelete' @ [111:84] ==> val toDelete: LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'toInsert' @ [111:94] ==> val toInsert: ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> /* = ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'node' @ [113:26] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'localVariables' @ [113:31] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filter' @ [113:47] ==> public inline fun <T> Iterable<(LocalVariableNode..LocalVariableNode?)>.filter(predicate: ((LocalVariableNode..LocalVariableNode?)) -> Boolean): List<(LocalVariableNode..LocalVariableNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'it' @ [113:56] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [113:59] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'maskStartIndex' @ [113:67] ==> value-parameter maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'associateBy' @ [113:85] ==> public inline fun <T, K> Iterable<(LocalVariableNode..LocalVariableNode?)>.associateBy(keySelector: ((LocalVariableNode..LocalVariableNode?)) -> Int): Map<Int, (LocalVariableNode..LocalVariableNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)
    <K> -> Int

'it' @ [113:99] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [113:102] ==> public final var index: Int defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'emptyMap' @ [113:113] ==> public fun <K, V> emptyMap(): Map<Int, (LocalVariableNode..LocalVariableNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> (org.jetbrains.org.objectweb.asm.tree.LocalVariableNode..org.jetbrains.org.objectweb.asm.tree.LocalVariableNode?)

'conditions' @ [114:5] ==> val conditions: List<Condition> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'forEach' @ [114:16] ==> @HidesMembers public inline fun <T> Iterable<Condition>.forEach(action: (Condition) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Condition

'it' @ [115:31] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'jumpInstruction' @ [115:34] ==> public final val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'InsnSequence' @ [116:9] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'it' @ [116:22] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'maskInstruction' @ [116:25] ==> public final val maskInstruction: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'if (it.expandNotDelete) jumpInstruction.next else jumpInstruction.label' @ [116:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (AbstractInsnNode..AbstractInsnNode?), elseBranch: (AbstractInsnNode..AbstractInsnNode?)): (AbstractInsnNode..AbstractInsnNode?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'it' @ [116:47] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'expandNotDelete' @ [116:50] ==> public final val expandNotDelete: Boolean defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'jumpInstruction' @ [116:67] ==> val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'next' @ [116:83] ==> public final val JumpInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'jumpInstruction' @ [116:93] ==> val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'label' @ [116:109] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'forEach' @ [116:117] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'toDelete' @ [117:13] ==> val toDelete: LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'add' @ [117:22] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'it' @ [117:26] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [119:13] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'expandNotDelete' @ [119:16] ==> public final val expandNotDelete: Boolean defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'indexToVarNode' @ [120:13] ==> val indexToVarNode: Map<Int, (LocalVariableNode..LocalVariableNode?)> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'it' @ [120:28] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'varIndex' @ [120:31] ==> public final val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'let' @ [120:42] ==> @InlineOnly public inline fun <T, R> LocalVariableNode.let(block: (LocalVariableNode) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariableNode
    <R> -> Unit

'varNode' @ [121:17] ==> value-parameter varNode: LocalVariableNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [121:25] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'it' @ [121:33] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'jumpInstruction' @ [121:36] ==> public final val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'label' @ [121:52] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'toInsert' @ [126:5] ==> val toInsert: ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> /* = ArrayList<Pair<AbstractInsnNode, AbstractInsnNode>> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'forEach' @ [126:14] ==> @HidesMembers public inline fun <T> Iterable<Pair<AbstractInsnNode, AbstractInsnNode>>.forEach(action: (Pair<AbstractInsnNode, AbstractInsnNode>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<AbstractInsnNode, AbstractInsnNode>

'component1' @ [126:25] ==> public final operator fun component1(): AbstractInsnNode defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [126:35] ==> public final operator fun component2(): AbstractInsnNode defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'node' @ [127:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'instructions' @ [127:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insert' @ [127:27] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'position' @ [127:34] ==> val position: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'newInsn' @ [127:44] ==> val newInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[LocalVariableDescriptor]

'node' @ [130:5] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'localVariables' @ [130:10] ==> public final var localVariables: (MutableList<(LocalVariableNode..LocalVariableNode?)>..List<(LocalVariableNode..LocalVariableNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'removeIf' @ [130:25] ==> public final fun removeIf(p0: ((LocalVariableNode..LocalVariableNode?)) -> Boolean): Boolean defined in kotlin.collections.MutableList[MyFunctionDescriptor]

'it' @ [130:36] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [130:39] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'toDelete' @ [130:48] ==> val toDelete: LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'it' @ [130:60] ==> value-parameter it: (LocalVariableNode..LocalVariableNode?) defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes.<anonymous>[ValueParameterDescriptorImpl]

'end' @ [130:63] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.LocalVariableNode[JavaPropertyDescriptor]

'toDelete' @ [130:70] ==> val toDelete: LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'node' @ [132:5] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[ValueParameterDescriptorImpl]

'remove' @ [132:10] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'toDelete' @ [132:17] ==> val toDelete: LinkedHashSet<AbstractInsnNode> /* = LinkedHashSet<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'defaultLambdasInfo' @ [134:12] ==> val defaultLambdasInfo: List<DefaultLambda> defined in org.jetbrains.kotlin.codegen.inline.expandMaskConditionsAndUpdateVariableNodes[LocalVariableDescriptor]

'conditions' @ [144:35] ==> value-parameter conditions: List<Condition> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'filter' @ [144:46] ==> public inline fun <T> Iterable<Condition>.filter(predicate: (Condition) -> Boolean): List<Condition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Condition

'it' @ [144:55] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'expandNotDelete' @ [144:58] ==> public final val expandNotDelete: Boolean defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'defaultLambdas' @ [144:77] ==> value-parameter defaultLambdas: Map<Int, ValueParameterDescriptor> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'contains' @ [144:92] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out Int, ValueParameterDescriptor>.contains(key: Int): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> Int
    <V> -> ValueParameterDescriptor

'it' @ [144:101] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'varIndex' @ [144:104] ==> public final val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'defaultLambdaConditions' @ [145:12] ==> val defaultLambdaConditions: List<Condition> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[LocalVariableDescriptor]

'map' @ [145:36] ==> public inline fun <T, R> Iterable<Condition>.map(transform: (Condition) -> DefaultLambda): List<DefaultLambda> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Condition
    <R> -> DefaultLambda

'it' @ [146:40] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'varInsNode' @ [146:43] ==> public final val varInsNode: VarInsnNode? defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'varAssignmentInstruction' @ [147:34] ==> val varAssignmentInstruction: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'previous' @ [147:59] ==> public final val VarInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'instanceInstuction' @ [148:13] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'instanceInstuction' @ [148:51] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'opcode' @ [148:70] ==> public final var TypeInsnNode.opcode: Int[MyPropertyDescriptor]

'CHECKCAST' @ [148:88] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'instanceInstuction' @ [149:13] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'instanceInstuction' @ [149:34] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'previous' @ [149:53] ==> public final val TypeInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'component1' @ [152:14] ==> public final operator fun component1(): (Type..Type?) defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [152:21] ==> public final operator fun component2(): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [152:31] ==> public final operator fun component3(): Boolean defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'when (instanceInstuction) {
            is MethodInsnNode -> {
                assert(instanceInstuction.name == "<init>") { "Expected constructor call for default lambda, but $instanceInstuction" }
                val ownerInternalName = instanceInstuction.owner
                val instanceCreation = InsnSequence(it.jumpInstruction, it.jumpInstruction.label).filter {
                    it.opcode == Opcodes.NEW && (it as TypeInsnNode).desc == ownerInternalName
                }.single()

                assert(instanceCreation.next?.opcode == Opcodes.DUP) {
                    "Dup should follow default lambda instanceInstruction creation but ${instanceCreation.next}"
                }

                toDelete.apply {
                    addAll(listOf(instanceCreation, instanceCreation.next))
                    addAll(InsnSequence(instanceInstuction, varAssignmentInstruction.next).toList())
                }

                val needReification = instanceCreation.previous.takeIf { isNeedClassReificationMarker(it) }?.let { toDelete.add(it) } != null
                Triple(Type.getObjectType(instanceInstuction.owner), Type.getArgumentTypes(instanceInstuction.desc), needReification)
            }

            is FieldInsnNode -> {
                toDelete.addAll(InsnSequence(instanceInstuction, varAssignmentInstruction.next).toList())

                val needReification = instanceInstuction.previous.takeIf { isNeedClassReificationMarker(it) }?.let { toDelete.add(it) } != null

                Triple(Type.getObjectType(instanceInstuction.owner), emptyArray<Type>(), needReification)
            }
            else -> throw RuntimeException("Can't extract default lambda info $it.\n Unknown instruction: ${instanceInstuction.insnText}")
        }' @ [152:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Triple<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?), Boolean>, entry1: Triple<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?), Boolean>, entry2: Triple<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?), Boolean>): Triple<(Type..Type?), (Array<(Type..Type?)>..Array<out (Type..Type?)>?), Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Triple<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?), (kotlin.Array<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>..kotlin.Array<out (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>?), Boolean>

'instanceInstuction' @ [152:56] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'assert' @ [154:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'instanceInstuction' @ [154:24] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'name' @ [154:43] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'instanceInstuction' @ [154:115] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'instanceInstuction' @ [155:41] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'owner' @ [155:60] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'InsnSequence' @ [156:40] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'it' @ [156:53] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'jumpInstruction' @ [156:56] ==> public final val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'it' @ [156:73] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'jumpInstruction' @ [156:76] ==> public final val jumpInstruction: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'label' @ [156:92] ==> public final var label: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaPropertyDescriptor]

'filter' @ [156:99] ==> public fun <T> Sequence<AbstractInsnNode>.filter(predicate: (AbstractInsnNode) -> Boolean): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [157:21] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [157:24] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NEW' @ [157:42] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'==' @ [157:49] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [157:50] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [157:70] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

'ownerInternalName' @ [157:78] ==> val ownerInternalName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'single' @ [158:19] ==> public fun <T> Sequence<AbstractInsnNode>.single(): AbstractInsnNode defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'assert' @ [160:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'instanceCreation' @ [160:24] ==> val instanceCreation: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'next' @ [160:41] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'opcode' @ [160:47] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DUP' @ [160:65] ==> public const final val DUP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'instanceCreation' @ [161:90] ==> val instanceCreation: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'next' @ [161:107] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'toDelete' @ [164:17] ==> value-parameter toDelete: MutableCollection<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'apply' @ [164:26] ==> @InlineOnly public inline fun <T> MutableCollection<AbstractInsnNode>.apply(block: MutableCollection<AbstractInsnNode>.() -> Unit): MutableCollection<AbstractInsnNode> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableCollection<AbstractInsnNode>

'addAll' @ [165:21] ==> public abstract fun addAll(elements: Collection<AbstractInsnNode>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'listOf' @ [165:28] ==> public fun <T> listOf(vararg elements: (AbstractInsnNode..AbstractInsnNode?)): List<(AbstractInsnNode..AbstractInsnNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'instanceCreation' @ [165:35] ==> val instanceCreation: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'instanceCreation' @ [165:53] ==> val instanceCreation: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'next' @ [165:70] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'addAll' @ [166:21] ==> public abstract fun addAll(elements: Collection<AbstractInsnNode>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'InsnSequence' @ [166:28] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'instanceInstuction' @ [166:41] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'varAssignmentInstruction' @ [166:61] ==> val varAssignmentInstruction: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'next' @ [166:86] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'toList' @ [166:92] ==> public fun <T> Sequence<AbstractInsnNode>.toList(): List<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'instanceCreation' @ [169:39] ==> val instanceCreation: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'previous' @ [169:56] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'takeIf' @ [169:65] ==> @InlineOnly @SinceKotlin public inline fun <T> (AbstractInsnNode..AbstractInsnNode?).takeIf(predicate: ((AbstractInsnNode..AbstractInsnNode?)) -> Boolean): AbstractInsnNode? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'isNeedClassReificationMarker' @ [169:74] ==> @JvmStatic public final fun isNeedClassReificationMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[FunctionImportedFromObject]

'it' @ [169:103] ==> value-parameter it: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [169:110] ==> @InlineOnly public inline fun <T, R> AbstractInsnNode.let(block: (AbstractInsnNode) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode
    <R> -> Boolean

'toDelete' @ [169:116] ==> value-parameter toDelete: MutableCollection<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'add' @ [169:125] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'it' @ [169:129] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Triple' @ [170:17] ==> public constructor Triple<out A, out B, out C>(first: (Type..Type?), second: (Array<(Type..Type?)>..Array<out (Type..Type?)>?), third: Boolean) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <out B> -> (kotlin.Array<(org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>..kotlin.Array<out (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)>?)
    <out C> -> Boolean

'getObjectType' @ [170:29] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'instanceInstuction' @ [170:43] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'owner' @ [170:62] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'getArgumentTypes' @ [170:75] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'instanceInstuction' @ [170:92] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'desc' @ [170:111] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'needReification' @ [170:118] ==> val needReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [174:17] ==> value-parameter toDelete: MutableCollection<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'addAll' @ [174:26] ==> public abstract fun addAll(elements: Collection<AbstractInsnNode>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'InsnSequence' @ [174:33] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'instanceInstuction' @ [174:46] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'varAssignmentInstruction' @ [174:66] ==> val varAssignmentInstruction: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'next' @ [174:91] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'toList' @ [174:97] ==> public fun <T> Sequence<AbstractInsnNode>.toList(): List<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'instanceInstuction' @ [176:39] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'previous' @ [176:58] ==> public final val FieldInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'takeIf' @ [176:67] ==> @InlineOnly @SinceKotlin public inline fun <T> (AbstractInsnNode..AbstractInsnNode?).takeIf(predicate: ((AbstractInsnNode..AbstractInsnNode?)) -> Boolean): AbstractInsnNode? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'isNeedClassReificationMarker' @ [176:76] ==> @JvmStatic public final fun isNeedClassReificationMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[FunctionImportedFromObject]

'it' @ [176:105] ==> value-parameter it: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [176:112] ==> @InlineOnly public inline fun <T, R> AbstractInsnNode.let(block: (AbstractInsnNode) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode
    <R> -> Boolean

'toDelete' @ [176:118] ==> value-parameter toDelete: MutableCollection<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'add' @ [176:127] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'it' @ [176:131] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Triple' @ [178:17] ==> public constructor Triple<out A, out B, out C>(first: (Type..Type?), second: Array<Type>, third: Boolean) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)
    <out B> -> Array<Type>
    <out C> -> Boolean

'getObjectType' @ [178:29] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'instanceInstuction' @ [178:43] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'owner' @ [178:62] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'emptyArray' @ [178:70] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Type> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Type

'needReification' @ [178:90] ==> val needReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'RuntimeException' @ [180:27] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'it' @ [180:80] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'instanceInstuction' @ [180:109] ==> var instanceInstuction: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'insnText' @ [180:128] ==> internal val AbstractInsnNode?.insnText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'toInsert' @ [183:9] ==> value-parameter toInsert: MutableList<Pair<AbstractInsnNode, AbstractInsnNode>> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'add' @ [183:18] ==> public abstract fun add(element: Pair<AbstractInsnNode, AbstractInsnNode>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'varAssignmentInstruction' @ [183:22] ==> val varAssignmentInstruction: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'defaultLambdaFakeCallStub' @ [183:50] ==> private fun defaultLambdaFakeCallStub(args: Array<Type>, lambdaOffset: Int): MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline in file defaultMethodUtil.kt[SimpleFunctionDescriptorImpl]

'argTypes' @ [183:76] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'it' @ [183:86] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'varIndex' @ [183:89] ==> public final val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'DefaultLambda' @ [185:9] ==> public constructor DefaultLambda(lambdaClassType: Type, capturedArgs: Array<Type>, parameterDescriptor: ValueParameterDescriptor, offset: Int, needReification: Boolean) defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[ClassConstructorDescriptorImpl]

'owner' @ [185:23] ==> val owner: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'argTypes' @ [185:30] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'defaultLambdas' @ [185:40] ==> value-parameter defaultLambdas: Map<Int, ValueParameterDescriptor> defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo[ValueParameterDescriptorImpl]

'it' @ [185:55] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'varIndex' @ [185:58] ==> public final val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'it' @ [185:71] ==> value-parameter it: Condition defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[ValueParameterDescriptorImpl]

'varIndex' @ [185:74] ==> public final val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.Condition[PropertyDescriptorImpl]

'needReification' @ [185:84] ==> val needReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.extractDefaultLambdasInfo.<anonymous>[LocalVariableDescriptor]

'MethodInsnNode' @ [192:12] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'INVOKESTATIC' @ [193:21] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'DEFAULT_LAMBDA_FAKE_CALL' @ [194:13] ==> internal const val DEFAULT_LAMBDA_FAKE_CALL: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'DEFAULT_LAMBDA_FAKE_CALL' @ [195:13] ==> internal const val DEFAULT_LAMBDA_FAKE_CALL: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'lambdaOffset' @ [195:40] ==> value-parameter lambdaOffset: Int defined in org.jetbrains.kotlin.codegen.inline.defaultLambdaFakeCallStub[ValueParameterDescriptorImpl]

'getMethodDescriptor' @ [196:18] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'VOID_TYPE' @ [196:43] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'args' @ [196:55] ==> value-parameter args: Array<Type> defined in org.jetbrains.kotlin.codegen.inline.defaultLambdaFakeCallStub[ValueParameterDescriptorImpl]

