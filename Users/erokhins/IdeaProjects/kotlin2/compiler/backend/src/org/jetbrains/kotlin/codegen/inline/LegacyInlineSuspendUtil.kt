'with' @ [31:5] ==> @InlineOnly public inline fun <T, R> with(receiver: (InsnList..InsnList?), block: (InsnList..InsnList?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.InsnList..org.jetbrains.org.objectweb.asm.tree.InsnList?)
    <R> -> Unit

'node' @ [31:11] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.insertLegacySuspendInlineMarks[ValueParameterDescriptorImpl]

'instructions' @ [31:16] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [33:9] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'findLastReturn' @ [33:22] ==> public fun findLastReturn(node: AbstractInsnNode?): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline in file LegacyInlineSuspendUtil.kt[SimpleFunctionDescriptorImpl]

'last' @ [33:37] ==> public final val InsnList.last: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'produceSuspendMarker' @ [33:54] ==> private fun produceSuspendMarker(isStartNotEnd: Boolean): MethodNode defined in org.jetbrains.kotlin.codegen.inline in file LegacyInlineSuspendUtil.kt[SimpleFunctionDescriptorImpl]

'instructions' @ [33:82] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insertBefore' @ [35:9] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (InsnList..InsnList?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'first' @ [35:22] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'produceSuspendMarker' @ [35:29] ==> private fun produceSuspendMarker(isStartNotEnd: Boolean): MethodNode defined in org.jetbrains.kotlin.codegen.inline in file LegacyInlineSuspendUtil.kt[SimpleFunctionDescriptorImpl]

'instructions' @ [35:56] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [37:5] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.insertLegacySuspendInlineMarks[ValueParameterDescriptorImpl]

'maxStack' @ [37:10] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [37:21] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.insertLegacySuspendInlineMarks[ValueParameterDescriptorImpl]

'maxStack' @ [37:26] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'coerceAtLeast' @ [37:35] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'node' @ [41:15] ==> value-parameter node: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[ValueParameterDescriptorImpl]

'cur' @ [42:12] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[LocalVariableDescriptor]

'cur' @ [42:27] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[LocalVariableDescriptor]

'opcode' @ [42:31] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ARETURN' @ [42:49] ==> public const final val ARETURN: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'cur' @ [42:58] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[LocalVariableDescriptor]

'cur' @ [42:64] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[LocalVariableDescriptor]

'previous' @ [42:68] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'cur' @ [43:12] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.findLastReturn[LocalVariableDescriptor]

'MethodNode' @ [47:5] ==> public constructor MethodNode() defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'also' @ [47:18] ==> @InlineOnly @SinceKotlin public inline fun <T> MethodNode.also(block: (MethodNode) -> Unit): MethodNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'addSuspendMarker' @ [47:25] ==> internal fun addSuspendMarker(v: InstructionAdapter, isStartNotEnd: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'InstructionAdapter' @ [47:42] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'it' @ [47:61] ==> value-parameter it: MethodNode defined in org.jetbrains.kotlin.codegen.inline.produceSuspendMarker.<anonymous>[ValueParameterDescriptorImpl]

'isStartNotEnd' @ [47:66] ==> value-parameter isStartNotEnd: Boolean defined in org.jetbrains.kotlin.codegen.inline.produceSuspendMarker[ValueParameterDescriptorImpl]

'descriptor' @ [50:9] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.isLegacySuspendInlineFunction[ValueParameterDescriptorImpl]

'!' @ [51:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [51:10] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.isLegacySuspendInlineFunction[ValueParameterDescriptorImpl]

'isSuspend' @ [51:21] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'!' @ [51:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [51:35] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.isLegacySuspendInlineFunction[ValueParameterDescriptorImpl]

'isInline' @ [51:46] ==> public final val FunctionDescriptor.isInline: Boolean[MyPropertyDescriptor]

'descriptor' @ [52:30] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.isLegacySuspendInlineFunction[ValueParameterDescriptorImpl]

'getContainingKotlinJvmBinaryClass' @ [52:41] ==> public fun CallableDescriptor.getContainingKotlinJvmBinaryClass(): KotlinJvmBinaryClass? defined in org.jetbrains.kotlin.load.kotlin[DeserializedSimpleFunctionDescriptor]

'classHeader' @ [52:78] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'bytecodeVersion' @ [52:91] ==> public final val bytecodeVersion: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'!' @ [53:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jvmBytecodeVersion' @ [53:13] ==> val jvmBytecodeVersion: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.codegen.inline.isLegacySuspendInlineFunction[LocalVariableDescriptor]

'isAtLeast' @ [53:32] ==> public final fun isAtLeast(major: Int, minor: Int, patch: Int): Boolean defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[DeserializedSimpleFunctionDescriptor]

