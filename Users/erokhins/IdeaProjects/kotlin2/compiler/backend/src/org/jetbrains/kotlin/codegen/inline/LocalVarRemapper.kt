'arrayOfNulls' @ [30:31] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<StackValue?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> StackValue?

'params' @ [30:57] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'argsSizeOnStack' @ [30:64] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'params' @ [34:22] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'params' @ [35:25] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'getDeclarationSlot' @ [35:32] ==> public final fun getDeclarationSlot(info: ParameterInfo): Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[SimpleFunctionDescriptorImpl]

'info' @ [35:51] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'if (!info.isSkippedOrRemapped) {
                remapValues[shift] = StackValue.local(realSize, AsmTypes.OBJECT_TYPE)
                realSize += info.getType().size
            }
            else {
                remapValues[shift] = if (info.isRemapped) info.remapValue else null
                if (CapturedParamInfo.isSynthetic(info)) {
                    realSize += info.getType().size
                }
            }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [36:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [36:18] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'isSkippedOrRemapped' @ [36:23] ==> public final val ParameterInfo.isSkippedOrRemapped: Boolean[MyPropertyDescriptor]

'remapValues' @ [37:17] ==> private final val remapValues: Array<StackValue?> defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'shift' @ [37:29] ==> val shift: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'local' @ [37:49] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'realSize' @ [37:55] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'OBJECT_TYPE' @ [37:74] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'realSize' @ [38:17] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'info' @ [38:29] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'getType' @ [38:34] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'size' @ [38:44] ==> public final val Type.size: Int[MyPropertyDescriptor]

'remapValues' @ [41:17] ==> private final val remapValues: Array<StackValue?> defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'shift' @ [41:29] ==> val shift: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'if (info.isRemapped) info.remapValue else null' @ [41:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue?, elseBranch: StackValue?): StackValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue?

'info' @ [41:42] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'isRemapped' @ [41:47] ==> public final val ParameterInfo.isRemapped: Boolean[MyPropertyDescriptor]

'info' @ [41:59] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'remapValue' @ [41:64] ==> public final var ParameterInfo.remapValue: StackValue?[MyPropertyDescriptor]

'isSynthetic' @ [42:39] ==> public open fun isSynthetic(@NotNull info: ParameterInfo): Boolean defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

'info' @ [42:51] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'realSize' @ [43:21] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'info' @ [43:33] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'getType' @ [43:38] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'size' @ [43:48] ==> public final val Type.size: Int[MyPropertyDescriptor]

'actualParamsSize' @ [48:9] ==> private final val actualParamsSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'realSize' @ [48:28] ==> var realSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.<init>[LocalVariableDescriptor]

'if (index < params.argsSizeOnStack) {
            val info = params.getParameterByDeclarationSlot(index)
            val remapped = remapValues[index]
            if (info.isSkipped || remapped == null) {
                return RemapInfo(info)
            }
            if (info.isRemapped) {
                return RemapInfo(info, remapped, REMAPPED)
            }
            else {
                remappedIndex = (remapped as StackValue.Local).index
            }
        }
        else {
            //captured params are not used directly in this inlined method, they are used in closure
            //except captured ones for default lambdas, they are generated in default body
            remappedIndex = actualParamsSize - params.argsSizeOnStack + index
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'index' @ [54:13] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[ValueParameterDescriptorImpl]

'params' @ [54:21] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'argsSizeOnStack' @ [54:28] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'params' @ [55:24] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'getParameterByDeclarationSlot' @ [55:31] ==> public final fun getParameterByDeclarationSlot(index: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters[SimpleFunctionDescriptorImpl]

'index' @ [55:61] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[ValueParameterDescriptorImpl]

'remapValues' @ [56:28] ==> private final val remapValues: Array<StackValue?> defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'index' @ [56:40] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[ValueParameterDescriptorImpl]

'info' @ [57:17] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'isSkipped' @ [57:22] ==> public final val isSkipped: Boolean defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'remapped' @ [57:35] ==> val remapped: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'RemapInfo' @ [58:24] ==> public constructor RemapInfo(parameterInfo: ParameterInfo?, value: StackValue? = ..., status: LocalVarRemapper.RemapStatus = ...) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[ClassConstructorDescriptorImpl]

'info' @ [58:34] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'if (info.isRemapped) {
                return RemapInfo(info, remapped, REMAPPED)
            }
            else {
                remappedIndex = (remapped as StackValue.Local).index
            }' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'info' @ [60:17] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'isRemapped' @ [60:22] ==> public final val ParameterInfo.isRemapped: Boolean[MyPropertyDescriptor]

'RemapInfo' @ [61:24] ==> public constructor RemapInfo(parameterInfo: ParameterInfo?, value: StackValue? = ..., status: LocalVarRemapper.RemapStatus = ...) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[ClassConstructorDescriptorImpl]

'info' @ [61:34] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'remapped' @ [61:40] ==> val remapped: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'REMAPPED' @ [61:50] ==> enum entry REMAPPED defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapStatus[FakeCallableDescriptorForObject]

'remappedIndex' @ [64:17] ==> val remappedIndex: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'remapped' @ [64:34] ==> val remapped: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'index' @ [64:64] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'remappedIndex' @ [70:13] ==> val remappedIndex: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'actualParamsSize' @ [70:29] ==> private final val actualParamsSize: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'params' @ [70:48] ==> private final val params: Parameters defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'argsSizeOnStack' @ [70:55] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'index' @ [70:73] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[ValueParameterDescriptorImpl]

'RemapInfo' @ [73:16] ==> public constructor RemapInfo(parameterInfo: ParameterInfo?, value: StackValue? = ..., status: LocalVarRemapper.RemapStatus = ...) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[ClassConstructorDescriptorImpl]

'local' @ [73:43] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'remappedIndex' @ [73:49] ==> val remappedIndex: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.doRemap[LocalVariableDescriptor]

'additionalShift' @ [73:65] ==> private final val additionalShift: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[PropertyDescriptorImpl]

'OBJECT_TYPE' @ [73:91] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'SHIFT' @ [73:105] ==> enum entry SHIFT defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapStatus[FakeCallableDescriptorForObject]

'doRemap' @ [77:20] ==> private final fun doRemap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'index' @ [77:28] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[ValueParameterDescriptorImpl]

'FAIL' @ [78:13] ==> enum entry FAIL defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapStatus[FakeCallableDescriptorForObject]

'info' @ [78:21] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[LocalVariableDescriptor]

'status' @ [78:26] ==> @JvmField public final val status: LocalVarRemapper.RemapStatus defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'assert' @ [79:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'info' @ [79:20] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[LocalVariableDescriptor]

'parameterInfo' @ [79:25] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'index' @ [79:71] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[ValueParameterDescriptorImpl]

'RuntimeException' @ [80:19] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'+' @ [80:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'info' @ [80:77] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[LocalVariableDescriptor]

'parameterInfo' @ [80:82] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'type' @ [80:98] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'index' @ [80:114] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[ValueParameterDescriptorImpl]

'info' @ [82:16] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.remap[LocalVariableDescriptor]

'remap' @ [86:21] ==> public final fun remap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'`var`' @ [86:27] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[ValueParameterDescriptorImpl]

'remap' @ [87:13] ==> val remap: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[LocalVariableDescriptor]

'value' @ [87:19] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'AssertionError' @ [88:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'remap' @ [88:71] ==> val remap: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[LocalVariableDescriptor]

'value' @ [88:77] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'mv' @ [90:9] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[ValueParameterDescriptorImpl]

'visitIincInsn' @ [90:12] ==> public open fun visitIincInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'remap' @ [90:26] ==> val remap: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[LocalVariableDescriptor]

'value' @ [90:32] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'index' @ [90:38] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'increment' @ [90:45] ==> value-parameter increment: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitIincInsn[ValueParameterDescriptorImpl]

'doRemap' @ [94:20] ==> private final fun doRemap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'index' @ [94:28] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'SHIFT' @ [96:13] ==> enum entry SHIFT defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapStatus[FakeCallableDescriptorForObject]

'info' @ [96:22] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[LocalVariableDescriptor]

'status' @ [96:27] ==> @JvmField public final val status: LocalVarRemapper.RemapStatus defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'mv' @ [97:13] ==> value-parameter mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'visitLocalVariable' @ [97:16] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'name' @ [97:35] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'desc' @ [97:41] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'signature' @ [97:47] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'start' @ [97:58] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'end' @ [97:65] ==> value-parameter end: Label defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[ValueParameterDescriptorImpl]

'info' @ [97:71] ==> val info: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitLocalVariable[LocalVariableDescriptor]

'value' @ [97:76] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'index' @ [97:103] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'opcode' @ [102:22] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[ValueParameterDescriptorImpl]

'remap' @ [103:25] ==> public final fun remap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'`var`' @ [103:31] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[ValueParameterDescriptorImpl]

'remapInfo' @ [104:21] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'value' @ [104:31] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'if (value is StackValue.Local) {
            val isStore = isStoreInstruction(opcode)
            if (remapInfo.parameterInfo != null) {
                //All remapped value parameters can't be rewritten except case of default ones.
                //On remapping default parameter to actual value there is only one instruction that writes to it according to mask value
                //but if such parameter remapped then it passed and this mask branch code never executed
                //TODO add assertion about parameter default value: descriptor is required
                opcode = value.type.getOpcode(if (isStore) Opcodes.ISTORE else Opcodes.ILOAD)
            }
            mv.visitVarInsn(opcode, value.index)
            if (remapInfo.parameterInfo != null && !isStore) {
                StackValue.coerce(value.type, remapInfo.parameterInfo.type, mv)
            }
        }
        else {
            assert(remapInfo.parameterInfo != null) { "Non local value should have parameter info" }
            value!!.put(remapInfo.parameterInfo!!.type, mv)
        }' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [105:13] ==> val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'isStoreInstruction' @ [106:27] ==> internal fun isStoreInstruction(opcode: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'opcode' @ [106:46] ==> var opcode: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'remapInfo' @ [107:17] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'parameterInfo' @ [107:27] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'opcode' @ [112:17] ==> var opcode: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'value' @ [112:26] ==> val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'type' @ [112:32] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'getOpcode' @ [112:37] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'if (isStore) Opcodes.ISTORE else Opcodes.ILOAD' @ [112:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isStore' @ [112:51] ==> val isStore: Boolean defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'ISTORE' @ [112:68] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ILOAD' @ [112:88] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'mv' @ [114:13] ==> value-parameter mv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[ValueParameterDescriptorImpl]

'visitVarInsn' @ [114:16] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'opcode' @ [114:29] ==> var opcode: Int defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'value' @ [114:37] ==> val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'index' @ [114:43] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'remapInfo' @ [115:17] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'parameterInfo' @ [115:27] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'!' @ [115:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStore' @ [115:53] ==> val isStore: Boolean defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'coerce' @ [116:28] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'value' @ [116:35] ==> val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'type' @ [116:41] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'remapInfo' @ [116:47] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'parameterInfo' @ [116:57] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'type' @ [116:71] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'mv' @ [116:77] ==> value-parameter mv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[ValueParameterDescriptorImpl]

'assert' @ [120:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'remapInfo' @ [120:20] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'parameterInfo' @ [120:30] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'value' @ [121:13] ==> val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'put' @ [121:21] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'remapInfo' @ [121:25] ==> val remapInfo: LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[LocalVariableDescriptor]

'parameterInfo' @ [121:35] ==> @JvmField public final val parameterInfo: ParameterInfo? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'type' @ [121:51] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'mv' @ [121:57] ==> value-parameter mv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.visitVarInsn[ValueParameterDescriptorImpl]

'JvmField' @ [132:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [133:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [134:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'FAIL' @ [134:49] ==> enum entry FAIL defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapStatus[FakeCallableDescriptorForObject]

