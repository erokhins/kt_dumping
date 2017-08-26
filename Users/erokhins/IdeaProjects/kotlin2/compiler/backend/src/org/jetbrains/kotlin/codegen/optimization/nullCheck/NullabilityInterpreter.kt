'OptimizationBasicInterpreter' @ [28:32] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'super' @ [30:29] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[LazyClassReceiverParameterDescriptor]

'newOperation' @ [30:35] ==> @Override public open fun newOperation(@NotNull insn: AbstractInsnNode): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [30:48] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[ValueParameterDescriptorImpl]

'defaultResult' @ [31:26] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'type' @ [31:41] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'when {
            insn.opcode == Opcodes.ACONST_NULL ->
                NullBasicValue
            insn.opcode == Opcodes.NEW ->
                NotNullBasicValue(resultType)
            insn.opcode == Opcodes.LDC && resultType.isReferenceType() ->
                NotNullBasicValue(resultType)
            insn.isUnitInstance() ->
                NotNullBasicValue(resultType)
            else ->
                defaultResult
        }' @ [33:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue?, entry1: BasicValue?, entry2: BasicValue?, entry3: BasicValue?, entry4: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue?

'insn' @ [34:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [34:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ACONST_NULL' @ [34:36] ==> public const final val ACONST_NULL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'NullBasicValue' @ [35:17] ==> public object NullBasicValue : StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file nullabilityValues.kt[FakeCallableDescriptorForObject]

'insn' @ [36:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [36:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NEW' @ [36:36] ==> public const final val NEW: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'NotNullBasicValue' @ [37:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [37:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'insn' @ [38:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[ValueParameterDescriptorImpl]

'opcode' @ [38:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LDC' @ [38:36] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'resultType' @ [38:43] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'isReferenceType' @ [38:54] ==> private final fun Type?.isReferenceType(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[SimpleFunctionDescriptorImpl]

'NotNullBasicValue' @ [39:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [39:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'insn' @ [40:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[ValueParameterDescriptorImpl]

'isUnitInstance' @ [40:18] ==> public fun AbstractInsnNode.isUnitInstance(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'NotNullBasicValue' @ [41:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [41:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'defaultResult' @ [43:17] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.newOperation[LocalVariableDescriptor]

'this' @ [48:13] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.isReferenceType[ReceiverParameterDescriptorImpl]

'sort' @ [48:19] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'let' @ [48:24] ==> @InlineOnly public inline fun <T, R> Int?.let(block: (Int?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?
    <R> -> Boolean

'it' @ [48:30] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.isReferenceType.<anonymous>[ValueParameterDescriptorImpl]

'OBJECT' @ [48:41] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'it' @ [48:51] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.isReferenceType.<anonymous>[ValueParameterDescriptorImpl]

'ARRAY' @ [48:62] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'super' @ [51:29] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[LazyClassReceiverParameterDescriptor]

'unaryOperation' @ [51:35] ==> @Override public open fun unaryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), value: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [51:50] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [51:56] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'defaultResult' @ [52:26] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[LocalVariableDescriptor]

'type' @ [52:41] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'when {
            insn.opcode == Opcodes.CHECKCAST ->
                value
            insn.opcode == Opcodes.NEWARRAY || insn.opcode == Opcodes.ANEWARRAY ->
                NotNullBasicValue(resultType)
            else ->
                defaultResult
        }' @ [54:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue?, entry1: BasicValue?, entry2: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue?

'insn' @ [55:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [55:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'CHECKCAST' @ [55:36] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'value' @ [56:17] ==> value-parameter value: BasicValue? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'insn' @ [57:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [57:18] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'NEWARRAY' @ [57:36] ==> public const final val NEWARRAY: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [57:48] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [57:53] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ANEWARRAY' @ [57:71] ==> public const final val ANEWARRAY: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'NotNullBasicValue' @ [58:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [58:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[LocalVariableDescriptor]

'defaultResult' @ [60:17] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.unaryOperation[LocalVariableDescriptor]

'super' @ [65:29] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[LazyClassReceiverParameterDescriptor]

'naryOperation' @ [65:35] ==> @Override public open fun naryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), values: (MutableList<out (BasicValue..BasicValue?)>..List<(BasicValue..BasicValue?)>?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [65:49] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [65:55] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'defaultResult' @ [66:26] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[LocalVariableDescriptor]

'type' @ [66:41] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'when {
            insn.isBoxing() ->
                NotNullBasicValue(resultType)
            insn.isIteratorMethodCallOfProgression(values) ->
                ProgressionIteratorBasicValue.byProgressionClassType(values[0].type)
            insn.isNextMethodCallOfProgressionIterator(values) ->
                NotNullBasicValue(resultType)
            else ->
                defaultResult
        }' @ [68:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue?, entry1: BasicValue?, entry2: BasicValue?, entry3: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue?

'insn' @ [69:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isBoxing' @ [69:18] ==> public fun AbstractInsnNode.isBoxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'NotNullBasicValue' @ [70:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [70:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[LocalVariableDescriptor]

'insn' @ [71:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isIteratorMethodCallOfProgression' @ [71:18] ==> public fun AbstractInsnNode.isIteratorMethodCallOfProgression(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'values' @ [71:52] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'byProgressionClassType' @ [72:47] ==> @Nullable public open fun byProgressionClassType(@NotNull progressionClassType: Type): ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.ProgressionIteratorBasicValue[JavaMethodDescriptor]

'values' @ [72:70] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'type' @ [72:80] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'insn' @ [73:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isNextMethodCallOfProgressionIterator' @ [73:18] ==> public fun AbstractInsnNode.isNextMethodCallOfProgressionIterator(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing[SimpleFunctionDescriptorImpl]

'values' @ [73:56] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[ValueParameterDescriptorImpl]

'NotNullBasicValue' @ [74:17] ==> public constructor NotNullBasicValue(type: Type?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[ClassConstructorDescriptorImpl]

'resultType' @ [74:35] ==> val resultType: Type? defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[LocalVariableDescriptor]

'defaultResult' @ [76:17] ==> val defaultResult: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.naryOperation[LocalVariableDescriptor]

'when {
                v is NullBasicValue && w is NullBasicValue ->
                    NullBasicValue
                v is NullBasicValue || w is NullBasicValue ->
                    StrictBasicValue.REFERENCE_VALUE
                v is ProgressionIteratorBasicValue && w is ProgressionIteratorBasicValue ->
                    mergeNotNullValuesOfSameKind(v, w)
                v is ProgressionIteratorBasicValue && w is NotNullBasicValue ->
                    NotNullBasicValue.NOT_NULL_REFERENCE_VALUE
                w is ProgressionIteratorBasicValue && v is NotNullBasicValue ->
                    NotNullBasicValue.NOT_NULL_REFERENCE_VALUE
                v is NotNullBasicValue && w is NotNullBasicValue ->
                    mergeNotNullValuesOfSameKind(v, w)
                else ->
                    super.merge(v, w)
            }' @ [81:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue, entry1: BasicValue, entry2: BasicValue, entry3: BasicValue, entry4: BasicValue, entry5: BasicValue, entry6: BasicValue): BasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue

'v' @ [82:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [82:40] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'NullBasicValue' @ [83:21] ==> public object NullBasicValue : StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck in file nullabilityValues.kt[FakeCallableDescriptorForObject]

'v' @ [84:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [84:40] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'StrictBasicValue' @ [85:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue[FakeCallableDescriptorForObject]

'REFERENCE_VALUE' @ [85:38] ==> @JvmField public final val REFERENCE_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'v' @ [86:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [86:55] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'mergeNotNullValuesOfSameKind' @ [87:21] ==> private final fun mergeNotNullValuesOfSameKind(v: StrictBasicValue, w: StrictBasicValue): StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [87:50] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [87:53] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [88:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [88:55] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'NotNullBasicValue' @ [89:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[FakeCallableDescriptorForObject]

'NOT_NULL_REFERENCE_VALUE' @ [89:39] ==> public final val NOT_NULL_REFERENCE_VALUE: NotNullBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.Companion[PropertyDescriptorImpl]

'w' @ [90:17] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [90:55] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'NotNullBasicValue' @ [91:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[FakeCallableDescriptorForObject]

'NOT_NULL_REFERENCE_VALUE' @ [91:39] ==> public final val NOT_NULL_REFERENCE_VALUE: NotNullBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.Companion[PropertyDescriptorImpl]

'v' @ [92:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [92:43] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'mergeNotNullValuesOfSameKind' @ [93:21] ==> private final fun mergeNotNullValuesOfSameKind(v: StrictBasicValue, w: StrictBasicValue): StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [93:50] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [93:53] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'super' @ [95:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter[LazyClassReceiverParameterDescriptor]

'merge' @ [95:27] ==> @NotNull @Override public open fun merge(@NotNull v: BasicValue, @NotNull w: BasicValue): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'v' @ [95:33] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [95:36] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.merge[ValueParameterDescriptorImpl]

'if (v.type == w.type) v else NotNullBasicValue.NOT_NULL_REFERENCE_VALUE' @ [99:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StrictBasicValue, elseBranch: StrictBasicValue): StrictBasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StrictBasicValue

'v' @ [99:17] ==> value-parameter v: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.mergeNotNullValuesOfSameKind[ValueParameterDescriptorImpl]

'type' @ [99:19] ==> public final val StrictBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'w' @ [99:27] ==> value-parameter w: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.mergeNotNullValuesOfSameKind[ValueParameterDescriptorImpl]

'type' @ [99:29] ==> public final val StrictBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'v' @ [99:35] ==> value-parameter v: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NullabilityInterpreter.mergeNotNullValuesOfSameKind[ValueParameterDescriptorImpl]

'NotNullBasicValue' @ [99:42] ==> public companion object defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue[FakeCallableDescriptorForObject]

'NOT_NULL_REFERENCE_VALUE' @ [99:60] ==> public final val NOT_NULL_REFERENCE_VALUE: NotNullBasicValue defined in org.jetbrains.kotlin.codegen.optimization.nullCheck.NotNullBasicValue.Companion[PropertyDescriptorImpl]

'getObjectType' @ [105:14] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'desc' @ [105:28] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TypeInsnNode[JavaPropertyDescriptor]

