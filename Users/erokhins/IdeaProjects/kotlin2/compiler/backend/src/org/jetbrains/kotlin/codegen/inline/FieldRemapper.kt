'JvmField' @ [28:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'parent' @ [31:18] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'parent' @ [33:48] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'isInsideInliningLambda' @ [33:56] ==> public open val isInsideInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'fieldOwner' @ [36:16] ==> value-parameter fieldOwner: String defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.canProcess[ValueParameterDescriptorImpl]

'originalLambdaInternalName' @ [36:30] ==> public final val originalLambdaInternalName: String? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'isCapturedFieldName' @ [38:16] ==> internal fun isCapturedFieldName(fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'fieldName' @ [38:36] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.canProcess[ValueParameterDescriptorImpl]

'if (capturedFieldAccess.size == 1)
                null //single aload
            else
                foldFieldAccessChainIfNeeded(capturedFieldAccess, 1, node)' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractInsnNode?, elseBranch: AbstractInsnNode?): AbstractInsnNode?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractInsnNode?

'capturedFieldAccess' @ [42:17] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'size' @ [42:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'foldFieldAccessChainIfNeeded' @ [45:17] ==> private final fun foldFieldAccessChainIfNeeded(capturedFieldAccess: List<AbstractInsnNode>, currentInstruction: Int, node: MethodNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'capturedFieldAccess' @ [45:46] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'node' @ [45:70] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'currentInstruction' @ [62:13] ==> value-parameter currentInstruction: Int defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'capturedFieldAccess' @ [62:34] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'lastIndex' @ [62:54] ==> public val <T> List<AbstractInsnNode>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'parent' @ [64:13] ==> @JvmField public final val parent: FieldRemapper? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'foldFieldAccessChainIfNeeded' @ [64:21] ==> private final fun foldFieldAccessChainIfNeeded(capturedFieldAccess: List<AbstractInsnNode>, currentInstruction: Int, node: MethodNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'capturedFieldAccess' @ [64:50] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'currentInstruction' @ [64:71] ==> value-parameter currentInstruction: Int defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'node' @ [64:95] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'let' @ [64:102] ==> @InlineOnly public inline fun <T, R> AbstractInsnNode.let(block: (AbstractInsnNode) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode
    <R> -> Nothing

'it' @ [65:53] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'capturedFieldAccess' @ [69:24] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'currentInstruction' @ [69:44] ==> value-parameter currentInstruction: Int defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'canProcess' @ [70:13] ==> protected open fun canProcess(fieldOwner: String, fieldName: String, isFolding: Boolean): Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'insnNode' @ [70:24] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'owner' @ [70:33] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'insnNode' @ [70:40] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'name' @ [70:49] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'insnNode' @ [71:13] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'name' @ [71:22] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'CAPTURED_FIELD_FOLD_PREFIX' @ [71:29] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'getFieldNameForFolding' @ [71:58] ==> protected open fun getFieldNameForFolding(insnNode: FieldInsnNode): String defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'insnNode' @ [71:81] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'insnNode' @ [72:13] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'opcode' @ [72:22] ==> public final var FieldInsnNode.opcode: Int[MyPropertyDescriptor]

'GETSTATIC' @ [72:39] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'node' @ [74:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'remove' @ [74:18] ==> public fun MethodNode.remove(instructions: Sequence<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'InsnSequence' @ [74:25] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'capturedFieldAccess' @ [74:38] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'insnNode' @ [74:62] ==> val insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[LocalVariableDescriptor]

'capturedFieldAccess' @ [75:20] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'capturedFieldAccess' @ [75:40] ==> value-parameter capturedFieldAccess: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.foldFieldAccessChainIfNeeded[ValueParameterDescriptorImpl]

'size' @ [75:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'insnNode' @ [81:82] ==> value-parameter insnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.getFieldNameForFolding[ValueParameterDescriptorImpl]

'name' @ [81:91] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'JvmOverloads' @ [83:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'parameters' @ [84:96] ==> protected final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'captured' @ [84:107] ==> public final val captured: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'captured' @ [85:33] ==> value-parameter captured: Collection<CapturedParamInfo> = ... defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[ValueParameterDescriptorImpl]

'valueDescriptor' @ [86:17] ==> val valueDescriptor: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[LocalVariableDescriptor]

'originalFieldName' @ [86:33] ==> public final val CapturedParamInfo.originalFieldName: String[MyPropertyDescriptor]

'fieldInsnNode' @ [86:54] ==> value-parameter fieldInsnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[ValueParameterDescriptorImpl]

'name' @ [86:68] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'valueDescriptor' @ [86:76] ==> val valueDescriptor: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[LocalVariableDescriptor]

'containingLambdaName' @ [86:92] ==> public final val CapturedParamInfo.containingLambdaName: String[MyPropertyDescriptor]

'fieldInsnNode' @ [86:116] ==> value-parameter fieldInsnNode: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[ValueParameterDescriptorImpl]

'owner' @ [86:130] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'valueDescriptor' @ [87:24] ==> val valueDescriptor: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.findField[LocalVariableDescriptor]

'originalLambdaInternalName' @ [94:17] ==> public final val originalLambdaInternalName: String? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'MethodInliner' @ [97:13] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[FakeCallableDescriptorForObject]

'findCapturedField' @ [97:27] ==> @JvmStatic public final fun findCapturedField(node: FieldInsnNode, fieldRemapper: FieldRemapper): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'node' @ [97:45] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper.getFieldForInline[ValueParameterDescriptorImpl]

'this' @ [97:51] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[LazyClassReceiverParameterDescriptor]

'remapValue' @ [97:57] ==> public final var CapturedParamInfo.remapValue: StackValue?[MyPropertyDescriptor]

