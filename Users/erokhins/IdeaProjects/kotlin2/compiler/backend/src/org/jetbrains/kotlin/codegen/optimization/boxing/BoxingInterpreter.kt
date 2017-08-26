'OptimizationBasicInterpreter' @ [36:64] ==> public constructor OptimizationBasicInterpreter() defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaClassConstructorDescriptor]

'HashMap' @ [37:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> BoxedBasicValue

'boxingPlaces' @ [40:13] ==> private final val boxingPlaces: HashMap<Int, BoxedBasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[PropertyDescriptorImpl]

'getOrPut' @ [40:26] ==> public inline fun <K, V> MutableMap<Int, BoxedBasicValue>.getOrPut(key: Int, defaultValue: () -> BoxedBasicValue): BoxedBasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> BoxedBasicValue

'insnList' @ [40:35] ==> private final val insnList: InsnList defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[PropertyDescriptorImpl]

'indexOf' @ [40:44] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insn' @ [40:52] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing[ValueParameterDescriptorImpl]

'CleanBoxedValue' @ [41:39] ==> public constructor CleanBoxedValue(boxedType: Type, boxingInsn: AbstractInsnNode, progressionIterator: ProgressionIteratorBasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.CleanBoxedValue[ClassConstructorDescriptorImpl]

'type' @ [41:55] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing[ValueParameterDescriptorImpl]

'insn' @ [41:61] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing[ValueParameterDescriptorImpl]

'progressionIterator' @ [41:67] ==> value-parameter progressionIterator: ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing[ValueParameterDescriptorImpl]

'onNewBoxedValue' @ [42:17] ==> protected open fun onNewBoxedValue(value: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'boxedBasicValue' @ [42:33] ==> val boxedBasicValue: CleanBoxedValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing.<anonymous>[LocalVariableDescriptor]

'boxedBasicValue' @ [43:17] ==> val boxedBasicValue: CleanBoxedValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.createNewBoxing.<anonymous>[LocalVariableDescriptor]

'value' @ [47:13] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.checkUsedValue[ValueParameterDescriptorImpl]

'onMergeFail' @ [48:13] ==> protected open fun onMergeFail(value: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'value' @ [48:25] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.checkUsedValue[ValueParameterDescriptorImpl]

'values' @ [53:9] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'forEach' @ [53:16] ==> @HidesMembers public inline fun <T> Iterable<BasicValue>.forEach(action: (BasicValue) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'checkUsedValue' @ [54:13] ==> protected final fun checkUsedValue(value: BasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'it' @ [54:28] ==> value-parameter it: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [57:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[LazyClassReceiverParameterDescriptor]

'naryOperation' @ [57:27] ==> @Override public open fun naryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), values: (MutableList<out (BasicValue..BasicValue?)>..List<(BasicValue..BasicValue?)>?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [57:41] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [57:47] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [58:24] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'firstOrNull' @ [58:31] ==> public fun <T> List<BasicValue>.firstOrNull(): BasicValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'value' @ [58:55] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'when {
            insn.isBoxing() -> {
                createNewBoxing(insn, value.type, null)
            }
            insn.isUnboxing() && firstArg is BoxedBasicValue -> {
                onUnboxing(insn, firstArg, value.type)
                value
            }
            insn.isIteratorMethodCallOfProgression(values) ->
                ProgressionIteratorBasicValue.byProgressionClassType(firstArg.type)
            insn.isNextMethodCallOfProgressionIterator(values) -> {
                val progressionIterator = firstArg as? ProgressionIteratorBasicValue
                                          ?: throw AssertionError("firstArg should be progression iterator")
                createNewBoxing(insn, AsmUtil.boxType(progressionIterator.valuesPrimitiveType), progressionIterator)
            }
            insn.isAreEqualIntrinsicForSameTypedBoxedValues(values) && canValuesBeUnboxedForAreEqual(values) -> {
                onAreEqual(insn, values[0] as BoxedBasicValue, values[1] as BoxedBasicValue)
                value
            }
            insn.isJavaLangComparableCompareToForSameTypedBoxedValues(values) -> {
                onCompareTo(insn, values[0] as BoxedBasicValue, values[1] as BoxedBasicValue)
                value
            }
            else -> {
                // N-ary operation should be a method call or multinewarray.
                // Arguments for multinewarray could be only numeric,
                // so if there are boxed values in args, it's not a case of multinewarray.
                for (arg in values) {
                    if (arg is BoxedBasicValue) {
                        onMethodCallWithBoxedValue(arg)
                    }
                }
                value
            }
        }' @ [60:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue?, entry1: BasicValue?, entry2: BasicValue?, entry3: BasicValue?, entry4: BasicValue?, entry5: BasicValue?, entry6: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue?

'insn' @ [61:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isBoxing' @ [61:18] ==> public fun AbstractInsnNode.isBoxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'createNewBoxing' @ [62:17] ==> protected open fun createNewBoxing(insn: AbstractInsnNode, type: Type, progressionIterator: ProgressionIteratorBasicValue?): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [62:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'value' @ [62:39] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'type' @ [62:45] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'insn' @ [64:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isUnboxing' @ [64:18] ==> public fun AbstractInsnNode.isUnboxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'firstArg' @ [64:34] ==> val firstArg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'onUnboxing' @ [65:17] ==> protected open fun onUnboxing(insn: AbstractInsnNode, value: BoxedBasicValue, resultType: Type): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [65:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'firstArg' @ [65:34] ==> val firstArg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'value' @ [65:44] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'type' @ [65:50] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'value' @ [66:17] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'insn' @ [68:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isIteratorMethodCallOfProgression' @ [68:18] ==> public fun AbstractInsnNode.isIteratorMethodCallOfProgression(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [68:52] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'byProgressionClassType' @ [69:47] ==> @Nullable public open fun byProgressionClassType(@NotNull progressionClassType: Type): ProgressionIteratorBasicValue? defined in org.jetbrains.kotlin.codegen.optimization.boxing.ProgressionIteratorBasicValue[JavaMethodDescriptor]

'firstArg' @ [69:70] ==> val firstArg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'type' @ [69:79] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'insn' @ [70:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isNextMethodCallOfProgressionIterator' @ [70:18] ==> public fun AbstractInsnNode.isNextMethodCallOfProgressionIterator(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [70:56] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'firstArg' @ [71:43] ==> val firstArg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'AssertionError' @ [72:52] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'createNewBoxing' @ [73:17] ==> protected open fun createNewBoxing(insn: AbstractInsnNode, type: Type, progressionIterator: ProgressionIteratorBasicValue?): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [73:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'boxType' @ [73:47] ==> @NotNull public open fun boxType(@NotNull type: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'progressionIterator' @ [73:55] ==> val progressionIterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'valuesPrimitiveType' @ [73:75] ==> public final val ProgressionIteratorBasicValue.valuesPrimitiveType: Type[MyPropertyDescriptor]

'progressionIterator' @ [73:97] ==> val progressionIterator: ProgressionIteratorBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'insn' @ [75:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isAreEqualIntrinsicForSameTypedBoxedValues' @ [75:18] ==> public fun AbstractInsnNode.isAreEqualIntrinsicForSameTypedBoxedValues(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [75:61] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'canValuesBeUnboxedForAreEqual' @ [75:72] ==> public fun canValuesBeUnboxedForAreEqual(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [75:102] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'onAreEqual' @ [76:17] ==> protected open fun onAreEqual(insn: AbstractInsnNode, value1: BoxedBasicValue, value2: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [76:28] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [76:34] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [76:64] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'value' @ [77:17] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'insn' @ [79:13] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'isJavaLangComparableCompareToForSameTypedBoxedValues' @ [79:18] ==> public fun AbstractInsnNode.isJavaLangComparableCompareToForSameTypedBoxedValues(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [79:71] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'onCompareTo' @ [80:17] ==> protected open fun onCompareTo(insn: AbstractInsnNode, value1: BoxedBasicValue, value2: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'insn' @ [80:29] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [80:35] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'values' @ [80:65] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'value' @ [81:17] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'values' @ [87:29] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[ValueParameterDescriptorImpl]

'arg' @ [88:25] ==> val arg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'onMethodCallWithBoxedValue' @ [89:25] ==> protected open fun onMethodCallWithBoxedValue(value: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'arg' @ [89:52] ==> val arg: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'value' @ [92:17] ==> val value: (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.naryOperation[LocalVariableDescriptor]

'checkUsedValue' @ [98:9] ==> protected final fun checkUsedValue(value: BasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'value' @ [98:24] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'if (insn.opcode == Opcodes.CHECKCAST && isExactValue(value))
            value
        else
            super.unaryOperation(insn, value)' @ [100:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BasicValue?, elseBranch: BasicValue?): BasicValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BasicValue?

'insn' @ [100:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'opcode' @ [100:25] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'CHECKCAST' @ [100:43] ==> public const final val CHECKCAST: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isExactValue' @ [100:56] ==> protected open fun isExactValue(value: BasicValue): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'value' @ [100:69] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [101:13] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'super' @ [103:13] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[LazyClassReceiverParameterDescriptor]

'unaryOperation' @ [103:19] ==> @Override public open fun unaryOperation(insn: (AbstractInsnNode..AbstractInsnNode?), value: (BasicValue..BasicValue?)): (BasicValue..BasicValue?) defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'insn' @ [103:34] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [103:40] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.unaryOperation[ValueParameterDescriptorImpl]

'value' @ [107:13] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.isExactValue[ValueParameterDescriptorImpl]

'value' @ [108:13] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.isExactValue[ValueParameterDescriptorImpl]

'value' @ [109:13] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.isExactValue[ValueParameterDescriptorImpl]

'type' @ [109:19] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'isProgressionClass' @ [109:35] ==> public fun isProgressionClass(type: Type): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'value' @ [109:54] ==> value-parameter value: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.isExactValue[ValueParameterDescriptorImpl]

'type' @ [109:60] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'when {
                v == StrictBasicValue.UNINITIALIZED_VALUE || w == StrictBasicValue.UNINITIALIZED_VALUE ->
                    StrictBasicValue.UNINITIALIZED_VALUE
                v is BoxedBasicValue && w is BoxedBasicValue -> {
                    onMergeSuccess(v, w)
                    when {
                        v is TaintedBoxedValue -> v
                        w is TaintedBoxedValue -> w
                        v.type != w.type -> v.taint()
                        else -> v
                    }
                }
                v is BoxedBasicValue ->
                    v.taint()
                w is BoxedBasicValue ->
                    w.taint()
                else ->
                    super.merge(v, w)
            }' @ [112:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicValue, entry1: BasicValue, entry2: BasicValue, entry3: BasicValue, entry4: BasicValue): BasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BasicValue

'v' @ [113:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'UNINITIALIZED_VALUE' @ [113:39] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'w' @ [113:62] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'UNINITIALIZED_VALUE' @ [113:84] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'UNINITIALIZED_VALUE' @ [114:38] ==> @JvmField public final val UNINITIALIZED_VALUE: StrictBasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.StrictBasicValue.Companion[PropertyDescriptorImpl]

'v' @ [115:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [115:41] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'onMergeSuccess' @ [116:21] ==> protected open fun onMergeSuccess(v: BoxedBasicValue, w: BoxedBasicValue): Unit defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[SimpleFunctionDescriptorImpl]

'v' @ [116:36] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [116:39] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'when {
                        v is TaintedBoxedValue -> v
                        w is TaintedBoxedValue -> w
                        v.type != w.type -> v.taint()
                        else -> v
                    }' @ [117:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BoxedBasicValue, entry1: BoxedBasicValue, entry2: BoxedBasicValue, entry3: BoxedBasicValue): BoxedBasicValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BoxedBasicValue

'v' @ [118:25] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [118:51] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [119:25] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [119:51] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [120:25] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'type' @ [120:27] ==> public final val BoxedBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'w' @ [120:35] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'type' @ [120:37] ==> public final val BoxedBasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'v' @ [120:45] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'taint' @ [120:47] ==> public abstract fun taint(): BoxedBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[SimpleFunctionDescriptorImpl]

'v' @ [121:33] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [124:17] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'v' @ [125:21] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'taint' @ [125:23] ==> public abstract fun taint(): BoxedBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[SimpleFunctionDescriptorImpl]

'w' @ [126:17] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [127:21] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'taint' @ [127:23] ==> public abstract fun taint(): BoxedBasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[SimpleFunctionDescriptorImpl]

'super' @ [129:21] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter[LazyClassReceiverParameterDescriptor]

'merge' @ [129:27] ==> @NotNull @Override public open fun merge(@NotNull v: BasicValue, @NotNull w: BasicValue): BasicValue defined in org.jetbrains.kotlin.codegen.optimization.common.OptimizationBasicInterpreter[JavaMethodDescriptor]

'v' @ [129:33] ==> value-parameter v: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'w' @ [129:36] ==> value-parameter w: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxingInterpreter.merge[ValueParameterDescriptorImpl]

'of' @ [143:22] ==> @SafeVarargs public open fun <E : (Any..Any?)> of(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (String..String?), vararg p6: (String..String?)): (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'getMethodDescriptor' @ [145:38] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'JAVA_CLASS_TYPE' @ [145:67] ==> public final val JAVA_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'K_CLASS_TYPE' @ [145:93] ==> public final val K_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'getMethodDescriptor' @ [146:38] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'K_CLASS_TYPE' @ [146:67] ==> public final val K_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'JAVA_CLASS_TYPE' @ [146:90] ==> public final val JAVA_CLASS_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'isPrimitiveUnboxing' @ [149:9] ==> public fun AbstractInsnNode.isPrimitiveUnboxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'isJavaLangClassUnboxing' @ [149:34] ==> public fun AbstractInsnNode.isJavaLangClassUnboxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'isPrimitiveBoxing' @ [152:9] ==> public fun AbstractInsnNode.isPrimitiveBoxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'isJavaLangClassBoxing' @ [152:32] ==> public fun AbstractInsnNode.isJavaLangClassBoxing(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'isMethodInsnWith' @ [155:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKEVIRTUAL' @ [155:34] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isWrapperClassNameOrNumber' @ [156:13] ==> private fun isWrapperClassNameOrNumber(internalClassName: String): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'owner' @ [156:40] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isUnboxingMethodName' @ [156:50] ==> private fun isUnboxingMethodName(name: String): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'name' @ [156:71] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isMethodInsnWith' @ [160:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKESTATIC' @ [160:34] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'owner' @ [161:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'name' @ [162:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [163:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'KCLASS_TO_JLCLASS' @ [163:21] ==> private val KCLASS_TO_JLCLASS: (String..String?) defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[PropertyDescriptorImpl]

'this' @ [167:9] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isMethodInsnWith[ReceiverParameterDescriptorImpl]

'opcode' @ [167:14] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'opcode' @ [167:24] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.optimization.boxing.isMethodInsnWith[ValueParameterDescriptorImpl]

'this' @ [167:34] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isMethodInsnWith[ReceiverParameterDescriptorImpl]

'this' @ [167:60] ==> <this> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isMethodInsnWith[ReceiverParameterDescriptorImpl]

'invoke' @ [167:65] ==> public abstract operator fun MethodInsnNode.invoke(): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'isWrapperClassName' @ [170:9] ==> private fun isWrapperClassName(internalClassName: String): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'internalClassName' @ [170:28] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.isWrapperClassNameOrNumber[ValueParameterDescriptorImpl]

'internalClassName' @ [170:50] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.isWrapperClassNameOrNumber[ValueParameterDescriptorImpl]

'getInternalName' @ [170:76] ==> public open fun getInternalName(p0: (Class<*>..Class<*>?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'Number' @ [170:92] ==> public constructor Number() defined in kotlin.Number[DeserializedClassConstructorDescriptor]

'java' @ [170:106] ==> public val <T> KClass<Number>.java: Class<Number> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Number

'isWrapperClassName' @ [173:26] ==> public open fun isWrapperClassName(@NotNull p0: FqName): Boolean defined in org.jetbrains.kotlin.resolve.jvm.JvmPrimitiveType[JavaMethodDescriptor]

'buildFqNameByInternal' @ [173:45] ==> private fun buildFqNameByInternal(internalClassName: String): FqName defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'internalClassName' @ [173:67] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.isWrapperClassName[ValueParameterDescriptorImpl]

'FqName' @ [177:9] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'getObjectType' @ [177:21] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'internalClassName' @ [177:35] ==> value-parameter internalClassName: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.buildFqNameByInternal[ValueParameterDescriptorImpl]

'className' @ [177:54] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'UNBOXING_METHOD_NAMES' @ [180:9] ==> private val UNBOXING_METHOD_NAMES: (ImmutableSet<(String..String?)>..ImmutableSet<(String..String?)>?) defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[PropertyDescriptorImpl]

'contains' @ [180:31] ==> public abstract fun contains(@Nullable element: String?): Boolean defined in com.google.common.collect.ImmutableSet[JavaMethodDescriptor]

'name' @ [180:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.optimization.boxing.isUnboxingMethodName[ValueParameterDescriptorImpl]

'isMethodInsnWith' @ [183:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKESTATIC' @ [183:34] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isWrapperClassName' @ [184:13] ==> private fun isWrapperClassName(internalClassName: String): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'owner' @ [184:32] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'name' @ [185:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isBoxingMethodDescriptor' @ [186:13] ==> private fun MethodInsnNode.isBoxingMethodDescriptor(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'getObjectType' @ [190:26] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'owner' @ [190:40] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [191:12] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'getMethodDescriptor' @ [191:25] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'ownerType' @ [191:45] ==> val ownerType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.isBoxingMethodDescriptor[LocalVariableDescriptor]

'unboxType' @ [191:64] ==> @NotNull public open fun unboxType(@NotNull boxedType: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'ownerType' @ [191:74] ==> val ownerType: (Type..Type?) defined in org.jetbrains.kotlin.codegen.optimization.boxing.isBoxingMethodDescriptor[LocalVariableDescriptor]

'isMethodInsnWith' @ [195:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKESTATIC' @ [195:34] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'owner' @ [196:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'REFLECTION' @ [196:31] ==> public const final val REFLECTION: String defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'name' @ [197:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [198:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'JLCLASS_TO_KCLASS' @ [198:21] ==> private val JLCLASS_TO_KCLASS: (String..String?) defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[PropertyDescriptorImpl]

'values' @ [202:9] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isNextMethodCallOfProgressionIterator[ValueParameterDescriptorImpl]

'firstOrNull' @ [202:16] ==> public fun <T> List<BasicValue>.firstOrNull(): BasicValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'isMethodInsnWith' @ [203:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKEINTERFACE' @ [203:34] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [204:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isMethodInsnWith' @ [208:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKEINTERFACE' @ [208:34] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'values' @ [209:32] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isIteratorMethodCallOfProgression[ValueParameterDescriptorImpl]

'firstOrNull' @ [209:39] ==> public fun <T> List<BasicValue>.firstOrNull(): BasicValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'type' @ [209:54] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'firstArgType' @ [210:13] ==> val firstArgType: Type? defined in org.jetbrains.kotlin.codegen.optimization.boxing.isIteratorMethodCallOfProgression.<anonymous>[LocalVariableDescriptor]

'isProgressionClass' @ [211:13] ==> public fun isProgressionClass(type: Type): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'firstArgType' @ [211:32] ==> val firstArgType: Type? defined in org.jetbrains.kotlin.codegen.optimization.boxing.isIteratorMethodCallOfProgression.<anonymous>[LocalVariableDescriptor]

'name' @ [212:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'isRangeOrProgression' @ [216:9] ==> public fun isRangeOrProgression(className: FqName): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'buildFqNameByInternal' @ [216:30] ==> private fun buildFqNameByInternal(internalClassName: String): FqName defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'type' @ [216:52] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.isProgressionClass[ValueParameterDescriptorImpl]

'internalName' @ [216:57] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'isAreEqualIntrinsic' @ [219:9] ==> public fun AbstractInsnNode.isAreEqualIntrinsic(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'areSameTypedBoxedValues' @ [219:34] ==> public fun areSameTypedBoxedValues(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [219:58] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isAreEqualIntrinsicForSameTypedBoxedValues[ValueParameterDescriptorImpl]

'values' @ [222:9] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[ValueParameterDescriptorImpl]

'size' @ [222:16] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [223:10] ==> @InlineOnly public operator inline fun <T> List<BasicValue>.component1(): BasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'component2' @ [223:14] ==> @InlineOnly public operator inline fun <T> List<BasicValue>.component2(): BasicValue defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'values' @ [223:20] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[ValueParameterDescriptorImpl]

'v1' @ [224:12] ==> val v1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[LocalVariableDescriptor]

'v2' @ [225:12] ==> val v2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[LocalVariableDescriptor]

'v1' @ [226:12] ==> val v1: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[LocalVariableDescriptor]

'descriptor' @ [226:15] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'unboxedType' @ [226:26] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'v2' @ [226:41] ==> val v2: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.areSameTypedBoxedValues[LocalVariableDescriptor]

'descriptor' @ [226:44] ==> public abstract val descriptor: BoxedValueDescriptor defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedBasicValue[PropertyDescriptorImpl]

'unboxedType' @ [226:55] ==> public final val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.BoxedValueDescriptor[PropertyDescriptorImpl]

'isMethodInsnWith' @ [230:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKESTATIC' @ [230:34] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [231:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'owner' @ [232:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [232:39] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'desc' @ [233:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'!' @ [237:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'values' @ [237:10] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.canValuesBeUnboxedForAreEqual[ValueParameterDescriptorImpl]

'any' @ [237:17] ==> public inline fun <T> Iterable<BasicValue>.any(predicate: (BasicValue) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BasicValue

'getUnboxedType' @ [238:31] ==> public fun getUnboxedType(boxedType: Type): Type defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxedBasicValue.kt[SimpleFunctionDescriptorImpl]

'it' @ [238:46] ==> value-parameter it: BasicValue defined in org.jetbrains.kotlin.codegen.optimization.boxing.canValuesBeUnboxedForAreEqual.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [238:49] ==> public final val BasicValue.type: (Type..Type?)[MyPropertyDescriptor]

'unboxedType' @ [239:13] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.canValuesBeUnboxedForAreEqual.<anonymous>[LocalVariableDescriptor]

'DOUBLE_TYPE' @ [239:33] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'unboxedType' @ [239:48] ==> val unboxedType: Type defined in org.jetbrains.kotlin.codegen.optimization.boxing.canValuesBeUnboxedForAreEqual.<anonymous>[LocalVariableDescriptor]

'FLOAT_TYPE' @ [239:68] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'isJavaLangComparableCompareTo' @ [243:9] ==> public fun AbstractInsnNode.isJavaLangComparableCompareTo(): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'areSameTypedBoxedValues' @ [243:44] ==> public fun areSameTypedBoxedValues(values: List<BasicValue>): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'values' @ [243:68] ==> value-parameter values: List<BasicValue> defined in org.jetbrains.kotlin.codegen.optimization.boxing.isJavaLangComparableCompareToForSameTypedBoxedValues[ValueParameterDescriptorImpl]

'isMethodInsnWith' @ [246:9] ==> public inline fun AbstractInsnNode.isMethodInsnWith(opcode: Int, condition: MethodInsnNode.() -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen.optimization.boxing in file BoxingInterpreter.kt[SimpleFunctionDescriptorImpl]

'INVOKEINTERFACE' @ [246:34] ==> public const final val INVOKEINTERFACE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [247:13] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'owner' @ [248:13] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'desc' @ [249:13] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

